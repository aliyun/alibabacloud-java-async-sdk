// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuthRuleDetailByRuleIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthRuleDetailByRuleIdResponseBody</p>
 */
public class QueryAuthRuleDetailByRuleIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private QueryAuthRuleDetailByRuleIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthRuleDetailByRuleIdResponseBody create() {
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

        public QueryAuthRuleDetailByRuleIdResponseBody build() {
            return new QueryAuthRuleDetailByRuleIdResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auditId")
        private Long auditId;

        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("authUsers")
        private String authUsers;

        @com.aliyun.core.annotation.NameInMap("consoleRuleId")
        private Long consoleRuleId;

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

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ruleActionMap")
        private java.util.Map < String, String > ruleActionMap;

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

        @com.aliyun.core.annotation.NameInMap("ruleVersionId")
        private Long ruleVersionId;

        @com.aliyun.core.annotation.NameInMap("templateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private ResultObject(Builder builder) {
            this.auditId = builder.auditId;
            this.authType = builder.authType;
            this.authUsers = builder.authUsers;
            this.consoleRuleId = builder.consoleRuleId;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.memo = builder.memo;
            this.priority = builder.priority;
            this.ruleActionMap = builder.ruleActionMap;
            this.ruleActions = builder.ruleActions;
            this.ruleAuthType = builder.ruleAuthType;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleVersionId = builder.ruleVersionId;
            this.templateType = builder.templateType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
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
         * @return authUsers
         */
        public String getAuthUsers() {
            return this.authUsers;
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
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
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return ruleActionMap
         */
        public java.util.Map < String, String > getRuleActionMap() {
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
         * @return ruleVersionId
         */
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
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
            private String authUsers; 
            private Long consoleRuleId; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String memo; 
            private Long priority; 
            private java.util.Map < String, String > ruleActionMap; 
            private String ruleActions; 
            private String ruleAuthType; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private Long ruleVersionId; 
            private String templateType; 
            private Long version; 

            /**
             * auditId.
             */
            public Builder auditId(Long auditId) {
                this.auditId = auditId;
                return this;
            }

            /**
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * authUsers.
             */
            public Builder authUsers(String authUsers) {
                this.authUsers = authUsers;
                return this;
            }

            /**
             * consoleRuleId.
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
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
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

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
             * priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ruleActionMap.
             */
            public Builder ruleActionMap(java.util.Map < String, String > ruleActionMap) {
                this.ruleActionMap = ruleActionMap;
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

            /**
             * ruleVersionId.
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            /**
             * templateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
