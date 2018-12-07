import java.util.Random;
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
  public static void bubbleSort(int[] ary){
    for (int i = 0; i < ary.length; i++){
      for (int x = 0; x < ary.length - i; x++){
        int temp = ary[x];
        if (ary[x] > ary[x + 1]){
          ary[x] = ary[x + 1];
          ary[x + 1] = temp;
        }
      }
    }
  }
  public static void main(String[] args){
    int[] ary = new int[Integer.parseInt(args[0])];
    Random x = new Random();
    for (int i = 0; i < Integer.parseInt(args[0]); i++){
      args[i] = x.nextInt();
    }
    bubbleSort(ary);
  }
}
