package com.driver;

public class Pizza {

    public  int cheesePrice;
    public  int basePrice;
    public  int toppingsPrice;
    public int paperBagPrice;
    public  String bill;
    public  int totalPrice;


      boolean addCheese;
      boolean addTopping;
      boolean  addPaperBag;
      boolean isBillGenerated;





    public Pizza(Boolean isVeg){

        if(isVeg){
            basePrice= 300;
            toppingsPrice=70;
        }
        else {
            // it is a non veg case
            basePrice= 400;
            toppingsPrice= 120;
        }
        paperBagPrice=20;
        cheesePrice= 80;

        addTopping=false;
        addCheese=false;
        addPaperBag=false;
        isBillGenerated= false;

        totalPrice= basePrice;
        bill= "Base Price Of The Pizza: "+basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(addCheese== false){
            totalPrice = totalPrice+ cheesePrice;
            addCheese=true;
        }
    }

    public void addExtraToppings(){
        if(addTopping == false){
        totalPrice= totalPrice+ toppingsPrice;
        addTopping= true;
        }
    }

    public void addTakeaway(){
        if(addPaperBag== false){
        totalPrice = totalPrice+ paperBagPrice;
        addPaperBag=true;
        }
    }

    public String getBill(){
        if (isBillGenerated== false){

            if(addCheese==true){

                bill= bill+ "Extra Cheese Added: "+ cheesePrice +"\n";
            }
            if(addTopping==true){

                bill= bill+ "Extra Toppings Added: "+ toppingsPrice+"\n";
            }
            if(addPaperBag==true){

                bill= bill+ "Paperbag Added: "+ paperBagPrice + "\n";
            }

            bill= bill + "Total Price: "+ totalPrice+ "\n";

            isBillGenerated=true;
        }
        return bill;
    }
}
