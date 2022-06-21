
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class GameManager {
    private List<Player> players = new ArrayList<>();

    public boolean register(Player player) {
        return players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        int name1 = FindByName(playerName1);
        int name2 = FindByName(playerName2);
        if (name1 == -1) {
            throw new NotRegisteredException("Первый игрок не зарегистрирован");
        } else if (name2 == -1) {
            throw new NotRegisteredException("Второй игрок не зарегистрирован");
        }
        if (players.get(name1).getStrength() > players.get(name2).getStrength()) {
            return 1;
        } else if (players.get(name1).getStrength() < players.get(name2).getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }

    public int FindByName(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                return players.indexOf(player);
            }
        }
        return -1;
    }
}
