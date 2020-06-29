package creditcard;


public class CreditCard {
    private int [] numbers;
    private int year;
    private int month;
    public CreditCard(int n1, int n2, int n3, int n4, int year, int month){
        this.numbers = new int [4];
        this.numbers[0] = n1;
        this.numbers[1] = n2;
        this.numbers[2] = n3;
        this.numbers[3] = n4;
        this.month = month;
        this.year = year;
        
    }
    public boolean isValid(int year, int month){
        if (this.year > year)
            return true;
        else{
            if (this.month > month)
                return true;
                    }
          return false;
        
    }
}
