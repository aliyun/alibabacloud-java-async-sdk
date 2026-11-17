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
 * {@link UpdateCategoryProductsRequest} extends {@link RequestModel}
 *
 * <p>UpdateCategoryProductsRequest</p>
 */
public class UpdateCategoryProductsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("categoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productIds")
    private java.util.List<String> productIds;

    private UpdateCategoryProductsRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.action = builder.action;
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCategoryProductsRequest create() {
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

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public static final class Builder extends Request.Builder<UpdateCategoryProductsRequest, Builder> {
        private String categoryId; 
        private String action; 
        private java.util.List<String> productIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCategoryProductsRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.action = request.action;
            this.productIds = request.productIds;
        } 

        /**
         * <p>The product category ID. It specifies which API products to add or remove. Product categories are created by calling CreateProductCategory and can be queried by calling ListProductCategories. This parameter uses the same /himarket/v1/product-categories/{categoryId} identifier as GetProductCategory, UpdateProductCategory, and DeleteProductCategory.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("categoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The direction of this batch operation. It specifies whether to add the API products in productIds to the category or remove these API products from the category. The set of valid values is not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>action-xxxxxxxx</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>The list of API product IDs to process. Each element is a primary ID of the Product resource.</p>
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.putBodyParameter("productIds", productIds);
            this.productIds = productIds;
            return this;
        }

        @Override
        public UpdateCategoryProductsRequest build() {
            return new UpdateCategoryProductsRequest(this);
        } 

    } 

}
