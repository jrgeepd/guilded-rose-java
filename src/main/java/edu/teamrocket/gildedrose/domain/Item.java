package edu.teamrocket.gildedrose.domain;

final class Item {

    private final String name;
    private int sell_in;
    private int quality;

    Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", name, sell_in, quality);
    }

    String getName() {
        return this.name;
    }

    int getSell_in() {
        return this.sell_in;
    }

    void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    int getQuality() {
        return this.quality;
    }

    void setQuality(int value) {
        this.quality = value;
    }
}
