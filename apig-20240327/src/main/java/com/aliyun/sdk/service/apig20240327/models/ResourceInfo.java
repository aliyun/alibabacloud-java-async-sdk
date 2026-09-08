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
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-1nsu2d****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>test1023</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource type. Valid values: HttpApi, Operation, GatewayRoute, Gateway, and GatewayDomain.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpApi</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The resource version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
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
