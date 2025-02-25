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
 * {@link ShopStatusChangeRequest} extends {@link RequestModel}
 *
 * <p>ShopStatusChangeRequest</p>
 */
public class ShopStatusChangeRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("shopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("shopStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopStatus;

    private ShopStatusChangeRequest(Builder builder) {
        super(builder);
        this.shopId = builder.shopId;
        this.shopStatus = builder.shopStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopStatusChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ShopStatusChangeRequest, Builder> {
        private String shopId; 
        private String shopStatus; 

        private Builder() {
            super();
        } 

        private Builder(ShopStatusChangeRequest request) {
            super(request);
            this.shopId = request.shopId;
            this.shopStatus = request.shopStatus;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKING</p>
         */
        public Builder shopStatus(String shopStatus) {
            this.shopStatus = shopStatus;
            return this;
        }

        @Override
        public ShopStatusChangeRequest build() {
            return new ShopStatusChangeRequest(this);
        } 

    } 

}
