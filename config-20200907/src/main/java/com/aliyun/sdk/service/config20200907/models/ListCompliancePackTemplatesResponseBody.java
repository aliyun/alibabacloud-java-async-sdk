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
         * <p>The information about the compliance package templates returned.</p>
         */
        public Builder compliancePackTemplatesResult(CompliancePackTemplatesResult compliancePackTemplatesResult) {
            this.compliancePackTemplatesResult = compliancePackTemplatesResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D67FC82F-25AE-4268-A94C-3348340748F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCompliancePackTemplatesResponseBody build() {
            return new ListCompliancePackTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCompliancePackTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompliancePackTemplatesResponseBody</p>
     */
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
             * <p>The name of the input parameter of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>days</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the input parameter of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required in the managed rule. Valid values:</p>
             * <ul>
             * <li>true: required</li>
             * <li>false: optional</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListCompliancePackTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompliancePackTemplatesResponseBody</p>
     */
    public static class ConfigRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleParameters")
        private java.util.List<ConfigRuleParameters> configRuleParameters;

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
        public java.util.List<ConfigRuleParameters> getConfigRuleParameters() {
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
            private java.util.List<ConfigRuleParameters> configRuleParameters; 
            private String controlDescription; 
            private String controlId; 
            private Boolean defaultEnable; 
            private String description; 
            private String managedRuleIdentifier; 
            private String managedRuleName; 
            private String resourceTypesScope; 
            private Integer riskLevel; 

            /**
             * <p>The input parameter of the managed rule.</p>
             */
            public Builder configRuleParameters(java.util.List<ConfigRuleParameters> configRuleParameters) {
                this.configRuleParameters = configRuleParameters;
                return this;
            }

            /**
             * <p>The description of the regulation. This parameter is available only for regulation compliance packages.</p>
             * 
             * <strong>example:</strong>
             * <p>No classic networks exist.</p>
             */
            public Builder controlDescription(String controlDescription) {
                this.controlDescription = controlDescription;
                return this;
            }

            /**
             * <p>The regulation ID.</p>
             * <blockquote>
             * <p> This parameter is available only for regulation compliance packages.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3.1</p>
             */
            public Builder controlId(String controlId) {
                this.controlId = controlId;
                return this;
            }

            /**
             * <p>Indicates whether the rules are enabled together with the compliance package. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultEnable(Boolean defaultEnable) {
                this.defaultEnable = defaultEnable;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>If the expiration time of the SLB certificate is later than the specified number of days after the check time, the configuration is considered compliant. Default value: 90 days.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>slb-servercertificate-expired-check</p>
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * <p>The name of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>slb-servercertificate-expired-check</p>
             */
            public Builder managedRuleName(String managedRuleName) {
                this.managedRuleName = managedRuleName;
                return this;
            }

            /**
             * <p>The types of the resources evaluated based on the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::SLB::ServerCertificate</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * <p>The risk level of the managed rule. Valid values:</p>
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

            public ConfigRules build() {
                return new ConfigRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCompliancePackTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompliancePackTemplatesResponseBody</p>
     */
    public static class CompliancePackTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateName")
        private String compliancePackTemplateName;

        @com.aliyun.core.annotation.NameInMap("ConfigRules")
        private java.util.List<ConfigRules> configRules;

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
        public java.util.List<ConfigRules> getConfigRules() {
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
            private java.util.List<ConfigRules> configRules; 
            private String description; 
            private String labels; 
            private Integer lastUpdate; 
            private Integer riskLevel; 

            /**
             * <p>The ID of the compliance package template.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-d254ff4e06a300cf****</p>
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * <p>The name of the compliance package template.</p>
             * 
             * <strong>example:</strong>
             * <p>BestPracticesForResourceStability</p>
             */
            public Builder compliancePackTemplateName(String compliancePackTemplateName) {
                this.compliancePackTemplateName = compliancePackTemplateName;
                return this;
            }

            /**
             * <p>The default rules in the compliance package.</p>
             */
            public Builder configRules(java.util.List<ConfigRules> configRules) {
                this.configRules = configRules;
                return this;
            }

            /**
             * <p>The description of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey-1</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The time when the compliance package was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1663408308</p>
             */
            public Builder lastUpdate(Integer lastUpdate) {
                this.lastUpdate = lastUpdate;
                return this;
            }

            /**
             * <p>The risk level of the managed rule in the compliance package. Valid values:</p>
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

            public CompliancePackTemplates build() {
                return new CompliancePackTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCompliancePackTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCompliancePackTemplatesResponseBody</p>
     */
    public static class CompliancePackTemplatesResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackTemplates")
        private java.util.List<CompliancePackTemplates> compliancePackTemplates;

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
        public java.util.List<CompliancePackTemplates> getCompliancePackTemplates() {
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
            private java.util.List<CompliancePackTemplates> compliancePackTemplates; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * <p>The compliance package templates.</p>
             */
            public Builder compliancePackTemplates(java.util.List<CompliancePackTemplates> compliancePackTemplates) {
                this.compliancePackTemplates = compliancePackTemplates;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of the compliance package templates returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
