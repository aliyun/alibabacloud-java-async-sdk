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
 * {@link PdpLaneCreateCmd} extends {@link TeaModel}
 *
 * <p>PdpLaneCreateCmd</p>
 */
public class PdpLaneCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("creatorUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String creatorUid;

    @com.aliyun.core.annotation.NameInMap("customeMarkingRules")
    private String customeMarkingRules;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("initGroupFlag")
    private Boolean initGroupFlag;

    @com.aliyun.core.annotation.NameInMap("inletServiceIds")
    private String inletServiceIds;

    @com.aliyun.core.annotation.NameInMap("markingRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String markingRuleType;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("ruleConditions")
    private java.util.List<RuleCondition> ruleConditions;

    @com.aliyun.core.annotation.NameInMap("ruleConnectType")
    private String ruleConnectType;

    @com.aliyun.core.annotation.NameInMap("serviceGroupIds")
    private String serviceGroupIds;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private PdpLaneCreateCmd(Builder builder) {
        this.alias = builder.alias;
        this.companyId = builder.companyId;
        this.creatorUid = builder.creatorUid;
        this.customeMarkingRules = builder.customeMarkingRules;
        this.description = builder.description;
        this.env = builder.env;
        this.initGroupFlag = builder.initGroupFlag;
        this.inletServiceIds = builder.inletServiceIds;
        this.markingRuleType = builder.markingRuleType;
        this.name = builder.name;
        this.productId = builder.productId;
        this.ruleConditions = builder.ruleConditions;
        this.ruleConnectType = builder.ruleConnectType;
        this.serviceGroupIds = builder.serviceGroupIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLaneCreateCmd create() {
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
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return creatorUid
     */
    public String getCreatorUid() {
        return this.creatorUid;
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
     * @return env
     */
    public String getEnv() {
        return this.env;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alias; 
        private Long companyId; 
        private String creatorUid; 
        private String customeMarkingRules; 
        private String description; 
        private String env; 
        private Boolean initGroupFlag; 
        private String inletServiceIds; 
        private String markingRuleType; 
        private String name; 
        private Long productId; 
        private java.util.List<RuleCondition> ruleConditions; 
        private String ruleConnectType; 
        private String serviceGroupIds; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpLaneCreateCmd model) {
            this.alias = model.alias;
            this.companyId = model.companyId;
            this.creatorUid = model.creatorUid;
            this.customeMarkingRules = model.customeMarkingRules;
            this.description = model.description;
            this.env = model.env;
            this.initGroupFlag = model.initGroupFlag;
            this.inletServiceIds = model.inletServiceIds;
            this.markingRuleType = model.markingRuleType;
            this.name = model.name;
            this.productId = model.productId;
            this.ruleConditions = model.ruleConditions;
            this.ruleConnectType = model.ruleConnectType;
            this.serviceGroupIds = model.serviceGroupIds;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>灰度</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>252333049301505383</p>
         */
        public Builder creatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
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
         * <p>TEST</p>
         */
        public Builder env(String env) {
            this.env = env;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder productId(Long productId) {
            this.productId = productId;
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
         * serviceGroupIds.
         */
        public Builder serviceGroupIds(String serviceGroupIds) {
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>灰度</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpLaneCreateCmd build() {
            return new PdpLaneCreateCmd(this);
        } 

    } 

}
