package modelo;

public class Itinerario {
	private static int idUsuario;
	private static int idPromocion;
	private static int idAtraccion;

	public Itinerario(int idUsuario, int idPromocion, int idAtraccion) {
		super();
		this.idUsuario = idUsuario;
		this.idPromocion = idPromocion;
		this.idAtraccion = idAtraccion;
	}

	public Itinerario() {

	}

	public static int getIdUsuario() {
		return idUsuario;
	}

	public static int getIdPromocion() {
		return idPromocion;
	}

	public static int getIdAtraccion() {
		return idAtraccion;
	}

	@Override
	public String toString() {
		return "Itinerario [idUsuario=" + idUsuario + ", idPromocion=" + getIdPromocion() + ", idAtraccion="
				+ idAtraccion + "]";
	}

}
