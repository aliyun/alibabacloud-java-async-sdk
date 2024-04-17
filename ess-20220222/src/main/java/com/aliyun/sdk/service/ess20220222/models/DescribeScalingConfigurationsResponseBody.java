// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingConfigurationsResponseBody</p>
 */
public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingConfigurations")
    private java.util.List < ScalingConfigurations> scalingConfigurations;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingConfigurationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingConfigurations = builder.scalingConfigurations;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingConfigurationsResponseBody create() {
        return builder().build();
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
     * @return scalingConfigurations
     */
    public java.util.List < ScalingConfigurations> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ScalingConfigurations> scalingConfigurations; 
        private Integer totalCount; 

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
         * Details of the scaling configurations.
         */
        public Builder scalingConfigurations(java.util.List < ScalingConfigurations> scalingConfigurations) {
            this.scalingConfigurations = scalingConfigurations;
            return this;
        }

        /**
         * The total number of scaling configurations.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingConfigurationsResponseBody build() {
            return new DescribeScalingConfigurationsResponseBody(this);
        } 

    } 

    public static class CustomPriorities extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("VswitchId")
        private String vswitchId;

        private CustomPriorities(Builder builder) {
            this.instanceType = builder.instanceType;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPriorities create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String instanceType; 
            private String vswitchId; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public CustomPriorities build() {
                return new CustomPriorities(this);
            } 

        } 

    }
    public static class DataDisks extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Description")
        private String description;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisks(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.burstingEnabled = builder.burstingEnabled;
            this.categories = builder.categories;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
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
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
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
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
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
            private java.util.List < String > categories; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Long provisionedIops; 
            private Integer size; 
            private String snapshotId; 

            /**
             * The ID of the automatic snapshot policy that is applied to the data disk.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Indicates whether the burst feature is enabled for the data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * > This parameter is available only if you set the `DataDisk.Category` parameter to `cloud_auto`.
             * 
             * For more information, see the [ESSD AutoPL disks](~~368372~~) topic.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The categories of the data disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk that has the highest priority, Auto Scaling creates instances by using the disk that has the next highest priority. Valid values:
             * <p>
             * 
             * *   cloud: basic disk. The DeleteWithInstance parameter of a basic disk that is created together with the instance is set to true.
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: standard SSD.
             * *   cloud_essd: ESSD.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The category of the data disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk. The DeleteWithInstance parameter of a basic disk that is created together with the instance is set to true.
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: standard SSD.
             * *   ephemeral_ssd: local standard SSD.
             * *   cloud_essd: ESSD.
             * *   cloud_auto: ESSD AutoPL disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Indicates whether the data disk is released if the instance to which the data disk is attached is released. Valid values:
             * <p>
             * 
             * *   true
             * *   false
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
             * The mount target of the data disk.
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
             * Indicates whether the data disk is encrypted. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used to encrypt the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The PL of the data disk of the ESSD category.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The provisioned input/output operations per second (IOPS) for the data disk.
             * <p>
             * 
             * > IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of the data disk. Unit: GiB.
             * <p>
             * 
             * *   Valid values if you set the Category parameter to cloud: 5 to 2000.
             * *   Valid values if you set the Category parameter to cloud_efficiency: 20 to 32768.
             * *   Valid values if you set the Category parameter to cloud_ssd: 20 to 32768.
             * *   Valid values if you set the Category parameter to cloud_essd: 20 to 32768.
             * *   Valid values if you set the Category parameter to ephemeral_ssd: 5 to 800.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot that is used to create the data disk.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class InstancePatternInfos extends TeaModel {
        @NameInMap("Architectures")
        private java.util.List < String > architectures;

        @NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Memory")
        private Float memory;

        private InstancePatternInfos(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.maxPrice = builder.maxPrice;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatternInfos create() {
            return builder().build();
        }

        /**
         * @return architectures
         */
        public java.util.List < String > getArchitectures() {
            return this.architectures;
        }

        /**
         * @return burstablePerformance
         */
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private Integer cores; 
            private java.util.List < String > excludedInstanceTypes; 
            private String instanceFamilyLevel; 
            private Float maxPrice; 
            private Float memory; 

            /**
             * The architectures of the instance types. Valid values:
             * <p>
             * 
             * *   X86: x86 architecture.
             * *   Heterogeneous: heterogeneous architecture, such as GPUs and FPGAs.
             * *   BareMetal: ECS Bare Metal Instance architecture.
             * *   Arm: ARM architecture.
             * *   SuperComputeCluster: Super Computing Cluster architecture.
             */
            public Builder architectures(java.util.List < String > architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * Indicates whether burstable instance types are included. Valid values:
             * <p>
             * 
             * *   Exclude: Burstable instance types are not included.
             * *   Include: Burstable instance types are included.
             * *   Required: Only burstable instance types are included.
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * The number of vCPUs of the instance type.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The instance types that are excluded. You can use wildcard characters such as an asterisk (\*) to exclude an instance type or an instance family. Examples:
             * <p>
             * 
             * *   ecs.c6.large: The ecs.c6.large instance type is excluded.
             * *   ecs.c6.\*: The c6 instance family is excluded.
             */
            public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * The level of the instance family.
             * <p>
             * 
             * *   EntryLevel: shared instance type. Instances of this level are cost-effective, but do not provide stable computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
             * *   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for scenarios in which high stability is required. For more information, see [Overview of instance families](~~25378~~).
             * *   CreditEntryLevel: This value is available only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview](~~59977~~) of burstable instances
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The maximum hourly price for pay-as-you-go instances or preemptible instances.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The memory size of the instance type. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        private NetworkInterfaces(Builder builder) {
            this.instanceType = builder.instanceType;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipv6AddressCount
         */
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer ipv6AddressCount; 
            private String networkInterfaceTrafficMode; 
            private java.util.List < String > securityGroupIds; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Ipv6AddressCount.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * NetworkInterfaceTrafficMode.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    public static class SchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        private String managedPrivateSpaceId;

        private SchedulerOptions(Builder builder) {
            this.managedPrivateSpaceId = builder.managedPrivateSpaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerOptions create() {
            return builder().build();
        }

        /**
         * @return managedPrivateSpaceId
         */
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

        public static final class Builder {
            private String managedPrivateSpaceId; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder managedPrivateSpaceId(String managedPrivateSpaceId) {
                this.managedPrivateSpaceId = managedPrivateSpaceId;
                return this;
            }

            public SchedulerOptions build() {
                return new SchedulerOptions(this);
            } 

        } 

    }
    public static class SpotPriceLimits extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("PriceLimit")
        private Float priceLimit;

        private SpotPriceLimits(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimits create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priceLimit
         */
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float priceLimit; 

            /**
             * The instance type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The price limit of the preemptible instance.
             */
            public Builder priceLimit(Float priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceLimits build() {
                return new SpotPriceLimits(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The key of tag N. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot start with `acs:`. The tag value cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ScalingConfigurations extends TeaModel {
        @NameInMap("Affinity")
        private String affinity;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CreditSpecification")
        private String creditSpecification;

        @NameInMap("CustomPriorities")
        private java.util.List < CustomPriorities> customPriorities;

        @NameInMap("DataDisks")
        private java.util.List < DataDisks> dataDisks;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HpcClusterId")
        private String hpcClusterId;

        @NameInMap("ImageFamily")
        private String imageFamily;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOptionsLoginAsNonRoot")
        private Boolean imageOptionsLoginAsNonRoot;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstancePatternInfos")
        private java.util.List < InstancePatternInfos> instancePatternInfos;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypes")
        private java.util.List < String > instanceTypes;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("LifecycleState")
        private String lifecycleState;

        @NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NetworkInterfaces")
        private java.util.List < NetworkInterfaces> networkInterfaces;

        @NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @NameInMap("PrivatePoolOptions.Id")
        private String privatePoolOptions_id;

        @NameInMap("PrivatePoolOptions.MatchCriteria")
        private String privatePoolOptions_matchCriteria;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @NameInMap("ScalingConfigurationName")
        private String scalingConfigurationName;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("SchedulerOptions")
        private SchedulerOptions schedulerOptions;

        @NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("SpotDuration")
        private Integer spotDuration;

        @NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @NameInMap("SpotPriceLimits")
        private java.util.List < SpotPriceLimits> spotPriceLimits;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("StorageSetId")
        private String storageSetId;

        @NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        private String systemDiskAutoSnapshotPolicyId;

        @NameInMap("SystemDiskBurstingEnabled")
        private Boolean systemDiskBurstingEnabled;

        @NameInMap("SystemDiskCategories")
        private java.util.List < String > systemDiskCategories;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @NameInMap("SystemDiskEncryptAlgorithm")
        private String systemDiskEncryptAlgorithm;

        @NameInMap("SystemDiskEncrypted")
        private Boolean systemDiskEncrypted;

        @NameInMap("SystemDiskKMSKeyId")
        private String systemDiskKMSKeyId;

        @NameInMap("SystemDiskName")
        private String systemDiskName;

        @NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskProvisionedIops")
        private Long systemDiskProvisionedIops;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Tenancy")
        private String tenancy;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("WeightedCapacities")
        private java.util.List < Integer > weightedCapacities;

        @NameInMap("ZoneId")
        private String zoneId;

        private ScalingConfigurations(Builder builder) {
            this.affinity = builder.affinity;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.creditSpecification = builder.creditSpecification;
            this.customPriorities = builder.customPriorities;
            this.dataDisks = builder.dataDisks;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.deletionProtection = builder.deletionProtection;
            this.deploymentSetId = builder.deploymentSetId;
            this.hostName = builder.hostName;
            this.hpcClusterId = builder.hpcClusterId;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOptionsLoginAsNonRoot = builder.imageOptionsLoginAsNonRoot;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.instanceDescription = builder.instanceDescription;
            this.instanceGeneration = builder.instanceGeneration;
            this.instanceName = builder.instanceName;
            this.instancePatternInfos = builder.instancePatternInfos;
            this.instanceType = builder.instanceType;
            this.instanceTypes = builder.instanceTypes;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.keyPairName = builder.keyPairName;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerWeight = builder.loadBalancerWeight;
            this.memory = builder.memory;
            this.networkInterfaces = builder.networkInterfaces;
            this.passwordInherit = builder.passwordInherit;
            this.privatePoolOptions_id = builder.privatePoolOptions_id;
            this.privatePoolOptions_matchCriteria = builder.privatePoolOptions_matchCriteria;
            this.ramRoleName = builder.ramRoleName;
            this.resourceGroupId = builder.resourceGroupId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingConfigurationName = builder.scalingConfigurationName;
            this.scalingGroupId = builder.scalingGroupId;
            this.schedulerOptions = builder.schedulerOptions;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.spotDuration = builder.spotDuration;
            this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
            this.spotPriceLimits = builder.spotPriceLimits;
            this.spotStrategy = builder.spotStrategy;
            this.storageSetId = builder.storageSetId;
            this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
            this.systemDiskAutoSnapshotPolicyId = builder.systemDiskAutoSnapshotPolicyId;
            this.systemDiskBurstingEnabled = builder.systemDiskBurstingEnabled;
            this.systemDiskCategories = builder.systemDiskCategories;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskDescription = builder.systemDiskDescription;
            this.systemDiskEncryptAlgorithm = builder.systemDiskEncryptAlgorithm;
            this.systemDiskEncrypted = builder.systemDiskEncrypted;
            this.systemDiskKMSKeyId = builder.systemDiskKMSKeyId;
            this.systemDiskName = builder.systemDiskName;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskProvisionedIops = builder.systemDiskProvisionedIops;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.tenancy = builder.tenancy;
            this.userData = builder.userData;
            this.weightedCapacities = builder.weightedCapacities;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingConfigurations create() {
            return builder().build();
        }

        /**
         * @return affinity
         */
        public String getAffinity() {
            return this.affinity;
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
         * @return customPriorities
         */
        public java.util.List < CustomPriorities> getCustomPriorities() {
            return this.customPriorities;
        }

        /**
         * @return dataDisks
         */
        public java.util.List < DataDisks> getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
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
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hpcClusterId
         */
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        /**
         * @return imageFamily
         */
        public String getImageFamily() {
            return this.imageFamily;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageOptionsLoginAsNonRoot
         */
        public Boolean getImageOptionsLoginAsNonRoot() {
            return this.imageOptionsLoginAsNonRoot;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceGeneration
         */
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instancePatternInfos
         */
        public java.util.List < InstancePatternInfos> getInstancePatternInfos() {
            return this.instancePatternInfos;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List < String > getInstanceTypes() {
            return this.instanceTypes;
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
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerWeight
         */
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return networkInterfaces
         */
        public java.util.List < NetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return privatePoolOptions_id
         */
        public String getPrivatePoolOptions_id() {
            return this.privatePoolOptions_id;
        }

        /**
         * @return privatePoolOptions_matchCriteria
         */
        public String getPrivatePoolOptions_matchCriteria() {
            return this.privatePoolOptions_matchCriteria;
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
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        /**
         * @return scalingConfigurationName
         */
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return schedulerOptions
         */
        public SchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
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
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotInterruptionBehavior
         */
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        /**
         * @return spotPriceLimits
         */
        public java.util.List < SpotPriceLimits> getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return storageSetId
         */
        public String getStorageSetId() {
            return this.storageSetId;
        }

        /**
         * @return storageSetPartitionNumber
         */
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        /**
         * @return systemDiskAutoSnapshotPolicyId
         */
        public String getSystemDiskAutoSnapshotPolicyId() {
            return this.systemDiskAutoSnapshotPolicyId;
        }

        /**
         * @return systemDiskBurstingEnabled
         */
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        /**
         * @return systemDiskCategories
         */
        public java.util.List < String > getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskDescription
         */
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        /**
         * @return systemDiskEncryptAlgorithm
         */
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        /**
         * @return systemDiskEncrypted
         */
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        /**
         * @return systemDiskKMSKeyId
         */
        public String getSystemDiskKMSKeyId() {
            return this.systemDiskKMSKeyId;
        }

        /**
         * @return systemDiskName
         */
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskProvisionedIops
         */
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenancy
         */
        public String getTenancy() {
            return this.tenancy;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return weightedCapacities
         */
        public java.util.List < Integer > getWeightedCapacities() {
            return this.weightedCapacities;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String affinity; 
            private Integer cpu; 
            private String creationTime; 
            private String creditSpecification; 
            private java.util.List < CustomPriorities> customPriorities; 
            private java.util.List < DataDisks> dataDisks; 
            private String dedicatedHostId; 
            private Boolean deletionProtection; 
            private String deploymentSetId; 
            private String hostName; 
            private String hpcClusterId; 
            private String imageFamily; 
            private String imageId; 
            private String imageName; 
            private Boolean imageOptionsLoginAsNonRoot; 
            private String imageOwnerAlias; 
            private String instanceDescription; 
            private String instanceGeneration; 
            private String instanceName; 
            private java.util.List < InstancePatternInfos> instancePatternInfos; 
            private String instanceType; 
            private java.util.List < String > instanceTypes; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private Integer ipv6AddressCount; 
            private String keyPairName; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private Integer memory; 
            private java.util.List < NetworkInterfaces> networkInterfaces; 
            private Boolean passwordInherit; 
            private String privatePoolOptions_id; 
            private String privatePoolOptions_matchCriteria; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String scalingConfigurationId; 
            private String scalingConfigurationName; 
            private String scalingGroupId; 
            private SchedulerOptions schedulerOptions; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private java.util.List < SpotPriceLimits> spotPriceLimits; 
            private String spotStrategy; 
            private String storageSetId; 
            private Integer storageSetPartitionNumber; 
            private String systemDiskAutoSnapshotPolicyId; 
            private Boolean systemDiskBurstingEnabled; 
            private java.util.List < String > systemDiskCategories; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskEncryptAlgorithm; 
            private Boolean systemDiskEncrypted; 
            private String systemDiskKMSKeyId; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Integer systemDiskSize; 
            private java.util.List < Tags> tags; 
            private String tenancy; 
            private String userData; 
            private java.util.List < Integer > weightedCapacities; 
            private String zoneId; 

            /**
             * Indicates whether the instance on the dedicated host is associated with the dedicated host. Valid values:
             * <p>
             * 
             * *   default: The instance is not associated with the dedicated host. If you start an instance that was stopped in Economical Mode and the original dedicated host has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.
             * *   host: The instance is associated with the dedicated host. If you start an instance that was stopped in Economical Mode, the instance remains on the original dedicated host. If the original dedicated host has insufficient resources, the instance cannot be started.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * The number of vCPUs.
             * <p>
             * 
             * You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.
             * 
             * > You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the scaling configuration was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The performance mode of the burstable instance. Valid values:
             * <p>
             * 
             * *   Standard: standard mode. For more information, see the "Standard mode" section in the [Burstable instances](~~59977~~) topic.
             * *   Unlimited: unlimited mode. For more information, see the "Unlimited mode" section in the [Burstable instances](~~59977~~) topic.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * CustomPriorities.
             */
            public Builder customPriorities(java.util.List < CustomPriorities> customPriorities) {
                this.customPriorities = customPriorities;
                return this;
            }

            /**
             * Details of the data disks.
             */
            public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the dedicated host on which the ECS instance is created. Preemptible instances cannot be created on dedicated hosts. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit parameters are ignored.
             * <p>
             * 
             * You can call the DescribeDedicatedHosts operation to query dedicated host IDs.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The ID of the deployment set to which the Elastic Compute Service (ECS) instance belongs.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The hostname of the ECS instance.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the Elastic High Performance Computing (E-HPC) cluster to which the ECS instance belongs.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * The name of the image family. If you specify this parameter, the latest custom images that are available in the specified image family are returned. You can use the images to create instances. If the ImageId parameter is specified, you cannot specify the ImageFamily parameter.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * The ID of the image that is used by Auto Scaling to create instances.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the image file.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ECS实例是否使用ecs-user用户登录。可能值：
             * <p>
             * 
             * - true：是。
             * - false：否。
             */
            public Builder imageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
                this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
                return this;
            }

            /**
             * The source of the image. Valid values:
             * <p>
             * 
             * *   system: public images provided by Alibaba Cloud
             * *   self: custom images that you create
             * *   others: shared images from other Alibaba Cloud accounts or community images published by other Alibaba Cloud accounts
             * *   marketplace: images that are available in Alibaba Cloud Marketplace
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The description of the ECS instance.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The generation of the ECS instance.
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Details of the intelligent configuration settings, which determines the range of instance types that meet the specified criteria.
             */
            public Builder instancePatternInfos(java.util.List < InstancePatternInfos> instancePatternInfos) {
                this.instancePatternInfos = instancePatternInfos;
                return this;
            }

            /**
             * The instance type of the ECS instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Details of the ECS instance types.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The billing method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: You are charged for the maximum available bandwidth that is specified by the InternetMaxBandwidthOut parameter.
             * *   PayByTraffic: You are charged for the actual data transfer. The InternetMaxBandwidthOut parameter specifies only the maximum available bandwidth.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 200.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * *   0 to 100 if you set the InternetChargeType parameter to PayByBandwidth. If you leave this parameter empty, this parameter is automatically set to 0.
             * *   0 to 100 if you set the InternetChargeType parameter to PayByTraffic. If you leave this parameter empty, an error is reported.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Indicates whether the instance is I/O optimized. Valid values:
             * <p>
             * 
             * *   none: The instance is not I/O optimized.
             * *   optimized: The instance is I/O optimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * The number of randomly generated IPv6 addresses that are allocated to the elastic network interface (ENI).
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * The name of the key pair that is used to log on to the ECS instance.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The status of the scaling configuration in the scaling group. Valid values:
             * <p>
             * 
             * *   Active: The scaling configuration is active in the scaling group. Auto Scaling uses the active scaling configuration to automatically create ECS instances.
             * *   Inactive: The scaling configuration is inactive in the scaling group. Auto Scaling does not use inactive scaling configurations to automatically create ECS instances. Inactive scaling configurations are retained in the scaling group.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The weight of the ECS instance as a backend server. Valid values: 1 to 100.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * The memory size. Unit: GiB.
             * <p>
             * 
             * You can specify the number of vCPUs and the memory size to determine the range of instance types. For example, you can set the Cpu parameter to 2 and the Memory parameter to 16 to specify the instance types that have 2 vCPUs and 16 GiB of memory. If you specify the Cpu and Memory parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling preferentially creates instances of the instance type that is provided at the lowest price.
             * 
             * > You can specify CPU and memory specifications to determine the range of instance types only if the Scaling Policy parameter is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NetworkInterfaces.
             */
            public Builder networkInterfaces(java.util.List < NetworkInterfaces> networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * Indicates whether the password preconfigured in the image is used.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * PrivatePoolOptions.Id.
             */
            public Builder privatePoolOptions_id(String privatePoolOptions_id) {
                this.privatePoolOptions_id = privatePoolOptions_id;
                return this;
            }

            /**
             * PrivatePoolOptions.MatchCriteria.
             */
            public Builder privatePoolOptions_matchCriteria(String privatePoolOptions_matchCriteria) {
                this.privatePoolOptions_matchCriteria = privatePoolOptions_matchCriteria;
                return this;
            }

            /**
             * The name of the RAM role that is associated with the ECS instance. The name is provided and maintained by Resource Access Management (RAM). You can call the ListRoles operation to query the available RAM roles.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the resource group to which the ECS instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the scaling configuration.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * The name of the scaling configuration.
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * The ID of the scaling group to which the scaling configuration belongs.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
                this.schedulerOptions = schedulerOptions;
                return this;
            }

            /**
             * Indicates whether security hardening is enabled. Valid values:
             * <p>
             * 
             * *   Active: Security hardening is enabled. This value is available only to public images.
             * *   Deactive: Security hardening is disabled. This value is available to all types of images.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The ID of the security group with which the ECS instance is associated. ECS instances that are associated with the same security group can access each other.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups with which the ECS instance is associated. ECS instances that are associated with the same security group can access each other.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The protection period of the preemptible instance. Unit: hours.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The interruption mode of the preemptible instance.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * Details of the preemptible instances.
             */
            public Builder spotPriceLimits(java.util.List < SpotPriceLimits> spotPriceLimits) {
                this.spotPriceLimits = spotPriceLimits;
                return this;
            }

            /**
             * The preemption policy that is applied to pay-as-you-go instances and preemptible instances. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is created as a pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * StorageSetId.
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * StorageSetPartitionNumber.
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * The ID of the automatic snapshot policy that is applied to the system disk.
             */
            public Builder systemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
                this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
                return this;
            }

            /**
             * Indicates whether the burst feature is enabled for the system disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * > This parameter is available only if you set the SystemDisk.Category parameter to cloud_auto.
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * The categories of the system disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk that has the highest priority, Auto Scaling creates instances by using the disk that has the next highest priority. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: ESSD
             */
            public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * The category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   ephemeral_ssd: local standard SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   cloud_auto: ESSD AutoPL disk
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The description of the system disk.
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * The algorithm that is used to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   AES-256
             * *   SM4-128
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * Indicates whether the system disk is encrypted. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
                this.systemDiskEncrypted = systemDiskEncrypted;
                return this;
            }

            /**
             * The ID of the KMS key that is used to encrypt the system disk.
             */
            public Builder systemDiskKMSKeyId(String systemDiskKMSKeyId) {
                this.systemDiskKMSKeyId = systemDiskKMSKeyId;
                return this;
            }

            /**
             * The name of the system disk.
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * The performance level (PL) of the system disk of the ESSD category.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The provisioned IOPS for the system disk.
             * <p>
             * 
             * > IOPS measures the number of read and write operations that an EBS device can process per second.
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * Details of the tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the instance is created on a dedicated host. Valid values:
             * <p>
             * 
             * *   default: The instance is created on a non-dedicated host.
             * *   host: The instance is created on a dedicated host. If you do not specify the DedicatedHostId parameter, Alibaba Cloud selects a dedicated host for the instance.
             * 
             * Default value: default.
             */
            public Builder tenancy(String tenancy) {
                this.tenancy = tenancy;
                return this;
            }

            /**
             * The user data of the ECS instance.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The weight of the instance type. The weight of an instance type indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.
             */
            public Builder weightedCapacities(java.util.List < Integer > weightedCapacities) {
                this.weightedCapacities = weightedCapacities;
                return this;
            }

            /**
             * The zone ID of the ECS instance. You can call the DescribeZones operation to query the most recent zone list.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ScalingConfigurations build() {
                return new ScalingConfigurations(this);
            } 

        } 

    }
}
