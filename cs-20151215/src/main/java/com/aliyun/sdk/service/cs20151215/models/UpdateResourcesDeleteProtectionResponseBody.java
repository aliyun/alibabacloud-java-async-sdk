// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > resources;

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
    public java.util.List < String > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String namespace; 
        private String protection; 
        private String requestId; 
        private String resourceType; 
        private java.util.List < String > resources; 

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * protection.
         */
        public Builder protection(String protection) {
            this.protection = protection;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resource_type.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List < String > resources) {
            this.resources = resources;
            return this;
        }

        public UpdateResourcesDeleteProtectionResponseBody build() {
            return new UpdateResourcesDeleteProtectionResponseBody(this);
        } 

    } 

}
