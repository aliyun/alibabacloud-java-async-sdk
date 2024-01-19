// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSupplierNewItemsRequest} extends {@link RequestModel}
 *
 * <p>AddSupplierNewItemsRequest</p>
 */
public class AddSupplierNewItemsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ItemList")
    private java.util.List < ItemList> itemList;

    private AddSupplierNewItemsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemList = builder.itemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSupplierNewItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return itemList
     */
    public java.util.List < ItemList> getItemList() {
        return this.itemList;
    }

    public static final class Builder extends Request.Builder<AddSupplierNewItemsRequest, Builder> {
        private String bizId; 
        private java.util.List < ItemList> itemList; 

        private Builder() {
            super();
        } 

        private Builder(AddSupplierNewItemsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemList = request.itemList;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List < ItemList> itemList) {
            this.putQueryParameter("ItemList", itemList);
            this.itemList = itemList;
            return this;
        }

        @Override
        public AddSupplierNewItemsRequest build() {
            return new AddSupplierNewItemsRequest(this);
        } 

    } 

    public static class ItemList extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("SkuList")
        private java.util.List < Integer > skuList;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.skuList = builder.skuList;
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
         * @return skuList
         */
        public java.util.List < Integer > getSkuList() {
            return this.skuList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private java.util.List < Integer > skuList; 

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
            public Builder skuList(java.util.List < Integer > skuList) {
                this.skuList = skuList;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
