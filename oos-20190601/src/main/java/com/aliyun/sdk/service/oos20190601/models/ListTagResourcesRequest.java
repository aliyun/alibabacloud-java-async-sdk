// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.Map<String, ?> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public java.util.Map<String, ?> getResourceIds() {
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
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String nextToken; 
        private String regionId; 
        private java.util.Map<String, ?> resourceIds; 
        private String resourceType; 
        private java.util.Map<String, ?> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <p>The IDs of resources. The number of resource IDs ranges from 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;templateNam1&quot;,&quot;templateName2&quot;]</p>
         */
        public Builder resourceIds(java.util.Map<String, ?> resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "json");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of the resource. Valid values: template execution</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

}
