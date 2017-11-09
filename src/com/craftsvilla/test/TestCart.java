package com.craftsvilla.test;

import org.testng.annotations.Test;

import com.craftsvilla.page.CartPage;

import generic.BaseTest;

public class TestCart extends BaseTest
{
@Test
public void testCartDetails()
{
	//Reporter.log("driver="+driver,true);
	CartPage cp=new CartPage(driver);
	cp.mousehoveNclick(driver);
	cp.clicking(driver);
	cp.verify();
}
}
