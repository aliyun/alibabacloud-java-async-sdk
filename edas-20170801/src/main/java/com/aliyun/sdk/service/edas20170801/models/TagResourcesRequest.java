// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private String resourceIds;

    @Query
    @NameInMap("ResourceRegionId")
    @Validation(required = true)
    private String resourceRegionId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String resourceIds; 
        private String resourceRegionId; 
        private String resourceType; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * The IDs of the resources. You can specify up to 20 IDs in the format of a JSON array.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The region in which the resource resides.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   **application**: Enterprise Distributed Application Service (EDAS) application
         * *   **cluster**: EDAS cluster
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The key-value pairs. When you set this parameter, take note of the following limits:
         * <p>
         * 
         * *   You can add up to 20 tags to a resource.
         * *   The tag key cannot start with **aliyun** or **acs:**. It cannot contain **http://** or **https://**.
         * *   The tag key or tag value can be up to 128 characters in length, and can contain letters, digits, hyphens (-), commas (,), asterisks (\*), forward slashes (/), question marks (?), and colons (:).
         * *   Set this parameter to a JSON array.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

}
