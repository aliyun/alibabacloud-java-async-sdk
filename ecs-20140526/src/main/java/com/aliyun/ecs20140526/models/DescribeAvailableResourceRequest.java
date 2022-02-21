// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceRequest</p>
 */
public class DescribeAvailableResourceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("NetworkCategory")
    private String networkCategory;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("DataDiskCategory")
    private String dataDiskCategory;

    @Query
    @NameInMap("DestinationResource")
    private String destinationResource;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    private DescribeAvailableResourceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotDuration = builder.spotDuration;
        this.scope = builder.scope;
        this.regionId = builder.regionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.networkCategory = builder.networkCategory;
        this.resourceType = builder.resourceType;
        this.spotStrategy = builder.spotStrategy;
        this.memory = builder.memory;
        this.zoneId = builder.zoneId;
        this.ioOptimized = builder.ioOptimized;
        this.instanceType = builder.instanceType;
        this.dataDiskCategory = builder.dataDiskCategory;
        this.destinationResource = builder.destinationResource;
        this.cores = builder.cores;
        this.systemDiskCategory = builder.systemDiskCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return networkCategory
     */
    public String getNetworkCategory() {
        return this.networkCategory;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return dataDiskCategory
     */
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    /**
     * @return destinationResource
     */
    public String getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Integer spotDuration; 
        private String scope; 
        private String regionId; 
        private String instanceChargeType; 
        private String dedicatedHostId; 
        private String networkCategory; 
        private String resourceType; 
        private String spotStrategy; 
        private Float memory; 
        private String zoneId; 
        private String ioOptimized; 
        private String instanceType; 
        private String dataDiskCategory; 
        private String destinationResource; 
        private Integer cores; 
        private String systemDiskCategory; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.spotDuration = response.spotDuration;
            this.scope = response.scope;
            this.regionId = response.regionId;
            this.instanceChargeType = response.instanceChargeType;
            this.dedicatedHostId = response.dedicatedHostId;
            this.networkCategory = response.networkCategory;
            this.resourceType = response.resourceType;
            this.spotStrategy = response.spotStrategy;
            this.memory = response.memory;
            this.zoneId = response.zoneId;
            this.ioOptimized = response.ioOptimized;
            this.instanceType = response.instanceType;
            this.dataDiskCategory = response.dataDiskCategory;
            this.destinationResource = response.destinationResource;
            this.cores = response.cores;
            this.systemDiskCategory = response.systemDiskCategory;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SpotDuration.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The ID of the destination region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The billing method of the resource. For more information, see [billing Overview](~~ 25398 ~~). Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid: pay-as-you-go
         * 
         * Default value: PostPaid
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The ID of the dedicated host.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The network type. Valid values:
         * <p>
         * 
         * -vpc: vpc
         * -classic: classic Network
         * 
         */
        public Builder networkCategory(String networkCategory) {
            this.putQueryParameter("NetworkCategory", networkCategory);
            this.networkCategory = networkCategory;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * -instance:ECS instance
         * -disk: Cloud disk
         * -reservedinstance: Reserved Instance
         * -ddh: Dedicated host
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The preemptible policy of the pay-as-you-go instance. Valid values:
         * <p>
         * 
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
         * 
         * Default value: NoSpot
         * 
         * The parameter InstanceChargeType is valid only when the parameter PostPaid is set to SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The memory size of the instance type. Unit: GiB. For more information, see [instance type family](~~ 25378 ~~).
         * <p>
         * 
         * Memory is a valid parameter only when the DestinationResource is set to InstanceType.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The ID of the zone.
         * <p>
         * 
         * Default value: None, indicating that the zones in the current region are randomly allocated, and the resources that meet the query criteria in all zones in the region ("RegionId") are returned.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized instance
         * -optimized:I/O optimized instance
         * 
         * 
         * Default value: optimized
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The instance type. For more information, see [instance type family](~~ 25378 ~~). You can also call the [DescribeInstanceTypes](~~ 25620 ~~) API to obtain the latest specifications.
         * <p>
         * 
         * If the parameter DestinationResource is set to SystemDisk, InstanceType is required.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The data disk type. Valid values:
         * <p>
         * 
         * -cloud: basic cloud disk
         * -cloud_efficiency: Ultra disk
         * -cloud_ssd:SSD cloud disk
         * -ephemeral_ssd: local SSD
         * -cloud_essd:ESSD
         */
        public Builder dataDiskCategory(String dataDiskCategory) {
            this.putQueryParameter("DataDiskCategory", dataDiskCategory);
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }

        /**
         * The type of the resource to query. Valid values:
         * <p>
         * 
         * -Zone: Zone
         * -IoOptimized:I/O optimization
         * -InstanceType: instance type
         * -SystemDisk: system disk
         * -DataDisk: data disk
         * -Network: Network type
         * -ddh: Dedicated host
         * 
         * For more information about how to DestinationResource parameters, see the preceding operations.
         */
        public Builder destinationResource(String destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * The number of vCPU cores of the instance type. For more information, see [instance type family](~~ 25378 ~~).
         * <p>
         * 
         * This parameter is valid only when the DestinationResource is set to InstanceType.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The system disk type. Valid values:
         * <p>
         * 
         * -cloud: basic cloud disk
         * -cloud_efficiency: Ultra disk
         * -cloud_ssd:SSD cloud disk
         * -ephemeral_ssd: local SSD
         * -cloud_essd:ESSD
         * 
         * Default: cloud_efficiency
         * 
         * > parameter ResourceType value for instance, DestinationResource value for DataDisk when parameter SystemDiskCategory is a required parameter. If you do not pass parameter values, the with default values take effect.
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        @Override
        public DescribeAvailableResourceRequest build() {
            return new DescribeAvailableResourceRequest(this);
        } 

    } 

}
