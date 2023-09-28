// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProductResponseBody</p>
 */
public class UpdateProductResponseBody extends TeaModel {
    @NameInMap("ProductId")
    private String productId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateProductResponseBody(Builder builder) {
        this.productId = builder.productId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductResponseBody create() {
        return builder().build();
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

        public UpdateProductResponseBody build() {
            return new UpdateProductResponseBody(this);
        } 

    } 

}
