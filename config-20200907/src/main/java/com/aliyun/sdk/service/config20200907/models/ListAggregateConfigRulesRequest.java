// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateConfigRulesRequest</p>
 */
public class ListAggregateConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceType")
    private String complianceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
    private String configRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleState")
    private String configRuleState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private Integer riskLevel;

    private ListAggregateConfigRulesRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.complianceType = builder.complianceType;
        this.configRuleName = builder.configRuleName;
        this.configRuleState = builder.configRuleState;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceTypes = builder.resourceTypes;
        this.riskLevel = builder.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return configRuleName
     */
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * @return configRuleState
     */
    public String getConfigRuleState() {
        return this.configRuleState;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public static final class Builder extends Request.Builder<ListAggregateConfigRulesRequest, Builder> {
        private String aggregatorId; 
        private String complianceType; 
        private String configRuleName; 
        private String configRuleState; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceTypes; 
        private Integer riskLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateConfigRulesRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.complianceType = request.complianceType;
            this.configRuleName = request.configRuleName;
            this.configRuleState = request.configRuleState;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceTypes = request.resourceTypes;
            this.riskLevel = request.riskLevel;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The compliance evaluation result. Valid values:
         * <p>
         * 
         * *   COMPLIANT: The resources are evaluated as compliant.
         * *   NON_COMPLIANT: The resources are evaluated as non-compliant.
         * *   NOT_APPLICABLE: The rule does not apply to the resources.
         * *   INSUFFICIENT_DATA: No data is available.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder configRuleName(String configRuleName) {
            this.putQueryParameter("ConfigRuleName", configRuleName);
            this.configRuleName = configRuleName;
            return this;
        }

        /**
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   ACTIVE: The rule is being used to monitor resource configurations.
         * *   DELETING: The rule is being deleted.
         * *   EVALUATING: The rule is triggered and is being used to monitor resource configurations.
         * *   INACTIVE: The rule is disabled.
         */
        public Builder configRuleState(String configRuleState) {
            this.putQueryParameter("ConfigRuleState", configRuleState);
            this.configRuleState = configRuleState;
            return this;
        }

        /**
         * The keyword that is used for queries.
         * <p>
         * 
         * You can perform a fuzzy search by rule ID, rule name, rule description, or managed rule ID.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1. Default value: 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Resource type for the rule to evaluate.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * The risk level of the resources that do not comply with the rule. Valid values:
         * <p>
         * 
         * *   1: high
         * *   2: medium
         * *   3: low
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public ListAggregateConfigRulesRequest build() {
            return new ListAggregateConfigRulesRequest(this);
        } 

    } 

}
