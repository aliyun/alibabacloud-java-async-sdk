// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingRulesRequest</p>
 */
public class DescribeScalingRulesRequest extends Request {
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
    @NameInMap("ScalingRuleAris")
    private java.util.List < String > scalingRuleAris;

    @Query
    @NameInMap("ScalingRuleIds")
    private java.util.List < String > scalingRuleIds;

    @Query
    @NameInMap("ScalingRuleNames")
    private java.util.List < String > scalingRuleNames;

    @Query
    @NameInMap("ScalingRuleType")
    private String scalingRuleType;

    @Query
    @NameInMap("ShowAlarmRules")
    private Boolean showAlarmRules;

    private DescribeScalingRulesRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingRuleAris = builder.scalingRuleAris;
        this.scalingRuleIds = builder.scalingRuleIds;
        this.scalingRuleNames = builder.scalingRuleNames;
        this.scalingRuleType = builder.scalingRuleType;
        this.showAlarmRules = builder.showAlarmRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingRulesRequest create() {
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
     * @return scalingRuleAris
     */
    public java.util.List < String > getScalingRuleAris() {
        return this.scalingRuleAris;
    }

    /**
     * @return scalingRuleIds
     */
    public java.util.List < String > getScalingRuleIds() {
        return this.scalingRuleIds;
    }

    /**
     * @return scalingRuleNames
     */
    public java.util.List < String > getScalingRuleNames() {
        return this.scalingRuleNames;
    }

    /**
     * @return scalingRuleType
     */
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    /**
     * @return showAlarmRules
     */
    public Boolean getShowAlarmRules() {
        return this.showAlarmRules;
    }

    public static final class Builder extends Request.Builder<DescribeScalingRulesRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private java.util.List < String > scalingRuleAris; 
        private java.util.List < String > scalingRuleIds; 
        private java.util.List < String > scalingRuleNames; 
        private String scalingRuleType; 
        private Boolean showAlarmRules; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingRulesRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingRuleAris = request.scalingRuleAris;
            this.scalingRuleIds = request.scalingRuleIds;
            this.scalingRuleNames = request.scalingRuleNames;
            this.scalingRuleType = request.scalingRuleType;
            this.showAlarmRules = request.showAlarmRules;
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
         * The number of the page to return. Pages start from page 1.
         * <p>
         * 
         * Default value: 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 50.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         * <p>
         * 
         * Default value: 1.
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
         * The type of the scaling rule. Valid values:
         * <p>
         * 
         * *   SimpleScalingRule: adjusts the number of ECS instances based on the values of the AdjustmentType and AdjustmentValue parameters.
         * *   TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of the TargetValue parameter.
         * *   StepScalingRule: scales ECS instances in steps based on the specified thresholds and metric values.
         * *   PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to adjust the boundary values for the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The unique identifiers of the scaling rules that you want to query.
         */
        public Builder scalingRuleAris(java.util.List < String > scalingRuleAris) {
            this.putQueryParameter("ScalingRuleAris", scalingRuleAris);
            this.scalingRuleAris = scalingRuleAris;
            return this;
        }

        /**
         * The IDs of the scaling rules that you want to query.
         */
        public Builder scalingRuleIds(java.util.List < String > scalingRuleIds) {
            this.putQueryParameter("ScalingRuleIds", scalingRuleIds);
            this.scalingRuleIds = scalingRuleIds;
            return this;
        }

        /**
         * The names of the scaling rules that you want to query.
         */
        public Builder scalingRuleNames(java.util.List < String > scalingRuleNames) {
            this.putQueryParameter("ScalingRuleNames", scalingRuleNames);
            this.scalingRuleNames = scalingRuleNames;
            return this;
        }

        /**
         * Specifies whether to return CloudMonitor event-triggered tasks associated with scaling rules. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * Specifies whether to return the event-triggered tasks that are associated with the scaling rules. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false
         */
        public Builder showAlarmRules(Boolean showAlarmRules) {
            this.putQueryParameter("ShowAlarmRules", showAlarmRules);
            this.showAlarmRules = showAlarmRules;
            return this;
        }

        @Override
        public DescribeScalingRulesRequest build() {
            return new DescribeScalingRulesRequest(this);
        } 

    } 

}
