package ch.gymneufeld.efinfo.sort;



/**
 *
 * @author Markus Jordi
 * @version 1.0
 */
public abstract class Sort
{

    /**
     * The list to be sorted
     */
    public String[] list = {"Ham","Cucumber","Ananas","Lemon"};

    /**
     * General constructor
     * @param size int number of words to be generated
     * @param length int length of the generated words
     */

    public Sort(int size, int length)
    {
        list = new String[size];

        char[] word = new char[length];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < length; j++)
            {
                word[j] = (char) ((int) (Math.random() * 26) + 65);
            }

            list[i] = (new String(word));
        }
    }

    /**
     * Default constructor
     * 100 words of 10 characters length are generated
     */
    public Sort()
    {
        this(100, 10);
    }

    /**
     * Sorting algorithm
     * To be implemented in extended classes
     */
    public abstract void sort();
    
    /**
     * Test method
     * @return true if data is correctly sorted
     *
     */
    public boolean isSorted()
    {
        for (int i=0; i<list.length -1; i++)
            if (list[i].compareTo(list[i+1]) > 0)
                return false;
        return true;
    }
    
}
