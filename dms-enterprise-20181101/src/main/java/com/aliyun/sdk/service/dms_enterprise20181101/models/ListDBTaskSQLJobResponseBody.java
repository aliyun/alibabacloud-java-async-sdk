// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobResponseBody</p>
 */
public class ListDBTaskSQLJobResponseBody extends TeaModel {
    @NameInMap("DBTaskSQLJobList")
    private java.util.List < DBTaskSQLJobList> DBTaskSQLJobList;

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
    public java.util.List < DBTaskSQLJobList> getDBTaskSQLJobList() {
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
        private java.util.List < DBTaskSQLJobList> DBTaskSQLJobList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * DBTaskSQLJobList.
         */
        public Builder DBTaskSQLJobList(java.util.List < DBTaskSQLJobList> DBTaskSQLJobList) {
            this.DBTaskSQLJobList = DBTaskSQLJobList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

        public ListDBTaskSQLJobResponseBody build() {
            return new ListDBTaskSQLJobResponseBody(this);
        } 

    } 

    public static class DBTaskSQLJobList extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbSearchName")
        private String dbSearchName;

        @NameInMap("DbTaskGroupId")
        private Long dbTaskGroupId;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("LastExecTime")
        private String lastExecTime;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("Status")
        private String status;

        @NameInMap("Transactional")
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbSearchName.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * DbTaskGroupId.
             */
            public Builder dbTaskGroupId(Long dbTaskGroupId) {
                this.dbTaskGroupId = dbTaskGroupId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * LastExecTime.
             */
            public Builder lastExecTime(String lastExecTime) {
                this.lastExecTime = lastExecTime;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Transactional.
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
