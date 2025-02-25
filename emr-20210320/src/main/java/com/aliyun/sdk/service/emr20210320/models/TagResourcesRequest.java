// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tag> tags;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
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
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> resourceIds; 
        private String resourceType; 
        private java.util.List<Tag> tags; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the region in which you want to create the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of resource IDs. Valid values of N: 1 to 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of the resource to which the tag belongs. Valid values:</p>
         * <ul>
         * <li>cluster: cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[null]</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
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
