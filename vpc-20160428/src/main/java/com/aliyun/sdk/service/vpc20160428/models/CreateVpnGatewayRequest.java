// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * <p>Specifies whether to automatically pay the bill for the VPN gateway. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: automatically pays the bill for the VPN gateway.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not automatically pay the bill for the VPN gateway.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>To successfully create a VPN gateway instance, enable automatic payment. If you disable automatic payment, you must manually pay the bill to create the VPN gateway instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The bandwidth specification of the VPN gateway. Unit: Mbit/s.</p>
         * <p>&lt;props=&quot;china&quot;&gt;- To create a public VPN gateway, set the value to <strong>5</strong>, <strong>10</strong>, <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, or <strong>1000</strong>.
         * &lt;props=&quot;china&quot;&gt;- To create a private VPN gateway, set the value to <strong>200</strong> or <strong>1000</strong>.
         * &lt;props=&quot;intl&quot;&gt;- To create a public VPN gateway, set the value to <strong>10</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, or <strong>1000</strong>.
         * &lt;props=&quot;intl&quot;&gt;- To create a private VPN gateway, set the value to <strong>200</strong> or <strong>1000</strong>.</p>
         * <blockquote>
         * <p>The maximum bandwidth specification supported by VPN gateways in some regions is 500 Mbit/s. For more information, see <a href="https://help.aliyun.com/document_detail/65290.html">VPN gateway limits</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The second vSwitch associated with the VPN VPC-connected instance.</p>
         * <ul>
         * <li>If the current region supports dual-tunnel mode IPsec-VPN connections, this parameter is required.</li>
         * <li>You must specify two vSwitches in different zones from the VPC associated with the VPN VPC-connected instance to implement zone-level disaster recovery for IPsec-VPN connections.</li>
         * <li>For regions that support only one zone, zone-level disaster recovery is not supported. Specify two different vSwitches in the same zone to implement high availability for IPsec-VPN connections. You can also specify the same vSwitch.</li>
         * </ul>
         * <p>For information about the regions and zones that support dual-tunnel mode IPsec-VPN connections, see <a href="https://help.aliyun.com/document_detail/2358946.html">Upgrade an IPsec-VPN connection to dual-tunnel mode</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0wiz7obm0tbimu4r****</p>
         */
        public Builder disasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
            this.putQueryParameter("DisasterRecoveryVSwitchId", disasterRecoveryVSwitchId);
            this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the IPsec-VPN feature. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): enables the IPsec-VPN feature.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the IPsec-VPN feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIpsec(Boolean enableIpsec) {
            this.putQueryParameter("EnableIpsec", enableIpsec);
            this.enableIpsec = enableIpsec;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SSL-VPN feature. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the SSL-VPN feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the SSL-VPN feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSsl(Boolean enableSsl) {
            this.putQueryParameter("EnableSsl", enableSsl);
            this.enableSsl = enableSsl;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The billable methods of the VPN gateway. Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.
         * &lt;props=&quot;intl&quot;&gt;The billable methods of the VPN gateway. Set the value to <strong>POSTPAY</strong>, which specifies the pay-as-you-go billing method.
         * &lt;props=&quot;partner&quot;&gt;The billable methods of the VPN gateway. Set the value to <strong>POSTPAY</strong>, which specifies the pay-as-you-go billing method.</p>
         * <p>&lt;props=&quot;china&quot;&gt;This parameter is required when you create a VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>China site example value: PREPAY. International site example value: POSTPAY</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The name of the VPN gateway. The default value is the ID of the VPN gateway.</p>
         * <p>The name must be 2 to 100 characters in length. It cannot start with <code>http://</code> or <code>https://</code>. It must start with an uppercase or lowercase letter and can contain uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.). Other special characters are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MYVPN</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>public</strong> (default): public VPN gateway.</li>
         * <li><strong>private</strong>: private VPN gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
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
         * <p>The subscription duration. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>InstanceChargeType</strong> parameter is set to <strong>PREPAY</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group to which the VPN gateway belongs.</p>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group ID.</p>
         * </li>
         * <li><p>If you do not specify a resource group ID, the VPN gateway belongs to the default resource group after it is created.</p>
         * </li>
         * <li><p>After the VPN gateway is created, if you create SSL servers, SSL client certificates, IPsec servers, or IPsec-VPN connections (where the IPsec-VPN connection is associated with the VPN gateway) under the VPN gateway, these resources belong to the same resource group as the VPN gateway and cannot be modified individually.</p>
         * <p>If you change the resource group of the VPN gateway, the resource group of the preceding resources is also changed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
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
         * <p>The maximum number of clients that can be simultaneously connected. Valid values: <strong>5</strong> (default), <strong>10</strong>, <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder sslConnections(Integer sslConnections) {
            this.putQueryParameter("SslConnections", sslConnections);
            this.sslConnections = sslConnections;
            return this;
        }

        /**
         * <p>The vSwitch associated with the VPN gateway instance. </p>
         * <ul>
         * <li>In regions that support dual-tunnel mode IPsec-VPN connections, this parameter is required. You must specify a vSwitch and also specify the <strong>DisasterRecoveryVSwitchId</strong> parameter.</li>
         * <li>In regions that support single-tunnel mode IPsec-VPN connections, if you do not specify a vSwitch, the system automatically selects a vSwitch from the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1j5miw2bae9s2vt****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The instance ID of the VPC-connected instance to which the VPN gateway belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ub1yt9cvakoelj****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The type of the VPN gateway. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): standard.
         * &lt;props=&quot;china&quot;&gt;- <strong>NationalStandard</strong>: Chinese SM-based.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
