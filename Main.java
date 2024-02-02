// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) throws Exception {
    String input = """
      let a = 42 + 2;
      let b = 15 + 3;
      print a + b;        
          """;

    Parser p = new Parser (input.getBytes());
    p.parse();


    Interpretador i = new Interpretador (p.output());
    i.run();

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}