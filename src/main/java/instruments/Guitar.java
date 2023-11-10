package main.java.instruments;

public class Guitar
        extends instruments.Instrument
        implements instruments.IPlay {
    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int numberOfStrings) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public String play(String sound) {
        return null;
    }
}
