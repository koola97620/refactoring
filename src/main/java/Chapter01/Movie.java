package Chapter01;

/**
 * @author choijaeyong on 26/05/2019.
 * @project refactoring
 * @description
 */
public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public Movie(String _title, int _priceCode) {
    this._title = _title;
    this._priceCode = _priceCode;
  }

  public String getTitle() {
    return _title;
  }

  public int getPriceCode() {
    return _priceCode;
  }
  public void setPriceCode(int arg) {
    _priceCode  = arg;
  }
}
