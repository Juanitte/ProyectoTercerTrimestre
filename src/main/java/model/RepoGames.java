package model;

import java.util.ArrayList;
import java.util.List;

public class RepoGames {

    private List<Game> games;
    private static RepoGames _newInstance;

    private RepoGames() {
        this.games = new ArrayList<Game>();
    }

    public static RepoGames getInstance() {
        if(_newInstance==null) {
            _newInstance = new RepoGames();
        }
        return _newInstance;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "\nGames: " + games + "\n\t";
    }
}
