package com.iwill.controller;

import com.iwill.DemoTestApplication;
import com.iwill.UserController;
import com.unitils.boot.util.UnitilsBootBlockJUnit4ClassRunner;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.spring.annotation.SpringBeanByType;


@RunWith(UnitilsBootBlockJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoTestApplication.class)
@Transactional(value = TransactionMode.ROLLBACK)
public class UserControllerTest {

    @SpringBeanByType
    private UserController userController;

    @Test
    public void test_getUsername() {
        String ussername = userController.getUsername(1234);
        Assert.assertTrue(ussername.equals("zhangsan"));
    }
}
