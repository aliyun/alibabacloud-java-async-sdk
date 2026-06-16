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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个测试商品描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ItemSpec.
         */
        public Builder itemSpec(String itemSpec) {
            this.putQueryParameter("ItemSpec", itemSpec);
            this.itemSpec = itemSpec;
            return this;
        }

        /**
         * Sku.
         */
        public Builder sku(String sku) {
            this.putQueryParameter("Sku", sku);
            this.sku = sku;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>家居用品</p>
         */
        public Builder sourceCategory(String sourceCategory) {
            this.putQueryParameter("SourceCategory", sourceCategory);
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
            this.putQueryParameter("SourcePlatform", sourcePlatform);
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
            this.putQueryParameter("TargetPlatform", targetPlatform);
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
