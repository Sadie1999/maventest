package com.util; 

/*import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;*/
import org.testng.Assert;
import org.testng.annotations.Test;
/** 
* MySumOfSquares Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 31, 2019</pre> 
* @version 1.0 
*/

public class MySumOfSquaresTest { 
/*
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} */

/** 
* 
* Method: increment(double d) 
* 
*/ 
@Test
public void testIncrement() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getResult() 
* 
*/ 
@Test
public void testGetResult() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getN() 
* 
*/ 
@Test
public void testGetN() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: clear() 
* 
*/ 
@Test
public void testClear() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: evaluate(double[] values, int begin, int length) 
* 
*/ 
@Test
public void testEvaluate() throws Exception { 
//TODO: Test goes here...
    MySumOfSquares mySumOfSquares=new MySumOfSquares();
    double values[]=new double[3];
    values[0]=2.0;
    values[1]=3.0;
    values[2]=5.0;
    double result= mySumOfSquares.evaluate(values);
    Assert.assertEquals(result,38.0,0.5);
 //   if(result==37.0)
   //     System.out.println("YES");
    //else System.out.println("NO");
} 

/** 
* 
* Method: copy() 
* 
*/ 
@Test
public void testCopy() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: copy(MySumOfSquares source, MySumOfSquares dest) 
* 
*/ 
@Test
public void testCopyForSourceDest() throws Exception { 
//TODO: Test goes here... 
} 


} 
