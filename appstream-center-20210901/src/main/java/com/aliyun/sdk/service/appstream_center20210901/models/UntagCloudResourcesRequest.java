// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UntagCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagCloudResourcesRequest</p>
 */
public class UntagCloudResourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tagKeys;

    private UntagCloudResourcesRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagCloudResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tagKeys
     */
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagCloudResourcesRequest, Builder> {
        private java.util.List<String> resourceIds; 
        private String resourceType; 
        private java.util.List<String> tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagCloudResourcesRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. You do not need to specify this parameter when the resource type is tenant ID.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroupId</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of tags. System tags and custom tags are supported. You can specify up to 10 tags.</p>
         * <p>Enumerated values for system tags:</p>
         * <ul>
         * <li><code>System/Scheduler/GRAYSCALE</code>: canary release tag.</li>
         * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tag that prevents newly bound users in a delivery group from establishing connections.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder tagKeys(java.util.List<String> tagKeys) {
            this.putBodyParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagCloudResourcesRequest build() {
            return new UntagCloudResourcesRequest(this);
        } 

    } 

}
