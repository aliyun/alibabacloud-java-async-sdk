// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSlowSQLRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlowSQLRecordsResponseBody</p>
 */
public class ListSlowSQLRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListSlowSQLRecordsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowSQLRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListSlowSQLRecordsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>List of slow queries.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of log entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListSlowSQLRecordsResponseBody build() {
            return new ListSlowSQLRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSlowSQLRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSlowSQLRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuTimeMs")
        private Long cpuTimeMs;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DurationTime")
        private Integer durationTime;

        @com.aliyun.core.annotation.NameInMap("LockWaitTime")
        private Integer lockWaitTime;

        @com.aliyun.core.annotation.NameInMap("MemBytes")
        private Long memBytes;

        @com.aliyun.core.annotation.NameInMap("Optimizer")
        private String optimizer;

        @com.aliyun.core.annotation.NameInMap("QueryEndTime")
        private String queryEndTime;

        @com.aliyun.core.annotation.NameInMap("QueryID")
        private String queryID;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("QueueWaitTime")
        private Integer queueWaitTime;

        @com.aliyun.core.annotation.NameInMap("SpillBytes")
        private Long spillBytes;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("SqlTruncated")
        private String sqlTruncated;

        @com.aliyun.core.annotation.NameInMap("SqlTruncatedThreshold")
        private Integer sqlTruncatedThreshold;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.cpuTimeMs = builder.cpuTimeMs;
            this.DBName = builder.DBName;
            this.durationTime = builder.durationTime;
            this.lockWaitTime = builder.lockWaitTime;
            this.memBytes = builder.memBytes;
            this.optimizer = builder.optimizer;
            this.queryEndTime = builder.queryEndTime;
            this.queryID = builder.queryID;
            this.queryStartTime = builder.queryStartTime;
            this.queueWaitTime = builder.queueWaitTime;
            this.spillBytes = builder.spillBytes;
            this.sqlText = builder.sqlText;
            this.sqlTruncated = builder.sqlTruncated;
            this.sqlTruncatedThreshold = builder.sqlTruncatedThreshold;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cpuTimeMs
         */
        public Long getCpuTimeMs() {
            return this.cpuTimeMs;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return durationTime
         */
        public Integer getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return lockWaitTime
         */
        public Integer getLockWaitTime() {
            return this.lockWaitTime;
        }

        /**
         * @return memBytes
         */
        public Long getMemBytes() {
            return this.memBytes;
        }

        /**
         * @return optimizer
         */
        public String getOptimizer() {
            return this.optimizer;
        }

        /**
         * @return queryEndTime
         */
        public String getQueryEndTime() {
            return this.queryEndTime;
        }

        /**
         * @return queryID
         */
        public String getQueryID() {
            return this.queryID;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        /**
         * @return queueWaitTime
         */
        public Integer getQueueWaitTime() {
            return this.queueWaitTime;
        }

        /**
         * @return spillBytes
         */
        public Long getSpillBytes() {
            return this.spillBytes;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return sqlTruncated
         */
        public String getSqlTruncated() {
            return this.sqlTruncated;
        }

        /**
         * @return sqlTruncatedThreshold
         */
        public Integer getSqlTruncatedThreshold() {
            return this.sqlTruncatedThreshold;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long cpuTimeMs; 
            private String DBName; 
            private Integer durationTime; 
            private Integer lockWaitTime; 
            private Long memBytes; 
            private String optimizer; 
            private String queryEndTime; 
            private String queryID; 
            private String queryStartTime; 
            private Integer queueWaitTime; 
            private Long spillBytes; 
            private String sqlText; 
            private String sqlTruncated; 
            private Integer sqlTruncatedThreshold; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cpuTimeMs = model.cpuTimeMs;
                this.DBName = model.DBName;
                this.durationTime = model.durationTime;
                this.lockWaitTime = model.lockWaitTime;
                this.memBytes = model.memBytes;
                this.optimizer = model.optimizer;
                this.queryEndTime = model.queryEndTime;
                this.queryID = model.queryID;
                this.queryStartTime = model.queryStartTime;
                this.queueWaitTime = model.queueWaitTime;
                this.spillBytes = model.spillBytes;
                this.sqlText = model.sqlText;
                this.sqlTruncated = model.sqlTruncated;
                this.sqlTruncatedThreshold = model.sqlTruncatedThreshold;
                this.userName = model.userName;
            } 

            /**
             * <p>The total CPU time (in milliseconds) consumed by the query execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cpuTimeMs(Long cpuTimeMs) {
                this.cpuTimeMs = cpuTimeMs;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpgadmin</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>Total execution time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder durationTime(Integer durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * <p>The total lock wait time (in milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder lockWaitTime(Integer lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * <p>The total memory (in bytes) occupied by the query execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder memBytes(Long memBytes) {
                this.memBytes = memBytes;
                return this;
            }

            /**
             * <p>Execution optimizer.</p>
             * 
             * <strong>example:</strong>
             * <p>planner</p>
             */
            public Builder optimizer(String optimizer) {
                this.optimizer = optimizer;
                return this;
            }

            /**
             * <p>The end time of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-04T18:00:00Z</p>
             */
            public Builder queryEndTime(String queryEndTime) {
                this.queryEndTime = queryEndTime;
                return this;
            }

            /**
             * <p>The query ID. It is a unique identifier of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>7775338456746339025</p>
             */
            public Builder queryID(String queryID) {
                this.queryID = queryID;
                return this;
            }

            /**
             * <p>The start time of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-04T17:00:00Z</p>
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * <p>The query queueing time (in milliseconds) in resource groups/queues.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder queueWaitTime(Integer queueWaitTime) {
                this.queueWaitTime = queueWaitTime;
                return this;
            }

            /**
             * <p>The total size (in bytes) of the files generated by the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder spillBytes(Long spillBytes) {
                this.spillBytes = spillBytes;
                return this;
            }

            /**
             * <p>SQL statements in audit logs.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW COLUMNS FROM <code>t_project</code></p>
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * <p>Indicates whether the SQL statement is truncated. Valid values:</p>
             * <ul>
             * <li>true: Truncated.</li>
             * <li>false: Not truncated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sqlTruncated(String sqlTruncated) {
                this.sqlTruncated = sqlTruncated;
                return this;
            }

            /**
             * <p>The threshold that is used to truncate the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sqlTruncatedThreshold(Integer sqlTruncatedThreshold) {
                this.sqlTruncatedThreshold = sqlTruncatedThreshold;
                return this;
            }

            /**
             * <p>The account that initiates the query.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
