import java.util.LinkedList;
import java.util.List;

public class Empresa{
    public String name;
    private List<String> sucursal;

    public Empresa(String name){
        this.name = name;
        this.sucursal = new LinkedList<String>();
    }

    public void addSucursal(String sucursal){
        this.sucursal.add(sucursal);
    }

    public void removeSucursal(String sucursal){
        this.sucursal.remove(sucursal);
    }

    public void getSucursal(){
        System.out.println("Lista de Sucursales de la empresa " + this.name + ": ");
        for (String s : this.sucursal) {
            System.out.println(s);
        }
    }

    public void searchSucursal(String sucursal){
        if (this.sucursal.contains(sucursal)) {
            System.out.println("La sucursal " + sucursal + " existe en la empresa " + this.name);
        } else {
            System.out.println("La sucursal " + sucursal + " no existe en la empresa " + this.name);
        }
    }

    public void countSucursal(){
        System.out.println("La empresa " + this.name + " tiene " + this.sucursal.size() + " sucursales.");
    }

    public boolean isEmpty(){
        return this.sucursal.isEmpty();
    }
}