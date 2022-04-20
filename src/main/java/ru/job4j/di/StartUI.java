package ru.job4j.di;

public class StartUI {

    private Store store;
    private ConsoleInput in;

    public StartUI(Store store, ConsoleInput in) {
        this.store = store;
        this.in = in;
    }

    public void add() {
        store.add(in.askStr());
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}