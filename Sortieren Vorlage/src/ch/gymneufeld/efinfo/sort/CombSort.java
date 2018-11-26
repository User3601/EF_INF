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
public class CombSort extends Sort{
    
    CombSort(){
        super();
    }
    CombSort(int size, int len){
        super(size,len);
    }

    @Override
    public void sort() {
    	int debug = 0;
    	System.out.println("Comb");
        for (int n = list.length-1;n>1;--n){
            int step = n;
            double shrinkfactor = 1.3;
            
            for (int i = 0; i<n; ++i){
                step = (int) (step/shrinkfactor);
                
                if(list[i].compareTo(list[n-step])>0){
                    String temp = list[i];
                    list[i] = list[n-step];
                    list[n-step] = temp;
                   
                    debug++;
                }
            }
        }
        System.out.print(debug);
    }
}