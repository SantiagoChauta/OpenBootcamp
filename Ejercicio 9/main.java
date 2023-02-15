
public class main {
	public static void main(String args[]) {
		Cliente c1 = new Cliente(25,"Andres Gomez","3115637410",254.22);
		Trabajador t1 = new Trabajador(30,"Lucia Torres","3205748896",1500.00);
		System.out.println("Cliente: "+c1.getNombre()+"\nEdad: "+c1.getEdad()+"\nTelefono: "+c1.getTelefono() +"\nCredito: "+c1.getCredito());
		System.out.println("Trabajador: "+t1.getNombre()+"\nEdad: "+t1.getEdad()+"\nTelefono: "+t1.getTelefono() +"\nSalario: "+t1.getSalario());
		
	}
}
