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
 * {@link DescribeRuleVersionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleVersionListResponseBody</p>
 */
public class DescribeRuleVersionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeRuleVersionListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleVersionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeRuleVersionListResponseBody model) {
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRuleVersionListResponseBody build() {
            return new DescribeRuleVersionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleVersionListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleVersionListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConsoleAudit model) {
                this.applyUserId = model.applyUserId;
                this.applyUserName = model.applyUserName;
                this.auditMsg = model.auditMsg;
                this.auditRealUserId = model.auditRealUserId;
                this.auditRealUserName = model.auditRealUserName;
                this.auditRemark = model.auditRemark;
                this.auditStatus = model.auditStatus;
                this.auditTime = model.auditTime;
                this.auditUserId = model.auditUserId;
                this.auditUserName = model.auditUserName;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.relationExt = model.relationExt;
                this.relationId = model.relationId;
                this.relationName = model.relationName;
                this.relationType = model.relationType;
            } 

            /**
             * <p>Initiator UID</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * <p>Initiator name</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder applyUserName(String applyUserName) {
                this.applyUserName = applyUserName;
                return this;
            }

            /**
             * <p>Approval comment</p>
             * 
             * <strong>example:</strong>
             * <p>同意</p>
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * <p>Final approver UID</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder auditRealUserId(String auditRealUserId) {
                this.auditRealUserId = auditRealUserId;
                return this;
            }

            /**
             * <p>Final approver name</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder auditRealUserName(String auditRealUserName) {
                this.auditRealUserName = auditRealUserName;
                return this;
            }

            /**
             * <p>Approver&quot;s remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder auditRemark(String auditRemark) {
                this.auditRemark = auditRemark;
                return this;
            }

            /**
             * <p>Approval status</p>
             * 
             * <strong>example:</strong>
             * <p>AGREE</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>Approval time.</p>
             * 
             * <strong>example:</strong>
             * <p>1545726028000</p>
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * <p>Designated approver UID</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder auditUserId(String auditUserId) {
                this.auditUserId = auditUserId;
                return this;
            }

            /**
             * <p>Designated auditor&quot;s name</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder auditUserName(String auditUserName) {
                this.auditUserName = auditUserName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1545726028000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>1728</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Information of related others (in JSON format)</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder relationExt(String relationExt) {
                this.relationExt = relationExt;
                return this;
            }

            /**
             * <p>ID of the associated transaction</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder relationId(Long relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * <p>Name of the associated item</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            /**
             * <p>Type of approval (e.g., <code>rule</code> for policy approval)</p>
             * 
             * <strong>example:</strong>
             * <p>RULE</p>
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
    /**
     * 
     * {@link DescribeRuleVersionListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleVersionListResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

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
            this.ruleType = builder.ruleType;
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
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
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
            private String ruleType; 
            private Long version; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.consoleAudit = model.consoleAudit;
                this.consoleRuleId = model.consoleRuleId;
                this.consoleRuleMemo = model.consoleRuleMemo;
                this.consoleRuleName = model.consoleRuleName;
                this.eventCode = model.eventCode;
                this.eventType = model.eventType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lastOperator = model.lastOperator;
                this.priority = model.priority;
                this.ruleId = model.ruleId;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
                this.version = model.version;
            } 

            /**
             * <p>Audit object</p>
             */
            public Builder consoleAudit(ConsoleAudit consoleAudit) {
                this.consoleAudit = consoleAudit;
                return this;
            }

            /**
             * <p>Console rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6715</p>
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
                return this;
            }

            /**
             * <p>Associated policy remarks</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder consoleRuleMemo(String consoleRuleMemo) {
                this.consoleRuleMemo = consoleRuleMemo;
                return this;
            }

            /**
             * <p>Associated policy name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder consoleRuleName(String consoleRuleName) {
                this.consoleRuleName = consoleRuleName;
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
             * <p>Event type</p>
             * 
             * <strong>example:</strong>
             * <p>MAIN</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary key ID of the policy</p>
             * 
             * <strong>example:</strong>
             * <p>376773</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The user who last operated.</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder lastOperator(String lastOperator) {
                this.lastOperator = lastOperator;
                return this;
            }

            /**
             * <p>Policy priority, the higher the number, the higher the priority.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>102224</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Policy status</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>Rule Type</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Version number</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
