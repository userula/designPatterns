package domain.adapter;

public class Unik
{
	private String unikName;
	private String unikLocation;

	public Unik(String n, String l)
	{
		setName(n);
		setLocation(l);
	}

	public String getUnikName() {
		return unikName;
	}

	public void setName(String unikName) {
		this.unikName = unikName;
	}

	public String getUnikLocation() {
		return unikLocation;
	}

	public void setLocation(String unikLocation) {
		this.unikLocation = unikLocation;
	}
}
