// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductAsAdminRequest} extends {@link RequestModel}
 *
 * <p>GetProductAsAdminRequest</p>
 */
public class GetProductAsAdminRequest extends Request {
    @Query
    @NameInMap("ProductId")
    @Validation(required = true)
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
         * The ID of the product.
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
