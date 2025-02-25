// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleDetailByRuleIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleDetailByRuleIdResponseBody</p>
 */
public class DescribeRuleDetailByRuleIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeRuleDetailByRuleIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleDetailByRuleIdResponseBody create() {
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

        public DescribeRuleDetailByRuleIdResponseBody build() {
            return new DescribeRuleDetailByRuleIdResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizVersion")
        private String bizVersion;

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

        @com.aliyun.core.annotation.NameInMap("mainEventCode")
        private String mainEventCode;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActionMap")
        private java.util.Map < String, ? > ruleActionMap;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

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

        private ResultObject(Builder builder) {
            this.bizVersion = builder.bizVersion;
            this.consoleRuleId = builder.consoleRuleId;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.mainEventCode = builder.mainEventCode;
            this.memo = builder.memo;
            this.ruleActionMap = builder.ruleActionMap;
            this.ruleActions = builder.ruleActions;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleVersionId = builder.ruleVersionId;
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
        public String getBizVersion() {
            return this.bizVersion;
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
        public java.util.Map < String, ? > getRuleActionMap() {
            return this.ruleActionMap;
        }

        /**
         * @return ruleActions
         */
        public String getRuleActions() {
            return this.ruleActions;
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

        public static final class Builder {
            private String bizVersion; 
            private Long consoleRuleId; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String mainEventCode; 
            private String memo; 
            private java.util.Map < String, ? > ruleActionMap; 
            private String ruleActions; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private Long ruleVersionId; 

            /**
             * bizVersion.
             */
            public Builder bizVersion(String bizVersion) {
                this.bizVersion = bizVersion;
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
             * mainEventCode.
             */
            public Builder mainEventCode(String mainEventCode) {
                this.mainEventCode = mainEventCode;
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
             * ruleActionMap.
             */
            public Builder ruleActionMap(java.util.Map < String, ? > ruleActionMap) {
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

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
