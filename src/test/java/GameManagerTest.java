import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GameManagerTest {

    /*  GameManager manager = new GameManager();
      Player player1 = new Player(1, "Андрей-чемпион", 150);
      Player player2 = new Player(2, "Николай", 70);
      Player player3 = new Player(3, "Дмитрий", 70);

      @BeforeEach
      void setup() {
          manager.register(player1);
          manager.register(player2);
          manager.register(player3);
      }

      @Test
      void shouldFirstPlayerWin() {
          assertEquals(1, manager.round("Андрей-чемпион", "Николай"));
      }

      @Test
      void shouldSecondPlayerWin() {
          assertEquals(2, manager.round("Дмитрий", "Андрей-чемпион"));
      }

      @Test
      void shouldDraw() {
          assertEquals(0, manager.round("Дмитрий", "Николай"));
      }

      @Test
      void shouldThrowNotRegisteredExceptionOne() {
          assertThrows(NotRegisteredException.class, () -> {
              manager.round("Андрей-чемпион", "Антон");
          });
      }

      @Test
      void shouldThrowNotRegisteredExceptionTwo() {
          assertThrows(NotRegisteredException.class, () -> {
              manager.round("Антон", "Андрей-чемпион");
          });
      }*/
    GameManager manager = new GameManager();
    Player player1 = new Player(1, "Андрей-чемпион", 150);
    Player player2 = new Player(2, "Николай", 70);
    Player player3 = new Player(3, "Дмитрий", 70);

    @BeforeEach
    void setup() {
        manager.register("Андрей-чемпион", player1);
        manager.register("Николай", player2);
        manager.register("Дмитрий", player3);
    }

    @Test
    void shouldFirstPlayerWin() {
        assertEquals(1, manager.round("Андрей-чемпион", "Николай"));
    }

    @Test
    void shouldSecondPlayerWin() {
        assertEquals(2, manager.round("Дмитрий", "Андрей-чемпион"));
    }

    @Test
    void shouldDraw() {
        assertEquals(0, manager.round("Дмитрий", "Николай"));
    }

    @Test
    void shouldThrowNotRegisteredExceptionOne() {
        assertThrows(NotRegisteredException.class, () -> {
            manager.round("Андрей-чемпион", "Антон");
        });
    }

    @Test
    void shouldThrowNotRegisteredExceptionTwo() {
        assertThrows(NotRegisteredException.class, () -> {
            manager.round("Антон", "Андрей-чемпион");
        });
    }

}
