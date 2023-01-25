
public class ImprimirArray {

  public static String toCadena (int[] array) {
    String arrayToString = "[";

    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        arrayToString += array[i];
      } else {
        arrayToString += array[i] + ", ";
      }
   }
    return arrayToString + "]";
  }
}
