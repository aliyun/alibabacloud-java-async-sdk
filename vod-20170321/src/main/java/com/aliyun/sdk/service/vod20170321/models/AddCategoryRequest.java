// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The category name.</p>
         * <ul>
         * <li>It can be up to 64 bytes in length.</li>
         * <li>It is encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Comedy</p>
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        /**
         * <p>The ID of the parent category.</p>
         * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> &gt; <strong>Audio/Video/Image Categories</strong> or <strong>Short Video Material Categories</strong> to view the category ID.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify this parameter, a subcategory is created under the specified parent category. If you do not specify this parameter, a level-1 category is created.</li>
         * <li>All level-1 categories for short video materials are built-in and cannot be modified, added, or deleted. You can only create subcategories under level-1 categories. Therefore, this parameter is required when <code>Type</code> is set to <code>material</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100012****</p>
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The category type. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: audio, video, and image categories. This is the default value.</li>
         * <li><strong>material</strong>: short video material categories.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
