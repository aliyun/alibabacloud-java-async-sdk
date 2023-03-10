// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnAttachmentRequest</p>
 */
public class CreateVpnAttachmentRequest extends Request {
    @Query
    @NameInMap("AutoConfigRoute")
    private Boolean autoConfigRoute;

    @Query
    @NameInMap("BgpConfig")
    private String bgpConfig;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    private String customerGatewayId;

    @Query
    @NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @Query
    @NameInMap("EnableDpd")
    private Boolean enableDpd;

    @Query
    @NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @Query
    @NameInMap("HealthCheckConfig")
    private String healthCheckConfig;

    @Query
    @NameInMap("IkeConfig")
    private String ikeConfig;

    @Query
    @NameInMap("IpsecConfig")
    private String ipsecConfig;

    @Query
    @NameInMap("LocalSubnet")
    @Validation(required = true)
    private String localSubnet;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoteCaCert")
    private String remoteCaCert;

    @Query
    @NameInMap("RemoteSubnet")
    @Validation(required = true)
    private String remoteSubnet;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateVpnAttachmentRequest(Builder builder) {
        super(builder);
        this.autoConfigRoute = builder.autoConfigRoute;
        this.bgpConfig = builder.bgpConfig;
        this.clientToken = builder.clientToken;
        this.customerGatewayId = builder.customerGatewayId;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.ikeConfig = builder.ikeConfig;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.remoteCaCert = builder.remoteCaCert;
        this.remoteSubnet = builder.remoteSubnet;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnAttachmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfigRoute
     */
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    /**
     * @return bgpConfig
     */
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return enableDpd
     */
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    /**
     * @return enableNatTraversal
     */
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    /**
     * @return healthCheckConfig
     */
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return ikeConfig
     */
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteCaCert
     */
    public String getRemoteCaCert() {
        return this.remoteCaCert;
    }

    /**
     * @return remoteSubnet
     */
    public String getRemoteSubnet() {
        return this.remoteSubnet;
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateVpnAttachmentRequest, Builder> {
        private Boolean autoConfigRoute; 
        private String bgpConfig; 
        private String clientToken; 
        private String customerGatewayId; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private String healthCheckConfig; 
        private String ikeConfig; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String name; 
        private String networkType; 
        private String ownerAccount; 
        private String regionId; 
        private String remoteCaCert; 
        private String remoteSubnet; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpnAttachmentRequest request) {
            super(request);
            this.autoConfigRoute = request.autoConfigRoute;
            this.bgpConfig = request.bgpConfig;
            this.clientToken = request.clientToken;
            this.customerGatewayId = request.customerGatewayId;
            this.effectImmediately = request.effectImmediately;
            this.enableDpd = request.enableDpd;
            this.enableNatTraversal = request.enableNatTraversal;
            this.healthCheckConfig = request.healthCheckConfig;
            this.ikeConfig = request.ikeConfig;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.name = request.name;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.remoteCaCert = request.remoteCaCert;
            this.remoteSubnet = request.remoteSubnet;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
        } 

        /**
         * AutoConfigRoute.
         */
        public Builder autoConfigRoute(Boolean autoConfigRoute) {
            this.putQueryParameter("AutoConfigRoute", autoConfigRoute);
            this.autoConfigRoute = autoConfigRoute;
            return this;
        }

        /**
         * BgpConfig.
         */
        public Builder bgpConfig(String bgpConfig) {
            this.putQueryParameter("BgpConfig", bgpConfig);
            this.bgpConfig = bgpConfig;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CustomerGatewayId.
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.putQueryParameter("CustomerGatewayId", customerGatewayId);
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * 立即生效
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * EnableDpd.
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.putQueryParameter("EnableDpd", enableDpd);
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * EnableNatTraversal.
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.putQueryParameter("EnableNatTraversal", enableNatTraversal);
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * HealthCheckConfig.
         */
        public Builder healthCheckConfig(String healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * IkeConfig.
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * IpsecConfig.
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * 路由模式为感兴趣流模式时，设置本端ip和对端ip
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * public/private
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemoteCaCert.
         */
        public Builder remoteCaCert(String remoteCaCert) {
            this.putQueryParameter("RemoteCaCert", remoteCaCert);
            this.remoteCaCert = remoteCaCert;
            return this;
        }

        /**
         * RemoteSubnet.
         */
        public Builder remoteSubnet(String remoteSubnet) {
            this.putQueryParameter("RemoteSubnet", remoteSubnet);
            this.remoteSubnet = remoteSubnet;
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
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateVpnAttachmentRequest build() {
            return new CreateVpnAttachmentRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
