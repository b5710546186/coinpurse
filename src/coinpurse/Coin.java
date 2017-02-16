package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currrency.
 * @author Kaninpat Tangittisak
 */
public class Coin implements Comparable<Coin>{
	public static final String DEFAULT_CURRENCY = "Baht";
    /** Value of the coin. */
    private double value;
    /** The currency, of course. */
    private final String currency;
    
    /**
     * A coin with given value using the default currency.
     * @param value of the coin
     */
    public Coin( double value ) {
        this.value = value;
        this.currency = DEFAULT_CURRENCY;
    }
    
    /**
     * A coin with given value and currency.
     * @param value of the coin
     * @param the specify currency
     */
    public Coin( double value, String currency ) {
    	this.value = value;
    	this.currency = currency;
    }

    /**
     * An accessor method for getting coin's value.
     * @return value of the coin
     */
    public double getValue( ) {
    	return this.value;
    } 
    
    /**
     * A mutator method for setting coin's value.
     * @param value of coins that we want to set
     */
    public void setValue(double value){
    	this.value = value;
    }
    
    /**
     * Coin has several currency, this method gets the specific currency.
     * @return the currency of coins in purse
     */
    public String getCurrency() {
    	return this.currency;
    }
    
    /**
     * Two coins are equal if they have the same value and currency.
     */
    public boolean equals(Object obj) {
    	if(obj == null){
    		return false;
    	}
    	if(obj.getClass() != this.getClass()){
    		return false;
    	}
    	Coin other = (Coin)obj;
    	return this.getValue() == other.getValue();
    }
    
    /**
     * Order coins by value so that the smaller value comes first.
     */
    public int compareTo(Coin other){
    	if(other == null){
    		return -1;
    	}
    	return (int) (this.value - other.value);
    }

    /**
     * A string which show coin's value and currency.
     */
    public String toString() {
    	return this.getValue() + " " + this.getCurrency(); 
    }
}
