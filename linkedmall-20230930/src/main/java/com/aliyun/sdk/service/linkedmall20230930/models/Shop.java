// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link Shop} extends {@link TeaModel}
 *
 * <p>Shop</p>
 */
public class Shop extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cooperationShops")
    private java.util.List<CooperationShop> cooperationShops;

    @com.aliyun.core.annotation.NameInMap("distributorId")
    private String distributorId;

    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("shopName")
    private String shopName;

    @com.aliyun.core.annotation.NameInMap("shopType")
    private String shopType;

    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private Shop(Builder builder) {
        this.cooperationShops = builder.cooperationShops;
        this.distributorId = builder.distributorId;
        this.endDate = builder.endDate;
        this.purchaserId = builder.purchaserId;
        this.requestId = builder.requestId;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
        this.shopType = builder.shopType;
        this.startDate = builder.startDate;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Shop create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cooperationShops
     */
    public java.util.List<CooperationShop> getCooperationShops() {
        return this.cooperationShops;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    /**
     * @return shopType
     */
    public String getShopType() {
        return this.shopType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<CooperationShop> cooperationShops; 
        private String distributorId; 
        private String endDate; 
        private String purchaserId; 
        private String requestId; 
        private String shopId; 
        private String shopName; 
        private String shopType; 
        private String startDate; 
        private String status; 

        private Builder() {
        } 

        private Builder(Shop model) {
            this.cooperationShops = model.cooperationShops;
            this.distributorId = model.distributorId;
            this.endDate = model.endDate;
            this.purchaserId = model.purchaserId;
            this.requestId = model.requestId;
            this.shopId = model.shopId;
            this.shopName = model.shopName;
            this.shopType = model.shopType;
            this.startDate = model.startDate;
            this.status = model.status;
        } 

        /**
         * cooperationShops.
         */
        public Builder cooperationShops(java.util.List<CooperationShop> cooperationShops) {
            this.cooperationShops = cooperationShops;
            return this;
        }

        /**
         * distributorId.
         */
        public Builder distributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * shopName.
         */
        public Builder shopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        /**
         * shopType.
         */
        public Builder shopType(String shopType) {
            this.shopType = shopType;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Shop build() {
            return new Shop(this);
        } 

    } 

}
