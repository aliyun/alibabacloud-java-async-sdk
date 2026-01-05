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
 * {@link DeleteProductRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductRequest</p>
 */
public class DeleteProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
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
         * <p>The ID of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public DeleteProductRequest build() {
            return new DeleteProductRequest(this);
        } 

    } 

}
