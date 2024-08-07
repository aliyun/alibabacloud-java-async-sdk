// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCompliancePackTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCompliancePackTemplatesResponseBody</p>
 */
public class ListCompliancePackTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackTemplatesResult")
    private CompliancePackTemplatesResult compliancePackTemplatesResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCompliancePackTemplatesResponseBody(Builder builder) {
        this.compliancePackTemplatesResult = builder.compliancePackTemplatesResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompliancePackTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return compliancePackTemplatesResult
     */
    public CompliancePackTemplatesResult getCompliancePackTemplatesResult() {
        return this.compliancePackTemplatesResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompliancePackTemplatesResult compliancePackTemplatesResult; 
        private String requestId; 

        /**
         * The information about the compliance package templates returned.
         */
        public Builder compliancePackTemplatesResult(CompliancePackTemplatesResult compliancePackTemplatesResult) {
            this.compliancePackTemplatesResult = compliancePackTemplatesResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCompliancePackTemplatesResponseBody build() {
            return new ListCompliancePackTemplatesResponseBody(this);
        } 

    } 

    public static class ConfigRuleParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        private ConfigRuleParameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleParameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 
            private Boolean required; 

            /**
             * The name of the input parameter of the managed rule.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the input parameter of the managed rule.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * Indicates whether the parameter is required in the managed rule. Valid values:
             * <p>
             * 
             * *   true: required
             * *   false: optional
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ConfigRuleParameters build() {
                return new ConfigRuleParameters(this);
            } 

        } 

    }
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleParameters")
        private java.util.List < ConfigRuleParameters> configRuleParameters;

        @com.aliyun.core.annotation.NameInMap("ControlDescription")
        private String controlDescription;

        @com.aliyun.core.annotation.NameInMap("ControlId")
        private String controlId;

        @com.aliyun.core.annotation.NameInMap("DefaultEnable")
        private Boolean defaultEnable;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ManagedRuleIdentifier")
        private String managedRuleIdentifier;

        @com.aliyun.core.annotation.NameInMap("ManagedRuleName")
        private String managedRuleName;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        private ConfigRules(Builder builder) {
            this.configRuleParameters = builder.configRuleParameters;
            this.controlDescription = builder.controlDescription;
            this.controlId = builder.controlId;
            this.defaultEnable = builder.defaultEnable;
            this.description = builder.description;
            this.managedRuleIdentifier = builder.managedRuleIdentifier;
            this.managedRuleName = builder.managedRuleName;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRules create() {
            return builder().build();
        }

        /**
         * @return configRuleParameters
         */
        public java.util.List < ConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

        /**
         * @return controlDescription
         */
        public String getControlDescription() {
            return this.controlDescription;
        }

        /**
         * @return controlId
         */
        public String getControlId() {
            return this.controlId;
        }

        /**
         * @return defaultEnable
         */
        public Boolean getDefaultEnable() {
            return this.defaultEnable;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return managedRuleIdentifier
         */
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        /**
         * @return managedRuleName
         */
        public String getManagedRuleName() {
            return this.managedRuleName;
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

        public static final class Builder {
            private java.util.List < ConfigRuleParameters> configRuleParameters; 
            private String controlDescription; 
            private String controlId; 
            private Boolean defaultEnable; 
            private String description; 
            private String managedRuleIdentifier; 
            private String managedRuleName; 
            private String resourceTypesScope; 
            private Integer riskLevel; 

            /**
             * The input parameter of the managed rule.
             */
            public Builder configRuleParameters(java.util.List < ConfigRuleParameters> configRuleParameters) {
                this.configRuleParameters = configRuleParameters;
                return this;
            }

            /**
             * The description of the regulation. This parameter is available only for regulation compliance packages.
             */
            public Builder controlDescription(String controlDescription) {
                this.controlDescription = controlDescription;
                return this;
            }

            /**
             * The regulation ID.
             * <p>
             * 
             * >  This parameter is available only for regulation compliance packages.
             */
            public Builder controlId(String controlId) {
                this.controlId = controlId;
                return this;
            }

            /**
             * Indicates whether the rules are enabled together with the compliance package. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder defaultEnable(Boolean defaultEnable) {
                this.defaultEnable = defaultEnable;
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
             * The identifier of the managed rule.
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * The name of the managed rule.
             */
            public Builder managedRuleName(String managedRuleName) {
                this.managedRuleName = managedRuleName;
                return this;
            }

            /**
             * The types of the resources evaluated based on the rule.
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * The risk level of the managed rule. Valid values:
             * <p>
             * 
             * *   1: high
             * *   2: medium
             * *   3: low
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ConfigRules build() {
                return new ConfigRules(this);
            } 

        } 

    }
    public static class CompliancePackTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateName")
        private String compliancePackTemplateName;

        @com.aliyun.core.annotation.NameInMap("ConfigRules")
        private java.util.List < ConfigRules> configRules;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("LastUpdate")
        private Integer lastUpdate;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        private CompliancePackTemplates(Builder builder) {
            this.compliancePackTemplateId = builder.compliancePackTemplateId;
            this.compliancePackTemplateName = builder.compliancePackTemplateName;
            this.configRules = builder.configRules;
            this.description = builder.description;
            this.labels = builder.labels;
            this.lastUpdate = builder.lastUpdate;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePackTemplates create() {
            return builder().build();
        }

        /**
         * @return compliancePackTemplateId
         */
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        /**
         * @return compliancePackTemplateName
         */
        public String getCompliancePackTemplateName() {
            return this.compliancePackTemplateName;
        }

        /**
         * @return configRules
         */
        public java.util.List < ConfigRules> getConfigRules() {
            return this.configRules;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return lastUpdate
         */
        public Integer getLastUpdate() {
            return this.lastUpdate;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String compliancePackTemplateId; 
            private String compliancePackTemplateName; 
            private java.util.List < ConfigRules> configRules; 
            private String description; 
            private String labels; 
            private Integer lastUpdate; 
            private Integer riskLevel; 

            /**
             * The ID of the compliance package template.
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * The name of the compliance package template.
             */
            public Builder compliancePackTemplateName(String compliancePackTemplateName) {
                this.compliancePackTemplateName = compliancePackTemplateName;
                return this;
            }

            /**
             * The default rules in the compliance package.
             */
            public Builder configRules(java.util.List < ConfigRules> configRules) {
                this.configRules = configRules;
                return this;
            }

            /**
             * The description of the compliance package.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag of the compliance package.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The time when the compliance package was last updated.
             */
            public Builder lastUpdate(Integer lastUpdate) {
                this.lastUpdate = lastUpdate;
                return this;
            }

            /**
             * The risk level of the managed rule in the compliance package. Valid values:
             * <p>
             * 
             * *   1: high
             * *   2: medium
             * *   3: low
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public CompliancePackTemplates build() {
                return new CompliancePackTemplates(this);
            } 

        } 

    }
    public static class CompliancePackTemplatesResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplates")
        private java.util.List < CompliancePackTemplates> compliancePackTemplates;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private CompliancePackTemplatesResult(Builder builder) {
            this.compliancePackTemplates = builder.compliancePackTemplates;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePackTemplatesResult create() {
            return builder().build();
        }

        /**
         * @return compliancePackTemplates
         */
        public java.util.List < CompliancePackTemplates> getCompliancePackTemplates() {
            return this.compliancePackTemplates;
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
            private java.util.List < CompliancePackTemplates> compliancePackTemplates; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The compliance package templates.
             */
            public Builder compliancePackTemplates(java.util.List < CompliancePackTemplates> compliancePackTemplates) {
                this.compliancePackTemplates = compliancePackTemplates;
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
             * The total number of the compliance package templates returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CompliancePackTemplatesResult build() {
                return new CompliancePackTemplatesResult(this);
            } 

        } 

    }
}
