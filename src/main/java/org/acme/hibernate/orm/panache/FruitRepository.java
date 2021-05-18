package org.acme.hibernate.orm.panache;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FruitRepository implements PanacheRepositoryBase<Fruit, Long> {

}
