// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInventoryOfItemsInBizItemGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInventoryOfItemsInBizItemGroupResponseBody</p>
 */
public class QueryInventoryOfItemsInBizItemGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ItemList")
    private java.util.List < ItemList> itemList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryInventoryOfItemsInBizItemGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.itemList = builder.itemList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInventoryOfItemsInBizItemGroupResponseBody create() {
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
    public java.util.List < ItemList> getItemList() {
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

    public static final class Builder {
        private String code; 
        private java.util.List < ItemList> itemList; 
        private String message; 
        private String requestId; 

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
        public Builder itemList(java.util.List < ItemList> itemList) {
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

        public QueryInventoryOfItemsInBizItemGroupResponseBody build() {
            return new QueryInventoryOfItemsInBizItemGroupResponseBody(this);
        } 

    } 

    public static class SkuList extends TeaModel {
        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("SkuId")
        private Long skuId;

        private SkuList(Builder builder) {
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private Integer quantity; 
            private Long skuId; 

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    public static class ItemList extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("SkuList")
        private java.util.List < SkuList> skuList;

        @NameInMap("TotalQuantity")
        private Long totalQuantity;

        @NameInMap("TotalSoldQuantity")
        private Long totalSoldQuantity;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.quantity = builder.quantity;
            this.skuList = builder.skuList;
            this.totalQuantity = builder.totalQuantity;
            this.totalSoldQuantity = builder.totalSoldQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
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
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return skuList
         */
        public java.util.List < SkuList> getSkuList() {
            return this.skuList;
        }

        /**
         * @return totalQuantity
         */
        public Long getTotalQuantity() {
            return this.totalQuantity;
        }

        /**
         * @return totalSoldQuantity
         */
        public Long getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Integer quantity; 
            private java.util.List < SkuList> skuList; 
            private Long totalQuantity; 
            private Long totalSoldQuantity; 

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
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SkuList.
             */
            public Builder skuList(java.util.List < SkuList> skuList) {
                this.skuList = skuList;
                return this;
            }

            /**
             * TotalQuantity.
             */
            public Builder totalQuantity(Long totalQuantity) {
                this.totalQuantity = totalQuantity;
                return this;
            }

            /**
             * TotalSoldQuantity.
             */
            public Builder totalSoldQuantity(Long totalSoldQuantity) {
                this.totalSoldQuantity = totalSoldQuantity;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
