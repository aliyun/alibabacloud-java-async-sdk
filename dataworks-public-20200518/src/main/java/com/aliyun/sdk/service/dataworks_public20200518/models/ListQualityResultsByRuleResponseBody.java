// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityResultsByRuleResponseBody</p>
 */
public class ListQualityResultsByRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListQualityResultsByRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityResultsByRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityResultsByRuleResponseBody build() {
            return new ListQualityResultsByRuleResponseBody(this);
        } 

    } 

    public static class ReferenceValue extends TeaModel {
        @NameInMap("BizDate")
        private String bizDate;

        @NameInMap("DiscreteProperty")
        private String discreteProperty;

        @NameInMap("SingleCheckResult")
        private Integer singleCheckResult;

        @NameInMap("Threshold")
        private Float threshold;

        @NameInMap("Value")
        private Float value;

        private ReferenceValue(Builder builder) {
            this.bizDate = builder.bizDate;
            this.discreteProperty = builder.discreteProperty;
            this.singleCheckResult = builder.singleCheckResult;
            this.threshold = builder.threshold;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceValue create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return discreteProperty
         */
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        /**
         * @return singleCheckResult
         */
        public Integer getSingleCheckResult() {
            return this.singleCheckResult;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String bizDate; 
            private String discreteProperty; 
            private Integer singleCheckResult; 
            private Float threshold; 
            private Float value; 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * DiscreteProperty.
             */
            public Builder discreteProperty(String discreteProperty) {
                this.discreteProperty = discreteProperty;
                return this;
            }

            /**
             * SingleCheckResult.
             */
            public Builder singleCheckResult(Integer singleCheckResult) {
                this.singleCheckResult = singleCheckResult;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ReferenceValue build() {
                return new ReferenceValue(this);
            } 

        } 

    }
    public static class SampleValue extends TeaModel {
        @NameInMap("BizDate")
        private String bizDate;

        @NameInMap("DiscreteProperty")
        private String discreteProperty;

        @NameInMap("Value")
        private Float value;

        private SampleValue(Builder builder) {
            this.bizDate = builder.bizDate;
            this.discreteProperty = builder.discreteProperty;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SampleValue create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return discreteProperty
         */
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String bizDate; 
            private String discreteProperty; 
            private Float value; 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * DiscreteProperty.
             */
            public Builder discreteProperty(String discreteProperty) {
                this.discreteProperty = discreteProperty;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SampleValue build() {
                return new SampleValue(this);
            } 

        } 

    }
    public static class RuleChecks extends TeaModel {
        @NameInMap("ActualExpression")
        private String actualExpression;

        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("BizDate")
        private Long bizDate;

        @NameInMap("BlockType")
        private Integer blockType;

        @NameInMap("CheckResult")
        private Integer checkResult;

        @NameInMap("CheckResultStatus")
        private Integer checkResultStatus;

        @NameInMap("CheckerId")
        private Integer checkerId;

        @NameInMap("CheckerName")
        private String checkerName;

        @NameInMap("CheckerType")
        private Integer checkerType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CriticalThreshold")
        private Float criticalThreshold;

        @NameInMap("DateType")
        private String dateType;

        @NameInMap("DiscreteCheck")
        private Boolean discreteCheck;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("ExpectValue")
        private Float expectValue;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("ExternalType")
        private String externalType;

        @NameInMap("FixedCheck")
        private Boolean fixedCheck;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsPrediction")
        private Boolean isPrediction;

        @NameInMap("LowerValue")
        private Float lowerValue;

        @NameInMap("MatchExpression")
        private String matchExpression;

        @NameInMap("MethodName")
        private String methodName;

        @NameInMap("Op")
        private String op;

        @NameInMap("Open")
        private Boolean open;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("Property")
        private String property;

        @NameInMap("ReferenceValue")
        private java.util.List < ReferenceValue> referenceValue;

        @NameInMap("ResultString")
        private String resultString;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SampleValue")
        private java.util.List < SampleValue> sampleValue;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TemplateId")
        private Integer templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TimeCost")
        private String timeCost;

        @NameInMap("Trend")
        private String trend;

        @NameInMap("UpperValue")
        private Float upperValue;

        @NameInMap("WarningThreshold")
        private Float warningThreshold;

        @NameInMap("WhereCondition")
        private String whereCondition;

        private RuleChecks(Builder builder) {
            this.actualExpression = builder.actualExpression;
            this.beginTime = builder.beginTime;
            this.bizDate = builder.bizDate;
            this.blockType = builder.blockType;
            this.checkResult = builder.checkResult;
            this.checkResultStatus = builder.checkResultStatus;
            this.checkerId = builder.checkerId;
            this.checkerName = builder.checkerName;
            this.checkerType = builder.checkerType;
            this.comment = builder.comment;
            this.criticalThreshold = builder.criticalThreshold;
            this.dateType = builder.dateType;
            this.discreteCheck = builder.discreteCheck;
            this.endTime = builder.endTime;
            this.entityId = builder.entityId;
            this.expectValue = builder.expectValue;
            this.externalId = builder.externalId;
            this.externalType = builder.externalType;
            this.fixedCheck = builder.fixedCheck;
            this.id = builder.id;
            this.isPrediction = builder.isPrediction;
            this.lowerValue = builder.lowerValue;
            this.matchExpression = builder.matchExpression;
            this.methodName = builder.methodName;
            this.op = builder.op;
            this.open = builder.open;
            this.projectName = builder.projectName;
            this.property = builder.property;
            this.referenceValue = builder.referenceValue;
            this.resultString = builder.resultString;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sampleValue = builder.sampleValue;
            this.tableName = builder.tableName;
            this.taskId = builder.taskId;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.timeCost = builder.timeCost;
            this.trend = builder.trend;
            this.upperValue = builder.upperValue;
            this.warningThreshold = builder.warningThreshold;
            this.whereCondition = builder.whereCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleChecks create() {
            return builder().build();
        }

        /**
         * @return actualExpression
         */
        public String getActualExpression() {
            return this.actualExpression;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
        }

        /**
         * @return blockType
         */
        public Integer getBlockType() {
            return this.blockType;
        }

        /**
         * @return checkResult
         */
        public Integer getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return checkResultStatus
         */
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        /**
         * @return checkerId
         */
        public Integer getCheckerId() {
            return this.checkerId;
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
        }

        /**
         * @return checkerType
         */
        public Integer getCheckerType() {
            return this.checkerType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return criticalThreshold
         */
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        /**
         * @return dateType
         */
        public String getDateType() {
            return this.dateType;
        }

        /**
         * @return discreteCheck
         */
        public Boolean getDiscreteCheck() {
            return this.discreteCheck;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return expectValue
         */
        public Float getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return externalType
         */
        public String getExternalType() {
            return this.externalType;
        }

        /**
         * @return fixedCheck
         */
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isPrediction
         */
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        /**
         * @return lowerValue
         */
        public Float getLowerValue() {
            return this.lowerValue;
        }

        /**
         * @return matchExpression
         */
        public String getMatchExpression() {
            return this.matchExpression;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return open
         */
        public Boolean getOpen() {
            return this.open;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return referenceValue
         */
        public java.util.List < ReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        /**
         * @return resultString
         */
        public String getResultString() {
            return this.resultString;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sampleValue
         */
        public java.util.List < SampleValue> getSampleValue() {
            return this.sampleValue;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        /**
         * @return trend
         */
        public String getTrend() {
            return this.trend;
        }

        /**
         * @return upperValue
         */
        public Float getUpperValue() {
            return this.upperValue;
        }

        /**
         * @return warningThreshold
         */
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        /**
         * @return whereCondition
         */
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public static final class Builder {
            private String actualExpression; 
            private Long beginTime; 
            private Long bizDate; 
            private Integer blockType; 
            private Integer checkResult; 
            private Integer checkResultStatus; 
            private Integer checkerId; 
            private String checkerName; 
            private Integer checkerType; 
            private String comment; 
            private Float criticalThreshold; 
            private String dateType; 
            private Boolean discreteCheck; 
            private Long endTime; 
            private Long entityId; 
            private Float expectValue; 
            private String externalId; 
            private String externalType; 
            private Boolean fixedCheck; 
            private Long id; 
            private Boolean isPrediction; 
            private Float lowerValue; 
            private String matchExpression; 
            private String methodName; 
            private String op; 
            private Boolean open; 
            private String projectName; 
            private String property; 
            private java.util.List < ReferenceValue> referenceValue; 
            private String resultString; 
            private Long ruleId; 
            private String ruleName; 
            private java.util.List < SampleValue> sampleValue; 
            private String tableName; 
            private String taskId; 
            private Integer templateId; 
            private String templateName; 
            private String timeCost; 
            private String trend; 
            private Float upperValue; 
            private Float warningThreshold; 
            private String whereCondition; 

            /**
             * ActualExpression.
             */
            public Builder actualExpression(String actualExpression) {
                this.actualExpression = actualExpression;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * BlockType.
             */
            public Builder blockType(Integer blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(Integer checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * CheckResultStatus.
             */
            public Builder checkResultStatus(Integer checkResultStatus) {
                this.checkResultStatus = checkResultStatus;
                return this;
            }

            /**
             * CheckerId.
             */
            public Builder checkerId(Integer checkerId) {
                this.checkerId = checkerId;
                return this;
            }

            /**
             * CheckerName.
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * CheckerType.
             */
            public Builder checkerType(Integer checkerType) {
                this.checkerType = checkerType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CriticalThreshold.
             */
            public Builder criticalThreshold(Float criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
                return this;
            }

            /**
             * DateType.
             */
            public Builder dateType(String dateType) {
                this.dateType = dateType;
                return this;
            }

            /**
             * DiscreteCheck.
             */
            public Builder discreteCheck(Boolean discreteCheck) {
                this.discreteCheck = discreteCheck;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * ExpectValue.
             */
            public Builder expectValue(Float expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * ExternalType.
             */
            public Builder externalType(String externalType) {
                this.externalType = externalType;
                return this;
            }

            /**
             * FixedCheck.
             */
            public Builder fixedCheck(Boolean fixedCheck) {
                this.fixedCheck = fixedCheck;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsPrediction.
             */
            public Builder isPrediction(Boolean isPrediction) {
                this.isPrediction = isPrediction;
                return this;
            }

            /**
             * LowerValue.
             */
            public Builder lowerValue(Float lowerValue) {
                this.lowerValue = lowerValue;
                return this;
            }

            /**
             * MatchExpression.
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * MethodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * Op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * Open.
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Property.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * ReferenceValue.
             */
            public Builder referenceValue(java.util.List < ReferenceValue> referenceValue) {
                this.referenceValue = referenceValue;
                return this;
            }

            /**
             * ResultString.
             */
            public Builder resultString(String resultString) {
                this.resultString = resultString;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SampleValue.
             */
            public Builder sampleValue(java.util.List < SampleValue> sampleValue) {
                this.sampleValue = sampleValue;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TimeCost.
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            /**
             * Trend.
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * UpperValue.
             */
            public Builder upperValue(Float upperValue) {
                this.upperValue = upperValue;
                return this;
            }

            /**
             * WarningThreshold.
             */
            public Builder warningThreshold(Float warningThreshold) {
                this.warningThreshold = warningThreshold;
                return this;
            }

            /**
             * WhereCondition.
             */
            public Builder whereCondition(String whereCondition) {
                this.whereCondition = whereCondition;
                return this;
            }

            public RuleChecks build() {
                return new RuleChecks(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RuleChecks")
        private java.util.List < RuleChecks> ruleChecks;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.ruleChecks = builder.ruleChecks;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return ruleChecks
         */
        public java.util.List < RuleChecks> getRuleChecks() {
            return this.ruleChecks;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < RuleChecks> ruleChecks; 
            private Long totalCount; 

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
             * RuleChecks.
             */
            public Builder ruleChecks(java.util.List < RuleChecks> ruleChecks) {
                this.ruleChecks = ruleChecks;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
