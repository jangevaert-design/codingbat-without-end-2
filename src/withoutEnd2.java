public class withoutEnd2 {
  public String withouEnd2(String str) {
    String substr = "";
    if (str.length() < 2) {
      return substr;
    }
    return (str.substring(1, str.length() - 1));
  }
}
