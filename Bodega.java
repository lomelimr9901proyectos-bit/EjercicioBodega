package EjercicioBodega;

import java.util.ArrayList;
import java.util.List;

public class Bodega <T> {
    List <T> bodega = new ArrayList<>();

   public void add(T objeto){
       bodega.add(objeto);
   }

   public List<T> getLista(){
       return bodega;
   }

   public void eliminar(T objeto){
       bodega.remove(objeto);
   }

}
