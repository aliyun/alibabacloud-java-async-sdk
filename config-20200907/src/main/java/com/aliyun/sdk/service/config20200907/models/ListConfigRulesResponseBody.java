// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigRulesResponseBody</p>
 */
public class ListConfigRulesResponseBody extends TeaModel {
    @NameInMap("ConfigRules")
    private ConfigRules configRules;

    @NameInMap("RequestId")
    private String requestId;

    private ListConfigRulesResponseBody(Builder builder) {
        this.configRules = builder.configRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRulesResponseBody create() {
        return builder().build();
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

        /**
         * The queried rules.
         */
        public Builder configRules(ConfigRules configRules) {
            this.configRules = configRules;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigRulesResponseBody build() {
            return new ListConfigRulesResponseBody(this);
        } 

    } 

    public static class Compliance extends TeaModel {
        @NameInMap("ComplianceType")
        private String complianceType;

        @NameInMap("Count")
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

            /**
             * The compliance evaluation result. Valid values:
             * <p>
             * 
             * - COMPLIANT: The resource is evaluated as compliant.
             * 
             * - NON_COMPLIANT: The resource is evaluated as non-compliant.
             * 
             * - NOT_APPLICABLE: The rule does not apply to the resource.
             * 
             * - INSUFFICIENT_DATA: No resource data is available.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The number of evaluated resources.
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
    public static class CreateBy extends TeaModel {
        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("CompliancePackName")
        private String compliancePackName;

        private CreateBy(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateBy create() {
            return builder().build();
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

        public static final class Builder {
            private String compliancePackId; 
            private String compliancePackName; 

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The name of the compliance package.
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            public CreateBy build() {
                return new CreateBy(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The tag key of the rule.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the rule.
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
    public static class ConfigRuleList extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AutomationType")
        private String automationType;

        @NameInMap("Compliance")
        private Compliance compliance;

        @NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

        @NameInMap("ConfigRuleState")
        private String configRuleState;

        @NameInMap("CreateBy")
        private CreateBy createBy;

        @NameInMap("Description")
        private String description;

        @NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("SourceIdentifier")
        private String sourceIdentifier;

        @NameInMap("SourceOwner")
        private String sourceOwner;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 

            /**
             * The ID of the management account to which the rule belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The type of the remediation template. Valid value: OOS, which indicates Operation Orchestration Service.
             */
            public Builder automationType(String automationType) {
                this.automationType = automationType;
                return this;
            }

            /**
             * The compliance evaluation result.
             */
            public Builder compliance(Compliance compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * The ARN of the rule.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The rule name.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * - ACTIVE: The rule is enabled.
             * 
             * - DELETING: The rule is being deleted.
             * 
             * - EVALUATING: The rule is triggered and is being used to monitor resource configurations.
             * 
             * - INACTIVE: The rule is disabled.
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * The information about the creation of the rule.
             */
            public Builder createBy(CreateBy createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The types of resources evaluated by the rule. Multiple resource types are separated with commas (,).
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rule. Valid values:
             * <p>
             * 
             * - 1: high
             * 
             * - 2: medium
             * 
             * - 3: low
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The ID of the rule.
             * <p>
             * 
             * - If the rule is a managed rule, the value of this parameter is the name of the managed rule.
             * 
             * - If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.
             */
            public Builder sourceIdentifier(String sourceIdentifier) {
                this.sourceIdentifier = sourceIdentifier;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * - CUSTOM_FC: custom rule
             * 
             * - ALIYUN: managed rule
             */
            public Builder sourceOwner(String sourceOwner) {
                this.sourceOwner = sourceOwner;
                return this;
            }

            /**
             * The tags of the rule.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ConfigRuleList build() {
                return new ConfigRuleList(this);
            } 

        } 

    }
    public static class ConfigRules extends TeaModel {
        @NameInMap("ConfigRuleList")
        private java.util.List < ConfigRuleList> configRuleList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < ConfigRuleList> getConfigRuleList() {
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
            private java.util.List < ConfigRuleList> configRuleList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The rule list.
             */
            public Builder configRuleList(java.util.List < ConfigRuleList> configRuleList) {
                this.configRuleList = configRuleList;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of rules.
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
