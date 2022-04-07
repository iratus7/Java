public class SortingMethods {
    
    public static void bubbleSort(Foititis[] pin) {  
        int n = pin.length;  
        // ταξινόμηση με 4 φοιτητές
        //n=10;
        Foititis temp = null;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if ((pin[j-1].getOnomatEpwnymo().compareTo(pin[j].getOnomatEpwnymo())) > 0) {  
                    //swap elements  
                    temp = pin[j-1];  
                    pin[j-1] = pin[j];  
                    pin[j] = temp;  
                }  
            }  
        }  
    }
    
    public static void insertSort(Foititis[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Foititis temp = arr[i];
            int j = i - 1; 
            while (j >= 0 && arr[j].getMobile().compareTo(temp.getMobile())>0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }    
    }
    
    public static void selectionSort(Foititis[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getMo() < arr[min_idx].getMo())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Foititis temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
