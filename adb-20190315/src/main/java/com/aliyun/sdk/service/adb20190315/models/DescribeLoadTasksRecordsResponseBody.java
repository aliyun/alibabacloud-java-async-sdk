// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadTasksRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadTasksRecordsResponseBody</p>
 */
public class DescribeLoadTasksRecordsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("LoadTasksRecords")
    private java.util.List < LoadTasksRecords> loadTasksRecords;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeLoadTasksRecordsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.loadTasksRecords = builder.loadTasksRecords;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadTasksRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return loadTasksRecords
     */
    public java.util.List < LoadTasksRecords> getLoadTasksRecords() {
        return this.loadTasksRecords;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < LoadTasksRecords> loadTasksRecords; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The queried asynchronous import and export tasks.
         */
        public Builder loadTasksRecords(java.util.List < LoadTasksRecords> loadTasksRecords) {
            this.loadTasksRecords = loadTasksRecords;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadTasksRecordsResponseBody build() {
            return new DescribeLoadTasksRecordsResponseBody(this);
        } 

    } 

    public static class LoadTasksRecords extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("ProcessID")
        private String processID;

        @NameInMap("ProcessRows")
        private Long processRows;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("State")
        private String state;

        @NameInMap("UpdateTime")
        private String updateTime;

        private LoadTasksRecords(Builder builder) {
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.jobName = builder.jobName;
            this.processID = builder.processID;
            this.processRows = builder.processRows;
            this.sql = builder.sql;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadTasksRecords create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return processID
         */
        public String getProcessID() {
            return this.processID;
        }

        /**
         * @return processRows
         */
        public Long getProcessRows() {
            return this.processRows;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String DBName; 
            private String jobName; 
            private String processID; 
            private Long processRows; 
            private String sql; 
            private String state; 
            private String updateTime; 

            /**
             * The start time of the task. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ss.SSSZ* format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the database that is involved in the import or export task.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The process ID.
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * The number of rows that are processed in the asynchronous import or export task.
             */
            public Builder processRows(Long processRows) {
                this.processRows = processRows;
                return this;
            }

            /**
             * The SQL statement that is used in the asynchronous import or export task.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * The state of the task.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the task state was updated. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ss.SSSZ* format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public LoadTasksRecords build() {
                return new LoadTasksRecords(this);
            } 

        } 

    }
}
