package instruments;

public abstract class Instrument implements shop.ISell {
    private String material;
    private String colour;
    private String type;

    public Instrument(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public double calculateMarkup(double costPrice, double sellPrice) {
        return 0;
    }
}
