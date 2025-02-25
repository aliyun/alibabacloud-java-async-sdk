// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String cateName; 
        private Long parentId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cateName = request.cateName;
            this.parentId = request.parentId;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The category name.</p>
         * <ul>
         * <li>The value can be up to 64 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        /**
         * <p>The ID of the parent category.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The type of the category. Valid values:</p>
         * <ul>
         * <li>default: audio, video, and image files. This is the default value.</li>
         * <li>material: short video materials.</li>
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
