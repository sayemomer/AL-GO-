//
// Assignment 1 , Part II(A)
// © Omer Sayem
// Written by: Omer Sayem, 40226505
//
package OOP;

class Cricketer{

    private long cricketerID ;
    public String cricketerName ;
    public float battingAvg;
    public float bowlingAvg;
    public float  strikeRate;
    public float economyRate;
    public boolean isAvaialable;
    public static int count = 0;

    // Default constructor
    public Cricketer(){
        this.cricketerID = Math.round(Math.random()*1000000);
        this.cricketerName = "";
        this.battingAvg = 0;
        this.bowlingAvg = 0;
        this.strikeRate = 0;
        this.economyRate =0;
        this.isAvaialable = false;
        count++;
    }
    
    //parameterized constructor
    public Cricketer(String cName,float bAvg , float bowAvg , float sRate , float eRate, boolean isAval ){
        this.cricketerID = Math.round(Math.random()*1000000);
        this.cricketerName = cName;
        this.battingAvg = bAvg;
        this.bowlingAvg = bowAvg;
        this.strikeRate = sRate;
        this.economyRate = eRate;
        this.isAvaialable = isAval;
        count++;
    }

    public long getCricketerID() {
        return cricketerID;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public float getBattingAvg() {
        return battingAvg;
    }

    public float getBowlingAvg() {
        return bowlingAvg;
    }

    public float getStrikeRate() {
        return strikeRate;
    }

    public float getEconomyRate() {
        return economyRate;
    }

    public boolean isAvailable() {
        return isAvaialable;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }


    public void setBattingAvg(float battingAvg) {
        this.battingAvg = battingAvg;
    }

    public void setBowlingAvg(float bowlingAvg) {
        this.bowlingAvg = bowlingAvg;
    }

    public void setStrikeRate(float strikeRate) {
        this.strikeRate = strikeRate;
    }

    public void setEconomyRate(float economyRate) {
        this.economyRate = economyRate;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvaialable = isAvailable;
    }

    public String toString() {

        return "ID: " + cricketerID + "\nName: " + cricketerName + "\nBatting Average: " + 
        battingAvg + "\nBalling Average: " + bowlingAvg + "\nStrike Rate: " + strikeRate + 
        "\nEconomy Rate: " + economyRate + "\nAvailability: " + isAvaialable + "\n";


    }

    public static int getNumberOfCricketers(){
        return count;
    }


    public boolean equals(Object o) {
        if (this == o) return true; 
        Cricketer other = (Cricketer) o; 
        return cricketerID == other.cricketerID && isAvaialable == other.isAvaialable; 
    }

}