// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogsResponseBody</p>
 */
public class DescribeSlowLogsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSlowLogsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.engine = builder.engine;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public Items getItems() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * The ID of cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end date of the query.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the database engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Details about slow query logs.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of SQL statements that are returned on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The start date of the query.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSlowLogsResponseBody build() {
            return new DescribeSlowLogsResponseBody(this);
        } 

    } 

    public static class SQLSlowLog extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @NameInMap("MaxLockTime")
        private Long maxLockTime;

        @NameInMap("ParseMaxRowCount")
        private Long parseMaxRowCount;

        @NameInMap("ParseTotalRowCounts")
        private Long parseTotalRowCounts;

        @NameInMap("ReturnMaxRowCount")
        private Long returnMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        private Long returnTotalRowCounts;

        @NameInMap("SQLHASH")
        private String SQLHASH;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("TotalExecutionCounts")
        private Long totalExecutionCounts;

        @NameInMap("TotalExecutionTimes")
        private Long totalExecutionTimes;

        @NameInMap("TotalLockTimes")
        private Long totalLockTimes;

        private SQLSlowLog(Builder builder) {
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.DBNodeId = builder.DBNodeId;
            this.maxExecutionTime = builder.maxExecutionTime;
            this.maxLockTime = builder.maxLockTime;
            this.parseMaxRowCount = builder.parseMaxRowCount;
            this.parseTotalRowCounts = builder.parseTotalRowCounts;
            this.returnMaxRowCount = builder.returnMaxRowCount;
            this.returnTotalRowCounts = builder.returnTotalRowCounts;
            this.SQLHASH = builder.SQLHASH;
            this.SQLText = builder.SQLText;
            this.totalExecutionCounts = builder.totalExecutionCounts;
            this.totalExecutionTimes = builder.totalExecutionTimes;
            this.totalLockTimes = builder.totalLockTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLSlowLog create() {
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
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return maxExecutionTime
         */
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        /**
         * @return maxLockTime
         */
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        /**
         * @return parseMaxRowCount
         */
        public Long getParseMaxRowCount() {
            return this.parseMaxRowCount;
        }

        /**
         * @return parseTotalRowCounts
         */
        public Long getParseTotalRowCounts() {
            return this.parseTotalRowCounts;
        }

        /**
         * @return returnMaxRowCount
         */
        public Long getReturnMaxRowCount() {
            return this.returnMaxRowCount;
        }

        /**
         * @return returnTotalRowCounts
         */
        public Long getReturnTotalRowCounts() {
            return this.returnTotalRowCounts;
        }

        /**
         * @return SQLHASH
         */
        public String getSQLHASH() {
            return this.SQLHASH;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return totalExecutionCounts
         */
        public Long getTotalExecutionCounts() {
            return this.totalExecutionCounts;
        }

        /**
         * @return totalExecutionTimes
         */
        public Long getTotalExecutionTimes() {
            return this.totalExecutionTimes;
        }

        /**
         * @return totalLockTimes
         */
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
        }

        public static final class Builder {
            private String createTime; 
            private String DBName; 
            private String DBNodeId; 
            private Long maxExecutionTime; 
            private Long maxLockTime; 
            private Long parseMaxRowCount; 
            private Long parseTotalRowCounts; 
            private Long returnMaxRowCount; 
            private Long returnTotalRowCounts; 
            private String SQLHASH; 
            private String SQLText; 
            private Long totalExecutionCounts; 
            private Long totalExecutionTimes; 
            private Long totalLockTimes; 

            /**
             * The date when the data was generated.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The longest execution duration of a specific SQL statement in the query. Unit: seconds.
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * The longest lock duration that was caused by a specific SQL statement in the query. Unit: seconds.
             */
            public Builder maxLockTime(Long maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * The largest number of rows that were parsed by a specific SQL statement in the query.
             */
            public Builder parseMaxRowCount(Long parseMaxRowCount) {
                this.parseMaxRowCount = parseMaxRowCount;
                return this;
            }

            /**
             * The total number of rows that were parsed by all SQL statements in the query.
             */
            public Builder parseTotalRowCounts(Long parseTotalRowCounts) {
                this.parseTotalRowCounts = parseTotalRowCounts;
                return this;
            }

            /**
             * The largest number of rows that were returned by a specific SQL statement in the query.
             */
            public Builder returnMaxRowCount(Long returnMaxRowCount) {
                this.returnMaxRowCount = returnMaxRowCount;
                return this;
            }

            /**
             * The total number of rows that were returned by all SQL statements in the query.
             */
            public Builder returnTotalRowCounts(Long returnTotalRowCounts) {
                this.returnTotalRowCounts = returnTotalRowCounts;
                return this;
            }

            /**
             * The unique ID of the SQL statement. The ID is used to obtain the slow query logs of the SQL statement.
             */
            public Builder SQLHASH(String SQLHASH) {
                this.SQLHASH = SQLHASH;
                return this;
            }

            /**
             * The SQL statement that is executed in the query.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The total number of executions of the SQL statements.
             */
            public Builder totalExecutionCounts(Long totalExecutionCounts) {
                this.totalExecutionCounts = totalExecutionCounts;
                return this;
            }

            /**
             * The total duration that was caused by all SQL statements in the query. Unit: seconds.
             */
            public Builder totalExecutionTimes(Long totalExecutionTimes) {
                this.totalExecutionTimes = totalExecutionTimes;
                return this;
            }

            /**
             * The total lock duration that was caused by all SQL statements in the query. Unit: seconds.
             */
            public Builder totalLockTimes(Long totalLockTimes) {
                this.totalLockTimes = totalLockTimes;
                return this;
            }

            public SQLSlowLog build() {
                return new SQLSlowLog(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("SQLSlowLog")
        private java.util.List < SQLSlowLog> SQLSlowLog;

        private Items(Builder builder) {
            this.SQLSlowLog = builder.SQLSlowLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLSlowLog
         */
        public java.util.List < SQLSlowLog> getSQLSlowLog() {
            return this.SQLSlowLog;
        }

        public static final class Builder {
            private java.util.List < SQLSlowLog> SQLSlowLog; 

            /**
             * SQLSlowLog.
             */
            public Builder SQLSlowLog(java.util.List < SQLSlowLog> SQLSlowLog) {
                this.SQLSlowLog = SQLSlowLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
