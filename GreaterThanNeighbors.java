package recursionExercise;

//---------------------------------------------------------------
//Greater-than-neighbors finder
//Developer: עידן דרור
//Description: Recursively prints all elements that are greater
//than both of their neighbors in the array.
//---------------------------------------------------------------


public class GreaterThanNeighbors {

    // Recursive function that prints elements greater than both neighbors
    public static void printGreater(int[] arr, int index, int n) {

        // Stop when reaching the last element (can't be printed)
        if (index == n - 1) {
            return;
        }

        // Check current element (only if it's not the first)
        if (index > 0 && arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
            System.out.println(arr[index]);
        }

        // Recursive call for next index
        printGreater(arr, index + 1, n);
    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 3, 8, 2, 10, 4};
        printGreater(arr, 0, arr.length);
    }
}


/*
סיבוכיות זמן:
הפעולה עוברת פעם אחת על כל איבר במערך (קריאה אחת לכל אינדקס),
ובכל שלב מתבצעת פעולה קבועה O(1).
לכן:  T(n) = T(n-1) + O(1)  →  O(n)

סיבוכיות מקום:
הרקורסיה יוצרת עומק של n קריאות עד הגעה לסוף המערך.
לכן סיבוכיות המקום היא: O(n)
*/
