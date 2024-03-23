package ru.lilmoon.task2;

import ru.lilmoon.task2.exceptions.UserNotFoundException;
import ru.lilmoon.task2.exceptions.ProductNotFoundException;
import ru.lilmoon.task2.exceptions.QuantityIsNegativeException;


import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Market {

    private static List<User> users;
    private List<Product> products;
    private static List<Order> orders;
    private static Holidays day = Holidays.NEW_YEAR;


    public Market() {
        users = new ArrayList<>(List.of(
                new User("Tom", 45, "11111",Gender.MALE),
                new User("Bob", 26, "22222",Gender.MALE),
                new User("Jim", 53, "33333",Gender.FEMALE),
                new User("John", 40, "44444",Gender.MALE)
        ));
        products = new ArrayList<>(List.of(
                new Product("Milk", 89),
                new Product("Bread", 26),
                new Product("Cheese", 125)
        ));
        orders = new ArrayList<>();
    }

    public int createOrder(User user) throws UserNotFoundException {
        if (!users.contains(user)) throw new UserNotFoundException("user not found, " + user);
        Order order = new Order(user);
        orders.add(order);
        return order.getId();
    }

    public Order addProductToOrder(int orderId, Product product, int quantity)
            throws ProductNotFoundException, QuantityIsNegativeException {
        if (!products.contains(product)) throw new ProductNotFoundException("product not found");
        if (quantity <= 0) throw new QuantityIsNegativeException("quantity of product is negative");
        Order order = orders.stream().filter(o -> o.getId() == orderId).findFirst().get();
        order.add(product, quantity);
        return order;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static void addUser(String name, int age, String phone, Gender gender) {
        users.add(new User(name, age, phone,gender));
    }

    public void setDiscount() {
        AtomicReference<Double> discount = new AtomicReference<>((double) 1);
        getOrders().forEach(x -> {
            if (day == Holidays.NEW_YEAR){
                discount.set(0.90);
                getOrders().forEach(p -> p.getProducts().keySet().forEach(y -> y.setPrice((int) (y.getPrice() * discount.get()))));
            } else if (x.getUser().getGender() == Gender.MALE && day == Holidays.FEBRUARY_23) {
                discount.set(0.925);
                getOrders().forEach(p -> p.getProducts().keySet().forEach(y -> y.setPrice((int) (y.getPrice() * discount.get()))));
            } else if (x.getUser().getGender() == Gender.FEMALE && day == Holidays.MARCH_8) {
                discount.set(0.925);
                getOrders().forEach(p -> p.getProducts().keySet().forEach(y -> y.setPrice((int) (y.getPrice() * discount.get()))));
            }
        });


    }


}