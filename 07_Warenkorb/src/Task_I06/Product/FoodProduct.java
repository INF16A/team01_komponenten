package Task_I06.Product;

import Task_I06.IShoppingCartVisitor;

public abstract class FoodProduct extends Product {

    @Override
    public double accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
