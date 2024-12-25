// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    @Deprecated
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 5000, minimum = 1)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteProtection")
    private String deleteProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @Deprecated
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterZoneId")
    private String masterZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionStatus")
    private String modificationProtectionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @Deprecated
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    @Deprecated
    private String pricingCycle;

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
    @com.aliyun.core.annotation.NameInMap("SlaveZoneId")
    private String slaveZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.addressType = builder.addressType;
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.deleteProtection = builder.deleteProtection;
        this.duration = builder.duration;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.masterZoneId = builder.masterZoneId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.slaveZoneId = builder.slaveZoneId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
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
     * @return deleteProtection
     */
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    /**
     * @return modificationProtectionReason
     */
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    /**
     * @return modificationProtectionStatus
     */
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
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
     * @return slaveZoneId
     */
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String address; 
        private String addressIPVersion; 
        private String addressType; 
        private Boolean autoPay; 
        private Integer bandwidth; 
        private String clientToken; 
        private String deleteProtection; 
        private Integer duration; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String masterZoneId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String pricingCycle; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String slaveZoneId; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.address = request.address;
            this.addressIPVersion = request.addressIPVersion;
            this.addressType = request.addressType;
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.deleteProtection = request.deleteProtection;
            this.duration = request.duration;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.masterZoneId = request.masterZoneId;
            this.modificationProtectionReason = request.modificationProtectionReason;
            this.modificationProtectionStatus = request.modificationProtectionStatus;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.slaveZoneId = request.slaveZoneId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The private IP address of the CLB instance. The private IP address must belong to the destination CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The IP version of the CLB instance. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>The network type of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: After an Internet-facing CLB instance is created, the system allocates a public IP address to the instance. The CLB instance can forward requests over the Internet.</li>
         * <li><strong>intranet</strong>: After an internal-facing CLB instance is created, the system allocates a private IP address to the CLB instance. The CLB instance can forward requests only within the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>Specifies whether to automatically pay the subscription fee of the Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. The CLB instance is created after you call the API operation.</li>
         * <li><strong>false</strong> (default): After you call the operation, the order is created but the payment is not completed. You can view pending orders in the console. The CLB instance will not be created until you complete the payment.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only for subscription CLB instances created on the Alibaba Cloud China site.</p>
         * </blockquote>
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
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * <p>Valid values: <strong>1</strong> to <strong>5120</strong>. For a pay-by-bandwidth Internet-facing CLB instance, you can specify a maximum bandwidth for each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder deleteProtection(String deleteProtection) {
            this.putQueryParameter("DeleteProtection", deleteProtection);
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * <p>The subscription duration of the Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li>If <strong>PricingCycle</strong> is set to <strong>month</strong>, the valid values are <strong>1 to 9</strong>.</li>
         * <li>If <strong>PricingCycle</strong> is set to <strong>year</strong>, the valid values are <strong>1 to 5</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by subscription instances created on the Alibaba Cloud China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The metering method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>PayBySpec</strong> (default)</li>
         * <li><strong>PayByCLCU</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by instances created on the Alibaba Cloud China site and only when <strong>PayType</strong> is set to <strong>PayOnDemand</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><p><strong>paybytraffic</strong> (default): pay-by-data-transfer</p>
         * <blockquote>
         * <p> If you set InternetChargeType to <strong>paybytraffic</strong>, you do not need to configure the <strong>Bandwidth</strong> parameter. The value of <strong>Bandwidth</strong> does not take effect even if you specify one.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>paybybandwidth</strong>: pay-by-bandwidth</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you set <strong>PayType</strong> to <strong>PayOnDemand</strong> and <strong>InstanceChargeType</strong> to <strong>PayByCLCU</strong>, the only valid value for InternetChargeType is <strong>paybytraffic</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>paybytraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The CLB instance name.</p>
         * <p>The name must be 1 to 80 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * <p>If you do not specify this parameter, the system automatically assigns a name to the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1o94dp5i6ea****</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The specification of the CLB instance. Valid values:</p>
         * <ul>
         * <li><p><strong>slb.s1.small</strong></p>
         * </li>
         * <li><p><strong>slb.s2.small</strong></p>
         * </li>
         * <li><p><strong>slb.s2.medium</strong></p>
         * </li>
         * <li><p><strong>slb.s3.small</strong></p>
         * </li>
         * <li><p><strong>slb.s3.medium</strong></p>
         * </li>
         * <li><p><strong>slb.s3.large</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>  If you do not specify this parameter, a shared-resource CLB instance is created. Shared-resource CLB instances are no longer available for purchase. Therefore, you must specify this parameter.</p>
         * </blockquote>
         * <p>If <strong>InstanceChargeType</strong> is set to <strong>PayByCLCU</strong>, this parameter is invalid and you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * <p>The ID of the primary zone to which the CLB instance belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401683.html">DescribeZone</a> operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder masterZoneId(String masterZoneId) {
            this.putQueryParameter("MasterZoneId", masterZoneId);
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * <p>The reason for enabling the configuration read-only mode. The reason must be 1 to 80 characters in length. It must start with a letter and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Managed instance</p>
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.putQueryParameter("ModificationProtectionReason", modificationProtectionReason);
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: disables the configuration read-only mode. After you disable the configuration read-only mode, the value of <strong>ModificationProtectionReason</strong> is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode.</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.putQueryParameter("ModificationProtectionStatus", modificationProtectionStatus);
            this.modificationProtectionStatus = modificationProtectionStatus;
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
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <p><strong>PayOnDemand</strong>: pay-as-you-go.</p>
         * <blockquote>
         * <p> The Alibaba Cloud International site supports only pay-as-you-go CLB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayOnDemand</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>month</strong></li>
         * <li><strong>year</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by subscription instances created on the Alibaba Cloud China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The region ID of the CLB instance.</p>
         * <p>You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>rg-atstuj3rtopt****</p>
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
         * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401683.html">DescribeZone</a> operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.putQueryParameter("SlaveZoneId", slaveZoneId);
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
         * <p>If you want to deploy the CLB instance in a VPC, this parameter is required. If this parameter is specified, <strong>AddessType</strong> is set to <strong>intranet</strong> by default.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12mw1f8k3jgy****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1aevy8sofi8mh1****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
             * <p>The tag key of the bastion host. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be at most 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It must not start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
