// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEipMonitorDataRequest</p>
 */
public class DescribeEipMonitorDataRequest extends Request {
    @Query
    @NameInMap("AllocationId")
    @Validation(required = true)
    private String allocationId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeEipMonitorDataRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.endTime = builder.endTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipMonitorDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEipMonitorDataRequest, Builder> {
        private String allocationId; 
        private String endTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEipMonitorDataRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.endTime = request.endTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the EIP.
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The end of the time range to query. The time must be in UTC. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. For example, `2013-01-10T12:00:00Z` specifies 20:00:00 (UTC+8) on January 10, 2013.
         * <p>
         * 
         * If the value of seconds (ss) is not 00, the end time is automatically rounded up to the next minute.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The duration of each monitoring data entry. Unit: seconds. Valid values: **60** (default), **300**, **900**, and **3600**.
         * <p>
         * 
         * *   If the value of **(EndTime** - **StartTime**)/**Period** is greater than 200, a maximum of 200 monitoring data entries are returned at a time.
         * *   If the value of (**EndTime** - **StartTime**)/**Period** is less than or equal to 200, only the monitoring data collected between the start time and end time is returned.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the region to which the EIP belongs. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The beginning of the time range to query. The time must be in UTC. Specify the time in the ISO 8601 standard in `YYYY-MM-DDThh:mm:ssZ` format. For example, `2013-01-10T12:00:00Z` specifies 20:00:00 (UTC+8) on January 10, 2013.
         * <p>
         * 
         * If the value of seconds (ss) is not 00, the start time is automatically rounded up to the next minute.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEipMonitorDataRequest build() {
            return new DescribeEipMonitorDataRequest(this);
        } 

    } 

}
