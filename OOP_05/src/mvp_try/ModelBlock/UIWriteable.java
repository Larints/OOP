package mvp_try.ModelBlock;

public interface UIWriteable <T> {

    void write(String path, T object);

    Object read(String path);
}
