// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyNodesRequest} extends {@link RequestModel}
 *
 * <p>ApplyNodesRequest</p>
 */
public class ApplyNodesRequest extends Request {
    @Query
    @NameInMap("AllocatePublicAddress")
    private Boolean allocatePublicAddress;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private Float computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("HostNamePrefix")
    private String hostNamePrefix;

    @Query
    @NameInMap("HostNameSuffix")
    private String hostNameSuffix;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("InstanceTypeModel")
    private java.util.List < InstanceTypeModel> instanceTypeModel;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandWidthIn")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthIn;

    @Query
    @NameInMap("InternetMaxBandWidthOut")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthOut;

    @Query
    @NameInMap("Interval")
    @Validation(maximum = 600, minimum = 60)
    private Integer interval;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("Memory")
    private Integer memory;

    @Query
    @NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @Query
    @NameInMap("ResourceAmountType")
    private String resourceAmountType;

    @Query
    @NameInMap("Round")
    @Validation(maximum = 10, minimum = 1)
    private Integer round;

    @Query
    @NameInMap("StrictResourceProvision")
    private Boolean strictResourceProvision;

    @Query
    @NameInMap("StrictSatisfiedTargetCapacity")
    private Boolean strictSatisfiedTargetCapacity;

    @Query
    @NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("SystemDiskType")
    private String systemDiskType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetCapacity")
    @Validation(required = true)
    private Integer targetCapacity;

    @Query
    @NameInMap("ZoneInfos")
    @Validation(required = true)
    private java.util.List < ZoneInfos> zoneInfos;

    private ApplyNodesRequest(Builder builder) {
        super(builder);
        this.allocatePublicAddress = builder.allocatePublicAddress;
        this.clusterId = builder.clusterId;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.cores = builder.cores;
        this.hostNamePrefix = builder.hostNamePrefix;
        this.hostNameSuffix = builder.hostNameSuffix;
        this.imageId = builder.imageId;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeModel = builder.instanceTypeModel;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandWidthIn = builder.internetMaxBandWidthIn;
        this.internetMaxBandWidthOut = builder.internetMaxBandWidthOut;
        this.interval = builder.interval;
        this.jobQueue = builder.jobQueue;
        this.memory = builder.memory;
        this.priorityStrategy = builder.priorityStrategy;
        this.resourceAmountType = builder.resourceAmountType;
        this.round = builder.round;
        this.strictResourceProvision = builder.strictResourceProvision;
        this.strictSatisfiedTargetCapacity = builder.strictSatisfiedTargetCapacity;
        this.systemDiskLevel = builder.systemDiskLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.systemDiskType = builder.systemDiskType;
        this.tag = builder.tag;
        this.targetCapacity = builder.targetCapacity;
        this.zoneInfos = builder.zoneInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocatePublicAddress
     */
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return hostNamePrefix
     */
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * @return hostNameSuffix
     */
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceTypeModel
     */
    public java.util.List < InstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandWidthIn
     */
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    /**
     * @return internetMaxBandWidthOut
     */
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    /**
     * @return resourceAmountType
     */
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    /**
     * @return round
     */
    public Integer getRound() {
        return this.round;
    }

    /**
     * @return strictResourceProvision
     */
    public Boolean getStrictResourceProvision() {
        return this.strictResourceProvision;
    }

    /**
     * @return strictSatisfiedTargetCapacity
     */
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
    }

