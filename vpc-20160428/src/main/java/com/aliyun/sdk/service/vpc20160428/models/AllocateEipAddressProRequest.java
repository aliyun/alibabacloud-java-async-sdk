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
 * {@link AllocateEipAddressProRequest} extends {@link RequestModel}
 *
 * <p>AllocateEipAddressProRequest</p>
 */
public class AllocateEipAddressProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private String bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Netmode")
    private String netmode;

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
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
    private String publicIpAddressPoolId;

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
    @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
    private java.util.List<String> securityProtectionTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private AllocateEipAddressProRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.ISP = builder.ISP;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.ipAddress = builder.ipAddress;
        this.netmode = builder.netmode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.pricingCycle = builder.pricingCycle;
        this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityProtectionTypes = builder.securityProtectionTypes;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressProRequest create() {
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
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return netmode
     */
    public String getNetmode() {
        return this.netmode;
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
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return publicIpAddressPoolId
     */
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
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
     * @return securityProtectionTypes
     */
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<AllocateEipAddressProRequest, Builder> {
        private Boolean autoPay; 
        private String bandwidth; 
        private String clientToken; 
        private String ISP; 
        private String instanceChargeType; 
        private String instanceId; 
        private String internetChargeType; 
        private String ipAddress; 
        private String netmode; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String pricingCycle; 
        private String publicIpAddressPoolId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> securityProtectionTypes; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(AllocateEipAddressProRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.ISP = request.ISP;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceId = request.instanceId;
            this.internetChargeType = request.internetChargeType;
            this.ipAddress = request.ipAddress;
            this.netmode = request.netmode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.pricingCycle = request.pricingCycle;
            this.publicIpAddressPoolId = request.publicIpAddressPoolId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityProtectionTypes = request.securityProtectionTypes;
            this.tag = request.tag;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: disables automatic payment. After an order is generated, you must go to the User Center to complete the payment.</p>
         * </li>
         * <li><p><strong>true</strong>: enables automatic payment. The system automatically pays for the order.</p>
         * </li>
         * </ul>
         * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. You can leave this parameter empty if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the specified EIP. Unit: Mbit/s.</p>
         * <ul>
         * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>500</strong>.</p>
         * </li>
         * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>200</strong>.</p>
         * </li>
         * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>1000</strong>.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. BGP (multi-ISP) EIPs are supported in all regions.</li>
         * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line. BGP (multi-ISP) Pro EIPs are supported only in the Hong Kong (China), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
         * </ul>
         * <p>For more information about BGP (multi-ISP) and BGP (multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
         * <ul>
         * <li>If you are a whitelisted user of single-ISP bandwidth, you can also select the following types:<ul>
         * <li><strong>ChinaTelecom</strong>: China Telecom</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom</li>
         * <li><strong>ChinaMobile</strong>: China Mobile</li>
         * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
         * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
         * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
         * </ul>
         * </li>
         * <li>If you are an Alibaba Finance Cloud user in the China (Hangzhou) region, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The billing method of the specified EIP. Valid values:</p>
         * <ul>
         * <li><p><strong>PrePaid</strong>: subscription.</p>
         * </li>
         * <li><p><strong>PostPaid</strong> (default): pay-as-you-go billing method.</p>
         * </li>
         * </ul>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, <strong>InternetChargeType</strong> can be set to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance ID of the specified EIP.</p>
         * <p>You need to specify only one of the <strong>IpAddress</strong> and <strong>InstanceId</strong> parameters. If neither is specified, the system randomly allocates an EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-25877c70gddh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metering method of the specified EIP. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
         * </li>
         * <li><p><strong>PayByTraffic</strong>: pay-by-data-transfer.</p>
         * </li>
         * </ul>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, <strong>InternetChargeType</strong> can be set to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The IP address of the specified EIP.</p>
         * <p>You need to specify only one of the <strong>IpAddress</strong> and <strong>InstanceId</strong> parameters. If neither is specified, the system randomly allocates an EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.putQueryParameter("IpAddress", ipAddress);
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The network type. Set the value to <strong>public</strong> (default), which indicates the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder netmode(String netmode) {
            this.putQueryParameter("Netmode", netmode);
            this.netmode = netmode;
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
         * <p>The subscription duration.</p>
         * <ul>
         * <li><p>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, valid values for <strong>Period</strong> are <strong>1</strong> to <strong>9</strong>.</p>
         * </li>
         * <li><p>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, valid values for <strong>Period</strong> are <strong>1</strong> to <strong>3</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
         * <p>Do not specify this parameter if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
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
         * <p>The billing cycle of the subscription. Valid values:</p>
         * <ul>
         * <li><p><strong>Month</strong> (default): monthly billing.</p>
         * </li>
         * <li><p><strong>Year</strong>: yearly billing.</p>
         * </li>
         * </ul>
         * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. You can leave this parameter empty if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The ID of the IP address pool.</p>
         * <p>The EIP is allocated from the IP address pool.</p>
         * <p>By default, the IP address pool feature is not available. To use this feature, you must apply for the quota of the IP address pool feature privilege quota Center. For more information, see <a href="https://help.aliyun.com/document_detail/108213.html">Increase quotas privilege quota Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-2vc0kxcedhquybdsz****</p>
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            this.putQueryParameter("PublicIpAddressPoolId", publicIpAddressPoolId);
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * <p>The region ID of the specified EIP.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <p>The ID of the resource group to which the specified EIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-resourcegroup****</p>
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
         * <p>The security protection level. Valid values:</p>
         * <ul>
         * <li><p>If this parameter is left empty, Anti-DDoS Basic is used by default.</p>
         * </li>
         * <li><p><strong>AntiDDoS_Enhanced</strong>: Anti-DDoS (Enhanced).</p>
         * </li>
         * </ul>
         */
        public Builder securityProtectionTypes(java.util.List<String> securityProtectionTypes) {
            this.putQueryParameter("SecurityProtectionTypes", securityProtectionTypes);
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public AllocateEipAddressProRequest build() {
            return new AllocateEipAddressProRequest(this);
        } 

    } 

    /**
     * 
     * {@link AllocateEipAddressProRequest} extends {@link TeaModel}
     *
     * <p>AllocateEipAddressProRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
