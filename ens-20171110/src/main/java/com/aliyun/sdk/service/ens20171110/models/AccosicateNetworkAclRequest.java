// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AccosicateNetworkAclRequest} extends {@link RequestModel}
 *
 * <p>AccosicateNetworkAclRequest</p>
 */
public class AccosicateNetworkAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Resource> resource;

    private AccosicateNetworkAclRequest(Builder builder) {
        super(builder);
        this.networkAclId = builder.networkAclId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccosicateNetworkAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return resource
     */
    public java.util.List<Resource> getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<AccosicateNetworkAclRequest, Builder> {
        private String networkAclId; 
        private java.util.List<Resource> resource; 

        private Builder() {
            super();
        } 

        private Builder(AccosicateNetworkAclRequest request) {
            super(request);
            this.networkAclId = request.networkAclId;
            this.resource = request.resource;
        } 

        /**
         * <p>The ID of the network ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0sp****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * <p>The type of resource with which you want to associate the network ACL.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resource(java.util.List<Resource> resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        @Override
        public AccosicateNetworkAclRequest build() {
            return new AccosicateNetworkAclRequest(this);
        } 

    } 

    /**
     * 
     * {@link AccosicateNetworkAclRequest} extends {@link TeaModel}
     *
     * <p>AccosicateNetworkAclRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private Resource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
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

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            /**
             * <p>The ID of the associated resource.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the associated resource. Set the value to <strong>Network</strong>.</p>
             * <p>Valid values of <strong>N</strong>: 0 to 29. You can associate a network ACL with at most 30 resources.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Network</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
