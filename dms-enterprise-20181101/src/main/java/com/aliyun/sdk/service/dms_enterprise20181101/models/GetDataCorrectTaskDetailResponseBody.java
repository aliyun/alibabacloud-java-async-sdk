// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectTaskDetailResponseBody</p>
 */
public class GetDataCorrectTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCorrectTaskDetail")
    private DataCorrectTaskDetail dataCorrectTaskDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataCorrectTaskDetailResponseBody(Builder builder) {
        this.dataCorrectTaskDetail = builder.dataCorrectTaskDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCorrectTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCorrectTaskDetail
     */
    public DataCorrectTaskDetail getDataCorrectTaskDetail() {
        return this.dataCorrectTaskDetail;
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
        private DataCorrectTaskDetail dataCorrectTaskDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the data change task.
         */
        public Builder dataCorrectTaskDetail(DataCorrectTaskDetail dataCorrectTaskDetail) {
            this.dataCorrectTaskDetail = dataCorrectTaskDetail;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCorrectTaskDetailResponseBody build() {
            return new GetDataCorrectTaskDetailResponseBody(this);
        } 

    } 

    public static class DataCorrectTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
        private String jobStatus;

        private DataCorrectTaskDetail(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.createTime = builder.createTime;
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.jobStatus = builder.jobStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCorrectTaskDetail create() {
            return builder().build();
        }

        /**
         * @return actualAffectRows
         */
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBTaskGroupId
         */
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        public static final class Builder {
            private Long actualAffectRows; 
            private String createTime; 
            private Long DBTaskGroupId; 
            private String jobStatus; 

            /**
             * The number of rows affected by the SQL statement.
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the SQL task group.
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * The state of the SQL task. Valid values:
             * <p>
             * 
             * *   **INIT**: The SQL task was initialized.
             * *   **PENDING**: The SQL task waited to be run.
             * *   **BE_SCHEDULED**: The SQL task waited to be scheduled.
             * *   **FAIL**: The SQL task failed.
             * *   **SUCCESS**: The SQL task was successful.
             * *   **PAUSE**: The SQL task was paused.
             * *   **DELETE**: The SQL task was deleted.
             * *   **RUNNING**: The SQL task was being run.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            public DataCorrectTaskDetail build() {
                return new DataCorrectTaskDetail(this);
            } 

        } 

    }
}
