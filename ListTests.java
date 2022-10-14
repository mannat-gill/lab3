import static org.junit.Assert.*;
import javax.security.auth.kerberos.DelegationPermission;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.*; 

class aStringChecker implements StringChecker{
   

    @Override
    public boolean checkString(String s){
        return (s.length()>5); 
    }
}

public class ListTests{

    @Test
    public void testFilter(){
        List<String> input = new ArrayList<String>(Arrays.asList("hello", "a", "checking", "b", "morning"));
        List<String> output = new ArrayList<String>(Arrays.asList("checking","morning"));
        assertEquals(output, ListExamples.filter(output,new aStringChecker())); 
       
    }

    @Test 
    public void testMerge(){
        List<String> input1 = new ArrayList<String>(Arrays.asList("apple", "melon", "kiwi"));
        List<String> input2 = new ArrayList<String>(Arrays.asList("banana", "pear", "watermelon"));
        List<String> output = new ArrayList<String>(Arrays.asList("apple", "banana", "kiwi", "melon", "pear", "watermelon"));
      
    }



}