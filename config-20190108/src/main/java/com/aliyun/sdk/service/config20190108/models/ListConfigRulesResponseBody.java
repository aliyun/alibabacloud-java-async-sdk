// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

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
         * ConfigRules.
         */
        public Builder configRules(ConfigRules configRules) {
            this.configRules = configRules;
            return this;
        }

        /**
         * RequestId.
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
             * ComplianceType.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * Count.
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
             * CompliancePackId.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * CompliancePackName.
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
    public static class ConfigRuleList extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AutomationType")
        private String automationType;

        @NameInMap("Compliance")
        private Compliance compliance;

        @NameInMap("CompliancePackId")
        private String compliancePackId;

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

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("SourceIdentifier")
        private String sourceIdentifier;

        @NameInMap("SourceOwner")
        private String sourceOwner;

        private ConfigRuleList(Builder builder) {
            this.accountId = builder.accountId;
            this.automationType = builder.automationType;
            this.compliance = builder.compliance;
            this.compliancePackId = builder.compliancePackId;
            this.configRuleArn = builder.configRuleArn;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleState = builder.configRuleState;
            this.createBy = builder.createBy;
            this.description = builder.description;
            this.riskLevel = builder.riskLevel;
            this.sourceIdentifier = builder.sourceIdentifier;
            this.sourceOwner = builder.sourceOwner;
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
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
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

        public static final class Builder {
            private Long accountId; 
            private String automationType; 
            private Compliance compliance; 
            private String compliancePackId; 
            private String configRuleArn; 
            private String configRuleId; 
            private String configRuleName; 
            private String configRuleState; 
            private CreateBy createBy; 
            private String description; 
            private Integer riskLevel; 
            private String sourceIdentifier; 
            private String sourceOwner; 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AutomationType.
             */
            public Builder automationType(String automationType) {
                this.automationType = automationType;
                return this;
            }

            /**
             * Compliance.
             */
            public Builder compliance(Compliance compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * CompliancePackId.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * ConfigRuleArn.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * ConfigRuleId.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
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
             * CreateBy.
             */
            public Builder createBy(CreateBy createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SourceIdentifier.
             */
            public Builder sourceIdentifier(String sourceIdentifier) {
                this.sourceIdentifier = sourceIdentifier;
                return this;
            }

            /**
             * SourceOwner.
             */
            public Builder sourceOwner(String sourceOwner) {
                this.sourceOwner = sourceOwner;
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
             * ConfigRuleList.
             */
            public Builder configRuleList(java.util.List < ConfigRuleList> configRuleList) {
                this.configRuleList = configRuleList;
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
             * TotalCount.
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
