// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingInstancesRequest</p>
 */
public class DescribeScalingInstancesRequest extends Request {
    @Query
    @NameInMap("CreationType")
    private String creationType;

    @Query
    @NameInMap("CreationTypes")
    private java.util.List < String > creationTypes;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("LifecycleState")
    private String lifecycleState;

    @Query
    @NameInMap("LifecycleStates")
    private java.util.List < String > lifecycleStates;

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
    @Validation(maximum = 100)
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
    @NameInMap("ScalingActivityId")
    private String scalingActivityId;

    @Query
    @NameInMap("ScalingConfigurationId")
    private String scalingConfigurationId;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private DescribeScalingInstancesRequest(Builder builder) {
        super(builder);
        this.creationType = builder.creationType;
        this.creationTypes = builder.creationTypes;
        this.healthStatus = builder.healthStatus;
        this.instanceIds = builder.instanceIds;
        this.lifecycleState = builder.lifecycleState;
        this.lifecycleStates = builder.lifecycleStates;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingActivityId = builder.scalingActivityId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationType
     */
    public String getCreationType() {
        return this.creationType;
    }

    /**
     * @return creationTypes
     */
    public java.util.List < String > getCreationTypes() {
        return this.creationTypes;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lifecycleState
     */
    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * @return lifecycleStates
     */
    public java.util.List < String > getLifecycleStates() {
        return this.lifecycleStates;
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
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    /**
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingInstancesRequest, Builder> {
        private String creationType; 
        private java.util.List < String > creationTypes; 
        private String healthStatus; 
        private java.util.List < String > instanceIds; 
        private String lifecycleState; 
        private java.util.List < String > lifecycleStates; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingActivityId; 
        private String scalingConfigurationId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingInstancesRequest request) {
            super(request);
            this.creationType = request.creationType;
            this.creationTypes = request.creationTypes;
            this.healthStatus = request.healthStatus;
            this.instanceIds = request.instanceIds;
            this.lifecycleState = request.lifecycleState;
            this.lifecycleStates = request.lifecycleStates;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingActivityId = request.scalingActivityId;
            this.scalingConfigurationId = request.scalingConfigurationId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * CreationType.
         */
        public Builder creationType(String creationType) {
            this.putQueryParameter("CreationType", creationType);
            this.creationType = creationType;
            return this;
        }

        /**
         * CreationTypes.
         */
        public Builder creationTypes(java.util.List < String > creationTypes) {
            this.putQueryParameter("CreationTypes", creationTypes);
            this.creationTypes = creationTypes;
            return this;
        }

        /**
         * HealthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * LifecycleState.
         */
        public Builder lifecycleState(String lifecycleState) {
            this.putQueryParameter("LifecycleState", lifecycleState);
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The lifecycle states of the ECS instance in the scaling group. You can specify only one of the LifecycleStates and LifecycleState parameters at the same time. We recommend that you specify this parameter.
         */
        public Builder lifecycleStates(java.util.List < String > lifecycleStates) {
            this.putQueryParameter("LifecycleStates", lifecycleStates);
            this.lifecycleStates = lifecycleStates;
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
         * ScalingActivityId.
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.putQueryParameter("ScalingActivityId", scalingActivityId);
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        /**
         * ScalingConfigurationId.
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
            this.scalingConfigurationId = scalingConfigurationId;
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

        @Override
        public DescribeScalingInstancesRequest build() {
            return new DescribeScalingInstancesRequest(this);
        } 

    } 

}
