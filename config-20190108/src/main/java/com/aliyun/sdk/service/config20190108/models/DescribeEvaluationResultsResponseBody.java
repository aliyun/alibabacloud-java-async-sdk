// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEvaluationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEvaluationResultsResponseBody</p>
 */
public class DescribeEvaluationResultsResponseBody extends TeaModel {
    @NameInMap("EvaluationResults")
    private EvaluationResults evaluationResults;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEvaluationResultsResponseBody(Builder builder) {
        this.evaluationResults = builder.evaluationResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEvaluationResultsResponseBody create() {
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
         * EvaluationResults.
         */
        public Builder evaluationResults(EvaluationResults evaluationResults) {
            this.evaluationResults = evaluationResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEvaluationResultsResponseBody build() {
            return new DescribeEvaluationResultsResponseBody(this);
        } 

    } 

    public static class EvaluationResultQualifier extends TeaModel {
        @NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ConfigRuleName")
        private String configRuleName;

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
            private String regionId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 

            /**
             * ConfigRuleArn.
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
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
             * EvaluationResultQualifier.
             */
            public Builder evaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
                this.evaluationResultQualifier = evaluationResultQualifier;
                return this;
            }

            /**
             * OrderingTimestamp.
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
             * Annotation.
             */
            public Builder annotation(String annotation) {
                this.annotation = annotation;
                return this;
            }

            /**
             * ComplianceType.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * ConfigRuleInvokedTimestamp.
             */
            public Builder configRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
                this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
                return this;
            }

            /**
             * EvaluationResultIdentifier.
             */
            public Builder evaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
                this.evaluationResultIdentifier = evaluationResultIdentifier;
                return this;
            }

            /**
             * InvokingEventMessageType.
             */
            public Builder invokingEventMessageType(String invokingEventMessageType) {
                this.invokingEventMessageType = invokingEventMessageType;
                return this;
            }

            /**
             * RemediationEnabled.
             */
            public Builder remediationEnabled(Boolean remediationEnabled) {
                this.remediationEnabled = remediationEnabled;
                return this;
            }

            /**
             * ResultRecordedTimestamp.
             */
            public Builder resultRecordedTimestamp(Long resultRecordedTimestamp) {
                this.resultRecordedTimestamp = resultRecordedTimestamp;
                return this;
            }

            /**
             * RiskLevel.
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

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private EvaluationResults(Builder builder) {
            this.evaluationResultList = builder.evaluationResultList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
            private java.util.List < EvaluationResultList> evaluationResultList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * EvaluationResultList.
             */
            public Builder evaluationResultList(java.util.List < EvaluationResultList> evaluationResultList) {
                this.evaluationResultList = evaluationResultList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public EvaluationResults build() {
                return new EvaluationResults(this);
            } 

        } 

    }
}
