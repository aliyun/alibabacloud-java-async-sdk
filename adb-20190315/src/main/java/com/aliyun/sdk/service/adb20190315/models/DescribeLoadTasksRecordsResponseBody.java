// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLoadTasksRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadTasksRecordsResponseBody</p>
 */
public class DescribeLoadTasksRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("LoadTasksRecords")
    private java.util.List < LoadTasksRecords> loadTasksRecords;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp2590j****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried asynchronous import and export tasks.</p>
         */
        public Builder loadTasksRecords(java.util.List < LoadTasksRecords> loadTasksRecords) {
            this.loadTasksRecords = loadTasksRecords;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C60B05DB-2B77-421A-98E9-92C20E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadTasksRecordsResponseBody build() {
            return new DescribeLoadTasksRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadTasksRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadTasksRecordsResponseBody</p>
     */
    public static class LoadTasksRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("ProcessID")
        private String processID;

        @com.aliyun.core.annotation.NameInMap("ProcessRows")
        private Long processRows;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The start time of the task. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ss.SSSZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-18 18:47:27.0</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the database that is involved in the import or export task.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2021051818472717201616624903453******</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2021051818472717201616624903453******</p>
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * <p>The number of rows that are processed in the asynchronous import or export task.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder processRows(Long processRows) {
                this.processRows = processRows;
                return this;
            }

            /**
             * <p>The SQL statement that is used in the asynchronous import or export task.</p>
             * 
             * <strong>example:</strong>
             * <p>insert overwrite into courses_external_table\nselect * from courses</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The state of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISH</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the task state was updated. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ss.SSSZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-18 18:47:31.0</p>
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
