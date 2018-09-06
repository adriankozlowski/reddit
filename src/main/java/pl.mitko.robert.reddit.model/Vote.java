package pl.mitko.robert.reddit.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Vote {
    private long id;
    private long discoveryId;
    private long userId;
    private Timestamp date;
    private VoteType voteType;

    public Vote(){}

    public Vote(Vote vote) {
        this.id = id;
        this.discoveryId = discoveryId;
        this.userId = userId;
        this.date = date;
        this.voteType = voteType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDiscoveryId() {
        return discoveryId;
    }

    public void setDiscoveryId(long discoveryId) {
        this.discoveryId = discoveryId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", discoveryId=" + discoveryId +
                ", userId=" + userId +
                ", date=" + date +
                ", voteType=" + voteType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return getId() == vote.getId() &&
                getDiscoveryId() == vote.getDiscoveryId() &&
                getUserId() == vote.getUserId() &&
                Objects.equals(getDate(), vote.getDate()) &&
                getVoteType() == vote.getVoteType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDiscoveryId(), getUserId(), getDate(), getVoteType());
    }
}
