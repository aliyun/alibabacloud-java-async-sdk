// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TagResource model) {
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
            this.tagKey = model.tagKey;
            this.tagValue = model.tagValue;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:****:functions/demo</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the resource type.</p>
         * <p>The function type in Function Compute 3.0 is ALIYUN::FC::FUNCTION, which is abbreviated as &quot;function&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
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
