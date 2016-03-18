import java.util.ArrayList;
import java.lang.Math;

public class Sort
{
    ArrayList<Integer> list;
    long start;
    long end;
    long elapsedTime;

    public Sort(int size) {    
        list = new ArrayList<Integer>();
        for(int i = 0; i < size + 1; i++) {
            list.add((int)(Math.random()*100+1));
        }
    }

    public void swapNums(int pos1, int pos2) {
        int num1 = list.get(pos1);
        int num2 = list.get(pos2);
        list.set(pos2, num1);
        list.set(pos1, num2);
    }

    public void printList(){
        for (Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void originalSortNums() {
        start = System.nanoTime();
        System.out.println("Start: " + start);
        boolean isChanged = true;
        while(isChanged) {
            isChanged = false;
            for(int i = 0; i < list.size() - 1; i++) {
                if(list.get(i) > list.get(i + 1)) {
                    this.swapNums(i, i+1);
                    isChanged = true;
                }
            }
        }
        end = System.nanoTime();
        System.out.println("End: " + end);
        elapsedTime = end - start;
        System.out.println("It took " + elapsedTime + " nanoseconds to run the code");

    }

    public void insertionSort() {

        for(int i = 1; i < list.size(); i++) {
            int temporary = list.get(i);
            int j;
            for(j = i - 1; j >=0 && temporary < list.get(j); j--) {
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, temporary);
        }
    }

    public void bubbleSort() {
        boolean isChanged = true;
        while(isChanged) {
            isChanged = false;
            for(int i = 0; i < list.size() - 1; i++) {
                if(list.get(i) > list.get(i + 1)) {
                    this.swapNums(i, i+1);
                    isChanged = true;
                }
            }
        }
    }

    public void selectionSortSample() {
        for (int i = 0; i < list.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j) < list.get(index)) 
                    index = j;
            int smallerNumber = list.get(index);
            list.set(index) = list.get(i);
            list.get(i) = smallerNumber;
        }
        return list;
    }

    public void selectionSort() {
        for(int i = 0; i < list.size() - 1; i++) {
            int x = i;
            for(int j = i + 1; 
        }
    }
}