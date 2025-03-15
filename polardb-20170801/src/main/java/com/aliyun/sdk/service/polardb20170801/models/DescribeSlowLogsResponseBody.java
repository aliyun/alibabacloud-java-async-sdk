// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeSlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogsResponseBody</p>
 */
public class DescribeSlowLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSlowLogsResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.engine = model.engine;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The ID of cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-30Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>Details about slow query logs.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of SQL statements that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2553A660-E4EB-4AF4-A402-8AFF70A49143</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-01Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSlowLogsResponseBody build() {
            return new DescribeSlowLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogsResponseBody</p>
     */
    public static class SQLSlowLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private Long maxLockTime;

        @com.aliyun.core.annotation.NameInMap("ParseMaxRowCount")
        private Long parseMaxRowCount;

        @com.aliyun.core.annotation.NameInMap("ParseTotalRowCounts")
        private Long parseTotalRowCounts;

        @com.aliyun.core.annotation.NameInMap("ReturnMaxRowCount")
        private Long returnMaxRowCount;

        @com.aliyun.core.annotation.NameInMap("ReturnTotalRowCounts")
        private Long returnTotalRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLHASH")
        private String SQLHASH;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("TotalExecutionCounts")
        private Long totalExecutionCounts;

        @com.aliyun.core.annotation.NameInMap("TotalExecutionTimes")
        private Long totalExecutionTimes;

        @com.aliyun.core.annotation.NameInMap("TotalLockTimes")
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

            private Builder() {
            } 

            private Builder(SQLSlowLog model) {
                this.createTime = model.createTime;
                this.DBName = model.DBName;
                this.DBNodeId = model.DBNodeId;
                this.maxExecutionTime = model.maxExecutionTime;
                this.maxLockTime = model.maxLockTime;
                this.parseMaxRowCount = model.parseMaxRowCount;
                this.parseTotalRowCounts = model.parseTotalRowCounts;
                this.returnMaxRowCount = model.returnMaxRowCount;
                this.returnTotalRowCounts = model.returnTotalRowCounts;
                this.SQLHASH = model.SQLHASH;
                this.SQLText = model.SQLText;
                this.totalExecutionCounts = model.totalExecutionCounts;
                this.totalExecutionTimes = model.totalExecutionTimes;
                this.totalLockTimes = model.totalLockTimes;
            } 

            /**
             * <p>The date when the data was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>PolarDB_MySQL</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-***************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The longest execution duration of a specific SQL statement in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * <p>The longest lock duration that was caused by a specific SQL statement in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxLockTime(Long maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * <p>The largest number of rows that were parsed by a specific SQL statement in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parseMaxRowCount(Long parseMaxRowCount) {
                this.parseMaxRowCount = parseMaxRowCount;
                return this;
            }

            /**
             * <p>The total number of rows that were parsed by all SQL statements in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parseTotalRowCounts(Long parseTotalRowCounts) {
                this.parseTotalRowCounts = parseTotalRowCounts;
                return this;
            }

            /**
             * <p>The largest number of rows that were returned by a specific SQL statement in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder returnMaxRowCount(Long returnMaxRowCount) {
                this.returnMaxRowCount = returnMaxRowCount;
                return this;
            }

            /**
             * <p>The total number of rows that were returned by all SQL statements in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnTotalRowCounts(Long returnTotalRowCounts) {
                this.returnTotalRowCounts = returnTotalRowCounts;
                return this;
            }

            /**
             * <p>The unique ID of the SQL statement. The ID is used to obtain the slow query logs of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>U2FsdGVkxxxx</p>
             */
            public Builder SQLHASH(String SQLHASH) {
                this.SQLHASH = SQLHASH;
                return this;
            }

            /**
             * <p>The SQL statement that is executed in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>select id,name from tb_table</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The total number of executions of the SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalExecutionCounts(Long totalExecutionCounts) {
                this.totalExecutionCounts = totalExecutionCounts;
                return this;
            }

            /**
             * <p>The total duration that was caused by all SQL statements in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalExecutionTimes(Long totalExecutionTimes) {
                this.totalExecutionTimes = totalExecutionTimes;
                return this;
            }

            /**
             * <p>The total lock duration that was caused by all SQL statements in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeSlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLSlowLog")
        private java.util.List<SQLSlowLog> SQLSlowLog;

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
        public java.util.List<SQLSlowLog> getSQLSlowLog() {
            return this.SQLSlowLog;
        }

        public static final class Builder {
            private java.util.List<SQLSlowLog> SQLSlowLog; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.SQLSlowLog = model.SQLSlowLog;
            } 

            /**
             * SQLSlowLog.
             */
            public Builder SQLSlowLog(java.util.List<SQLSlowLog> SQLSlowLog) {
                this.SQLSlowLog = SQLSlowLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
