// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("tagKey")
    private String tagKey;

    @com.aliyun.core.annotation.NameInMap("tagValue")
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
         * <p>The resource ID, which is the data catalog ID.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-0424965be0c240acb4159688c9e2c4b6</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type, which is fixed to CATALOGRESOURCE.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALOGRESOURCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>recommendation</p>
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
