// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLaunchTemplateVersionsResponseBody</p>
 */
public class DescribeLaunchTemplateVersionsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("LaunchTemplateVersionSets")
    private LaunchTemplateVersionSets launchTemplateVersionSets;

    private DescribeLaunchTemplateVersionsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.launchTemplateVersionSets = builder.launchTemplateVersionSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplateVersionsResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return launchTemplateVersionSets
     */
    public LaunchTemplateVersionSets getLaunchTemplateVersionSets() {
        return this.launchTemplateVersionSets;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private LaunchTemplateVersionSets launchTemplateVersionSets; 

        /**
         * The number of entries to return on each page.
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
         * The current page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of instance launch templates.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the template version.
         */
        public Builder launchTemplateVersionSets(LaunchTemplateVersionSets launchTemplateVersionSets) {
            this.launchTemplateVersionSets = launchTemplateVersionSets;
            return this;
        }

        public DescribeLaunchTemplateVersionsResponseBody build() {
            return new DescribeLaunchTemplateVersionsResponseBody(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Description")
        private String description;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Device")
        private String device;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        private String encrypted;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.device = builder.device;
            this.size = builder.size;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
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

        public static final class Builder {
            private String performanceLevel; 
            private String description; 
            private String snapshotId; 
            private String device; 
            private Integer size; 
            private String diskName; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String encrypted; 

            /**
             * When you create an ESSD as a data disk, set the performance level of the disk. This parameter returns a value when "Category = cloud_essd. Possible values:
             * <p>
             * 
             * -PL0: The maximum random read/write IOPS per disk is 10,000.
             * -PL1: The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000.
             * -PL3: The maximum random read/write IOPS per disk is 1 million.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
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
             * The ID of the snapshot used by the data disk.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The device name of the data disk.
             * <p>
             * 
             * > This parameter will be discontinued soon. We recommend that you do not use this parameter to improve code compatibility.
             */
            public Builder device(String device) {
                this.device = device;
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
             * The name of the data disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The type of the data disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Indicates whether the data disk is released as the instance is released.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Indicates whether the data disk is encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class DataDisks extends TeaModel {
        @NameInMap("DataDisk")
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
        @NameInMap("SecurityGroupId")
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
        @NameInMap("NetworkInterfaceName")
        private String networkInterfaceName;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("Description")
        private String description;

        @NameInMap("PrimaryIpAddress")
        private String primaryIpAddress;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupIds")
        private SecurityGroupIds securityGroupIds;

        private NetworkInterface(Builder builder) {
            this.networkInterfaceName = builder.networkInterfaceName;
            this.vSwitchId = builder.vSwitchId;
            this.description = builder.description;
            this.primaryIpAddress = builder.primaryIpAddress;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterface create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceName
         */
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        public static final class Builder {
            private String networkInterfaceName; 
            private String vSwitchId; 
            private String description; 
            private String primaryIpAddress; 
            private String securityGroupId; 
            private SecurityGroupIds securityGroupIds; 

            /**
             * The name of the secondary eni.
             */
            public Builder networkInterfaceName(String networkInterfaceName) {
                this.networkInterfaceName = networkInterfaceName;
                return this;
            }

            /**
             * The ID of the vSwitch to which the Eni belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The description of the secondary eni.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The primary private IP address of the secondary Eni.
             */
            public Builder primaryIpAddress(String primaryIpAddress) {
                this.primaryIpAddress = primaryIpAddress;
                return this;
            }

            /**
             * The ID of the security group to which the secondary Eni belongs. Must be a security group in the same VPC.
             * <p>
             * 
             * > SecurityGroupId and SecurityGroupIds do not return values at the same time.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public NetworkInterface build() {
                return new NetworkInterface(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
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
    public static class InstanceTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key of the instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the instance.
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
        @NameInMap("InstanceTag")
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
    public static class LaunchTemplateDataSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
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
             * The ID of the security group to which the secondary Eni belongs. Must be a security group in the same VPC.
             * <p>
             * 
             * > SecurityGroupId and SecurityGroupIds do not return values at the same time.
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
    public static class LaunchTemplateData extends TeaModel {
        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("SystemDisk.PerformanceLevel")
        private String systemDisk_performanceLevel;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("EnableVmOsConfig")
        private Boolean enableVmOsConfig;

        @NameInMap("Description")
        private String description;

        @NameInMap("SpotDuration")
        private Integer spotDuration;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("SystemDisk.DiskName")
        private String systemDisk_diskName;

        @NameInMap("SystemDisk.Size")
        private Integer systemDisk_size;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("SystemDisk.DeleteWithInstance")
        private Boolean systemDisk_deleteWithInstance;

        @NameInMap("SystemDisk.Category")
        private String systemDisk_category;

        @NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @NameInMap("SystemDisk.Description")
        private String systemDisk_description;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("SystemDisk.Iops")
        private Integer systemDisk_iops;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("DataDisks")
        private DataDisks dataDisks;

        @NameInMap("NetworkInterfaces")
        private NetworkInterfaces networkInterfaces;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("SecurityGroupIds")
        private LaunchTemplateDataSecurityGroupIds securityGroupIds;

        private LaunchTemplateData(Builder builder) {
            this.deploymentSetId = builder.deploymentSetId;
            this.vpcId = builder.vpcId;
            this.systemDisk_performanceLevel = builder.systemDisk_performanceLevel;
            this.keyPairName = builder.keyPairName;
            this.securityGroupId = builder.securityGroupId;
            this.networkType = builder.networkType;
            this.spotStrategy = builder.spotStrategy;
            this.enableVmOsConfig = builder.enableVmOsConfig;
            this.description = builder.description;
            this.spotDuration = builder.spotDuration;
            this.instanceName = builder.instanceName;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.userData = builder.userData;
            this.systemDisk_diskName = builder.systemDisk_diskName;
            this.systemDisk_size = builder.systemDisk_size;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.passwordInherit = builder.passwordInherit;
            this.privateIpAddress = builder.privateIpAddress;
            this.imageId = builder.imageId;
            this.systemDisk_deleteWithInstance = builder.systemDisk_deleteWithInstance;
            this.systemDisk_category = builder.systemDisk_category;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.systemDisk_description = builder.systemDisk_description;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.hostName = builder.hostName;
            this.systemDisk_iops = builder.systemDisk_iops;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.instanceType = builder.instanceType;
            this.period = builder.period;
            this.instanceChargeType = builder.instanceChargeType;
            this.ioOptimized = builder.ioOptimized;
            this.ramRoleName = builder.ramRoleName;
            this.vSwitchId = builder.vSwitchId;
            this.resourceGroupId = builder.resourceGroupId;
            this.internetChargeType = builder.internetChargeType;
            this.zoneId = builder.zoneId;
            this.dataDisks = builder.dataDisks;
            this.networkInterfaces = builder.networkInterfaces;
            this.tags = builder.tags;
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateData create() {
            return builder().build();
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return systemDisk_performanceLevel
         */
        public String getSystemDisk_performanceLevel() {
            return this.systemDisk_performanceLevel;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return enableVmOsConfig
         */
        public Boolean getEnableVmOsConfig() {
            return this.enableVmOsConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return systemDisk_diskName
         */
        public String getSystemDisk_diskName() {
            return this.systemDisk_diskName;
        }

        /**
         * @return systemDisk_size
         */
        public Integer getSystemDisk_size() {
            return this.systemDisk_size;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return systemDisk_deleteWithInstance
         */
        public Boolean getSystemDisk_deleteWithInstance() {
            return this.systemDisk_deleteWithInstance;
        }

        /**
         * @return systemDisk_category
         */
        public String getSystemDisk_category() {
            return this.systemDisk_category;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return systemDisk_description
         */
        public String getSystemDisk_description() {
            return this.systemDisk_description;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return systemDisk_iops
         */
        public Integer getSystemDisk_iops() {
            return this.systemDisk_iops;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return networkInterfaces
         */
        public NetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return securityGroupIds
         */
        public LaunchTemplateDataSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public static final class Builder {
            private String deploymentSetId; 
            private String vpcId; 
            private String systemDisk_performanceLevel; 
            private String keyPairName; 
            private String securityGroupId; 
            private String networkType; 
            private String spotStrategy; 
            private Boolean enableVmOsConfig; 
            private String description; 
            private Integer spotDuration; 
            private String instanceName; 
            private String securityEnhancementStrategy; 
            private String userData; 
            private String systemDisk_diskName; 
            private Integer systemDisk_size; 
            private Float spotPriceLimit; 
            private Boolean passwordInherit; 
            private String privateIpAddress; 
            private String imageId; 
            private Boolean systemDisk_deleteWithInstance; 
            private String systemDisk_category; 
            private String autoReleaseTime; 
            private String systemDisk_description; 
            private String imageOwnerAlias; 
            private String hostName; 
            private Integer systemDisk_iops; 
            private Integer internetMaxBandwidthOut; 
            private Integer internetMaxBandwidthIn; 
            private String instanceType; 
            private Integer period; 
            private String instanceChargeType; 
            private String ioOptimized; 
            private String ramRoleName; 
            private String vSwitchId; 
            private String resourceGroupId; 
            private String internetChargeType; 
            private String zoneId; 
            private DataDisks dataDisks; 
            private NetworkInterfaces networkInterfaces; 
            private Tags tags; 
            private LaunchTemplateDataSecurityGroupIds securityGroupIds; 

            /**
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * VPC VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * When you create an ESSD as a system disk, set the performance level of the disk. This parameter returns a value when "SystemDisk.Category = cloud_essd. Possible values:
             * <p>
             * 
             * -PL0: The maximum random read/write IOPS per disk is 10,000.
             * -PL1: The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000.
             * -PL3: The maximum random read/write IOPS per disk is 1 million.
             */
            public Builder systemDisk_performanceLevel(String systemDisk_performanceLevel) {
                this.systemDisk_performanceLevel = systemDisk_performanceLevel;
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
             * The ID of the security group.
             * <p>
             * 
             * > "SecurityGroupId" and "SecurityGroupIds" do not return values at the same time.
             * 
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The network type.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The bidding policy of the pay-as-you-go instance.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Specifies whether to enable instance operating system configuration.
             */
            public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
                this.enableVmOsConfig = enableVmOsConfig;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The retention period of a preemptible instance. Unit: hours. Valid values: 0 to 6.
             * <p>
             * 
             * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
             * -If the value is 0, the mode is not protected.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
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
             * Specifies whether to enable security hardening.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The user data of the instance, encoded in Base64.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The name of the system disk.
             */
            public Builder systemDisk_diskName(String systemDisk_diskName) {
                this.systemDisk_diskName = systemDisk_diskName;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             */
            public Builder systemDisk_size(Integer systemDisk_size) {
                this.systemDisk_size = systemDisk_size;
                return this;
            }

            /**
             * Set the maximum hourly price for an instance.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * Specifies whether to inherit the username and password set in the original image.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * The private IP address of the instance.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the image used by the instance.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Indicates whether the system disk is released with the instance.
             */
            public Builder systemDisk_deleteWithInstance(Boolean systemDisk_deleteWithInstance) {
                this.systemDisk_deleteWithInstance = systemDisk_deleteWithInstance;
                return this;
            }

            /**
             * The type of the system disk.
             */
            public Builder systemDisk_category(String systemDisk_category) {
                this.systemDisk_category = systemDisk_category;
                return this;
            }

            /**
             * The automatic release time.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * The description of the system disk.
             */
            public Builder systemDisk_description(String systemDisk_description) {
                this.systemDisk_description = systemDisk_description;
                return this;
            }

            /**
             * The source of the image.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
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
             * The number of I/O operations per second on the system disk.
             * <p>
             * 
             * > This parameter will be discontinued soon. To improve code compatibility, try to use other parameters.
             */
            public Builder systemDisk_iops(Integer systemDisk_iops) {
                this.systemDisk_iops = systemDisk_iops;
                return this;
            }

            /**
             * The maximum outbound Internet bandwidth.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The duration of the resource purchase.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The billing method of the instance.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * The name of the instance RAM role.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the vSwitch to which the instance belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
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
             * The billing method of the Internet bandwidth.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The collection of data disks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The attribute set of the secondary Eni.
             */
            public Builder networkInterfaces(NetworkInterfaces networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * The tag of the instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(LaunchTemplateDataSecurityGroupIds securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public LaunchTemplateData build() {
                return new LaunchTemplateData(this);
            } 

        } 

    }
    public static class LaunchTemplateVersionSet extends TeaModel {
        @NameInMap("LaunchTemplateName")
        private String launchTemplateName;

        @NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @NameInMap("VersionNumber")
        private Long versionNumber;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("VersionDescription")
        private String versionDescription;

        @NameInMap("LaunchTemplateData")
        private LaunchTemplateData launchTemplateData;

        private LaunchTemplateVersionSet(Builder builder) {
            this.launchTemplateName = builder.launchTemplateName;
            this.defaultVersion = builder.defaultVersion;
            this.versionNumber = builder.versionNumber;
            this.modifiedTime = builder.modifiedTime;
            this.launchTemplateId = builder.launchTemplateId;
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.versionDescription = builder.versionDescription;
            this.launchTemplateData = builder.launchTemplateData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateVersionSet create() {
            return builder().build();
        }

        /**
         * @return launchTemplateName
         */
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        /**
         * @return defaultVersion
         */
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return versionNumber
         */
        public Long getVersionNumber() {
            return this.versionNumber;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
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
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        /**
         * @return launchTemplateData
         */
        public LaunchTemplateData getLaunchTemplateData() {
            return this.launchTemplateData;
        }

        public static final class Builder {
            private String launchTemplateName; 
            private Boolean defaultVersion; 
            private Long versionNumber; 
            private String modifiedTime; 
            private String launchTemplateId; 
            private String createTime; 
            private String createdBy; 
            private String versionDescription; 
            private LaunchTemplateData launchTemplateData; 

            /**
             * The name of the template.
             */
            public Builder launchTemplateName(String launchTemplateName) {
                this.launchTemplateName = launchTemplateName;
                return this;
            }

            /**
             * The default version of the template.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The version number of the template.
             */
            public Builder versionNumber(Long versionNumber) {
                this.versionNumber = versionNumber;
                return this;
            }

            /**
             * The time when the template was modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The time when the template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The creator of the template.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The description of the template version.
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            /**
             * The template configuration.
             */
            public Builder launchTemplateData(LaunchTemplateData launchTemplateData) {
                this.launchTemplateData = launchTemplateData;
                return this;
            }

            public LaunchTemplateVersionSet build() {
                return new LaunchTemplateVersionSet(this);
            } 

        } 

    }
    public static class LaunchTemplateVersionSets extends TeaModel {
        @NameInMap("LaunchTemplateVersionSet")
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
