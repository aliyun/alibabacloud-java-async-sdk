// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BenefitPkg} extends {@link TeaModel}
 *
 * <p>BenefitPkg</p>
 */
public class BenefitPkg extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("benefit_pkg_id")
    private String benefitPkgId;

    @com.aliyun.core.annotation.NameInMap("computation_rule")
    private String computationRule;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("priority")
    private Long priority;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private BenefitPkg(Builder builder) {
        this.benefitPkgId = builder.benefitPkgId;
        this.computationRule = builder.computationRule;
        this.createdAt = builder.createdAt;
        this.name = builder.name;
        this.priority = builder.priority;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BenefitPkg create() {
        return builder().build();
    }

    /**
     * @return benefitPkgId
     */
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    /**
     * @return computationRule
     */
    public String getComputationRule() {
        return this.computationRule;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String benefitPkgId; 
        private String computationRule; 
        private String createdAt; 
        private String name; 
        private Long priority; 
        private String status; 
        private String updatedAt; 

        /**
         * benefit_pkg_id.
         */
        public Builder benefitPkgId(String benefitPkgId) {
            this.benefitPkgId = benefitPkgId;
            return this;
        }

        /**
         * computation_rule.
         */
        public Builder computationRule(String computationRule) {
            this.computationRule = computationRule;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public BenefitPkg build() {
            return new BenefitPkg(this);
        } 

    } 

}
