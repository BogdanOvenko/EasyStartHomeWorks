package HomeWork5;

/**
 * Created by Bogdan on 09.03.2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = new int[]{15, 18, 20, 21, 26, 28, 30, 35, 38, 40, 45, 50, 1, 2, 3, 5, 8, 12};

        System.out.println(indexBinarySearch(array, 3));
    }

    public static int indexBinarySearch(int[] array, int target) {
        int indexOfMax = indexOfMax(array);

        if (target >= array[0] && target <= array[indexOfMax]) {
            return indexBinarySearch(array, target, 0, indexOfMax);
        } else if (target >= array[indexOfMax + 1] && target <= array[array.length - 1]) {
            return indexBinarySearch(array, target, indexOfMax + 1, array.length - 1);
        }else {
            return indexBinarySearch(array, target, 0, array.length - 1);
        }
    }

    public static int indexBinarySearch(int[] array, int target, int firstArrayIndex, int lastArrayIndex){
        if (firstArrayIndex > lastArrayIndex){
            return -1;
        }
        int middleIndex = firstArrayIndex + (lastArrayIndex - firstArrayIndex) / 2;

        if (target > array[middleIndex]) {
            return indexBinarySearch(array, target, middleIndex + 1, lastArrayIndex);

        } else if (target < array[middleIndex]) {

            return indexBinarySearch(array, target, firstArrayIndex, middleIndex - 1);
        }else {
            return middleIndex;
        }
    }
    public static int indexOfMax(int[] array){

        int indexOfMax = 0, max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= max){
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
