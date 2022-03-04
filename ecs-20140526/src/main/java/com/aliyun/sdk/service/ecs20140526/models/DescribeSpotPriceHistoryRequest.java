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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    private DescribeSpotPriceHistoryRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
        this.networkType = builder.networkType;
        this.instanceType = builder.instanceType;
        this.spotDuration = builder.spotDuration;
        this.startTime = builder.startTime;
        this.OSType = builder.OSType;
        this.ioOptimized = builder.ioOptimized;
        this.offset = builder.offset;
        this.endTime = builder.endTime;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    public static final class Builder extends Request.Builder<DescribeSpotPriceHistoryRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String zoneId; 
        private String networkType; 
        private String instanceType; 
        private Integer spotDuration; 
        private String startTime; 
        private String OSType; 
        private String ioOptimized; 
        private Integer offset; 
        private String endTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotPriceHistoryRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
            this.networkType = request.networkType;
            this.instanceType = request.instanceType;
            this.spotDuration = request.spotDuration;
            this.startTime = request.startTime;
            this.OSType = request.OSType;
            this.ioOptimized = request.ioOptimized;
            this.offset = request.offset;
            this.endTime = request.endTime;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The network type of the preemptible instance. Valid values:
         * <p>
         * 
         * -classic: indicates that the network type of the preemptible instance is classic.
         * 
         * -vpc: indicates that the network type of the preemptible instance is vpc.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The retention period of a preemptible instance. Unit: hours. Valid values: 0 to 6.
         * <p>
         * 
         * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
         * -If the value is 0, the mode is not protected.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The start time for querying the historical price of a preemptible instance. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mm:ssZ ".
         * <p>
         * 
         * Default value: NULL. Null indicates the first 3 hours of the end time. The maximum value cannot exceed 30 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The release platform type of the operating system. Valid values:
         * <p>
         * 
         * -linux
         * -Windows
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * -optimized: indicates that the preemptible instance is an I/O optimized instance.
         * 
         * -none: indicates that the preemptible instance is not I/O optimized.
         * 
         * Default value: none
         * 
         * Default value for other instance families: optimized
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The start row of the query.
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
         * Query the end time of the historical price of a preemptible instance. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mm:ssZ ".
         * <p>
         * 
         * Default value: null. Null indicates the current time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        @Override
        public DescribeSpotPriceHistoryRequest build() {
            return new DescribeSpotPriceHistoryRequest(this);
        } 

    } 

}
