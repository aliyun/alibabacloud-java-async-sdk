// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetaCategoryRequest</p>
 */
public class DeleteMetaCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long categoryId;

    private DeleteMetaCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetaCategoryRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMetaCategoryRequest, Builder> {
        private String regionId; 
        private Long categoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetaCategoryRequest request) {
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
         * The ID of the category.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        @Override
        public DeleteMetaCategoryRequest build() {
            return new DeleteMetaCategoryRequest(this);
        } 

    } 

}
