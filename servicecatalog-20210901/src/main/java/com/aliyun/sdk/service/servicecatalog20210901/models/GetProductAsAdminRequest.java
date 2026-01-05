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
 * {@link GetProductAsAdminRequest} extends {@link RequestModel}
 *
 * <p>GetProductAsAdminRequest</p>
 */
public class GetProductAsAdminRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    private GetProductAsAdminRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductAsAdminRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<GetProductAsAdminRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(GetProductAsAdminRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * <p>The ID of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public GetProductAsAdminRequest build() {
            return new GetProductAsAdminRequest(this);
        } 

    } 

}
