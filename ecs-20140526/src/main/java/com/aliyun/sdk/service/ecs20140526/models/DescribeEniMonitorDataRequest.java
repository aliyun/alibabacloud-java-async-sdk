// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEniMonitorDataRequest</p>
 */
public class DescribeEniMonitorDataRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("EniId")
    private String eniId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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
    @Validation(required = true)
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

    private DescribeEniMonitorDataRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.endTime = builder.endTime;
        this.eniId = builder.eniId;
        this.instanceId = builder.instanceId;
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

    public static DescribeEniMonitorDataRequest create() {
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
     * @return eniId
     */
    public String getEniId() {
        return this.eniId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<DescribeEniMonitorDataRequest, Builder> {
        private String sourceRegionId; 
        private String endTime; 
        private String eniId; 
        private String instanceId; 
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

        private Builder(DescribeEniMonitorDataRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.endTime = request.endTime;
            this.eniId = request.eniId;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EniId.
         */
        public Builder eniId(String eniId) {
            this.putQueryParameter("EniId", eniId);
            this.eniId = eniId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEniMonitorDataRequest build() {
            return new DescribeEniMonitorDataRequest(this);
        } 

    } 

}
