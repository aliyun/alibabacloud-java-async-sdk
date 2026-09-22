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
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tag> tag;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
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
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> resourceId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
        } 

        /**
         * <p>The region ID. This parameter is required. Set this parameter to the ID of the region where the delivery group resides, such as <code>cn-hangzhou</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of resource IDs to which you want to bind tags. This parameter is required. Specify delivery group IDs. You can specify up to 50 IDs in a single request. Duplicate IDs are automatically deduplicated.</p>
         * <p><strong>All IDs must be existing delivery groups under the current Alibaba Cloud account.</strong> If any ID does not exist or does not belong to the current account, the entire request fails and the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned. No tags are bound to any resource.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type. This parameter is required. <strong>Currently, only delivery groups are supported.</strong> The value is case-insensitive. We recommend that you use uppercase letters.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>APPINSTANCEGROUP: China Office (Chinese: Wuying) delivery group.</li>
         * </ul>
         * <p>If you specify another value, the error code <code>InvalidResourceType.Invalid</code> is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APPINSTANCEGROUP</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of tags to bind. This parameter is required. You can specify up to 20 tags in a single request. Each tag must include both <code>Key</code> and <code>Value</code>.</p>
         * <ul>
         * <li>Tag keys in the same request must be unique. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
         * <li>If a tag key already exists on the resource, the tag value is updated to the value specified in the current request.</li>
         * <li>A maximum of 20 custom tags can be bound to a single resource. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
         * </ul>
         * <p>Tag keys that start with <code>System/</code> are China Office (Chinese: Wuying) system tags. Only the following values are supported, and the tag value can be only <code>true</code> or <code>false</code>:</p>
         * <ul>
         * <li><code>System/Scheduler/GRAYSCALE</code>: the canary release tag for the delivery group.</li>
         * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: prevents newly bound users from establishing connections to the delivery group.</li>
         * </ul>
         * <p>If you specify other tag keys that start with <code>System/</code>, the error code <code>InvalidTag.SystemTagKeyInvalid</code> or <code>InvalidTag.SystemKeyNotAllow</code> is returned.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link TagResourcesRequest} extends {@link TeaModel}
     *
     * <p>TagResourcesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. This parameter is required. The tag key must be 1 to 128 characters in length and is case-sensitive. The tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive) and cannot contain <code>http://</code> or <code>https://</code>. Letters, digits, spaces, and common punctuation marks are supported. If the tag key does not comply with the rules, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned.</p>
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
             * <p>The tag value. This parameter is required. The tag value must be 0 to 256 characters in length and is case-sensitive. An empty string is allowed. The tag value cannot contain <code>http://</code> or <code>https://</code>. If the tag value does not comply with the rules, the error code <code>InvalidTagPolicy.ValueInvalid</code> is returned.</p>
             * <p>If the tag key is a system tag, the tag value can be only <code>true</code> or <code>false</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>720p</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
