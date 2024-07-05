// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCategoryRequest} extends {@link RequestModel}
 *
 * <p>AddCategoryRequest</p>
 */
public class AddCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddCategoryRequest(Builder builder) {
        super(builder);
        this.cateName = builder.cateName;
        this.parentId = builder.parentId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateName
     */
    public String getCateName() {
        return this.cateName;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddCategoryRequest, Builder> {
        private String cateName; 
        private Long parentId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddCategoryRequest request) {
            super(request);
            this.cateName = request.cateName;
            this.parentId = request.parentId;
            this.type = request.type;
        } 

        /**
         * The name of the category.
         * <p>
         * 
         * *   The value can be up to 64 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        /**
         * The ID of the parent category.
         * <p>
         * 
         * To obtain the category ID, perform the following steps: Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). Choose **Configuration Management** > **Media Management** > **Categories**. On the **Audio and Video / Image Category** or **Short Video Material Category** tab, view the category ID.
         * 
         * > *   If you specify this parameter, the system creates a subcategory under the parent category. If you leave this parameter empty, the system creates a level 1 category.
         * >*   You cannot modify, add, or delete level 1 categories of short video materials. You can create only subcategories under level 1 categories for short video materials. This parameter is required when you set `Type` to `material`.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The type of the category. Valid values:
         * <p>
         * 
         * *   **default** (default): audio, video, and image files
         * *   **material**: short video materials
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddCategoryRequest build() {
            return new AddCategoryRequest(this);
        } 

    } 

}
