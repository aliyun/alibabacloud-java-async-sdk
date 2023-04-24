// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDDLPublishRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDDLPublishRecordsResponseBody</p>
 */
public class ListDDLPublishRecordsResponseBody extends TeaModel {
    @NameInMap("DDLPublishRecordList")
    private java.util.List < DDLPublishRecordList> DDLPublishRecordList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The details of the publishing records.
         */
        public Builder DDLPublishRecordList(java.util.List < DDLPublishRecordList> DDLPublishRecordList) {
            this.DDLPublishRecordList = DDLPublishRecordList;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDDLPublishRecordsResponseBody build() {
            return new ListDDLPublishRecordsResponseBody(this);
        } 

    } 

    public static class PublishJobList extends TeaModel {
        @NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @NameInMap("ExecuteCount")
        private Long executeCount;

        @NameInMap("Scripts")
        private String scripts;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TaskJobStatus")
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
             * The ID of the SQL task group.
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * The number of SQL statements that are executed.
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * The script for data changes.
             */
            public Builder scripts(String scripts) {
                this.scripts = scripts;
                return this;
            }

            /**
             * The description of the state.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The name of the table after the change.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The state of the publishing task. Valid values:
             * <p>
             * 
             * *   **NONE**: The state of the task is unknown.
             * *   **SUCCESS**: The task is successful.
             * *   **FAIL**: The task fails.
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
    public static class PublishTaskInfoList extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("PlanTime")
        private String planTime;

        @NameInMap("PublishJobList")
        private java.util.List < PublishJobList> publishJobList;

        @NameInMap("PublishStrategy")
        private String publishStrategy;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TaskJobStatus")
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
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: the database is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The time to publish the ticket.
             */
            public Builder planTime(String planTime) {
                this.planTime = planTime;
                return this;
            }

            /**
             * The list of the publishing tasks.
             */
            public Builder publishJobList(java.util.List < PublishJobList> publishJobList) {
                this.publishJobList = publishJobList;
                return this;
            }

            /**
             * The publishing policy. Valid values:
             * <p>
             * 
             * *   **IMMEDIATELY**: immediately publishes the ticket.
             * *   **REGULARLY**: publishes the ticket at a scheduled time.
             */
            public Builder publishStrategy(String publishStrategy) {
                this.publishStrategy = publishStrategy;
                return this;
            }

            /**
             * The description of the state.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The state of the task.
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
    public static class DDLPublishRecordList extends TeaModel {
        @NameInMap("AuditExpireTime")
        private String auditExpireTime;

        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreatorId")
        private Long creatorId;

        @NameInMap("Finality")
        private Boolean finality;

        @NameInMap("FinalityReason")
        private String finalityReason;

        @NameInMap("PublishStatus")
        private String publishStatus;

        @NameInMap("PublishTaskInfoList")
        private java.util.List < PublishTaskInfoList> publishTaskInfoList;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("WorkflowInstanceId")
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
             * The time when the approval expires.
             */
            public Builder auditExpireTime(String auditExpireTime) {
                this.auditExpireTime = auditExpireTime;
                return this;
            }

            /**
             * The approval state of the ticket. Valid values:
             * <p>
             * 
             * *   **EXEMPT_PASS**: The ticket passes without approval.
             * *   **TO_AUDIT**: The ticket is pending for approval.
             * *   **CANCEL**: The ticket is canceled.
             * *   **SUCCESS**: The ticket is approved.
             * *   **FAIL**: The ticket fails to pass the approval.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * 发布备注
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The ID of the user who creates the ticket. You can obtain the user ID by calling the [GetUser](~~147098~~) operation and querying the value of the UserId parameter. The value is not the unique ID (UID) of the Alibaba Cloud account.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Indicates whether the approval is terminated. Valid values:
             * <p>
             * 
             * *   **true**: The approval is terminated.
             * *   **false**: The approval is not terminated.
             * 
             * > Multiple reasons can terminate the approval. For example, you withdraw the application or your ticket is not approved before the specified time.
             */
            public Builder finality(Boolean finality) {
                this.finality = finality;
                return this;
            }

            /**
             * The reason for the termination.
             */
            public Builder finalityReason(String finalityReason) {
                this.finalityReason = finalityReason;
                return this;
            }

            /**
             * The publishing state of the ticket. Valid values:
             * <p>
             * 
             * *   **START**: The ticket is created.
             * *   **ANALYZE**: The ticket is under analysis.
             * *   **AUDIT**: The ticket is under approval.
             * *   **DISPATCH**: A task is generated for the ticket.
             * *   **SUCCESS**: The task is successful.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * The list of publishing tasks.
             */
            public Builder publishTaskInfoList(java.util.List < PublishTaskInfoList> publishTaskInfoList) {
                this.publishTaskInfoList = publishTaskInfoList;
                return this;
            }

            /**
             * The risk level of the operation. Valid values:
             * <p>
             * 
             * *   **NONE_RISK**: The operation does not have risks.
             * *   **LOW_RISK**: The operation is at low risk.
             * *   **MIDDLE_RISK**: The operation is at medium risk.
             * *   **HIGH_RISK**: The operation is at high risk.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The description of the publishing state.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The ID of the approval process.
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
