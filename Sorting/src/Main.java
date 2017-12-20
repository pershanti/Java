public class Main {

    public static void main(String[] args) {
       // bubble sort o(n^2), stable
//        int[] myArray = {33, -4, 22, 11, 350, 21};
//        int partition = myArray.length-1;
//        while (partition > 0) {
//            for (int i = 0; i < partition; i++) {
//                if (myArray[i] > myArray[i + 1]) {
//                    int temp = myArray[i];
//                    myArray[i] = myArray[i + 1];
//                    myArray[i + 1] = temp;
//                }
//            }
//            partition = partition - 1;
//        }
//
//        for (int j = 0; j < myArray.length; j++) {
//            System.out.println(myArray[j]);
//
//        }


        //selection sort, O(n^2), unstable

        int[] myArray = {33, -4, 22, 11, 350, 21};
        int partition = myArray.length-1;
        int largest = 0;
        while(partition>0){
            for(int i=0; i< partition; i++){
                if(myArray[i] > myArray[largest]) {
                    largest = i;
                }
            }
            int temp = myArray[partition];
            myArray[partition] = myArray[largest];
            myArray[largest]=temp;
            partition = partition - 1;
        }

        for (int j = 0; j < myArray.length; j++) {
            System.out.println(myArray[j]);
        }
    }
}
