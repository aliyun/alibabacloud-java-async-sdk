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
 * {@link ListManagedRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListManagedRulesResponseBody</p>
 */
public class ListManagedRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagedRules")
    private ManagedRules managedRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListManagedRulesResponseBody(Builder builder) {
        this.managedRules = builder.managedRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManagedRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managedRules
     */
    public ManagedRules getManagedRules() {
        return this.managedRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ManagedRules managedRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListManagedRulesResponseBody model) {
            this.managedRules = model.managedRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The managed rules.</p>
         */
        public Builder managedRules(ManagedRules managedRules) {
            this.managedRules = managedRules;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B3E605AB-63D5-1EE0-BFA6-0BAC247B0461</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListManagedRulesResponseBody build() {
            return new ListManagedRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedRulesResponseBody</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceResourceTypes")
        private java.util.List<String> complianceResourceTypes;

        private Scope(Builder builder) {
            this.complianceResourceTypes = builder.complianceResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return complianceResourceTypes
         */
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

        public static final class Builder {
            private java.util.List<String> complianceResourceTypes; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.complianceResourceTypes = model.complianceResourceTypes;
            } 

            /**
             * <p>The types of resources to which the managed rule applies.</p>
             */
            public Builder complianceResourceTypes(java.util.List<String> complianceResourceTypes) {
                this.complianceResourceTypes = complianceResourceTypes;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedRulesResponseBody</p>
     */
    public static class ManagedRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HelpUrls")
        private String helpUrls;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("RemediationTemplateIdentifier")
        private String remediationTemplateIdentifier;

        @com.aliyun.core.annotation.NameInMap("RemediationTemplateName")
        private String remediationTemplateName;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("SupportPreviewManagedRule")
        private Boolean supportPreviewManagedRule;

        private ManagedRuleList(Builder builder) {
            this.configRuleName = builder.configRuleName;
            this.description = builder.description;
            this.helpUrls = builder.helpUrls;
            this.identifier = builder.identifier;
            this.labels = builder.labels;
            this.remediationTemplateIdentifier = builder.remediationTemplateIdentifier;
            this.remediationTemplateName = builder.remediationTemplateName;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.supportPreviewManagedRule = builder.supportPreviewManagedRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRuleList create() {
            return builder().build();
        }

        /**
         * @return configRuleName
         */
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return helpUrls
         */
        public String getHelpUrls() {
            return this.helpUrls;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return remediationTemplateIdentifier
         */
        public String getRemediationTemplateIdentifier() {
            return this.remediationTemplateIdentifier;
        }

        /**
         * @return remediationTemplateName
         */
        public String getRemediationTemplateName() {
            return this.remediationTemplateName;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
        }

        /**
         * @return supportPreviewManagedRule
         */
        public Boolean getSupportPreviewManagedRule() {
            return this.supportPreviewManagedRule;
        }

        public static final class Builder {
            private String configRuleName; 
            private String description; 
            private String helpUrls; 
            private String identifier; 
            private java.util.List<String> labels; 
            private String remediationTemplateIdentifier; 
            private String remediationTemplateName; 
            private Integer riskLevel; 
            private Scope scope; 
            private Boolean supportPreviewManagedRule; 

            private Builder() {
            } 

            private Builder(ManagedRuleList model) {
                this.configRuleName = model.configRuleName;
                this.description = model.description;
                this.helpUrls = model.helpUrls;
                this.identifier = model.identifier;
                this.labels = model.labels;
                this.remediationTemplateIdentifier = model.remediationTemplateIdentifier;
                this.remediationTemplateName = model.remediationTemplateName;
                this.riskLevel = model.riskLevel;
                this.scope = model.scope;
                this.supportPreviewManagedRule = model.supportPreviewManagedRule;
            } 

            /**
             * <p>The name of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-rule-name</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The description of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the test rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the topic that describes how the managed rule remediates the incompliant configurations.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com">https://example.aliyundoc.com</a></p>
             */
            public Builder helpUrls(String helpUrls) {
                this.helpUrls = helpUrls;
                return this;
            }

            /**
             * <p>The unique identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cdn-domain-https-enabled</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The classification description of the managed rule.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The ID of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-CDN-SetDomainServerCertificate</p>
             */
            public Builder remediationTemplateIdentifier(String remediationTemplateIdentifier) {
                this.remediationTemplateIdentifier = remediationTemplateIdentifier;
                return this;
            }

            /**
             * <p>The name of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>Configure encryption rules for OSS buckets</p>
             */
            public Builder remediationTemplateName(String remediationTemplateName) {
                this.remediationTemplateName = remediationTemplateName;
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
             * <p>The effective scope of the managed rule.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Indicates whether precheck is supported. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportPreviewManagedRule(Boolean supportPreviewManagedRule) {
                this.supportPreviewManagedRule = supportPreviewManagedRule;
                return this;
            }

            public ManagedRuleList build() {
                return new ManagedRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedRulesResponseBody</p>
     */
    public static class ManagedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ManagedRuleList")
        private java.util.List<ManagedRuleList> managedRuleList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ManagedRules(Builder builder) {
            this.managedRuleList = builder.managedRuleList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRules create() {
            return builder().build();
        }

        /**
         * @return managedRuleList
         */
        public java.util.List<ManagedRuleList> getManagedRuleList() {
            return this.managedRuleList;
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
            private java.util.List<ManagedRuleList> managedRuleList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ManagedRules model) {
                this.managedRuleList = model.managedRuleList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The details of the managed rule.</p>
             */
            public Builder managedRuleList(java.util.List<ManagedRuleList> managedRuleList) {
                this.managedRuleList = managedRuleList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * <p>Page start from page 1.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Valid values: 1 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ManagedRules build() {
                return new ManagedRules(this);
            } 

        } 

    }
}
