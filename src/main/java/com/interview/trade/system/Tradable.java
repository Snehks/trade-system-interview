package com.interview.trade.system;

/**
 * Represents any item that can be traded between players.
 */
public interface Tradable {
    /**
     * @return The name of the tradable item.
     */
    String getName();

    /**
     * @return A unique identifier for the tradable item.
     */
    int getId();
}