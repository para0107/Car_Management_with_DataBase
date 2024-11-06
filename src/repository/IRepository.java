package repository;

import domain.Identifiable;

import java.util.Collection;

public interface IRepository<ID,T extends Identifiable<ID>> {
    public void add(ID id, T t);
    public void delete(ID id);
    public void modify(ID id, T t);
    public T findbyId(ID id);
    public Collection<T> getAll();
}
