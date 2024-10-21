// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingRulesRequest</p>
 */
public class DescribeScalingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleAris")
    private java.util.List < String > scalingRuleAris;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleIds")
    private java.util.List < String > scalingRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleNames")
    private java.util.List < String > scalingRuleNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
    private String scalingRuleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowAlarmRules")
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
         * <p>The page number. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the scaling group to which the scaling rules that you want to query belong.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1ffogfdauy0jw0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The unique identifiers of the scaling rules that you want to query.</p>
         */
        public Builder scalingRuleAris(java.util.List < String > scalingRuleAris) {
            this.putQueryParameter("ScalingRuleAris", scalingRuleAris);
            this.scalingRuleAris = scalingRuleAris;
            return this;
        }

        /**
         * <p>The IDs of the scaling rules that you want to query.</p>
         */
        public Builder scalingRuleIds(java.util.List < String > scalingRuleIds) {
            this.putQueryParameter("ScalingRuleIds", scalingRuleIds);
            this.scalingRuleIds = scalingRuleIds;
            return this;
        }

        /**
         * <p>The names of the scaling rules that you want to query.</p>
         */
        public Builder scalingRuleNames(java.util.List < String > scalingRuleNames) {
            this.putQueryParameter("ScalingRuleNames", scalingRuleNames);
            this.scalingRuleNames = scalingRuleNames;
            return this;
        }

        /**
         * <p>The type of the scaling rule. Valid values:</p>
         * <ul>
         * <li>SimpleScalingRule: adjusts the number of ECS instances based on the values of the AdjustmentType and AdjustmentValue parameters.</li>
         * <li>TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of the TargetValue parameter.</li>
         * <li>StepScalingRule: scales ECS instances in steps based on the specified thresholds and metric values.</li>
         * <li>PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to adjust the boundary values for the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SimpleScalingRule</p>
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * <p>Specifies whether to return the event-triggered tasks that are associated with the scaling rule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
