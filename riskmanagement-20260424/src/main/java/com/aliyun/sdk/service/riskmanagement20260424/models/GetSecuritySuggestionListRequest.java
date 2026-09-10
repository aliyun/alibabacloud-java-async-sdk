// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetSecuritySuggestionListRequest} extends {@link RequestModel}
 *
 * <p>GetSecuritySuggestionListRequest</p>
 */
public class GetSecuritySuggestionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListConfigRulesRequest")
    private ListConfigRulesRequest listConfigRulesRequest;

    private GetSecuritySuggestionListRequest(Builder builder) {
        super(builder);
        this.listConfigRulesRequest = builder.listConfigRulesRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecuritySuggestionListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listConfigRulesRequest
     */
    public ListConfigRulesRequest getListConfigRulesRequest() {
        return this.listConfigRulesRequest;
    }

    public static final class Builder extends Request.Builder<GetSecuritySuggestionListRequest, Builder> {
        private ListConfigRulesRequest listConfigRulesRequest; 

        private Builder() {
            super();
        } 

        private Builder(GetSecuritySuggestionListRequest request) {
            super(request);
            this.listConfigRulesRequest = request.listConfigRulesRequest;
        } 

        /**
         * <p>The request parameters.</p>
         */
        public Builder listConfigRulesRequest(ListConfigRulesRequest listConfigRulesRequest) {
            String listConfigRulesRequestShrink = shrink(listConfigRulesRequest, "ListConfigRulesRequest", "json");
            this.putQueryParameter("ListConfigRulesRequest", listConfigRulesRequestShrink);
            this.listConfigRulesRequest = listConfigRulesRequest;
            return this;
        }

        @Override
        public GetSecuritySuggestionListRequest build() {
            return new GetSecuritySuggestionListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSecuritySuggestionListRequest} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListRequest</p>
     */
    public static class ListConfigRulesRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleState")
        private String configRuleState;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResourceTypes")
        private String resourceTypes;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        private ListConfigRulesRequest(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
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

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
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

        public static final class Builder {
            private String compliancePackId; 
            private String complianceType; 
            private String configRuleName; 
            private String configRuleState; 
            private String keyword; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String resourceTypes; 
            private Integer riskLevel; 

            private Builder() {
            } 

            private Builder(ListConfigRulesRequest model) {
                this.compliancePackId = model.compliancePackId;
                this.complianceType = model.complianceType;
                this.configRuleName = model.configRuleName;
                this.configRuleState = model.configRuleState;
                this.keyword = model.keyword;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.resourceTypes = model.resourceTypes;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The compliance package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-d7b061dbe91500aa179a</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The compliance evaluation result. Valid values:</p>
             * <ul>
             * <li><strong>COMPLIANT</strong>: Compliant.</li>
             * <li><strong>NON_COMPLIANT</strong>: Non-compliant.</li>
             * <li><strong>NOT_APPLICABLE</strong>: Not applicable.</li>
             * <li><strong>INSUFFICIENT_DATA</strong>: Insufficient data.</li>
             * <li><strong>IGNORED</strong>: Ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the rule.</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The rule running status. Valid values:</p>
             * <ul>
             * <li><strong>ACTIVE</strong>: Active.</li>
             * <li><strong>DELETING</strong>: Being deleted.</li>
             * <li><strong>EVALUATING</strong>: Being evaluated.</li>
             * <li><strong>INACTIVE</strong>: Inactive.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * <p>The query keyword.</p>
             * <p>Supports fuzzy match on the rule ID, rule name, rule description, and rule template identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The page number.</p>
             * <blockquote>
             * <p>Minimum value: 1. Default value: 1.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * <blockquote>
             * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The resource type evaluated by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceTypes(String resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            /**
             * <p>The risk level of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: High risk.</li>
             * <li><strong>2</strong>: Medium risk.</li>
             * <li><strong>3</strong>: Low risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ListConfigRulesRequest build() {
                return new ListConfigRulesRequest(this);
            } 

        } 

    }
}
