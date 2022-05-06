public class Card {

  // part 1: what do I call this part?

  static final String[] SUITES = { "♠", "♥", "♦", "♣" };
  static final String[] SPECIALS = { "A", "J", "Q", "K" };
  static final int BASE = 9;
  int width;
  int height;

  String suite;
  String value;
  int num;
  int id;

  //////////////////////////
  // part 2: this part makes my objects
  // what is this called?

  public Card(int seed) {

    this.id = seed;

    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SPECIALS.length);

    String val = (n == 0) ? SPECIALS[n] : "" + (n + 1);

    if (n > BASE)
      val = SPECIALS[n - BASE];

    this.num = n + 1;
    this.suite = SUITES[s];
    this.value = val;
  }

  ////////////////////////
  // part 3:
  // what goes here?

  public String toString() {

    return super.toString() + ": " + this.suite + this.value;
  }

}
