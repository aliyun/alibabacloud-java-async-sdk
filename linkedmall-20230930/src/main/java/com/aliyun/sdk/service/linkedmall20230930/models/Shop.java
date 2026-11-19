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
         * <p>The distributor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****09</p>
         */
        public Builder distributorId(String distributorId) {
            this.distributorId = distributorId;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48A34399-A72C-1E23-8388-7E63****E927</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>Children\&quot;s distribution shop</p>
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

        public Shop build() {
            return new Shop(this);
        } 

    } 

}
