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
 * {@link DeleteProductCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductCategoryRequest</p>
 */
public class DeleteProductCategoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("categoryId")
    private String categoryId;

    private DeleteProductCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    public static final class Builder extends Request.Builder<DeleteProductCategoryRequest, Builder> {
        private String categoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
        } 

        /**
         * <p>The ID of the product category to delete. You can obtain this ID from the categoryId field in the response of the CreateProductCategory operation. This parameter uses the same /himarket/v1/product-categories/{categoryId} path as the GetProductCategory, UpdateProductCategory, and DeleteProductCategory operations to locate the product category. On the product resource side, it corresponds to the Category ID member in the Categories (Product classification) section. Note: This is a path parameter and is required. The request URL cannot be constructed without it.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("categoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        @Override
        public DeleteProductCategoryRequest build() {
            return new DeleteProductCategoryRequest(this);
        } 

    } 

}
