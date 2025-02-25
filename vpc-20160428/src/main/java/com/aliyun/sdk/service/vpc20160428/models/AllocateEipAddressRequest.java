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
 * {@link AllocateEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateEipAddressRequest</p>
 */
public class AllocateEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private Long activityId;

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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private AllocateEipAddressRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ISP = builder.ISP;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.internetChargeType = builder.internetChargeType;
        this.ipAddress = builder.ipAddress;
        this.name = builder.name;
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
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<AllocateEipAddressRequest, Builder> {
        private Long activityId; 
        private Boolean autoPay; 
        private String bandwidth; 
        private String clientToken; 
        private String description; 
        private String ISP; 
        private String instanceChargeType; 
        private String instanceId; 
        private String internetChargeType; 
        private String ipAddress; 
        private String name; 
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
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(AllocateEipAddressRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ISP = request.ISP;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceId = request.instanceId;
            this.internetChargeType = request.internetChargeType;
            this.ipAddress = request.ipAddress;
            this.name = request.name;
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
            this.zone = request.zone;
        } 

        /**
         * <p>The promotion code. This parameter is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder activityId(Long activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): The automatic payment is disabled. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</li>
         * <li><strong>true</strong>: The automatic payment is enabled. Payments are automatically complete after an order is generated.</li>
         * </ul>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, this parameter is required. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, this parameter is not required.</p>
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
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * <ul>
         * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>: <strong>1</strong> to <strong>500</strong>.****</li>
         * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>: <strong>1</strong> to <strong>200</strong>.****</li>
         * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>: <strong>1</strong> to <strong>1000</strong>.****</li>
         * </ul>
         * <p>Default value: <strong>5</strong>. Unit: Mbit/s.</p>
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
         * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The <strong>client token</strong> can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the <strong>client token</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the EIP.</p>
         * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p> You cannot specify this parameter if you create a subscription EIP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (Multi-ISP) All regions support BGP (Multi-ISP) EIPs.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</li>
         * </ul>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the &quot;Line types&quot; section of <a href="https://help.aliyun.com/document_detail/32321.html">What is EIP?</a></p>
         * <ul>
         * <li><p>If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong></li>
         * <li><strong>ChinaUnicom</strong></li>
         * <li><strong>ChinaMobile</strong></li>
         * <li><strong>ChinaTelecom_L2</strong></li>
         * <li><strong>ChinaUnicom_L2</strong></li>
         * <li><strong>ChinaMobile_L2</strong></li>
         * </ul>
         * </li>
         * <li><p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to <strong>BGP_FinanceCloud</strong>.</p>
         * </li>
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
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
         * </ul>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong>. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
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
         * <p>The EIP ID.</p>
         * <p>Specify <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you leave both parameters empty, the system randomly allocates an EIP.</p>
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
         * <p>The metering method of the EIP. Valid values:</p>
         * <ul>
         * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth</li>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * </ul>
         * <p>When <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong>.</p>
         * <p>When <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The IP address of the EIP that you want to request.</p>
         * <p>Specify <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you leave both parameters empty, the system randomly allocates an EIP.</p>
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
         * <p>The EIP name.</p>
         * <p>The name must be 1 to 128 characters in length and start with a letter, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> You cannot specify this parameter if you create a subscription EIP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EIP1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network type. Default value: <strong>public</strong>.</p>
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
         * <p>The subscription duration of the EIP.</p>
         * <p>Valid values when <strong>PricingCycle</strong> is set to <strong>Month</strong>: <strong>1</strong> to <strong>9</strong>.****</p>
         * <p>Valid values when <strong>PricingCycle</strong> is set to <strong>Year</strong>: <strong>1</strong> to <strong>5</strong>.****</p>
         * <p>This parameter must be specified when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. This parameter is optional when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
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
         * <p>The billing cycle of the subscription EIP. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong> (default)</li>
         * <li><strong>Year</strong></li>
         * </ul>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, this parameter is required. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, this parameter is not required.</p>
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
         * <p>By default, the IP address pool feature is unavailable. To use the IP address pool, apply for the privilege in the Quota Center console. For more information, see the &quot;Request a quota increase in the Quota Center console&quot; section in <a href="https://help.aliyun.com/document_detail/108213.html">Manage EIP quotas</a>.</p>
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
         * <p>The ID of the region to which the EIP belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazffggds****</p>
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
         * <p>The editions of Anti-DDoS.</p>
         * <ul>
         * <li>If you do not specify this parameter, Anti-DDoS Origin Basic is used.</li>
         * <li>If you set the parameter to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS Pro/Premium is used.</li>
         * </ul>
         * <p>You can specify up to 10 editions of Anti-DDoS.</p>
         * 
         * <strong>example:</strong>
         * <p>AntiDDoS_Enhanced</p>
         */
        public Builder securityProtectionTypes(java.util.List<String> securityProtectionTypes) {
            this.putQueryParameter("SecurityProtectionTypes", securityProtectionTypes);
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }

        /**
         * <p>The zone of the EIP.</p>
         * <p>When the service type of the IP address pool specified by <strong>PublicIpAddressPoolId</strong> is CloudBox, the default value is the zone of the IP address pool.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/429433.html">ListPublicIpAddressPools</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zone(String zone) {
            this.putQueryParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public AllocateEipAddressRequest build() {
            return new AllocateEipAddressRequest(this);
        } 

    } 

}
