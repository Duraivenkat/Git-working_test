package com.krce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class second_task {

    @Test
    public void assistion_operation()
    {
        int a= 10;
        int b=20;
        int result=a+b;

        Assert.assertEquals(result,30);
        Assert.assertTrue(result>10);

        Assert.assertNotEquals(result,10);
    }
}
