// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeScheduledTasksRequest</p>
 */
public class DescribeScheduledTasksRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

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
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @Query
    @NameInMap("ScheduledActions")
    private java.util.List < String > scheduledActions;

    @Query
    @NameInMap("ScheduledTaskIds")
    private java.util.List < String > scheduledTaskIds;

    @Query
    @NameInMap("ScheduledTaskNames")
    private java.util.List < String > scheduledTaskNames;

    private DescribeScheduledTasksRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scheduledActions = builder.scheduledActions;
        this.scheduledTaskIds = builder.scheduledTaskIds;
        this.scheduledTaskNames = builder.scheduledTaskNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List < String > getScheduledActions() {
        return this.scheduledActions;
    }

    /**
     * @return scheduledTaskIds
     */
    public java.util.List < String > getScheduledTaskIds() {
        return this.scheduledTaskIds;
    }

    /**
     * @return scheduledTaskNames
     */
    public java.util.List < String > getScheduledTaskNames() {
        return this.scheduledTaskNames;
    }

    public static final class Builder extends Request.Builder<DescribeScheduledTasksRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private java.util.List < String > scheduledActions; 
        private java.util.List < String > scheduledTaskIds; 
        private java.util.List < String > scheduledTaskNames; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScheduledTasksRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.scheduledActions = request.scheduledActions;
            this.scheduledTaskIds = request.scheduledTaskIds;
            this.scheduledTaskNames = request.scheduledTaskNames;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScheduledActions.
         */
        public Builder scheduledActions(java.util.List < String > scheduledActions) {
            this.putQueryParameter("ScheduledActions", scheduledActions);
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * ScheduledTaskIds.
         */
        public Builder scheduledTaskIds(java.util.List < String > scheduledTaskIds) {
            this.putQueryParameter("ScheduledTaskIds", scheduledTaskIds);
            this.scheduledTaskIds = scheduledTaskIds;
            return this;
        }

        /**
         * ScheduledTaskNames.
         */
        public Builder scheduledTaskNames(java.util.List < String > scheduledTaskNames) {
            this.putQueryParameter("ScheduledTaskNames", scheduledTaskNames);
            this.scheduledTaskNames = scheduledTaskNames;
            return this;
        }

        @Override
        public DescribeScheduledTasksRequest build() {
            return new DescribeScheduledTasksRequest(this);
        } 

    } 

}
