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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateMetaCategoryRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateMetaCategoryRequest, Builder> {
        private String comment; 
        private String name; 
        private Long parentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetaCategoryRequest request) {
            super(request);
            this.comment = request.comment;
            this.name = request.name;
            this.parentId = request.parentId;
            this.regionId = request.regionId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
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
        public CreateMetaCategoryRequest build() {
            return new CreateMetaCategoryRequest(this);
        } 

    } 

}
