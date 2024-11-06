package repository;

import domain.Identifiable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MemoryRepository<ID, T extends Identifiable<ID>> implements IRepository<ID, T> {
    protected HashMap<ID, T> elements ;

    public MemoryRepository(){
        elements = new HashMap<>();
    }

    @Override
    public void add(ID id, T element)
    {
        elements.put(id, element);
    }
    @Override
    public void delete(ID id){
        elements.remove(id);
    }
    public void modify(ID id, T element){
        if(elements.containsKey(id))
            elements.put(id, element);
        else
            throw new RuntimeException("Element not found");


    }
    @Override
    public T findbyId(ID id){
        return elements.get(id);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(elements.values());
    }
}
