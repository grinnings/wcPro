package test.com.SoftwareQualityAndTesting; 

import com.SoftwareQualityAndTesting.wcMainProcess;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import static junit.framework.TestCase.assertEquals;

/** 
* wcMainProcess Tester. 
* 
* @author 张付俊
* @since <pre>���� 6, 2018</pre> 
* @version 1.0 
*/ 
public class wcMainProcessTest { 
Vector<Map<String, Integer>> expected = new Vector<>();
Map<String, Integer> test = new HashMap<>();

@Before
public void before() throws Exception {
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: countWordFrequency() 
* 
*/ 
@Test
public void testCountWordFrequency() throws Exception { 
//TODO: Test goes here...
//    Vector<String> usecasesOfWord = new Vector<>();
//    InputStreamReader isr = new InputStreamReader(new FileInputStream("testWord.txt"));
//    BufferedReader br = new BufferedReader(isr);
//    String s;
//    while((s = br.readLine()) != null)
//        usecasesOfWord.addElement(s);
//    isr = new InputStreamReader(new FileInputStream("testWordResult.txt"));
//    br = new BufferedReader(isr);
//    while((s = br.readLine()) != null)
//    {
//        if(s.isEmpty())
//            expected.addElement(new HashMap<>());
//        else
//            {
//            HashMap<String, Integer> each = new HashMap<>();
//            String[] temp = s.split(";");
//            for(String t:temp)
//            {
//                String[] tuple = t.split(" ");
//                each.put(tuple[0], Integer.parseInt(tuple[1]));
//            }
//            expected.addElement(each);
//        }
//    }
//    for(String t:usecasesOfWord){
//        wcMainProcess wcmp = new wcMainProcess(t);
//        assertEquals(expected,);
//    }
} 

/** 
* 
* Method: Word() 
* 
*/ 
@Test
public void testWord() throws Exception
{
//TODO: Test goes here...
//
    Vector<String> usecasesOfWord = new Vector<>(), expectOfWord = new Vector<>();
    InputStreamReader isr = new InputStreamReader(new FileInputStream("testWord.txt"));
    BufferedReader br = new BufferedReader(isr);
    String s;
    while((s = br.readLine()) != null)
        usecasesOfWord.addElement(s);
    isr = new InputStreamReader(new FileInputStream("testWordResult.txt"));
    br = new BufferedReader(isr);
    while((s = br.readLine()) != null)
        expectOfWord.addElement(s);
    for(int i = 0; i < usecasesOfWord.size(); i++){
        wcMainProcess wcmp = new wcMainProcess(usecasesOfWord.elementAt(i));
        assertEquals(expectOfWord.elementAt(i),wcmp.Word().toString());
    }

}


} 
