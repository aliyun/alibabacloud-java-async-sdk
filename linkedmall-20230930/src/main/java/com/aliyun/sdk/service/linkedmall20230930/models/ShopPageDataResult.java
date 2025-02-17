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
 * {@link ShopPageDataResult} extends {@link TeaModel}
 *
 * <p>ShopPageDataResult</p>
 */
public class ShopPageDataResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cooperationShops")
    private java.util.List<CooperationShop> cooperationShops;

    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    private String purchaserId;

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

    private ShopPageDataResult(Builder builder) {
        this.cooperationShops = builder.cooperationShops;
        this.endDate = builder.endDate;
        this.purchaserId = builder.purchaserId;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
        this.shopType = builder.shopType;
        this.startDate = builder.startDate;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopPageDataResult create() {
        return builder().build();
    }

    /**
     * @return cooperationShops
     */
    public java.util.List<CooperationShop> getCooperationShops() {
        return this.cooperationShops;
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
        private String endDate; 
        private String purchaserId; 
        private String shopId; 
        private String shopName; 
        private String shopType; 
        private String startDate; 
        private String status; 

        /**
         * cooperationShops.
         */
        public Builder cooperationShops(java.util.List<CooperationShop> cooperationShops) {
            this.cooperationShops = cooperationShops;
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

        public ShopPageDataResult build() {
            return new ShopPageDataResult(this);
        } 

    } 

}
