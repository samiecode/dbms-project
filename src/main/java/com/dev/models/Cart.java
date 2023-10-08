package com.dev.models;

import com.dev.services.KeyGenerator;

public class Cart {
    private long cartId;
    private long userId;
    private boolean status;
//    private long addressId; TODO: do this after changing the db schema.


    public Cart(long userId, boolean status) {
        this.userId = userId;
        this.status = status;
        this.cartId = KeyGenerator.generateKey();
    }

    public Cart() {
        this.cartId = KeyGenerator.generateKey();
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
