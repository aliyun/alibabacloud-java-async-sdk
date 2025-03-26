// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceAttributeResponseBody</p>
 */
public class DescribeRCInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("CreateMode")
    private Integer createMode;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private DataDisks dataDisks;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("DedicatedHostAttribute")
    private DedicatedHostAttribute dedicatedHostAttribute;

    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.NameInMap("EcsInstanceType")
    private String ecsInstanceType;

    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private EipAddress eipAddress;

    @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
    private Boolean enableJumboFrame;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.NameInMap("HostType")
    private String hostType;

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

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

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

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VlanId")
    private String vlanId;

    @com.aliyun.core.annotation.NameInMap("VpcAttributes")
    private VpcAttributes vpcAttributes;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeRCInstanceAttributeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cpu = builder.cpu;
        this.createMode = builder.createMode;
        this.creationTime = builder.creationTime;
        this.creditSpecification = builder.creditSpecification;
        this.dataDisks = builder.dataDisks;
        this.dbType = builder.dbType;
        this.dedicatedHostAttribute = builder.dedicatedHostAttribute;
        this.deploymentSetId = builder.deploymentSetId;
        this.description = builder.description;
        this.diskType = builder.diskType;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.eipAddress = builder.eipAddress;
        this.enableJumboFrame = builder.enableJumboFrame;
        this.expiredTime = builder.expiredTime;
        this.hostName = builder.hostName;
        this.hostType = builder.hostType;
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
        this.keyPairName = builder.keyPairName;
        this.memory = builder.memory;
        this.operationLocks = builder.operationLocks;
        this.publicIpAddress = builder.publicIpAddress;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serialNumber = builder.serialNumber;
        this.spotStrategy = builder.spotStrategy;
        this.status = builder.status;
        this.stoppedMode = builder.stoppedMode;
        this.systemDisk = builder.systemDisk;
        this.tags = builder.tags;
        this.vlanId = builder.vlanId;
        this.vpcAttributes = builder.vpcAttributes;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceAttributeResponseBody create() {
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
     * @return createMode
     */
    public Integer getCreateMode() {
        return this.createMode;
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
     * @return dataDisks
     */
    public DataDisks getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return dedicatedHostAttribute
     */
    public DedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
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
     * @return hostType
     */
    public String getHostType() {
        return this.hostType;
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
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
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
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
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
        private Integer createMode; 
        private String creationTime; 
        private String creditSpecification; 
        private DataDisks dataDisks; 
        private String dbType; 
        private DedicatedHostAttribute dedicatedHostAttribute; 
        private String deploymentSetId; 
        private String description; 
        private String diskType; 
        private String ecsInstanceType; 
        private EipAddress eipAddress; 
        private Boolean enableJumboFrame; 
        private String expiredTime; 
        private String hostName; 
        private String hostType; 
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
        private String keyPairName; 
        private Integer memory; 
        private OperationLocks operationLocks; 
        private PublicIpAddress publicIpAddress; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private SecurityGroupIds securityGroupIds; 
        private String serialNumber; 
        private String spotStrategy; 
        private String status; 
        private String stoppedMode; 
        private SystemDisk systemDisk; 
        private Tags tags; 
        private String vlanId; 
        private VpcAttributes vpcAttributes; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceAttributeResponseBody model) {
            this.clusterId = model.clusterId;
            this.cpu = model.cpu;
            this.createMode = model.createMode;
            this.creationTime = model.creationTime;
            this.creditSpecification = model.creditSpecification;
            this.dataDisks = model.dataDisks;
            this.dbType = model.dbType;
            this.dedicatedHostAttribute = model.dedicatedHostAttribute;
            this.deploymentSetId = model.deploymentSetId;
            this.description = model.description;
            this.diskType = model.diskType;
            this.ecsInstanceType = model.ecsInstanceType;
            this.eipAddress = model.eipAddress;
            this.enableJumboFrame = model.enableJumboFrame;
            this.expiredTime = model.expiredTime;
            this.hostName = model.hostName;
            this.hostType = model.hostType;
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
            this.keyPairName = model.keyPairName;
            this.memory = model.memory;
            this.operationLocks = model.operationLocks;
            this.publicIpAddress = model.publicIpAddress;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.securityGroupIds = model.securityGroupIds;
            this.serialNumber = model.serialNumber;
            this.spotStrategy = model.spotStrategy;
            this.status = model.status;
            this.stoppedMode = model.stoppedMode;
            this.systemDisk = model.systemDisk;
            this.tags = model.tags;
            this.vlanId = model.vlanId;
            this.vpcAttributes = model.vpcAttributes;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The ID of the cluster to which the instance belongs.</p>
         * <blockquote>
         * <p> This parameter will be deprecated. We recommend that you use other parameters to ensure compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * CreateMode.
         */
        public Builder createMode(Integer createMode) {
            this.createMode = createMode;
            return this;
        }

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-22T06:52:23Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The performance mode of the burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder creditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * <p>The details of the data disk.</p>
         */
        public Builder dataDisks(DataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The attributes of the dedicated hosts.</p>
         */
        public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-uf6c8qerk019bj1l****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder diskType(String diskType) {
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The Elastic Compute Service (ECS) instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.2xlarge</p>
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.ecsInstanceType = ecsInstanceType;
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * <p>The expiration time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-10T00:00:00Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The instance hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>iZ2zej1n3cin51rlmby****</p>
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The storage type of the host. Valid values:</p>
         * <ul>
         * <li><strong>dhg_cloud_ssd</strong>: ESSD</li>
         * <li><strong>dhg_local_ssd</strong>: local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg_cloud_ssd</p>
         */
        public Builder hostType(String hostType) {
            this.hostType = hostType;
            return this;
        }

        /**
         * <p>The image ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2oqiu973jwcxe****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The private IP addresses of the instance in the classic network.</p>
         */
        public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-dh2jf9n6j4s14926****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>classic</strong></li>
         * <li><strong>vpc</strong></li>
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
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.x4.xlarge.6cm</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
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
         * <p>The maximum inbound bandwidth from the Internet. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound bandwidth to the Internet. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Indicates whether the instance is I/O optimized.</p>
         * <ul>
         * <li><strong>optimized</strong>: The instance is I/O optimized.</li>
         * <li><strong>none</strong>: The instance is not I/O optimized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test_01</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The memory capacity of the instance. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The reasons why the instance is locked.</p>
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
         * <p>The region ID.</p>
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
         * <p>EA2D4F34-01A7-46EB-A339-D80882135206</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security groups.</p>
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The serial number of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>b076f6ff-46d1-4234-a608-4e951ed6****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Stopping</strong></li>
         * <li><strong>Stopped</strong></li>
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
         * <p>Indicates whether the billing of the instance continues after the instance is stopped. Valid values:</p>
         * <ul>
         * <li><strong>KeepCharging</strong>: The billing of the instance continues after the instance is stopped, and resources are retained for the instance.</li>
         * <li><strong>StopCharging</strong>: The billing of the instance stops after the instance is stopped. After the instance is stopped, resources such as CPU cores, memory resources, and public IP address are released. The instance may be unable to restart if some required resources are out of stock in the current region.</li>
         * <li><strong>Not-applicable</strong>: The No Fees for Stopped Instances feature is not supported for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Not-applicable</p>
         */
        public Builder stoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The virtual LAN (VLAN) ID of the instance.</p>
         * <blockquote>
         * <p> This parameter will be deprecated. We recommend that you use other parameters to ensure compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) attributes of the instance.</p>
         */
        public Builder vpcAttributes(VpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeRCInstanceAttributeResponseBody build() {
            return new DescribeRCInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithInstance; 
            private String encrypted; 
            private String performanceLevel; 
            private Long size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.encrypted = model.encrypted;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The category of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Indicates whether the data disk is released when the instance is released. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The data disk is released when the instance is released.</li>
             * <li><strong>false</strong>: The data disk is reserved when the instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>Indicates whether the data disk is encrypted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The performance level of data disk. This parameter is available when the data disk is an Enterprise SSD (ESSD).</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        private DataDisks(Builder builder) {
            this.dataDisk = builder.dataDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List<DataDisk> dataDisk; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.dataDisk = model.dataDisk;
            } 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>None</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The name of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The EIP ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp14k3rz6cbg6zxbe****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The maximum Internet bandwidth of the EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The billing method of the Internet-facing instance. Valid values:</p>
             * <ul>
             * <li><strong>paybytraffic:</strong> pay-by-data-transfer</li>
             * <li><strong>paybybandwidth</strong>: pay-by-bandwidth</li>
             * </ul>
             * <blockquote>
             * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>paybytraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>8.147.XXX.XXX</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>8.147.XXX.XXX</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The reason why the instance is locked. Valid values:</p>
             * <ul>
             * <li><strong>financial</strong>: The instance is locked due to overdue payments.</li>
             * <li><strong>security</strong>: The instance is locked for security purposes.</li>
             * <li><strong>recycling</strong>: The instance is locked because the instance is a preemptible instance and pending to be released.</li>
             * <li><strong>dedicatedhostfinancial</strong>: The instance is locked due to overdue payments for the dedicated host.</li>
             * <li><strong>refunded</strong>: The instance is locked because a refund was made for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The reason why the instance is locked. Valid values:</p>
             * <ul>
             * <li><strong>financial</strong>: The instance is locked due to overdue payments.</li>
             * <li><strong>security</strong>: The instance is locked for security purposes.</li>
             * <li><strong>recycling</strong>: The instance is locked because the instance is a preemptible instance and pending to be released.</li>
             * <li><strong>dedicatedhostfinancial</strong>: The instance is locked due to overdue payments for the dedicated host.</li>
             * <li><strong>refunded</strong>: The instance is locked because a refund was made for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>8.147.XXX.XXX</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Long systemDiskSize;

        private SystemDisk(Builder builder) {
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Boolean deleteWithInstance; 
            private String encrypted; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskSize; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.deleteWithInstance = model.deleteWithInstance;
                this.encrypted = model.encrypted;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>Indicates whether the data disk is released when the instance is released. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The data disk is released when the instance is released.</li>
             * <li><strong>false</strong>: The data disk is reserved when the instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>Indicates whether the data disk is encrypted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskPerformanceLevel.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
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
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
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
            private String resourceId; 
            private String resourceType; 
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
    /**
     * 
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>8.147.XXX.XXX</p>
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
     * {@link DescribeRCInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceAttributeResponseBody</p>
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
             * <p>The network address translation (NAT) IP address of the instance. The NAT IP address is used by instances in different VPCs for communication.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * <p>The private IP addresses of the instance.</p>
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1nt15muovrc5qdj****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zeu747v4765aw2id****</p>
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
