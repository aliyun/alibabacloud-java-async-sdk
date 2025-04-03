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
 * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleResponseBody</p>
 */
public class GetConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRule")
    private ConfigRule configRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetConfigRuleResponseBody model) {
            this.configRule = model.configRule;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the rule.</p>
         */
        public Builder configRule(ConfigRule configRule) {
            this.configRule = configRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>811234F4-C3AB-4D15-B90B-F55016D1B5AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigRuleResponseBody build() {
            return new GetConfigRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Compliance model) {
                this.complianceType = model.complianceType;
                this.count = model.count;
            } 

            /**
             * <p>The statistics on the compliance evaluation results by compliance type. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resource was evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resource was evaluated as incompliant.</li>
             * <li>NOT_APPLICABLE: The rule did not apply to your resource.</li>
             * <li>INSUFFICIENT_DATA: No resource data was available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NON_COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The number of evaluated resources.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConfigRuleEvaluationStatus model) {
                this.firstActivatedTimestamp = model.firstActivatedTimestamp;
                this.firstEvaluationStarted = model.firstEvaluationStarted;
                this.lastErrorCode = model.lastErrorCode;
                this.lastErrorMessage = model.lastErrorMessage;
                this.lastFailedEvaluationTimestamp = model.lastFailedEvaluationTimestamp;
                this.lastFailedInvocationTimestamp = model.lastFailedInvocationTimestamp;
                this.lastSuccessfulEvaluationTimestamp = model.lastSuccessfulEvaluationTimestamp;
                this.lastSuccessfulInvocationTimestamp = model.lastSuccessfulInvocationTimestamp;
            } 

            /**
             * <p>The timestamp generated when the rule was first triggered. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1624932221993</p>
             */
            public Builder firstActivatedTimestamp(Long firstActivatedTimestamp) {
                this.firstActivatedTimestamp = firstActivatedTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether resource configurations were evaluated based on the rule. Valid values:</p>
             * <ul>
             * <li>true: Resource configurations were evaluated based on the rule.</li>
             * <li>false: Resource configurations were not evaluated based on the rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder firstEvaluationStarted(Boolean firstEvaluationStarted) {
                this.firstEvaluationStarted = firstEvaluationStarted;
                return this;
            }

            /**
             * <p>The error code returned for the previous failed compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>TimeOut</p>
             */
            public Builder lastErrorCode(String lastErrorCode) {
                this.lastErrorCode = lastErrorCode;
                return this;
            }

            /**
             * <p>The error message returned for the previous failed compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>Time out</p>
             */
            public Builder lastErrorMessage(String lastErrorMessage) {
                this.lastErrorMessage = lastErrorMessage;
                return this;
            }

            /**
             * <p>The timestamp generated when the previous failed compliance evaluation of the rule ended. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1614687022000</p>
             */
            public Builder lastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
                this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
                return this;
            }

            /**
             * <p>The timestamp generated when the previous failed compliance evaluation of the rule started. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1614687022000</p>
             */
            public Builder lastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
                this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
                return this;
            }

            /**
             * <p>The timestamp generated when the previous successful compliance evaluation of the rule ended. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1624932227486</p>
             */
            public Builder lastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
                this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
                return this;
            }

            /**
             * <p>The timestamp generated when the previous successful compliance evaluation of the rule started. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1624932227476</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
    public static class CreateBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackName")
        private String compliancePackName;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
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

            private Builder() {
            } 

            private Builder(CreateBy model) {
                this.compliancePackId = model.compliancePackId;
                this.compliancePackName = model.compliancePackName;
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
            } 

            /**
             * <p>The compliance package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-541e626622af008****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The name of the compliance package.</p>
             * 
             * <strong>example:</strong>
             * <p>example-name</p>
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * <p>The ID of the account that was used to create the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The name of the account that was used to create the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ExcludeTagsScope model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceDetails model) {
                this.eventSource = model.eventSource;
                this.maximumExecutionFrequency = model.maximumExecutionFrequency;
                this.messageType = model.messageType;
            } 

            /**
             * <p>The event source.</p>
             * <blockquote>
             * <p> Only aliyun.config is returned, which indicates that only events related to Cloud Config are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aliyun.config</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The interval at which the rule is triggered. Valid values:</p>
             * <ul>
             * <li>One_Hour</li>
             * <li>Three_Hours</li>
             * <li>Six_Hours</li>
             * <li>Twelve_Hours</li>
             * <li>TwentyFour_Hours</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if the rule is periodically triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>One_Hour</p>
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
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
    public static class ManagedRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompulsoryInputParameterDetails")
        private java.util.Map<String, ?> compulsoryInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("ManagedRuleName")
        private String managedRuleName;

        @com.aliyun.core.annotation.NameInMap("OptionalInputParameterDetails")
        private java.util.Map<String, ?> optionalInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("SourceDetails")
        private java.util.List<SourceDetails> sourceDetails;

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
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
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
        public java.util.List<String> getLabels() {
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
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        /**
         * @return sourceDetails
         */
        public java.util.List<SourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private java.util.Map<String, ?> compulsoryInputParameterDetails; 
            private String description; 
            private String identifier; 
            private java.util.List<String> labels; 
            private String managedRuleName; 
            private java.util.Map<String, ?> optionalInputParameterDetails; 
            private java.util.List<SourceDetails> sourceDetails; 

            private Builder() {
            } 

            private Builder(ManagedRule model) {
                this.compulsoryInputParameterDetails = model.compulsoryInputParameterDetails;
                this.description = model.description;
                this.identifier = model.identifier;
                this.labels = model.labels;
                this.managedRuleName = model.managedRuleName;
                this.optionalInputParameterDetails = model.optionalInputParameterDetails;
                this.sourceDetails = model.sourceDetails;
            } 

            /**
             * <p>The settings of the required input parameters for the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder compulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
                return this;
            }

            /**
             * <p>The description of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The identifier of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-user-mfa-check</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The rule tags.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The name of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>example-name</p>
             */
            public Builder managedRuleName(String managedRuleName) {
                this.managedRuleName = managedRuleName;
                return this;
            }

            /**
             * <p>The settings of the optional input parameters for the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder optionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
                return this;
            }

            /**
             * <p>The details of the source of the managed rule.</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
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
             * <p>The types of the resources to be evaluated against the rule. You can also view the resource types by using the ResourceTypesScope parameter.</p>
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
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceSourceDetails model) {
                this.eventSource = model.eventSource;
                this.maximumExecutionFrequency = model.maximumExecutionFrequency;
                this.messageType = model.messageType;
            } 

            /**
             * <p>The event source.</p>
             * <blockquote>
             * <p> Only aliyun.config is returned, which indicates that only events related to Cloud Config are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aliyun.config</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The interval at which the rule is triggered. Valid values:</p>
             * <ul>
             * <li>One_Hour</li>
             * <li>Three_Hours</li>
             * <li>Six_Hours</li>
             * <li>Twelve_Hours</li>
             * <li>TwentyFour_Hours</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if the rule is periodically triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>One_Hour</p>
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

            public SourceSourceDetails build() {
                return new SourceSourceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("SourceDetails")
        private java.util.List<SourceSourceDetails> sourceDetails;

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
        public java.util.List<SourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public static final class Builder {
            private String identifier; 
            private String owner; 
            private java.util.List<SourceSourceDetails> sourceDetails; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.identifier = model.identifier;
                this.owner = model.owner;
                this.sourceDetails = model.sourceDetails;
            } 

            /**
             * <p>The identifier of the rule.</p>
             * <ul>
             * <li>If the rule is a managed rule, the value of this parameter is the identifier of the managed rule.</li>
             * <li>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of a function.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/specific-config</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li>CUSTOM_FC: a custom rule.</li>
             * <li>ALIYUN: a managed rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The details of the source of the rule.</p>
             */
            public Builder sourceDetails(java.util.List<SourceSourceDetails> sourceDetails) {
                this.sourceDetails = sourceDetails;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TagsScope model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>TagKey</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>TagValue</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
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
    /**
     * 
     * {@link GetConfigRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleResponseBody</p>
     */
    public static class ConfigRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

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

        @com.aliyun.core.annotation.NameInMap("ExcludeRegionIdsScope")
        private String excludeRegionIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceGroupIdsScope")
        private String excludeResourceGroupIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeResourceIdsScope")
        private String excludeResourceIdsScope;

        @com.aliyun.core.annotation.NameInMap("ExcludeTagsScope")
        private java.util.List<ExcludeTagsScope> excludeTagsScope;

        @com.aliyun.core.annotation.NameInMap("ExtendContent")
        private String extendContent;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
        private java.util.Map<String, ?> inputParameters;

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

        @com.aliyun.core.annotation.NameInMap("ResourceNameScope")
        private String resourceNameScope;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("TagKeyLogicScope")
        @Deprecated
        private String tagKeyLogicScope;

        @com.aliyun.core.annotation.NameInMap("TagKeyScope")
        @Deprecated
        private String tagKeyScope;

        @com.aliyun.core.annotation.NameInMap("TagValueScope")
        @Deprecated
        private String tagValueScope;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TagsScope")
        private java.util.List<TagsScope> tagsScope;

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
            this.excludeRegionIdsScope = builder.excludeRegionIdsScope;
            this.excludeResourceGroupIdsScope = builder.excludeResourceGroupIdsScope;
            this.excludeResourceIdsScope = builder.excludeResourceIdsScope;
            this.excludeTagsScope = builder.excludeTagsScope;
            this.extendContent = builder.extendContent;
            this.inputParameters = builder.inputParameters;
            this.managedRule = builder.managedRule;
            this.maximumExecutionFrequency = builder.maximumExecutionFrequency;
            this.modifiedTimestamp = builder.modifiedTimestamp;
            this.regionIdsScope = builder.regionIdsScope;
            this.resourceGroupIdsScope = builder.resourceGroupIdsScope;
            this.resourceIdsScope = builder.resourceIdsScope;
            this.resourceNameScope = builder.resourceNameScope;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
            this.scope = builder.scope;
            this.source = builder.source;
            this.tagKeyLogicScope = builder.tagKeyLogicScope;
            this.tagKeyScope = builder.tagKeyScope;
            this.tagValueScope = builder.tagValueScope;
            this.tags = builder.tags;
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
        public java.util.List<ExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
        }

        /**
         * @return extendContent
         */
        public String getExtendContent() {
            return this.extendContent;
        }

        /**
         * @return inputParameters
         */
        public java.util.Map<String, ?> getInputParameters() {
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
         * @return resourceNameScope
         */
        public String getResourceNameScope() {
            return this.resourceNameScope;
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tagsScope
         */
        public java.util.List<TagsScope> getTagsScope() {
            return this.tagsScope;
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
            private String excludeRegionIdsScope; 
            private String excludeResourceGroupIdsScope; 
            private String excludeResourceIdsScope; 
            private java.util.List<ExcludeTagsScope> excludeTagsScope; 
            private String extendContent; 
            private java.util.Map<String, ?> inputParameters; 
            private ManagedRule managedRule; 
            private String maximumExecutionFrequency; 
            private Long modifiedTimestamp; 
            private String regionIdsScope; 
            private String resourceGroupIdsScope; 
            private String resourceIdsScope; 
            private String resourceNameScope; 
            private String resourceTypesScope; 
            private Integer riskLevel; 
            private Scope scope; 
            private Source source; 
            private String tagKeyLogicScope; 
            private String tagKeyScope; 
            private String tagValueScope; 
            private java.util.List<Tags> tags; 
            private java.util.List<TagsScope> tagsScope; 

            private Builder() {
            } 

            private Builder(ConfigRule model) {
                this.accountId = model.accountId;
                this.compliance = model.compliance;
                this.configRuleArn = model.configRuleArn;
                this.configRuleEvaluationStatus = model.configRuleEvaluationStatus;
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
                this.configRuleState = model.configRuleState;
                this.configRuleTriggerTypes = model.configRuleTriggerTypes;
                this.createBy = model.createBy;
                this.createTimestamp = model.createTimestamp;
                this.description = model.description;
                this.excludeRegionIdsScope = model.excludeRegionIdsScope;
                this.excludeResourceGroupIdsScope = model.excludeResourceGroupIdsScope;
                this.excludeResourceIdsScope = model.excludeResourceIdsScope;
                this.excludeTagsScope = model.excludeTagsScope;
                this.extendContent = model.extendContent;
                this.inputParameters = model.inputParameters;
                this.managedRule = model.managedRule;
                this.maximumExecutionFrequency = model.maximumExecutionFrequency;
                this.modifiedTimestamp = model.modifiedTimestamp;
                this.regionIdsScope = model.regionIdsScope;
                this.resourceGroupIdsScope = model.resourceGroupIdsScope;
                this.resourceIdsScope = model.resourceIdsScope;
                this.resourceNameScope = model.resourceNameScope;
                this.resourceTypesScope = model.resourceTypesScope;
                this.riskLevel = model.riskLevel;
                this.scope = model.scope;
                this.source = model.source;
                this.tagKeyLogicScope = model.tagKeyLogicScope;
                this.tagKeyScope = model.tagKeyScope;
                this.tagValueScope = model.tagValueScope;
                this.tags = model.tags;
                this.tagsScope = model.tagsScope;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The details of compliance evaluation results.</p>
             */
            public Builder compliance(Compliance compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * <p>The ARN of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:config::100931896542****:rule/cr-7f7d626622af0041****</p>
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * <p>The information about compliance evaluations performed by the rule.</p>
             */
            public Builder configRuleEvaluationStatus(ConfigRuleEvaluationStatus configRuleEvaluationStatus) {
                this.configRuleEvaluationStatus = configRuleEvaluationStatus;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-7f7d626622af0041****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-disk-auto-snapshot-policy</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li>ACTIVE: The rule is enabled.</li>
             * <li>DELETING: The rule is being deleted.</li>
             * <li>EVALUATING: The rule is being used to evaluate resource configurations.</li>
             * <li>INACTIVE: The rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * <p>The trigger type of the rule. Valid values:</p>
             * <ul>
             * <li>ConfigurationItemChangeNotification: The rule was triggered by configuration changes.</li>
             * <li>ScheduledNotification: The rule was periodically triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ConfigurationItemChangeNotification</p>
             */
            public Builder configRuleTriggerTypes(String configRuleTriggerTypes) {
                this.configRuleTriggerTypes = configRuleTriggerTypes;
                return this;
            }

            /**
             * <p>The information about the creation of the rule.</p>
             */
            public Builder createBy(CreateBy createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * <p>The timestamp generated when the rule was created. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1604684022000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The description of the managed rule.</p>
             * 
             * <strong>example:</strong>
             * <p>example-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ExcludeRegionIdsScope</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder excludeRegionIdsScope(String excludeRegionIdsScope) {
                this.excludeRegionIdsScope = excludeRegionIdsScope;
                return this;
            }

            /**
             * <p>ExcludeResourceGroupIdsScope</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzdibsjjc****</p>
             */
            public Builder excludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
                this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
                return this;
            }

            /**
             * <p>The ID of the resource excluded from the compliance evaluations performed by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>23642660635687****</p>
             */
            public Builder excludeResourceIdsScope(String excludeResourceIdsScope) {
                this.excludeResourceIdsScope = excludeResourceIdsScope;
                return this;
            }

            /**
             * <p>ExcludeTagsScope</p>
             */
            public Builder excludeTagsScope(java.util.List<ExcludeTagsScope> excludeTagsScope) {
                this.excludeTagsScope = excludeTagsScope;
                return this;
            }

            /**
             * <p>Optional field, only used in conjunction with the 24-hour cycle execution to set the trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
             */
            public Builder extendContent(String extendContent) {
                this.extendContent = extendContent;
                return this;
            }

            /**
             * <p>The input parameters of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder inputParameters(java.util.Map<String, ?> inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            /**
             * <p>The details of the managed rule.</p>
             */
            public Builder managedRule(ManagedRule managedRule) {
                this.managedRule = managedRule;
                return this;
            }

            /**
             * <p>The interval at which the rule is triggered. Valid values:</p>
             * <ul>
             * <li>One_Hour</li>
             * <li>Three_Hours</li>
             * <li>Six_Hours</li>
             * <li>Twelve_Hours</li>
             * <li>TwentyFour_Hours</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if the rule is periodically triggered.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>One_Hour</p>
             */
            public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
                this.maximumExecutionFrequency = maximumExecutionFrequency;
                return this;
            }

            /**
             * <p>The timestamp generated when the rule was last updated. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1614687022000</p>
             */
            public Builder modifiedTimestamp(Long modifiedTimestamp) {
                this.modifiedTimestamp = modifiedTimestamp;
                return this;
            }

            /**
             * <p>The ID of the region to which the rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder regionIdsScope(String regionIdsScope) {
                this.regionIdsScope = regionIdsScope;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzdibsjjc****</p>
             */
            public Builder resourceGroupIdsScope(String resourceGroupIdsScope) {
                this.resourceGroupIdsScope = resourceGroupIdsScope;
                return this;
            }

            /**
             * <p>ResourceIdsScope</p>
             * 
             * <strong>example:</strong>
             * <p>eip-8vbf3x310fn56ijfd****</p>
             */
            public Builder resourceIdsScope(String resourceIdsScope) {
                this.resourceIdsScope = resourceIdsScope;
                return this;
            }

            /**
             * ResourceNameScope.
             */
            public Builder resourceNameScope(String resourceNameScope) {
                this.resourceNameScope = resourceNameScope;
                return this;
            }

            /**
             * <p>The type of the resource to be evaluated by the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::RAM::User</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
             * <ul>
             * <li>1: high.</li>
             * <li>2: medium.</li>
             * <li>3: low.</li>
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
             * <p>The effective scope of the rule.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The information about how the rule was created.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.</p>
             * <blockquote>
             * <p>This parameter applies only to a managed rule.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder tagKeyLogicScope(String tagKeyLogicScope) {
                this.tagKeyLogicScope = tagKeyLogicScope;
                return this;
            }

            /**
             * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
             * <blockquote>
             * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RAM</p>
             */
            public Builder tagKeyScope(String tagKeyScope) {
                this.tagKeyScope = tagKeyScope;
                return this;
            }

            /**
             * <p>The tag value used to filter resources. The rule applies only to the resources with the specified tag value.</p>
             * <blockquote>
             * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MFA</p>
             */
            public Builder tagValueScope(String tagValueScope) {
                this.tagValueScope = tagValueScope;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>TagsScope</p>
             */
            public Builder tagsScope(java.util.List<TagsScope> tagsScope) {
                this.tagsScope = tagsScope;
                return this;
            }

            public ConfigRule build() {
                return new ConfigRule(this);
            } 

        } 

    }
}
