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
    @NameInMap("UserData")
    private String userData;

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
        this.userData = builder.userData;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
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
        private String userData; 
        private java.util.List < ZoneInfos> zoneInfos; 

        private Builder() {
            super();
        } 

        private Builder(ApplyNodesRequest request) {
            super(request);
            this.allocatePublicAddress = request.allocatePublicAddress;
            this.clusterId = request.clusterId;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.cores = request.cores;
            this.hostNamePrefix = request.hostNamePrefix;
            this.hostNameSuffix = request.hostNameSuffix;
            this.imageId = request.imageId;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeModel = request.instanceTypeModel;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandWidthIn = request.internetMaxBandWidthIn;
            this.internetMaxBandWidthOut = request.internetMaxBandWidthOut;
            this.interval = request.interval;
            this.jobQueue = request.jobQueue;
            this.memory = request.memory;
            this.priorityStrategy = request.priorityStrategy;
            this.resourceAmountType = request.resourceAmountType;
            this.round = request.round;
            this.strictResourceProvision = request.strictResourceProvision;
            this.strictSatisfiedTargetCapacity = request.strictSatisfiedTargetCapacity;
            this.systemDiskLevel = request.systemDiskLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.systemDiskType = request.systemDiskType;
            this.tag = request.tag;
            this.targetCapacity = request.targetCapacity;
            this.userData = request.userData;
            this.zoneInfos = request.zoneInfos;
        } 

        /**
         * Specifies whether to allocate a public IP address to the compute nodes. Valid values:
         * <p>
         * 
         * *   true: A public IP address is allocated to the compute nodes.
         * *   false: A public IP address is not allocated to the compute nodes.
         * 
         * Default value: false.
         */
        public Builder allocatePublicAddress(Boolean allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * The ID of the E-HPC cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87126~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The maximum hourly price of the compute nodes. The value is a floating-point number that supports up to three decimal places. The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.
         * <p>
         * 
         * If ComputeSpotPriceLimit and InstanceTypeModel.N.MaxPrice are specified at the same time, compute nodes are created based on the smaller value of the two parameters.
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * The preemption policy of the compute nodes. Valid values:
         * <p>
         * 
         * *   NoSpot: The compute nodes are pay-as-you-go instances.
         * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * The number of vCPUs. The parameter is required when the ResourceAmountType parameter is set to Cores.
         * <p>
         * 
         * You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The prefix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * The suffix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * The image ID of the compute nodes to be added. The parameter takes effect only when the TargetImageId parameter is not specified.
         * <p>
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.
         * 
         * >  If you add multiple compute nodes, the TargetImageId parameter takes effect only on the nodes for which the TargetImageId parameter is specified.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The level of the instance family. The parameter takes effect only when Cores and Memory are specified. Valid values:
         * <p>
         * 
         * *   EntryLevel
         * *   EnterpriseLevel
         * *   CreditEntryLevel For more information, see [Overview of burstable instances](~~59977~~).
         * 
         * Default value: EnterpriseLevel.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * The information about the preemptible instance.
         */
        public Builder instanceTypeModel(java.util.List < InstanceTypeModel> instanceTypeModel) {
            this.putQueryParameter("InstanceTypeModel", instanceTypeModel);
            this.instanceTypeModel = instanceTypeModel;
            return this;
        }

        /**
         * The billing method of the elastic IP address (EIP). Valid values:
         * <p>
         * 
         * *   PayByBandwidth: pay-by-bandwidth
         * *   PayByTraffic: pay-by-traffic
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of the parameter are 1 to 10 and the default value is 10.
         * *   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased. The default value is the value of the InternetMaxBandWidthOut parameter.
         */
        public Builder internetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
            this.putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn);
            this.internetMaxBandWidthIn = internetMaxBandWidthIn;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut);
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }

        /**
         * The interval between two consecutive batches. Valid values: 60 to 600. Unit: seconds.
         * <p>
         * 
         * Default value: 60.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The queue to which the compute nodes are added.
         * <p>
         * 
         * You can call the [ListQueues](~~92176~~) operation to query the queue name.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * The memory capacity. The parameter is required when the ResourceAmountType parameter is set to Cores. Unit: GB.
         * <p>
         * 
         * You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The application policy of the preemptible nodes. Valid values:
         * <p>
         * 
         * *   LowPriceResourcePlanning: Preemptible nodes are created based on the unit prices of vCPUs in ascending order. Preemptible nodes are created first when multiple preemptible instance types are specified.
         * *   CapacityOptResourcePlanning: Preemptible nodes are created based on the prices and release rates in ascending order.
         * *   CustomizedResourcePlanning: Nodes are added based on the predefined value of the ZoneIds.N parameter. Instances of a zone that has a higher priority are used first.
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * The type of the resource that you want to add. Valid values:
         * <p>
         * 
         * *   Instances: the ECS instances that are used as compute nodes
         * *   Cores: vCPU and memory
         * 
         * Default value: Instances.
         */
        public Builder resourceAmountType(String resourceAmountType) {
            this.putQueryParameter("ResourceAmountType", resourceAmountType);
            this.resourceAmountType = resourceAmountType;
            return this;
        }

        /**
         * The total number of batches to create nodes. Valid values: 1 to 10.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder round(Integer round) {
            this.putQueryParameter("Round", round);
            this.round = round;
            return this;
        }

        /**
         * Specifies whether to strictly meet the requirements of the TargetCapacity parameter. The parameter takes effect only when StrictSatisfiedTargetCapacity is set to true. Valid values:
         * <p>
         * 
         * *   true: Check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.
         * *   false: Check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.
         * 
         * Default value: false.
         */
        public Builder strictResourceProvision(Boolean strictResourceProvision) {
            this.putQueryParameter("StrictResourceProvision", strictResourceProvision);
            this.strictResourceProvision = strictResourceProvision;
            return this;
        }

        /**
         * Specifies whether to meet the requirements of the TargetCapacity parameter. Valid values:
         * <p>
         * 
         * *   true: If the available resources are fewer than the resources that you want to add, no compute nodes are created and an error is returned. If the available resources are more than the resources that you want to add, the following cases may occur:
         * 
         *     *   If StrictResourceProvision is set to true, check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.
         *     *   If StrictResourceProvision is set to false, check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.
         * 
         * *   false: If the available resources are insufficient, compute nodes are created based on the inventory of the resources.
         * 
         * Default value: true.
         */
        public Builder strictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
            this.putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity);
            this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
            return this;
        }

        /**
         * The performance level of the ESSD that you want to use as the system disk. Valid values:
         * <p>
         * 
         * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
         * *   PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.
         * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
         * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
         * 
         * Default value: PL0. For more information, see [ESSDs](~~122389~~).
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * The size of the system disk. Unit: GB.
         * <p>
         * 
         * Valid values: 40 to 500.
         * 
         * Default value: 40.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The type of the system disk. Valid values:
         * <p>
         * 
         * *   cloud_efficiency: ultra disk
         * *   cloud_ssd: SSD
         * *   cloud_essd: enhanced SSD (ESSD)
         * *   cloud: basic disk. Disks of this type are retired.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * The tag to add to the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The amount of the resource that you want to add. The specific number depends on the value of the ResourceAmountType parameter:
         * <p>
         * 
         * *   If ResourceAmountType is set to Instance, the value range of TargetCapacity is 1 to 200.
         * *   If ResourceAmountType is set to Cores, the value range of TargetCapacity is 1 to 1,000.
         */
        public Builder targetCapacity(Integer targetCapacity) {
            this.putQueryParameter("TargetCapacity", targetCapacity);
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The details of the zones. You can specify up to 10 zones.
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
             * The instance type of the compute node. The default value is the instance type that was specified when you created the cluster or the last time you added compute nodes.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum hourly price that you can pay for the preemptible node. The value is a floating-point number that supports up to three decimal places.
             * <p>
             * 
             * The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The image ID of the compute node. You must select a Windows image.
             * <p>
             * 
             * Valid values of N: 1 to 10.
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
             * The tag key of the compute node that you want to add. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the compute node that you want to add. You can specify 1 to 20 tag values. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or contain http:// or https://.
             * <p>
             * 
             * Valid values of N: 1 to 10.
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
             * The ID of the vSwitch. Valid values of N: 1 to 10.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone to which the node belongs. Valid values of N: 1 to 10.
             * <p>
             * 
             * >  Each zone ID must be unique.
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
