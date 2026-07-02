package EjercicioBodega;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Bodega<Articulo> bodega = new Bodega<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        Integer ID = 0;
        String CodigoBarras = "20260107";
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar un producto a la bodega");
            System.out.println("2. Editar un producto de la bodega");
            System.out.println("3. Buscar un producto en la bodega mediante codigo de barras");
            System.out.println("4. Eliminar un producto de la bodega");
            System.out.println("5. Buscar un producto en la bodega mediante nombre");
            System.out.println("6. Mostrar todos los productos de la bodega");
            System.out.println("7. Buscar por ID");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ID++;
                    CodigoBarras += String.valueOf(ID);
                    System.out.println("Agregar un producto a la bodega");
                    System.out.println("Ingrese el nombre del articulo:");
                    String nombre = sc.next();
                    System.out.println("Ingrese la cantidad del producto:");
                    Integer cantidad = sc.nextInt();
                    System.out.println("Ingrese el precio del producto:");
                    Double precio = sc.nextDouble();

                    Articulo articulo = new Articulo(ID, CodigoBarras, nombre, cantidad, precio);
                    bodega.add(articulo);

                    break;
                case 2:
                    System.out.println("Editar un producto de la bodega");
                     System.out.println("Ingresa el Id del producto a editar");
                    Integer idBuscar=sc.nextInt();
                    sc.nextLine();
                    Articulo articuloEditar=bodega.getLista().get(idBuscar-1);
                    System.out.println("Ingresa el nombre");
                    articuloEditar.setNombre(sc.nextLine());
                    System.out.println("Ingresa la cantidad");
                    articuloEditar.setExistencia(sc.nextInt());
                    System.out.println("Ingresa el precio");
                    articuloEditar.setPrecio(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Buscar un producto en la bodega mediante codigo de barras");
                    System.out.println("Metodo asignado a Mario");
                    break;
                case 4:
                    System.out.println("Eliminar un producto de la bodega");
                    System.out.println("Ingrese el ID del producto a eliminar:");
                    bodega.getLista().forEach(articulo1 -> System.out.println("\nID: "+articulo1.getId()+"\nCodigo de barras: "+articulo1.getCodigoBarras()+"\nNombre: "+articulo1.getNombre()+"\nCantidad: "+articulo1.getExistencia()+"\nPrecio: "+articulo1.getPrecio()));
                    Integer idEliminar = sc.nextInt();
                    bodega.eliminar(bodega.getLista().get(idEliminar - 1));

                    break;
                case 5:
                    System.out.println("Buscar un producto en la bodega mediante nombre");
                    break;
                case 6:
                    System.out.println("Mostrar todos los productos de la bodega");
                    bodega.getLista().forEach(articulo1 -> System.out.println("\nID: "+articulo1.getId()+"\nCodigo de barras: "+articulo1.getCodigoBarras()+"\nNombre: "+articulo1.getNombre()+"\nCantidad: "+articulo1.getExistencia()+"\nPrecio: "+articulo1.getPrecio()));
                    break;
                case 7:
                    System.out.println("Buscar por ID");
                    System.out.println("Ingresa un id del producto: ");
                    Integer id=sc.nextInt();
                    Articulo art =bodega.getLista().get(id-1);
                    System.out.println("Articulo: ");
                    System.out.println("Nombre: "+art.getNombre());
                    System.out.println("Codigo de barras: "+ art.getCodigoBarras());
                    System.out.println("Existencia: "+ art.getExistencia());

                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    
    }
}
