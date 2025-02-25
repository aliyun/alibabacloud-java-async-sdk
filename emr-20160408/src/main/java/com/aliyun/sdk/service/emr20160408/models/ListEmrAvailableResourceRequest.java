// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>ListEmrAvailableResourceRequest</p>
 */
public class ListEmrAvailableResourceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("DataDiskType")
    private String dataDiskType;

    @Query
    @NameInMap("DepositType")
    private String depositType;

    @Query
    @NameInMap("DestinationResource")
    @Validation(required = true)
    private String destinationResource;

    @Query
    @NameInMap("EmrVersion")
    private String emrVersion;

    @Query
    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("SystemDiskType")
    private String systemDiskType;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ListEmrAvailableResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.dataDiskType = builder.dataDiskType;
        this.depositType = builder.depositType;
        this.destinationResource = builder.destinationResource;
        this.emrVersion = builder.emrVersion;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.netType = builder.netType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskType = builder.systemDiskType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return dataDiskType
     */
    public String getDataDiskType() {
        return this.dataDiskType;
    }

    /**
     * @return depositType
     */
    public String getDepositType() {
        return this.depositType;
    }

    /**
     * @return destinationResource
     */
    public String getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return emrVersion
     */
    public String getEmrVersion() {
        return this.emrVersion;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListEmrAvailableResourceRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String dataDiskType; 
        private String depositType; 
        private String destinationResource; 
        private String emrVersion; 
        private String instanceChargeType; 
        private String instanceType; 
        private String netType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String spotStrategy; 
        private String systemDiskType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListEmrAvailableResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
            this.dataDiskType = request.dataDiskType;
            this.depositType = request.depositType;
            this.destinationResource = request.destinationResource;
            this.emrVersion = request.emrVersion;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceType = request.instanceType;
            this.netType = request.netType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskType = request.systemDiskType;
            this.zoneId = request.zoneId;
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
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * DataDiskType.
         */
        public Builder dataDiskType(String dataDiskType) {
            this.putQueryParameter("DataDiskType", dataDiskType);
            this.dataDiskType = dataDiskType;
            return this;
        }

        /**
         * DepositType.
         */
        public Builder depositType(String depositType) {
            this.putQueryParameter("DepositType", depositType);
            this.depositType = depositType;
            return this;
        }

        /**
         * DestinationResource.
         */
        public Builder destinationResource(String destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * EmrVersion.
         */
        public Builder emrVersion(String emrVersion) {
            this.putQueryParameter("EmrVersion", emrVersion);
            this.emrVersion = emrVersion;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListEmrAvailableResourceRequest build() {
            return new ListEmrAvailableResourceRequest(this);
        } 

    } 

}
