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
         * <p>The resource IDs. You can specify up to 50 resource IDs. You do not need to specify this parameter if you set ResourceType to AliUid.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of the resource from which you want to remove tags.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AppId: app ID.</li>
         * <li>WyId: Alibaba Cloud Workspace user ID.</li>
         * <li>AppInstanceGroupId: delivery group ID.</li>
         * <li>AliUid: tenant ID.</li>
         * </ul>
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
         * <p>The tags that you want to remove from the cloud resources. System and custom tags are supported. You can specify up to 10 tags.</p>
         * <p>Valid values for system tags:</p>
         * <ul>
         * <li><code>System/Scheduler/GRAYSCALE</code>: canary tags.</li>
         * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tags used to stop new users bound to the delivery group from establishing a connection.</li>
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
