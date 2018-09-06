package pl.mitko.robert.reddit.dao;

public abstract class DAOFactory {

    public abstract DiscoveryDAO getDiscoveryDao();

    public abstract UserDAO getUserDao();

    public abstract VoteDAO getVoteDao();
}
