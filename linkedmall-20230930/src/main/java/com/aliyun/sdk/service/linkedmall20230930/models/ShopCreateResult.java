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
 * {@link ShopCreateResult} extends {@link TeaModel}
 *
 * <p>ShopCreateResult</p>
 */
public class ShopCreateResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("shopStatus")
    private String shopStatus;

    private ShopCreateResult(Builder builder) {
        this.shopId = builder.shopId;
        this.shopStatus = builder.shopStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopCreateResult create() {
        return builder().build();
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return shopStatus
     */
    public String getShopStatus() {
        return this.shopStatus;
    }

    public static final class Builder {
        private String shopId; 
        private String shopStatus; 

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * shopStatus.
         */
        public Builder shopStatus(String shopStatus) {
            this.shopStatus = shopStatus;
            return this;
        }

        public ShopCreateResult build() {
            return new ShopCreateResult(this);
        } 

    } 

}
