package edu.teamrocket.gildedrose.domain;

public class NormalItem implements Updateable {

    private final Item item;

    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    }

    @Override
    public String toString() {
        return item.toString();
    }

    Item getItem() {
        return this.item;
    }

    public String getName() {
        return item.getName();
    }

    public int getSell_in() {
        return item.getSell_in();
    }

    void setSell_in() {
        item.setSell_in();
    }

    public int getQuality() {
        return item.getQuality();
    }

    void computeQuality(int amount) {
        int newQuality = getQuality() + amount;
        if (newQuality > 50) {
            newQuality = 50;
        } else if (newQuality < 0) {
            newQuality = 0;
        }
        item.setQuality(newQuality);
    }

    public void updateQuality() {
        if (getSell_in() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        setSell_in();
    }
}
