// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobDetailResponseBody</p>
 */
public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    @NameInMap("DBTaskSQLJobDetailList")
    private java.util.List < DBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * The point in time when the SQL task ended.
         */
        public Builder DBTaskSQLJobDetailList(java.util.List < DBTaskSQLJobDetailList> DBTaskSQLJobDetailList) {
            this.DBTaskSQLJobDetailList = DBTaskSQLJobDetailList;
            return this;
        }

        /**
         * The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the SQL task. You can call the [ListDBTaskSQLJob](~~207049~~) operation to query the SQL task ID.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListDBTaskSQLJobDetail**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The SQL statement that was executed in the SQL task.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("AffectRows")
        private Long affectRows;

        @NameInMap("CurrentSql")
        private String currentSql;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExecuteCount")
        private Long executeCount;

        @NameInMap("JobDetailId")
        private Long jobDetailId;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("Log")
        private String log;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeDelay")
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
             * AffectRows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * The duration of the SQL task. Unit: milliseconds.
             */
            public Builder currentSql(String currentSql) {
                this.currentSql = currentSql;
                return this;
            }

            /**
             * The number of entries to return on each page.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The point in time when the SQL task started.
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * The ID of the SQL task.
             */
            public Builder jobDetailId(Long jobDetailId) {
                this.jobDetailId = jobDetailId;
                return this;
            }

            /**
             * The number of the page to return.
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
             * The details of SQL tasks.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The error message that is returned.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The ID of the details of the SQL task.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates whether the SQL statement was skipped. Valid values:
             * <p>
             * 
             * *   **true**: The SQL statement was skipped.
             * *   **false**: The SQL statement was not skipped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TimeDelay.
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
