/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.gymneufeld.efinfo.sort;

/**
 *
 * @author Nicolai
 */
public class BubbleSort extends Sort{
    
    BubbleSort(){
        super();
    }
    BubbleSort(int size, int len){
        super(size,len);
    }

    @Override
    public void sort(){
    	int debug = 0;
    	System.out.println("Bubble");
        for (int n = list.length-1;n>1;--n){
            for (int i = 0; i<n; ++i){
                if(list[i].compareTo(list[i+1])>0){
                    String temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    debug++;
                }
            }
        }
        System.out.print(debug);
    }
    public double getRuntime() {
    	long time1 = System.nanoTime();
    	this.sort();
    	long time2 = System.nanoTime();
    	double time = (time2-time1)/1000000000.0;
    	return time;
    }
}
