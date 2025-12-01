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
 * {@link CompareRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CompareRuleResponseBody</p>
 */
public class CompareRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private CompareRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareRuleResponseBody create() {
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

        private Builder(CompareRuleResponseBody model) {
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
         * <p>Returned object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CompareRuleResponseBody build() {
            return new CompareRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CompareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CompareRuleResponseBody</p>
     */
    public static class NewRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auditId")
        private Long auditId;

        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("consoleRuleId")
        private Long consoleRuleId;

        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("logicExpression")
        private String logicExpression;

        @com.aliyun.core.annotation.NameInMap("mainEventCode")
        private String mainEventCode;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActionMap")
        private java.util.Map<String, ?> ruleActionMap;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

        @com.aliyun.core.annotation.NameInMap("ruleAuthType")
        private String ruleAuthType;

        @com.aliyun.core.annotation.NameInMap("ruleBody")
        private String ruleBody;

        @com.aliyun.core.annotation.NameInMap("ruleExpressions")
        private String ruleExpressions;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ruleVersionId")
        private Long ruleVersionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private NewRule(Builder builder) {
            this.auditId = builder.auditId;
            this.authType = builder.authType;
            this.consoleRuleId = builder.consoleRuleId;
            this.createType = builder.createType;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.mainEventCode = builder.mainEventCode;
            this.memo = builder.memo;
            this.ruleActionMap = builder.ruleActionMap;
            this.ruleActions = builder.ruleActions;
            this.ruleAuthType = builder.ruleAuthType;
            this.ruleBody = builder.ruleBody;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
            this.ruleVersionId = builder.ruleVersionId;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewRule create() {
            return builder().build();
        }

        /**
         * @return auditId
         */
        public Long getAuditId() {
            return this.auditId;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return logicExpression
         */
        public String getLogicExpression() {
            return this.logicExpression;
        }

        /**
         * @return mainEventCode
         */
        public String getMainEventCode() {
            return this.mainEventCode;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleActionMap
         */
        public java.util.Map<String, ?> getRuleActionMap() {
            return this.ruleActionMap;
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
         * @return ruleBody
         */
        public String getRuleBody() {
            return this.ruleBody;
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

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return ruleVersionId
         */
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long auditId; 
            private String authType; 
            private Long consoleRuleId; 
            private String createType; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String mainEventCode; 
            private String memo; 
            private java.util.Map<String, ?> ruleActionMap; 
            private String ruleActions; 
            private String ruleAuthType; 
            private String ruleBody; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private String ruleType; 
            private Long ruleVersionId; 
            private Long userId; 
            private Long version; 

            private Builder() {
            } 

            private Builder(NewRule model) {
                this.auditId = model.auditId;
                this.authType = model.authType;
                this.consoleRuleId = model.consoleRuleId;
                this.createType = model.createType;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.logicExpression = model.logicExpression;
                this.mainEventCode = model.mainEventCode;
                this.memo = model.memo;
                this.ruleActionMap = model.ruleActionMap;
                this.ruleActions = model.ruleActions;
                this.ruleAuthType = model.ruleAuthType;
                this.ruleBody = model.ruleBody;
                this.ruleExpressions = model.ruleExpressions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
                this.ruleVersionId = model.ruleVersionId;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * <p>Audit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>258</p>
             */
            public Builder auditId(Long auditId) {
                this.auditId = auditId;
                return this;
            }

            /**
             * <p>Authorization type.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Primary key ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>6760</p>
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
                return this;
            }

            /**
             * <p>Creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>Event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_asssce8122</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册_事件</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1760670462000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1761196952000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Logic of the rule expression execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1&amp;2&amp;3</p>
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * <p>Main event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_asssce8122</p>
             */
            public Builder mainEventCode(String mainEventCode) {
                this.mainEventCode = mainEventCode;
                return this;
            }

            /**
             * <p>Memo.</p>
             * 
             * <strong>example:</strong>
             * <p>鸿蒙元服务_交费业务</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Returned rule action structure. Returned when the policy type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;TAG&quot;: &quot;[{&quot;code&quot;:&quot;addDeTags&quot;,&quot;inputs&quot;:[&quot;test&quot;],&quot;description&quot;:&quot;打标签&quot;,&quot;type&quot;:&quot;ACTION&quot;,&quot;title&quot;:&quot;打标签&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;displayType&quot;:&quot;ACTION&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;fieldType&quot;:&quot;STRING&quot;}]&quot;
             * }</p>
             */
            public Builder ruleActionMap(java.util.Map<String, ?> ruleActionMap) {
                this.ruleActionMap = ruleActionMap;
                return this;
            }

            /**
             * <p>Output actions of the rule execution. Returned when the rule type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;actionType&quot;: &quot;TAG&quot;,
             *         &quot;code&quot;: &quot;addDeTags&quot;,
             *         &quot;description&quot;: &quot;打标签&quot;,
             *         &quot;displayType&quot;: &quot;ACTION&quot;,
             *         &quot;fieldType&quot;: &quot;STRING&quot;,
             *         &quot;inputs&quot;: [
             *             &quot;test&quot;
             *         ],
             *         &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
             *         &quot;sourceType&quot;: &quot;SAF&quot;,
             *         &quot;title&quot;: &quot;打标签&quot;,
             *         &quot;type&quot;: &quot;ACTION&quot;
             *     }
             * ]</p>
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>Authorization type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder ruleAuthType(String ruleAuthType) {
                this.ruleAuthType = ruleAuthType;
                return this;
            }

            /**
             * <p>DSL logic for rule execution. Returned when the rule type is DSL.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;elseStatement&quot;: {</p>
             * <pre><code>},
             * &quot;ifStatement&quot;: {
             *     &quot;condition&quot;: {
             *         &quot;currentId&quot;: 0,
             *         &quot;deepCount&quot;: 1,
             *         &quot;list&quot;: [
             *             {
             *                 &quot;sequence&quot;: 1,
             *                 &quot;left&quot;: {
             *                     &quot;displayType&quot;: &quot;NATIVE&quot;,
             *                     &quot;code&quot;: &quot;ip&quot;,
             *                     &quot;functionCode&quot;: &quot;&quot;,
             *                     &quot;functionName&quot;: &quot;&quot;,
             *                     &quot;name&quot;: &quot;ip&quot;,
             *                     &quot;description&quot;: &quot;IP地址&quot;,
             *                     &quot;hasRightVariable&quot;: true,
             *                     &quot;title&quot;: &quot;IP地址&quot;,
             *                     &quot;type&quot;: &quot;NATIVE&quot;,
             *                     &quot;fieldType&quot;: &quot;STRING&quot;
             *                 },
             *                 &quot;currentId&quot;: 0,
             *                 &quot;deepCount&quot;: 1,
             *                 &quot;right&quot;: {
             *                     &quot;name&quot;: &quot;192.168.1.1&quot;,
             *                     &quot;rightVariableType&quot;: &quot;constant&quot;
             *                 },
             *                 &quot;operatorCode&quot;: &quot;equals&quot;,
             *                 &quot;operatorName&quot;: &quot;等于&quot;,
             *                 &quot;parentId&quot;: 0
             *             }
             *         ],
             *         &quot;relationship&quot;: &quot;and&quot;,
             *         &quot;parentId&quot;: 0
             *     },
             *     &quot;then&quot;: [
             *         {
             *             &quot;actionType&quot;: &quot;TAG&quot;,
             *             &quot;displayType&quot;: &quot;ACTION&quot;,
             *             &quot;code&quot;: &quot;addDeTags&quot;,
             *             &quot;sourceType&quot;: &quot;SAF&quot;,
             *             &quot;inputs&quot;: [
             *                 &quot;10&quot;
             *             ],
             *             &quot;name&quot;: &quot;__addDeTags__&quot;,
             *             &quot;description&quot;: &quot;打标签&quot;,
             *             &quot;outputType&quot;: &quot;const&quot;,
             *             &quot;title&quot;: &quot;打标签&quot;,
             *             &quot;type&quot;: &quot;ACTION&quot;,
             *             &quot;fieldType&quot;: &quot;STRING&quot;
             *         }
             *     ],
             *     &quot;expressions&quot;: [
             *         {
             *             &quot;itemId&quot;: 1,
             *             &quot;left&quot;: {
             *                 &quot;displayType&quot;: &quot;NATIVE&quot;,
             *                 &quot;code&quot;: &quot;ip&quot;,
             *                 &quot;functionCode&quot;: &quot;&quot;,
             *                 &quot;functionName&quot;: &quot;&quot;,
             *                 &quot;name&quot;: &quot;ip&quot;,
             *                 &quot;description&quot;: &quot;IP地址&quot;,
             *                 &quot;hasRightVariable&quot;: true,
             *                 &quot;title&quot;: &quot;IP地址&quot;,
             *                 &quot;type&quot;: &quot;NATIVE&quot;,
             *                 &quot;fieldType&quot;: &quot;STRING&quot;
             *             },
             *             &quot;expressionName&quot;: &quot;IP地址 等于 192.168.1.1&quot;,
             *             &quot;rightValue&quot;: &quot;192.168.1.1&quot;,
             *             &quot;right&quot;: {
             *                 &quot;name&quot;: &quot;192.168.1.1&quot;,
             *                 &quot;fieldValue&quot;: &quot;192.168.1.1&quot;
             *             },
             *             &quot;operatorCode&quot;: &quot;equals&quot;,
             *             &quot;operatorName&quot;: &quot;等于&quot;
             *         }
             *     ]
             * },
             * &quot;elseIfStatement&quot;: [
             * 
             * ]
             * </code></pre>
             * <p>}</p>
             */
            public Builder ruleBody(String ruleBody) {
                this.ruleBody = ruleBody;
                return this;
            }

            /**
             * <p>Policy expressions. Returned when the policy type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;expressionName&quot;:&quot;设备token不为空&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;deviceToken&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;operatorName&quot;:&quot;不为空&quot;}]</p>
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101793</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>返回设备信息</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Policy status.</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>Rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>DSL</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Primary key ID of the rule version.</p>
             * 
             * <strong>example:</strong>
             * <p>11519</p>
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            /**
             * <p>User UID.</p>
             * 
             * <strong>example:</strong>
             * <p>151222xxxxxxxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public NewRule build() {
                return new NewRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CompareRuleResponseBody</p>
     */
    public static class OldRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auditId")
        private Long auditId;

        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("consoleRuleId")
        private Long consoleRuleId;

        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("logicExpression")
        private String logicExpression;

        @com.aliyun.core.annotation.NameInMap("mainEventCode")
        private String mainEventCode;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActionMap")
        private java.util.Map<String, ?> ruleActionMap;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

        @com.aliyun.core.annotation.NameInMap("ruleAuthType")
        private String ruleAuthType;

        @com.aliyun.core.annotation.NameInMap("ruleBody")
        private String ruleBody;

        @com.aliyun.core.annotation.NameInMap("ruleExpressions")
        private String ruleExpressions;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ruleVersionId")
        private Long ruleVersionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private OldRule(Builder builder) {
            this.auditId = builder.auditId;
            this.authType = builder.authType;
            this.consoleRuleId = builder.consoleRuleId;
            this.createType = builder.createType;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.mainEventCode = builder.mainEventCode;
            this.memo = builder.memo;
            this.ruleActionMap = builder.ruleActionMap;
            this.ruleActions = builder.ruleActions;
            this.ruleAuthType = builder.ruleAuthType;
            this.ruleBody = builder.ruleBody;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
            this.ruleVersionId = builder.ruleVersionId;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OldRule create() {
            return builder().build();
        }

        /**
         * @return auditId
         */
        public Long getAuditId() {
            return this.auditId;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return logicExpression
         */
        public String getLogicExpression() {
            return this.logicExpression;
        }

        /**
         * @return mainEventCode
         */
        public String getMainEventCode() {
            return this.mainEventCode;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleActionMap
         */
        public java.util.Map<String, ?> getRuleActionMap() {
            return this.ruleActionMap;
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
         * @return ruleBody
         */
        public String getRuleBody() {
            return this.ruleBody;
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

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return ruleVersionId
         */
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long auditId; 
            private String authType; 
            private Long consoleRuleId; 
            private String createType; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String mainEventCode; 
            private String memo; 
            private java.util.Map<String, ?> ruleActionMap; 
            private String ruleActions; 
            private String ruleAuthType; 
            private String ruleBody; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private String ruleType; 
            private Long ruleVersionId; 
            private Long userId; 
            private Long version; 

            private Builder() {
            } 

            private Builder(OldRule model) {
                this.auditId = model.auditId;
                this.authType = model.authType;
                this.consoleRuleId = model.consoleRuleId;
                this.createType = model.createType;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.logicExpression = model.logicExpression;
                this.mainEventCode = model.mainEventCode;
                this.memo = model.memo;
                this.ruleActionMap = model.ruleActionMap;
                this.ruleActions = model.ruleActions;
                this.ruleAuthType = model.ruleAuthType;
                this.ruleBody = model.ruleBody;
                this.ruleExpressions = model.ruleExpressions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
                this.ruleVersionId = model.ruleVersionId;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * <p>Audit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>257</p>
             */
            public Builder auditId(Long auditId) {
                this.auditId = auditId;
                return this;
            }

            /**
             * <p>Authorization type.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Primary key ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>6760</p>
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
                return this;
            }

            /**
             * <p>Creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>Event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_asssce8122</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册_事件</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1760670462000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1760670462000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Execution logic of the policy expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1&amp;2</p>
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * <p>Main event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_asssce8122</p>
             */
            public Builder mainEventCode(String mainEventCode) {
                this.mainEventCode = mainEventCode;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>鸿蒙元服务_交费业务</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Returned rule action structure. Returned when the policy type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;TAG&quot;: &quot;[{&quot;code&quot;:&quot;addDeTags&quot;,&quot;inputs&quot;:[&quot;test&quot;],&quot;description&quot;:&quot;打标签&quot;,&quot;type&quot;:&quot;ACTION&quot;,&quot;title&quot;:&quot;打标签&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;displayType&quot;:&quot;ACTION&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;fieldType&quot;:&quot;STRING&quot;}]&quot;
             * }</p>
             */
            public Builder ruleActionMap(java.util.Map<String, ?> ruleActionMap) {
                this.ruleActionMap = ruleActionMap;
                return this;
            }

            /**
             * <p>Policy execution output actions. Returned when the policy type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;actionType&quot;: &quot;TAG&quot;,
             *         &quot;code&quot;: &quot;addDeTags&quot;,
             *         &quot;description&quot;: &quot;打标签&quot;,
             *         &quot;displayType&quot;: &quot;ACTION&quot;,
             *         &quot;fieldType&quot;: &quot;STRING&quot;,
             *         &quot;inputs&quot;: [
             *             &quot;test&quot;
             *         ],
             *         &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
             *         &quot;sourceType&quot;: &quot;SAF&quot;,
             *         &quot;title&quot;: &quot;打标签&quot;,
             *         &quot;type&quot;: &quot;ACTION&quot;
             *     }
             * ]</p>
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>Policy authorization type.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder ruleAuthType(String ruleAuthType) {
                this.ruleAuthType = ruleAuthType;
                return this;
            }

            /**
             * <p>DSL policy execution logic. Returned when the policy type is DSL.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;elseStatement&quot;: {</p>
             * <pre><code>},
             * &quot;ifStatement&quot;: {
             *     &quot;condition&quot;: {
             *         &quot;currentId&quot;: 0,
             *         &quot;deepCount&quot;: 1,
             *         &quot;list&quot;: [
             *             {
             *                 &quot;sequence&quot;: 1,
             *                 &quot;left&quot;: {
             *                     &quot;displayType&quot;: &quot;NATIVE&quot;,
             *                     &quot;code&quot;: &quot;ip&quot;,
             *                     &quot;functionCode&quot;: &quot;&quot;,
             *                     &quot;functionName&quot;: &quot;&quot;,
             *                     &quot;name&quot;: &quot;ip&quot;,
             *                     &quot;description&quot;: &quot;IP地址&quot;,
             *                     &quot;hasRightVariable&quot;: true,
             *                     &quot;title&quot;: &quot;IP地址&quot;,
             *                     &quot;type&quot;: &quot;NATIVE&quot;,
             *                     &quot;fieldType&quot;: &quot;STRING&quot;
             *                 },
             *                 &quot;currentId&quot;: 0,
             *                 &quot;deepCount&quot;: 1,
             *                 &quot;right&quot;: {
             *                     &quot;name&quot;: &quot;192.168.1.1&quot;,
             *                     &quot;rightVariableType&quot;: &quot;constant&quot;
             *                 },
             *                 &quot;operatorCode&quot;: &quot;equals&quot;,
             *                 &quot;operatorName&quot;: &quot;等于&quot;,
             *                 &quot;parentId&quot;: 0
             *             }
             *         ],
             *         &quot;relationship&quot;: &quot;and&quot;,
             *         &quot;parentId&quot;: 0
             *     },
             *     &quot;then&quot;: [
             *         {
             *             &quot;actionType&quot;: &quot;TAG&quot;,
             *             &quot;displayType&quot;: &quot;ACTION&quot;,
             *             &quot;code&quot;: &quot;addDeTags&quot;,
             *             &quot;sourceType&quot;: &quot;SAF&quot;,
             *             &quot;inputs&quot;: [
             *                 &quot;10&quot;
             *             ],
             *             &quot;name&quot;: &quot;__addDeTags__&quot;,
             *             &quot;description&quot;: &quot;打标签&quot;,
             *             &quot;outputType&quot;: &quot;const&quot;,
             *             &quot;title&quot;: &quot;打标签&quot;,
             *             &quot;type&quot;: &quot;ACTION&quot;,
             *             &quot;fieldType&quot;: &quot;STRING&quot;
             *         }
             *     ],
             *     &quot;expressions&quot;: [
             *         {
             *             &quot;itemId&quot;: 1,
             *             &quot;left&quot;: {
             *                 &quot;displayType&quot;: &quot;NATIVE&quot;,
             *                 &quot;code&quot;: &quot;ip&quot;,
             *                 &quot;functionCode&quot;: &quot;&quot;,
             *                 &quot;functionName&quot;: &quot;&quot;,
             *                 &quot;name&quot;: &quot;ip&quot;,
             *                 &quot;description&quot;: &quot;IP地址&quot;,
             *                 &quot;hasRightVariable&quot;: true,
             *                 &quot;title&quot;: &quot;IP地址&quot;,
             *                 &quot;type&quot;: &quot;NATIVE&quot;,
             *                 &quot;fieldType&quot;: &quot;STRING&quot;
             *             },
             *             &quot;expressionName&quot;: &quot;IP地址 等于 192.168.1.1&quot;,
             *             &quot;rightValue&quot;: &quot;192.168.1.1&quot;,
             *             &quot;right&quot;: {
             *                 &quot;name&quot;: &quot;192.168.1.1&quot;,
             *                 &quot;fieldValue&quot;: &quot;192.168.1.1&quot;
             *             },
             *             &quot;operatorCode&quot;: &quot;equals&quot;,
             *             &quot;operatorName&quot;: &quot;等于&quot;
             *         }
             *     ]
             * },
             * &quot;elseIfStatement&quot;: [
             * 
             * ]
             * </code></pre>
             * <p>}</p>
             */
            public Builder ruleBody(String ruleBody) {
                this.ruleBody = ruleBody;
                return this;
            }

            /**
             * <p>Policy expression. Returned when the policy type is DEFAULT.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;expressionName&quot;:&quot;设备token不为空&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;deviceToken&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;operatorName&quot;:&quot;不为空&quot;}]</p>
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * <p>Policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101793</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>返回设备信息</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Policy status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>Policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>DSL</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Primary key ID of the policy version.</p>
             * 
             * <strong>example:</strong>
             * <p>11518</p>
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            /**
             * <p>User UID.</p>
             * 
             * <strong>example:</strong>
             * <p>151222xxxxxxxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public OldRule build() {
                return new OldRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CompareRuleResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("newRule")
        private NewRule newRule;

        @com.aliyun.core.annotation.NameInMap("oldRule")
        private OldRule oldRule;

        private ResultObject(Builder builder) {
            this.newRule = builder.newRule;
            this.oldRule = builder.oldRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return newRule
         */
        public NewRule getNewRule() {
            return this.newRule;
        }

        /**
         * @return oldRule
         */
        public OldRule getOldRule() {
            return this.oldRule;
        }

        public static final class Builder {
            private NewRule newRule; 
            private OldRule oldRule; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.newRule = model.newRule;
                this.oldRule = model.oldRule;
            } 

            /**
             * <p>New policy object.</p>
             */
            public Builder newRule(NewRule newRule) {
                this.newRule = newRule;
                return this;
            }

            /**
             * <p>Old policy object.</p>
             */
            public Builder oldRule(OldRule oldRule) {
                this.oldRule = oldRule;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
