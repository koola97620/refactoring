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

    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = getName() + " 고객님의 대여기록 \n";

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();

      result += "\t" + each.getMovie().getTitle() + "\t" +
          String.valueOf(each.getCharge()) + "\n";

    }

    result += "누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n";
    result += "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
    return result;
  }

  public String htmlStatement() {
    Enumeration rentals = _rentals.elements();
    String result = "<H1><EM>" + getName() + " 고객님의 대여 기록</EM></H1><P>\n";
    while(rentals.hasMoreElements()) {
      Rental each = (Rental)rentals.nextElement();
      result += each.getMovie().getTitle() + ": " +
          String.valueOf(each.getCharge()) + "<BR>\n";
    }

    result += "<P>누적 대여료: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
    result += "적립 포인트 : <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><p>";
    return result;
  }

  private int getTotalFrequentRenterPoints() {
    int result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += each.getFrequentRenterPoints();
    }
    return result;
  }

  private double getTotalCharge() {
    double result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += each.getCharge();
    }

    return result;
  }

}
