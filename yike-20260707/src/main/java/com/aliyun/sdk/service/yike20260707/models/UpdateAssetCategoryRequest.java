// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link UpdateAssetCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssetCategoryRequest</p>
 */
public class UpdateAssetCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryName;

    private UpdateAssetCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssetCategoryRequest create() {
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
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    public static final class Builder extends Request.Builder<UpdateAssetCategoryRequest, Builder> {
        private String regionId; 
        private Long categoryId; 
        private String categoryName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssetCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.categoryName = request.categoryName;
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
         * <p>The category ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of CategoryId in the response.</li>
         * <li>When you query categories by calling the ListAssetCategories operation, the category ID is the value of CategoryId in the corresponding entry in the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The updated category name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scenery</p>
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        @Override
        public UpdateAssetCategoryRequest build() {
            return new UpdateAssetCategoryRequest(this);
        } 

    } 

}
