// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TagResource} extends {@link TeaModel}
 *
 * <p>TagResource</p>
 */
public class TagResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("TagKey")
    private String tagKey;

    @com.aliyun.core.annotation.NameInMap("TagValue")
    private String tagValue;

    private TagResource(Builder builder) {
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResource create() {
        return builder().build();
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder {
        private String resourceId; 
        private String resourceType; 
        private String tagKey; 
        private String tagValue; 

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public TagResource build() {
            return new TagResource(this);
        } 

    } 

}
