// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnGatewayRequest</p>
 */
public class CreateVpnGatewayRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Integer bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DisasterRecoveryVSwitchId")
    private String disasterRecoveryVSwitchId;

    @Query
    @NameInMap("EnableIpsec")
    private Boolean enableIpsec;

    @Query
    @NameInMap("EnableSsl")
    private Boolean enableSsl;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

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
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SslConnections")
    private Integer sslConnections;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("VpnType")
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
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sslConnections = request.sslConnections;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.vpnType = request.vpnType;
        } 

        /**
         * Specifies whether to enable automatic payment for the VPN gateway. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
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
         * >  The maximum bandwidth supported by VPN gateways in some regions is 200 Mbit/s. For more information, see [VPN gateway limits](~~65290~~).
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 指定VPN网关实例关联的第二个交换机实例。
         * <p>
         * 
         * - 如果当前地域支持创建双隧道模式的IPsec-VPN连接，则本参数必填。
         * - 您需要从VPN网关实例关联的VPC实例下指定两个分布在不同可用区的交换机实例，以实现IPsec-VPN连接可用区级别的容灾。
         * - 对于仅支持一个可用区的地域 ，不支持可用区级别的容灾，建议您在该可用区下指定两个不同的交换机实例以实现IPsec-VPN连接的高可用，支持指定相同的交换机实例。
         * 
         * 关于支持双隧道模式IPsec-VPN连接的地域和可用区的信息，请参见[IPsec-VPN连接升级为双隧道模式](~~2358946~~)。
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.putQueryParameter("DisasterRecoveryVSwitchId", disasterRecoveryVSwitchId);
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * Specifies whether to enable the IPsec-VPN feature. Valid values:
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
         * Specifies whether to enable the SSL-VPN feature for the VPN gateway. Valid values:
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
         * <p>
         * 
         * >  This parameter is required when you create a VPN gateway.
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
         * The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.
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
         * The ID of the vSwitch to which the VPN gateway belongs.
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
         * The type of the VPN gateway.
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
