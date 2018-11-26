package ch.gymneufeld.efinfo.sort;

/**
 *
 * @author annaschmassmann
 */
public class SelectionSort extends Sort{
    
    SelectionSort(){
        super();
    }
    SelectionSort(int size, int len){
        super(size,len);
    }

    @Override
    public void sort() {
    	System.out.println("Selection");
    	int debug = 0;
        int anfangpos = 0;
        int endpos = list.length-1;
        
        while(anfangpos<= endpos){
            int bestpos = anfangpos;
            String best = list[bestpos];
            int temppos = anfangpos;
            while(temppos<=endpos){
                if(list[temppos].compareTo(best)<0){
                    best = list[temppos];
                    bestpos = temppos;
                    debug++;
                }
                temppos++;
                }
            
            String temp = list[anfangpos];
            list[anfangpos] = best;
            list[bestpos] = temp;
            anfangpos++;
            
        }
        System.out.print(debug);
    }
}
