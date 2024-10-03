class Sorting {
    
    static void bsort(int a1[]) {
        int n = a1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a1[j] > a1[j + 1]) {
                    // Swap the elements
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }

            }
		    
            display(a1);

        }
    }
    
    static void display(int a1[]) {
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
		System.out.println();

    }
    
    public static void main(String args[]) {
        int a1[] = {2, 13, 24, 56, 45, 9, 30};
        display(a1);// Display array
        bsort(a1);//Sort the array
        display(a1);//Display the sorted array
    }
}
