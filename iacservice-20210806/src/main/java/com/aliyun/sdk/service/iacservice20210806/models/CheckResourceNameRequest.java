// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckResourceNameRequest} extends {@link RequestModel}
 *
 * <p>CheckResourceNameRequest</p>
 */
public class CheckResourceNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private CheckResourceNameRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResourceNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CheckResourceNameRequest, Builder> {
        private String id; 
        private String name; 
        private String parentId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CheckResourceNameRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
        } 

        /**
         * id.
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CheckResourceNameRequest build() {
            return new CheckResourceNameRequest(this);
        } 

    } 

}
