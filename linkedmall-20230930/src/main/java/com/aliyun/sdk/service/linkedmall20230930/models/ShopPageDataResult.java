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

        private Builder() {
        } 

        private Builder(ShopPageDataResult model) {
            this.cooperationShops = model.cooperationShops;
            this.endDate = model.endDate;
            this.purchaserId = model.purchaserId;
            this.shopId = model.shopId;
            this.shopName = model.shopName;
            this.shopType = model.shopType;
            this.startDate = model.startDate;
            this.status = model.status;
        } 

        /**
         * <p>The partner shops.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;shopId&quot;:&quot;22000019&quot;,&quot;cooperationCompanyId&quot;:&quot;11200003&quot;,&quot;cooperationShopId&quot;:&quot;21000026&quot;}]</p>
         */
        public Builder cooperationShops(java.util.List<CooperationShop> cooperationShops) {
            this.cooperationShops = cooperationShops;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-11T12:22:24.000+08:00</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The purchaser ID.</p>
         * 
         * <strong>example:</strong>
         * <p>PID56****2304</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>The shop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22****09</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>The shop name.</p>
         * 
         * <strong>example:</strong>
         * <p>Child seat distribution shop</p>
         */
        public Builder shopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        /**
         * <p>The shop type.</p>
         * 
         * <strong>example:</strong>
         * <p>DistributorQYG</p>
         */
        public Builder shopType(String shopType) {
            this.shopType = shopType;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-11T12:22:24.000+08:00</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The shop status.</p>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
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
