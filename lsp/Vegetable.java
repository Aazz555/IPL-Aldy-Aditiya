package lsp;

import java.sql.Date;

public class Vegetable extends Product {
    @Override
    String getName(){
        return "Broccoli";
    }
    @Override
    Date getExpiredDate(){
        return new Date (0);
    }
}