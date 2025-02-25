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
 * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
    private Long autoReleaseTime;

    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @com.aliyun.core.annotation.NameInMap("DeleteProtection")
    private String deleteProtection;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("ListenerPorts")
    private ListenerPorts listenerPorts;

    @com.aliyun.core.annotation.NameInMap("ListenerPortsAndProtocal")
    private ListenerPortsAndProtocal listenerPortsAndProtocal;

    @com.aliyun.core.annotation.NameInMap("ListenerPortsAndProtocol")
    private ListenerPortsAndProtocol listenerPortsAndProtocol;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.NameInMap("MasterZoneId")
    private String masterZoneId;

    @com.aliyun.core.annotation.NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @com.aliyun.core.annotation.NameInMap("ModificationProtectionStatus")
    private String modificationProtectionStatus;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RegionIdAlias")
    private String regionIdAlias;

    @com.aliyun.core.annotation.NameInMap("RenewalCycUnit")
    private String renewalCycUnit;

    @com.aliyun.core.annotation.NameInMap("RenewalDuration")
    private Integer renewalDuration;

    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    private String renewalStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SlaveZoneId")
    private String slaveZoneId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeLoadBalancerAttributeResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.addressType = builder.addressType;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.backendServers = builder.backendServers;
        this.bandwidth = builder.bandwidth;
        this.createTime = builder.createTime;
        this.createTimeStamp = builder.createTimeStamp;
        this.deleteProtection = builder.deleteProtection;
        this.endTime = builder.endTime;
        this.endTimeStamp = builder.endTimeStamp;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.listenerPorts = builder.listenerPorts;
        this.listenerPortsAndProtocal = builder.listenerPortsAndProtocal;
        this.listenerPortsAndProtocol = builder.listenerPortsAndProtocol;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.masterZoneId = builder.masterZoneId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.regionIdAlias = builder.regionIdAlias;
        this.renewalCycUnit = builder.renewalCycUnit;
        this.renewalDuration = builder.renewalDuration;
        this.renewalStatus = builder.renewalStatus;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveZoneId = builder.slaveZoneId;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerAttributeResponseBody create() {
        return builder().build();
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
     * @return autoReleaseTime
     */
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return deleteProtection
     */
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
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
     * @return listenerPorts
     */
    public ListenerPorts getListenerPorts() {
        return this.listenerPorts;
    }

    /**
     * @return listenerPortsAndProtocal
     */
    public ListenerPortsAndProtocal getListenerPortsAndProtocal() {
        return this.listenerPortsAndProtocal;
    }

    /**
     * @return listenerPortsAndProtocol
     */
    public ListenerPortsAndProtocol getListenerPortsAndProtocol() {
        return this.listenerPortsAndProtocol;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
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
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionIdAlias
     */
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    /**
     * @return renewalCycUnit
     */
    public String getRenewalCycUnit() {
        return this.renewalCycUnit;
    }

    /**
     * @return renewalDuration
     */
    public Integer getRenewalDuration() {
        return this.renewalDuration;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slaveZoneId
     */
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
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

    public static final class Builder {
        private String address; 
        private String addressIPVersion; 
        private String addressType; 
        private Long autoReleaseTime; 
        private BackendServers backendServers; 
        private Integer bandwidth; 
        private String createTime; 
        private Long createTimeStamp; 
        private String deleteProtection; 
        private String endTime; 
        private Long endTimeStamp; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private ListenerPorts listenerPorts; 
        private ListenerPortsAndProtocal listenerPortsAndProtocal; 
        private ListenerPortsAndProtocol listenerPortsAndProtocol; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerStatus; 
        private String masterZoneId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String networkType; 
        private String payType; 
        private String regionId; 
        private String regionIdAlias; 
        private String renewalCycUnit; 
        private Integer renewalDuration; 
        private String renewalStatus; 
        private String requestId; 
        private String resourceGroupId; 
        private String slaveZoneId; 
        private Tags tags; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * <p>The service IP address of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>42.XX.XX.6</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The version of the IP address. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>The address type of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The timestamp generated when the CLB instance is released.</p>
         * 
         * <strong>example:</strong>
         * <p>1513947075000</p>
         */
        public Builder autoReleaseTime(Long autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * <p>The backend servers of the CLB instance.</p>
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the Internet-facing CLB instance that is billed on a pay-by-bandwidth basis.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The time when the CLB instance was created. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-31T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp generated when the CA certificate is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled for the CLB instance.</p>
         * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * <p>The time when the CLB instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The timestamp that indicates the expiration time of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>32493801600000</p>
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * <p>The metering method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>PayBySpec</strong> (default)</li>
         * <li><strong>PayByCLCU</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only on the China site and takes effect only when <strong>PayType</strong> is set to <strong>PayOnDemand</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>paybytraffic</strong></li>
         * <li><strong>paybybandwidth</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>paybytraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The frontend port used by the CLB instance.</p>
         */
        public Builder listenerPorts(ListenerPorts listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * <p>The ports or protocols of the listeners.</p>
         */
        public Builder listenerPortsAndProtocal(ListenerPortsAndProtocal listenerPortsAndProtocal) {
            this.listenerPortsAndProtocal = listenerPortsAndProtocal;
            return this;
        }

        /**
         * <p>The ports or protocols of the listeners.</p>
         */
        public Builder listenerPortsAndProtocol(ListenerPortsAndProtocol listenerPortsAndProtocol) {
            this.listenerPortsAndProtocol = listenerPortsAndProtocol;
            return this;
        }

        /**
         * <p>The CLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa08ex****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-instance-test</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The specification of the CLB instance.</p>
         * <blockquote>
         * <p> Pay-as-you-go CLB instances are not subject to specifications. By default, <strong>slb.lcu.elastic</strong> is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * <p>The status of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>inactive</strong>: The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</li>
         * <li><strong>active</strong>: The CLB instance is running as expected. Newly created CLB instances are in the <strong>active</strong> state by default.</li>
         * <li><strong>locked</strong>: The CLB instance is locked. CLB instances may be locked due to overdue payments or other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The ID of the primary zone to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder masterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * <p>The reason why the configuration read-only mode is enabled. The value is 1 to 80 characters in length. It starts with a letter and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> This parameter is valid only when <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Managed instance</p>
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * <p>Indicates whether the configuration read-only mode is enabled. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: The configuration read-only mode is disabled. After you disable the configuration read-only mode, the value of <strong>ModificationProtectionReason</strong> is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: The configuration read-only mode is enabled.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to <strong>ConsoleProtection</strong>, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }

        /**
         * <p>The network type of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <ul>
         * <li>Only <strong>PayOnDemand</strong> may be returned, which indicates the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayOnDemand</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The alias of the region to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder regionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }

        /**
         * <p>The auto-renewal cycle. Valid values: <strong>Year</strong> and <strong>Month</strong>. Default value: Month.</p>
         * <blockquote>
         * <p> This parameter is valid only if you create a subscription CLB instance on the Alibaba Cloud China site. In this case, <strong>PayType</strong> must be set to <strong>PrePay</strong> and <strong>RenewalStatus</strong> must be set to <strong>AutoRenewal</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder renewalCycUnit(String renewalCycUnit) {
            this.renewalCycUnit = renewalCycUnit;
            return this;
        }

        /**
         * <p>The auto-renewal duration. This parameter is valid only if <strong>RenewalStatus</strong> is set to <strong>AutoRenewal</strong>.</p>
         * <ul>
         * <li><p>Valid values when <strong>PeriodUnit</strong> is set to <strong>Year</strong>: <strong>1</strong>~<strong>5</strong>.</p>
         * </li>
         * <li><p>Valid values when <strong>PeriodUnit</strong> is set to <strong>Month</strong>: <strong>1</strong>~ <strong>9</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, the <strong>PayType</strong> parameter must be set to <strong>PrePay</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder renewalDuration(Integer renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }

        /**
         * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>AutoRenewal</strong>: Auto-renewal is enabled.</p>
         * </li>
         * <li><p><strong>Normal</strong>: Auto-renewal is disabled. You must manually renew the CLB instance.</p>
         * </li>
         * <li><p><strong>NotRenewal</strong>: The CLB instance will not be renewed upon expiration. If this value is returned, the system does not send notifications until three days before the expiration date.</p>
         * <p>**</p>
         * <p><strong>Note</strong> This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, <strong>PayType</strong> must be set to <strong>PrePay</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-255ecrwq5****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) where the internal-facing CLB instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-25dvzy9f8****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeLoadBalancerAttributeResponseBody build() {
            return new DescribeLoadBalancerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.description = builder.description;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private String serverId; 
            private String serverIp; 
            private String type; 
            private Integer weight; 

            /**
             * <p>The description of the backend server.</p>
             * <blockquote>
             * <p>This parameter is not returned if Description is not set.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>backend server description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The backend server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zej4lxhjoq1icu*****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI) or elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.11</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The type of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServer")
        private java.util.List<BackendServer> backendServer;

        private BackendServers(Builder builder) {
            this.backendServer = builder.backendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return backendServer
         */
        public java.util.List<BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List<BackendServer> backendServer; 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List<BackendServer> backendServer) {
                this.backendServer = backendServer;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private java.util.List<Integer> listenerPort;

        private ListenerPorts(Builder builder) {
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPorts create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public java.util.List<Integer> getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private java.util.List<Integer> listenerPort; 

            /**
             * ListenerPort.
             */
            public Builder listenerPort(java.util.List<Integer> listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public ListenerPorts build() {
                return new ListenerPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortAndProtocal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocal")
        private String listenerProtocal;

        private ListenerPortAndProtocal(Builder builder) {
            this.listenerPort = builder.listenerPort;
            this.listenerProtocal = builder.listenerProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocal
         */
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

        public static final class Builder {
            private Integer listenerPort; 
            private String listenerProtocal; 

            /**
             * <p>The frontend port that is used by the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The frontend protocol that is used by the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder listenerProtocal(String listenerProtocal) {
                this.listenerProtocal = listenerProtocal;
                return this;
            }

            public ListenerPortAndProtocal build() {
                return new ListenerPortAndProtocal(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortsAndProtocal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPortAndProtocal")
        private java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal;

        private ListenerPortsAndProtocal(Builder builder) {
            this.listenerPortAndProtocal = builder.listenerPortAndProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocal
         */
        public java.util.List<ListenerPortAndProtocal> getListenerPortAndProtocal() {
            return this.listenerPortAndProtocal;
        }

        public static final class Builder {
            private java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal; 

            /**
             * ListenerPortAndProtocal.
             */
            public Builder listenerPortAndProtocal(java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal) {
                this.listenerPortAndProtocal = listenerPortAndProtocal;
                return this;
            }

            public ListenerPortsAndProtocal build() {
                return new ListenerPortsAndProtocal(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortAndProtocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ForwardPort")
        private Integer forwardPort;

        @com.aliyun.core.annotation.NameInMap("ListenerForward")
        private String listenerForward;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        private ListenerPortAndProtocol(Builder builder) {
            this.description = builder.description;
            this.forwardPort = builder.forwardPort;
            this.listenerForward = builder.listenerForward;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocol create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return forwardPort
         */
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        /**
         * @return listenerForward
         */
        public String getListenerForward() {
            return this.listenerForward;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public static final class Builder {
            private String description; 
            private Integer forwardPort; 
            private String listenerForward; 
            private Integer listenerPort; 
            private String listenerProtocol; 

            /**
             * <p>Indicates whether the listener is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Listener Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination listening port to which requests are forwarded. The port must be open and use HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * <p>Indicates whether the listener is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * <p>The frontend port that is used by the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The frontend protocol that is used by the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>https</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            public ListenerPortAndProtocol build() {
                return new ListenerPortAndProtocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortsAndProtocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPortAndProtocol")
        private java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol;

        private ListenerPortsAndProtocol(Builder builder) {
            this.listenerPortAndProtocol = builder.listenerPortAndProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocol create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocol
         */
        public java.util.List<ListenerPortAndProtocol> getListenerPortAndProtocol() {
            return this.listenerPortAndProtocol;
        }

        public static final class Builder {
            private java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol; 

            /**
             * ListenerPortAndProtocol.
             */
            public Builder listenerPortAndProtocol(java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol) {
                this.listenerPortAndProtocol = listenerPortAndProtocol;
                return this;
            }

            public ListenerPortsAndProtocol build() {
                return new ListenerPortsAndProtocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
             * <p>The tag key can be at most 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It must not start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
