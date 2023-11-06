// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagedRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagedRuleResponseBody</p>
 */
public class GetManagedRuleResponseBody extends TeaModel {
    @NameInMap("ManagedRule")
    private ManagedRule managedRule;

    @NameInMap("RequestId")
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

        /**
         * The details of the managed rule.
         */
        public Builder managedRule(ManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetManagedRuleResponseBody build() {
            return new GetManagedRuleResponseBody(this);
        } 

    } 

    public static class Scope extends TeaModel {
        @NameInMap("ComplianceResourceTypes")
        private java.util.List < String > complianceResourceTypes;

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
        public java.util.List < String > getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

        public static final class Builder {
            private java.util.List < String > complianceResourceTypes; 

            /**
             * The type of resource to which the managed rule applies.
             */
            public Builder complianceResourceTypes(java.util.List < String > complianceResourceTypes) {
                this.complianceResourceTypes = complianceResourceTypes;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    public static class SourceDetails extends TeaModel {
        @NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @NameInMap("MessageType")
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

            /**
             * The interval at which the managed rule is triggered. Valid values:
             * <p>
             * 
             * *   One_Hour: 1 hour.
             * *   Three_Hours: 3 hours.
             * *   Six_Hours: 6 hours.
             * *   Twelve_Hours: 12 hours
             * *   TwentyFour_Hours: 24 hours
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * The trigger type of the managed rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.
             * *   ScheduledNotification: The managed rule is periodically triggered.
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
    public static class ManagedRule extends TeaModel {
        @NameInMap("CompulsoryInputParameterDetails")
        private java.util.Map < String, ? > compulsoryInputParameterDetails;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

        @NameInMap("Description")
        private String description;

        @NameInMap("HelpUrls")
        private String helpUrls;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("OptionalInputParameterDetails")
        private java.util.Map < String, ? > optionalInputParameterDetails;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("Scope")
        private Scope scope;

        @NameInMap("SourceDetails")
        private java.util.List < SourceDetails> sourceDetails;

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
        public java.util.Map < String, ? > getCompulsoryInputParameterDetails() {
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
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return optionalInputParameterDetails
         */
        public java.util.Map < String, ? > getOptionalInputParameterDetails() {
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
        public java.util.List < SourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private java.util.Map < String, ? > compulsoryInputParameterDetails; 
            private String configRuleName; 
            private String description; 
            private String helpUrls; 
            private String identifier; 
            private java.util.List < String > labels; 
            private java.util.Map < String, ? > optionalInputParameterDetails; 
            private Integer riskLevel; 
            private Scope scope; 
            private java.util.List < SourceDetails> sourceDetails; 

            /**
             * The settings of the required input parameters for the managed rule.
             */
            public Builder compulsoryInputParameterDetails(java.util.Map < String, ? > compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
                return this;
            }

            /**
             * The name of the managed rule.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * The description of the managed rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL of the topic that provides guidance on remediation for the managed rule.
             */
            public Builder helpUrls(String helpUrls) {
                this.helpUrls = helpUrls;
                return this;
            }

            /**
             * The identifier of the managed rule.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The tags of the managed rule.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The settings of the optional input parameters for the managed rule.
             */
            public Builder optionalInputParameterDetails(java.util.Map < String, ? > optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the managed rule. Valid values:
             * <p>
             * 
             * *   1: high risk level
             * *   2: medium risk level
             * *   3: low risk level
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The effective scope of the managed rule.
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The information about the trigger type of the managed rule.
             */
            public Builder sourceDetails(java.util.List < SourceDetails> sourceDetails) {
                this.sourceDetails = sourceDetails;
                return this;
            }

            public ManagedRule build() {
                return new ManagedRule(this);
            } 

        } 

    }
}
