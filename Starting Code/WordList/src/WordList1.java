import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.io.*;

public class WordList1
{
  private Collection<String> words;
  
  /**
   * Make a new WordList1.
   * Choose here which type of Collection you want to use!
   */
  public WordList1()
  {
    words = new ArrayList<String>();
    readFile ("popular.txt");
  }
  
  
  /**
   * Reads all lines of the text file filename into the collection words.
   * @param fileName the name of the text file
   */
  private void readFile (String fileName)
  {
    // open the file
    File file = new File(fileName);
    Scanner input = null;
    try
    {
        input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("*** Cannot open " + fileName + " ***");
        System.exit(1);        // quit the program
    } 

    // read the words from the file, one per line
    while (input.hasNext())
    {
      String nextWord = input.nextLine();
      words.add(nextWord);
 //     System.out.println (nextWord);
    }      
    input.close();
  }

  /**
   * Return a String reporting on the number of words imported.
   * @return a String reporting the number of words imported.
   */
  public String report()
  {
    return "Successfully imported " + words.size() + " words!";
  }
  
  public boolean isInCollection (String str)
  {
    return words.contains(str);
  }
}
