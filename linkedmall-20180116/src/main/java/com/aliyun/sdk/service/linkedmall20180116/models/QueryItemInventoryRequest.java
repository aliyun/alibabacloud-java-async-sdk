// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemInventoryRequest} extends {@link RequestModel}
 *
 * <p>QueryItemInventoryRequest</p>
 */
public class QueryItemInventoryRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("DivisionCode")
    @Validation(required = true)
    private String divisionCode;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("ItemList")
    @Validation(required = true)
    private java.util.List < ItemList> itemList;

    private QueryItemInventoryRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.divisionCode = builder.divisionCode;
        this.ip = builder.ip;
        this.itemList = builder.itemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemInventoryRequest create() {
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
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return itemList
     */
    public java.util.List < ItemList> getItemList() {
        return this.itemList;
    }

    public static final class Builder extends Request.Builder<QueryItemInventoryRequest, Builder> {
        private String bizId; 
        private String divisionCode; 
        private String ip; 
        private java.util.List < ItemList> itemList; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemInventoryRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.divisionCode = request.divisionCode;
            this.ip = request.ip;
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
         * DivisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putQueryParameter("DivisionCode", divisionCode);
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
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
        public QueryItemInventoryRequest build() {
            return new QueryItemInventoryRequest(this);
        } 

    } 

    public static class ItemList extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("SkuIdList")
        private java.util.List < Integer > skuIdList;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.skuIdList = builder.skuIdList;
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
         * @return skuIdList
         */
        public java.util.List < Integer > getSkuIdList() {
            return this.skuIdList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private java.util.List < Integer > skuIdList; 

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
            public Builder skuIdList(java.util.List < Integer > skuIdList) {
                this.skuIdList = skuIdList;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
