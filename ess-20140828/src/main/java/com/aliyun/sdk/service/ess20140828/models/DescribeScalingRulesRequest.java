// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    @NameInMap("ScalingRuleAri")
    private java.util.List < String > scalingRuleAri;

    @Query
    @NameInMap("ScalingRuleId")
    private java.util.List < String > scalingRuleId;

    @Query
    @NameInMap("ScalingRuleName")
    private java.util.List < String > scalingRuleName;

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
        this.scalingRuleAri = builder.scalingRuleAri;
        this.scalingRuleId = builder.scalingRuleId;
        this.scalingRuleName = builder.scalingRuleName;
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
     * @return scalingRuleAri
     */
    public java.util.List < String > getScalingRuleAri() {
        return this.scalingRuleAri;
    }

    /**
     * @return scalingRuleId
     */
    public java.util.List < String > getScalingRuleId() {
        return this.scalingRuleId;
    }

    /**
     * @return scalingRuleName
     */
    public java.util.List < String > getScalingRuleName() {
        return this.scalingRuleName;
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
        private java.util.List < String > scalingRuleAri; 
        private java.util.List < String > scalingRuleId; 
        private java.util.List < String > scalingRuleName; 
        private String scalingRuleType; 
        private Boolean showAlarmRules; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingRulesRequest response) {
            super(response);
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingGroupId = response.scalingGroupId;
            this.scalingRuleAri = response.scalingRuleAri;
            this.scalingRuleId = response.scalingRuleId;
            this.scalingRuleName = response.scalingRuleName;
            this.scalingRuleType = response.scalingRuleType;
            this.showAlarmRules = response.showAlarmRules;
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
         * ScalingRuleAri.
         */
        public Builder scalingRuleAri(java.util.List < String > scalingRuleAri) {
            this.putQueryParameter("ScalingRuleAri", scalingRuleAri);
            this.scalingRuleAri = scalingRuleAri;
            return this;
        }

        /**
         * ScalingRuleId.
         */
        public Builder scalingRuleId(java.util.List < String > scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * ScalingRuleName.
         */
        public Builder scalingRuleName(java.util.List < String > scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * ScalingRuleType.
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        /**
         * ShowAlarmRules.
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
