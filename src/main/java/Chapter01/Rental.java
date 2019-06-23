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
    return _movie.getCharge(_daysRented);
  }

  public int getFrequentRenterPoints() {
    return _movie.getFrequentRenterPoints(_daysRented);
  }




}
