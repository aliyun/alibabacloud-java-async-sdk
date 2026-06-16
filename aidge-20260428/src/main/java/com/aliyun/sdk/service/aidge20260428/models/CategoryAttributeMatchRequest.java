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
 * {@link CategoryAttributeMatchRequest} extends {@link RequestModel}
 *
 * <p>CategoryAttributeMatchRequest</p>
 */
public class CategoryAttributeMatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private java.util.List<String> imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sku")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sku;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CategoryAttributeMatchRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
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

    public static CategoryAttributeMatchRequest create() {
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
     * @return imageUrl
     */
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
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

    public static final class Builder extends Request.Builder<CategoryAttributeMatchRequest, Builder> {
        private String description; 
        private java.util.List<String> imageUrl; 
        private String itemSpec; 
        private String sku; 
        private String sourceCategory; 
        private String sourcePlatform; 
        private String targetPlatform; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CategoryAttributeMatchRequest request) {
            super(request);
            this.description = request.description;
            this.imageUrl = request.imageUrl;
            this.itemSpec = request.itemSpec;
            this.sku = request.sku;
            this.sourceCategory = request.sourceCategory;
            this.sourcePlatform = request.sourcePlatform;
            this.targetPlatform = request.targetPlatform;
            this.title = request.title;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(java.util.List<String> imageUrl) {
            String imageUrlShrink = shrink(imageUrl, "ImageUrl", "json");
            this.putBodyParameter("ImageUrl", imageUrlShrink);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder itemSpec(String itemSpec) {
            this.putBodyParameter("ItemSpec", itemSpec);
            this.itemSpec = itemSpec;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sku(String sku) {
            this.putBodyParameter("Sku", sku);
            this.sku = sku;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putBodyParameter("SourceCategory", sourceCategory);
            this.sourceCategory = sourceCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1688</p>
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putBodyParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>temu</p>
         */
        public Builder targetPlatform(String targetPlatform) {
            this.putBodyParameter("TargetPlatform", targetPlatform);
            this.targetPlatform = targetPlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试商品</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CategoryAttributeMatchRequest build() {
            return new CategoryAttributeMatchRequest(this);
        } 

    } 

}
