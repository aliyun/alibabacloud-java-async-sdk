// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityResultsByRuleResponseBody</p>
 */
public class ListQualityResultsByRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The data structure of the monitoring results returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>401</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You have no permission.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBA58543-00D4-41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityResultsByRuleResponseBody build() {
            return new ListQualityResultsByRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityResultsByRuleResponseBody</p>
     */
    public static class ReferenceValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("DiscreteProperty")
        private String discreteProperty;

        @com.aliyun.core.annotation.NameInMap("SingleCheckResult")
        private Integer singleCheckResult;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1600704000000</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
             * 
             * <strong>example:</strong>
             * <p>type1</p>
             */
            public Builder discreteProperty(String discreteProperty) {
                this.discreteProperty = discreteProperty;
                return this;
            }

            /**
             * <p>The string of the monitoring result.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder singleCheckResult(Integer singleCheckResult) {
                this.singleCheckResult = singleCheckResult;
                return this;
            }

            /**
             * <p>The threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The sample value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityResultsByRuleResponseBody</p>
     */
    public static class SampleValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("DiscreteProperty")
        private String discreteProperty;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1600704000000</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
             * 
             * <strong>example:</strong>
             * <p>type2</p>
             */
            public Builder discreteProperty(String discreteProperty) {
                this.discreteProperty = discreteProperty;
                return this;
            }

            /**
             * <p>The sample value.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
    /**
     * 
     * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityResultsByRuleResponseBody</p>
     */
    public static class RuleChecks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualExpression")
        private String actualExpression;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private Long bizDate;

        @com.aliyun.core.annotation.NameInMap("BlockType")
        private Integer blockType;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private Integer checkResult;

        @com.aliyun.core.annotation.NameInMap("CheckResultStatus")
        private Integer checkResultStatus;

        @com.aliyun.core.annotation.NameInMap("CheckerId")
        private Integer checkerId;

