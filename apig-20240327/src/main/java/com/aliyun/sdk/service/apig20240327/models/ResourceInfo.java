// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ResourceInfo} extends {@link TeaModel}
 *
 * <p>ResourceInfo</p>
 */
public class ResourceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("resourceVersion")
    private String resourceVersion;

    private ResourceInfo(Builder builder) {
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.resourceVersion = builder.resourceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInfo create() {
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public static final class Builder {
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String resourceVersion; 

        private Builder() {
        } 

        private Builder(ResourceInfo model) {
            this.resourceId = model.resourceId;
            this.resourceName = model.resourceName;
            this.resourceType = model.resourceType;
            this.resourceVersion = model.resourceVersion;
        } 

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * resourceVersion.
         */
        public Builder resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public ResourceInfo build() {
            return new ResourceInfo(this);
        } 

    } 

}
