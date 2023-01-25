
public class CrearArray {

  public static int[] crearArray () {
    
    final int LONGITUD_ARRAY = 10;
    int[] array = new int[LONGITUD_ARRAY];
  
    for (int i = 0; i < LONGITUD_ARRAY; i++) {
      array[i] = (int) (Math.random() * 10);
    }
      return array; 
  }
}
