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
 * {@link UpdateProductCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductCategoryRequest</p>
 */
public class UpdateProductCategoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("categoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("icon")
    private HiMarketIcon icon;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String name;

    private UpdateProductCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.description = builder.description;
        this.icon = builder.icon;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductCategoryRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return icon
     */
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateProductCategoryRequest, Builder> {
        private String categoryId; 
        private String description; 
        private HiMarketIcon icon; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.description = request.description;
            this.icon = request.icon;
            this.name = request.name;
        } 

        /**
         * <p>The ID of the product category. This parameter is used to specify the product category to update. You can obtain the ID from the data.categoryId field in the CreateProductCategory response, the data.categoryId field in the GetProductCategory response, or the categoryId field of an item in the ListProductCategories response.</p>
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
         * <p>The description of the product category. The description can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Product category that includes AI-related capabilities</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The icon of the product category. The icon consists of two fields: icon type (type) and icon information (value).</p>
         */
        public Builder icon(HiMarketIcon icon) {
            this.putBodyParameter("icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>The name of the product category. The name can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-capabilities</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateProductCategoryRequest build() {
            return new UpdateProductCategoryRequest(this);
        } 

    } 

}
