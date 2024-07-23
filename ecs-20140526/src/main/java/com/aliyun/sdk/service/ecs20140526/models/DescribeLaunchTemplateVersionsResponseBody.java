// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplateVersionsResponseBody</p>
 */
public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionSets")
    private LaunchTemplateVersionSets launchTemplateVersionSets;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLaunchTemplateVersionsResponseBody(Builder builder) {
        this.launchTemplateVersionSets = builder.launchTemplateVersionSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplateVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateVersionSets
     */
    public LaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private LaunchTemplateVersionSets launchTemplateVersionSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the launch template versions.
         */
        public Builder launchTemplateVersionSets(LaunchTemplateVersionSets launchTemplateVersionSets) {
            this.launchTemplateVersionSets = launchTemplateVersionSets;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of launch templates.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLaunchTemplateVersionsResponseBody build() {
            return new DescribeLaunchTemplateVersionsResponseBody(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
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
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            /**
             * The ID of the automatic snapshot policy.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Indicates whether the performance burst feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The category of the data disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Indicates whether to release the data disk when the instance is released.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The description of the data disk.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The device name of the data disk.
             * <p>
             * 
             * >  This parameter will be removed in the future. To ensure future compatibility, we recommend that you do not use this parameter.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The name of the data disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Indicates whether the data disk is encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The performance level of the ESSD to use as a data disk. This parameter is returned only when the value of `Category` is cloud_essd. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.
             * <p>
             * 
             * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.
             * 
             * >  This parameter is available only if you set DataDisk.N.Category to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of the data disk.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot to use to create the data disk.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

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
        public java.util.List < DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public static final class Builder {
            private java.util.List < DataDisk> dataDisk; 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class SecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

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
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class NetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterface(Builder builder) {
            this.description = builder.description;
            this.instanceType = builder.instanceType;
            this.networkInterfaceName = builder.networkInterfaceName;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return primaryIpAddress
         */
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String description; 
            private String instanceType; 
            private String networkInterfaceName; 
            private String networkInterfaceTrafficMode; 
            private String primaryIpAddress; 
            private String securityGroupId; 
            private SecurityGroupIds securityGroupIds; 
            private String vSwitchId; 

            /**
             * The description of the secondary ENI.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The name of the secondary ENI.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The communication mode of the primary ENI. Valid values:
             * <p>
             * 
             * *   Standard: uses the TCP communication mode.
             * *   HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The primary private IP address of the secondary ENI.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * The ID of the security group to which to assign the secondary ENI. The security group and the ENI must belong to the same VPC.
             * <p>
             * 
             * >  SecurityGroupId and SecurityGroupIds are mutually exclusive in the response.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups to which to assign the secondary ENI.
             * <p>
             * 
             * >  SecurityGroupId and SecurityGroupIds are mutually exclusive in the response.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The ID of the vSwitch to which to connect the ENI.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterface")
        private java.util.List < NetworkInterface> networkInterface;

        private NetworkInterfaces(Builder builder) {
            this.networkInterface = builder.networkInterface;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return networkInterface
         */
        public java.util.List < NetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

        public static final class Builder {
            private java.util.List < NetworkInterface> networkInterface; 

            /**
             * NetworkInterface.
             */
            public Builder networkInterface(java.util.List < NetworkInterface> networkInterface) {
                this.networkInterface = networkInterface;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    public static class LaunchTemplateDataSecurityGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private LaunchTemplateDataSecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateDataSecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * The ID of the security group to which to assign the secondary ENI. The security group and the ENI must belong to the same VPC.
             * <p>
             * 
             * >  SecurityGroupId and SecurityGroupIds are mutually exclusive in the response.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public LaunchTemplateDataSecurityGroupIds build() {
                return new LaunchTemplateDataSecurityGroupIds(this);
            } 

        } 

    }
    public static class InstanceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTag create() {
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
             * The key of the tag to add to the instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag to add to the instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceTag build() {
                return new InstanceTag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTag")
        private java.util.List < InstanceTag> instanceTag;

        private Tags(Builder builder) {
            this.instanceTag = builder.instanceTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return instanceTag
         */
        public java.util.List < InstanceTag> getInstanceTag() {
            return this.instanceTag;
        }

        public static final class Builder {
            private java.util.List < InstanceTag> instanceTag; 

            /**
             * InstanceTag.
             */
            public Builder instanceTag(java.util.List < InstanceTag> instanceTag) {
                this.instanceTag = instanceTag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class LaunchTemplateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableVmOsConfig")
        private Boolean enableVmOsConfig;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

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

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private NetworkInterfaces networkInterfaces;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private LaunchTemplateDataSecurityGroupIds securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.AutoSnapshotPolicyId")
        private String systemDisk_autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.BurstingEnabled")
        private Boolean systemDisk_burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Category")
        private String systemDisk_category;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.DeleteWithInstance")
        private Boolean systemDisk_deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Description")
        private String systemDisk_description;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.DiskName")
        private String systemDisk_diskName;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Encrypted")
        private String systemDisk_encrypted;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Iops")
        private Integer systemDisk_iops;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.PerformanceLevel")
        private String systemDisk_performanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.ProvisionedIops")
        private Long systemDisk_provisionedIops;

        @com.aliyun.core.annotation.NameInMap("SystemDisk.Size")
        private Integer systemDisk_size;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private LaunchTemplateData(Builder builder) {
            this.autoReleaseTime = builder.autoReleaseTime;
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.creditSpecification = builder.creditSpecification;
            this.dataDisks = builder.dataDisks;
            this.deletionProtection = builder.deletionProtection;
            this.deploymentSetId = builder.deploymentSetId;
            this.description = builder.description;
            this.enableVmOsConfig = builder.enableVmOsConfig;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.keyPairName = builder.keyPairName;
            this.networkInterfaces = builder.networkInterfaces;
            this.networkType = builder.networkType;
            this.passwordInherit = builder.passwordInherit;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.privateIpAddress = builder.privateIpAddress;
            this.ramRoleName = builder.ramRoleName;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.spotDuration = builder.spotDuration;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDisk_autoSnapshotPolicyId = builder.systemDisk_autoSnapshotPolicyId;
            this.systemDisk_burstingEnabled = builder.systemDisk_burstingEnabled;
            this.systemDisk_category = builder.systemDisk_category;
            this.systemDisk_deleteWithInstance = builder.systemDisk_deleteWithInstance;
            this.systemDisk_description = builder.systemDisk_description;
            this.systemDisk_diskName = builder.systemDisk_diskName;
            this.systemDisk_encrypted = builder.systemDisk_encrypted;
            this.systemDisk_iops = builder.systemDisk_iops;
            this.systemDisk_performanceLevel = builder.systemDisk_performanceLevel;
            this.systemDisk_provisionedIops = builder.systemDisk_provisionedIops;
            this.systemDisk_size = builder.systemDisk_size;
            this.tags = builder.tags;
            this.userData = builder.userData;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateData create() {
            return builder().build();
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
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
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
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
         * @return enableVmOsConfig
         */
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
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
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
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
         * @return ipv6AddressCount
         */
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return networkInterfaces
         */
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public LaunchTemplateDataSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return systemDisk_autoSnapshotPolicyId
         */
        public String getSystemDisk_autoSnapshotPolicyId() {
            return this.systemDisk_autoSnapshotPolicyId;
        }

        /**
         * @return systemDisk_burstingEnabled
         */
        public Boolean getSystemDisk_burstingEnabled() {
            return this.systemDisk_burstingEnabled;
        }

        /**
         * @return systemDisk_category
         */
        public String getSystemDisk_category() {
            return this.systemDisk_category;
        }

        /**
         * @return systemDisk_deleteWithInstance
         */
        public Boolean getSystemDisk_deleteWithInstance() {
            return this.systemDisk_deleteWithInstance;
        }

        /**
         * @return systemDisk_description
         */
        public String getSystemDisk_description() {
            return this.systemDisk_description;
        }

        /**
         * @return systemDisk_diskName
         */
        public String getSystemDisk_diskName() {
            return this.systemDisk_diskName;
        }

        /**
         * @return systemDisk_encrypted
         */
        public String getSystemDisk_encrypted() {
            return this.systemDisk_encrypted;
        }

        /**
         * @return systemDisk_iops
         */
        public Integer getSystemDisk_iops() {
            return this.systemDisk_iops;
        }

        /**
         * @return systemDisk_performanceLevel
         */
        public String getSystemDisk_performanceLevel() {
            return this.systemDisk_performanceLevel;
        }

        /**
         * @return systemDisk_provisionedIops
         */
        public Long getSystemDisk_provisionedIops() {
            return this.systemDisk_provisionedIops;
        }

        /**
         * @return systemDisk_size
         */
        public Integer getSystemDisk_size() {
            return this.systemDisk_size;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String autoReleaseTime; 
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String creditSpecification; 
            private DataDisks dataDisks; 
            private Boolean deletionProtection; 
            private String deploymentSetId; 
            private String description; 
            private Boolean enableVmOsConfig; 
            private String hostName; 
            private String imageId; 
            private String imageOwnerAlias; 
            private String instanceChargeType; 
            private String instanceName; 
            private String instanceType; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private Integer ipv6AddressCount; 
            private String keyPairName; 
            private NetworkInterfaces networkInterfaces; 
            private String networkType; 
            private Boolean passwordInherit; 
            private Integer period; 
            private String periodUnit; 
            private String privateIpAddress; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private LaunchTemplateDataSecurityGroupIds securityGroupIds; 
            private Integer spotDuration; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String systemDisk_autoSnapshotPolicyId; 
            private Boolean systemDisk_burstingEnabled; 
            private String systemDisk_category; 
            private Boolean systemDisk_deleteWithInstance; 
            private String systemDisk_description; 
            private String systemDisk_diskName; 
            private String systemDisk_encrypted; 
            private Integer systemDisk_iops; 
            private String systemDisk_performanceLevel; 
            private Long systemDisk_provisionedIops; 
            private Integer systemDisk_size; 
            private Tags tags; 
            private String userData; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The automatic release time of the instance.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * Indicates whether auto-renewal is enabled for the instance. This parameter is valid only if `InstanceChargeType` is set to `PrePaid`. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The auto-renewal period of the instance. Valid values:
             * <p>
             * 
             * Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
             * 
             * Default value: 1.
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * The performance mode of the burstable instance. Valid values:
             * <p>
             * 
             * *   Standard: the standard mode. For more information, see the "Standard mode" section in [Overview of burstable instances](~~59977~~).
             * *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Overview of burstable instances](~~59977~~).
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * Details about the data disks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * Indicates whether release protection is enabled for the instance. This parameter indicates whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             * 
             * >  This parameter is applicable only to pay-as-you-go instances. The release protection feature can protect instances against manual releases, but not against automatic releases.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The description of the system disk.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the operating system configuration of the instance is enabled.
             */
            public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
                this.enableVmOsConfig = enableVmOsConfig;
                return this;
            }

            /**
             * The hostname of the instance.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The source of the image. Valid values:
             * <p>
             * 
             * *   system: public image provided by Alibaba Cloud
             * *   self: custom image that you created
             * *   others: shared image from another Alibaba Cloud account
             * *   marketplace: Alibaba Cloud Marketplace image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   PrePaid: subscription
             * *   PostPaid: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The billing method for network usage.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum inbound public bandwidth.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The maximum outbound public bandwidth.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Indicates whether the instance is I/O optimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * The number of IPv6 addresses to assign to the instance.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * The name of the key pair.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Details about the secondary elastic network interfaces (ENIs).
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * The network type. Valid values:
             * <p>
             * 
             * *   classic: classic network
             * *   vpc: VPC
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Indicates whether the username and password preset in the image are used.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * The subscription duration of the instance.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The unit of the subscription period. Valid values:
             * <p>
             * 
             * Month (default)
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The private IP address to assign to the instance.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The name of the instance Resource Access Management (RAM) role.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the resource group to which the launch template belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether Security Hardening is enabled.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The ID of the security group to which to assign the instance.
             * <p>
             * 
             * >  `SecurityGroupId` and `SecurityGroupIds` are mutually exclusive in the response.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups to which to assign the instance.
             * <p>
             * 
             * >  `SecurityGroupId` and `SecurityGroupIds` are mutually exclusive in the response.
             */
            public Builder securityGroupIds(LaunchTemplateDataSecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The protection period of the preemptible instance. Unit: hours. Valid values:
             * <p>
             * 
             * *   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
             * *   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
             * 
             * Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.
             * 
             * >  This parameter is returned when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The maximum hourly price of the preemptible instance.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding policy for the pay-as-you-go instance. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is a regular pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * SystemDisk.AutoSnapshotPolicyId.
             */
            public Builder systemDisk_autoSnapshotPolicyId(String systemDisk_autoSnapshotPolicyId) {
                this.systemDisk_autoSnapshotPolicyId = systemDisk_autoSnapshotPolicyId;
                return this;
            }

            /**
             * SystemDisk.BurstingEnabled.
             */
            public Builder systemDisk_burstingEnabled(Boolean systemDisk_burstingEnabled) {
                this.systemDisk_burstingEnabled = systemDisk_burstingEnabled;
                return this;
            }

            /**
             * SystemDisk.Category.
             */
            public Builder systemDisk_category(String systemDisk_category) {
                this.systemDisk_category = systemDisk_category;
                return this;
            }

            /**
             * SystemDisk.DeleteWithInstance.
             */
            public Builder systemDisk_deleteWithInstance(Boolean systemDisk_deleteWithInstance) {
                this.systemDisk_deleteWithInstance = systemDisk_deleteWithInstance;
                return this;
            }

            /**
             * SystemDisk.Description.
             */
            public Builder systemDisk_description(String systemDisk_description) {
                this.systemDisk_description = systemDisk_description;
                return this;
            }

            /**
             * SystemDisk.DiskName.
             */
            public Builder systemDisk_diskName(String systemDisk_diskName) {
                this.systemDisk_diskName = systemDisk_diskName;
                return this;
            }

            /**
             * SystemDisk.Encrypted.
             */
            public Builder systemDisk_encrypted(String systemDisk_encrypted) {
                this.systemDisk_encrypted = systemDisk_encrypted;
                return this;
            }

            /**
             * SystemDisk.Iops.
             */
            public Builder systemDisk_iops(Integer systemDisk_iops) {
                this.systemDisk_iops = systemDisk_iops;
                return this;
            }

            /**
             * SystemDisk.PerformanceLevel.
             */
            public Builder systemDisk_performanceLevel(String systemDisk_performanceLevel) {
                this.systemDisk_performanceLevel = systemDisk_performanceLevel;
                return this;
            }

            /**
             * SystemDisk.ProvisionedIops.
             */
            public Builder systemDisk_provisionedIops(Long systemDisk_provisionedIops) {
                this.systemDisk_provisionedIops = systemDisk_provisionedIops;
                return this;
            }

            /**
             * SystemDisk.Size.
             */
            public Builder systemDisk_size(Integer systemDisk_size) {
                this.systemDisk_size = systemDisk_size;
                return this;
            }

            /**
             * The tags to add to the instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The user data of the instance, which is Base64-encoded.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The ID of the vSwitch to which to connect the instance.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public LaunchTemplateData build() {
                return new LaunchTemplateData(this);
            } 

        } 

    }
    public static class LaunchTemplateVersionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateData")
        private LaunchTemplateData launchTemplateData;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
        private String launchTemplateName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("VersionDescription")
        private String versionDescription;

        @com.aliyun.core.annotation.NameInMap("VersionNumber")
        private Long versionNumber;

        private LaunchTemplateVersionSet(Builder builder) {
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.defaultVersion = builder.defaultVersion;
            this.launchTemplateData = builder.launchTemplateData;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateName = builder.launchTemplateName;
            this.modifiedTime = builder.modifiedTime;
            this.versionDescription = builder.versionDescription;
            this.versionNumber = builder.versionNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionSet create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return defaultVersion
         */
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return launchTemplateData
         */
        public LaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateName
         */
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        /**
         * @return versionNumber
         */
        public Long getVersionNumber() {
            return this.versionNumber;
        }

        public static final class Builder {
            private String createTime; 
            private String createdBy; 
            private Boolean defaultVersion; 
            private LaunchTemplateData launchTemplateData; 
            private String launchTemplateId; 
            private String launchTemplateName; 
            private String modifiedTime; 
            private String versionDescription; 
            private Long versionNumber; 

            /**
             * The time when the launch template version was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The creator of the launch template version.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * Indicates whether the launch template version is the default version.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The configurations of the launch template.
             */
            public Builder launchTemplateData(LaunchTemplateData launchTemplateData) {
                this.launchTemplateData = launchTemplateData;
                return this;
            }

            /**
             * The ID of the launch template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The name of the launch template.
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * The time when the launch template version was modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The description of the launch template version.
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            /**
             * The number of the launch template version.
             */
            public Builder versionNumber(Long versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            public LaunchTemplateVersionSet build() {
                return new LaunchTemplateVersionSet(this);
            } 

        } 

    }
    public static class LaunchTemplateVersionSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionSet")
        private java.util.List < LaunchTemplateVersionSet> launchTemplateVersionSet;

        private LaunchTemplateVersionSets(Builder builder) {
            this.launchTemplateVersionSet = builder.launchTemplateVersionSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionSets create() {
            return builder().build();
        }

        /**
         * @return launchTemplateVersionSet
         */
        public java.util.List < LaunchTemplateVersionSet> getLaunchTemplateVersionSet() {
            return this.launchTemplateVersionSet;
        }

        public static final class Builder {
            private java.util.List < LaunchTemplateVersionSet> launchTemplateVersionSet; 

            /**
             * LaunchTemplateVersionSet.
             */
            public Builder launchTemplateVersionSet(java.util.List < LaunchTemplateVersionSet> launchTemplateVersionSet) {
                this.launchTemplateVersionSet = launchTemplateVersionSet;
                return this;
            }

            public LaunchTemplateVersionSets build() {
                return new LaunchTemplateVersionSets(this);
            } 

        } 

    }
}
