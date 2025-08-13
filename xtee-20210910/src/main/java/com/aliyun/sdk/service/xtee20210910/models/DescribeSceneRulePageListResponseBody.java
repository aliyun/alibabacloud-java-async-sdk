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
 * {@link DescribeSceneRulePageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneRulePageListResponseBody</p>
 */
public class DescribeSceneRulePageListResponseBody extends TeaModel {
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

    private DescribeSceneRulePageListResponseBody(Builder builder) {
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

    public static DescribeSceneRulePageListResponseBody create() {
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

        private Builder(DescribeSceneRulePageListResponseBody model) {
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
         * <p>Number of items per page in the returned results. Default value: 20, minimum value: 1, maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID, which is unique for each request, facilitating subsequent troubleshooting</p>
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
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSceneRulePageListResponseBody build() {
            return new DescribeSceneRulePageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneRulePageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneRulePageListResponseBody</p>
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
             * <p>Initiator account ID</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890999</p>
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * <p>Initiator account name</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder applyUserName(String applyUserName) {
                this.applyUserName = applyUserName;
                return this;
            }

            /**
             * <p>Approval comments</p>
             * 
             * <strong>example:</strong>
             * <p>同意</p>
             */
            public Builder auditMsg(String auditMsg) {
                this.auditMsg = auditMsg;
                return this;
            }

            /**
             * <p>Final approver ID</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder auditRealUserId(String auditRealUserId) {
                this.auditRealUserId = auditRealUserId;
                return this;
            }

            /**
             * <p>Approver account name</p>
             * 
             * <strong>example:</strong>
             * <p>王五</p>
             */
            public Builder auditRealUserName(String auditRealUserName) {
                this.auditRealUserName = auditRealUserName;
                return this;
            }

            /**
             * <p>Approval application remarks</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder auditRemark(String auditRemark) {
                this.auditRemark = auditRemark;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>AGREE</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>Approval time</p>
             * 
             * <strong>example:</strong>
             * <p>1545726028000</p>
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * <p>Designated auditor account IDs (comma-separated for multiple)</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder auditUserId(String auditUserId) {
                this.auditUserId = auditUserId;
                return this;
            }

            /**
             * <p>Designated auditor account names (comma-separated for multiple)</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder auditUserName(String auditUserName) {
                this.auditUserName = auditUserName;
                return this;
            }

            /**
             * <p>Creation time in UTC</p>
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
             * <p>Information about other related parties (in JSON format)</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder relationExt(String relationExt) {
                this.relationExt = relationExt;
                return this;
            }

            /**
             * <p>审批关联的事务ID</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder relationId(Long relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * <p>The name of the associated transaction (can be null)</p>
             * 
             * <strong>example:</strong>
             * <p>t</p>
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            /**
             * <p>审批的类型（如rule代表策略的审批）</p>
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
     * {@link DescribeSceneRulePageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneRulePageListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("consoleAudit")
        private ConsoleAudit consoleAudit;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("externalRuleName")
        private String externalRuleName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("mainRuleId")
        private String mainRuleId;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ruleAuthType")
        private String ruleAuthType;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleMemo")
        private String ruleMemo;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ruleVersionId")
        private Long ruleVersionId;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        private ResultObject(Builder builder) {
            this.authType = builder.authType;
            this.consoleAudit = builder.consoleAudit;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.externalRuleName = builder.externalRuleName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mainRuleId = builder.mainRuleId;
            this.priority = builder.priority;
            this.ruleAuthType = builder.ruleAuthType;
            this.ruleId = builder.ruleId;
            this.ruleMemo = builder.ruleMemo;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
            this.ruleVersionId = builder.ruleVersionId;
            this.templateId = builder.templateId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return consoleAudit
         */
        public ConsoleAudit getConsoleAudit() {
            return this.consoleAudit;
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
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return externalRuleName
         */
        public String getExternalRuleName() {
            return this.externalRuleName;
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
         * @return mainRuleId
         */
        public String getMainRuleId() {
            return this.mainRuleId;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return ruleAuthType
         */
        public String getRuleAuthType() {
            return this.ruleAuthType;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleMemo
         */
        public String getRuleMemo() {
            return this.ruleMemo;
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
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authType; 
            private ConsoleAudit consoleAudit; 
            private String eventCode; 
            private String eventName; 
            private String eventType; 
            private String externalRuleName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String mainRuleId; 
            private Long priority; 
            private String ruleAuthType; 
            private String ruleId; 
            private String ruleMemo; 
            private String ruleName; 
            private String ruleStatus; 
            private String ruleType; 
            private Long ruleVersionId; 
            private Long templateId; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.authType = model.authType;
                this.consoleAudit = model.consoleAudit;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.externalRuleName = model.externalRuleName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mainRuleId = model.mainRuleId;
                this.priority = model.priority;
                this.ruleAuthType = model.ruleAuthType;
                this.ruleId = model.ruleId;
                this.ruleMemo = model.ruleMemo;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
                this.ruleVersionId = model.ruleVersionId;
                this.templateId = model.templateId;
                this.version = model.version;
            } 

            /**
             * <p>Service authorization type</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Audit object</p>
             */
            public Builder consoleAudit(ConsoleAudit consoleAudit) {
                this.consoleAudit = consoleAudit;
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
             * <p>External rule name</p>
             * 
             * <strong>example:</strong>
             * <p>策略1</p>
             */
            public Builder externalRuleName(String externalRuleName) {
                this.externalRuleName = externalRuleName;
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
             * <p>Modification time</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary key ID of the rule</p>
             * 
             * <strong>example:</strong>
             * <p>497</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Main rule ID</p>
             * 
             * <strong>example:</strong>
             * <p>4399</p>
             */
            public Builder mainRuleId(String mainRuleId) {
                this.mainRuleId = mainRuleId;
                return this;
            }

            /**
             * <p>Strategy priority, where a higher number indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Rule Auth type</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTMER</p>
             */
            public Builder ruleAuthType(String ruleAuthType) {
                this.ruleAuthType = ruleAuthType;
                return this;
            }

            /**
             * <p>Strategy ID</p>
             * 
             * <strong>example:</strong>
             * <p>4730</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Strategy description</p>
             * 
             * <strong>example:</strong>
             * <p>描述信息</p>
             */
            public Builder ruleMemo(String ruleMemo) {
                this.ruleMemo = ruleMemo;
                return this;
            }

            /**
             * <p>Strategy name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Strategy status</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>Rule type</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>Primary key ID of the rule version</p>
             * 
             * <strong>example:</strong>
             * <p>3823</p>
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            /**
             * <p>Template ID</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Version number</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
