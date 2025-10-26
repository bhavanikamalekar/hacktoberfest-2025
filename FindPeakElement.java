class FindPeakElement{
    public int findPeakElement(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0; // Only one element → it's a peak

        if (arr[0] > arr[1]) return 0; // First element is a peak
        if (arr[n - 1] > arr[n - 2]) return n - 1; // Last element is a peak

        int low = 1, high = n - 2; // Search between the ends

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; // Peak found
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1; // Go right
            } else {
                high = mid - 1; // Go left
            }
        }

        return -1; // Should not reach here if input is valid
    }
}
