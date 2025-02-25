// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenProductRequest} extends {@link RequestModel}
 *
 * <p>OpenProductRequest</p>
 */
public class OpenProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productInstance")
    private ProductInstance productInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private OpenProductRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.productInstance = builder.productInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<OpenProductRequest, Builder> {
        private String clientToken; 
        private ProductInstance productInstance; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(OpenProductRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.productInstance = request.productInstance;
            this.requestId = request.requestId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
        public OpenProductRequest build() {
            return new OpenProductRequest(this);
        } 

    } 

}
