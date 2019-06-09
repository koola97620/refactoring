package Chapter01;

/**
 * @author choijaeyong on 26/05/2019.
 * @project refactoring
 * @description
 */
public class Rental {
  private Movie _movie;
  private int _daysRented;

  public Rental(Movie movie, int _daysRented) {
    this._movie = movie;
    this._daysRented = _daysRented;
  }

  public Movie getMovie() {
    return _movie;
  }

  public int getDaysRented() {
    return _daysRented;
  }

  public double getCharge() {
    double result = 0;
    switch(getMovie().getPriceCode()) {
      case Movie.REGULAR:
        result += 2;
        if(getDaysRented() > 2)
          result += (getDaysRented()-2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        result += getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        result += 1.5;
        if(getDaysRented() > 3)
          result += (getDaysRented() -3) * 1.5;
        break;
    }
    return result;
  }
}
