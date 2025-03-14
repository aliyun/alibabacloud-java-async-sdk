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
 * {@link CreateAliPayUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateAliPayUrlRequest</p>
 */
public class CreateAliPayUrlRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("shopId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String shopId;

    private CreateAliPayUrlRequest(Builder builder) {
        super(builder);
        this.shopId = builder.shopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliPayUrlRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAliPayUrlRequest, Builder> {
        private String shopId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAliPayUrlRequest request) {
            super(request);
            this.shopId = request.shopId;
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

        @Override
        public CreateAliPayUrlRequest build() {
            return new CreateAliPayUrlRequest(this);
        } 

    } 

}