        @com.aliyun.core.annotation.NameInMap("CheckerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("CheckerType")
        private Integer checkerType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CriticalThreshold")
        private Float criticalThreshold;

        @com.aliyun.core.annotation.NameInMap("DateType")
        private String dateType;

        @com.aliyun.core.annotation.NameInMap("DiscreteCheck")
        private Boolean discreteCheck;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("ExpectValue")
        private Float expectValue;

        @com.aliyun.core.annotation.NameInMap("ExternalId")
        private String externalId;

        @com.aliyun.core.annotation.NameInMap("ExternalType")
        private String externalType;

        @com.aliyun.core.annotation.NameInMap("FixedCheck")
        private Boolean fixedCheck;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsPrediction")
        private Boolean isPrediction;

        @com.aliyun.core.annotation.NameInMap("LowerValue")
        private Float lowerValue;

        @com.aliyun.core.annotation.NameInMap("MatchExpression")
        private String matchExpression;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Open")
        private Boolean open;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("ReferenceValue")
        private java.util.List<ReferenceValue> referenceValue;

        @com.aliyun.core.annotation.NameInMap("ResultString")
        private String resultString;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SampleValue")
        private java.util.List<SampleValue> sampleValue;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Integer templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private String trend;

        @com.aliyun.core.annotation.NameInMap("UpperValue")
        private Float upperValue;

        @com.aliyun.core.annotation.NameInMap("WarningThreshold")
        private Float warningThreshold;

        @com.aliyun.core.annotation.NameInMap("WhereCondition")
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
        public java.util.List<ReferenceValue> getReferenceValue() {
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
        public java.util.List<SampleValue> getSampleValue() {
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
            private java.util.List<ReferenceValue> referenceValue; 
            private String resultString; 
            private Long ruleId; 
            private String ruleName; 
            private java.util.List<SampleValue> sampleValue; 
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
             * <p>The partition in the monitored data source table.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20200925</p>
             */
            public Builder actualExpression(String actualExpression) {
                this.actualExpression = actualExpression;
                return this;
            }

            /**
             * <p>The time when the monitoring started.</p>
             * 
             * <strong>example:</strong>
             * <p>1600704000000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1600704000000</p>
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:</p>
             * <ul>
             * <li>1: indicates that the monitoring rule is a strong rule.</li>
             * <li>0: indicates that the monitoring rule is a weak rule. You can specify the strength of a monitoring rule based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder blockType(Integer blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * <p>The monitoring result.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder checkResult(Integer checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The status of the monitoring result.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder checkResultStatus(Integer checkResultStatus) {
                this.checkResultStatus = checkResultStatus;
                return this;
            }

            /**
             * <p>The checker ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder checkerId(Integer checkerId) {
                this.checkerId = checkerId;
                return this;
            }

            /**
             * <p>The name of the checker.</p>
             * 
             * <strong>example:</strong>
             * <p>fulx</p>
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * <p>The type of the checker.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder checkerType(Integer checkerType) {
                this.checkerType = checkerType;
                return this;
            }

            /**
             * <p>The description of the monitoring rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the rule.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder criticalThreshold(Float criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
                return this;
            }

            /**
             * <p>The scheduling frequency. In most cases, the value of this parameter is YMD. This value indicates year, month, and day.</p>
             * 
             * <strong>example:</strong>
             * <p>YMD</p>
             */
            public Builder dateType(String dateType) {
                this.dateType = dateType;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring is discrete monitoring. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder discreteCheck(Boolean discreteCheck) {
                this.discreteCheck = discreteCheck;
                return this;
            }

            /**
             * <p>The time when the monitoring ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1600704000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>14534343</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder expectValue(Float expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123112232</p>
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * <p>The type of the scheduling system. Only CWF scheduling systems are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>CWF2</p>
             */
            public Builder externalType(String externalType) {
                this.externalType = externalType;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring is performed based on a fixed value. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fixedCheck(Boolean fixedCheck) {
                this.fixedCheck = fixedCheck;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2231123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring result is the same as the predicted result. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPrediction(Boolean isPrediction) {
                this.isPrediction = isPrediction;
                return this;
            }

            /**
             * <p>The lower limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specify.</p>
             * 
             * <strong>example:</strong>
             * <p>2344</p>
             */
            public Builder lowerValue(Float lowerValue) {
                this.lowerValue = lowerValue;
                return this;
            }

            /**
             * <p>The partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=$[yyyymmdd]</p>
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * <p>The method used to collect sample data, such as such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.</p>
             * 
             * <strong>example:</strong>
             * <p>max</p>
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * </blockquote>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>Indicates whether the monitoring rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * <p>The name of the compute engine or data source for which data quality is monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The field whose data quality is checked based on the monitoring rule. This field is a column in the data source table that is monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The historical sample values.</p>
             */
            public Builder referenceValue(java.util.List<ReferenceValue> referenceValue) {
                this.referenceValue = referenceValue;
                return this;
            }

            /**
             * <p>The string of the monitoring result.</p>
             * 
             * <strong>example:</strong>
             * <p>ResultString</p>
             */
            public Builder resultString(String resultString) {
                this.resultString = resultString;
                return this;
            }

            /**
             * <p>The ID of the monitoring rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123421</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the monitoring rule.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the rule.</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The current sample values.</p>
             */
            public Builder sampleValue(java.util.List<SampleValue> sampleValue) {
                this.sampleValue = sampleValue;
                return this;
            }

            /**
             * <p>The name of the table that is monitored.</p>
             * 
             * <strong>example:</strong>
             * <p>dual</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The monitoring task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16008552981681a0d6****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The ID of the monitoring template.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the monitoring template.</p>
             * 
             * <strong>example:</strong>
             * <p>Expected value verification</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The time that was taken to run the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            /**
             * <p>The trend of the monitoring result.</p>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * <p>The upper limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specify.</p>
             * 
             * <strong>example:</strong>
             * <p>22200</p>
             */
            public Builder upperValue(Float upperValue) {
                this.upperValue = upperValue;
                return this;
            }

            /**
             * <p>The threshold for a warning alert. The threshold specifies the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder warningThreshold(Float warningThreshold) {
                this.warningThreshold = warningThreshold;
                return this;
            }

            /**
             * <p>The filter condition of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>type!=&quot;type2&quot;</p>
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
    /**
     * 
     * {@link ListQualityResultsByRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityResultsByRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RuleChecks")
        private java.util.List<RuleChecks> ruleChecks;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<RuleChecks> getRuleChecks() {
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
            private java.util.List<RuleChecks> ruleChecks; 
            private Long totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The returned monitoring results.</p>
             */
            public Builder ruleChecks(java.util.List<RuleChecks> ruleChecks) {
                this.ruleChecks = ruleChecks;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
