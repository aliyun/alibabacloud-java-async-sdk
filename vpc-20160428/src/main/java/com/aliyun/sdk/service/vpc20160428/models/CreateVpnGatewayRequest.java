// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnGatewayRequest</p>
 */
public class CreateVpnGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisasterRecoveryVSwitchId")
    private String disasterRecoveryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpsec")
    private Boolean enableIpsec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSsl")
    private Boolean enableSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslConnections")
    private Integer sslConnections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnType")
    private String vpnType;

    private CreateVpnGatewayRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.disasterRecoveryVSwitchId = builder.disasterRecoveryVSwitchId;
        this.enableIpsec = builder.enableIpsec;
        this.enableSsl = builder.enableSsl;
        this.instanceChargeType = builder.instanceChargeType;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sslConnections = builder.sslConnections;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpnType = builder.vpnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disasterRecoveryVSwitchId
     */
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    /**
     * @return enableIpsec
     */
    public Boolean getEnableIpsec() {
        return this.enableIpsec;
    }

    /**
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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
     * @return sslConnections
     */
    public Integer getSslConnections() {
        return this.sslConnections;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpnType
     */
    public String getVpnType() {
        return this.vpnType;
    }

    public static final class Builder extends Request.Builder<CreateVpnGatewayRequest, Builder> {
        private Boolean autoPay; 
        private Integer bandwidth; 
        private String clientToken; 
        private String disasterRecoveryVSwitchId; 
        private Boolean enableIpsec; 
        private Boolean enableSsl; 
        private String instanceChargeType; 
        private String name; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sslConnections; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpnType; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpnGatewayRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.disasterRecoveryVSwitchId = request.disasterRecoveryVSwitchId;
            this.enableIpsec = request.enableIpsec;
            this.enableSsl = request.enableSsl;
            this.instanceChargeType = request.instanceChargeType;
            this.name = request.name;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sslConnections = request.sslConnections;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.vpnType = request.vpnType;
        } 

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         * 
         * > To create a VPN gateway, we recommend that you enable automatic payment. If you disable automatic payment, you must manually pay the bill to create the VPN gateway.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The maximum bandwidth of the VPN gateway. Unit: Mbit/s.
         * <p>
         * 
         * *   If you want to create a public VPN gateway, valid values are **10**, **100**, **200**, **500**, and **1000**.
         * *   If you want to create a private VPN gateway, valid values are **200** and **1000**.
         * 
         * >  The maximum bandwidth supported by VPN gateways in some regions is 500 Mbit/s. For more information, see [VPN gateway limits](~~65290~~).
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request is different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The second vSwitch with which you want to associate the VPN gateway.
         * <p>
         * 
         * *   If you call this operation in a region that supports the IPsec-VPN connections in dual-tunnel mode, this parameter is required.
         * *   You need to specify two vSwitches in different zones in the virtual private cloud (VPC) that is associated with the VPN gateway to implement disaster recovery across zones.
         * *   For a region that supports only one zone, disaster recovery across zones is not supported. We recommend that you specify two vSwitches in the zone to implement high availability. You can specify the same vSwitch.
         * 
         * For more information about the regions and zones that support the IPsec-VPN connections in dual-tunnel mode, see [IPsec-VPN connections support the dual-tunnel mode](~~2358946~~).
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.putQueryParameter("DisasterRecoveryVSwitchId", disasterRecoveryVSwitchId);
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * Specifies whether to enable IPsec-VPN for the VPN gateway. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
         */
        public Builder enableIpsec(Boolean enableIpsec) {
            this.putQueryParameter("EnableIpsec", enableIpsec);
            this.enableIpsec = enableIpsec;
            return this;
        }

        /**
         * Specifies whether to enable SSL-VPN. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder enableSsl(Boolean enableSsl) {
            this.putQueryParameter("EnableSsl", enableSsl);
            this.enableSsl = enableSsl;
            return this;
        }

        /**
         * The billing method of the VPN gateway. Set the value to **POSTPAY**, which specifies the pay-as-you-go billing method.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The name of the VPN gateway. The default value is the ID of the VPN gateway.
         * <p>
         * 
         * The name must be 2 to 100 characters in length and cannot start with `http://` or `https://`. It must start with a letter and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). Other special characters are not supported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The network type of the VPN gateway. Valid values:
         * <p>
         * 
         * *   **public** (default)
         * *   **private**
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The subscription duration. Unit: month. Valid values: **1** to **9**, **12**, **24**, and **36**.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the VPN gateway. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the VPN gateway belongs.
         * <p>
         * 
         * *   You can call the [ListResourceGroups](~~158855~~) operation to query resource group IDs.
         * 
         * *   If you do not specify a resource group ID, the VPN gateway belongs to the default resource group.
         * 
         * *   After the VPN gateway is created, the following resources also belong to the resource group and you cannot change the resource group: SSL servers, SSL client certificates, IPsec servers, and IPsec-VPN connections.
         * 
         *     If you move the VPN gateway to a new resource group, the preceding resources are also moved to the new resource group.
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
         * The maximum number of clients that can be connected at the same time. Valid values: **5** (default), **10**, **20**, **50**, **100**, **200**, **500**, and **1000**.
         */
        public Builder sslConnections(Integer sslConnections) {
            this.putQueryParameter("SslConnections", sslConnections);
            this.sslConnections = sslConnections;
            return this;
        }

        /**
         * The vSwitch with which you want to associate the VPN gateway.
         * <p>
         * 
         * *   If you call this operation in a region that supports the IPsec-VPN connections in dual-tunnel mode, this parameter is required. You must specify a vSwitch and specify **DisasterRecoveryVSwitchId**.
         * *   If you call this operation in a region that supports the IPsec-VPN connections in single-tunnel mode and do not specify a vSwitch, the system automatically specifies a vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) where you want to create the VPN gateway.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The type of the VPN gateway. Valid values:
         * <p>
         * 
         * Set the value to **Normal** (default), which specifies a standard NAT gateway.
         */
        public Builder vpnType(String vpnType) {
            this.putQueryParameter("VpnType", vpnType);
            this.vpnType = vpnType;
            return this;
        }

        @Override
        public CreateVpnGatewayRequest build() {
            return new CreateVpnGatewayRequest(this);
        } 

    } 

}
