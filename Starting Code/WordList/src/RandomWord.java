/**
 * Generates a random collection of letters.
 * @author mbuescher
 *
 */
public class RandomWord
{

  private String myWord;
  
  public RandomWord()
  {
    int wordLength = (int)(Math.random() * 2) + 2;
    myWord = "";
    for (int i = 0; i < wordLength; i++)
    {
      myWord += getRandomLetter();
    }
  }
  
  // Returns a random lower-case letter
  private char getRandomLetter()
  {
    int num = (int)(Math.random() * 26) + (int)'a';
    return (char)num;
  }
  
  /**
   * Returns the random word.
   * @return  the String value of the RandomWord 
   */
  public String toString()
  {
    return myWord;
  }
}
