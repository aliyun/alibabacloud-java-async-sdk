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
 * {@link GetDistributionProductResult} extends {@link TeaModel}
 *
 * <p>GetDistributionProductResult</p>
 */
public class GetDistributionProductResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<DistributionProduct> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDistributionProductResult(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.products = builder.products;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDistributionProductResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<DistributionProduct> products; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDistributionProductResult model) {
            this.code = model.code;
            this.message = model.message;
            this.products = model.products;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetDistributionProductResult build() {
            return new GetDistributionProductResult(this);
        } 

    } 

}
