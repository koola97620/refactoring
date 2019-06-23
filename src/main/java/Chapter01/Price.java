package Chapter01;

/**
 * @author choijaeyong on 23/06/2019.
 * @project refactoring
 * @description
 */
public abstract class Price {
  abstract int getPriceCode();
  abstract double getCharge(int daysRented);
  public int getFrequentRenterPoints(int daysRented) {
    return 1;
  }
}

class ChildrensPrice extends Price {
  int getPriceCode() {
    return Movie.CHILDRENS;
  }
  public double getCharge(int daysRendted) {
    double result = 0;
    result += 1.5;
    if(daysRendted > 3)
      result += (daysRendted -3) * 1.5;
    return result;
  }

}

class NewReleasePrice extends Price {
  int getPriceCode() {
    return Movie.NEW_RELEASE;
  }
  public double getCharge(int daysRendted) {
    return daysRendted * 3;
  }

  @Override
  public int getFrequentRenterPoints(int daysRented) {
    return (daysRented > 1) ? 2: 1;
  }
}

class RegularPrice extends Price {
  int getPriceCode() {
    return Movie.REGULAR;
  }
  public double getCharge(int daysRendted) {
    double result = 0;
    result += 2;
    if(daysRendted > 2)
      result += (daysRendted-2) * 1.5;
    return result;
  }


}
