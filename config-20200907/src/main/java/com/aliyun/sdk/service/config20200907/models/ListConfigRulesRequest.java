// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRulesRequest</p>
 */
public class ListConfigRulesRequest extends Request {
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

    private ListConfigRulesRequest(Builder builder) {
        super(builder);
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

    public static ListConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListConfigRulesRequest, Builder> {
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

        private Builder(ListConfigRulesRequest request) {
            super(request);
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
         * The compliance evaluation result of the rule. Valid values:
         * <p>
         * 
         * *   COMPLIANT: The resources are evaluated as compliant.
         * *   NON_COMPLIANT: The resources are evaluated as non-compliant.
         * *   NOT_APPLICABLE: The rule does not apply to the resources.
         * *   INSUFFICIENT_DATA: No resource data is available.
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
         * *   ACTIVE: The rule is enabled.
         * *   DELETING: The rule is being deleted.
         * *   EVALUATING: The rule is being used to evaluate resource configurations.
         * *   INACTIVE: The rule is disabled.
         */
        public Builder configRuleState(String configRuleState) {
            this.putQueryParameter("ConfigRuleState", configRuleState);
            this.configRuleState = configRuleState;
            return this;
        }

        /**
         * The query keyword.
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
         * Page numbers start from 1. Default value: 1.
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
         * Valid values: 1 to 100. A minimum of 1 entry can be returned per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the resources to be evaluated based on the rule.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * The risk level of the resources that are not compliant with the rule. Valid values:
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
        public ListConfigRulesRequest build() {
            return new ListConfigRulesRequest(this);
        } 

    } 

}
