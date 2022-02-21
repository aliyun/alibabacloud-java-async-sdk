// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigRuleResponseBody</p>
 */
public class DescribeConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRule")
    private ConfigRule configRule;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeConfigRuleResponseBody(Builder builder) {
        this.configRule = builder.configRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRule
     */
    public ConfigRule getConfigRule() {
        return this.configRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigRule configRule; 
        private String requestId; 

        /**
         * ConfigRule.
         */
        public Builder configRule(ConfigRule configRule) {
            this.configRule = configRule;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigRuleResponseBody build() {
            return new DescribeConfigRuleResponseBody(this);
        } 

    } 

    public static class ConfigRuleEvaluationStatus extends TeaModel {
        @NameInMap("FirstActivatedTimestamp")
        private Long firstActivatedTimestamp;

        @NameInMap("FirstEvaluationStarted")
        private Boolean firstEvaluationStarted;

        @NameInMap("LastErrorCode")
        private String lastErrorCode;

        @NameInMap("LastErrorMessage")
        private String lastErrorMessage;

        @NameInMap("LastFailedEvaluationTimestamp")
        private Long lastFailedEvaluationTimestamp;

        @NameInMap("LastFailedInvocationTimestamp")
        private Long lastFailedInvocationTimestamp;

        @NameInMap("LastSuccessfulEvaluationTimestamp")
        private Long lastSuccessfulEvaluationTimestamp;

        @NameInMap("LastSuccessfulInvocationTimestamp")
        private Long lastSuccessfulInvocationTimestamp;

        private ConfigRuleEvaluationStatus(Builder builder) {
            this.firstActivatedTimestamp = builder.firstActivatedTimestamp;
            this.firstEvaluationStarted = builder.firstEvaluationStarted;
            this.lastErrorCode = builder.lastErrorCode;
            this.lastErrorMessage = builder.lastErrorMessage;
            this.lastFailedEvaluationTimestamp = builder.lastFailedEvaluationTimestamp;
            this.lastFailedInvocationTimestamp = builder.lastFailedInvocationTimestamp;
            this.lastSuccessfulEvaluationTimestamp = builder.lastSuccessfulEvaluationTimestamp;
            this.lastSuccessfulInvocationTimestamp = builder.lastSuccessfulInvocationTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleEvaluationStatus create() {
            return builder().build();
        }

        /**
         * @return firstActivatedTimestamp
         */
        public Long getFirstActivatedTimestamp() {
            return this.firstActivatedTimestamp;
        }

        /**
         * @return firstEvaluationStarted
         */
        public Boolean getFirstEvaluationStarted() {
            return this.firstEvaluationStarted;
        }

        /**
         * @return lastErrorCode
         */
        public String getLastErrorCode() {
            return this.lastErrorCode;
        }

        /**
         * @return lastErrorMessage
         */
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        /**
         * @return lastFailedEvaluationTimestamp
         */
        public Long getLastFailedEvaluationTimestamp() {
            return this.lastFailedEvaluationTimestamp;
        }

        /**
         * @return lastFailedInvocationTimestamp
         */
        public Long getLastFailedInvocationTimestamp() {
            return this.lastFailedInvocationTimestamp;
        }

        /**
         * @return lastSuccessfulEvaluationTimestamp
         */
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        /**
         * @return lastSuccessfulInvocationTimestamp
         */
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

        public static final class Builder {
            private Long firstActivatedTimestamp; 
            private Boolean firstEvaluationStarted; 
            private String lastErrorCode; 
            private String lastErrorMessage; 
            private Long lastFailedEvaluationTimestamp; 
            private Long lastFailedInvocationTimestamp; 
            private Long lastSuccessfulEvaluationTimestamp; 
            private Long lastSuccessfulInvocationTimestamp; 

            /**
             * FirstActivatedTimestamp.
             */
            public Builder firstActivatedTimestamp(Long firstActivatedTimestamp) {
                this.firstActivatedTimestamp = firstActivatedTimestamp;
                return this;
            }

            /**
             * FirstEvaluationStarted.
             */
            public Builder firstEvaluationStarted(Boolean firstEvaluationStarted) {
                this.firstEvaluationStarted = firstEvaluationStarted;
                return this;
            }

            /**
             * LastErrorCode.
             */
            public Builder lastErrorCode(String lastErrorCode) {
                this.lastErrorCode = lastErrorCode;
                return this;
            }

            /**
             * LastErrorMessage.
             */
            public Builder lastErrorMessage(String lastErrorMessage) {
                this.lastErrorMessage = lastErrorMessage;
                return this;
            }

            /**
             * LastFailedEvaluationTimestamp.
             */
            public Builder lastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
                this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
                return this;
            }

            /**
             * LastFailedInvocationTimestamp.
             */
            public Builder lastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
                this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
                return this;
            }

            /**
             * LastSuccessfulEvaluationTimestamp.
             */
            public Builder lastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
                this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
                return this;
            }

            /**
             * LastSuccessfulInvocationTimestamp.
             */
            public Builder lastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
                this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
                return this;
            }

            public ConfigRuleEvaluationStatus build() {
                return new ConfigRuleEvaluationStatus(this);
            } 

        } 

    }
    public static class SourceDetails extends TeaModel {
        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @NameInMap("MessageType")
        private String messageType;

        private SourceDetails(Builder builder) {
            this.eventSource = builder.eventSource;
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
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
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
            private String eventSource; 
            private String maximumExecutionFrequency; 
            private String messageType; 

            /**
             * EventSource.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * MaximumExecutionFrequency.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * MessageType.
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

        @NameInMap("Description")
        private String description;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("ManagedRuleName")
        private String managedRuleName;

        @NameInMap("OptionalInputParameterDetails")
        private java.util.Map < String, ? > optionalInputParameterDetails;

        @NameInMap("SourceDetails")
        private java.util.List < SourceDetails> sourceDetails;

        private ManagedRule(Builder builder) {
            this.compulsoryInputParameterDetails = builder.compulsoryInputParameterDetails;
            this.description = builder.description;
            this.identifier = builder.identifier;
            this.labels = builder.labels;
            this.managedRuleName = builder.managedRuleName;
            this.optionalInputParameterDetails = builder.optionalInputParameterDetails;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return managedRuleName
         */
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        /**
         * @return optionalInputParameterDetails
         */
        public java.util.Map < String, ? > getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        /**
         * @return sourceDetails
         */
        public java.util.List < SourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private java.util.Map < String, ? > compulsoryInputParameterDetails; 
            private String description; 
            private String identifier; 
            private java.util.List < String > labels; 
            private String managedRuleName; 
            private java.util.Map < String, ? > optionalInputParameterDetails; 
            private java.util.List < SourceDetails> sourceDetails; 

            /**
             * CompulsoryInputParameterDetails.
             */
            public Builder compulsoryInputParameterDetails(java.util.Map < String, ? > compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
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
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * ManagedRuleName.
             */
            public Builder managedRuleName(String managedRuleName) {
                this.managedRuleName = managedRuleName;
                return this;
            }

            /**
             * OptionalInputParameterDetails.
             */
            public Builder optionalInputParameterDetails(java.util.Map < String, ? > optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
                return this;
            }

            /**
             * SourceDetails.
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
    public static class Scope extends TeaModel {
        @NameInMap("ComplianceResourceId")
        private String complianceResourceId;

        @NameInMap("ComplianceResourceTypes")
        private java.util.List < String > complianceResourceTypes;

        private Scope(Builder builder) {
            this.complianceResourceId = builder.complianceResourceId;
            this.complianceResourceTypes = builder.complianceResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return complianceResourceId
         */
        public String getComplianceResourceId() {
            return this.complianceResourceId;
        }

        /**
         * @return complianceResourceTypes
         */
        public java.util.List < String > getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

        public static final class Builder {
            private String complianceResourceId; 
            private java.util.List < String > complianceResourceTypes; 

            /**
             * ComplianceResourceId.
             */
            public Builder complianceResourceId(String complianceResourceId) {
                this.complianceResourceId = complianceResourceId;
                return this;
            }

            /**
             * ComplianceResourceTypes.
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
    public static class SourceConditions extends TeaModel {
        @NameInMap("DesiredValue")
        private String desiredValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Tips")
        private String tips;

        private SourceConditions(Builder builder) {
            this.desiredValue = builder.desiredValue;
            this.name = builder.name;
            this.operator = builder.operator;
            this.tips = builder.tips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConditions create() {
            return builder().build();
        }

        /**
         * @return desiredValue
         */
        public String getDesiredValue() {
            return this.desiredValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        public static final class Builder {
            private String desiredValue; 
            private String name; 
            private String operator; 
            private String tips; 

            /**
             * DesiredValue.
             */
            public Builder desiredValue(String desiredValue) {
                this.desiredValue = desiredValue;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            public SourceConditions build() {
                return new SourceConditions(this);
            } 

        } 

    }
    public static class SourceSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @NameInMap("MessageType")
        private String messageType;

        private SourceSourceDetails(Builder builder) {
            this.eventSource = builder.eventSource;
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.messageType = builder.messageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSourceDetails create() {
            return builder().build();
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
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
            private String eventSource; 
            private String maximumExecutionFrequency; 
            private String messageType; 

            /**
             * EventSource.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * MaximumExecutionFrequency.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            public SourceSourceDetails build() {
                return new SourceSourceDetails(this);
            } 

        } 

    }
    public static class Source extends TeaModel {
        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("SourceConditions")
        private java.util.List < SourceConditions> sourceConditions;

        @NameInMap("SourceDetails")
        private java.util.List < SourceSourceDetails> sourceDetails;

        private Source(Builder builder) {
            this.identifier = builder.identifier;
            this.owner = builder.owner;
            this.sourceConditions = builder.sourceConditions;
            this.sourceDetails = builder.sourceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return sourceConditions
         */
        public java.util.List < SourceConditions> getSourceConditions() {
            return this.sourceConditions;
        }

        /**
         * @return sourceDetails
         */
        public java.util.List < SourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private String identifier; 
            private String owner; 
            private java.util.List < SourceConditions> sourceConditions; 
            private java.util.List < SourceSourceDetails> sourceDetails; 

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * SourceConditions.
             */
            public Builder sourceConditions(java.util.List < SourceConditions> sourceConditions) {
                this.sourceConditions = sourceConditions;
                return this;
            }

            /**
             * SourceDetails.
             */
            public Builder sourceDetails(java.util.List < SourceSourceDetails> sourceDetails) {
                this.sourceDetails = sourceDetails;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    public static class ConfigRule extends TeaModel {
        @NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @NameInMap("ConfigRuleEvaluationStatus")
        private ConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

        @NameInMap("ConfigRuleState")
        private String configRuleState;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Description")
        private String description;

        @NameInMap("InputParameters")
        private java.util.Map < String, ? > inputParameters;

        @NameInMap("ManagedRule")
        private ManagedRule managedRule;

        @NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @NameInMap("ModifiedTimestamp")
        private Long modifiedTimestamp;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("Scope")
        private Scope scope;

        @NameInMap("Source")
        private Source source;

        private ConfigRule(Builder builder) {
            this.configRuleArn = builder.configRuleArn;
            this.configRuleEvaluationStatus = builder.configRuleEvaluationStatus;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleState = builder.configRuleState;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.inputParameters = builder.inputParameters;
            this.managedRule = builder.managedRule;
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRule create() {
            return builder().build();
        }

        /**
         * @return configRuleArn
         */
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        /**
         * @return configRuleEvaluationStatus
         */
        public ConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
            return this.configRuleEvaluationStatus;
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
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputParameters
         */
        public java.util.Map < String, ? > getInputParameters() {
            return this.inputParameters;
        }

        /**
         * @return managedRule
         */
        public ManagedRule getManagedRule() {
            return this.managedRule;
        }

        /**
         * @return maximumExecutionFrequency
         */
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        /**
         * @return modifiedTimestamp
         */
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
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
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private String configRuleArn; 
            private ConfigRuleEvaluationStatus configRuleEvaluationStatus; 
            private String configRuleId; 
            private String configRuleName; 
            private String configRuleState; 
            private Long createTimestamp; 
            private String description; 
            private java.util.Map < String, ? > inputParameters; 
            private ManagedRule managedRule; 
            private String maximumExecutionFrequency; 
            private Long modifiedTimestamp; 
            private Integer riskLevel; 
            private Scope scope; 
            private Source source; 

            /**
             * ConfigRuleArn.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * ConfigRuleEvaluationStatus.
             */
            public Builder configRuleEvaluationStatus(ConfigRuleEvaluationStatus configRuleEvaluationStatus) {
                this.configRuleEvaluationStatus = configRuleEvaluationStatus;
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
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * InputParameters.
             */
            public Builder inputParameters(java.util.Map < String, ? > inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * ManagedRule.
             */
            public Builder managedRule(ManagedRule managedRule) {
                this.managedRule = managedRule;
                return this;
            }

            /**
             * MaximumExecutionFrequency.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * ModifiedTimestamp.
             */
            public Builder modifiedTimestamp(Long modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
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
             * Scope.
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            public ConfigRule build() {
                return new ConfigRule(this);
            } 

        } 

    }
}
