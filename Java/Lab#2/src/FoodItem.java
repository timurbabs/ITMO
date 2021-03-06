import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; // срок годности

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        else if (o instanceof GenericItem)
        {
            FoodItem p = (FoodItem) o;
            return (this.ID == p.ID)
                    && (this.itemCategory == p.itemCategory)
                    && (this.name.equals(p.name))
                    && (this.analog == p.analog)
                    && (this.price == p.price)
                    && (this.expires == p.expires)
                    && (this.dateOfIncome.equals(p.dateOfIncome));
        }
        return false;
    }

    @Override
    public FoodItem clone() {
        FoodItem p = new FoodItem();
        p.ID = this.ID;
        p.analog = this.analog;
        p.name = this.name;
        p.price = this.price;
        p.itemCategory = this.itemCategory;
        p.expires = this.expires;
        p.dateOfIncome = this.dateOfIncome;
        return p;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", analog=" + analog +
                ", itemCategory=" + itemCategory +
                '}';
    }

    @Override
    void printAll() {
        System.out.printf("ID: %d , Name: %-15s , price: %5.2f, category: %-15s, dateOfIncome: %ty.%5$tm.%5$td, expires: %d \n", ID, name, price, itemCategory, dateOfIncome, expires);
    }
}
