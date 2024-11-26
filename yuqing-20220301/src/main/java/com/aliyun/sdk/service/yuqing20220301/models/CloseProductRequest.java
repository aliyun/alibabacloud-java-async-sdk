// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloseProductRequest} extends {@link RequestModel}
 *
 * <p>CloseProductRequest</p>
 */
public class CloseProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productInstance")
    private ProductInstance productInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CloseProductRequest(Builder builder) {
        super(builder);
        this.productInstance = builder.productInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productInstance
     */
    public ProductInstance getProductInstance() {
        return this.productInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<CloseProductRequest, Builder> {
        private ProductInstance productInstance; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(CloseProductRequest request) {
            super(request);
            this.productInstance = request.productInstance;
            this.requestId = request.requestId;
        } 

        /**
         * productInstance.
         */
        public Builder productInstance(ProductInstance productInstance) {
            this.putBodyParameter("productInstance", productInstance);
            this.productInstance = productInstance;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public CloseProductRequest build() {
            return new CloseProductRequest(this);
        } 

    } 

}
