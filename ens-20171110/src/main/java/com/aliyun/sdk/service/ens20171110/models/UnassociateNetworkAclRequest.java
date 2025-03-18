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
 * {@link UnassociateNetworkAclRequest} extends {@link RequestModel}
 *
 * <p>UnassociateNetworkAclRequest</p>
 */
public class UnassociateNetworkAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Resource> resource;

    private UnassociateNetworkAclRequest(Builder builder) {
        super(builder);
        this.networkAclId = builder.networkAclId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateNetworkAclRequest create() {
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

    public static final class Builder extends Request.Builder<UnassociateNetworkAclRequest, Builder> {
        private String networkAclId; 
        private java.util.List<Resource> resource; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateNetworkAclRequest request) {
            super(request);
            this.networkAclId = request.networkAclId;
            this.resource = request.resource;
        } 

        /**
         * <p>The ID of the network ACL that you want to disassociate from a resource.</p>
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
         * <p>Resources that you want to disassociate. Valid values of <strong>N</strong>: 0 to 29. A maximum of 30 resources can be unbound.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resource(java.util.List<Resource> resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        @Override
        public UnassociateNetworkAclRequest build() {
            return new UnassociateNetworkAclRequest(this);
        } 

    } 

    /**
     * 
     * {@link UnassociateNetworkAclRequest} extends {@link TeaModel}
     *
     * <p>UnassociateNetworkAclRequest</p>
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

            private Builder() {
            } 

            private Builder(Resource model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The ID of the resource that you want to disassociate.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5***</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource that you want to disassociate. Valid values:</p>
             * <ul>
             * <li>Network</li>
             * </ul>
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
