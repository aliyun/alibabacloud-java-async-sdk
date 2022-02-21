// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    private ScalingConfigurations scalingConfigurations;

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
    public ScalingConfigurations getScalingConfigurations() {
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
        private ScalingConfigurations scalingConfigurations; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingConfigurations.
         */
        public Builder scalingConfigurations(ScalingConfigurations scalingConfigurations) {
            this.scalingConfigurations = scalingConfigurations;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingConfigurationsResponseBody build() {
            return new DescribeScalingConfigurationsResponseBody(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String id; 
            private String matchCriteria; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class Categories extends TeaModel {
        @NameInMap("Category")
        private java.util.List < String > category;

        private Categories(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List < String > getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List < String > category; 

            /**
             * Category.
             */
            public Builder category(java.util.List < String > category) {
                this.category = category;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("Categories")
        private Categories categories;

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

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.categories = builder.categories;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
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
         * @return categories
         */
        public Categories getCategories() {
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
            private Categories categories; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Integer size; 
            private String snapshotId; 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Categories.
             */
            public Builder categories(Categories categories) {
                this.categories = categories;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
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
    public static class InstancePatternInfo extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Memory")
        private Float memory;

        private InstancePatternInfo(Builder builder) {
            this.cores = builder.cores;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.maxPrice = builder.maxPrice;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatternInfo create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
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
            private Integer cores; 
            private String instanceFamilyLevel; 
            private Float maxPrice; 
            private Float memory; 

            /**
             * Cores.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * InstanceFamilyLevel.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * MaxPrice.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public InstancePatternInfo build() {
                return new InstancePatternInfo(this);
            } 

        } 

    }
    public static class InstancePatternInfos extends TeaModel {
        @NameInMap("InstancePatternInfo")
        private java.util.List < InstancePatternInfo> instancePatternInfo;

        private InstancePatternInfos(Builder builder) {
            this.instancePatternInfo = builder.instancePatternInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatternInfos create() {
            return builder().build();
        }

        /**
         * @return instancePatternInfo
         */
        public java.util.List < InstancePatternInfo> getInstancePatternInfo() {
            return this.instancePatternInfo;
        }

        public static final class Builder {
            private java.util.List < InstancePatternInfo> instancePatternInfo; 

            /**
             * InstancePatternInfo.
             */
            public Builder instancePatternInfo(java.util.List < InstancePatternInfo> instancePatternInfo) {
                this.instancePatternInfo = instancePatternInfo;
                return this;
            }

            public InstancePatternInfos build() {
                return new InstancePatternInfos(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < String > instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < String > getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < String > instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < String > instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
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
             * ManagedPrivateSpaceId.
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
    public static class SpotPriceModel extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("PriceLimit")
        private Float priceLimit;

        private SpotPriceModel(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceModel create() {
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * PriceLimit.
             */
            public Builder priceLimit(Float priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceModel build() {
                return new SpotPriceModel(this);
            } 

        } 

    }
    public static class SpotPriceLimit extends TeaModel {
        @NameInMap("SpotPriceModel")
        private java.util.List < SpotPriceModel> spotPriceModel;

        private SpotPriceLimit(Builder builder) {
            this.spotPriceModel = builder.spotPriceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimit create() {
            return builder().build();
        }

        /**
         * @return spotPriceModel
         */
        public java.util.List < SpotPriceModel> getSpotPriceModel() {
            return this.spotPriceModel;
        }

        public static final class Builder {
            private java.util.List < SpotPriceModel> spotPriceModel; 

            /**
             * SpotPriceModel.
             */
            public Builder spotPriceModel(java.util.List < SpotPriceModel> spotPriceModel) {
                this.spotPriceModel = spotPriceModel;
                return this;
            }

            public SpotPriceLimit build() {
                return new SpotPriceLimit(this);
            } 

        } 

    }
    public static class SystemDiskCategories extends TeaModel {
        @NameInMap("SystemDiskCategory")
        private java.util.List < String > systemDiskCategory;

        private SystemDiskCategories(Builder builder) {
            this.systemDiskCategory = builder.systemDiskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskCategories create() {
            return builder().build();
        }

        /**
         * @return systemDiskCategory
         */
        public java.util.List < String > getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public static final class Builder {
            private java.util.List < String > systemDiskCategory; 

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(java.util.List < String > systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            public SystemDiskCategories build() {
                return new SystemDiskCategories(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class WeightedCapacities extends TeaModel {
        @NameInMap("WeightedCapacity")
        private java.util.List < String > weightedCapacity;

        private WeightedCapacities(Builder builder) {
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeightedCapacities create() {
            return builder().build();
        }

        /**
         * @return weightedCapacity
         */
        public java.util.List < String > getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private java.util.List < String > weightedCapacity; 

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(java.util.List < String > weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public WeightedCapacities build() {
                return new WeightedCapacities(this);
            } 

        } 

    }
    public static class ScalingConfiguration extends TeaModel {
        @NameInMap("PrivatePoolOptions")
        @Validation(required = true)
        private PrivatePoolOptions privatePoolOptions;

        @NameInMap("Affinity")
        private String affinity;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CreditSpecification")
        private String creditSpecification;

        @NameInMap("DataDisks")
        private DataDisks dataDisks;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

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

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstancePatternInfos")
        private InstancePatternInfos instancePatternInfos;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

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

        @NameInMap("PasswordInherit")
        private Boolean passwordInherit;

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
        private SecurityGroupIds securityGroupIds;

        @NameInMap("SpotDuration")
        private Integer spotDuration;

        @NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @NameInMap("SpotPriceLimit")
        private SpotPriceLimit spotPriceLimit;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        private String systemDiskAutoSnapshotPolicyId;

        @NameInMap("SystemDiskCategories")
        private SystemDiskCategories systemDiskCategories;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @NameInMap("SystemDiskName")
        private String systemDiskName;

        @NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Tenancy")
        private String tenancy;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("WeightedCapacities")
        private WeightedCapacities weightedCapacities;

        @NameInMap("ZoneId")
        private String zoneId;

        private ScalingConfiguration(Builder builder) {
            this.privatePoolOptions = builder.privatePoolOptions;
            this.affinity = builder.affinity;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.creditSpecification = builder.creditSpecification;
            this.dataDisks = builder.dataDisks;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.deploymentSetId = builder.deploymentSetId;
            this.hostName = builder.hostName;
            this.hpcClusterId = builder.hpcClusterId;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
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
            this.passwordInherit = builder.passwordInherit;
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
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDiskAutoSnapshotPolicyId = builder.systemDiskAutoSnapshotPolicyId;
            this.systemDiskCategories = builder.systemDiskCategories;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskDescription = builder.systemDiskDescription;
            this.systemDiskName = builder.systemDiskName;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
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

        public static ScalingConfiguration create() {
            return builder().build();
        }

        /**
         * @return privatePoolOptions
         */
        public PrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
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
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
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
        public InstancePatternInfos getInstancePatternInfos() {
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
        public InstanceTypes getInstanceTypes() {
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
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
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
        public SecurityGroupIds getSecurityGroupIds() {
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
         * @return spotPriceLimit
         */
        public SpotPriceLimit getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return systemDiskAutoSnapshotPolicyId
         */
        public String getSystemDiskAutoSnapshotPolicyId() {
            return this.systemDiskAutoSnapshotPolicyId;
        }

        /**
         * @return systemDiskCategories
         */
        public SystemDiskCategories getSystemDiskCategories() {
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
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
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
        public WeightedCapacities getWeightedCapacities() {
            return this.weightedCapacities;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private PrivatePoolOptions privatePoolOptions; 
            private String affinity; 
            private Integer cpu; 
            private String creationTime; 
            private String creditSpecification; 
            private DataDisks dataDisks; 
            private String dedicatedHostId; 
            private String deploymentSetId; 
            private String hostName; 
            private String hpcClusterId; 
            private String imageFamily; 
            private String imageId; 
            private String imageName; 
            private String instanceDescription; 
            private String instanceGeneration; 
            private String instanceName; 
            private InstancePatternInfos instancePatternInfos; 
            private String instanceType; 
            private InstanceTypes instanceTypes; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private Integer ipv6AddressCount; 
            private String keyPairName; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private Integer memory; 
            private Boolean passwordInherit; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String scalingConfigurationId; 
            private String scalingConfigurationName; 
            private String scalingGroupId; 
            private SchedulerOptions schedulerOptions; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private SecurityGroupIds securityGroupIds; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private SpotPriceLimit spotPriceLimit; 
            private String spotStrategy; 
            private String systemDiskAutoSnapshotPolicyId; 
            private SystemDiskCategories systemDiskCategories; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private String tenancy; 
            private String userData; 
            private WeightedCapacities weightedCapacities; 
            private String zoneId; 

            /**
             * PrivatePoolOptions.
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * Affinity.
             */
            public Builder affinity(String affinity) {
                this.affinity = affinity;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CreditSpecification.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * DataDisks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * DeploymentSetId.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * HpcClusterId.
             */
            public Builder hpcClusterId(String hpcClusterId) {
                this.hpcClusterId = hpcClusterId;
                return this;
            }

            /**
             * ImageFamily.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceGeneration.
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstancePatternInfos.
             */
            public Builder instancePatternInfos(InstancePatternInfos instancePatternInfos) {
                this.instancePatternInfos = instancePatternInfos;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
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
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * LifecycleState.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * LoadBalancerWeight.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * PasswordInherit.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * RamRoleName.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
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
             * ScalingConfigurationId.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * ScalingConfigurationName.
             */
            public Builder scalingConfigurationName(String scalingConfigurationName) {
                this.scalingConfigurationName = scalingConfigurationName;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * SchedulerOptions.
             */
            public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
                this.schedulerOptions = schedulerOptions;
                return this;
            }

            /**
             * SecurityEnhancementStrategy.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * SecurityGroupId.
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

            /**
             * SpotDuration.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * SpotInterruptionBehavior.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(SpotPriceLimit spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
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
             * SystemDiskAutoSnapshotPolicyId.
             */
            public Builder systemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
                this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
                return this;
            }

            /**
             * SystemDiskCategories.
             */
            public Builder systemDiskCategories(SystemDiskCategories systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
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
             * SystemDiskDescription.
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * SystemDiskName.
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
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
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
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
             * Tenancy.
             */
            public Builder tenancy(String tenancy) {
                this.tenancy = tenancy;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * WeightedCapacities.
             */
            public Builder weightedCapacities(WeightedCapacities weightedCapacities) {
                this.weightedCapacities = weightedCapacities;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ScalingConfiguration build() {
                return new ScalingConfiguration(this);
            } 

        } 

    }
    public static class ScalingConfigurations extends TeaModel {
        @NameInMap("ScalingConfiguration")
        private java.util.List < ScalingConfiguration> scalingConfiguration;

        private ScalingConfigurations(Builder builder) {
            this.scalingConfiguration = builder.scalingConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingConfigurations create() {
            return builder().build();
        }

        /**
         * @return scalingConfiguration
         */
        public java.util.List < ScalingConfiguration> getScalingConfiguration() {
            return this.scalingConfiguration;
        }

        public static final class Builder {
            private java.util.List < ScalingConfiguration> scalingConfiguration; 

            /**
             * ScalingConfiguration.
             */
            public Builder scalingConfiguration(java.util.List < ScalingConfiguration> scalingConfiguration) {
                this.scalingConfiguration = scalingConfiguration;
                return this;
            }

            public ScalingConfigurations build() {
                return new ScalingConfigurations(this);
            } 

        } 

    }
}
