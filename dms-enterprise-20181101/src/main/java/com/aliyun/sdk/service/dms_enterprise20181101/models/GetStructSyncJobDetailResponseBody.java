// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobDetailResponseBody</p>
 */
public class GetStructSyncJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructSyncJobDetail")
    private StructSyncJobDetail structSyncJobDetail;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStructSyncJobDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.structSyncJobDetail = builder.structSyncJobDetail;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncJobDetailResponseBody create() {
        return builder().build();
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
     * @return structSyncJobDetail
     */
    public StructSyncJobDetail getStructSyncJobDetail() {
        return this.structSyncJobDetail;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private StructSyncJobDetail structSyncJobDetail; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the schema synchronization task.
         */
        public Builder structSyncJobDetail(StructSyncJobDetail structSyncJobDetail) {
            this.structSyncJobDetail = structSyncJobDetail;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncJobDetailResponseBody build() {
            return new GetStructSyncJobDetailResponseBody(this);
        } 

    } 

    public static class StructSyncJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("ExecuteCount")
        private Long executeCount;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SecurityRule")
        private String securityRule;

        @com.aliyun.core.annotation.NameInMap("SqlCount")
        private Long sqlCount;

        @com.aliyun.core.annotation.NameInMap("TableAnalyzed")
        private Long tableAnalyzed;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Long tableCount;

        private StructSyncJobDetail(Builder builder) {
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.executeCount = builder.executeCount;
            this.jobStatus = builder.jobStatus;
            this.message = builder.message;
            this.securityRule = builder.securityRule;
            this.sqlCount = builder.sqlCount;
            this.tableAnalyzed = builder.tableAnalyzed;
            this.tableCount = builder.tableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructSyncJobDetail create() {
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
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return securityRule
         */
        public String getSecurityRule() {
            return this.securityRule;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        /**
         * @return tableAnalyzed
         */
        public Long getTableAnalyzed() {
            return this.tableAnalyzed;
        }

        /**
         * @return tableCount
         */
        public Long getTableCount() {
            return this.tableCount;
        }

        public static final class Builder {
            private Long DBTaskGroupId; 
            private Long executeCount; 
            private String jobStatus; 
            private String message; 
            private String securityRule; 
            private Long sqlCount; 
            private Long tableAnalyzed; 
            private Long tableCount; 

            /**
             * The ID of the SQL task group.
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * The number of SQL statements that have been executed.
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **NEW**: The task was created.
             * *   **COMPARING**: The schemas of tables were being compared.
             * *   **COMPARE_BREAK**: The schema comparison was interrupted.
             * *   **COMPARE_FINISH**: The comparison was finished.
             * *   **NOT_SCRIPTS**: The comparison was finished but no executable script was available.
             * *   **SUBMITED_DBTASK**: The task was submitted.
             * *   **DBTASK_SUCCESS**: The task was complete.
             * *   **SUBMITED_WORKFLOW**: The ticket was submitted.
             * *   **WORKFLOW_SUCCESS**: The ticket was approved.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The description of the task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The type of security rule. Valid values:
             * <p>
             * 
             * *   **CANNOT_SYNC**: Synchronization cannot be performed.
             * *   **WITH_APPROVE**: The schema synchronization can be performed after the ticket is approved. You can call the [SubmitStructSyncOrderApproval](~~206166~~) operation to submit the ticket for approval.
             * *   **WITHOUT_APPROVE**: The schema synchronization can be performed without approval.
             */
            public Builder securityRule(String securityRule) {
                this.securityRule = securityRule;
                return this;
            }

            /**
             * The total number of SQL statements.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * The number of tables that have been analyzed.
             */
            public Builder tableAnalyzed(Long tableAnalyzed) {
                this.tableAnalyzed = tableAnalyzed;
                return this;
            }

            /**
             * The total number of tables.
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            public StructSyncJobDetail build() {
                return new StructSyncJobDetail(this);
            } 

        } 

    }
}
