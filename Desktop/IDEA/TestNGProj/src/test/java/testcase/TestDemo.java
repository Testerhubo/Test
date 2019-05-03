package testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo{
     @Test
    public void test1(){
         Assert.assertTrue(true);
         System.out.println("test1 response info");
     }

    @Test
    public void test2(){
        Assert.assertTrue(false);
    }

    @Test
    public void test3(){
        Assert.assertTrue(false);
    }
}