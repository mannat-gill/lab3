import static org.junit.Assert.*;
import javax.security.auth.kerberos.DelegationPermission;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.*; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {

    @Test
    public void testFiles() throws IOException{
        List<File> listOfFiles = new ArrayList<>(); 
        File folder = new File("/Users/mannat/Documents/GitHub/lab3/TestFolder");
        File file1 = new File("/Users/mannat/Documents/GitHub/lab3/TestFolder/File1");
        File file2 = new File("/Users/mannat/Documents/GitHub/lab3/TestFolder/File2");
        File file3 = new File("/Users/mannat/Documents/GitHub/lab3/TestFolder/File3");
        FileExample fileClass = new FileExample(); 
        List<File> output = new ArrayList<File>();
        output.add(folder); 
        output.add(file1);
        output.add(file2);
        output.add(file3);
        assertEquals(output, FileExample.getFiles(folder));
    }
    
}
