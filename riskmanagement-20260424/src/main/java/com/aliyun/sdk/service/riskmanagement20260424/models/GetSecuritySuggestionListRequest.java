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
         * ListConfigRulesRequest.
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
             * CompliancePackId.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * ComplianceType.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * ConfigRuleName.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * ConfigRuleState.
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ResourceTypes.
             */
            public Builder resourceTypes(String resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            /**
             * RiskLevel.
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
