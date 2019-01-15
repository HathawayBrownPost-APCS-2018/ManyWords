
public class WordsTester
{

  // ------------------------------------------------------------
  //   main method to explore the different collections.
  // ------------------------------------------------------------
  public static void main (String[] args) 
  {
    WordList1 myWords = new WordList1();
    System.out.println(myWords.report());
    
    int numWords = 50;
    System.out.println("\n" + numWords + " random words:");
    long startTime = System.nanoTime();
    for (int i = 1; i <= numWords; i++)
    {
      RandomWord nextWord = new RandomWord();
      boolean isWord = myWords.isInCollection(nextWord.toString());
      System.out.print(nextWord);
      if (isWord)
      {
        System.out.print("\t\tA real word!");
      }
      System.out.println();
    }
    
    long endTime = System.nanoTime();
    double elapsedSec = (endTime - startTime) / 1000000000.0;
    System.out.println (elapsedSec + " seconds to analyze.");
        
  }
}
