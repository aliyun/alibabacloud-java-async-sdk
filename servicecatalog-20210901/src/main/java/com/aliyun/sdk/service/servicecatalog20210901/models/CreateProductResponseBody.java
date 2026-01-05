// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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

    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    private String productVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProductResponseBody(Builder builder) {
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
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
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String productId; 
        private String productVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProductResponseBody model) {
            this.productId = model.productId;
            this.productVersionId = model.productVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>The ID of the product version.</p>
         * 
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
         */
        public Builder productVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
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
