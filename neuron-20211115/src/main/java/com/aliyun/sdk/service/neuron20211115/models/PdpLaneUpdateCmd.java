// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PdpLaneUpdateCmd} extends {@link TeaModel}
 *
 * <p>PdpLaneUpdateCmd</p>
 */
public class PdpLaneUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("customeMarkingRules")
    private String customeMarkingRules;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("initGroupFlag")
    private Boolean initGroupFlag;

    @com.aliyun.core.annotation.NameInMap("inletServiceIds")
    private String inletServiceIds;

    @com.aliyun.core.annotation.NameInMap("markingRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String markingRuleType;

    @com.aliyun.core.annotation.NameInMap("ruleConditions")
    private java.util.List<RuleCondition> ruleConditions;

    @com.aliyun.core.annotation.NameInMap("ruleConnectType")
    private String ruleConnectType;

    @com.aliyun.core.annotation.NameInMap("serviceGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceGroupIds;

    private PdpLaneUpdateCmd(Builder builder) {
        this.alias = builder.alias;
        this.customeMarkingRules = builder.customeMarkingRules;
        this.description = builder.description;
        this.id = builder.id;
        this.initGroupFlag = builder.initGroupFlag;
        this.inletServiceIds = builder.inletServiceIds;
        this.markingRuleType = builder.markingRuleType;
        this.ruleConditions = builder.ruleConditions;
        this.ruleConnectType = builder.ruleConnectType;
        this.serviceGroupIds = builder.serviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLaneUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return customeMarkingRules
     */
    public String getCustomeMarkingRules() {
        return this.customeMarkingRules;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return initGroupFlag
     */
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    /**
     * @return inletServiceIds
     */
    public String getInletServiceIds() {
        return this.inletServiceIds;
    }

    /**
     * @return markingRuleType
     */
    public String getMarkingRuleType() {
        return this.markingRuleType;
    }

    /**
     * @return ruleConditions
     */
    public java.util.List<RuleCondition> getRuleConditions() {
        return this.ruleConditions;
    }

    /**
     * @return ruleConnectType
     */
    public String getRuleConnectType() {
        return this.ruleConnectType;
    }

    /**
     * @return serviceGroupIds
     */
    public String getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public static final class Builder {
        private String alias; 
        private String customeMarkingRules; 
        private String description; 
        private Long id; 
        private Boolean initGroupFlag; 
        private String inletServiceIds; 
        private String markingRuleType; 
        private java.util.List<RuleCondition> ruleConditions; 
        private String ruleConnectType; 
        private String serviceGroupIds; 

        private Builder() {
        } 

        private Builder(PdpLaneUpdateCmd model) {
            this.alias = model.alias;
            this.customeMarkingRules = model.customeMarkingRules;
            this.description = model.description;
            this.id = model.id;
            this.initGroupFlag = model.initGroupFlag;
            this.inletServiceIds = model.inletServiceIds;
            this.markingRuleType = model.markingRuleType;
            this.ruleConditions = model.ruleConditions;
            this.ruleConnectType = model.ruleConnectType;
            this.serviceGroupIds = model.serviceGroupIds;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * customeMarkingRules.
         */
        public Builder customeMarkingRules(String customeMarkingRules) {
            this.customeMarkingRules = customeMarkingRules;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * initGroupFlag.
         */
        public Builder initGroupFlag(Boolean initGroupFlag) {
            this.initGroupFlag = initGroupFlag;
            return this;
        }

        /**
         * inletServiceIds.
         */
        public Builder inletServiceIds(String inletServiceIds) {
            this.inletServiceIds = inletServiceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        public Builder markingRuleType(String markingRuleType) {
            this.markingRuleType = markingRuleType;
            return this;
        }

        /**
         * ruleConditions.
         */
        public Builder ruleConditions(java.util.List<RuleCondition> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }

        /**
         * ruleConnectType.
         */
        public Builder ruleConnectType(String ruleConnectType) {
            this.ruleConnectType = ruleConnectType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder serviceGroupIds(String serviceGroupIds) {
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        public PdpLaneUpdateCmd build() {
            return new PdpLaneUpdateCmd(this);
        } 

    } 

}
