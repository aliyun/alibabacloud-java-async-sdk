// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteProductRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductRequest</p>
 */
public class DeleteProductRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    private DeleteProductRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProductRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * <p>The ID of the API product to delete. You can obtain this ID from the productId in the CreateProduct response or the productId of an item in the ListProducts response. This ID is used in the /himarket/v1/products/{productId} path to locate the API product, which is the same path used by GetProduct, UpdateProduct, and DeleteProduct.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public DeleteProductRequest build() {
            return new DeleteProductRequest(this);
        } 

    } 

}
