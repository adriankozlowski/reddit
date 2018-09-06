package pl.mitko.robert.reddit.dao;

import pl.mitko.robert.reddit.model.Discovery;

import java.util.List;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long>{

    List<Discovery> getAll();

}

