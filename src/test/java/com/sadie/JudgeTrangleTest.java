package com.sadie; 
/*
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;*/
import org.testng.Assert;
import org.testng.annotations.Test;
/** 
* JudgeTrangle Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 31, 2019</pre> 
* @version 1.0 
*/ 
public class JudgeTrangleTest { 
/*
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} */

/** 
* 
* Method: function(double lengthA, double lengthB, double lengthC) 
* 
*/ 
@Test
public void testFunction() throws Exception { 
//TODO: Test goes here...
    double length_a=2.0;
    double length_b=2.0;
    double length_c=3.46;
    JudgeTrangle myjudge=new JudgeTrangle();
    myjudge.function(length_a,length_b,length_c);
} 

/** 
* 
* Method: AngleFunc(double a, double b, double c) 
* 
*/ 
@Test
public void testAngleFunc() throws Exception { 
//TODO: Test goes here...
    JudgeTrangle myjudge=new JudgeTrangle();
    double length_a=2.0;
    double length_b=2.0;
    double length_c=3.46;
    int result_test=myjudge.AngleFunc(length_a,length_b,length_c);
    //System.out.println("the result is"+result_test);
    Assert.assertEquals(result_test,2);
} 


} 
