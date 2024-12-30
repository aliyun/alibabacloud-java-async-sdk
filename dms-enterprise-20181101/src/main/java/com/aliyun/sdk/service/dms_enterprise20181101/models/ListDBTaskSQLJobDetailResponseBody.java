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
 * {@link ListDBTaskSQLJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobDetailResponseBody</p>
 */
public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBTaskSQLJobDetailList")
    private java.util.List<DBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

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
    public java.util.List<DBTaskSQLJobDetailList> getDBTaskSQLJobDetailList() {
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
        private java.util.List<DBTaskSQLJobDetailList> DBTaskSQLJobDetailList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The details of SQL tasks.</p>
         */
        public Builder DBTaskSQLJobDetailList(java.util.List<DBTaskSQLJobDetailList> DBTaskSQLJobDetailList) {
            this.DBTaskSQLJobDetailList = DBTaskSQLJobDetailList;
            return this;
        }

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingJobId</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>JobId is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3F044E33-FE09-58F1-8C61-A0F612EC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDBTaskSQLJobDetailResponseBody build() {
            return new ListDBTaskSQLJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDBTaskSQLJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListDBTaskSQLJobDetailResponseBody</p>
     */
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
             * <p>The number of rows affected by the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The SQL statement that was executed in the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>update a set id = 1 where id  = 1;</p>
             */
            public Builder currentSql(String currentSql) {
                this.currentSql = currentSql;
                return this;
            }

            /**
             * <p>The ID of the physical database.</p>
             * 
             * <strong>example:</strong>
             * <p>1988****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The point in time when the SQL task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-16 00:00:01</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of times that the SQL statement was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * <p>The ID of the details of the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>24723****</p>
             */
            public Builder jobDetailId(Long jobDetailId) {
                this.jobDetailId = jobDetailId;
                return this;
            }

            /**
             * <p>The ID of the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1276****</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The details of the operational log.</p>
             * 
             * <strong>example:</strong>
             * <p>log_info</p>
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
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
             * <p>Indicates whether the SQL statement was skipped. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The SQL statement was skipped.</li>
             * <li><strong>false</strong>: The SQL statement was not skipped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_TABLE</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The point in time when the SQL task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-16 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the SQL task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The SQL task was initialized.</li>
             * <li><strong>PENDING</strong>: The SQL task waited to be run.</li>
             * <li><strong>BE_SCHEDULED</strong>: The SQL task waited to be scheduled.</li>
             * <li><strong>FAIL</strong>: The SQL task failed.</li>
             * <li><strong>SUCCESS</strong>: The SQL task was successful.</li>
             * <li><strong>PAUSE</strong>: The SQL task was paused.</li>
             * <li><strong>DELETE</strong>: The SQL task was deleted.</li>
             * <li><strong>RUNNING</strong>: The SQL task was being run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The duration of the SQL task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
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
