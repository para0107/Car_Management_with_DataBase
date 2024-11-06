package filter;

public interface AbstractFilter <T> {
    public boolean accept(T t);
}
