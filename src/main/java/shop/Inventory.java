package main.java.shop;


import java.util.ArrayList;

public class Inventory implements shop.ISell {
    private double costPrice;
    private double sellPrice;

    private ArrayList<instruments.Instrument> instrumentsForSale;
//    private Arraylist<shop.MusicParafernalia> otherForSale;
    private ArrayList<shop.ISell> itemsForSale;

    // want to compose my stock of both instruments and parafernalia
    // nd then apply cost and sell price to all

    @Override
    public double calculateMarkup(double costPrice, double sellPrice) {
        return 0;
    }
}
