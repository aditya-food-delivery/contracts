package com.aditya.contracts.event;

public final class EventTypes {

    private EventTypes() {}

    // ================= CATALOG =================

    public static final String RESTAURANT_CREATED = "catalog.restaurant.created";
    public static final String RESTAURANT_UPDATED = "catalog.restaurant.updated";
    public static final String RESTAURANT_DELETED = "catalog.restaurant.deleted";

    public static final String MENU_CATEGORY_CREATED = "catalog.menu_category.created";
    public static final String MENU_CATEGORY_UPDATED = "catalog.menu_category.updated";
    public static final String MENU_CATEGORY_DELETED = "catalog.menu_category.deleted";

    public static final String MENU_ITEM_CREATED = "catalog.menu_item.created";
    public static final String MENU_ITEM_UPDATED = "catalog.menu_item.updated";
    public static final String MENU_ITEM_DELETED = "catalog.menu_item.deleted";

    public static final String VARIANT_CREATED = "catalog.variant.created";
    public static final String VARIANT_UPDATED = "catalog.variant.updated";
    public static final String VARIANT_DELETED = "catalog.variant.deleted";

    public static final String ADDON_GROUP_CREATED = "catalog.addon_group.created";
    public static final String ADDON_ITEM_CREATED = "catalog.addon_item.created";

    // ================= ORDER =================

    public static final String ORDER_CREATED = "order.created";
    public static final String ORDER_CONFIRMED = "order.confirmed";
    public static final String ORDER_FAILED = "order.failed";

    // ================= PAYMENT =================

    public static final String PAYMENT_INITIATED = "payment.initiated";
    public static final String PAYMENT_COMPLETED = "payment.completed";
    public static final String PAYMENT_FAILED = "payment.failed";
}