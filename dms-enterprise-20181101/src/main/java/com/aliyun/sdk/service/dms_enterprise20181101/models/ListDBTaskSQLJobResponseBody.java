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
 * {@link ListDBTaskSQLJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobResponseBody</p>
 */
public class ListDBTaskSQLJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBTaskSQLJobList")
    private java.util.List<DBTaskSQLJobList> DBTaskSQLJobList;

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

    private ListDBTaskSQLJobResponseBody(Builder builder) {
        this.DBTaskSQLJobList = builder.DBTaskSQLJobList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDBTaskSQLJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBTaskSQLJobList
     */
    public java.util.List<DBTaskSQLJobList> getDBTaskSQLJobList() {
        return this.DBTaskSQLJobList;
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
        private java.util.List<DBTaskSQLJobList> DBTaskSQLJobList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The list of the SQL tasks.</p>
         */
        public Builder DBTaskSQLJobList(java.util.List<DBTaskSQLJobList> DBTaskSQLJobList) {
            this.DBTaskSQLJobList = DBTaskSQLJobList;
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
         * <p>F6C47680-8D2D-43A4-8902-F2740D71A398</p>
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

        /**
         * <p>The total number of the SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDBTaskSQLJobResponseBody build() {
            return new ListDBTaskSQLJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDBTaskSQLJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListDBTaskSQLJobResponseBody</p>
     */
    public static class DBTaskSQLJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbSearchName")
        private String dbSearchName;

        @com.aliyun.core.annotation.NameInMap("DbTaskGroupId")
        private Long dbTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("LastExecTime")
        private String lastExecTime;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Transactional")
        private Boolean transactional;

        private DBTaskSQLJobList(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.dbSearchName = builder.dbSearchName;
            this.dbTaskGroupId = builder.dbTaskGroupId;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.lastExecTime = builder.lastExecTime;
            this.logic = builder.logic;
            this.status = builder.status;
            this.transactional = builder.transactional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTaskSQLJobList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbSearchName
         */
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        /**
         * @return dbTaskGroupId
         */
        public Long getDbTaskGroupId() {
            return this.dbTaskGroupId;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return lastExecTime
         */
        public String getLastExecTime() {
            return this.lastExecTime;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transactional
         */
        public Boolean getTransactional() {
            return this.transactional;
        }

        public static final class Builder {
            private String comment; 
            private String createTime; 
            private Long dbId; 
            private String dbSearchName; 
            private Long dbTaskGroupId; 
            private Long jobId; 
            private String jobType; 
            private String lastExecTime; 
            private Boolean logic; 
            private String status; 
            private Boolean transactional; 

            /**
             * <p>The description of the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the SQL task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18 17:49:20</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>43214523</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test@xxx:3306【test】</p>
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * <p>The ID of the SQL task group.</p>
             * 
             * <strong>example:</strong>
             * <p>4324132</p>
             */
            public Builder dbTaskGroupId(Long dbTaskGroupId) {
                this.dbTaskGroupId = dbTaskGroupId;
                return this;
            }

            /**
             * <p>The ID of the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>123435</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>STRUCT_SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The time when the SQL task was last executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18 17:49:31</p>
             */
            public Builder lastExecTime(String lastExecTime) {
                this.lastExecTime = lastExecTime;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a logical database.</li>
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
             * <p>The state of the SQL task. Valid values:</p>
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
             * <p>Indicates whether the SQL task is executed as a transaction. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The SQL task is executed as a transaction.</li>
             * <li><strong>false</strong>: The SQL task is not executed as a transaction.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder transactional(Boolean transactional) {
                this.transactional = transactional;
                return this;
            }

            public DBTaskSQLJobList build() {
                return new DBTaskSQLJobList(this);
            } 

        } 

    }
}
