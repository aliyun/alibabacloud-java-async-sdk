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
 * {@link GetAssetCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetAssetCategoryRequest</p>
 */
public class GetAssetCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    private GetAssetCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetCategoryRequest create() {
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

    public static final class Builder extends Request.Builder<GetAssetCategoryRequest, Builder> {
        private String regionId; 
        private Long categoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
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
         * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
         * <ul>
         * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of the CategoryId response parameter.</li>
         * <li>When you query the category list by calling the ListAssetCategories operation, the category ID is the value of the CategoryId parameter in the corresponding returned entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        @Override
        public GetAssetCategoryRequest build() {
            return new GetAssetCategoryRequest(this);
        } 

    } 

}
