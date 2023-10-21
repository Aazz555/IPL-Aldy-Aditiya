package lsp;

import java.sql.Date;

public class Vegetable extends FoodProduct {
    @Override
    String getName(){
        return "Broccoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date (0);
    }
}
