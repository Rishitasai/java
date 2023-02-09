 public static void sort(String[] arr)
    {
        for (int pass = 1; pass < arr.length; pass++)
        {
            int largestPos = findLargest(arr, arr.length - pass);
            if (largestPos != arr.length - pass)
            {
                swap(arr, largestPos, arr.length - pass);
            }
        }
    }

    public static int findLargest(String[] arr, int num)
    {
        int largestPos = 0;
        for (int i = 1; i <= num; i++)
        {
            if (arr[i].compareToIgnoreCase(arr[largestPos]) > 0)
            {
                largestPos = i;
            }
        }
        return largestPos;
    }

    public static void swap(String[] arr, int first, int second)
    {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
