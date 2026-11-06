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
 * {@link DeleteProductRefRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductRefRequest</p>
 */
public class DeleteProductRefRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    private DeleteProductRefRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductRefRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProductRefRequest, Builder> {
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductRefRequest request) {
            super(request);
            this.productId = request.productId;
        } 

        /**
         * <p>The ID of the API product. Specifies the API product from which to dissociate the API. You can obtain this ID from the productId field of a list item returned by ListProducts. This parameter shares the same /himarket/v1/products/{productId}/ref path with CreateProductRef and GetProductRef. This parameter only locates the API product and does not delete the API product itself. To delete an API product, call DeleteProduct.</p>
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
        public DeleteProductRefRequest build() {
            return new DeleteProductRefRequest(this);
        } 

    } 

}
