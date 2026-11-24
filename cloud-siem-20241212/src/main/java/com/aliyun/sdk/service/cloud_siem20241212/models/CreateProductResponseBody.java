// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateProductResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductResponseBody</p>
 */
public class CreateProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProductResponseBody(Builder builder) {
        this.productId = builder.productId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String productId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProductResponseBody model) {
            this.productId = model.productId;
            this.requestId = model.requestId;
        } 

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProductResponseBody build() {
            return new CreateProductResponseBody(this);
        } 

    } 

}
