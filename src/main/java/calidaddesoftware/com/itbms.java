package calidaddesoftware.com;

public class itbms {
	private double precio;
	private int porcentaje;
	
	public itbms() {
		super();
	}

	public itbms(double precio, int porcentaje) {
		super();
		this.precio = precio;
		this.porcentaje = porcentaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public boolean aplicaITBMS() 
	{
		if(precio>=1.00)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
