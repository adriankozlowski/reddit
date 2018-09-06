package pl.mitko.robert.reddit.dao;

import pl.mitko.robert.reddit.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

    public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);
}
