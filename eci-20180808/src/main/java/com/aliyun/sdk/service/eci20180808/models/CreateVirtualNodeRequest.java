// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualNodeRequest</p>
 */
public class CreateVirtualNodeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterDNS")
    private String clusterDNS;

    @Query
    @NameInMap("ClusterDomain")
    private String clusterDomain;

    @Query
    @NameInMap("CustomResources")
    private String customResources;

    @Query
    @NameInMap("EipInstanceId")
    private String eipInstanceId;

    @Query
    @NameInMap("EnablePublicNetwork")
    private Boolean enablePublicNetwork;

    @Query
    @NameInMap("KubeConfig")
    private String kubeConfig;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Taint")
    private java.util.List < Taint> taint;

    @Query
    @NameInMap("TlsBootstrapEnabled")
    private Boolean tlsBootstrapEnabled;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VirtualNodeName")
    private String virtualNodeName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateVirtualNodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterDNS = builder.clusterDNS;
        this.clusterDomain = builder.clusterDomain;
        this.customResources = builder.customResources;
        this.eipInstanceId = builder.eipInstanceId;
        this.enablePublicNetwork = builder.enablePublicNetwork;
        this.kubeConfig = builder.kubeConfig;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.tag = builder.tag;
        this.taint = builder.taint;
        this.tlsBootstrapEnabled = builder.tlsBootstrapEnabled;
        this.vSwitchId = builder.vSwitchId;
        this.virtualNodeName = builder.virtualNodeName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualNodeRequest create() {
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
     * @return eipInstanceId
     */
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    /**
     * @return enablePublicNetwork
     */
    public Boolean getEnablePublicNetwork() {
        return this.enablePublicNetwork;
    }

    /**
     * @return kubeConfig
     */
    public String getKubeConfig() {
        return this.kubeConfig;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return taint
     */
    public java.util.List < Taint> getTaint() {
        return this.taint;
    }

    /**
     * @return tlsBootstrapEnabled
     */
    public Boolean getTlsBootstrapEnabled() {
        return this.tlsBootstrapEnabled;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return virtualNodeName
     */
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateVirtualNodeRequest, Builder> {
        private String clientToken; 
        private String clusterDNS; 
        private String clusterDomain; 
        private String customResources; 
        private String eipInstanceId; 
        private Boolean enablePublicNetwork; 
        private String kubeConfig; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private java.util.List < Tag> tag; 
        private java.util.List < Taint> taint; 
        private Boolean tlsBootstrapEnabled; 
        private String vSwitchId; 
        private String virtualNodeName; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualNodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterDNS = request.clusterDNS;
            this.clusterDomain = request.clusterDomain;
            this.customResources = request.customResources;
            this.eipInstanceId = request.eipInstanceId;
            this.enablePublicNetwork = request.enablePublicNetwork;
            this.kubeConfig = request.kubeConfig;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.tag = request.tag;
            this.taint = request.taint;
            this.tlsBootstrapEnabled = request.tlsBootstrapEnabled;
            this.vSwitchId = request.vSwitchId;
            this.virtualNodeName = request.virtualNodeName;
            this.zoneId = request.zoneId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The IP address of the DNS server. If dnsPolicy=ClusterFirst is configured for the Elastic Container Instance pod, Elastic Container Instance uses the configuration to provide DNS services to containers. You can configure multiple IP addresses. Separate multiple IP addresses with commas (,).
         */
        public Builder clusterDNS(String clusterDNS) {
            this.putQueryParameter("ClusterDNS", clusterDNS);
            this.clusterDNS = clusterDNS;
            return this;
        }

        /**
         * The domain name of the cluster. If this parameter is specified, in addition to the search domain of the host, Kubelet configures all containers to search for the specified domain name.
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putQueryParameter("ClusterDomain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * The custom resources that are supported by the virtual node. If a custom resource is specified in the request of an Elastic Container Instance pod, the pod is scheduled to run on the virtual node that supports the custom resource. You can use the Resource name = Number of resources format to specify custom resources. Separate multiple resources with commas (,).
         */
        public Builder customResources(String customResources) {
            this.putQueryParameter("CustomResources", customResources);
            this.customResources = customResources;
            return this;
        }

        /**
         * The ID of the elastic IP address (EIP).
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable Internet access for the VNode. Default value: false.
         * <p>
         * 
         * If the value of this parameter is true, the VNode exposes a public IP address to external services.
         */
        public Builder enablePublicNetwork(Boolean enablePublicNetwork) {
            this.putQueryParameter("EnablePublicNetwork", enablePublicNetwork);
            this.enablePublicNetwork = enablePublicNetwork;
            return this;
        }

        /**
         * KubeConfig of the Kubernetes cluster to which the VNode is to be connected. The value must be Base64-encoded.
         */
        public Builder kubeConfig(String kubeConfig) {
            this.putQueryParameter("KubeConfig", kubeConfig);
            this.kubeConfig = kubeConfig;
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
         * The region ID of the virtual node.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the security group. The VNode and the elastic container instances in the VNode are added to the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Taint.
         */
        public Builder taint(java.util.List < Taint> taint) {
            this.putQueryParameter("Taint", taint);
            this.taint = taint;
            return this;
        }

        /**
         * Specifies whether to enable TLS bootstrapping. If you set this parameter to true, use the KubeConfig certificate for TLS bootstrapping. Valid values:
         * <p>
         * 
         * - true
         * - false
         * 
         * Default value: false.
         */
        public Builder tlsBootstrapEnabled(Boolean tlsBootstrapEnabled) {
            this.putQueryParameter("TlsBootstrapEnabled", tlsBootstrapEnabled);
            this.tlsBootstrapEnabled = tlsBootstrapEnabled;
            return this;
        }

        /**
         * The ID of the vSwitch. The vSwitch is connected to the VNode and the elastic container instances in the VNode.
         * <p>
         * 
         * You can specify 1 to 10 vSwitches for a VPC.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the VNode. The name must be 2 to 128 characters in length, and can contain lowercase letters, digits, periods (.), and hyphens (-).
         */
        public Builder virtualNodeName(String virtualNodeName) {
            this.putQueryParameter("VirtualNodeName", virtualNodeName);
            this.virtualNodeName = virtualNodeName;
            return this;
        }

        /**
         * The zone ID of the VNode.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateVirtualNodeRequest build() {
            return new CreateVirtualNodeRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag.
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
    public static class Taint extends TeaModel {
        @NameInMap("Effect")
        private String effect;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Taint(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taint create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
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
            private String effect; 
            private String key; 
            private String value; 

            /**
             * The effect of taint N. Valid values of N: 1 to 20. Valid values:
             * <p>
             * 
             * - NoSchedule: No pods are scheduled to the nodes that have the taint.
             * - NoExecute: Existing pods in the node are evicted while no pods are scheduled to the nodes that have the taint.
             * - PreferNoSchedule: Pods are preferentially not scheduled to the nodes that have the taint.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * The key of taint.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of taint.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taint build() {
                return new Taint(this);
            } 

        } 

    }
}
