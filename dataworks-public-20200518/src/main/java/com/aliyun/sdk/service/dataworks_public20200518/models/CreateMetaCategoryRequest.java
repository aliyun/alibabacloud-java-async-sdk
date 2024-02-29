// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>CreateMetaCategoryRequest</p>
 */
public class CreateMetaCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ParentId")
    private Long parentId;

    private CreateMetaCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.name = builder.name;
        this.parentId = builder.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetaCategoryRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    public static final class Builder extends Request.Builder<CreateMetaCategoryRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String name; 
        private Long parentId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetaCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.name = request.name;
            this.parentId = request.parentId;
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
         * The remarks of the category.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The name of the category.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the parent category.
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        @Override
        public CreateMetaCategoryRequest build() {
            return new CreateMetaCategoryRequest(this);
        } 

    } 

}
