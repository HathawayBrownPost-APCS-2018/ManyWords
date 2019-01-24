/**
 * @version 2019-01-24
 */ 
 
public class WordsTester
{

  // ------------------------------------------------------------
  //   main method to explore the different collections.
  // ------------------------------------------------------------
  public static void main (String[] args) 
  {
    long startTime = System.nanoTime();
    WordList1 myWords = new WordList1();
    long endTime = System.nanoTime();
    System.out.println(myWords.report());
    double elapsedSec = (endTime - startTime) / 1000000000.0;
    System.out.println (elapsedSec + " seconds to build database.");
    
    
    int numWords = 5000;
    System.out.println("\n" + numWords + " random words:");
    
    startTime = System.nanoTime();
    for (int i = 1; i <= numWords; i++)
    {
      RandomWord nextWord = new RandomWord();
      boolean isWord = myWords.isInCollection(nextWord.toString());
      
      if (isWord)
      {
        System.out.print(nextWord);
      }
      else
      {
        System.out.print(".");
      }
      if (i % 100 == 0)
      {
        System.out.println();
      }
    }
    
    endTime = System.nanoTime();
    elapsedSec = (endTime - startTime) / 1000000000.0;
    System.out.println (elapsedSec + " seconds to analyze.");
        
  }
}
