// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link CategoryMatchRequest} extends {@link RequestModel}
 *
 * <p>CategoryMatchRequest</p>
 */
public class CategoryMatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemSpec")
    private String itemSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sku")
    private String sku;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CategoryMatchRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.itemSpec = builder.itemSpec;
        this.sku = builder.sku;
        this.sourceCategory = builder.sourceCategory;
        this.sourcePlatform = builder.sourcePlatform;
        this.targetPlatform = builder.targetPlatform;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryMatchRequest create() {
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
     * @return itemSpec
     */
    public String getItemSpec() {
        return this.itemSpec;
    }

    /**
     * @return sku
     */
    public String getSku() {
        return this.sku;
    }

    /**
     * @return sourceCategory
     */
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    /**
     * @return sourcePlatform
     */
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * @return targetPlatform
     */
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CategoryMatchRequest, Builder> {
        private String description; 
        private String itemSpec; 
        private String sku; 
        private String sourceCategory; 
        private String sourcePlatform; 
        private String targetPlatform; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CategoryMatchRequest request) {
            super(request);
            this.description = request.description;
            this.itemSpec = request.itemSpec;
            this.sku = request.sku;
            this.sourceCategory = request.sourceCategory;
            this.sourcePlatform = request.sourcePlatform;
            this.targetPlatform = request.targetPlatform;
            this.title = request.title;
        } 

        /**
         * <p>The product description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Silk, Spring New Arrival</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The product attributes that describe the characteristics of the product, such as material. Provide the attribute names and values.</p>
         * 
         * <strong>example:</strong>
         * <p>Material:Polyester,Target Audience:General,Brand:AMASON PET</p>
         */
        public Builder itemSpec(String itemSpec) {
            this.putQueryParameter("ItemSpec", itemSpec);
            this.itemSpec = itemSpec;
            return this;
        }

        /**
         * <p>The SKU title of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>0:0:Color:Black(without locator);0:1:Color:Smart Locator(without collar);0:2:Color:Range Locator(without collar);0:3:Color:Blue(without locator);0:4:Color:Orange(without locator);0:5:Color:Pink(without locator);0:6:Color:Red(without locator);0:7:Color:Yellow(without locator);0:8:Color:Purple(without locator)</p>
         */
        public Builder sku(String sku) {
            this.putQueryParameter("Sku", sku);
            this.sku = sku;
            return this;
        }

        /**
         * <p>The product category on the source platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Clothing</p>
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * <p>The source platform from which products are sourced.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1688</p>
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putQueryParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * <p>The target listing platform. Currently, only temu is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>temu</p>
         */
        public Builder targetPlatform(String targetPlatform) {
            this.putQueryParameter("TargetPlatform", targetPlatform);
            this.targetPlatform = targetPlatform;
            return this;
        }

        /**
         * <p>The product title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Women\&quot;s Spring New Arrival Clothing</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CategoryMatchRequest build() {
            return new CategoryMatchRequest(this);
        } 

    } 

}
