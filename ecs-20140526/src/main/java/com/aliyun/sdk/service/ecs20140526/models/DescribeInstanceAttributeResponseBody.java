// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.NameInMap("DedicatedHostAttribute")
    private DedicatedHostAttribute dedicatedHostAttribute;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private EipAddress eipAddress;

    @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
    private Boolean enableJumboFrame;

    @com.aliyun.core.annotation.NameInMap("EnableNetworkEncryption")
    private Boolean enableNetworkEncryption;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("InnerIpAddress")
    private InnerIpAddress innerIpAddress;

    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.NameInMap("IoOptimized")
    private String ioOptimized;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
    private PublicIpAddress publicIpAddress;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    @com.aliyun.core.annotation.NameInMap("VlanId")
    private String vlanId;

    @com.aliyun.core.annotation.NameInMap("VpcAttributes")
    private VpcAttributes vpcAttributes;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeInstanceAttributeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cpu = builder.cpu;
        this.creationTime = builder.creationTime;
        this.creditSpecification = builder.creditSpecification;
        this.dedicatedHostAttribute = builder.dedicatedHostAttribute;
        this.description = builder.description;
        this.eipAddress = builder.eipAddress;
        this.enableJumboFrame = builder.enableJumboFrame;
        this.enableNetworkEncryption = builder.enableNetworkEncryption;
        this.expiredTime = builder.expiredTime;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.innerIpAddress = builder.innerIpAddress;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.memory = builder.memory;
        this.operationLocks = builder.operationLocks;
        this.publicIpAddress = builder.publicIpAddress;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serialNumber = builder.serialNumber;
        this.status = builder.status;
        this.stoppedMode = builder.stoppedMode;
        this.vlanId = builder.vlanId;
        this.vpcAttributes = builder.vpcAttributes;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return dedicatedHostAttribute
     */
    public DedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eipAddress
     */
    public EipAddress getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return enableJumboFrame
     */
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    /**
     * @return enableNetworkEncryption
     */
    public Boolean getEnableNetworkEncryption() {
        return this.enableNetworkEncryption;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return innerIpAddress
     */
    public InnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return operationLocks
     */
    public OperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    /**
     * @return publicIpAddress
     */
    public PublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupIds
     */
    public SecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    /**
     * @return vlanId
     */
    public String getVlanId() {
        return this.vlanId;
    }

    /**
     * @return vpcAttributes
     */
    public VpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String clusterId; 
        private Integer cpu; 
        private String creationTime; 
        private String creditSpecification; 
        private DedicatedHostAttribute dedicatedHostAttribute; 
        private String description; 
        private EipAddress eipAddress; 
        private Boolean enableJumboFrame; 
        private Boolean enableNetworkEncryption; 
        private String expiredTime; 
        private String hostName; 
        private String imageId; 
        private InnerIpAddress innerIpAddress; 
        private String instanceChargeType; 
        private String instanceId; 
        private String instanceName; 
        private String instanceNetworkType; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private Integer memory; 
        private OperationLocks operationLocks; 
        private PublicIpAddress publicIpAddress; 
        private String regionId; 
        private String requestId; 
        private SecurityGroupIds securityGroupIds; 
        private String serialNumber; 
        private String status; 
        private String stoppedMode; 
        private String vlanId; 
        private VpcAttributes vpcAttributes; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAttributeResponseBody model) {
            this.clusterId = model.clusterId;
            this.cpu = model.cpu;
            this.creationTime = model.creationTime;
            this.creditSpecification = model.creditSpecification;
            this.dedicatedHostAttribute = model.dedicatedHostAttribute;
            this.description = model.description;
            this.eipAddress = model.eipAddress;
            this.enableJumboFrame = model.enableJumboFrame;
            this.enableNetworkEncryption = model.enableNetworkEncryption;
            this.expiredTime = model.expiredTime;
            this.hostName = model.hostName;
            this.imageId = model.imageId;
            this.innerIpAddress = model.innerIpAddress;
            this.instanceChargeType = model.instanceChargeType;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.instanceNetworkType = model.instanceNetworkType;
            this.instanceType = model.instanceType;
            this.internetChargeType = model.internetChargeType;
            this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
            this.ioOptimized = model.ioOptimized;
            this.memory = model.memory;
            this.operationLocks = model.operationLocks;
            this.publicIpAddress = model.publicIpAddress;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.securityGroupIds = model.securityGroupIds;
            this.serialNumber = model.serialNumber;
            this.status = model.status;
            this.stoppedMode = model.stoppedMode;
            this.vlanId = model.vlanId;
            this.vpcAttributes = model.vpcAttributes;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The ID of the cluster to which the instance belongs.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cls-bp67acfmxazb4p****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the <a href="~~59977#section-svb-w9d-dju~~">Performance modes</a> section of the &quot;Overview of burstable instances&quot; topic.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the <a href="~~59977#section-svb-w9d-dju~~">Performance modes</a> section of the &quot;Overview of burstable instances&quot; topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder creditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * <p>Details about the dedicated host. It is an array that consists of the DedicatedHostClusterId, DedicatedHostId, and DedicatedHostName parameters.</p>
         */
        public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The elastic IP address (EIP) associated with the instance.</p>
         */
        public Builder eipAddress(EipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * <p>Indicates whether the Jumbo Frame feature is enabled for the instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTUs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * EnableNetworkEncryption.
         */
        public Builder enableNetworkEncryption(Boolean enableNetworkEncryption) {
            this.enableNetworkEncryption = enableNetworkEncryption;
            return this;
        }

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The hostname of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the image that the instance is running.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1h46wfpjsjastc****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The internal IP address of the instance located in the classic network.</p>
         */
        public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6f5trc95ug8t33****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceName</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic: classic network</li>
         * <li>vpc: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth</li>
         * <li>PayByTraffic</li>
         * </ul>
         * <blockquote>
         * <p> When the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Indicates whether the ECS instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li>optimized: The ECS instance is I/O optimized.</li>
         * <li>none: The ECS instance is not I/O optimized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The memory size of the instance. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The reason why the instance was locked. Valid values:</p>
         * <ul>
         * <li>financial: The dedicated host was locked due to overdue payments.</li>
         * <li>security: The instance was locked due to security reasons.</li>
         * <li>recycling: The preemptible instance was locked and pending release.</li>
         * <li>dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</li>
         * <li>refunded: The instance was locked because a refund was made for the instance.</li>
         * </ul>
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * <p>The public IP address of the instance.</p>
         */
        public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the security groups to which the instance belongs.</p>
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The serial number of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>51d1353b-22bf-4567-a176-8b3e12e4****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>Pending: The instance is being created.</li>
         * <li>Running: The instance is running.</li>
         * <li>Starting: The instance is being started.</li>
         * <li>Stopping: The instance is being stopped.</li>
         * <li>Stopped: The instance is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the system implements billing after the instance is stopped. Valid values:</p>
         * <ul>
         * <li>KeepCharging: The instance is stopped in standard mode. The billing of the instance continues after the instance is stopped, and resources are retained for the instance.</li>
         * <li>StopCharging: The instance is stopped in economical mode. The billing of some resources of the instance stops after the instance is stopped. When the instance is stopped, its resources such as vCPUs, memory, and public IP address are released. The instance may be unable to start again if some required resources are out of stock in the current region.</li>
         * <li>Not-applicable: The instance does not support economical mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepCharging</p>
         */
        public Builder stoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }

        /**
         * <p>The virtual LAN (VLAN) ID of the instance.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }

        /**
         * <p>The VPC attributes of the instance.</p>
         */
        public Builder vpcAttributes(VpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }

        /**
         * <p>The ID of the zone in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class DedicatedHostAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        private DedicatedHostAttribute(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
            this.dedicatedHostName = builder.dedicatedHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostAttribute create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public static final class Builder {
            private String dedicatedHostId; 
            private String dedicatedHostName; 

            private Builder() {
            } 

            private Builder(DedicatedHostAttribute model) {
                this.dedicatedHostId = model.dedicatedHostId;
                this.dedicatedHostName = model.dedicatedHostName;
            } 

            /**
             * <p>The ID of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-2ze7qrzz6lvbfhr0****</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The name of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-autoui-create-ddh-temp</p>
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            public DedicatedHostAttribute build() {
                return new DedicatedHostAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.bandwidth = builder.bandwidth;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
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

        public static final class Builder {
            private String allocationId; 
            private Integer bandwidth; 
            private String internetChargeType; 
            private String ipAddress; 

            private Builder() {
            } 

            private Builder(EipAddress model) {
                this.allocationId = model.allocationId;
                this.bandwidth = model.bandwidth;
                this.internetChargeType = model.internetChargeType;
                this.ipAddress = model.ipAddress;
            } 

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-wz9uilio26dfscamm****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The maximum public bandwidth of the EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The billing method for network usage. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth</li>
             * <li>PayByTraffic</li>
             * </ul>
             * <blockquote>
             * <p> When the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.21.**.**</code></p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class InnerIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        private InnerIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(InnerIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * <p>The ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.21.**.**</code></p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public InnerIpAddress build() {
                return new InnerIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class LockReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            private Builder() {
            } 

            private Builder(LockReason model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * <p>The reason why the instance was locked. Valid values:</p>
             * <ul>
             * <li>financial: The instance was locked due to overdue payments.</li>
             * <li>security: The instance was locked due to security reasons.</li>
             * <li>recycling: The preemptible instance was locked and pending release.</li>
             * <li>dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</li>
             * <li>refunded: The instance was locked because a refund is made for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private java.util.List<LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List<LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List<LockReason> lockReason; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * <p>The reason why the instance was locked. Valid values:</p>
             * <ul>
             * <li>financial: The instance was locked due to overdue payments.</li>
             * <li>security: The instance was locked due to security reasons.</li>
             * <li>recycling: The preemptible instance was locked and pending release.</li>
             * <li>dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.</li>
             * <li>refunded: The instance was locked because a refund is made for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(java.util.List<LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class PublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        private PublicIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PublicIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * <p>The ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.21.**.**</code></p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List<String> securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupId; 

            private Builder() {
            } 

            private Builder(SecurityGroupIds model) {
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List<String> securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class PrivateIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        private PrivateIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List<String> ipAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpAddress model) {
                this.ipAddress = model.ipAddress;
            } 

            /**
             * <p>The ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.21.**.**</code></p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PrivateIpAddress build() {
                return new PrivateIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class VpcAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatIpAddress")
        private String natIpAddress;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VpcAttributes(Builder builder) {
            this.natIpAddress = builder.natIpAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAttributes create() {
            return builder().build();
        }

        /**
         * @return natIpAddress
         */
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        /**
         * @return privateIpAddress
         */
        public PrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
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
            private String natIpAddress; 
            private PrivateIpAddress privateIpAddress; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcAttributes model) {
                this.natIpAddress = model.natIpAddress;
                this.privateIpAddress = model.privateIpAddress;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The NAT IP address of the instance. It is used by ECS instances in different VPCs for communication.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.17.**.**</code></p>
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the instance is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6ixacqz8osrwnqb****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9e4e9pmbcnj6ki6****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcAttributes build() {
                return new VpcAttributes(this);
            } 

        } 

    }
}
