package com.sadie; 
/*
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;*/
import org.testng.Assert;
import org.testng.annotations.Test;
/** 
* MAIN Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 31, 2019</pre> 
* @version 1.0 
*/ 
public class MAINTest { 
/*
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 
*/
/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception {

//TODO: Test goes here...
    MAIN mainjudge=new MAIN();
    String []args=new String[5];
    MAIN.main(args);

} 


} 
