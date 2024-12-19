// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemInventoryV2ResponseBody</p>
 */
public class QueryItemInventoryV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ItemList")
    private ItemList itemList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryItemInventoryV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemList = builder.itemList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemInventoryV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return itemList
     */
    public ItemList getItemList() {
        return this.itemList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private ItemList itemList; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ItemList.
         */
        public Builder itemList(ItemList itemList) {
            this.itemList = itemList;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryItemInventoryV2ResponseBody build() {
            return new QueryItemInventoryV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2ResponseBody</p>
     */
    public static class Inventory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        private Inventory(Builder builder) {
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inventory create() {
            return builder().build();
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private Long quantity; 

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            public Inventory build() {
                return new Inventory(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2ResponseBody</p>
     */
    public static class Sku extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inventory")
        private Inventory inventory;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        private Sku(Builder builder) {
            this.inventory = builder.inventory;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sku create() {
            return builder().build();
        }

        /**
         * @return inventory
         */
        public Inventory getInventory() {
            return this.inventory;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private Inventory inventory; 
            private Long skuId; 

            /**
             * Inventory.
             */
            public Builder inventory(Inventory inventory) {
                this.inventory = inventory;
                return this;
            }

            /**
             * <p>skuid</p>
             * 
             * <strong>example:</strong>
             * <p>482694857****</p>
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            public Sku build() {
                return new Sku(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2ResponseBody</p>
     */
    public static class SkuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sku")
        private java.util.List<Sku> sku;

        private SkuList(Builder builder) {
            this.sku = builder.sku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return sku
         */
        public java.util.List<Sku> getSku() {
            return this.sku;
        }

        public static final class Builder {
            private java.util.List<Sku> sku; 

            /**
             * Sku.
             */
            public Builder sku(java.util.List<Sku> sku) {
                this.sku = sku;
                return this;
            }

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2ResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("SkuList")
        private SkuList skuList;

        private Item(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.skuList = builder.skuList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return skuList
         */
        public SkuList getSkuList() {
            return this.skuList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private SkuList skuList; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * SkuList.
             */
            public Builder skuList(SkuList skuList) {
                this.skuList = skuList;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryItemInventoryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2ResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private ItemList(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
