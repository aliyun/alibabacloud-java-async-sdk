// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List<ScalingConfigurations> scalingConfigurations;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ScalingConfigurations> getScalingConfigurations() {
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
        private java.util.List<ScalingConfigurations> scalingConfigurations; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScalingConfigurationsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scalingConfigurations = model.scalingConfigurations;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>The scaling configurations.</p>
         */
        public Builder scalingConfigurations(java.util.List<ScalingConfigurations> scalingConfigurations) {
            this.scalingConfigurations = scalingConfigurations;
            return this;
        }

        /**
         * <p>The total number of scaling configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingConfigurationsResponseBody build() {
            return new DescribeScalingConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NestedVirtualization")
        private String nestedVirtualization;

        private CpuOptions(Builder builder) {
            this.nestedVirtualization = builder.nestedVirtualization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return nestedVirtualization
         */
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

        public static final class Builder {
            private String nestedVirtualization; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.nestedVirtualization = model.nestedVirtualization;
            } 

            /**
             * <p>Specifies whether to enable hardware-based nested virtualization. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder nestedVirtualization(String nestedVirtualization) {
                this.nestedVirtualization = nestedVirtualization;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CustomPriorities model) {
                this.instanceType = model.instanceType;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The instance type of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6a.4xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp14zolna43z266bq****</p>
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
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

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
        public java.util.List<String> getCategories() {
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
            private java.util.List<String> categories; 
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

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
                this.burstingEnabled = model.burstingEnabled;
                this.categories = model.categories;
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.description = model.description;
                this.device = model.device;
                this.diskName = model.diskName;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.size = model.size;
                this.snapshotId = model.snapshotId;
            } 

            /**
             * <p>The ID of the automatic snapshot policy applied to the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp19nq9enxqkomib****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature for the data cloud disk. Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: disables the feature.<blockquote>
             * <p>This parameter is displayed only when the DataDisk.Category parameter is set to cloud_auto.
             * &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The disk types of the data cloud disks. The first disk type has the highest priority, and the priorities of other disk types decrease in sequence. If a disk type with a higher priority is unavailable, Auto Scaling automatically attempts to create the data cloud disk by using the disk type with the next highest priority. Valid values:</p>
             * <ul>
             * <li>cloud: basic cloud disk. The DeleteWithInstance property of a basic cloud disk created along with an instance is set to true.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_regional_disk_auto: regional ESSD.</li>
             * </ul>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The category of the data cloud disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic cloud disk. The DeleteWithInstance attribute of a basic cloud disk created along with an instance is set to true.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * <li>cloud_regional_disk_auto: regional ESSD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to release the data cloud disk when the instance is released. Valid values:</p>
             * <ul>
             * <li>true: releases the data cloud disk when the instance is released.</li>
             * <li>false: retains the data cloud disk when the instance is released.</li>
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
             * <p>The description of the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mount point of the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The name of the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssdData</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
             * <ul>
             * <li>true: encrypts the data cloud disk.</li>
             * <li>false: does not encrypt the data cloud disk.
             * Default value: false.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used to encrypt the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The performance level of the data cloud disk when it is an ESSD (standard SSD).</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics of the data cloud disk.</p>
             * <blockquote>
             * <p>IOPS measures the number of I/O operations per second and indicates the read and write capabilities of the block storage. Unit: operations per second.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>cloud: 5 to 2000.</li>
             * <li>cloud_efficiency: 20 to 32768.</li>
             * <li>cloud_ssd: 20 to 32768.</li>
             * <li>cloud_essd: 20 to 32768.</li>
             * <li>ephemeral_ssd: 5 to 800.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the snapshot used to create the data cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>s-23f2i****</p>
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
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class InstancePatternInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architectures")
        private java.util.List<String> architectures;

        @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuArchitectures")
        private java.util.List<String> cpuArchitectures;

        @com.aliyun.core.annotation.NameInMap("ExcludedInstanceTypes")
        private java.util.List<String> excludedInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("GpuSpecs")
        private java.util.List<String> gpuSpecs;

        @com.aliyun.core.annotation.NameInMap("InstanceCategories")
        private java.util.List<String> instanceCategories;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
        private java.util.List<String> instanceTypeFamilies;

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
        private java.util.List<String> physicalProcessorModels;

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
        public java.util.List<String> getArchitectures() {
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
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return gpuSpecs
         */
        public java.util.List<String> getGpuSpecs() {
            return this.gpuSpecs;
        }

        /**
         * @return instanceCategories
         */
        public java.util.List<String> getInstanceCategories() {
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
        public java.util.List<String> getInstanceTypeFamilies() {
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
        public java.util.List<String> getPhysicalProcessorModels() {
            return this.physicalProcessorModels;
        }

        public static final class Builder {
            private java.util.List<String> architectures; 
            private String burstablePerformance; 
            private Integer cores; 
            private java.util.List<String> cpuArchitectures; 
            private java.util.List<String> excludedInstanceTypes; 
            private java.util.List<String> gpuSpecs; 
            private java.util.List<String> instanceCategories; 
            private String instanceFamilyLevel; 
            private java.util.List<String> instanceTypeFamilies; 
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
            private java.util.List<String> physicalProcessorModels; 

            private Builder() {
            } 

            private Builder(InstancePatternInfos model) {
                this.architectures = model.architectures;
                this.burstablePerformance = model.burstablePerformance;
                this.cores = model.cores;
                this.cpuArchitectures = model.cpuArchitectures;
                this.excludedInstanceTypes = model.excludedInstanceTypes;
                this.gpuSpecs = model.gpuSpecs;
                this.instanceCategories = model.instanceCategories;
                this.instanceFamilyLevel = model.instanceFamilyLevel;
                this.instanceTypeFamilies = model.instanceTypeFamilies;
                this.maxPrice = model.maxPrice;
                this.maximumCpuCoreCount = model.maximumCpuCoreCount;
                this.maximumGpuAmount = model.maximumGpuAmount;
                this.maximumMemorySize = model.maximumMemorySize;
                this.memory = model.memory;
                this.minimumBaselineCredit = model.minimumBaselineCredit;
                this.minimumCpuCoreCount = model.minimumCpuCoreCount;
                this.minimumEniIpv6AddressQuantity = model.minimumEniIpv6AddressQuantity;
                this.minimumEniPrivateIpAddressQuantity = model.minimumEniPrivateIpAddressQuantity;
                this.minimumEniQuantity = model.minimumEniQuantity;
                this.minimumGpuAmount = model.minimumGpuAmount;
                this.minimumInitialCredit = model.minimumInitialCredit;
                this.minimumMemorySize = model.minimumMemorySize;
                this.physicalProcessorModels = model.physicalProcessorModels;
            } 

            /**
             * <p>The architecture type of the instance type. Valid values:</p>
             * <ul>
             * <li>X86: x86 computing.</li>
             * <li>Heterogeneous: heterogeneous computing, such as GPU or FPGA.</li>
             * <li>BareMental: ECS Bare Metal server.</li>
             * <li>Arm: Arm computing.</li>
             * </ul>
             */
            public Builder architectures(java.util.List<String> architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * <p>Specifies whether the instance type is a burstable instance type. Valid values:</p>
             * <ul>
             * <li>Exclude: excludes burstable instance types.</li>
             * <li>Include: includes burstable instance types.</li>
             * <li>Required: includes only burstable instance types.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * <p>The number of vCPU cores of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The CPU architecture of the instance type. Valid values:</p>
             * <blockquote>
             * <p>N indicates that you can specify multiple CPU architectures. Valid values of N: 1 to 2.</p>
             * </blockquote>
             * <ul>
             * <li>X86.</li>
             * <li>ARM.</li>
             * </ul>
             */
            public Builder cpuArchitectures(java.util.List<String> cpuArchitectures) {
                this.cpuArchitectures = cpuArchitectures;
                return this;
            }

            /**
             * <p>The instance types to be excluded. You can use a wildcard (*) to exclude a single instance type or an entire instance family. Examples:</p>
             * <ul>
             * <li>ecs.c6.large: excludes the ecs.c6.large instance type.</li>
             * <li>ecs.c6.*: excludes all instance types in the c6 instance family.</li>
             * </ul>
             */
            public Builder excludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             */
            public Builder gpuSpecs(java.util.List<String> gpuSpecs) {
                this.gpuSpecs = gpuSpecs;
                return this;
            }

            /**
             * <p>The instance categorization. Valid values:</p>
             * <blockquote>
             * <p>N indicates that you can specify multiple instance categories in the Settings. Valid values of N: 1 to 10.</p>
             * </blockquote>
             * <ul>
             * <li>General-purpose: general-purpose.</li>
             * <li>Compute-optimized: compute-optimized.</li>
             * <li>Memory-optimized: memory-optimized.</li>
             * <li>Big data: big data.</li>
             * <li>Local SSDs: local SSD.</li>
             * <li>High Clock Speed: high frequency.</li>
             * <li>Enhanced: enhanced.</li>
             * <li>Shared: shared.</li>
             * <li>Compute-optimized with GPU: GPU computing.</li>
             * <li>Visual Compute-optimized: visual compute-optimized.</li>
             * <li>Heterogeneous Service: heterogeneous service.</li>
             * <li>Compute-optimized with FPGA: FPGA-accelerated compute-optimized.</li>
             * <li>Compute-optimized with NPU: NPU-accelerated compute-optimized.</li>
             * <li>ECS Bare Metal: ECS Bare Metal server.</li>
             * <li>High Performance Compute: high-performance computing (HPC).</li>
             * </ul>
             */
            public Builder instanceCategories(java.util.List<String> instanceCategories) {
                this.instanceCategories = instanceCategories;
                return this;
            }

            /**
             * <p>The level of the instance family. Valid values:</p>
             * <ul>
             * <li>EntryLevel: entry-level instance families, which are shared instance families. These instance families are more cost-effective but do not guarantee consistent computing performance. They are suitable for workloads with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
             * <li>EnterpriseLevel: enterprise-level instance families. These instance families provide stable performance and dedicated resources, and are suitable for workloads that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
             * <li>CreditEntryLevel: credit entry-level instance families, which are burstable instances. These instance families use CPU credits to maintain computing performance and are suitable for workloads with low CPU utilization but occasional CPU bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The instance families to be queried. N indicates that you can specify multiple instance families. Valid values of N: 1 to 10.</p>
             */
            public Builder instanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * <p>The maximum hourly price acceptable for pay-as-you-go or spot instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The maximum number of vCPU cores of the instance type.</p>
             * <blockquote>
             * <p>The value of MaximumCpuCoreCount cannot exceed four times the value of MinimumCpuCoreCount.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maximumCpuCoreCount(Integer maximumCpuCoreCount) {
                this.maximumCpuCoreCount = maximumCpuCoreCount;
                return this;
            }

            /**
             * <p>The maximum number of GPUs for the instance. Valid values: positive integers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maximumGpuAmount(Integer maximumGpuAmount) {
                this.maximumGpuAmount = maximumGpuAmount;
                return this;
            }

            /**
             * <p>The maximum memory size of the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maximumMemorySize(Float maximumMemorySize) {
                this.maximumMemorySize = maximumMemorySize;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum baseline vCPU computing performance (the sum of all vCPUs) for t5 and t6 burstable instances.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minimumBaselineCredit(Integer minimumBaselineCredit) {
                this.minimumBaselineCredit = minimumBaselineCredit;
                return this;
            }

            /**
             * <p>The minimum number of vCPU cores of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumCpuCoreCount(Integer minimumCpuCoreCount) {
                this.minimumCpuCoreCount = minimumCpuCoreCount;
                return this;
            }

            /**
             * <p>The minimum value for the maximum number of IPv6 addresses supported by a single elastic network interfaces (ENIs) on the instance. Each ENI is a network interface controller (NIC).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
                this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
                return this;
            }

            /**
             * <p>The minimum value for the maximum number of IPv4 addresses supported by a single elastic network interfaces (ENIs) on the instance. Each ENI is a network interface controller (NIC).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
                this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * <p>The minimum value for the maximum number of elastic network interfaces (ENIs) that can be attached to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumEniQuantity(Integer minimumEniQuantity) {
                this.minimumEniQuantity = minimumEniQuantity;
                return this;
            }

            /**
             * <p>The minimum number of GPUs for the instance. Valid values: positive integers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minimumGpuAmount(Integer minimumGpuAmount) {
                this.minimumGpuAmount = minimumGpuAmount;
                return this;
            }

            /**
             * <p>The minimum initial vCPU credit value for t5 and t6 burstable instances.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minimumInitialCredit(Integer minimumInitialCredit) {
                this.minimumInitialCredit = minimumInitialCredit;
                return this;
            }

            /**
             * <p>The minimum memory size of the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minimumMemorySize(Float minimumMemorySize) {
                this.minimumMemorySize = minimumMemorySize;
                return this;
            }

            /**
             * <p>The processor model of the instance. N indicates that you can specify multiple processor models. Valid values of N: 1 to 10.</p>
             */
            public Builder physicalProcessorModels(java.util.List<String> physicalProcessorModels) {
                this.physicalProcessorModels = physicalProcessorModels;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class InstanceTypeCandidateOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCidrBlocks")
        private java.util.List<String> allowCidrBlocks;

        @com.aliyun.core.annotation.NameInMap("AllowCrossAz")
        private Boolean allowCrossAz;

        @com.aliyun.core.annotation.NameInMap("AllowDifferentGeneration")
        private Boolean allowDifferentGeneration;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

        private InstanceTypeCandidateOptions(Builder builder) {
            this.allowCidrBlocks = builder.allowCidrBlocks;
            this.allowCrossAz = builder.allowCrossAz;
            this.allowDifferentGeneration = builder.allowDifferentGeneration;
            this.enabled = builder.enabled;
            this.maxPrice = builder.maxPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeCandidateOptions create() {
            return builder().build();
        }

        /**
         * @return allowCidrBlocks
         */
        public java.util.List<String> getAllowCidrBlocks() {
            return this.allowCidrBlocks;
        }

        /**
         * @return allowCrossAz
         */
        public Boolean getAllowCrossAz() {
            return this.allowCrossAz;
        }

        /**
         * @return allowDifferentGeneration
         */
        public Boolean getAllowDifferentGeneration() {
            return this.allowDifferentGeneration;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public static final class Builder {
            private java.util.List<String> allowCidrBlocks; 
            private Boolean allowCrossAz; 
            private Boolean allowDifferentGeneration; 
            private Boolean enabled; 
            private Float maxPrice; 

            private Builder() {
            } 

            private Builder(InstanceTypeCandidateOptions model) {
                this.allowCidrBlocks = model.allowCidrBlocks;
                this.allowCrossAz = model.allowCrossAz;
                this.allowDifferentGeneration = model.allowDifferentGeneration;
                this.enabled = model.enabled;
                this.maxPrice = model.maxPrice;
            } 

            /**
             * <p>The CIDR blocks of the vSwitches that can be selected when adding vSwitches from other zones is allowed.</p>
             */
            public Builder allowCidrBlocks(java.util.List<String> allowCidrBlocks) {
                this.allowCidrBlocks = allowCidrBlocks;
                return this;
            }

            /**
             * <p>Specifies whether to allow adding vSwitches from other zones.</p>
             * <blockquote>
             * <p>The instance types remain unchanged, and only new zones are selected as alternatives. When the scaling group fails to scale out in all selected zones due to inventory shortages or other issues, this configuration automatically adds vSwitches from new zones to the scaling group.
             * For example, if the scaling group is configured with the cn-hangzhou-h and cn-hangzhou-g zones and fails to scale out in both zones, Auto Scaling may create a vSwitch in the cn-hangzhou-k zone and add it to the scaling group based on real-time inventory.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowCrossAz(Boolean allowCrossAz) {
                this.allowCrossAz = allowCrossAz;
                return this;
            }

            /**
             * <p>Specifies whether to allow supplementing instance types from other generations.</p>
             * <ul>
             * <li>For example, if the current instance type is ecs.c7.large, enabling this option allows fallback to instance types such as ecs.c6.large and ecs.c8.large.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowDifferentGeneration(Boolean allowDifferentGeneration) {
                this.allowDifferentGeneration = allowDifferentGeneration;
                return this;
            }

            /**
             * <p>Specifies whether to enable the fallback mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum price for fallback instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            public InstanceTypeCandidateOptions build() {
                return new InstanceTypeCandidateOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class NetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
        private Integer ipv6AddressCount;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("SecondaryPrivateIpAddressCount")
        private Integer secondaryPrivateIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private NetworkInterfaces(Builder builder) {
            this.instanceType = builder.instanceType;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
            this.securityGroupIds = builder.securityGroupIds;
            this.vSwitchIds = builder.vSwitchIds;
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
         * @return secondaryPrivateIpAddressCount
         */
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer ipv6AddressCount; 
            private String networkInterfaceTrafficMode; 
            private Integer secondaryPrivateIpAddressCount; 
            private java.util.List<String> securityGroupIds; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(NetworkInterfaces model) {
                this.instanceType = model.instanceType;
                this.ipv6AddressCount = model.ipv6AddressCount;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.secondaryPrivateIpAddressCount = model.secondaryPrivateIpAddressCount;
                this.securityGroupIds = model.securityGroupIds;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The type of the elastic network interfaces (ENIs). Valid values:</p>
             * <ul>
             * <li><p>Primary: primary network interface controller (NIC).</p>
             * </li>
             * <li><p>Secondary: secondary elastic network interfaces (ENIs).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The number of randomly generated IPv6 addresses specified for the primary ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * <p>The communication pattern of the elastic network interfaces (ENIs), which act as a network interface controller (NIC). Valid values:</p>
             * <ul>
             * <li>Standard: uses the TCP communication pattern.</li>
             * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication pattern.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighPerformance</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The number of secondary private IPv4 addresses specified for the ENI. Valid values: 1 to 49.</p>
             * <ul>
             * <li>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/overview-of-instance-families">Instance families</a>.</li>
             * <li>NetworkInterface.N.SecondaryPrivateIpAddressCount is used to specify the number of secondary private IPv4 addresses (excluding the primary private IP address of the ENI) to be assigned to the ENI. The system randomly assigns the addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the ENI belongs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
                this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
                return this;
            }

            /**
             * <p>The IDs of one or more security groups to which the elastic network interfaces (ENIs) belong. Each ENI is a network interface controller (NIC).</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the elastic network interfaces (ENIs) belong. Each ENI is a network interface controller (NIC).</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public NetworkInterfaces build() {
                return new NetworkInterfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class PrivatePoolTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PrivatePoolTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolTags create() {
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

            private Builder(PrivatePoolTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the private pool.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the private pool.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PrivatePoolTags build() {
                return new PrivatePoolTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class ResourcePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivatePoolIds")
        private java.util.List<String> privatePoolIds;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolTags")
        private java.util.List<PrivatePoolTags> privatePoolTags;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private ResourcePoolOptions(Builder builder) {
            this.privatePoolIds = builder.privatePoolIds;
            this.privatePoolTags = builder.privatePoolTags;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePoolOptions create() {
            return builder().build();
        }

        /**
         * @return privatePoolIds
         */
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        /**
         * @return privatePoolTags
         */
        public java.util.List<PrivatePoolTags> getPrivatePoolTags() {
            return this.privatePoolTags;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<String> privatePoolIds; 
            private java.util.List<PrivatePoolTags> privatePoolTags; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(ResourcePoolOptions model) {
                this.privatePoolIds = model.privatePoolIds;
                this.privatePoolTags = model.privatePoolTags;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The ID of the private pool, which is the ID of the elasticity assurance or capacity reservation.</p>
             */
            public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>Filters available Target private pools by tag.</p>
             */
            public Builder privatePoolTags(java.util.List<PrivatePoolTags> privatePoolTags) {
                this.privatePoolTags = privatePoolTags;
                return this;
            }

            /**
             * <p>Resource pools include private pools generated after the elasticity assurance or capacity reservation service takes effect, as well as public pools, which are available for selection when an instance starts. Valid values:</p>
             * <ul>
             * <li>PrivatePoolFirst: private pool first. When this policy is selected, if ResourcePoolOptions.PrivatePoolIds is specified or the PrivatePoolTags condition is met, the corresponding private pool is used first. If no private pool is specified or the specified private pool has insufficient capacity, the system automatically matches an open private pool. If no eligible private pool is available, the public pool is used to create the instance.</li>
             * <li>PrivatePoolOnly: private pool only. When this policy is selected, ResourcePoolOptions.PrivatePoolIds must be specified. If the specified private pool has insufficient capacity, the instance fails to start.</li>
             * <li>PublicPoolFirst: public pool first. The public pool is used first to create the instance. When public pool resources are insufficient, private pool resources are used as a supplement. The system preferentially matches an open private pool. If no eligible private pool is available, the system uses the Target private pool specified by ResourcePoolOptions.PrivatePoolIds or the one that meets the PrivatePoolTags condition.</li>
             * <li>None: no resource pool policy is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrivatePoolFirst</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public ResourcePoolOptions build() {
                return new ResourcePoolOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SchedulerOptions model) {
                this.managedPrivateSpaceId = model.managedPrivateSpaceId;
            } 

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testManagedPrivateSpaceId</p>
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
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class SecurityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidentialComputingMode")
        private String confidentialComputingMode;

        private SecurityOptions(Builder builder) {
            this.confidentialComputingMode = builder.confidentialComputingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityOptions create() {
            return builder().build();
        }

        /**
         * @return confidentialComputingMode
         */
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

        public static final class Builder {
            private String confidentialComputingMode; 

            private Builder() {
            } 

            private Builder(SecurityOptions model) {
                this.confidentialComputingMode = model.confidentialComputingMode;
            } 

            /**
             * <p>The confidential computing mode. Valid values:</p>
             * <ul>
             * <li>Enclave: The ECS instance uses Enclave to build a confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</li>
             * <li>TDX: builds a TDX confidential computing environment. For more information, see <a href="https://help.aliyun.com/document_detail/479090.html">Build a TDX confidential computing environment</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TDX</p>
             */
            public Builder confidentialComputingMode(String confidentialComputingMode) {
                this.confidentialComputingMode = confidentialComputingMode;
                return this;
            }

            public SecurityOptions build() {
                return new SecurityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SpotPriceLimits model) {
                this.instanceType = model.instanceType;
                this.priceLimit = model.priceLimit;
            } 

            /**
             * <p>The instance type of the spot instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The bid price for the spot instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.125</p>
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
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N of the instance. Valid values of N: 1 to 20.
             * If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>binary</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the instance. Valid values of N: 1 to 20.
             * If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs:, and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>alterTable</p>
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
    /**
     * 
     * {@link DescribeScalingConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingConfigurationsResponseBody</p>
     */
    public static class ScalingConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Affinity")
        private String affinity;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CpuOptions")
        private CpuOptions cpuOptions;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CreditSpecification")
        private String creditSpecification;

        @com.aliyun.core.annotation.NameInMap("CustomPriorities")
        private java.util.List<CustomPriorities> customPriorities;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private java.util.List<DataDisks> dataDisks;

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

        @com.aliyun.core.annotation.NameInMap("HttpEndpoint")
        private String httpEndpoint;

        @com.aliyun.core.annotation.NameInMap("HttpTokens")
        private String httpTokens;

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
        private java.util.List<InstancePatternInfos> instancePatternInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeCandidateOptions")
        private InstanceTypeCandidateOptions instanceTypeCandidateOptions;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

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
        private java.util.List<NetworkInterfaces> networkInterfaces;

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

        @com.aliyun.core.annotation.NameInMap("ResourcePoolOptions")
        private ResourcePoolOptions resourcePoolOptions;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationName")
        private String scalingConfigurationName;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
        private SchedulerOptions schedulerOptions;

        @com.aliyun.core.annotation.NameInMap("SecondaryEniVSwitchConstraint")
        private String secondaryEniVSwitchConstraint;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SecurityOptions")
        private SecurityOptions securityOptions;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimits")
        private java.util.List<SpotPriceLimits> spotPriceLimits;

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
        private java.util.List<String> systemDiskCategories;

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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Tenancy")
        private String tenancy;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacities")
        private java.util.List<Integer> weightedCapacities;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ScalingConfigurations(Builder builder) {
            this.affinity = builder.affinity;
            this.cpu = builder.cpu;
            this.cpuOptions = builder.cpuOptions;
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
            this.httpEndpoint = builder.httpEndpoint;
            this.httpTokens = builder.httpTokens;
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
            this.instanceTypeCandidateOptions = builder.instanceTypeCandidateOptions;
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
            this.resourcePoolOptions = builder.resourcePoolOptions;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingConfigurationName = builder.scalingConfigurationName;
            this.scalingGroupId = builder.scalingGroupId;
            this.schedulerOptions = builder.schedulerOptions;
            this.secondaryEniVSwitchConstraint = builder.secondaryEniVSwitchConstraint;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.securityOptions = builder.securityOptions;
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
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
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
        public java.util.List<CustomPriorities> getCustomPriorities() {
            return this.customPriorities;
        }

        /**
         * @return dataDisks
         */
        public java.util.List<DataDisks> getDataDisks() {
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
         * @return httpEndpoint
         */
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        /**
         * @return httpTokens
         */
        public String getHttpTokens() {
            return this.httpTokens;
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
        public java.util.List<InstancePatternInfos> getInstancePatternInfos() {
            return this.instancePatternInfos;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeCandidateOptions
         */
        public InstanceTypeCandidateOptions getInstanceTypeCandidateOptions() {
            return this.instanceTypeCandidateOptions;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
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
        public java.util.List<NetworkInterfaces> getNetworkInterfaces() {
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
         * @return resourcePoolOptions
         */
        public ResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
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
         * @return secondaryEniVSwitchConstraint
         */
        public String getSecondaryEniVSwitchConstraint() {
            return this.secondaryEniVSwitchConstraint;
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
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return securityOptions
         */
        public SecurityOptions getSecurityOptions() {
            return this.securityOptions;
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
        public java.util.List<SpotPriceLimits> getSpotPriceLimits() {
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
        public java.util.List<String> getSystemDiskCategories() {
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
        public java.util.List<Tags> getTags() {
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
        public java.util.List<Integer> getWeightedCapacities() {
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
            private CpuOptions cpuOptions; 
            private String creationTime; 
            private String creditSpecification; 
            private java.util.List<CustomPriorities> customPriorities; 
            private java.util.List<DataDisks> dataDisks; 
            private String dedicatedHostClusterId; 
            private String dedicatedHostId; 
            private Boolean deletionProtection; 
            private String deploymentSetId; 
            private String hostName; 
            private String hpcClusterId; 
            private String httpEndpoint; 
            private String httpTokens; 
            private String imageFamily; 
            private String imageId; 
            private String imageName; 
            private Boolean imageOptionsLoginAsNonRoot; 
            private String imageOwnerAlias; 
            private String instanceDescription; 
            private String instanceGeneration; 
            private String instanceName; 
            private java.util.List<InstancePatternInfos> instancePatternInfos; 
            private String instanceType; 
            private InstanceTypeCandidateOptions instanceTypeCandidateOptions; 
            private java.util.List<String> instanceTypes; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private Integer ipv6AddressCount; 
            private String keyPairName; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private Integer memory; 
            private java.util.List<NetworkInterfaces> networkInterfaces; 
            private Boolean passwordInherit; 
            private Boolean passwordSetted; 
            private String privatePoolOptions_id; 
            private String privatePoolOptions_matchCriteria; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private ResourcePoolOptions resourcePoolOptions; 
            private String scalingConfigurationId; 
            private String scalingConfigurationName; 
            private String scalingGroupId; 
            private SchedulerOptions schedulerOptions; 
            private String secondaryEniVSwitchConstraint; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private java.util.List<String> securityGroupIds; 
            private SecurityOptions securityOptions; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private java.util.List<SpotPriceLimits> spotPriceLimits; 
            private String spotStrategy; 
            private String storageSetId; 
            private Integer storageSetPartitionNumber; 
            private String systemDiskAutoSnapshotPolicyId; 
            private Boolean systemDiskBurstingEnabled; 
            private java.util.List<String> systemDiskCategories; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskEncryptAlgorithm; 
            private Boolean systemDiskEncrypted; 
            private String systemDiskKMSKeyId; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Integer systemDiskSize; 
            private java.util.List<Tags> tags; 
            private String tenancy; 
            private String userData; 
            private java.util.List<Integer> weightedCapacities; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ScalingConfigurations model) {
                this.affinity = model.affinity;
                this.cpu = model.cpu;
                this.cpuOptions = model.cpuOptions;
                this.creationTime = model.creationTime;
                this.creditSpecification = model.creditSpecification;
                this.customPriorities = model.customPriorities;
                this.dataDisks = model.dataDisks;
                this.dedicatedHostClusterId = model.dedicatedHostClusterId;
                this.dedicatedHostId = model.dedicatedHostId;
                this.deletionProtection = model.deletionProtection;
                this.deploymentSetId = model.deploymentSetId;
                this.hostName = model.hostName;
                this.hpcClusterId = model.hpcClusterId;
                this.httpEndpoint = model.httpEndpoint;
                this.httpTokens = model.httpTokens;
                this.imageFamily = model.imageFamily;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOptionsLoginAsNonRoot = model.imageOptionsLoginAsNonRoot;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.instanceDescription = model.instanceDescription;
                this.instanceGeneration = model.instanceGeneration;
                this.instanceName = model.instanceName;
                this.instancePatternInfos = model.instancePatternInfos;
                this.instanceType = model.instanceType;
                this.instanceTypeCandidateOptions = model.instanceTypeCandidateOptions;
                this.instanceTypes = model.instanceTypes;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthIn = model.internetMaxBandwidthIn;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.ioOptimized = model.ioOptimized;
                this.ipv6AddressCount = model.ipv6AddressCount;
                this.keyPairName = model.keyPairName;
                this.lifecycleState = model.lifecycleState;
                this.loadBalancerWeight = model.loadBalancerWeight;
                this.memory = model.memory;
                this.networkInterfaces = model.networkInterfaces;
                this.passwordInherit = model.passwordInherit;
                this.passwordSetted = model.passwordSetted;
                this.privatePoolOptions_id = model.privatePoolOptions_id;
                this.privatePoolOptions_matchCriteria = model.privatePoolOptions_matchCriteria;
                this.ramRoleName = model.ramRoleName;
                this.resourceGroupId = model.resourceGroupId;
                this.resourcePoolOptions = model.resourcePoolOptions;
                this.scalingConfigurationId = model.scalingConfigurationId;
                this.scalingConfigurationName = model.scalingConfigurationName;
                this.scalingGroupId = model.scalingGroupId;
                this.schedulerOptions = model.schedulerOptions;
                this.secondaryEniVSwitchConstraint = model.secondaryEniVSwitchConstraint;
                this.securityEnhancementStrategy = model.securityEnhancementStrategy;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.securityOptions = model.securityOptions;
                this.spotDuration = model.spotDuration;
                this.spotInterruptionBehavior = model.spotInterruptionBehavior;
                this.spotPriceLimits = model.spotPriceLimits;
                this.spotStrategy = model.spotStrategy;
                this.storageSetId = model.storageSetId;
                this.storageSetPartitionNumber = model.storageSetPartitionNumber;
                this.systemDiskAutoSnapshotPolicyId = model.systemDiskAutoSnapshotPolicyId;
                this.systemDiskBurstingEnabled = model.systemDiskBurstingEnabled;
                this.systemDiskCategories = model.systemDiskCategories;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskDescription = model.systemDiskDescription;
                this.systemDiskEncryptAlgorithm = model.systemDiskEncryptAlgorithm;
                this.systemDiskEncrypted = model.systemDiskEncrypted;
                this.systemDiskKMSKeyId = model.systemDiskKMSKeyId;
                this.systemDiskName = model.systemDiskName;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskProvisionedIops = model.systemDiskProvisionedIops;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.tenancy = model.tenancy;
                this.userData = model.userData;
                this.weightedCapacities = model.weightedCapacities;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Specifies whether the instance on a dedicated host is associated with the dedicated host. Valid values:</p>
             * <ul>
             * <li>default: The instance is not associated with the dedicated host. If the economical mode is enabled and the original dedicated host has insufficient resources when the instance is restarted, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool.</li>
             * <li>host: The instance is associated with the dedicated host. If the economical mode is enabled and the original dedicated host has insufficient resources when the instance is restarted, the instance fails to be restarted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * <p>The number of vCPUs.
             * You can specify both the Cpu and Memory parameters to define the instance type range. For example, if you set Cpu to 2 and Memory to 16, all instance types that have 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates instances of the type that has the lowest price.</p>
             * <blockquote>
             * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance types are specified in the scaling configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The CPU options.</p>
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * <p>The time when the scaling configuration was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-14T10:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The performance mode of the burstable instance. Valid values:</p>
             * <ul>
             * <li>Standard: standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
             * <li>Unlimited: unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
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
             * <p>The custom priority of ECS instance type and vSwitch combination.</p>
             * <blockquote>
             * <p>Notice: This parameter takes effect only when the scaling policy of the scaling group is set to priority-based policy.</notice>
             * If an instance cannot be created by using ECS instance type and vSwitch combination that has the highest priority, Auto Scaling automatically uses the combination that has the next highest priority to create ECS instance.
             * If you specify custom priorities for only some instance type and vSwitch combinations, the unspecified combinations have lower priorities than the specified ones. The priorities of the unspecified combinations are determined based on the vSwitch sequence in the scaling group and ECS instance type sequence in the scaling configuration.</p>
             * <ul>
             * <li>For example, if the vSwitch sequence in the scaling group is vsw1 and vsw2, ECS instance type sequence in the scaling configuration is type1 and type2, and the custom priority sequence is [&quot;vsw2+type2&quot;, &quot;vsw1+type2&quot;], the final priority sequence is: &quot;vsw2+type2&quot; &gt; &quot;vsw1+type2&quot; &gt; &quot;vsw1+type1&quot; &gt; &quot;vsw2+type1&quot;.</li>
             * </ul>
             * </blockquote>
             */
            public Builder customPriorities(java.util.List<CustomPriorities> customPriorities) {
                this.customPriorities = customPriorities;
                return this;
            }

            /**
             * <p>The data cloud disks.</p>
             */
            public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The ID of the dedicated host cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-zm04u8r3lohsq****</p>
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * <p>The ID of the dedicated host on which to create the ECS instance. Dedicated hosts do not support spot instances. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit parameters are ignored.
             * You can call the DescribeDedicatedHosts operation to query the list of dedicated host IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp67acfmxazb4p****</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The release protection property of the instance, which specifies whether the instance can be directly released by using the ECS console or the DeleteInstance API operation. Valid values:</p>
             * <ul>
             * <li>true: Release protection is enabled. The instance cannot be directly released by using the ECS console or the DeleteInstance API operation.</li>
             * <li>false: Release protection is shutdown. The instance can be directly released by using the ECS console or the DeleteInstance API operation.<blockquote>
             * <p>This property applies only to pay-as-you-go instances. It prevents instances created by Auto Scaling during scale-out from being accidentally deleted, but does not affect normal scale-in activities. Instances with release protection enabled can still be released during scale-in activities.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The ID of the deployment set to which the ECS instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp1frxuzdg87zh4p****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>The hostname of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>LocalHost</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the High Performance Computing (HPC) cluster to which the ECS instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>hpc-clus****</p>
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
             * <ul>
             * <li>enabled: enabled.</li>
             * <li>disabled: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder httpEndpoint(String httpEndpoint) {
                this.httpEndpoint = httpEndpoint;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) when accessing instance metadata. Valid values:</p>
             * <ul>
             * <li>optional: not forcibly used.</li>
             * <li>required: forcibly used. If this value is set, instance metadata cannot be accessed in normal mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>optional</p>
             */
            public Builder httpTokens(String httpTokens) {
                this.httpTokens = httpTokens;
                return this;
            }

            /**
             * <p>The name of the image family. You can set this parameter to obtain the latest available image in the image family to create instances. If the ImageId parameter is specified, you cannot specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou-daily-update</p>
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The ID of the image file, which is the image resource used for the automatic creation of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos6u5_64_20G_aliaegis_2014****.vhd</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>Specifies whether to log on to the ECS instance as the ecs-user user. Valid values:</p>
             * <ul>
             * <li>true: yes.</li>
             * <li>false: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder imageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
                this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
                return this;
            }

            /**
             * <p>The source of the image. Valid values:</p>
             * <ul>
             * <li>system: public images provided by Alibaba Cloud.</li>
             * <li>self: custom images created by you.</li>
             * <li>others: shared images or community images provided by other Alibaba Cloud users.</li>
             * <li>marketplace: images provided by Alibaba Cloud Marketplace.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>The description of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The generation of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-3</p>
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The collection of intelligent configuration information used to filter instance types that meet your requirements.</p>
             */
            public Builder instancePatternInfos(java.util.List<InstancePatternInfos> instancePatternInfos) {
                this.instancePatternInfos = instancePatternInfos;
                return this;
            }

            /**
             * <p>The instance type of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>After the fallback mode is configured, if issues such as insufficient inventory occur, the system supplements the selected instance types with similar instance types of the same size, or creates vSwitches in fallback zones and adds them to the scaling group.</p>
             */
            public Builder instanceTypeCandidateOptions(InstanceTypeCandidateOptions instanceTypeCandidateOptions) {
                this.instanceTypeCandidateOptions = instanceTypeCandidateOptions;
                return this;
            }

            /**
             * <p>The collection of instance types for ECS instances.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The network billing method. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: pay-by-bandwidth. In this case, the InternetMaxBandwidthOut parameter specifies the fixed bandwidth value.</li>
             * <li>PayByTraffic: pay-by-traffic. In this case, the InternetMaxBandwidthOut parameter specifies the bandwidth cap, and you are billed based on the actual network traffic.</li>
             * </ul>
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
             * <p>10</p>
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
             * <ul>
             * <li>none: non-I/O optimization.</li>
             * <li>optimized: I/O optimization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>The number of IPv6 addresses that are randomly generated for the elastic network interface controller (NIC).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6AddressCount(Integer ipv6AddressCount) {
                this.ipv6AddressCount = ipv6AddressCount;
                return this;
            }

            /**
             * <p>The name of the key pair used to log on to the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>keypair****</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The lifecycle status of the scaling configuration in the scaling group. Valid values:</p>
             * <ul>
             * <li>Active: The scaling configuration is active. The scaling group uses active scaling configurations for the automatic creation of ECS instances.</li>
             * <li>Inacitve: The scaling configuration is inactive. Inactive scaling configurations exist in the scaling group, but the scaling group does not use them for the automatic creation of ECS instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * <p>The weight of the ECS instance when it is used as an SLB backend server. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.
             * You can specify both the Cpu and Memory parameters to define the instance type range. For example, if you set Cpu to 2 and Memory to 16, all instance types that have 2 vCPUs and 16 GiB of memory are matched. Auto Scaling determines the available instance types based on factors such as I/O optimization and zones, and creates instances of the type that has the lowest price.</p>
             * <blockquote>
             * <p>This configuration takes effect only when the scaling mode is set to cost optimization and no instance types are specified in the scaling configuration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The list of elastic network interfaces (ENIs). Each ENI is a network interface controller (NIC).</p>
             */
            public Builder networkInterfaces(java.util.List<NetworkInterfaces> networkInterfaces) {
                this.networkInterfaces = networkInterfaces;
                return this;
            }

            /**
             * <p>Specifies whether to use the password preset in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * <p>Specifies whether an instance password is set. Valid values:</p>
             * <ul>
             * <li>true: An instance password is set.</li>
             * <li>false: No instance password is set.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder passwordSetted(Boolean passwordSetted) {
                this.passwordSetted = passwordSetted;
                return this;
            }

            /**
             * <p>The ID of the private pool. The ID is the same as the ID of the elasticity assurance or capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder privatePoolOptions_id(String privatePoolOptions_id) {
                this.privatePoolOptions_id = privatePoolOptions_id;
                return this;
            }

            /**
             * <p>The private pool type for starting the instance. After an elasticity assurance or capacity reservation takes effect, a private pool is generated. You can select a private pool type when you start an instance. Valid values:</p>
             * <ul>
             * <li>Open: open mode. The system automatically matches a private pool of the Open type. If no matching private pool is available, the system uses resources from the public pool to start the instance.</li>
             * <li>Target: targeted mode. The system uses the specified private pool to start the instance. If the specified private pool is unavailable, the instance fails to be started.</li>
             * <li>None: no private pool. The system does not use private pools to start the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder privatePoolOptions_matchCriteria(String privatePoolOptions_matchCriteria) {
                this.privatePoolOptions_matchCriteria = privatePoolOptions_matchCriteria;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role for the ECS instance. RAM roles are provided and maintained by RAM. You can call the ListRoles operation to query available RAM roles.</p>
             * 
             * <strong>example:</strong>
             * <p>ramrole****</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the ECS instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzn2ou7xo****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource pool policy used when creating instances.</p>
             * <ul>
             * <li>This parameter takes effect only when creating pay-as-you-go instances.</li>
             * </ul>
             */
            public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
                this.resourcePoolOptions = resourcePoolOptions;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-bp1ezrfgoyn5kijl****</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * <p>The name of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>scalingconfigura****</p>
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * <p>The ID of the scaling group to which the scaling configuration belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp17pelvl720x3v7****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not available for public use.</p>
             * </blockquote>
             */
            public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
                this.schedulerOptions = schedulerOptions;
                return this;
            }

            /**
             * <p>Specifies whether a vSwitch available for secondary elastic network interfaces (ENIs) must be selected from the list when the VSwitchIds parameter is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>Strict</p>
             */
            public Builder secondaryEniVSwitchConstraint(String secondaryEniVSwitchConstraint) {
                this.secondaryEniVSwitchConstraint = secondaryEniVSwitchConstraint;
                return this;
            }

            /**
             * <p>Specifies whether to enable security hardening. Valid values:</p>
             * <ul>
             * <li>Active: enables security hardening. This value is applicable only to public images.</li>
             * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * <p>The ID of the security group to which the ECS instance belongs. ECS instances in the same security group can access each other.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp18kz60mefs****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the security groups to which the ECS instances belong. ECS instances in the same security group can access each other.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The security options.</p>
             */
            public Builder securityOptions(SecurityOptions securityOptions) {
                this.securityOptions = securityOptions;
                return this;
            }

            /**
             * <p>The protection period of the spot instance. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * <p>The interruption pattern of the spot instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Terminate</p>
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * <p>The spot instances.</p>
             */
            public Builder spotPriceLimits(java.util.List<SpotPriceLimits> spotPriceLimits) {
                this.spotPriceLimits = spotPriceLimits;
                return this;
            }

            /**
             * <p>The preemption policy for the pay-as-you-go instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: regular pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: spot instances that have a maximum hourly price.</li>
             * <li>SpotAsPriceGo: spot instances for which the system automatically bids based on the current market price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The ID of the storage set.</p>
             * 
             * <strong>example:</strong>
             * <p>ss-bp67acfmxazb4p****</p>
             */
            public Builder storageSetId(String storageSetId) {
                this.storageSetId = storageSetId;
                return this;
            }

            /**
             * <p>The maximum number of partitions in the storage set. The value must be an integer greater than or equal to 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
                this.storageSetPartitionNumber = storageSetPartitionNumber;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy applied to the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp12m37ccmxvbmi5****</p>
             */
            public Builder systemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
                this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature for the system cloud disk. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.<blockquote>
             * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The disk types for the system cloud disk. The first disk type has the highest priority, and the priorities of the other disk types decrease in sequence. If the disk type with a higher priority is unavailable, Auto Scaling automatically attempts to create the system cloud disk by using the disk type with the next highest priority. Valid values:</p>
             * <ul>
             * <li>cloud: basic cloud disk.</li>
             * <li>cloud_efficiency: ultra cloud disk.</li>
             * <li>cloud_ssd: standard SSD cloud disk.</li>
             * <li>cloud_essd: ESSD cloud disk.</li>
             * </ul>
             */
            public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * <p>The category of the system cloud disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic cloud disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The description of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>Test system disk.</p>
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * <p>The encryption algorithm used for the system cloud disk. Valid values:</p>
             * <ul>
             * <li>AES-256.</li>
             * <li>SM4-128.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AES-256</p>
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether the system cloud disk is encrypted. Valid values:</p>
             * <ul>
             * <li>true: The system cloud disk is encrypted.</li>
             * <li>false: The system cloud disk is not encrypted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
                this.systemDiskEncrypted = systemDiskEncrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key used for the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder systemDiskKMSKeyId(String systemDiskKMSKeyId) {
                this.systemDiskKMSKeyId = systemDiskKMSKeyId;
                return this;
            }

            /**
             * <p>The name of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd_Test</p>
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * <p>The performance level of the system cloud disk when it is an ESSD (standard SSD).</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The provisioned IOPS (Input/Output Operations Per Second) performance metrics for the system cloud disk.</p>
             * <blockquote>
             * <p>IOPS refers to the number of I/O operations that can be processed per second, which indicates the read and write processing capability of the block storage. Unit: operations per second.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
             * <ul>
             * <li>default: creates the instance on a non-dedicated host.</li>
             * <li>host: creates the instance on a dedicated host. If you do not specify the DedicatedHostId parameter, Alibaba Cloud automatically selects a dedicated host for the instance.
             * Default value: default.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder tenancy(String tenancy) {
                this.tenancy = tenancy;
                return this;
            }

            /**
             * <p>The user data of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>echo hello ecs!</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The weight of the specified instance type, which indicates the capacity that a single instance of the specified instance type provides in the scaling group. A greater weight indicates that fewer instances of the instance type are required to meet the expected capacity.</p>
             */
            public Builder weightedCapacities(java.util.List<Integer> weightedCapacities) {
                this.weightedCapacities = weightedCapacities;
                return this;
            }

            /**
             * <p>The zone ID of the instance. You can call the DescribeZones operation to query the zone list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
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
