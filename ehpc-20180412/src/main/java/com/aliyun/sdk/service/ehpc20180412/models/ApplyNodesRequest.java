// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ApplyNodesRequest} extends {@link RequestModel}
 *
 * <p>ApplyNodesRequest</p>
 */
public class ApplyNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocatePublicAddress")
    private Boolean allocatePublicAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotPriceLimit")
    private Float computeSpotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostNamePrefix")
    private String hostNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostNameSuffix")
    private String hostNameSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeModel")
    private java.util.List<InstanceTypeModel> instanceTypeModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandWidthIn")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer internetMaxBandWidthIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandWidthOut")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer internetMaxBandWidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(maximum = 600, minimum = 60)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobQueue")
    private String jobQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAmountType")
    private String resourceAmountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Round")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer round;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictResourceProvision")
    private Boolean strictResourceProvision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictSatisfiedTargetCapacity")
    private Boolean strictSatisfiedTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskType")
    private String systemDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer targetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ZoneInfos> zoneInfos;

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
    public java.util.List<InstanceTypeModel> getInstanceTypeModel() {
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
    public java.util.List<Tag> getTag() {
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
    public java.util.List<ZoneInfos> getZoneInfos() {
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
        private java.util.List<InstanceTypeModel> instanceTypeModel; 
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
        private java.util.List<Tag> tag; 
        private Integer targetCapacity; 
        private String userData; 
        private java.util.List<ZoneInfos> zoneInfos; 

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
         * <p>Specifies whether to allocate a public IP address to the compute nodes. Valid values:</p>
         * <ul>
         * <li>true: A public IP address is allocated to the compute nodes.</li>
         * <li>false: A public IP address is not allocated to the compute nodes.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allocatePublicAddress(Boolean allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * <p>The ID of the E-HPC cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87126.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The maximum hourly price of the compute nodes. The value is a floating-point number that supports up to three decimal places. The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
         * <p>If ComputeSpotPriceLimit and InstanceTypeModel.N.MaxPrice are specified at the same time, compute nodes are created based on the smaller value of the two parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>0.68</p>
         */
        public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * <p>The preemption policy of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * <p>The number of vCPUs. The parameter is required when the ResourceAmountType parameter is set to Cores.</p>
         * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * <p>The prefix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * <p>The suffix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * <p>The image ID of the compute nodes to be added. The parameter takes effect only when the TargetImageId parameter is not specified.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the image ID.</p>
         * <blockquote>
         * <p> If you add multiple compute nodes, the TargetImageId parameter takes effect only on the nodes for which the TargetImageId parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The level of the instance family. The parameter takes effect only when Cores and Memory are specified. Valid values:</p>
         * <ul>
         * <li>EntryLevel</li>
         * <li>EnterpriseLevel</li>
         * <li>CreditEntryLevel For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * <p>Default value: EnterpriseLevel.</p>
         * 
         * <strong>example:</strong>
         * <p>EntryLevel</p>
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * <p>The information about the preemptible instance.</p>
         */
        public Builder instanceTypeModel(java.util.List<InstanceTypeModel> instanceTypeModel) {
            this.putQueryParameter("InstanceTypeModel", instanceTypeModel);
            this.instanceTypeModel = instanceTypeModel;
            return this;
        }

        /**
         * <p>The billing method of the elastic IP address (EIP). Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth</li>
         * <li>PayByTraffic: pay-by-traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of the parameter are 1 to 10 and the default value is 10.</li>
         * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased. The default value is the value of the InternetMaxBandWidthOut parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
            this.putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn);
            this.internetMaxBandWidthIn = internetMaxBandWidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut);
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }

        /**
         * <p>The interval between two consecutive batches. Valid values: 60 to 600. Unit: seconds.</p>
         * <p>Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The queue to which the compute nodes are added.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * <p>The memory capacity. The parameter is required when the ResourceAmountType parameter is set to Cores. Unit: GB.</p>
         * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The application policy of the preemptible nodes. Valid values:</p>
         * <ul>
         * <li>LowPriceResourcePlanning: Preemptible nodes are created based on the unit prices of vCPUs in ascending order. Preemptible nodes are created first when multiple preemptible instance types are specified.</li>
         * <li>CapacityOptResourcePlanning: Preemptible nodes are created based on the prices and release rates in ascending order.</li>
         * <li>CustomizedResourcePlanning: Nodes are added based on the predefined value of the ZoneIds.N parameter. Instances of a zone that has a higher priority are used first.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LowPriceResourcePlanning</p>
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * <p>The type of the resource that you want to add. Valid values:</p>
         * <ul>
         * <li>Instances: the ECS instances that are used as compute nodes</li>
         * <li>Cores: vCPU and memory</li>
         * </ul>
         * <p>Default value: Instances.</p>
         * 
         * <strong>example:</strong>
         * <p>Instances</p>
         */
        public Builder resourceAmountType(String resourceAmountType) {
            this.putQueryParameter("ResourceAmountType", resourceAmountType);
            this.resourceAmountType = resourceAmountType;
            return this;
        }

        /**
         * <p>The total number of batches to create nodes. Valid values: 1 to 10.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder round(Integer round) {
            this.putQueryParameter("Round", round);
            this.round = round;
            return this;
        }

        /**
         * <p>Specifies whether to strictly meet the requirements of the TargetCapacity parameter. The parameter takes effect only when StrictSatisfiedTargetCapacity is set to true. Valid values:</p>
         * <ul>
         * <li>true: Check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</li>
         * <li>false: Check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder strictResourceProvision(Boolean strictResourceProvision) {
            this.putQueryParameter("StrictResourceProvision", strictResourceProvision);
            this.strictResourceProvision = strictResourceProvision;
            return this;
        }

        /**
         * <p>Specifies whether to meet the requirements of the TargetCapacity parameter. Valid values:</p>
         * <ul>
         * <li><p>true: If the available resources are fewer than the resources that you want to add, no compute nodes are created and an error is returned. If the available resources are more than the resources that you want to add, the following cases may occur:</p>
         * <ul>
         * <li>If StrictResourceProvision is set to true, check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</li>
         * <li>If StrictResourceProvision is set to false, check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</li>
         * </ul>
         * </li>
         * <li><p>false: If the available resources are insufficient, compute nodes are created based on the inventory of the resources.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder strictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
            this.putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity);
            this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
            return this;
        }

        /**
         * <p>The performance level of the ESSD that you want to use as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL0. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>Default value: 40.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud: basic disk. Disks of this type are retired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * <p>The details about the tags that are added to the nodes.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The amount of the resource that you want to add. The specific number depends on the value of the ResourceAmountType parameter:</p>
         * <ul>
         * <li>If ResourceAmountType is set to Instance, the value range of TargetCapacity is 1 to 200.</li>
         * <li>If ResourceAmountType is set to Cores, the value range of TargetCapacity is 1 to 1,000.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder targetCapacity(Integer targetCapacity) {
            this.putQueryParameter("TargetCapacity", targetCapacity);
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * <p>The user data of the instance. The user data must be Base64-encoded. The raw data can be up to 16 KB in size. Linux operating systems support shell scripts. Windows operating systems support bat and Powershell scripts. Before you perform Base64 encoding, make sure that the content to be encoded includes [bat] or [powershell] as the first row.</p>
         * <blockquote>
         * <p> We recommend that you do not pass in confidential information, such as passwords or private keys, in plaintext as user data. This is because the system does not encrypt UserData values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64, and then decode and decrypt the information in the same way inside the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The details of the zones. You can specify up to 10 zones.</p>
         * <p>This parameter is required.</p>
         */
        public Builder zoneInfos(java.util.List<ZoneInfos> zoneInfos) {
            this.putQueryParameter("ZoneInfos", zoneInfos);
            this.zoneInfos = zoneInfos;
            return this;
        }

        @Override
        public ApplyNodesRequest build() {
            return new ApplyNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyNodesRequest} extends {@link TeaModel}
     *
     * <p>ApplyNodesRequest</p>
     */
    public static class InstanceTypeModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

        @com.aliyun.core.annotation.NameInMap("TargetImageId")
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

            private Builder() {
            } 

            private Builder(InstanceTypeModel model) {
                this.instanceType = model.instanceType;
                this.maxPrice = model.maxPrice;
                this.targetImageId = model.targetImageId;
            } 

            /**
             * <p>The instance type of the compute node. The default value is the instance type that was specified when you created the cluster or the last time you added compute nodes.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum hourly price that you can pay for the preemptible node. The value is a floating-point number that supports up to three decimal places.</p>
             * <p>The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>0.034</p>
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The image ID of the compute node. You must select a Windows image.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>win2016_1607_x64_dtc_zh-cn_40G_alibase_20210516.vhd</p>
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
    /**
     * 
     * {@link ApplyNodesRequest} extends {@link TeaModel}
     *
     * <p>ApplyNodesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * <p>Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.</p>
             * <p>Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link ApplyNodesRequest} extends {@link TeaModel}
     *
     * <p>ApplyNodesRequest</p>
     */
    public static class ZoneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(ZoneInfos model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the vSwitch. Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e47optm9g58zcu****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone to which the node belongs. Valid values of N: 1 to 10.</p>
             * <blockquote>
             * <p> Each zone ID must be unique.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
