// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleResponseBody</p>
 */
public class GetConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRule")
    private ConfigRule configRule;

    @NameInMap("RequestId")
    private String requestId;

    private GetConfigRuleResponseBody(Builder builder) {
        this.configRule = builder.configRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleResponseBody create() {
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
         * The details of the rule.
         */
        public Builder configRule(ConfigRule configRule) {
            this.configRule = configRule;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRuleResponseBody build() {
            return new GetConfigRuleResponseBody(this);
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
             * The statistics on the compliance evaluation results by compliance type. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resource was evaluated as compliant.
             * *   NON_COMPLIANT: The resource was evaluated as incompliant.
             * *   NOT_APPLICABLE: The rule did not apply to your resource.
             * *   INSUFFICIENT_DATA: No resource data was available.
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
             * The timestamp when the rule was first triggered. Unit: milliseconds.
             */
            public Builder firstActivatedTimestamp(Long firstActivatedTimestamp) {
                this.firstActivatedTimestamp = firstActivatedTimestamp;
                return this;
            }

            /**
             * Indicates whether resources were evaluated based on the rule. Valid values:
             * <p>
             * 
             * *   true: Resources were evaluated based on the rule.
             * *   false: Resources were not evaluated based on the rule.
             */
            public Builder firstEvaluationStarted(Boolean firstEvaluationStarted) {
                this.firstEvaluationStarted = firstEvaluationStarted;
                return this;
            }

            /**
             * The error code returned for the last failed compliance evaluation.
             */
            public Builder lastErrorCode(String lastErrorCode) {
                this.lastErrorCode = lastErrorCode;
                return this;
            }

            /**
             * The error message returned for the last failed compliance evaluation.
             */
            public Builder lastErrorMessage(String lastErrorMessage) {
                this.lastErrorMessage = lastErrorMessage;
                return this;
            }

            /**
             * The timestamp when the last failed compliance evaluation of the rule ended. Unit: milliseconds.
             */
            public Builder lastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
                this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
                return this;
            }

            /**
             * The timestamp when the last failed compliance evaluation of the rule started. Unit: milliseconds.
             */
            public Builder lastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
                this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
                return this;
            }

            /**
             * The timestamp when the last successful compliance evaluation of the rule ended. Unit: milliseconds.
             */
            public Builder lastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
                this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
                return this;
            }

            /**
             * The timestamp when the last successful compliance evaluation of the rule started. Unit: milliseconds.
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
    public static class CreateBy extends TeaModel {
        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("CompliancePackName")
        private String compliancePackName;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorName")
        private String creatorName;

        private CreateBy(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
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

        public static final class Builder {
            private String compliancePackId; 
            private String compliancePackName; 
            private String creatorId; 
            private String creatorName; 

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

            /**
             * The ID of the account that was used to create the rule.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The name of the account that was used to create the rule.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            public CreateBy build() {
                return new CreateBy(this);
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
             * The event source.
             * <p>
             * 
             * >  Only events related to Cloud Config are supported. Valid value: aliyun.config.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The interval at which the rule is triggered. Valid values:
             * <p>
             * 
             * *   One_Hour: 1 hour
             * *   Three_Hours: 3 hours
             * *   Six_Hours: 6 hours.
             * *   Twelve_Hours: 12 hours
             * *   TwentyFour_Hours: 24 hours
             * 
             * >  This parameter is returned if the managed rule is periodically triggered.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * The trigger type of the rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.
             * *   ScheduledNotification: The rule is periodically triggered.
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
             * The required input parameters of the managed rule.
             */
            public Builder compulsoryInputParameterDetails(java.util.Map < String, ? > compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
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
             * The ID of the managed rule.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The list of rule tags.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
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
             * The optional input parameters of the managed rule.
             */
            public Builder optionalInputParameterDetails(java.util.Map < String, ? > optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
                return this;
            }

            /**
             * The details of the source of the managed rule.
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
             * The types of the resources to be evaluated against the rule. You can also view the resource types by using the ResourceTypesScope parameter.
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
             * The event source.
             * <p>
             * 
             * >  Only events related to Cloud Config are supported. Valid value: aliyun.config.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The interval at which the rule is triggered. Valid values:
             * <p>
             * 
             * *   One_Hour: 1 hour
             * *   Three_Hours: 3 hours
             * *   Six_Hours: 6 hours
             * *   Twelve_Hours: 12 hours
             * *   TwentyFour_Hours: 24 hours
             * 
             * >  This parameter is returned if the rule is periodically triggered.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * The trigger type of the rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.
             * *   ScheduledNotification: The rule is periodically triggered.
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

        @NameInMap("SourceDetails")
        private java.util.List < SourceSourceDetails> sourceDetails;

        private Source(Builder builder) {
            this.identifier = builder.identifier;
            this.owner = builder.owner;
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
         * @return sourceDetails
         */
        public java.util.List < SourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private String identifier; 
            private String owner; 
            private java.util.List < SourceSourceDetails> sourceDetails; 

            /**
             * The identifier of the evaluation rule.
             * <p>
             * 
             * *   If the rule was created based on a managed rule, the value of this parameter is the name of the managed rule.
             * *   If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The method that is used to create the rule. Valid values:
             * <p>
             * 
             * *   CUSTOM_FC: a custom rule.
             * *   ALIYUN: a managed rule.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The details of the source of the rule.
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
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("Compliance")
        private Compliance compliance;

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

        @NameInMap("ConfigRuleTriggerTypes")
        private String configRuleTriggerTypes;

        @NameInMap("CreateBy")
        private CreateBy createBy;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @NameInMap("InputParameters")
        private java.util.Map < String, ? > inputParameters;

        @NameInMap("ManagedRule")
        private ManagedRule managedRule;

        @NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @NameInMap("ModifiedTimestamp")
        private Long modifiedTimestamp;

        @NameInMap("RegionIdsScope")
        private String regionIdsScope;

        @NameInMap("ResourceGroupIdsScope")
        private String resourceGroupIdsScope;

        @NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("Scope")
        private Scope scope;

        @NameInMap("Source")
        private Source source;

        @NameInMap("TagKeyLogicScope")
        private String tagKeyLogicScope;

        @NameInMap("TagKeyScope")
        private String tagKeyScope;

        @NameInMap("TagValueScope")
        private String tagValueScope;

        private ConfigRule(Builder builder) {
            this.accountId = builder.accountId;
            this.compliance = builder.compliance;
            this.configRuleArn = builder.configRuleArn;
            this.configRuleEvaluationStatus = builder.configRuleEvaluationStatus;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleState = builder.configRuleState;
            this.configRuleTriggerTypes = builder.configRuleTriggerTypes;
            this.createBy = builder.createBy;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.inputParameters = builder.inputParameters;
            this.managedRule = builder.managedRule;
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.source = builder.source;
            this.tagKeyLogicScope = builder.tagKeyLogicScope;
            this.tagKeyScope = builder.tagKeyScope;
            this.tagValueScope = builder.tagValueScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRule create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
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
         * @return configRuleTriggerTypes
         */
        public String getConfigRuleTriggerTypes() {
            return this.configRuleTriggerTypes;
        }

        /**
         * @return createBy
         */
        public CreateBy getCreateBy() {
            return this.createBy;
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
         * @return excludeResourceIdsScope
         */
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
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
         * @return regionIdsScope
         */
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        /**
         * @return resourceGroupIdsScope
         */
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
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

        /**
         * @return tagKeyLogicScope
         */
        public String getTagKeyLogicScope() {
            return this.tagKeyLogicScope;
        }

        /**
         * @return tagKeyScope
         */
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        /**
         * @return tagValueScope
         */
        public String getTagValueScope() {
            return this.tagValueScope;
        }

        public static final class Builder {
            private Long accountId; 
            private Compliance compliance; 
            private String configRuleArn; 
            private ConfigRuleEvaluationStatus configRuleEvaluationStatus; 
            private String configRuleId; 
            private String configRuleName; 
            private String configRuleState; 
            private String configRuleTriggerTypes; 
            private CreateBy createBy; 
            private Long createTimestamp; 
            private String description; 
            private String excludeResourceIdsScope; 
            private java.util.Map < String, ? > inputParameters; 
            private ManagedRule managedRule; 
            private String maximumExecutionFrequency; 
            private Long modifiedTimestamp; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String resourceTypesScope; 
            private Integer riskLevel; 
            private Scope scope; 
            private Source source; 
            private String tagKeyLogicScope; 
            private String tagKeyScope; 
            private String tagValueScope; 

            /**
             * The ID of the Alibaba Cloud account to which the rule belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The details of compliance evaluation results.
             */
            public Builder compliance(Compliance compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * The ARN of the managed rule.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * The information about compliance evaluations performed by the rule.
             */
            public Builder configRuleEvaluationStatus(ConfigRuleEvaluationStatus configRuleEvaluationStatus) {
                this.configRuleEvaluationStatus = configRuleEvaluationStatus;
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
             * The name of the defense rule.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   ACTIVE: The rule was being used to monitor resource configurations.
             * *   DELETING: The rule was being deleted.
             * *   EVALUATING: The rule was triggered and is being used to monitor resource configurations.
             * *   INACTIVE: The rule was disabled.
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * The trigger type of the rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The rule was triggered by configuration changes.
             * *   ScheduledNotification: The rule was periodically triggered.
             */
            public Builder configRuleTriggerTypes(String configRuleTriggerTypes) {
                this.configRuleTriggerTypes = configRuleTriggerTypes;
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
             * The timestamp when the rule was created. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * The ID of the resource excluded from the compliance evaluations performed by the rule.
             */
            public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
                this.excludeResourceIdsScope = excludeResourceIdsScope;
                return this;
            }

            /**
             * The details of the input parameters of the rule.
             */
            public Builder inputParameters(java.util.Map < String, ? > inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * The details of the managed rule.
             */
            public Builder managedRule(ManagedRule managedRule) {
                this.managedRule = managedRule;
                return this;
            }

            /**
             * The interval at which the rule was triggered. Valid values:
             * <p>
             * 
             * *   One_Hour: 1 hour.
             * *   Three_Hours: 3 hours.
             * *   Six_Hours: 6 hours.
             * *   Twelve_Hours: 12 hours.
             * *   TwentyFour_Hours: 24 hours.
             * 
             * > This parameter is returned if the managed rule is periodically triggered.
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * The timestamp when the rule was last updated. Unit: milliseconds.
             */
            public Builder modifiedTimestamp(Long modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * The ID of the region to which the rule applies.
             */
            public Builder regionIdsScope(String regionIdsScope) {
                this.regionIdsScope = regionIdsScope;
                return this;
            }

            /**
             * The ID of the resource group to which the rule applies.
             */
            public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
                this.resourceGroupIdsScope = resourceGroupIdsScope;
                return this;
            }

            /**
             * The type of the resource to be evaluated by the rule.
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rule. Valid values:
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

            /**
             * The effective scope of the rule.
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The information about how the rule was created.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.
             * <p>
             * 
             * > This parameter applies only to a managed rule.
             */
            public Builder tagKeyLogicScope(String tagKeyLogicScope) {
                this.tagKeyLogicScope = tagKeyLogicScope;
                return this;
            }

            /**
             * The tag key used to filter resources. The rule applies only to the resources with the specified tag key.
             * <p>
             * 
             * > The `TagKeyScope` and `TagValueScope` parameters are returned at the same time.
             */
            public Builder tagKeyScope(String tagKeyScope) {
                this.tagKeyScope = tagKeyScope;
                return this;
            }

            /**
             * The tag value used to filter resources. The rule applies only to the resources with the specified tag value.
             * <p>
             * 
             * > The `TagKeyScope` and `TagValueScope` parameters are returned at the same time.
             */
            public Builder tagValueScope(String tagValueScope) {
                this.tagValueScope = tagValueScope;
                return this;
            }

            public ConfigRule build() {
                return new ConfigRule(this);
            } 

        } 

    }
}
