// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventBaseInfoByEventCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventBaseInfoByEventCodeResponseBody</p>
 */
public class DescribeEventBaseInfoByEventCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeEventBaseInfoByEventCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventBaseInfoByEventCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeEventBaseInfoByEventCodeResponseBody build() {
            return new DescribeEventBaseInfoByEventCodeResponseBody(this);
        } 

    } 

    public static class InputFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fieldCode")
        private String fieldCode;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private String fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldSource")
        private String fieldSource;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private InputFields(Builder builder) {
            this.description = builder.description;
            this.fieldCode = builder.fieldCode;
            this.fieldRank = builder.fieldRank;
            this.fieldSource = builder.fieldSource;
            this.fieldType = builder.fieldType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFields create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldCode
         */
        public String getFieldCode() {
            return this.fieldCode;
        }

        /**
         * @return fieldRank
         */
        public String getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldSource
         */
        public String getFieldSource() {
            return this.fieldSource;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String fieldCode; 
            private String fieldRank; 
            private String fieldSource; 
            private String fieldType; 
            private String title; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * fieldCode.
             */
            public Builder fieldCode(String fieldCode) {
                this.fieldCode = fieldCode;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(String fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldSource.
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InputFields build() {
                return new InputFields(this);
            } 

        } 

    }
    public static class RuleDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logicExpression")
        private String logicExpression;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

        @com.aliyun.core.annotation.NameInMap("ruleAuthType")
        private String ruleAuthType;

        @com.aliyun.core.annotation.NameInMap("ruleExpressions")
        private String ruleExpressions;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        private RuleDetails(Builder builder) {
            this.logicExpression = builder.logicExpression;
            this.memo = builder.memo;
            this.ruleActions = builder.ruleActions;
            this.ruleAuthType = builder.ruleAuthType;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleDetails create() {
            return builder().build();
        }

        /**
         * @return logicExpression
         */
        public String getLogicExpression() {
            return this.logicExpression;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleActions
         */
        public String getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleAuthType
         */
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        /**
         * @return ruleExpressions
         */
        public String getRuleExpressions() {
            return this.ruleExpressions;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public static final class Builder {
            private String logicExpression; 
            private String memo; 
            private String ruleActions; 
            private String ruleAuthType; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 

            /**
             * logicExpression.
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * ruleActions.
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * ruleAuthType.
             */
            public Builder ruleAuthType(String ruleAuthType) {
                this.ruleAuthType = ruleAuthType;
                return this;
            }

            /**
             * ruleExpressions.
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ruleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public RuleDetails build() {
                return new RuleDetails(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizVersion")
        private Integer bizVersion;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventStauts")
        private String eventStauts;

        @com.aliyun.core.annotation.NameInMap("inputFields")
        private java.util.List < InputFields> inputFields;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleDetails")
        private java.util.List < RuleDetails> ruleDetails;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("templateType")
        private String templateType;

        private ResultObject(Builder builder) {
            this.bizVersion = builder.bizVersion;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventStauts = builder.eventStauts;
            this.inputFields = builder.inputFields;
            this.memo = builder.memo;
            this.ruleDetails = builder.ruleDetails;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizVersion
         */
        public Integer getBizVersion() {
            return this.bizVersion;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventStauts
         */
        public String getEventStauts() {
            return this.eventStauts;
        }

        /**
         * @return inputFields
         */
        public java.util.List < InputFields> getInputFields() {
            return this.inputFields;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleDetails
         */
        public java.util.List < RuleDetails> getRuleDetails() {
            return this.ruleDetails;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Integer bizVersion; 
            private String eventCode; 
            private String eventName; 
            private String eventStauts; 
            private java.util.List < InputFields> inputFields; 
            private String memo; 
            private java.util.List < RuleDetails> ruleDetails; 
            private String templateCode; 
            private String templateName; 
            private String templateType; 

            /**
             * bizVersion.
             */
            public Builder bizVersion(Integer bizVersion) {
                this.bizVersion = bizVersion;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventStauts.
             */
            public Builder eventStauts(String eventStauts) {
                this.eventStauts = eventStauts;
                return this;
            }

            /**
             * inputFields.
             */
            public Builder inputFields(java.util.List < InputFields> inputFields) {
                this.inputFields = inputFields;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * ruleDetails.
             */
            public Builder ruleDetails(java.util.List < RuleDetails> ruleDetails) {
                this.ruleDetails = ruleDetails;
                return this;
            }

            /**
             * templateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * templateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * templateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
