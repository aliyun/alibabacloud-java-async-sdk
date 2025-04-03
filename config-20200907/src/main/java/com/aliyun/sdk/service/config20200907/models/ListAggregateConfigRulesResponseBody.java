// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateConfigRulesResponseBody</p>
 */
public class ListAggregateConfigRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRules")
    private ConfigRules configRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateConfigRulesResponseBody(Builder builder) {
        this.configRules = builder.configRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRules
     */
    public ConfigRules getConfigRules() {
        return this.configRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigRules configRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateConfigRulesResponseBody model) {
            this.configRules = model.configRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried rules.</p>
         */
        public Builder configRules(ConfigRules configRules) {
            this.configRules = configRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22EF8287-2C9A-4F1F-80A6-CEFA7612689D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateConfigRulesResponseBody build() {
            return new ListAggregateConfigRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigRulesResponseBody</p>
     */
    public static class Compliance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private Compliance(Builder builder) {
            this.complianceType = builder.complianceType;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compliance create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String complianceType; 
            private Integer count; 

            private Builder() {
            } 

            private Builder(Compliance model) {
                this.complianceType = model.complianceType;
                this.count = model.count;
            } 

            /**
             * <p>The compliance evaluation result. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resources are evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
             * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
             * <li>INSUFFICIENT_DATA: No data is available.</li>
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
             * <p>The number of evaluation resources that correspond to the summary result of the rule compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public Compliance build() {
                return new Compliance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigRulesResponseBody</p>
     */
    public static class CreateBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("AggregatorName")
        private String aggregatorName;

        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackName")
        private String compliancePackName;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CreatorType")
        private String creatorType;

        private CreateBy(Builder builder) {
            this.aggregatorId = builder.aggregatorId;
            this.aggregatorName = builder.aggregatorName;
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.creatorType = builder.creatorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateBy create() {
            return builder().build();
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return aggregatorName
         */
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return compliancePackName
         */
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        public static final class Builder {
            private String aggregatorId; 
            private String aggregatorName; 
            private String compliancePackId; 
            private String compliancePackName; 
            private String creatorId; 
            private String creatorName; 
            private String creatorType; 

            private Builder() {
            } 

            private Builder(CreateBy model) {
                this.aggregatorId = model.aggregatorId;
                this.aggregatorName = model.aggregatorName;
                this.compliancePackId = model.compliancePackId;
                this.compliancePackName = model.compliancePackName;
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.creatorType = model.creatorType;
            } 

            /**
             * <p>The account group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-f632626622af0079****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The name of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test_Group</p>
             */
            public Builder aggregatorName(String aggregatorName) {
                this.aggregatorName = aggregatorName;
                return this;
            }

            /**
             * <p>The compliance package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-fdc8626622af00f9****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The name of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>test-pack-name</p>
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * <p>The ID of the management account that created the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the management account that create the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The type of the creator of the rule. The value is fixed to AGGREGATOR, which indicates an account group.</p>
             * 
             * <strong>example:</strong>
             * <p>AGGREGATOR</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            public CreateBy build() {
                return new CreateBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigRulesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigRulesResponseBody</p>
     */
    public static class ConfigRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AutomationType")
        private String automationType;

        @com.aliyun.core.annotation.NameInMap("Compliance")
        private Compliance compliance;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleState")
        private String configRuleState;

        @com.aliyun.core.annotation.NameInMap("CreateBy")
        private CreateBy createBy;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("SourceIdentifier")
        private String sourceIdentifier;

        @com.aliyun.core.annotation.NameInMap("SourceOwner")
        private String sourceOwner;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private ConfigRuleList(Builder builder) {
            this.accountId = builder.accountId;
            this.automationType = builder.automationType;
            this.compliance = builder.compliance;
            this.configRuleArn = builder.configRuleArn;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleState = builder.configRuleState;
            this.createBy = builder.createBy;
            this.description = builder.description;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
            this.sourceIdentifier = builder.sourceIdentifier;
            this.sourceOwner = builder.sourceOwner;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return automationType
         */
        public String getAutomationType() {
            return this.automationType;
        }

        /**
         * @return compliance
         */
        public Compliance getCompliance() {
            return this.compliance;
        }

        /**
         * @return configRuleArn
         */
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
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
         * @return createBy
         */
        public CreateBy getCreateBy() {
            return this.createBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return resourceTypesScope
         */
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sourceIdentifier
         */
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        /**
         * @return sourceOwner
         */
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long accountId; 
            private String automationType; 
            private Compliance compliance; 
            private String configRuleArn; 
            private String configRuleId; 
            private String configRuleName; 
            private String configRuleState; 
            private CreateBy createBy; 
            private String description; 
            private String resourceTypesScope; 
            private Integer riskLevel; 
            private String sourceIdentifier; 
            private String sourceOwner; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(ConfigRuleList model) {
                this.accountId = model.accountId;
                this.automationType = model.automationType;
                this.compliance = model.compliance;
                this.configRuleArn = model.configRuleArn;
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
                this.configRuleState = model.configRuleState;
                this.createBy = model.createBy;
                this.description = model.description;
                this.resourceTypesScope = model.resourceTypesScope;
                this.riskLevel = model.riskLevel;
                this.sourceIdentifier = model.sourceIdentifier;
                this.sourceOwner = model.sourceOwner;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the management account to which the rules belong.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The type of the remediation template. Only OOS is returned, which indicates CloudOps Orchestration Service.</p>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
             */
            public Builder automationType(String automationType) {
                this.automationType = automationType;
                return this;
            }

            /**
             * <p>The compliance evaluation result.</p>
             */
            public Builder compliance(Compliance compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * <p>The ARN of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:config::100931896542****:rule/cr-fdc8626622af00f9****</p>
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-fdc8626622af00f9****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-rule-name</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li>ACTIVE: The rule is being used to monitor resource configurations.</li>
             * <li>DELETING: The rule is being deleted.</li>
             * <li>EVALUATING: The rule is triggered and is being used to monitor resource configurations.</li>
             * <li>INACTIVE: The rule is disabled.</li>
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
             * <p>The information about the creation of the rule.</p>
             */
            public Builder createBy(CreateBy createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the test rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The types of resources evaluated by the rule. Multiple resource types are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::EIP::EipAddress</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
             * <ul>
             * <li>1: high</li>
             * <li>2: medium</li>
             * <li>3: low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The identifier of the rule.</p>
             * <ul>
             * <li>If the rule is a managed rule, the value of this parameter is the name of the managed rule.</li>
             * <li>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of a function.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eip-bandwidth-limit</p>
             */
            public Builder sourceIdentifier(String sourceIdentifier) {
                this.sourceIdentifier = sourceIdentifier;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li>CUSTOM_FC: a custom rule.</li>
             * <li>ALIYUN: a managed rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder sourceOwner(String sourceOwner) {
                this.sourceOwner = sourceOwner;
                return this;
            }

            /**
             * <p>The tags of the rule.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ConfigRuleList build() {
                return new ConfigRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateConfigRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateConfigRulesResponseBody</p>
     */
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleList")
        private java.util.List<ConfigRuleList> configRuleList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ConfigRules(Builder builder) {
            this.configRuleList = builder.configRuleList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRules create() {
            return builder().build();
        }

        /**
         * @return configRuleList
         */
        public java.util.List<ConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ConfigRuleList> configRuleList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ConfigRules model) {
                this.configRuleList = model.configRuleList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The details of the rule.</p>
             */
            public Builder configRuleList(java.util.List<ConfigRuleList> configRuleList) {
                this.configRuleList = configRuleList;
                return this;
            }

            /**
             * <p>The number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ConfigRules build() {
                return new ConfigRules(this);
            } 

        } 

    }
}
