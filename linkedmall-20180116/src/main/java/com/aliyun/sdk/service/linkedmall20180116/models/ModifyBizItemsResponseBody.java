// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBizItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBizItemsResponseBody</p>
 */
public class ModifyBizItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FailedItemList")
    private FailedItemList failedItemList;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ModifyBizItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.failedItemList = builder.failedItemList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBizItemsResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private FailedItemList failedItemList; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ModifyBizItemsResponseBody build() {
            return new ModifyBizItemsResponseBody(this);
        } 

    } 

    public static class SkuIdList extends TeaModel {
        @NameInMap("Sku")
        private java.util.List < String > sku;

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
        public java.util.List < String > getSku() {
            return this.sku;
        }

        public static final class Builder {
            private java.util.List < String > sku; 

            /**
             * Sku.
             */
            public Builder sku(java.util.List < String > sku) {
                this.sku = sku;
                return this;
            }

            public SkuIdList build() {
                return new SkuIdList(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("SkuIdList")
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
    public static class FailedItemList extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

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
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public FailedItemList build() {
                return new FailedItemList(this);
            } 

        } 

    }
}
