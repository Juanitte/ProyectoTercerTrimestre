package model;

import java.util.ArrayList;
import java.util.List;

public class RepoAccounts {

    private List<Account> accounts;
    private static RepoAccounts _newInstance;

    private RepoAccounts() {
        this.accounts = new ArrayList<Account>();
    }

    public static RepoAccounts getInstance() {
        if(_newInstance==null) {
            _newInstance = new RepoAccounts();
        }
        return _newInstance;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "\nAccounts: " + accounts + "\n\t";
    }
}
