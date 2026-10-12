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
 * {@link CreateProductCategoryRequest} extends {@link RequestModel}
 *
 * <p>CreateProductCategoryRequest</p>
 */
public class CreateProductCategoryRequest extends Request {
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

    private CreateProductCategoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.icon = builder.icon;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateProductCategoryRequest, Builder> {
        private String description; 
        private HiMarketIcon icon; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductCategoryRequest request) {
            super(request);
            this.description = request.description;
            this.icon = request.icon;
            this.name = request.name;
        } 

        /**
         * <p>The description of the product category. Maximum length: 500 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Product category for AI-related capabilities</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The icon of the product category, which consists of the icon type and icon information fields.</p>
         */
        public Builder icon(HiMarketIcon icon) {
            this.putBodyParameter("icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>The name of the product category. Maximum length: 100 characters.</p>
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
        public CreateProductCategoryRequest build() {
            return new CreateProductCategoryRequest(this);
        } 

    } 

}
