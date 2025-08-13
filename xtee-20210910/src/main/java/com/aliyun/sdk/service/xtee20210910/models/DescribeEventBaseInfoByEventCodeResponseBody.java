// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEventBaseInfoByEventCodeResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeEventBaseInfoByEventCodeResponseBody build() {
            return new DescribeEventBaseInfoByEventCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventBaseInfoByEventCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventBaseInfoByEventCodeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InputFields model) {
                this.description = model.description;
                this.fieldCode = model.fieldCode;
                this.fieldRank = model.fieldRank;
                this.fieldSource = model.fieldSource;
                this.fieldType = model.fieldType;
                this.title = model.title;
            } 

            /**
             * <p>Field description.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Field code</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder fieldCode(String fieldCode) {
                this.fieldCode = fieldCode;
                return this;
            }

            /**
             * <p>Field ranking</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fieldRank(String fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * <p>Field source.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder fieldSource(String fieldSource) {
                this.fieldSource = fieldSource;
                return this;
            }

            /**
             * <p>Field type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Field name.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
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
    /**
     * 
     * {@link DescribeEventBaseInfoByEventCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventBaseInfoByEventCodeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RuleDetails model) {
                this.logicExpression = model.logicExpression;
                this.memo = model.memo;
                this.ruleActions = model.ruleActions;
                this.ruleAuthType = model.ruleAuthType;
                this.ruleExpressions = model.ruleExpressions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
            } 

            /**
             * <p>Policy Execution Logic</p>
             * 
             * <strong>example:</strong>
             * <p>3&amp;((1&amp;2&amp;4)</p>
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * <p>Memo</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Rule Actions</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;inputs&quot;:[&quot;auto_accselist&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]</p>
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>Policy Type</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder ruleAuthType(String ruleAuthType) {
                this.ruleAuthType = ruleAuthType;
                return this;
            }

            /**
             * <p>Event Expressions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;expressionName&quot;:&quot;同一设备同一IP上的注册用户数&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;dK7EXHr490f&quot;},&quot;operatorCode&quot;:&quot;gte&quot;,&quot;operatorName&quot;:&quot;大于等于&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;2&quot;}}]</p>
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>101544</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Policy Name</p>
             * 
             * <strong>example:</strong>
             * <p>手机号MD5命中人脸测试名单</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Policy Status</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
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
    /**
     * 
     * {@link DescribeEventBaseInfoByEventCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventBaseInfoByEventCodeResponseBody</p>
     */
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
        private java.util.List<InputFields> inputFields;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleDetails")
        private java.util.List<RuleDetails> ruleDetails;

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
        public java.util.List<InputFields> getInputFields() {
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
        public java.util.List<RuleDetails> getRuleDetails() {
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
            private java.util.List<InputFields> inputFields; 
            private String memo; 
            private java.util.List<RuleDetails> ruleDetails; 
            private String templateCode; 
            private String templateName; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizVersion = model.bizVersion;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.eventStauts = model.eventStauts;
                this.inputFields = model.inputFields;
                this.memo = model.memo;
                this.ruleDetails = model.ruleDetails;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
                this.templateType = model.templateType;
            } 

            /**
             * <p>Business version number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizVersion(Integer bizVersion) {
                this.bizVersion = bizVersion;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Event status.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder eventStauts(String eventStauts) {
                this.eventStauts = eventStauts;
                return this;
            }

            /**
             * <p>Field list.</p>
             */
            public Builder inputFields(java.util.List<InputFields> inputFields) {
                this.inputFields = inputFields;
                return this;
            }

            /**
             * <p>Memo.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Policy Information</p>
             */
            public Builder ruleDetails(java.util.List<RuleDetails> ruleDetails) {
                this.ruleDetails = ruleDetails;
                return this;
            }

            /**
             * <p>Operation template code</p>
             * 
             * <strong>example:</strong>
             * <p>register</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>Template name</p>
             * 
             * <strong>example:</strong>
             * <p>注册事件模板</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>Template type.</p>
             * 
             * <strong>example:</strong>
             * <p>TEMPLATE</p>
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
