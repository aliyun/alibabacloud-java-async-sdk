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
 * {@link ModifyBasicAndBizItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBasicAndBizItemsResponseBody</p>
 */
public class ModifyBasicAndBizItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailedItemList")
    private FailedItemList failedItemList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyBasicAndBizItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.failedItemList = builder.failedItemList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBasicAndBizItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failedItemList
     */
    public FailedItemList getFailedItemList() {
        return this.failedItemList;
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
        private FailedItemList failedItemList; 
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
         * FailedItemList.
         */
        public Builder failedItemList(FailedItemList failedItemList) {
            this.failedItemList = failedItemList;
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

        public ModifyBasicAndBizItemsResponseBody build() {
            return new ModifyBasicAndBizItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBasicAndBizItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBasicAndBizItemsResponseBody</p>
     */
    public static class SkuIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sku")
        private java.util.List<String> sku;

        private SkuIdList(Builder builder) {
            this.sku = builder.sku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuIdList create() {
            return builder().build();
        }

        /**
         * @return sku
         */
        public java.util.List<String> getSku() {
            return this.sku;
        }

        public static final class Builder {
            private java.util.List<String> sku; 

            /**
             * Sku.
             */
            public Builder sku(java.util.List<String> sku) {
                this.sku = sku;
                return this;
            }

            public SkuIdList build() {
                return new SkuIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBasicAndBizItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBasicAndBizItemsResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("SkuIdList")
        private SkuIdList skuIdList;

        private Item(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.skuIdList = builder.skuIdList;
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
         * @return skuIdList
         */
        public SkuIdList getSkuIdList() {
            return this.skuIdList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private SkuIdList skuIdList; 

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
             * SkuIdList.
             */
            public Builder skuIdList(SkuIdList skuIdList) {
                this.skuIdList = skuIdList;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBasicAndBizItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyBasicAndBizItemsResponseBody</p>
     */
    public static class FailedItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private FailedItemList(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItemList create() {
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

            public FailedItemList build() {
                return new FailedItemList(this);
            } 

        } 

    }
}
