import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2,1 + 1);
    }
    @Test
    public void testmarkdownParse() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List expected = List.of("https://something.com","some-page.html");
        assertEquals(expected, links);
    }
    @Test
    public void testmarkdownParse2() throws IOException{
        Path fileName = Path.of("ex.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List expected = List.of("smth.com");
        assertEquals(expected, links);
    }
    @Test
    public void testmarkdownParse3() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List expected = List.of("https://something.com","some-page.html");
        assertEquals(expected, links);
    }
    @Test
    public void testmarkdownParse4() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List empty = new ArrayList();
        assertEquals(empty, links);
    }
    @Test
    public void testmarkdownParse5() throws IOException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List empty = new ArrayList();
        assertEquals(empty, links);
    }
    @Test
    public void testmarkdownParse6() throws IOException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List expected = List.of("page.com");
        assertEquals(expected, links);
    }
    @Test
    public void testmarkdownParse7() throws IOException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List empty = new ArrayList();
        assertEquals(empty, links);
    }
    @Test
    public void testmarkdownParse8() throws IOException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        List empty = new ArrayList();
        assertEquals(empty, links);
    }


}