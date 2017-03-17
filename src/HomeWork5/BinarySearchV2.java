package HomeWork5;

/**
 * Created by Bogdan on 15.03.2017.
 */
public class BinarySearchV2 {

    public static void main(String[] args) {

        int[] array = new int[]{35, 38, 40, 45, 50, 1, 2, 3, 5, 8, 12, 15, 18, 20, 21, 26, 28, 30};

        System.out.println(indexBinarySearch(array, 30));

    }

    public static int indexBinarySearch(int[] array, int target){

        int firstArrayIndex = 0, lastArrayIndex = array.length - 1, middleIndex = array.length/2;

        while (array[middleIndex] != target){
            if (firstArrayIndex >= lastArrayIndex) {
                return -1;
            }else if (target < array[middleIndex] && target >= array[firstArrayIndex]) {
                lastArrayIndex = middleIndex - 1;
            }else if (target > array[middleIndex] && target > array[lastArrayIndex] && array[middleIndex] < array[firstArrayIndex]) {
                lastArrayIndex = middleIndex - 1;
            }else if(target < array[middleIndex] && target < array[firstArrayIndex] && array[middleIndex] < array[firstArrayIndex]){
                lastArrayIndex = middleIndex - 1;
            }else if(target < array[middleIndex] && target < array[firstArrayIndex]) {
                firstArrayIndex = middleIndex + 1;
            }else if (target > array[middleIndex] && target <= array[lastArrayIndex]){
                firstArrayIndex = middleIndex + 1;
            }else if (target > array[middleIndex] && target > array[lastArrayIndex]){
                firstArrayIndex = middleIndex + 1;
            }
            middleIndex = firstArrayIndex + (lastArrayIndex - firstArrayIndex) / 2;
        }
        return middleIndex;
    }
}



