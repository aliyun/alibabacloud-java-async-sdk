// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceEvaluationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceEvaluationResultsResponseBody</p>
 */
public class ListResourceEvaluationResultsResponseBody extends TeaModel {
    @NameInMap("EvaluationResults")
    private EvaluationResults evaluationResults;

    @NameInMap("RequestId")
    private String requestId;

    private ListResourceEvaluationResultsResponseBody(Builder builder) {
        this.evaluationResults = builder.evaluationResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceEvaluationResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return evaluationResults
     */
    public EvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EvaluationResults evaluationResults; 
        private String requestId; 

        /**
         * The information about the compliance evaluation results returned.
         */
        public Builder evaluationResults(EvaluationResults evaluationResults) {
            this.evaluationResults = evaluationResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourceEvaluationResultsResponseBody build() {
            return new ListResourceEvaluationResultsResponseBody(this);
        } 

    } 

    public static class EvaluationResultQualifier extends TeaModel {
        @NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

        @NameInMap("IgnoreDate")
        private String ignoreDate;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        private EvaluationResultQualifier(Builder builder) {
            this.configRuleArn = builder.configRuleArn;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.ignoreDate = builder.ignoreDate;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationResultQualifier create() {
            return builder().build();
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
         * @return ignoreDate
         */
        public String getIgnoreDate() {
            return this.ignoreDate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String configRuleArn; 
            private String configRuleId; 
            private String configRuleName; 
            private String ignoreDate; 
            private String regionId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the rule.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
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
             * The date from which the system automatically re-evaluates the ignored incompliant resources.
             * <p>
             * 
             * >  If the value of this parameter is left empty, the system does not automatically re-evaluate the ignored incompliant resources. You must re-evaluate the ignored incompliant resources.
             */
            public Builder ignoreDate(String ignoreDate) {
                this.ignoreDate = ignoreDate;
                return this;
            }

            /**
             * The ID of the region where your resources reside.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public EvaluationResultQualifier build() {
                return new EvaluationResultQualifier(this);
            } 

        } 

    }
    public static class EvaluationResultIdentifier extends TeaModel {
        @NameInMap("EvaluationResultQualifier")
        private EvaluationResultQualifier evaluationResultQualifier;

        @NameInMap("OrderingTimestamp")
        private Long orderingTimestamp;

        private EvaluationResultIdentifier(Builder builder) {
            this.evaluationResultQualifier = builder.evaluationResultQualifier;
            this.orderingTimestamp = builder.orderingTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationResultIdentifier create() {
            return builder().build();
        }

        /**
         * @return evaluationResultQualifier
         */
        public EvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        /**
         * @return orderingTimestamp
         */
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

        public static final class Builder {
            private EvaluationResultQualifier evaluationResultQualifier; 
            private Long orderingTimestamp; 

            /**
             * The information about the evaluated resource returned in the compliance evaluation result.
             */
            public Builder evaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
                this.evaluationResultQualifier = evaluationResultQualifier;
                return this;
            }

            /**
             * The timestamp when the compliance evaluation was performed. Unit: milliseconds.
             */
            public Builder orderingTimestamp(Long orderingTimestamp) {
                this.orderingTimestamp = orderingTimestamp;
                return this;
            }

            public EvaluationResultIdentifier build() {
                return new EvaluationResultIdentifier(this);
            } 

        } 

    }
    public static class EvaluationResultList extends TeaModel {
        @NameInMap("Annotation")
        private String annotation;

        @NameInMap("ComplianceType")
        private String complianceType;

        @NameInMap("ConfigRuleInvokedTimestamp")
        private Long configRuleInvokedTimestamp;

        @NameInMap("EvaluationResultIdentifier")
        private EvaluationResultIdentifier evaluationResultIdentifier;

        @NameInMap("InvokingEventMessageType")
        private String invokingEventMessageType;

        @NameInMap("RemediationEnabled")
        private Boolean remediationEnabled;

        @NameInMap("ResultRecordedTimestamp")
        private Long resultRecordedTimestamp;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        private EvaluationResultList(Builder builder) {
            this.annotation = builder.annotation;
            this.complianceType = builder.complianceType;
            this.configRuleInvokedTimestamp = builder.configRuleInvokedTimestamp;
            this.evaluationResultIdentifier = builder.evaluationResultIdentifier;
            this.invokingEventMessageType = builder.invokingEventMessageType;
            this.remediationEnabled = builder.remediationEnabled;
            this.resultRecordedTimestamp = builder.resultRecordedTimestamp;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationResultList create() {
            return builder().build();
        }

        /**
         * @return annotation
         */
        public String getAnnotation() {
            return this.annotation;
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return configRuleInvokedTimestamp
         */
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        /**
         * @return evaluationResultIdentifier
         */
        public EvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        /**
         * @return invokingEventMessageType
         */
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        /**
         * @return remediationEnabled
         */
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        /**
         * @return resultRecordedTimestamp
         */
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String annotation; 
            private String complianceType; 
            private Long configRuleInvokedTimestamp; 
            private EvaluationResultIdentifier evaluationResultIdentifier; 
            private String invokingEventMessageType; 
            private Boolean remediationEnabled; 
            private Long resultRecordedTimestamp; 
            private Integer riskLevel; 

            /**
             * The annotation to the resource that is evaluated as incompliant. The following section describes the parameters that can be returned:
             * <p>
             * 
             * *   `configuration`: the current resource configuration that is evaluated as incompliant by using the rule.
             * *   `desiredValue`: the expected resource configuration that is evaluated as compliant by using the rule.
             * *   `operator`: the operator that is used to compare the current configuration with the expected configuration of the resource.
             * *   `property`: the JSON path of the current configuration in the resource property struct.
             * *   `reason`: the reason why the resource is evaluated as incompliant.
             */
            public Builder annotation(String annotation) {
                this.annotation = annotation;
                return this;
            }

            /**
             * The compliance evaluation result of the resources. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resources are evaluated as compliant.
             * *   NON_COMPLIANT: The resources are evaluated as incompliant.
             * *   NOT_APPLICABLE: The rule does not apply to your resources.
             * *   INSUFFICIENT_DATA: No resource data is available.
             * *   IGNORED: The resource is ignored during compliance evaluation.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The timestamp when the rule was triggered for the compliance evaluation. Unit: milliseconds.
             */
            public Builder configRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
                this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
                return this;
            }

            /**
             * The identifying information about the compliance evaluation result.
             */
            public Builder evaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
                this.evaluationResultIdentifier = evaluationResultIdentifier;
                return this;
            }

            /**
             * The trigger type of the managed rule. Valid values:
             * <p>
             * 
             * *   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.
             * *   ScheduledNotification: The managed rule is periodically triggered.
             */
            public Builder invokingEventMessageType(String invokingEventMessageType) {
                this.invokingEventMessageType = invokingEventMessageType;
                return this;
            }

            /**
             * Indicates whether the remediation template is enabled. Valid values:
             * <p>
             * 
             * - true: The remediation template is enabled.
             * - false: The remediation template is disabled.
             */
            public Builder remediationEnabled(Boolean remediationEnabled) {
                this.remediationEnabled = remediationEnabled;
                return this;
            }

            /**
             * The timestamp when the compliance evaluation result was recorded. Unit: milliseconds.
             */
            public Builder resultRecordedTimestamp(Long resultRecordedTimestamp) {
                this.resultRecordedTimestamp = resultRecordedTimestamp;
                return this;
            }

            /**
             * The risk level of the resources that do not comply with the rule. Valid values:
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

            public EvaluationResultList build() {
                return new EvaluationResultList(this);
            } 

        } 

    }
    public static class EvaluationResults extends TeaModel {
        @NameInMap("EvaluationResultList")
        private java.util.List < EvaluationResultList> evaluationResultList;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        private EvaluationResults(Builder builder) {
            this.evaluationResultList = builder.evaluationResultList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationResults create() {
            return builder().build();
        }

        /**
         * @return evaluationResultList
         */
        public java.util.List < EvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < EvaluationResultList> evaluationResultList; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The details of the compliance evaluation result.
             */
            public Builder evaluationResultList(java.util.List < EvaluationResultList> evaluationResultList) {
                this.evaluationResultList = evaluationResultList;
                return this;
            }

            /**
             * The maximum number of entries to return for a single request.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that was used to initiate the next request.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public EvaluationResults build() {
                return new EvaluationResults(this);
            } 

        } 

    }
}
