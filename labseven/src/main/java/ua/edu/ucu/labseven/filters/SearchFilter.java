package ua.edu.ucu.labseven.filters;

import ua.edu.ucu.labseven.flowers.Item;

public interface SearchFilter {
    boolean match(Item flowerItem);
}
