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
 * {@link TagCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagCloudResourcesRequest</p>
 */
public class TagCloudResourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tags> tags;

    private TagCloudResourcesRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagCloudResourcesRequest create() {
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagCloudResourcesRequest, Builder> {
        private java.util.List<String> resourceIds; 
        private String resourceType; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(TagCloudResourcesRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
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
         * <p>The type of the cloud resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CenterImageId: center image ID.</li>
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
         * <p>The tags that you want to remove from the cloud resources. System and custom tags are supported.</p>
         * <ul>
         * <li><p>Valid values for system tags:</p>
         * <ul>
         * <li><code>System/Scheduler/GRAYSCALE</code>: canary tags.</li>
         * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: tags used to stop new users bound to the delivery group from establishing a connection.</li>
         * </ul>
         * </li>
         * <li><p>You can create up to 20 custom tags.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each tag key on a resource can have only one tag value. If you create a tag that has the same key as an existing tag, the value of the existing tag is overwritten.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagCloudResourcesRequest build() {
            return new TagCloudResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link TagCloudResourcesRequest} extends {@link TeaModel}
     *
     * <p>TagCloudResourcesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of a tag. The value must be 1 to 128 characters in length and is case-sensitive. The name must be 1 to 128 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Resolution</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of a tag. The value must be 1 to 128 characters in length and is case-sensitive. The name must be 1 to 128 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>720p</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
