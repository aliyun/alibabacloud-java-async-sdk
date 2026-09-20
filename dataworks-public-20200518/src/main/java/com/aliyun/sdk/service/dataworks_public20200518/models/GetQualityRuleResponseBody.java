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
 * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleResponseBody</p>
 */
public class GetQualityRuleResponseBody extends TeaModel {
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

    private GetQualityRuleResponseBody(Builder builder) {
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

    public static GetQualityRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetQualityRuleResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The quality rule details.</p>
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
         * <p>576b9457-2cf5-4****</p>
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

        public GetQualityRuleResponseBody build() {
            return new GetQualityRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockType")
        private Integer blockType;

        @com.aliyun.core.annotation.NameInMap("Checker")
        private Integer checker;

        @com.aliyun.core.annotation.NameInMap("CheckerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CriticalThreshold")
        private String criticalThreshold;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("ExpectValue")
        private String expectValue;

        @com.aliyun.core.annotation.NameInMap("FixCheck")
        private Boolean fixCheck;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MethodId")
        private Integer methodId;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("OnDuty")
        private String onDuty;

        @com.aliyun.core.annotation.NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @com.aliyun.core.annotation.NameInMap("OpenSwitch")
        private Boolean openSwitch;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PredictType")
        private Integer predictType;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        @com.aliyun.core.annotation.NameInMap("TaskSetting")
        private String taskSetting;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Integer templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private String trend;

        @com.aliyun.core.annotation.NameInMap("WarningThreshold")
        private String warningThreshold;

        @com.aliyun.core.annotation.NameInMap("WhereCondition")
        private String whereCondition;

        private Data(Builder builder) {
            this.blockType = builder.blockType;
            this.checker = builder.checker;
            this.checkerName = builder.checkerName;
            this.comment = builder.comment;
            this.criticalThreshold = builder.criticalThreshold;
            this.entityId = builder.entityId;
            this.expectValue = builder.expectValue;
            this.fixCheck = builder.fixCheck;
            this.id = builder.id;
            this.methodId = builder.methodId;
            this.methodName = builder.methodName;
            this.onDuty = builder.onDuty;
            this.onDutyAccountName = builder.onDutyAccountName;
            this.openSwitch = builder.openSwitch;
            this.operator = builder.operator;
            this.predictType = builder.predictType;
            this.property = builder.property;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.taskSetting = builder.taskSetting;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.trend = builder.trend;
            this.warningThreshold = builder.warningThreshold;
            this.whereCondition = builder.whereCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockType
         */
        public Integer getBlockType() {
            return this.blockType;
        }

        /**
         * @return checker
         */
        public Integer getChecker() {
            return this.checker;
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
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
        public String getCriticalThreshold() {
            return this.criticalThreshold;
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
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return fixCheck
         */
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return methodId
         */
        public Integer getMethodId() {
            return this.methodId;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return onDuty
         */
        public String getOnDuty() {
            return this.onDuty;
        }

        /**
         * @return onDutyAccountName
         */
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        /**
         * @return openSwitch
         */
        public Boolean getOpenSwitch() {
            return this.openSwitch;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return predictType
         */
        public Integer getPredictType() {
            return this.predictType;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        /**
         * @return taskSetting
         */
        public String getTaskSetting() {
            return this.taskSetting;
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
         * @return trend
         */
        public String getTrend() {
            return this.trend;
        }

        /**
         * @return warningThreshold
         */
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        /**
         * @return whereCondition
         */
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public static final class Builder {
            private Integer blockType; 
            private Integer checker; 
            private String checkerName; 
            private String comment; 
            private String criticalThreshold; 
            private Long entityId; 
            private String expectValue; 
            private Boolean fixCheck; 
            private Long id; 
            private Integer methodId; 
            private String methodName; 
            private String onDuty; 
            private String onDutyAccountName; 
            private Boolean openSwitch; 
            private String operator; 
            private Integer predictType; 
            private String property; 
            private String ruleName; 
            private Integer ruleType; 
            private String taskSetting; 
            private Integer templateId; 
            private String templateName; 
            private String trend; 
            private String warningThreshold; 
            private String whereCondition; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.blockType = model.blockType;
                this.checker = model.checker;
                this.checkerName = model.checkerName;
                this.comment = model.comment;
                this.criticalThreshold = model.criticalThreshold;
                this.entityId = model.entityId;
                this.expectValue = model.expectValue;
                this.fixCheck = model.fixCheck;
                this.id = model.id;
                this.methodId = model.methodId;
                this.methodName = model.methodName;
                this.onDuty = model.onDuty;
                this.onDutyAccountName = model.onDutyAccountName;
                this.openSwitch = model.openSwitch;
                this.operator = model.operator;
                this.predictType = model.predictType;
                this.property = model.property;
                this.ruleName = model.ruleName;
                this.ruleType = model.ruleType;
                this.taskSetting = model.taskSetting;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.trend = model.trend;
                this.warningThreshold = model.warningThreshold;
                this.whereCondition = model.whereCondition;
            } 

            /**
             * <p>The severity of the quality rule. Valid values:</p>
             * <ul>
             * <li><p><code>1</code>: Strong Rule. If a Strong Rule triggers a critical Alert, the associated Scheduling Task is blocked.</p>
             * </li>
             * <li><p><code>0</code>: Weak Rule.</p>
             * </li>
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
             * <p>The checker ID, which is derived from a primary key and used for front-end identification.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder checker(Integer checker) {
                this.checker = checker;
                return this;
            }

            /**
             * <p>The name of the checker.</p>
             * 
             * <strong>example:</strong>
             * <p>compared with a fixed value</p>
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * <p>The comment for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Verify that the primary key is unique</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The threshold for a critical Alert, which defines the maximum acceptable deviation from the Expected Value. If this threshold is met for a Strong Rule, the associated Scheduling Task is blocked.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder criticalThreshold(String criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
                return this;
            }

            /**
             * <p>The ID of the partition expression.</p>
             * 
             * <strong>example:</strong>
             * <p>165523</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * <p>Indicates whether to validate against a fixed value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fixCheck(Boolean fixCheck) {
                this.fixCheck = fixCheck;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123232</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the method used to collect sample data.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder methodId(Integer methodId) {
                this.methodId = methodId;
                return this;
            }

            /**
             * <p>The name of the method used to collect sample data. Valid values include <code>avg</code>, <code>count</code>, <code>sum</code>, <code>min</code>, <code>max</code>, <code>count_distinct</code>, <code>user_defined</code>, <code>table_count</code>, <code>table_size</code>, <code>table_dt_load_count</code>, <code>table_dt_refuseload_count</code>, <code>null_value</code>, <code>null_value/table_count</code>, <code>(table_count-count_distinct)/table_count</code>, and <code>table_count-count_distinct</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>table_count</p>
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that configured the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1822931****</p>
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account that configured the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * <p>Indicates whether the rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder openSwitch(Boolean openSwitch) {
                this.openSwitch = openSwitch;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * <p>=</p>
             * </blockquote>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Indicates whether the threshold is dynamic. Valid values:</p>
             * <ul>
             * <li><p><code>0</code>: The threshold is static.</p>
             * </li>
             * <li><p><code>1</code>: The threshold is dynamic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictType(Integer predictType) {
                this.predictType = predictType;
                return this;
            }

            /**
             * <p>The column in the data source table to which the rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>View table fluctuations</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the quality rule. Valid values:</p>
             * <ul>
             * <li><p><code>0</code>: A rule based on a system template.</p>
             * </li>
             * <li><p><code>1</code>: A rule based on a custom SQL statement.</p>
             * </li>
             * <li><p><code>4</code>: A rule based on a custom template.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The variable settings inserted before a custom rule. The format is x=a,y=b.</p>
             * 
             * <strong>example:</strong>
             * <p>x=a,y=b</p>
             */
            public Builder taskSetting(String taskSetting) {
                this.taskSetting = taskSetting;
                return this;
            }

            /**
             * <p>The ID of the template used.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template used.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL task table rows, 1,7, 30 days fluctuation test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The trend of the validation result.</p>
             * 
             * <strong>example:</strong>
             * <p>abs</p>
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * <p>The threshold for a warning Alert. This value specifies the acceptable deviation from the Expected Value and can be customized.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder warningThreshold(String warningThreshold) {
                this.warningThreshold = warningThreshold;
                return this;
            }

            /**
             * <p>The filter condition or custom SQL statement used for validation.</p>
             * 
             * <strong>example:</strong>
             * <p>id&gt;10</p>
             */
            public Builder whereCondition(String whereCondition) {
                this.whereCondition = whereCondition;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
