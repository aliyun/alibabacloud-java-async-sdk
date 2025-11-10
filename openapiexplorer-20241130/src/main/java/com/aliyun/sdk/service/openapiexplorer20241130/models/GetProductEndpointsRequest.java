// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetProductEndpointsRequest} extends {@link RequestModel}
 *
 * <p>GetProductEndpointsRequest</p>
 */
public class GetProductEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private GetProductEndpointsRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductEndpointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<GetProductEndpointsRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(GetProductEndpointsRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        @Override
        public GetProductEndpointsRequest build() {
            return new GetProductEndpointsRequest(this);
        } 

    } 

}
