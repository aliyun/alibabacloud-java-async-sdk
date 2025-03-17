// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetStructSyncJobDetailResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.structSyncJobDetail = model.structSyncJobDetail;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48602B78-0DDF-414C-8688-70CAB6070115</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the schema synchronization task.</p>
         */
        public Builder structSyncJobDetail(StructSyncJobDetail structSyncJobDetail) {
            this.structSyncJobDetail = structSyncJobDetail;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncJobDetailResponseBody build() {
            return new GetStructSyncJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStructSyncJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncJobDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StructSyncJobDetail model) {
                this.DBTaskGroupId = model.DBTaskGroupId;
                this.executeCount = model.executeCount;
                this.jobStatus = model.jobStatus;
                this.message = model.message;
                this.securityRule = model.securityRule;
                this.sqlCount = model.sqlCount;
                this.tableAnalyzed = model.tableAnalyzed;
                this.tableCount = model.tableCount;
            } 

            /**
             * <p>The ID of the SQL task group.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * <p>The number of SQL statements that have been executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>NEW</strong>: The task was created.</li>
             * <li><strong>COMPARING</strong>: The schemas of tables were being compared.</li>
             * <li><strong>COMPARE_BREAK</strong>: The schema comparison was interrupted.</li>
             * <li><strong>COMPARE_FINISH</strong>: The comparison was finished.</li>
             * <li><strong>NOT_SCRIPTS</strong>: The comparison was finished but no executable script was available.</li>
             * <li><strong>SUBMITED_DBTASK</strong>: The task was submitted.</li>
             * <li><strong>DBTASK_SUCCESS</strong>: The task was complete.</li>
             * <li><strong>SUBMITED_WORKFLOW</strong>: The ticket was submitted.</li>
             * <li><strong>WORKFLOW_SUCCESS</strong>: The ticket was approved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DBTASK_SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The type of security rule. Valid values:</p>
             * <ul>
             * <li><strong>CANNOT_SYNC</strong>: Synchronization cannot be performed.</li>
             * <li><strong>WITH_APPROVE</strong>: The schema synchronization can be performed after the ticket is approved. You can call the <a href="https://help.aliyun.com/document_detail/206166.html">SubmitStructSyncOrderApproval</a> operation to submit the ticket for approval.</li>
             * <li><strong>WITHOUT_APPROVE</strong>: The schema synchronization can be performed without approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WITHOUT_APPROVE</p>
             */
            public Builder securityRule(String securityRule) {
                this.securityRule = securityRule;
                return this;
            }

            /**
             * <p>The total number of SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * <p>The number of tables that have been analyzed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tableAnalyzed(Long tableAnalyzed) {
                this.tableAnalyzed = tableAnalyzed;
                return this;
            }

            /**
             * <p>The total number of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
