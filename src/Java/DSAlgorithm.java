package Java;

public class DSAlgorithm {
    public static void main(String[] args) {
        //DSArrayOperation();
        DSSorting();
    }

    private static void DSSorting() {
        BubbleSort();
    }

    private static void BubbleSort() {
        int[] array = {12, 2, 5, 3, 10};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //swap two array number in array location
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void DSArrayOperation() {
        Traversing();
        insertion();
        Deletion();
        SearchItem();
        updateItem();

    }

    private static void updateItem() {
        int UpdateIndex = 3;
        int updateValue = 100;

        int[] array = new int[15];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == UpdateIndex) {
                array[UpdateIndex] = updateValue;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("item: [" + i + "] = " + array[i]);
        }
    }

    private static void SearchItem() {
        int ITemSearch = 3;

        int[] array = new int[15];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ITemSearch) {
                System.out.println("Have an Item Position : [ " + array[i] + " ]");
            }
        }

    }

    private static void Deletion() {
        int RemovedIndex = 3;
        int size = 5;


        int[] array = new int[15];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = RemovedIndex; i < size; i++) {
            array[i] = array[i + 1];
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    private static void insertion() {

        int insertValue = 10;
        int insertIndex = 4;
        int size = 5;


        int[] array = new int[15];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;


        for (int i = size; i >= insertIndex; i--) {
            array[i] = array[i - 1];
        }
        array[insertIndex] = insertValue;


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void Traversing() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
