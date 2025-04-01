// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

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
    public String getResourceIds() {
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
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String regionId; 
        private String resourceIds; 
        private String resourceType; 
        private String tags; 

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
         * <p>application</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d42921c4-5433-4abd-8075-0e536f8b****&quot;]</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>[{&quot;key&quot;:&quot;k1&quot;,&quot;value&quot;:&quot;v1&quot;}]</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>[&quot;d42921c4-5433-4abd-8075-0e536f8b****&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;k1&quot;,&quot;value&quot;:&quot;v1&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

}
