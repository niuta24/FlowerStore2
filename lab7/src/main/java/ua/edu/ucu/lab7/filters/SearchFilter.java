package ua.edu.ucu.lab7.filters;

import ua.edu.ucu.lab7.flowers.Item;

public interface SearchFilter {
    boolean match(Item flowerItem);
}
