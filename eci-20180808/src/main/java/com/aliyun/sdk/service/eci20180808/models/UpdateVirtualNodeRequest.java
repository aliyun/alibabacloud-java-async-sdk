// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVirtualNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirtualNodeRequest</p>
 */
public class UpdateVirtualNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterDNS")
    private String clusterDNS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterDomain")
    private String clusterDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomResources")
    private String customResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNodeName")
    private String virtualNodeName;

    private UpdateVirtualNodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterDNS = builder.clusterDNS;
        this.clusterDomain = builder.clusterDomain;
        this.customResources = builder.customResources;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.virtualNodeId = builder.virtualNodeId;
        this.virtualNodeName = builder.virtualNodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterDNS
     */
    public String getClusterDNS() {
        return this.clusterDNS;
    }

    /**
     * @return clusterDomain
     */
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    /**
     * @return customResources
     */
    public String getCustomResources() {
        return this.customResources;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return virtualNodeId
     */
    public String getVirtualNodeId() {
        return this.virtualNodeId;
    }

    /**
     * @return virtualNodeName
     */
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public static final class Builder extends Request.Builder<UpdateVirtualNodeRequest, Builder> {
        private String clientToken; 
        private String clusterDNS; 
        private String clusterDomain; 
        private String customResources; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String virtualNodeId; 
        private String virtualNodeName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirtualNodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterDNS = request.clusterDNS;
            this.clusterDomain = request.clusterDomain;
            this.customResources = request.customResources;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.virtualNodeId = request.virtualNodeId;
            this.virtualNodeName = request.virtualNodeName;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="~~25693~~">How to ensure idempotency of requests?</a></p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The IP address of the DNS server. If <code>dnsPolicy=ClusterFirst</code> is configured for the Elastic Container Instance pod, Elastic Container Instance uses the configuration to provide DNS services to containers. You can configure multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>100.1.XX.XX</p>
         */
        public Builder clusterDNS(String clusterDNS) {
            this.putQueryParameter("ClusterDNS", clusterDNS);
            this.clusterDNS = clusterDNS;
            return this;
        }

        /**
         * <p>The domain name of the cluster. If this parameter is specified, in addition to the search domain of the host, Kubelet configures all containers to search for the specified domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putQueryParameter("ClusterDomain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * <p>The custom resources that are supported by the virtual node. If a custom resource is specified in the request of an Elastic Container Instance pod, the pod is scheduled to run on the virtual node that supports the custom resource. You can use the <code>Resource name = Number of resources</code> format to specify custom resources. Separate multiple resources with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example1.com=100,example2.com=200</p>
         */
        public Builder customResources(String customResources) {
            this.putQueryParameter("CustomResources", customResources);
            this.customResources = customResources;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tags to add to the virtual node.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>vnd-2ze960zkdqrldeaw****</p>
         */
        public Builder virtualNodeId(String virtualNodeId) {
            this.putQueryParameter("VirtualNodeId", virtualNodeId);
            this.virtualNodeId = virtualNodeId;
            return this;
        }

        /**
         * <p>The name of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>testNode</p>
         */
        public Builder virtualNodeName(String virtualNodeName) {
            this.putQueryParameter("VirtualNodeName", virtualNodeName);
            this.virtualNodeName = virtualNodeName;
            return this;
        }

        @Override
        public UpdateVirtualNodeRequest build() {
            return new UpdateVirtualNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVirtualNodeRequest} extends {@link TeaModel}
     *
     * <p>UpdateVirtualNodeRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N to add to the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
