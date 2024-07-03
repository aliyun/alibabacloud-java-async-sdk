// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingConfigurationsResponseBody</p>
 */
public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingConfigurations")
    private java.util.List < ScalingConfigurations> scalingConfigurations;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The scaling configurations.
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
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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
             * The ECS instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The vSwitch ID.
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
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < String > categories;

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

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
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
             * Indicates whether the Performance Burst feature is enabled for the data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * >  This parameter is available only when you set `DataDisk.Category` to `cloud_auto`.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The categories of the data disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:
             * <p>
             * 
             * *   cloud: basic disk. DeleteWithInstance of a basic disk created along with the ECS instance is set to true.
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
             * *   cloud: basic disk. DeleteWithInstance of a basic disk created along with the ECS instance is set to true.
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: standard SSD.
             * *   ephemeral_ssd: local SSD.
             * *   cloud_essd: ESSD.
             * *   cloud_auto: ESSD AutoPL.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Indicates whether the data disk is released when the instance to which the data disk is attached is released. Valid values:
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
             * The ID of the Key Management Service (KMS) key that is applied to the data disk.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * The PL of the data disk that is an ESSD.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The provisioned IOPS of the data disk.
             * <p>
             * 
             * >  IOPS measures the number of read and write operations that an Elastic Block Storage (EBS) device can process per second.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB. Valid values:
             * <p>
             * 
             * *   5 to 2000 if you set Category to cloud.
             * *   20 to 32768 if you set Category to cloud_efficiency.
             * *   20 to 32768 if you set Category to cloud_ssd.
             * *   20 to 32768 if you set Category to cloud_essd.
             * *   5 to 800 if you set Category to ephemeral_ssd.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot based on which the data disk is created.
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
        @com.aliyun.core.annotation.NameInMap("Architectures")
        private java.util.List < String > architectures;

        @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuArchitectures")
        private java.util.List < String > cpuArchitectures;

        @com.aliyun.core.annotation.NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("GpuSpecs")
        private java.util.List < String > gpuSpecs;

        @com.aliyun.core.annotation.NameInMap("InstanceCategories")
        private java.util.List < String > instanceCategories;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
        private java.util.List < String > instanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

        @com.aliyun.core.annotation.NameInMap("MaximumCpuCoreCount")
        private Integer maximumCpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("MaximumGpuAmount")
        private Integer maximumGpuAmount;

        @com.aliyun.core.annotation.NameInMap("MaximumMemorySize")
        private Float maximumMemorySize;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("MinimumBaselineCredit")
        private Integer minimumBaselineCredit;

        @com.aliyun.core.annotation.NameInMap("MinimumCpuCoreCount")
        private Integer minimumCpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("MinimumEniIpv6AddressQuantity")
        private Integer minimumEniIpv6AddressQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumEniPrivateIpAddressQuantity")
        private Integer minimumEniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumEniQuantity")
        private Integer minimumEniQuantity;

        @com.aliyun.core.annotation.NameInMap("MinimumGpuAmount")
        private Integer minimumGpuAmount;

        @com.aliyun.core.annotation.NameInMap("MinimumInitialCredit")
        private Integer minimumInitialCredit;

        @com.aliyun.core.annotation.NameInMap("MinimumMemorySize")
        private Float minimumMemorySize;

        @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModels")
        private java.util.List < String > physicalProcessorModels;

        private InstancePatternInfos(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.cpuArchitectures = builder.cpuArchitectures;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.gpuSpecs = builder.gpuSpecs;
            this.instanceCategories = builder.instanceCategories;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceTypeFamilies = builder.instanceTypeFamilies;
            this.maxPrice = builder.maxPrice;
            this.maximumCpuCoreCount = builder.maximumCpuCoreCount;
            this.maximumGpuAmount = builder.maximumGpuAmount;
            this.maximumMemorySize = builder.maximumMemorySize;
            this.memory = builder.memory;
            this.minimumBaselineCredit = builder.minimumBaselineCredit;
            this.minimumCpuCoreCount = builder.minimumCpuCoreCount;
            this.minimumEniIpv6AddressQuantity = builder.minimumEniIpv6AddressQuantity;
            this.minimumEniPrivateIpAddressQuantity = builder.minimumEniPrivateIpAddressQuantity;
            this.minimumEniQuantity = builder.minimumEniQuantity;
            this.minimumGpuAmount = builder.minimumGpuAmount;
            this.minimumInitialCredit = builder.minimumInitialCredit;
            this.minimumMemorySize = builder.minimumMemorySize;
            this.physicalProcessorModels = builder.physicalProcessorModels;
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
         * @return cpuArchitectures
         */
        public java.util.List < String > getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return gpuSpecs
         */
        public java.util.List < String > getGpuSpecs() {
            return this.gpuSpecs;
        }

        /**
         * @return instanceCategories
         */
        public java.util.List < String > getInstanceCategories() {
            return this.instanceCategories;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instanceTypeFamilies
         */
        public java.util.List < String > getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return maximumCpuCoreCount
         */
        public Integer getMaximumCpuCoreCount() {
            return this.maximumCpuCoreCount;
        }

        /**
         * @return maximumGpuAmount
         */
        public Integer getMaximumGpuAmount() {
            return this.maximumGpuAmount;
        }

        /**
         * @return maximumMemorySize
         */
        public Float getMaximumMemorySize() {
            return this.maximumMemorySize;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return minimumBaselineCredit
         */
        public Integer getMinimumBaselineCredit() {
            return this.minimumBaselineCredit;
        }

        /**
         * @return minimumCpuCoreCount
         */
        public Integer getMinimumCpuCoreCount() {
            return this.minimumCpuCoreCount;
        }

        /**
         * @return minimumEniIpv6AddressQuantity
         */
        public Integer getMinimumEniIpv6AddressQuantity() {
            return this.minimumEniIpv6AddressQuantity;
        }

        /**
         * @return minimumEniPrivateIpAddressQuantity
         */
        public Integer getMinimumEniPrivateIpAddressQuantity() {
            return this.minimumEniPrivateIpAddressQuantity;
        }

        /**
         * @return minimumEniQuantity
         */
        public Integer getMinimumEniQuantity() {
            return this.minimumEniQuantity;
        }

        /**
         * @return minimumGpuAmount
         */
        public Integer getMinimumGpuAmount() {
            return this.minimumGpuAmount;
        }

        /**
         * @return minimumInitialCredit
         */
        public Integer getMinimumInitialCredit() {
            return this.minimumInitialCredit;
        }

        /**
         * @return minimumMemorySize
         */
        public Float getMinimumMemorySize() {
            return this.minimumMemorySize;
        }

        /**
         * @return physicalProcessorModels
         */
        public java.util.List < String > getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private Integer cores; 
            private java.util.List < String > cpuArchitectures; 
            private java.util.List < String > excludedInstanceTypes; 
            private java.util.List < String > gpuSpecs; 
            private java.util.List < String > instanceCategories; 
            private String instanceFamilyLevel; 
            private java.util.List < String > instanceTypeFamilies; 
            private Float maxPrice; 
            private Integer maximumCpuCoreCount; 
            private Integer maximumGpuAmount; 
            private Float maximumMemorySize; 
            private Float memory; 
            private Integer minimumBaselineCredit; 
            private Integer minimumCpuCoreCount; 
            private Integer minimumEniIpv6AddressQuantity; 
            private Integer minimumEniPrivateIpAddressQuantity; 
            private Integer minimumEniQuantity; 
            private Integer minimumGpuAmount; 
            private Integer minimumInitialCredit; 
            private Float minimumMemorySize; 
            private java.util.List < String > physicalProcessorModels; 

            /**
             * The architecture types of the instance types. Valid values:
             * <p>
             * 
             * *   X86: x86
             * *   Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated
             * *   BareMetal: ECS Bare Metal Instance
             * *   Arm: Arm
             * *   SuperComputeCluster: Super Computing Cluster
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
             * CpuArchitectures.
             */
            public Builder cpuArchitectures(java.util.List < String > cpuArchitectures) {
                this.cpuArchitectures = cpuArchitectures;
                return this;
            }

            /**
             * The instance types that are excluded. You can use wildcard characters, such as an asterisk (\*), to exclude an instance type or an instance family. Examples:
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
             * GpuSpecs.
             */
            public Builder gpuSpecs(java.util.List < String > gpuSpecs) {
                this.gpuSpecs = gpuSpecs;
                return this;
            }

            /**
             * InstanceCategories.
             */
            public Builder instanceCategories(java.util.List < String > instanceCategories) {
                this.instanceCategories = instanceCategories;
                return this;
            }

            /**
             * The level of the instance family.
             * <p>
             * 
             * *   EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
             * *   EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources, and are suitable for scenarios that require high stability. For more information, see [Overview of instance families](~~25378~~).
             * *   CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview of burstable instances](~~59977~~).
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * InstanceTypeFamilies.
             */
            public Builder instanceTypeFamilies(java.util.List < String > instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * The maximum hourly price for the pay-as-you-go or preemptible instances.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * MaximumCpuCoreCount.
             */
            public Builder maximumCpuCoreCount(Integer maximumCpuCoreCount) {
                this.maximumCpuCoreCount = maximumCpuCoreCount;
                return this;
            }

            /**
             * MaximumGpuAmount.
             */
            public Builder maximumGpuAmount(Integer maximumGpuAmount) {
                this.maximumGpuAmount = maximumGpuAmount;
                return this;
            }

            /**
             * MaximumMemorySize.
             */
            public Builder maximumMemorySize(Float maximumMemorySize) {
                this.maximumMemorySize = maximumMemorySize;
                return this;
            }

            /**
             * The memory size of the instance type. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * MinimumBaselineCredit.
             */
            public Builder minimumBaselineCredit(Integer minimumBaselineCredit) {
                this.minimumBaselineCredit = minimumBaselineCredit;
                return this;
            }

            /**
             * MinimumCpuCoreCount.
             */
            public Builder minimumCpuCoreCount(Integer minimumCpuCoreCount) {
                this.minimumCpuCoreCount = minimumCpuCoreCount;
                return this;
            }

            /**
             * MinimumEniIpv6AddressQuantity.
             */
            public Builder minimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
                this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
                return this;
            }

            /**
             * MinimumEniPrivateIpAddressQuantity.
             */
            public Builder minimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
                this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * MinimumEniQuantity.
             */
            public Builder minimumEniQuantity(Integer minimumEniQuantity) {
                this.minimumEniQuantity = minimumEniQuantity;
                return this;
            }

            /**
             * MinimumGpuAmount.
             */
            public Builder minimumGpuAmount(Integer minimumGpuAmount) {
                this.minimumGpuAmount = minimumGpuAmount;
                return this;
            }

            /**
             * MinimumInitialCredit.
             */
            public Builder minimumInitialCredit(Integer minimumInitialCredit) {
                this.minimumInitialCredit = minimumInitialCredit;
                return this;
            }

            /**
             * MinimumMemorySize.
             */
            public Builder minimumMemorySize(Float minimumMemorySize) {
                this.minimumMemorySize = minimumMemorySize;
                return this;
            }

            /**
             * PhysicalProcessorModels.
             */
            public Builder physicalProcessorModels(java.util.List < String > physicalProcessorModels) {
                this.physicalProcessorModels = physicalProcessorModels;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
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
             * The ENI type. Valid values:
             * <p>
             * 
             * *   Primary: the primary ENI
             * *   Secondary: the secondary ENI
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The number of randomly generated IPv6 addresses that are allocated to the primary ENI.
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * The communication mode of the ENI. Valid values:
             * <p>
             * 
             * *   Standard: The TCP communication mode is used.
             * *   HighPerformance: The Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The IDs of the security groups to which the ENIs belong.
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
        @com.aliyun.core.annotation.NameInMap("ManagedPrivateSpaceId")
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
             * >  This parameter is in invitational preview and is not available for use.
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
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("PriceLimit")
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
             * The instance type of the preemptible instances.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The price limit of the preemptible instances.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key of the ECS instance. You can specify up to 20 tags for each ECS instance.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with `acs:` or `aliyun` and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the ECS instance. You can specify up to 20 tags for each ECS instance.
             * <p>
             * 
             * The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with `acs:` and cannot contain `http://` or `https://`.
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
        @com.aliyun.core.annotation.NameInMap("Affinity")
        private String affinity;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("CustomPriorities")
        private java.util.List < CustomPriorities> customPriorities;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private java.util.List < DataDisks> dataDisks;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HpcClusterId")
        private String hpcClusterId;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOptionsLoginAsNonRoot")
        private Boolean imageOptionsLoginAsNonRoot;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstancePatternInfos")
        private java.util.List < InstancePatternInfos> instancePatternInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List < String > instanceTypes;

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

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaces")
        private java.util.List < NetworkInterfaces> networkInterfaces;

        @com.aliyun.core.annotation.NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @com.aliyun.core.annotation.NameInMap("PasswordSetted")
        private Boolean passwordSetted;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions.Id")
        private String privatePoolOptions_id;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions.MatchCriteria")
        private String privatePoolOptions_matchCriteria;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
        private String scalingConfigurationName;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
        private SchedulerOptions schedulerOptions;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimits")
        private java.util.List < SpotPriceLimits> spotPriceLimits;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("StorageSetId")
        private String storageSetId;

        @com.aliyun.core.annotation.NameInMap("StorageSetPartitionNumber")
        private Integer storageSetPartitionNumber;

        @com.aliyun.core.annotation.NameInMap("SystemDiskAutoSnapshotPolicyId")
        private String systemDiskAutoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskBurstingEnabled")
        private Boolean systemDiskBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
        private java.util.List < String > systemDiskCategories;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @com.aliyun.core.annotation.NameInMap("SystemDiskEncryptAlgorithm")
        private String systemDiskEncryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("SystemDiskEncrypted")
        private Boolean systemDiskEncrypted;

        @com.aliyun.core.annotation.NameInMap("SystemDiskKMSKeyId")
        private String systemDiskKMSKeyId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskName")
        private String systemDiskName;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskProvisionedIops")
        private Long systemDiskProvisionedIops;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Tenancy")
        private String tenancy;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacities")
        private java.util.List < Integer > weightedCapacities;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ScalingConfigurations(Builder builder) {
            this.affinity = builder.affinity;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.creditSpecification = builder.creditSpecification;
            this.customPriorities = builder.customPriorities;
            this.dataDisks = builder.dataDisks;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
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
            this.passwordSetted = builder.passwordSetted;
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
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
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
         * @return passwordSetted
         */
        public Boolean getPasswordSetted() {
            return this.passwordSetted;
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
            private String dedicatedHostClusterId; 
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
            private Boolean passwordSetted; 
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
             * Indicates whether the ECS instance on a dedicated host is associated with the dedicated host. Valid values:
             * <p>
             * 
             * *   default: The instance is not associated with the dedicated host. If you restart an instance that was stopped in Economical Mode and the original dedicated host of the instance has insufficient resources, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.
             * *   host: The instance is associated with the dedicated host. If you restart an instance that was stopped in Economical Mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot be restarted.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * The number of vCPUs.
             * <p>
             * 
             * You can specify CPU and Memory to define the range of instance types. For example, if you set CPU to 2 and Memory to 16, the instance types that have 2 vCPUs and 16 GiB are returned. If you specify CPU and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones and preferentially creates instances by using the lowest-priced instance type.
             * 
             * >  You can specify CPU and Memory to define instance types only when you set Scaling Policy to Cost Optimization and no instance type is specified in the scaling configuration.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time at which the scaling configuration was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The performance mode of the burstable instances. Valid values:
             * <p>
             * 
             * *   Standard: the standard mode. For more information, see the "Standard mode" section in the [Overview of burstable instances](~~59977~~) topic.
             * *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Overview of burstable instances](~~59977~~).
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * The priority of the custom ECS instance type + vSwitch combination.
             * <p>
             * 
             * >  This parameter takes effect only when Scaling Policy of the scaling group is set to Priority Policy.
             * 
             * If Auto Scaling cannot create ECS instances by using the custom ECS instance type + vSwitch combination of the highest priority, Auto Scaling creates ECS instances by using the custom ECS instance type + vSwitch combination of the next highest priority.
             * 
             * >  If you specify the priorities of only a portion of custom ECS instance type + vSwitch combinations, Auto Scaling preferentially creates ECS instances by using the custom combinations that have specified priorities. If the custom combinations that have specified priorities do not provide sufficient resources, Auto Scaling creates ECS instances by using the custom combinations that do not have specified priorities based on the specified orders of vSwitches and instance types.
             * 
             * *   Example: the specified order of vSwitches for your scaling group is vsw1 and vsw2 and the specified order of instance types in your scaling configuration is type1 and type 2. In addition, you use CustomPriorities to specify \["vsw2+type2", "vsw1+type2"]. In this example, the vsw2+type2 combination has the highest priority and the vsw2+type1 combination has the lowest priority. The vsw1+type2 combination has a higher priority than the vsw1+type1 combination.
             */
            public Builder customPriorities(java.util.List < CustomPriorities> customPriorities) {
                this.customPriorities = customPriorities;
                return this;
            }

            /**
             * The data disks.
             */
            public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the dedicated host cluster.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * The ID of the dedicated host on which the ECS instance is created. Preemptible instances are not supported by dedicated hosts. Therefore, if you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are ignored.
             * <p>
             * 
             * You can call the DescribeDedicatedHosts operation to query the IDs of dedicated hosts.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * Indicates whether Release Protection is enabled for the ECS instances. You can specify this parameter to determine whether the ECS instances can be deleted by using the ECS console or calling the DeleteInstance operation. Valid values:
             * <p>
             * 
             * *   true: Release Protection is enabled for the ECS instances. You cannot delete the ECS instances by using the ECS console or calling the DeleteInstance operation.
             * *   false: Release Protection is disabled for the ECS instances. You can delete the ECS instances by using the ECS console or calling the DeleteInstance operation.
             * 
             * >  You can enable Release Protection for only pay-as-you-go instances to prevent unexpected instance deletion during scale-in events. The Release Protection feature does not affect normal scaling activities. In other words, an instance that meets the criteria of scale-in policies may be removed from a scaling group during a scale-in event even if you enabled Release Protection for the instance.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The ID of the deployment set to which the Elastic Compute Service (ECS) instances belong.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The hostname series of the ECS instances.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the High Performance Computing (HPC) cluster to which the ECS instances belong.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * The name of the image family. You can specify this parameter to obtain the latest available images in the current image family for instance creation. If you specify ImageId, you cannot specify `ImageFamily`.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * The ID of the image file that provides the image resource for Auto Scaling to create ECS instances.
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
             * Indicates whether the ecs-user username can be used to log on to an ECS instance created from the scaling configuration. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder imageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
                this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
                return this;
            }

            /**
             * The image source. Valid values:
             * <p>
             * 
             * *   system: a public image provided by Alibaba Cloud
             * *   self: a custom image that you created
             * *   others: a shared image from another Alibaba Cloud account or a community image published by another Alibaba Cloud account
             * *   marketplace: an Alibaba Cloud Marketplace image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The description of the ECS instances.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The generation of the ECS instances.
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * The naming series of the ECS instances.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The information about the intelligent configuration settings, which determines the available instance types.
             */
            public Builder instancePatternInfos(java.util.List < InstancePatternInfos> instancePatternInfos) {
                this.instancePatternInfos = instancePatternInfos;
                return this;
            }

            /**
             * The instance types of the ECS instances.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ECS instance types.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The billing method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth. You are charged for the bandwidth that you specified by using InternetMaxBandwidthOut.
             * *   PayByTraffic: pay-by-traffic. You are charged for the actual traffic that you used. InternetMaxBandwidthOut specifies only the maximum available bandwidth.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum inbound bandwidth. Unit: Mbit/s. Valid values: 1 to 200.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The maximum outbound bandwidth. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * *   0 to 1024 if you set InternetChargeType to PayByBandwidth. If you leave this parameter empty, this parameter is automatically set to 0.
             * *   0 to 1024 if you set InternetChargeType to PayByTraffic. If you leave this parameter empty, an error is returned.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Indicates whether the ECS instances are I/O optimized. Valid values:
             * <p>
             * 
             * *   none: The ECS instances are not I/O optimized.
             * *   optimized: The ECS instances are I/O optimized.
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
             * The name of the key pair that is used to log on to an ECS instance created from the scaling configuration.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The status of the scaling configuration in the scaling group. Valid values:
             * <p>
             * 
             * *   Active: The scaling configuration is active in the scaling group. Auto Scaling uses the scaling configuration that is in the Active state to create ECS instances during scale-out events.
             * *   Inactive: The scaling configuration is inactive in the scaling group. Scaling configurations that are in the Inactive state are still contained in the scaling group, but Auto Scaling does not use the inactive scaling configurations to create ECS instances during scale-out events.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server. Valid values: 1 to 100.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * The memory size. Unit: GiB.
             * <p>
             * 
             * You can specify CPU and Memory to define the range of instance types. For example, if you set CPU to 2 and Memory to 16, the instance types that have 2 vCPUs and 16 GiB are returned. If you specify CPU and Memory, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones and preferentially creates instances by using the lowest-priced instance type.
             * 
             * >  You can specify CPU and Memory to define instance types only when you set Scaling Policy to Cost Optimization and no instance type is specified in the scaling configuration.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The ENIs.
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
             * PasswordSetted.
             */
            public Builder passwordSetted(Boolean passwordSetted) {
                this.passwordSetted = passwordSetted;
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
             * The name of the Resource Access Management (RAM) role assumed by the ECS instances. This name is provided and maintained by RAM. You can call the ListRoles operation to query the available RAM roles.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the resource group to which the ECS instances belong.
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
             * >  This parameter is in invitational preview and is not available for use.
             */
            public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
                this.schedulerOptions = schedulerOptions;
                return this;
            }

            /**
             * Indicates whether Security Hardening is enabled. Valid values:
             * <p>
             * 
             * *   Active: Security Hardening is enabled. This value is applicable to only public images.
             * *   Deactive: Security Hardening is disabled. This value is applicable to all images.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The ID of the security group to which the ECS instances belong. ECS instances that belong to the same security group can communicate with each other.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups to which the ECS instances belong. ECS instances that belong to the same security group can communicate with each other.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The protection period of the preemptible instances. Unit: hours.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The interruption event of the preemptible instances.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * The preemptible instances.
             */
            public Builder spotPriceLimits(java.util.List < SpotPriceLimits> spotPriceLimits) {
                this.spotPriceLimits = spotPriceLimits;
                return this;
            }

            /**
             * The preemption policy that is applied to pay-as-you-go instances. Valid values:
             * <p>
             * 
             * *   NoSpot: The instances are created as regular pay-as-you-go instances.
             * *   SpotWithPriceLimit: The instances are created as preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The ID of the storage set.
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * The maximum number of partitions in the storage set. The value is an integer that is greater than or equal to 2.
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
             * Indicates whether the Performance Burst feature is enabled for the system disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * >  This parameter is available only when you set SystemDisk.Category to cloud_auto.
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * The categories of the system disks. The values are sorted based on their priorities. The first value has the highest priority. If Auto Scaling cannot create instances by using the disk category of the highest priority, Auto Scaling creates instances by using the disk category of the next highest priority. Valid values:
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
             * *   ephemeral_ssd: local SSD
             * *   cloud_essd: enterprise SSD (ESSD)
             * *   cloud_auto: ESSD AutoPL
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
             * The encryption algorithm that is applied to the system disk. Valid values:
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
             * The ID of the KMS key that is applied to the system disk.
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
             * The performance level (PL) of the system disk that is an ESSD.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The provisioned IOPS of the system disk.
             * <p>
             * 
             * >  IOPS measures the number of read and write operations that an EBS device can process per second.
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
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the ECS instance is created on a dedicated host. Valid values:
             * <p>
             * 
             * *   default: The ECS instance is created on a non-dedicated host.
             * *   host: The ECS instance is created on a dedicated host. If you do not specify DedicatedHostId, the system selects a dedicated host for the ECS instance.
             * 
             * Default value: default.
             */
            public Builder tenancy(String tenancy) {
                this.tenancy = tenancy;
                return this;
            }

            /**
             * The user data of the ECS instances.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The weights of the instance types. The value of this parameter indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the instance type are required to meet the expected capacity requirement.
             */
            public Builder weightedCapacities(java.util.List < Integer > weightedCapacities) {
                this.weightedCapacities = weightedCapacities;
                return this;
            }

            /**
             * The ID of the zone in which the ECS instances are created. You can call the DescribeZones operation to query the zone IDs.
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