    /**
     * @return systemDiskLevel
     */
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetCapacity
     */
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * @return zoneInfos
     */
    public java.util.List < ZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder extends Request.Builder<ApplyNodesRequest, Builder> {
        private Boolean allocatePublicAddress; 
        private String clusterId; 
        private Float computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private Integer cores; 
        private String hostNamePrefix; 
        private String hostNameSuffix; 
        private String imageId; 
        private String instanceFamilyLevel; 
        private java.util.List < InstanceTypeModel> instanceTypeModel; 
        private String internetChargeType; 
        private Integer internetMaxBandWidthIn; 
        private Integer internetMaxBandWidthOut; 
        private Integer interval; 
        private String jobQueue; 
        private Integer memory; 
        private String priorityStrategy; 
        private String resourceAmountType; 
        private Integer round; 
        private Boolean strictResourceProvision; 
        private Boolean strictSatisfiedTargetCapacity; 
        private String systemDiskLevel; 
        private Integer systemDiskSize; 
        private String systemDiskType; 
        private java.util.List < Tag> tag; 
        private Integer targetCapacity; 
        private java.util.List < ZoneInfos> zoneInfos; 

        private Builder() {
            super();
        } 

        private Builder(ApplyNodesRequest response) {
            super(response);
            this.allocatePublicAddress = response.allocatePublicAddress;
            this.clusterId = response.clusterId;
            this.computeSpotPriceLimit = response.computeSpotPriceLimit;
            this.computeSpotStrategy = response.computeSpotStrategy;
            this.cores = response.cores;
            this.hostNamePrefix = response.hostNamePrefix;
            this.hostNameSuffix = response.hostNameSuffix;
            this.imageId = response.imageId;
            this.instanceFamilyLevel = response.instanceFamilyLevel;
            this.instanceTypeModel = response.instanceTypeModel;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandWidthIn = response.internetMaxBandWidthIn;
            this.internetMaxBandWidthOut = response.internetMaxBandWidthOut;
            this.interval = response.interval;
            this.jobQueue = response.jobQueue;
            this.memory = response.memory;
            this.priorityStrategy = response.priorityStrategy;
            this.resourceAmountType = response.resourceAmountType;
            this.round = response.round;
            this.strictResourceProvision = response.strictResourceProvision;
            this.strictSatisfiedTargetCapacity = response.strictSatisfiedTargetCapacity;
            this.systemDiskLevel = response.systemDiskLevel;
            this.systemDiskSize = response.systemDiskSize;
            this.systemDiskType = response.systemDiskType;
            this.tag = response.tag;
            this.targetCapacity = response.targetCapacity;
            this.zoneInfos = response.zoneInfos;
        } 

        /**
         * AllocatePublicAddress.
         */
        public Builder allocatePublicAddress(Boolean allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * HostNamePrefix.
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * HostNameSuffix.
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceFamilyLevel.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * InstanceTypeModel.
         */
        public Builder instanceTypeModel(java.util.List < InstanceTypeModel> instanceTypeModel) {
            this.putQueryParameter("InstanceTypeModel", instanceTypeModel);
            this.instanceTypeModel = instanceTypeModel;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandWidthIn.
         */
        public Builder internetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
            this.putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn);
            this.internetMaxBandWidthIn = internetMaxBandWidthIn;
            return this;
        }

        /**
         * InternetMaxBandWidthOut.
         */
        public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut);
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * JobQueue.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * PriorityStrategy.
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * ResourceAmountType.
         */
        public Builder resourceAmountType(String resourceAmountType) {
            this.putQueryParameter("ResourceAmountType", resourceAmountType);
            this.resourceAmountType = resourceAmountType;
            return this;
        }

        /**
         * Round.
         */
        public Builder round(Integer round) {
            this.putQueryParameter("Round", round);
            this.round = round;
            return this;
        }

        /**
         * StrictResourceProvision.
         */
        public Builder strictResourceProvision(Boolean strictResourceProvision) {
            this.putQueryParameter("StrictResourceProvision", strictResourceProvision);
            this.strictResourceProvision = strictResourceProvision;
            return this;
        }

        /**
         * StrictSatisfiedTargetCapacity.
         */
        public Builder strictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
            this.putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity);
            this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
            return this;
        }

        /**
         * SystemDiskLevel.
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * SystemDiskType.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetCapacity.
         */
        public Builder targetCapacity(Integer targetCapacity) {
            this.putQueryParameter("TargetCapacity", targetCapacity);
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * ZoneInfos.
         */
        public Builder zoneInfos(java.util.List < ZoneInfos> zoneInfos) {
            this.putQueryParameter("ZoneInfos", zoneInfos);
            this.zoneInfos = zoneInfos;
            return this;
        }

        @Override
        public ApplyNodesRequest build() {
            return new ApplyNodesRequest(this);
        } 

    } 

    public static class InstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("TargetImageId")
        private String targetImageId;

        private InstanceTypeModel(Builder builder) {
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
            this.targetImageId = builder.targetImageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeModel create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return targetImageId
         */
        public String getTargetImageId() {
            return this.targetImageId;
        }

        public static final class Builder {
            private String instanceType; 
            private Float maxPrice; 
            private String targetImageId; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
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
             * TargetImageId.
             */
            public Builder targetImageId(String targetImageId) {
                this.targetImageId = targetImageId;
                return this;
            }

            public InstanceTypeModel build() {
                return new InstanceTypeModel(this);
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
    public static class ZoneInfos extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneInfos(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfos create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInfos build() {
                return new ZoneInfos(this);
            } 

        } 

    }
}
