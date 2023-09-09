/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controller;


/**
 *
 * @author DAO
 */
import common.Algorithm;
import common.Library;
import Model.Element;
import view.Menu;

public class Searching extends Menu<String> {

    static String[] mc = {"Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Searching(Element element) {
        super("Sort programming", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> sort();
            case 2 -> System.exit(0);
        }
    }

    public void sort() {
        final String[] mcSort = {"Bubble Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.display(array);
                switch (n) {
                    case 1 -> {
                        algorithm.bubbleSort(array);
                        System.out.println("\nSorted array by Bubble Sort: ");
                        library.display(array);
                        
                        System.out.println("");
                    }
                    case 2 -> {
                       
                    }
                    case 3 -> System.exit(0);
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }
}
