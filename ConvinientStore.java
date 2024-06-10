public class ConvinientStore {
    public static void main(String[] args) {

        int[] noOfNotes ={5,4,2,1};
        int priceOfItem = 295;

        System.out.println("Price of item is: "+priceOfItem);

        int[] notes = {10,50,100,200};
        int totalPrice = 0;

        for (int i = 0; i<noOfNotes.length;i++)
        {
            totalPrice = totalPrice+noOfNotes[i]*notes[i];

        }
        System.out.println("Total money i have to purchase that item: "+totalPrice);

        if(priceOfItem>totalPrice)
        {
            System.out.println("I need more money");
        }
        else
        {
            System.out.println("I can purchase");
        }
    }
}
