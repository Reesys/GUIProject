package gui.model;

public class Duck
{
	private String sound;

	public Duck()
	{
		this.sound = "Quack Quack";
	}

	public String getSound()
	{
		return sound;
	}

	@Override
	public String toString()
	{
		String description = "I am a duck!";

		return description;
	}
}
