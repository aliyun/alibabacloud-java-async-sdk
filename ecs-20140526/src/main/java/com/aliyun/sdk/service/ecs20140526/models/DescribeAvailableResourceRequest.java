// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Validation(maximum = 6, minimum = 2)
    private Integer spotDuration;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @Query
    @NameInMap("DataDiskCategory")
    private String dataDiskCategory;

    @Query
    @NameInMap("NetworkCategory")
    private String networkCategory;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("DestinationResource")
    @Validation(required = true)
    private String destinationResource;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeAvailableResourceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotDuration = builder.spotDuration;
        this.scope = builder.scope;
        this.regionId = builder.regionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.spotStrategy = builder.spotStrategy;
        this.ioOptimized = builder.ioOptimized;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.instanceType = builder.instanceType;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.dataDiskCategory = builder.dataDiskCategory;
        this.networkCategory = builder.networkCategory;
        this.memory = builder.memory;
        this.destinationResource = builder.destinationResource;
        this.cores = builder.cores;
        this.resourceType = builder.resourceType;
        this.zoneId = builder.zoneId;
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
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return dataDiskCategory
     */
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    /**
     * @return networkCategory
     */
    public String getNetworkCategory() {
        return this.networkCategory;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Integer spotDuration; 
        private String scope; 
        private String regionId; 
        private String instanceChargeType; 
        private String spotStrategy; 
        private String ioOptimized; 
        private String dedicatedHostId; 
        private String instanceType; 
        private String systemDiskCategory; 
        private String dataDiskCategory; 
        private String networkCategory; 
        private Float memory; 
        private String destinationResource; 
        private Integer cores; 
        private String resourceType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotDuration = request.spotDuration;
            this.scope = request.scope;
            this.regionId = request.regionId;
            this.instanceChargeType = request.instanceChargeType;
            this.spotStrategy = request.spotStrategy;
            this.ioOptimized = request.ioOptimized;
            this.dedicatedHostId = request.dedicatedHostId;
            this.instanceType = request.instanceType;
            this.systemDiskCategory = request.systemDiskCategory;
            this.dataDiskCategory = request.dataDiskCategory;
            this.networkCategory = request.networkCategory;
            this.memory = request.memory;
            this.destinationResource = request.destinationResource;
            this.cores = request.cores;
            this.resourceType = request.resourceType;
            this.zoneId = request.zoneId;
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
         * The ID of the dedicated host.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
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
         * The system disk type. Valid values:
         * <p>
         * 
         * -cloud: basic cloud disk
         * -cloud_efficiency: Ultra disk
         * -cloud_ssd:SSD cloud disk
         * -ephemeral_ssd: local SSD
         * -cloud_essd:ESSD
         * 
         * Default value: cloud_efficiency
         * 
         * > If the parameter ResourceType is set to instance and the DestinationResource is set to DataDisk, the parameter SystemDiskCategory is required. If no parameter value is passed, the default value takes effect.
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
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
         * The ID of the zone.
         * <p>
         * 
         * Default value: none, indicating that the zones in the current region are randomly allocated, and the resources that meet the query criteria in all zones in the region ("RegionId") are returned.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableResourceRequest build() {
            return new DescribeAvailableResourceRequest(this);
        } 

    } 

}
