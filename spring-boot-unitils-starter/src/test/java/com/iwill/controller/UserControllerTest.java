package com.iwill.controller;

import com.iwill.DemoTestApplication;
import com.unitils.boot.util.UnitilsBootBlockJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBeanByType;


@RunWith(UnitilsBootBlockJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoTestApplication.class)
@Transactional(value = TransactionMode.ROLLBACK)
public class UserControllerTest {

    @SpringBeanByType
    private UserController userController;

    @Test
    @DataSet({"/data/test_getUsername.xls"})
    public void test_getUsername() {
        String username = userController.getUsername(1234);
        Assert.assertTrue(username.equals("zhangsan"));

        username = userController.getUsername(12345);
        Assert.assertTrue(username.equals("lisi"));
    }
}
