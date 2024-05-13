// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobDetailResponseBody</p>
 */
public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBTaskSQLJobDetailList")
    private java.util.List < DBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDBTaskSQLJobDetailResponseBody(Builder builder) {
        this.DBTaskSQLJobDetailList = builder.DBTaskSQLJobDetailList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDBTaskSQLJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBTaskSQLJobDetailList
     */
    public java.util.List < DBTaskSQLJobDetailList> getDBTaskSQLJobDetailList() {
        return this.DBTaskSQLJobDetailList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DBTaskSQLJobDetailList> DBTaskSQLJobDetailList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The details of SQL tasks.
         */
        public Builder DBTaskSQLJobDetailList(java.util.List < DBTaskSQLJobDetailList> DBTaskSQLJobDetailList) {
            this.DBTaskSQLJobDetailList = DBTaskSQLJobDetailList;
            return this;
        }

        /**
         * The error code that is returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message that is returned.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of SQL tasks.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDBTaskSQLJobDetailResponseBody build() {
            return new ListDBTaskSQLJobDetailResponseBody(this);
        } 

    } 

    public static class DBTaskSQLJobDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("CurrentSql")
        private String currentSql;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteCount")
        private Long executeCount;

        @com.aliyun.core.annotation.NameInMap("JobDetailId")
        private Long jobDetailId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeDelay")
        private Long timeDelay;

        private DBTaskSQLJobDetailList(Builder builder) {
            this.affectRows = builder.affectRows;
            this.currentSql = builder.currentSql;
            this.dbId = builder.dbId;
            this.endTime = builder.endTime;
            this.executeCount = builder.executeCount;
            this.jobDetailId = builder.jobDetailId;
            this.jobId = builder.jobId;
            this.log = builder.log;
            this.logic = builder.logic;
            this.skip = builder.skip;
            this.sqlType = builder.sqlType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.timeDelay = builder.timeDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTaskSQLJobDetailList create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return currentSql
         */
        public String getCurrentSql() {
            return this.currentSql;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeCount
         */
        public Long getExecuteCount() {
            return this.executeCount;
        }

        /**
         * @return jobDetailId
         */
        public Long getJobDetailId() {
            return this.jobDetailId;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeDelay
         */
        public Long getTimeDelay() {
            return this.timeDelay;
        }

        public static final class Builder {
            private Long affectRows; 
            private String currentSql; 
            private Long dbId; 
            private String endTime; 
            private Long executeCount; 
            private Long jobDetailId; 
            private Long jobId; 
            private String log; 
            private Boolean logic; 
            private Boolean skip; 
            private String sqlType; 
            private String startTime; 
            private String status; 
            private Long timeDelay; 

            /**
             * The number of rows affected by the SQL task.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * The SQL statement that was executed in the SQL task.
             */
            public Builder currentSql(String currentSql) {
                this.currentSql = currentSql;
                return this;
            }

            /**
             * The ID of the physical database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The point in time when the SQL task ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of times that the SQL statement was executed.
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * The ID of the details of the SQL task.
             */
            public Builder jobDetailId(Long jobDetailId) {
                this.jobDetailId = jobDetailId;
                return this;
            }

            /**
             * The ID of the SQL task.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The details of the operational log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is a physical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * Indicates whether the SQL statement was skipped. Valid values:
             * <p>
             * 
             * *   **true**: The SQL statement was skipped.
             * *   **false**: The SQL statement was not skipped.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The point in time when the SQL task started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the SQL task. Valid values:
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
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The duration of the SQL task. Unit: milliseconds.
             */
            public Builder timeDelay(Long timeDelay) {
                this.timeDelay = timeDelay;
                return this;
            }

            public DBTaskSQLJobDetailList build() {
                return new DBTaskSQLJobDetailList(this);
            } 

        } 

    }
}
