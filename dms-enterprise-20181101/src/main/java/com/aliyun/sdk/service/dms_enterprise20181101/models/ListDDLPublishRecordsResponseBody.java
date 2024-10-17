// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDDLPublishRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDDLPublishRecordsResponseBody</p>
 */
public class ListDDLPublishRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DDLPublishRecordList")
    private java.util.List < DDLPublishRecordList> DDLPublishRecordList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDDLPublishRecordsResponseBody(Builder builder) {
        this.DDLPublishRecordList = builder.DDLPublishRecordList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDDLPublishRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DDLPublishRecordList
     */
    public java.util.List < DDLPublishRecordList> getDDLPublishRecordList() {
        return this.DDLPublishRecordList;
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
        private java.util.List < DDLPublishRecordList> DDLPublishRecordList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the publishing records.</p>
         */
        public Builder DDLPublishRecordList(java.util.List < DDLPublishRecordList> DDLPublishRecordList) {
            this.DDLPublishRecordList = DDLPublishRecordList;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A1549FB0-D4B8-4140-919F-17322C1072B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDDLPublishRecordsResponseBody build() {
            return new ListDDLPublishRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDDLPublishRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDDLPublishRecordsResponseBody</p>
     */
    public static class PublishJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("ExecuteCount")
        private Long executeCount;

        @com.aliyun.core.annotation.NameInMap("Scripts")
        private String scripts;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TaskJobStatus")
        private String taskJobStatus;

        private PublishJobList(Builder builder) {
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.executeCount = builder.executeCount;
            this.scripts = builder.scripts;
            this.statusDesc = builder.statusDesc;
            this.tableName = builder.tableName;
            this.taskJobStatus = builder.taskJobStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishJobList create() {
            return builder().build();
        }

        /**
         * @return DBTaskGroupId
         */
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        /**
         * @return executeCount
         */
        public Long getExecuteCount() {
            return this.executeCount;
        }

        /**
         * @return scripts
         */
        public String getScripts() {
            return this.scripts;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return taskJobStatus
         */
        public String getTaskJobStatus() {
            return this.taskJobStatus;
        }

        public static final class Builder {
            private Long DBTaskGroupId; 
            private Long executeCount; 
            private String scripts; 
            private String statusDesc; 
            private String tableName; 
            private String taskJobStatus; 

            /**
             * <p>The ID of the SQL task group.</p>
             * 
             * <strong>example:</strong>
             * <p>423515</p>
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * <p>The number of SQL statements that are executed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * <p>The script for data changes.</p>
             * 
             * <strong>example:</strong>
             * <p>ALTER TABLE test_toolkit_rename_table_after_rename MODIFY COLUMN gmt_modified datetime NOT NULL</p>
             */
            public Builder scripts(String scripts) {
                this.scripts = scripts;
                return this;
            }

            /**
             * <p>The description of the state.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The name of the table after the change.</p>
             * 
             * <strong>example:</strong>
             * <p>test_toolkit_rename_table_after_rename</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The state of the publishing task. Valid values:</p>
             * <ul>
             * <li><strong>NONE</strong>: The state of the task is unknown.</li>
             * <li><strong>SUCCESS</strong>: The task is successful.</li>
             * <li><strong>FAIL</strong>: The task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder taskJobStatus(String taskJobStatus) {
                this.taskJobStatus = taskJobStatus;
                return this;
            }

            public PublishJobList build() {
                return new PublishJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDDLPublishRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDDLPublishRecordsResponseBody</p>
     */
    public static class PublishTaskInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("PlanTime")
        private String planTime;

        @com.aliyun.core.annotation.NameInMap("PublishJobList")
        private java.util.List < PublishJobList> publishJobList;

        @com.aliyun.core.annotation.NameInMap("PublishStrategy")
        private String publishStrategy;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TaskJobStatus")
        private String taskJobStatus;

        private PublishTaskInfoList(Builder builder) {
            this.dbId = builder.dbId;
            this.logic = builder.logic;
            this.planTime = builder.planTime;
            this.publishJobList = builder.publishJobList;
            this.publishStrategy = builder.publishStrategy;
            this.statusDesc = builder.statusDesc;
            this.taskJobStatus = builder.taskJobStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishTaskInfoList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return planTime
         */
        public String getPlanTime() {
            return this.planTime;
        }

        /**
         * @return publishJobList
         */
        public java.util.List < PublishJobList> getPublishJobList() {
            return this.publishJobList;
        }

        /**
         * @return publishStrategy
         */
        public String getPublishStrategy() {
            return this.publishStrategy;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return taskJobStatus
         */
        public String getTaskJobStatus() {
            return this.taskJobStatus;
        }

        public static final class Builder {
            private Long dbId; 
            private Boolean logic; 
            private String planTime; 
            private java.util.List < PublishJobList> publishJobList; 
            private String publishStrategy; 
            private String statusDesc; 
            private String taskJobStatus; 

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>4325</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: the database is not a logical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The time to publish the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-14 20:52:38</p>
             */
            public Builder planTime(String planTime) {
                this.planTime = planTime;
                return this;
            }

            /**
             * <p>The list of the publishing tasks.</p>
             */
            public Builder publishJobList(java.util.List < PublishJobList> publishJobList) {
                this.publishJobList = publishJobList;
                return this;
            }

            /**
             * <p>The publishing policy. Valid values:</p>
             * <ul>
             * <li><strong>IMMEDIATELY</strong>: immediately publishes the ticket.</li>
             * <li><strong>REGULARLY</strong>: publishes the ticket at a scheduled time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMMEDIATELY</p>
             */
            public Builder publishStrategy(String publishStrategy) {
                this.publishStrategy = publishStrategy;
                return this;
            }

            /**
             * <p>The description of the state.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The state of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder taskJobStatus(String taskJobStatus) {
                this.taskJobStatus = taskJobStatus;
                return this;
            }

            public PublishTaskInfoList build() {
                return new PublishTaskInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDDLPublishRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDDLPublishRecordsResponseBody</p>
     */
    public static class DDLPublishRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditExpireTime")
        private String auditExpireTime;

        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("Finality")
        private Boolean finality;

        @com.aliyun.core.annotation.NameInMap("FinalityReason")
        private String finalityReason;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTaskInfoList")
        private java.util.List < PublishTaskInfoList> publishTaskInfoList;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        private DDLPublishRecordList(Builder builder) {
            this.auditExpireTime = builder.auditExpireTime;
            this.auditStatus = builder.auditStatus;
            this.comment = builder.comment;
            this.creatorId = builder.creatorId;
            this.finality = builder.finality;
            this.finalityReason = builder.finalityReason;
            this.publishStatus = builder.publishStatus;
            this.publishTaskInfoList = builder.publishTaskInfoList;
            this.riskLevel = builder.riskLevel;
            this.statusDesc = builder.statusDesc;
            this.workflowInstanceId = builder.workflowInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDLPublishRecordList create() {
            return builder().build();
        }

        /**
         * @return auditExpireTime
         */
        public String getAuditExpireTime() {
            return this.auditExpireTime;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return finality
         */
        public Boolean getFinality() {
            return this.finality;
        }

        /**
         * @return finalityReason
         */
        public String getFinalityReason() {
            return this.finalityReason;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return publishTaskInfoList
         */
        public java.util.List < PublishTaskInfoList> getPublishTaskInfoList() {
            return this.publishTaskInfoList;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public static final class Builder {
            private String auditExpireTime; 
            private String auditStatus; 
            private String comment; 
            private Long creatorId; 
            private Boolean finality; 
            private String finalityReason; 
            private String publishStatus; 
            private java.util.List < PublishTaskInfoList> publishTaskInfoList; 
            private String riskLevel; 
            private String statusDesc; 
            private Long workflowInstanceId; 

            /**
             * <p>The time when the approval expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-14 20:52:38</p>
             */
            public Builder auditExpireTime(String auditExpireTime) {
                this.auditExpireTime = auditExpireTime;
                return this;
            }

            /**
             * <p>The approval state of the ticket. Valid values:</p>
             * <ul>
             * <li><strong>EXEMPT_PASS</strong>: The ticket passes without approval.</li>
             * <li><strong>TO_AUDIT</strong>: The ticket is pending for approval.</li>
             * <li><strong>CANCEL</strong>: The ticket is canceled.</li>
             * <li><strong>SUCCESS</strong>: The ticket is approved.</li>
             * <li><strong>FAIL</strong>: The ticket fails to pass the approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CANCEL</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>Release remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Release remarks</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the user who creates the ticket. You can obtain the user ID by calling the <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation and querying the value of the UserId parameter. The value is not the unique ID (UID) of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1423</p>
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Indicates whether the approval is terminated. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The approval is terminated.</li>
             * <li><strong>false</strong>: The approval is not terminated.</li>
             * </ul>
             * <blockquote>
             * <p>Multiple reasons can terminate the approval. For example, you withdraw the application or your ticket is not approved before the specified time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder finality(Boolean finality) {
                this.finality = finality;
                return this;
            }

            /**
             * <p>The reason for the termination.</p>
             * 
             * <strong>example:</strong>
             * <p>CANCEL</p>
             */
            public Builder finalityReason(String finalityReason) {
                this.finalityReason = finalityReason;
                return this;
            }

            /**
             * <p>The publishing state of the ticket. Valid values:</p>
             * <ul>
             * <li><strong>START</strong>: The ticket is created.</li>
             * <li><strong>ANALYZE</strong>: The ticket is under analysis.</li>
             * <li><strong>AUDIT</strong>: The ticket is under approval.</li>
             * <li><strong>DISPATCH</strong>: A task is generated for the ticket.</li>
             * <li><strong>SUCCESS</strong>: The task is successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIT</p>
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The list of publishing tasks.</p>
             */
            public Builder publishTaskInfoList(java.util.List < PublishTaskInfoList> publishTaskInfoList) {
                this.publishTaskInfoList = publishTaskInfoList;
                return this;
            }

            /**
             * <p>The risk level of the operation. Valid values:</p>
             * <ul>
             * <li><strong>NONE_RISK</strong>: The operation does not have risks.</li>
             * <li><strong>LOW_RISK</strong>: The operation is at low risk.</li>
             * <li><strong>MIDDLE_RISK</strong>: The operation is at medium risk.</li>
             * <li><strong>HIGH_RISK</strong>: The operation is at high risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LOW_RISK</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The description of the publishing state.</p>
             * 
             * <strong>example:</strong>
             * <p>CANCEL</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The ID of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>432153</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            public DDLPublishRecordList build() {
                return new DDLPublishRecordList(this);
            } 

        } 

    }
}
