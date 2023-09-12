// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShopPageDataResult} extends {@link TeaModel}
 *
 * <p>ShopPageDataResult</p>
 */
public class ShopPageDataResult extends TeaModel {
    @NameInMap("channelSupplierId")
    private String channelSupplierId;

    @NameInMap("endDate")
    private String endDate;

    @NameInMap("shopId")
    private String shopId;

    @NameInMap("shopName")
    private String shopName;

    @NameInMap("shopType")
    private String shopType;

    @NameInMap("startDate")
    private String startDate;

    @NameInMap("status")
    private String status;

    private ShopPageDataResult(Builder builder) {
        this.channelSupplierId = builder.channelSupplierId;
        this.endDate = builder.endDate;
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
     * @return channelSupplierId
     */
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
        private String channelSupplierId; 
        private String endDate; 
        private String shopId; 
        private String shopName; 
        private String shopType; 
        private String startDate; 
        private String status; 

        /**
         * channelSupplierId.
         */
        public Builder channelSupplierId(String channelSupplierId) {
            this.channelSupplierId = channelSupplierId;
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
