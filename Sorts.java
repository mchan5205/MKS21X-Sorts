public class Sorts{
  public static void selectionSort(int[] ary){
    int smallest = ary[0];
    int index = 0;
    for (int i = 0; i < ary.length - 1; i++){
      for (int x = i; x < ary.length; x++){
        if (ary[x] < smallest){
          smallest = ary[x];
          index = x;
        }
      }
      ary[index] = ary[i];
      ary[i] = smallest;
      smallest = ary[i + 1];
      index = i + 1;
    }
  }
}
