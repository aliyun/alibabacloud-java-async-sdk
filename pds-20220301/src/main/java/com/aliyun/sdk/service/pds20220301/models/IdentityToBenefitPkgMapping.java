// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IdentityToBenefitPkgMapping} extends {@link TeaModel}
 *
 * <p>IdentityToBenefitPkgMapping</p>
 */
public class IdentityToBenefitPkgMapping extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("benefit_pkg_computation_rule")
    private String benefitPkgComputationRule;

    @com.aliyun.core.annotation.NameInMap("benefit_pkg_id")
    private String benefitPkgId;

    @com.aliyun.core.annotation.NameInMap("benefit_pkg_name")
    private String benefitPkgName;

    @com.aliyun.core.annotation.NameInMap("benefit_pkg_owner_id")
    private String benefitPkgOwnerId;

    @com.aliyun.core.annotation.NameInMap("benefit_pkg_priority")
    private Long benefitPkgPriority;

    @com.aliyun.core.annotation.NameInMap("benefit_pkg_type")
    private String benefitPkgType;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("delivery_info_list")
    private java.util.List < BenefitPkgDeliveryInfo > deliveryInfoList;

    @com.aliyun.core.annotation.NameInMap("identity_id")
    private String identityId;

    @com.aliyun.core.annotation.NameInMap("identity_type")
    private String identityType;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private IdentityToBenefitPkgMapping(Builder builder) {
        this.benefitPkgComputationRule = builder.benefitPkgComputationRule;
        this.benefitPkgId = builder.benefitPkgId;
        this.benefitPkgName = builder.benefitPkgName;
        this.benefitPkgOwnerId = builder.benefitPkgOwnerId;
        this.benefitPkgPriority = builder.benefitPkgPriority;
        this.benefitPkgType = builder.benefitPkgType;
        this.createdAt = builder.createdAt;
        this.deliveryInfoList = builder.deliveryInfoList;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdentityToBenefitPkgMapping create() {
        return builder().build();
    }

    /**
     * @return benefitPkgComputationRule
     */
    public String getBenefitPkgComputationRule() {
        return this.benefitPkgComputationRule;
    }

    /**
     * @return benefitPkgId
     */
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    /**
     * @return benefitPkgName
     */
    public String getBenefitPkgName() {
        return this.benefitPkgName;
    }

    /**
     * @return benefitPkgOwnerId
     */
    public String getBenefitPkgOwnerId() {
        return this.benefitPkgOwnerId;
    }

    /**
     * @return benefitPkgPriority
     */
    public Long getBenefitPkgPriority() {
        return this.benefitPkgPriority;
    }

    /**
     * @return benefitPkgType
     */
    public String getBenefitPkgType() {
        return this.benefitPkgType;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return deliveryInfoList
     */
    public java.util.List < BenefitPkgDeliveryInfo > getDeliveryInfoList() {
        return this.deliveryInfoList;
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String benefitPkgComputationRule; 
        private String benefitPkgId; 
        private String benefitPkgName; 
        private String benefitPkgOwnerId; 
        private Long benefitPkgPriority; 
        private String benefitPkgType; 
        private String createdAt; 
        private java.util.List < BenefitPkgDeliveryInfo > deliveryInfoList; 
        private String identityId; 
        private String identityType; 
        private String updatedAt; 

        /**
         * benefit_pkg_computation_rule.
         */
        public Builder benefitPkgComputationRule(String benefitPkgComputationRule) {
            this.benefitPkgComputationRule = benefitPkgComputationRule;
            return this;
        }

        /**
         * benefit_pkg_id.
         */
        public Builder benefitPkgId(String benefitPkgId) {
            this.benefitPkgId = benefitPkgId;
            return this;
        }

        /**
         * benefit_pkg_name.
         */
        public Builder benefitPkgName(String benefitPkgName) {
            this.benefitPkgName = benefitPkgName;
            return this;
        }

        /**
         * benefit_pkg_owner_id.
         */
        public Builder benefitPkgOwnerId(String benefitPkgOwnerId) {
            this.benefitPkgOwnerId = benefitPkgOwnerId;
            return this;
        }

        /**
         * benefit_pkg_priority.
         */
        public Builder benefitPkgPriority(Long benefitPkgPriority) {
            this.benefitPkgPriority = benefitPkgPriority;
            return this;
        }

        /**
         * benefit_pkg_type.
         */
        public Builder benefitPkgType(String benefitPkgType) {
            this.benefitPkgType = benefitPkgType;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * delivery_info_list.
         */
        public Builder deliveryInfoList(java.util.List < BenefitPkgDeliveryInfo > deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
            return this;
        }

        /**
         * identity_id.
         */
        public Builder identityId(String identityId) {
            this.identityId = identityId;
            return this;
        }

        /**
         * identity_type.
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public IdentityToBenefitPkgMapping build() {
            return new IdentityToBenefitPkgMapping(this);
        } 

    } 

}
