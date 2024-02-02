// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotPriceHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpotPriceHistoryRequest</p>
 */
public class DescribeSpotPriceHistoryRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeSpotPriceHistoryRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.endTime = builder.endTime;
        this.instanceType = builder.instanceType;
        this.ioOptimized = builder.ioOptimized;
        this.networkType = builder.networkType;
        this.OSType = builder.OSType;
        this.offset = builder.offset;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotDuration = builder.spotDuration;
        this.startTime = builder.startTime;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotPriceHistoryRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeSpotPriceHistoryRequest, Builder> {
        private String sourceRegionId; 
        private String endTime; 
        private String instanceType; 
        private String ioOptimized; 
        private String networkType; 
        private String OSType; 
        private Integer offset; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer spotDuration; 
        private String startTime; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotPriceHistoryRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.endTime = request.endTime;
            this.instanceType = request.instanceType;
            this.ioOptimized = request.ioOptimized;
            this.networkType = request.networkType;
            this.OSType = request.OSType;
            this.offset = request.offset;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotDuration = request.spotDuration;
            this.startTime = request.startTime;
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
         * The type of the operating system platform. Valid values:
         * <p>
         * 
         * *   linux
         * *   windows
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. The specified time can be up to 30 days earlier than the specified EndTime value.
         * <p>
         * 
         * This parameter is empty by default. If this parameter is empty, the time that is 3 hours earlier than the specified EndTime value is used.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Specifies whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * *   optimized: The instance is I/O optimized.
         * *   none: The instance is not I/O optimized.
         * 
         * For instances of generation I instance families, the default value is none.
         * 
         * For instances of other instance families, the default value is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The network type of the preemptible instance. Valid values:
         * <p>
         * 
         * *   classic: classic network
         * *   vpc: Virtual Private Cloud (VPC)
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * The type of the operating system platform. Valid values:
         * <p>
         * 
         * - linux
         * - windows
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * The line from which the query starts. 
         * <p>
         * 
         * Default value: 0.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The zone ID of the preemptible instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values: 
         * <p>
         * 
         * - 1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bidding price with the market price and checks the resource inventory to determine whether to retain or release the instance. 
         * 
         * - 0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the biding price with the market price and checks the resource inventory to determine whether to retain or release the instance. 
         * 
         * Alibaba Cloud sends Elastic Compute Service (ECS) system events to notify you 5 minutes before the instance is released. Preemptible instances are billed by the second. We recommend that you specify a protection period based on your business requirements. 
         * 
         * >If you set SpotStrategy to SpotWithPriceLimit or SpotAsPriceGo, this parameter takes effect.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The time that corresponds to the queried spot price. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The spot price (market price) of the preemptible instance.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeSpotPriceHistoryRequest build() {
            return new DescribeSpotPriceHistoryRequest(this);
        } 

    } 

}
