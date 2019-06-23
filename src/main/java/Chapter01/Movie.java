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
  private Price _price;

  public Movie(String _title, int priceCode) {
    this._title = _title;
    setPriceCode(priceCode);
  }

  public String getTitle() {
    return _title;
  }

  public int getPriceCode() {
    return _price.getPriceCode();
  }
  public void setPriceCode(int arg) {
    switch (arg) {
      case REGULAR:
        _price = new RegularPrice();
        break;
      case CHILDRENS:
        _price = new ChildrensPrice();
        break;
      case NEW_RELEASE:
        _price = new NewReleasePrice();
        break;
      default:
        throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
    }
  }

  public double getCharge(int daysRendted) {
    return _price.getCharge(daysRendted);
  }

  public int getFrequentRenterPoints(int daysRented) {
    return _price.getFrequentRenterPoints(daysRented);
  }

}
