package Chapter01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author choijaeyong on 26/05/2019.
 * @project refactoring
 * @description
 */
public class Customer {
  private String _name;
  private Vector _rentals = new Vector();

  public Customer(String _name) {
    this._name = _name;
  }

  public void addRental(Rental arg) {
    _rentals.addElement(arg);
  }

  public String getName() {
    return _name;
  } 

  public String statement() {

    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = getName() + " 고객님의 대여기록 \n";

    while(rentals.hasMoreElements()) {
      double thisAmount= 0;
      Rental each = (Rental) rentals.nextElement();

      thisAmount = each.getCharge();

      frequentRenterPoints++;

      if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
        each.getDaysRented() > 1 )
        frequentRenterPoints++;

      result += "\t" + each.getMovie().getTitle() + "\t" +
        String.valueOf(thisAmount) + "\n";

      totalAmount += thisAmount;
    }

    result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
    result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
    return result;
  }

}
