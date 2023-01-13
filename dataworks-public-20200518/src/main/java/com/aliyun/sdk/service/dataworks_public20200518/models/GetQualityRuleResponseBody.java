// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleResponseBody</p>
 */
public class GetQualityRuleResponseBody extends TeaModel {
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

        public GetQualityRuleResponseBody build() {
            return new GetQualityRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BlockType")
        private Integer blockType;

        @NameInMap("Checker")
        private Integer checker;

        @NameInMap("CheckerName")
        private String checkerName;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CriticalThreshold")
        private String criticalThreshold;

        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("ExpectValue")
        private String expectValue;

        @NameInMap("FixCheck")
        private Boolean fixCheck;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MethodId")
        private Integer methodId;

        @NameInMap("MethodName")
        private String methodName;

        @NameInMap("OnDuty")
        private String onDuty;

        @NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @NameInMap("OpenSwitch")
        private Boolean openSwitch;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("PredictType")
        private Integer predictType;

        @NameInMap("Property")
        private String property;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private Integer ruleType;

        @NameInMap("TemplateId")
        private Integer templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("Trend")
        private String trend;

        @NameInMap("WarningThreshold")
        private String warningThreshold;

        @NameInMap("WhereCondition")
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
            private Integer templateId; 
            private String templateName; 
            private String trend; 
            private String warningThreshold; 
            private String whereCondition; 

            /**
             * BlockType.
             */
            public Builder blockType(Integer blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * Checker.
             */
            public Builder checker(Integer checker) {
                this.checker = checker;
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CriticalThreshold.
             */
            public Builder criticalThreshold(String criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
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
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * FixCheck.
             */
            public Builder fixCheck(Boolean fixCheck) {
                this.fixCheck = fixCheck;
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
             * MethodId.
             */
            public Builder methodId(Integer methodId) {
                this.methodId = methodId;
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
             * OnDuty.
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * OnDutyAccountName.
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * OpenSwitch.
             */
            public Builder openSwitch(Boolean openSwitch) {
                this.openSwitch = openSwitch;
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
             * PredictType.
             */
            public Builder predictType(Integer predictType) {
                this.predictType = predictType;
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
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
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
             * Trend.
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * WarningThreshold.
             */
            public Builder warningThreshold(String warningThreshold) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
