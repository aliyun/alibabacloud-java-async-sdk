// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableCheckProductRequest} extends {@link RequestModel}
 *
 * <p>EnableCheckProductRequest</p>
 */
public class EnableCheckProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private EnableCheckProductRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCheckProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<EnableCheckProductRequest, Builder> {
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(EnableCheckProductRequest request) {
            super(request);
            this.productType = request.productType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public EnableCheckProductRequest build() {
            return new EnableCheckProductRequest(this);
        } 

    } 

}
