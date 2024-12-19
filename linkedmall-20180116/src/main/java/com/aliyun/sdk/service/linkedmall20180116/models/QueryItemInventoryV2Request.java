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
 * {@link QueryItemInventoryV2Request} extends {@link RequestModel}
 *
 * <p>QueryItemInventoryV2Request</p>
 */
public class QueryItemInventoryV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DivisionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String divisionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ItemList> itemList;

    private QueryItemInventoryV2Request(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.divisionCode = builder.divisionCode;
        this.ip = builder.ip;
        this.itemList = builder.itemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemInventoryV2Request create() {
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
    public java.util.List<ItemList> getItemList() {
        return this.itemList;
    }

    public static final class Builder extends Request.Builder<QueryItemInventoryV2Request, Builder> {
        private String bizId; 
        private String divisionCode; 
        private String ip; 
        private java.util.List<ItemList> itemList; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemInventoryV2Request request) {
            super(request);
            this.bizId = request.bizId;
            this.divisionCode = request.divisionCode;
            this.ip = request.ip;
            this.itemList = request.itemList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******01</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>520300</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder itemList(java.util.List<ItemList> itemList) {
            this.putQueryParameter("ItemList", itemList);
            this.itemList = itemList;
            return this;
        }

        @Override
        public QueryItemInventoryV2Request build() {
            return new QueryItemInventoryV2Request(this);
        } 

    } 

    /**
     * 
     * {@link QueryItemInventoryV2Request} extends {@link TeaModel}
     *
     * <p>QueryItemInventoryV2Request</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("SkuIdList")
        private java.util.List<Long> skuIdList;

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
        public java.util.List<Long> getSkuIdList() {
            return this.skuIdList;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private java.util.List<Long> skuIdList; 

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
            public Builder skuIdList(java.util.List<Long> skuIdList) {
                this.skuIdList = skuIdList;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
