// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TagResourcesInput} extends {@link TeaModel}
 *
 * <p>TagResourcesInput</p>
 */
public class TagResourcesInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Tag > tag;

    private TagResourcesInput(Builder builder) {
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesInput create() {
        return builder().build();
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
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
    public java.util.List < Tag > getTag() {
        return this.tag;
    }

    public static final class Builder {
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < Tag > tag; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceId(java.util.List < String > resourceId) {
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
         * <p>This parameter is required.</p>
         */
        public Builder tag(java.util.List < Tag > tag) {
            this.tag = tag;
            return this;
        }

        public TagResourcesInput build() {
            return new TagResourcesInput(this);
        } 

    } 

}
