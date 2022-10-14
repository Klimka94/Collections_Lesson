import java.util.Arrays;

public class NewArrayList<T> {
    private T[] list;//Создание массива.
    private int size;//Здесь можно задать размер массива.
    private final int DEFAULT_CAPACITY = 10;//Стандартный размер массива, он равен 10 эл-там.

    public NewArrayList(int capacity){//Конструктор для задания кастомных размеров массива.
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public NewArrayList(){//Конструктор по умолчанию (с размером 10).
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty(){//Проверка массива на заполненность.
        return size == 0;
    }

    public void add(T item) {//Добавление элемента в массив.
        list[size++] = item;
    }

    public void add(int index, T item){//Тоже добавление элемента в массив, но по индексу.
        for (int i = size; i > index; i--) {
            list[i] = list[i-1];
        }
    }

    public void delete(int index){//Удаление элемента из массива по его индексу.
        for (int i = index; i < size; i++){
            list[i] = list[i+1];
        }
    }

    public void delete(T item){//Удаление элемента из массива по его значению.
        int position = index(item);
        if (position < 0) {
            return;
        }
        delete(position);
    }

    public void display() {//Выведение элементов массива на экран.
        for (T elem: list){
            System.out.println(elem + " ");
        }
    }

    public int index(T item){//Получение индекса элемента массива через его значение.
        if (item == null)
            return -1;

        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {

                return i;
            }
        }
        return -1;
    }

    public T get(int index) {//Геттер (получает значение ячейки по её номеру).
            if (index > 0 || index >=  size){
                throw new IndexOutOfBoundsException();
            }
        return list[index];
    }

    public void set(int index, T item) {//Сеттер (устанавливает значение ячейки по её индексу)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        list[index] = item;
    }

    @Override
    public String toString() {//Красиво выводит массив через sout.
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}
