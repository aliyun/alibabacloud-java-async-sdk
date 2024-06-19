// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRuleResponseBody</p>
 */
public class GetAggregateConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRule")
    private ConfigRule configRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateConfigRuleResponseBody(Builder builder) {
        this.configRule = builder.configRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRuleResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateConfigRuleResponseBody build() {
            return new GetAggregateConfigRuleResponseBody(this);
        } 

    } 

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

            /**
             * The statistics on the compliance evaluation results by compliance type. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resources are evaluated as compliant.
             * *   NON_COMPLIANT: The resources are evaluated as non-compliant.
             * *   NOT_APPLICABLE: The rule does not apply to your resources.
             * *   INSUFFICIENT_DATA: No resource data is available.
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
        @com.aliyun.core.annotation.NameInMap("FirstActivatedTimestamp")
        private Long firstActivatedTimestamp;

        @com.aliyun.core.annotation.NameInMap("FirstEvaluationStarted")
        private Boolean firstEvaluationStarted;

        @com.aliyun.core.annotation.NameInMap("LastErrorCode")
        private String lastErrorCode;

        @com.aliyun.core.annotation.NameInMap("LastErrorMessage")
        private String lastErrorMessage;

        @com.aliyun.core.annotation.NameInMap("LastFailedEvaluationTimestamp")
        private Long lastFailedEvaluationTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastFailedInvocationTimestamp")
        private Long lastFailedInvocationTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulEvaluationTimestamp")
        private Long lastSuccessfulEvaluationTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastSuccessfulInvocationTimestamp")
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
             * The timestamp when the rule was first triggered.
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

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * The name of the account group.
             */
            public Builder aggregatorName(String aggregatorName) {
                this.aggregatorName = aggregatorName;
                return this;
            }

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

            /**
             * The type of the entity to which the rule belongs. The value is fixed to `AGGREGATOR`, which indicates an account group.
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
    public static class ExcludeTagsScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private ExcludeTagsScope(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcludeTagsScope create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public ExcludeTagsScope build() {
                return new ExcludeTagsScope(this);
            } 

        } 

    }
    public static class SourceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @com.aliyun.core.annotation.NameInMap("MessageType")
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
             * The event source of the managed rule.
             * <p>
             * 
             * >  Only events related to Cloud Config are supported. The value is fixed to aliyun.config.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The intervals at which the managed rule is triggered. Valid values:
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
             * The trigger type of the rule. Valid values:
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
        @com.aliyun.core.annotation.NameInMap("CompulsoryInputParameterDetails")
        private java.util.Map < String, ? > compulsoryInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < String > labels;

        @com.aliyun.core.annotation.NameInMap("ManagedRuleName")
        private String managedRuleName;

        @com.aliyun.core.annotation.NameInMap("OptionalInputParameterDetails")
        private java.util.Map < String, ? > optionalInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("SourceDetails")
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
    public static class SourceSourceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @com.aliyun.core.annotation.NameInMap("MessageType")
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
             * The event source of the managed rule.
             * <p>
             * 
             * >  Only events related to Cloud Config are supported. The value is fixed to aliyun.config.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The intervals at which the managed rule is triggered. Valid values:
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
             * The trigger type of the rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.
             * *   ScheduledNotification: The managed rule is periodically triggered.
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
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("SourceDetails")
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
             * The identifier of the rule.
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
             * The way in which the rule was created. Valid values:
             * <p>
             * 
             * *   CUSTOM_FC: The rule is a custom rule.
             * *   ALIYUN: The rule was created based on a managed rule of Alibaba Cloud.
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
    public static class TagsScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagsScope(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsScope create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagsScope build() {
                return new TagsScope(this);
            } 

        } 

    }
    public static class ConfigRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountIdsScope")
        private String accountIdsScope;

        @com.aliyun.core.annotation.NameInMap("Compliance")
        private Compliance compliance;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleEvaluationStatus")
        private ConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleState")
        private String configRuleState;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleTriggerTypes")
        private String configRuleTriggerTypes;

        @com.aliyun.core.annotation.NameInMap("CreateBy")
        private CreateBy createBy;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExcludeAccountIdsScope")
        private String excludeAccountIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeFolderIdsScope")
        private String excludeFolderIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
        private String excludeRegionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
        private String excludeResourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeTagsScope")
        private java.util.List < ExcludeTagsScope> excludeTagsScope;

        @com.aliyun.core.annotation.NameInMap("FolderIdsScope")
        private String folderIdsScope;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
        private java.util.Map < String, ? > inputParameters;

        @com.aliyun.core.annotation.NameInMap("ManagedRule")
        private ManagedRule managedRule;

        @com.aliyun.core.annotation.NameInMap("MaximumExecutionFrequency")
        private String maximumExecutionFrequency;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimestamp")
        private Long modifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("RegionIdsScope")
        private String regionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdsScope")
        private String resourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceIdsScope")
        private String resourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("TagKeyLogicScope")
        private String tagKeyLogicScope;

        @com.aliyun.core.annotation.NameInMap("TagKeyScope")
        private String tagKeyScope;

        @com.aliyun.core.annotation.NameInMap("TagValueScope")
        private String tagValueScope;

        @com.aliyun.core.annotation.NameInMap("TagsScope")
        private java.util.List < TagsScope> tagsScope;

        private ConfigRule(Builder builder) {
            this.accountId = builder.accountId;
            this.accountIdsScope = builder.accountIdsScope;
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
            this.excludeAccountIdsScope = builder.excludeAccountIdsScope;
            this.excludeFolderIdsScope = builder.excludeFolderIdsScope;
            this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.excludeTagsScope = builder.excludeTagsScope;
            this.folderIdsScope = builder.folderIdsScope;
            this.inputParameters = builder.inputParameters;
            this.managedRule = builder.managedRule;
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.resourceIdsScope = builder.resourceIdsScope;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
            this.source = builder.source;
            this.tagKeyLogicScope = builder.tagKeyLogicScope;
            this.tagKeyScope = builder.tagKeyScope;
            this.tagValueScope = builder.tagValueScope;
            this.tagsScope = builder.tagsScope;
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
         * @return accountIdsScope
         */
        public String getAccountIdsScope() {
            return this.accountIdsScope;
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
         * @return excludeAccountIdsScope
         */
        public String getExcludeAccountIdsScope() {
            return this.excludeAccountIdsScope;
        }

        /**
         * @return excludeFolderIdsScope
         */
        public String getExcludeFolderIdsScope() {
            return this.excludeFolderIdsScope;
        }

        /**
         * @return excludeRegionIdsScope
         */
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        /**
         * @return excludeResourceGroupIdsScope
         */
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        /**
         * @return excludeResourceIdsScope
         */
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        /**
         * @return excludeTagsScope
         */
        public java.util.List < ExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
        }

        /**
         * @return folderIdsScope
         */
        public String getFolderIdsScope() {
            return this.folderIdsScope;
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
         * @return resourceIdsScope
         */
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
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

        /**
         * @return tagsScope
         */
        public java.util.List < TagsScope> getTagsScope() {
            return this.tagsScope;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountIdsScope; 
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
            private String excludeAccountIdsScope; 
            private String excludeFolderIdsScope; 
            private String excludeRegionIdsScope; 
            private String excludeResourceGroupIdsScope; 
            private String excludeResourceIdsScope; 
            private java.util.List < ExcludeTagsScope> excludeTagsScope; 
            private String folderIdsScope; 
            private java.util.Map < String, ? > inputParameters; 
            private ManagedRule managedRule; 
            private String maximumExecutionFrequency; 
            private Long modifiedTimestamp; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String resourceIdsScope; 
            private String resourceTypesScope; 
            private Integer riskLevel; 
            private Source source; 
            private String tagKeyLogicScope; 
            private String tagKeyScope; 
            private String tagValueScope; 
            private java.util.List < TagsScope> tagsScope; 

            /**
             * The ID of the Alibaba Cloud account to which the rule belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountIdsScope.
             */
            public Builder accountIdsScope(String accountIdsScope) {
                this.accountIdsScope = accountIdsScope;
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
             * The ID of the rule.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The name of the monitoring rule.
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   ACTIVE: The rule is being used to monitor resource configurations.
             * *   DELETING: The rule is being deleted.
             * *   EVALUATING: The rule is triggered and is being used to monitor resource configurations.
             * *   INACTIVE: The rule is disabled and is no longer used to monitor resource configurations.
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * The trigger type of the rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.
             * *   ScheduledNotification: The managed rule is periodically triggered.
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
             * The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.
             * <p>
             * 
             * >  This parameter applies only to a managed rule.
             */
            public Builder excludeAccountIdsScope(String excludeAccountIdsScope) {
                this.excludeAccountIdsScope = excludeAccountIdsScope;
                return this;
            }

            /**
             * The ID of the resource directory to which the rule does not apply, which means that the resources within member accounts in the resource directory are not evaluated based on the rule.
             * <p>
             * 
             * > 
             * *   This parameter applies only to a rule of a global account group.
             * *   This parameter applies only to a managed rule.
             */
            public Builder excludeFolderIdsScope(String excludeFolderIdsScope) {
                this.excludeFolderIdsScope = excludeFolderIdsScope;
                return this;
            }

            /**
             * ExcludeRegionIdsScope.
             */
            public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
                this.excludeRegionIdsScope = excludeRegionIdsScope;
                return this;
            }

            /**
             * ExcludeResourceGroupIdsScope.
             */
            public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
                this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
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
             * ExcludeTagsScope.
             */
            public Builder excludeTagsScope(java.util.List < ExcludeTagsScope> excludeTagsScope) {
                this.excludeTagsScope = excludeTagsScope;
                return this;
            }

            /**
             * The ID of the resource directory to which the rule applies, which means that the resources within member accounts in the resource directory are evaluated based on the rule.
             * <p>
             * 
             * > 
             * *   This parameter applies only to rules of a global account group.
             * *   This parameter applies only to managed rules.
             */
            public Builder folderIdsScope(String folderIdsScope) {
                this.folderIdsScope = folderIdsScope;
                return this;
            }

            /**
             * The input parameters of the rule.
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
             * The intervals at which the managed rule is triggered. Valid values:
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
             * ResourceIdsScope.
             */
            public Builder resourceIdsScope(String resourceIdsScope) {
                this.resourceIdsScope = resourceIdsScope;
                return this;
            }

            /**
             * The type of the resource evaluated by the rule.
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the rule. Valid values:
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
             * The information about how the rule was created.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * The logical relationship among the tag keys if you specify multiple tag keys by using the `TagKeyScope` parameter. For example, if the `TagKeyScope` parameter is set to `ECS,OSS` and the TagKeyLogicScope parameter is set to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:
             * <p>
             * 
             * *   AND: the logical relationship of AND
             * *   OR: the logical relationship of OR
             */
            public Builder tagKeyLogicScope(String tagKeyLogicScope) {
                this.tagKeyLogicScope = tagKeyLogicScope;
                return this;
            }

            /**
             * The tag key used to filter resources. The rule applies only to the resources with the specified tag key.
             */
            public Builder tagKeyScope(String tagKeyScope) {
                this.tagKeyScope = tagKeyScope;
                return this;
            }

            /**
             * The tag value used to filter resources. The rule applies only to the resources with the specified tag value.
             */
            public Builder tagValueScope(String tagValueScope) {
                this.tagValueScope = tagValueScope;
                return this;
            }

            /**
             * TagsScope.
             */
            public Builder tagsScope(java.util.List < TagsScope> tagsScope) {
                this.tagsScope = tagsScope;
                return this;
            }

            public ConfigRule build() {
                return new ConfigRule(this);
            } 

        } 

    }
}
