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
 * {@link PdpLane} extends {@link TeaModel}
 *
 * <p>PdpLane</p>
 */
public class PdpLane extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("creatorUid")
    private String creatorUid;

    @com.aliyun.core.annotation.NameInMap("customeMarkingRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customeMarkingRules;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("initGroupFlag")
    private Boolean initGroupFlag;

    @com.aliyun.core.annotation.NameInMap("inletServices")
    private java.util.List<PdpServiceInfo> inletServices;

    @com.aliyun.core.annotation.NameInMap("markingRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String markingRuleType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ruleConditions")
    private java.util.List<RuleCondition> ruleConditions;

    @com.aliyun.core.annotation.NameInMap("ruleConnectType")
    private String ruleConnectType;

    @com.aliyun.core.annotation.NameInMap("serviceGroups")
    private java.util.List<ServiceGroupInfo> serviceGroups;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PdpLane(Builder builder) {
        this.alias = builder.alias;
        this.companyId = builder.companyId;
        this.creatorName = builder.creatorName;
        this.creatorUid = builder.creatorUid;
        this.customeMarkingRules = builder.customeMarkingRules;
        this.description = builder.description;
        this.env = builder.env;
        this.id = builder.id;
        this.initGroupFlag = builder.initGroupFlag;
        this.inletServices = builder.inletServices;
        this.markingRuleType = builder.markingRuleType;
        this.name = builder.name;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.requestId = builder.requestId;
        this.ruleConditions = builder.ruleConditions;
        this.ruleConnectType = builder.ruleConnectType;
        this.serviceGroups = builder.serviceGroups;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLane create() {
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
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
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
     * @return inletServices
     */
    public java.util.List<PdpServiceInfo> getInletServices() {
        return this.inletServices;
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
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return serviceGroups
     */
    public java.util.List<ServiceGroupInfo> getServiceGroups() {
        return this.serviceGroups;
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
        private String creatorName; 
        private String creatorUid; 
        private String customeMarkingRules; 
        private String description; 
        private String env; 
        private Long id; 
        private Boolean initGroupFlag; 
        private java.util.List<PdpServiceInfo> inletServices; 
        private String markingRuleType; 
        private String name; 
        private Long productId; 
        private String productName; 
        private String requestId; 
        private java.util.List<RuleCondition> ruleConditions; 
        private String ruleConnectType; 
        private java.util.List<ServiceGroupInfo> serviceGroups; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpLane model) {
            this.alias = model.alias;
            this.companyId = model.companyId;
            this.creatorName = model.creatorName;
            this.creatorUid = model.creatorUid;
            this.customeMarkingRules = model.customeMarkingRules;
            this.description = model.description;
            this.env = model.env;
            this.id = model.id;
            this.initGroupFlag = model.initGroupFlag;
            this.inletServices = model.inletServices;
            this.markingRuleType = model.markingRuleType;
            this.name = model.name;
            this.productId = model.productId;
            this.productName = model.productName;
            this.requestId = model.requestId;
            this.ruleConditions = model.ruleConditions;
            this.ruleConnectType = model.ruleConnectType;
            this.serviceGroups = model.serviceGroups;
            this.type = model.type;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * creatorUid.
         */
        public Builder creatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rules:
         *     - vars:
         *         - name: userId
         *           position: header
         *           key: x-linkedmall-user-id
         *         - name: userType
         *           position: query
         *           key: userType
         *       expression: &quot;userId % 10 == 0 &amp;&amp; userType == A&quot;
         *       tag: &quot;gray&quot;
         *       scope: &quot;pbc1,pbc2&quot;</p>
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
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * id.
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
         * inletServices.
         */
        public Builder inletServices(java.util.List<PdpServiceInfo> inletServices) {
            this.inletServices = inletServices;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * serviceGroups.
         */
        public Builder serviceGroups(java.util.List<ServiceGroupInfo> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpLane build() {
            return new PdpLane(this);
        } 

    } 

}
