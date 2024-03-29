// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCategoryRequest} extends {@link RequestModel}
 *
 * <p>AddCategoryRequest</p>
 */
public class AddCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CateName")
    @Validation(required = true)
    private String cateName;

    @Query
    @NameInMap("ParentId")
    private Long parentId;

    @Query
    @NameInMap("Type")
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
         * CateName.
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * Type.
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
