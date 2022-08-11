// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetaCategoryRequest</p>
 */
public class DeleteMetaCategoryRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteMetaCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.regionId = builder.regionId;
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
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteMetaCategoryRequest, Builder> {
        private Long categoryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetaCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.regionId = request.regionId;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteMetaCategoryRequest build() {
            return new DeleteMetaCategoryRequest(this);
        } 

    } 

}
