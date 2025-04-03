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
 * {@link GetManagedRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagedRuleResponseBody</p>
 */
public class GetManagedRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagedRule")
    private ManagedRule managedRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetManagedRuleResponseBody(Builder builder) {
        this.managedRule = builder.managedRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managedRule
     */
    public ManagedRule getManagedRule() {
        return this.managedRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ManagedRule managedRule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetManagedRuleResponseBody model) {
            this.managedRule = model.managedRule;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the managed rule.</p>
         */
        public Builder managedRule(ManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E6DDC09-87C1-5310-A924-3491EAAE6F90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetManagedRuleResponseBody build() {
            return new GetManagedRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetManagedRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetManagedRuleResponseBody</p>
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
     * {@link GetManagedRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetManagedRuleResponseBody</p>
     */
    public static class SourceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        private SourceDetails(Builder builder) {
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.messageType = builder.messageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDetails create() {
            return builder().build();
        }

        /**
         * @return maximumExecutionFrequency
         */
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        public static final class Builder {
            private String maximumExecutionFrequency; 
            private String messageType; 

            private Builder() {
            } 

            private Builder(SourceDetails model) {
                this.maximumExecutionFrequency = model.maximumExecutionFrequency;
                this.messageType = model.messageType;
            } 

            /**
             * <p>The interval at which the rule is triggered. Valid values: Valid values:</p>
             * <ul>
             * <li>One_Hour</li>
             * <li>Three_Hours</li>
             * <li>Six_Hours</li>
             * <li>Twelve_Hours</li>
             * <li>TwentyFour_Hours</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TwentyFour_Hours</p>
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * <p>The trigger type of the rule. Valid values:</p>
             * <ul>
             * <li>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</li>
             * <li>ScheduledNotification: The rule is periodically triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ConfigurationItemChangeNotification</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            public SourceDetails build() {
                return new SourceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetManagedRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetManagedRuleResponseBody</p>
     */
    public static class ManagedRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompulsoryInputParameterDetails")
        private java.util.Map<String, ?> compulsoryInputParameterDetails;

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

        @com.aliyun.core.annotation.NameInMap("OptionalInputParameterDetails")
        private java.util.Map<String, ?> optionalInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("SourceDetails")
        private java.util.List<SourceDetails> sourceDetails;

        private ManagedRule(Builder builder) {
            this.compulsoryInputParameterDetails = builder.compulsoryInputParameterDetails;
            this.configRuleName = builder.configRuleName;
            this.description = builder.description;
            this.helpUrls = builder.helpUrls;
            this.identifier = builder.identifier;
            this.labels = builder.labels;
            this.optionalInputParameterDetails = builder.optionalInputParameterDetails;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.sourceDetails = builder.sourceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRule create() {
            return builder().build();
        }

        /**
         * @return compulsoryInputParameterDetails
         */
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
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
         * @return optionalInputParameterDetails
         */
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
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
         * @return sourceDetails
         */
        public java.util.List<SourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private java.util.Map<String, ?> compulsoryInputParameterDetails; 
            private String configRuleName; 
            private String description; 
            private String helpUrls; 
            private String identifier; 
            private java.util.List<String> labels; 
            private java.util.Map<String, ?> optionalInputParameterDetails; 
            private Integer riskLevel; 
            private Scope scope; 
            private java.util.List<SourceDetails> sourceDetails; 

            private Builder() {
            } 

            private Builder(ManagedRule model) {
                this.compulsoryInputParameterDetails = model.compulsoryInputParameterDetails;
                this.configRuleName = model.configRuleName;
                this.description = model.description;
                this.helpUrls = model.helpUrls;
                this.identifier = model.identifier;
                this.labels = model.labels;
                this.optionalInputParameterDetails = model.optionalInputParameterDetails;
                this.riskLevel = model.riskLevel;
                this.scope = model.scope;
                this.sourceDetails = model.sourceDetails;
            } 

            /**
             * <p>The details of the required input parameters for the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder compulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
                return this;
            }

            /**
             * <p>The name of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cdn-domain-https-enabled</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The description of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>If HTTPS encryption is enabled for the CDN domain name, the configuration is considered compliant.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the topic that provides guidance on remediation for the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com">https://example.aliyundoc.com</a></p>
             */
            public Builder helpUrls(String helpUrls) {
                this.helpUrls = helpUrls;
                return this;
            }

            /**
             * <p>The identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cdn-domain-https-enabled</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The tags of the managed rule.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The details of the optional input parameters for the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder optionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
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

            /**
             * <p>The effective scope of the managed rule.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The information about the trigger type of the managed rule.</p>
             */
            public Builder sourceDetails(java.util.List<SourceDetails> sourceDetails) {
                this.sourceDetails = sourceDetails;
                return this;
            }

            public ManagedRule build() {
                return new ManagedRule(this);
            } 

        } 

    }
}
