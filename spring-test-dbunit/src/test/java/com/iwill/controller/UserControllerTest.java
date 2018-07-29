package com.iwill.controller;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.iwill.DemoTestApplication;
import com.iwill.util.XlsDataSetLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoTestApplication.class)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        TransactionDbUnitTestExecutionListener.class})
@DbUnitConfiguration(dataSetLoader = XlsDataSetLoader.class)
@Transactional
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    @DatabaseSetup({"/data/test_getUsername.xls"})
    public void test_getUsername() {
        String username = userController.getUsername(1);
        Assert.assertEquals(username,"zhangsan");
    }
}
