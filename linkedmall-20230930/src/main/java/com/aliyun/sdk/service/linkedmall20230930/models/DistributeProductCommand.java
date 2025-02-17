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
 * {@link DistributeProductCommand} extends {@link TeaModel}
 *
 * <p>DistributeProductCommand</p>
 */
public class DistributeProductCommand extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lmShopId")
    private String lmShopId;

    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<DistributionProduct> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestTime")
    private String requestTime;

    @com.aliyun.core.annotation.NameInMap("requestUser")
    private String requestUser;

    private DistributeProductCommand(Builder builder) {
        this.lmShopId = builder.lmShopId;
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.requestTime = builder.requestTime;
        this.requestUser = builder.requestUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistributeProductCommand create() {
        return builder().build();
    }

    /**
     * @return lmShopId
     */
    public String getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return products
     */
    public java.util.List<DistributionProduct> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTime
     */
    public String getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return requestUser
     */
    public String getRequestUser() {
        return this.requestUser;
    }

    public static final class Builder {
        private String lmShopId; 
        private java.util.List<DistributionProduct> products; 
        private String requestId; 
        private String requestTime; 
        private String requestUser; 

        /**
         * lmShopId.
         */
        public Builder lmShopId(String lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * products.
         */
        public Builder products(java.util.List<DistributionProduct> products) {
            this.products = products;
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
         * requestTime.
         */
        public Builder requestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        /**
         * requestUser.
         */
        public Builder requestUser(String requestUser) {
            this.requestUser = requestUser;
            return this;
        }

        public DistributeProductCommand build() {
            return new DistributeProductCommand(this);
        } 

    } 

}
