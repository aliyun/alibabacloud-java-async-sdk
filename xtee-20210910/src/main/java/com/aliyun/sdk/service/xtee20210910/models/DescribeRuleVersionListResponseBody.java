// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleVersionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleVersionListResponseBody</p>
 */
public class DescribeRuleVersionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeRuleVersionListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleVersionListResponseBody create() {
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
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeRuleVersionListResponseBody build() {
            return new DescribeRuleVersionListResponseBody(this);
        } 

    } 

    public static class ConsoleAudit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applyUserId")
        private String applyUserId;

        @com.aliyun.core.annotation.NameInMap("applyUserName")
        private String applyUserName;

        @com.aliyun.core.annotation.NameInMap("auditMsg")
        private String auditMsg;

        @com.aliyun.core.annotation.NameInMap("auditRealUserId")
        private String auditRealUserId;

        @com.aliyun.core.annotation.NameInMap("auditRealUserName")
        private String auditRealUserName;

        @com.aliyun.core.annotation.NameInMap("auditRemark")
        private String auditRemark;

        @com.aliyun.core.annotation.NameInMap("auditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("auditTime")
        private Long auditTime;

        @com.aliyun.core.annotation.NameInMap("auditUserId")
        private String auditUserId;

        @com.aliyun.core.annotation.NameInMap("auditUserName")
        private String auditUserName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("relationExt")
        private String relationExt;

        @com.aliyun.core.annotation.NameInMap("relationId")
        private Long relationId;

        @com.aliyun.core.annotation.NameInMap("relationName")
        private String relationName;

        @com.aliyun.core.annotation.NameInMap("relationType")
        private String relationType;

        private ConsoleAudit(Builder builder) {
            this.applyUserId = builder.applyUserId;
            this.applyUserName = builder.applyUserName;
            this.auditMsg = builder.auditMsg;
            this.auditRealUserId = builder.auditRealUserId;
            this.auditRealUserName = builder.auditRealUserName;
            this.auditRemark = builder.auditRemark;
            this.auditStatus = builder.auditStatus;
            this.auditTime = builder.auditTime;
            this.auditUserId = builder.auditUserId;
            this.auditUserName = builder.auditUserName;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.relationExt = builder.relationExt;
            this.relationId = builder.relationId;
            this.relationName = builder.relationName;
            this.relationType = builder.relationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsoleAudit create() {
            return builder().build();
        }

        /**
         * @return applyUserId
         */
        public String getApplyUserId() {
            return this.applyUserId;
        }

        /**
         * @return applyUserName
         */
        public String getApplyUserName() {
            return this.applyUserName;
        }

        /**
         * @return auditMsg
         */
        public String getAuditMsg() {
            return this.auditMsg;
        }

        /**
         * @return auditRealUserId
         */
        public String getAuditRealUserId() {
            return this.auditRealUserId;
        }

        /**
         * @return auditRealUserName
         */
        public String getAuditRealUserName() {
            return this.auditRealUserName;
        }

        /**
         * @return auditRemark
         */
        public String getAuditRemark() {
            return this.auditRemark;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return auditTime
         */
        public Long getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return auditUserId
         */
        public String getAuditUserId() {
            return this.auditUserId;
        }

        /**
         * @return auditUserName
         */
        public String getAuditUserName() {
            return this.auditUserName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return relationExt
         */
        public String getRelationExt() {
            return this.relationExt;
        }

        /**
         * @return relationId
         */
        public Long getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationName
         */
        public String getRelationName() {
            return this.relationName;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        public static final class Builder {
            private String applyUserId; 
            private String applyUserName; 
            private String auditMsg; 
            private String auditRealUserId; 
            private String auditRealUserName; 
            private String auditRemark; 
            private String auditStatus; 
            private Long auditTime; 
            private String auditUserId; 
            private String auditUserName; 
            private Long gmtCreate; 
            private Long id; 
            private String relationExt; 
            private Long relationId; 
            private String relationName; 
            private String relationType; 

            /**
             * applyUserId.
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * applyUserName.
             */
            public Builder applyUserName(String applyUserName) {
                this.applyUserName = applyUserName;
                return this;
            }

            /**
             * auditMsg.
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * auditRealUserId.
             */
            public Builder auditRealUserId(String auditRealUserId) {
                this.auditRealUserId = auditRealUserId;
                return this;
            }

            /**
             * auditRealUserName.
             */
            public Builder auditRealUserName(String auditRealUserName) {
                this.auditRealUserName = auditRealUserName;
                return this;
            }

            /**
             * auditRemark.
             */
            public Builder auditRemark(String auditRemark) {
                this.auditRemark = auditRemark;
                return this;
            }

            /**
             * auditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * auditTime.
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * auditUserId.
             */
            public Builder auditUserId(String auditUserId) {
                this.auditUserId = auditUserId;
                return this;
            }

            /**
             * auditUserName.
             */
            public Builder auditUserName(String auditUserName) {
                this.auditUserName = auditUserName;
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * relationExt.
             */
            public Builder relationExt(String relationExt) {
                this.relationExt = relationExt;
                return this;
            }

            /**
             * relationId.
             */
            public Builder relationId(Long relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * relationName.
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            /**
             * relationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            public ConsoleAudit build() {
                return new ConsoleAudit(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consoleAudit")
        private ConsoleAudit consoleAudit;

        @com.aliyun.core.annotation.NameInMap("consoleRuleId")
        private Long consoleRuleId;

        @com.aliyun.core.annotation.NameInMap("consoleRuleMemo")
        private String consoleRuleMemo;

        @com.aliyun.core.annotation.NameInMap("consoleRuleName")
        private String consoleRuleName;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastOperator")
        private String lastOperator;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private ResultObject(Builder builder) {
            this.consoleAudit = builder.consoleAudit;
            this.consoleRuleId = builder.consoleRuleId;
            this.consoleRuleMemo = builder.consoleRuleMemo;
            this.consoleRuleName = builder.consoleRuleName;
            this.eventCode = builder.eventCode;
            this.eventType = builder.eventType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastOperator = builder.lastOperator;
            this.priority = builder.priority;
            this.ruleId = builder.ruleId;
            this.ruleStatus = builder.ruleStatus;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return consoleAudit
         */
        public ConsoleAudit getConsoleAudit() {
            return this.consoleAudit;
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        /**
         * @return consoleRuleMemo
         */
        public String getConsoleRuleMemo() {
            return this.consoleRuleMemo;
        }

        /**
         * @return consoleRuleName
         */
        public String getConsoleRuleName() {
            return this.consoleRuleName;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastOperator
         */
        public String getLastOperator() {
            return this.lastOperator;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private ConsoleAudit consoleAudit; 
            private Long consoleRuleId; 
            private String consoleRuleMemo; 
            private String consoleRuleName; 
            private String eventCode; 
            private String eventType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String lastOperator; 
            private Long priority; 
            private String ruleId; 
            private String ruleStatus; 
            private Long version; 

            /**
             * consoleAudit.
             */
            public Builder consoleAudit(ConsoleAudit consoleAudit) {
                this.consoleAudit = consoleAudit;
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
             * consoleRuleMemo.
             */
            public Builder consoleRuleMemo(String consoleRuleMemo) {
                this.consoleRuleMemo = consoleRuleMemo;
                return this;
            }

            /**
             * consoleRuleName.
             */
            public Builder consoleRuleName(String consoleRuleName) {
                this.consoleRuleName = consoleRuleName;
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
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastOperator.
             */
            public Builder lastOperator(String lastOperator) {
                this.lastOperator = lastOperator;
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
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
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
