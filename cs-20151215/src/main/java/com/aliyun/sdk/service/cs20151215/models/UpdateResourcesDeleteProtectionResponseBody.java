// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link UpdateResourcesDeleteProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourcesDeleteProtectionResponseBody</p>
 */
public class UpdateResourcesDeleteProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("protection")
    private String protection;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resource_type")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List<String> resources;

    private UpdateResourcesDeleteProtectionResponseBody(Builder builder) {
        this.namespace = builder.namespace;
        this.protection = builder.protection;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourcesDeleteProtectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return protection
     */
    public String getProtection() {
        return this.protection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String namespace; 
        private String protection; 
        private String requestId; 
        private String resourceType; 
        private java.util.List<String> resources; 

        /**
         * <p>The namespace to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Indicates the status of deletion protection. A value of true indicates that deletion protection is enabled and a value of false indicates that deletion protection is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder protection(String protection) {
            this.protection = protection;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0527ac9a-c899-4341-a21a-xxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of resource for which deletion protection is enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaces</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of resources whose deletion protection status is updated.</p>
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public UpdateResourcesDeleteProtectionResponseBody build() {
            return new UpdateResourcesDeleteProtectionResponseBody(this);
        } 

    } 

}
