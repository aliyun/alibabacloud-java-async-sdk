// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

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
        this.DBInstanceId = builder.DBInstanceId;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
        private String DBInstanceId; 
        private String endTime; 
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The end date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-05-30Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>An array that consists of the information about each slow query log.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of SQL statements that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>2011-05-30Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
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
        @com.aliyun.core.annotation.NameInMap("AvgExecutionTime")
        private Long avgExecutionTime;

        @com.aliyun.core.annotation.NameInMap("AvgIOWriteCounts")
        private Long avgIOWriteCounts;

        @com.aliyun.core.annotation.NameInMap("AvgLastRowsAffectedCounts")
        private Long avgLastRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalReadCounts")
        private Long avgLogicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalReadCounts")
        private Long avgPhysicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("AvgRowsAffectedCounts")
        private Long avgRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @com.aliyun.core.annotation.NameInMap("MaxExecutionTimeMS")
        private Long maxExecutionTimeMS;

        @com.aliyun.core.annotation.NameInMap("MaxIOWriteCounts")
        private Long maxIOWriteCounts;

        @com.aliyun.core.annotation.NameInMap("MaxLastRowsAffectedCounts")
        private Long maxLastRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private Long maxLockTime;

        @com.aliyun.core.annotation.NameInMap("MaxLockTimeMS")
        private Long maxLockTimeMS;

        @com.aliyun.core.annotation.NameInMap("MaxLogicalReadCounts")
        private Long maxLogicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("MaxPhysicalReadCounts")
        private Long maxPhysicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("MaxRowsAffectedCounts")
        private Long maxRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("MinIOWriteCounts")
        private Long minIOWriteCounts;

        @com.aliyun.core.annotation.NameInMap("MinLastRowsAffectedCounts")
        private Long minLastRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("MinLogicalReadCounts")
        private Long minLogicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("MinPhysicalReadCounts")
        private Long minPhysicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("MinRowsAffectedCounts")
        private Long minRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("MySQLTotalExecutionCounts")
        private Long mySQLTotalExecutionCounts;

        @com.aliyun.core.annotation.NameInMap("MySQLTotalExecutionTimes")
        private Long mySQLTotalExecutionTimes;

        @com.aliyun.core.annotation.NameInMap("ParseMaxRowCount")
        private Long parseMaxRowCount;

        @com.aliyun.core.annotation.NameInMap("ParseTotalRowCounts")
        private Long parseTotalRowCounts;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private String reportTime;

        @com.aliyun.core.annotation.NameInMap("ReturnMaxRowCount")
        private Long returnMaxRowCount;

        @com.aliyun.core.annotation.NameInMap("ReturnTotalRowCounts")
        private Long returnTotalRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLHASH")
        private String SQLHASH;

        @com.aliyun.core.annotation.NameInMap("SQLIdStr")
        private String SQLIdStr;

        @com.aliyun.core.annotation.NameInMap("SQLServerAvgCpuTime")
        private Long SQLServerAvgCpuTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerAvgExecutionTime")
        private Long SQLServerAvgExecutionTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerMaxCpuTime")
        private Long SQLServerMaxCpuTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerMinCpuTime")
        private Long SQLServerMinCpuTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerMinExecutionTime")
        private Long SQLServerMinExecutionTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerTotalCpuTime")
        private Long SQLServerTotalCpuTime;

        @com.aliyun.core.annotation.NameInMap("SQLServerTotalExecutionCounts")
        private Long SQLServerTotalExecutionCounts;

        @com.aliyun.core.annotation.NameInMap("SQLServerTotalExecutionTimes")
        private Long SQLServerTotalExecutionTimes;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("SlowLogId")
        private Long slowLogId;

        @com.aliyun.core.annotation.NameInMap("TotalIOWriteCounts")
        private Long totalIOWriteCounts;

        @com.aliyun.core.annotation.NameInMap("TotalLastRowsAffectedCounts")
        private Long totalLastRowsAffectedCounts;

        @com.aliyun.core.annotation.NameInMap("TotalLockTimes")
        private Long totalLockTimes;

        @com.aliyun.core.annotation.NameInMap("TotalLogicalReadCounts")
        private Long totalLogicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("TotalPhysicalReadCounts")
        private Long totalPhysicalReadCounts;

        @com.aliyun.core.annotation.NameInMap("TotalRowsAffectedCounts")
        private Long totalRowsAffectedCounts;

        private SQLSlowLog(Builder builder) {
            this.avgExecutionTime = builder.avgExecutionTime;
            this.avgIOWriteCounts = builder.avgIOWriteCounts;
            this.avgLastRowsAffectedCounts = builder.avgLastRowsAffectedCounts;
            this.avgLogicalReadCounts = builder.avgLogicalReadCounts;
            this.avgPhysicalReadCounts = builder.avgPhysicalReadCounts;
            this.avgRowsAffectedCounts = builder.avgRowsAffectedCounts;
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.maxExecutionTime = builder.maxExecutionTime;
            this.maxExecutionTimeMS = builder.maxExecutionTimeMS;
            this.maxIOWriteCounts = builder.maxIOWriteCounts;
            this.maxLastRowsAffectedCounts = builder.maxLastRowsAffectedCounts;
            this.maxLockTime = builder.maxLockTime;
            this.maxLockTimeMS = builder.maxLockTimeMS;
            this.maxLogicalReadCounts = builder.maxLogicalReadCounts;
            this.maxPhysicalReadCounts = builder.maxPhysicalReadCounts;
            this.maxRowsAffectedCounts = builder.maxRowsAffectedCounts;
            this.minIOWriteCounts = builder.minIOWriteCounts;
            this.minLastRowsAffectedCounts = builder.minLastRowsAffectedCounts;
            this.minLogicalReadCounts = builder.minLogicalReadCounts;
            this.minPhysicalReadCounts = builder.minPhysicalReadCounts;
            this.minRowsAffectedCounts = builder.minRowsAffectedCounts;
            this.mySQLTotalExecutionCounts = builder.mySQLTotalExecutionCounts;
            this.mySQLTotalExecutionTimes = builder.mySQLTotalExecutionTimes;
            this.parseMaxRowCount = builder.parseMaxRowCount;
            this.parseTotalRowCounts = builder.parseTotalRowCounts;
            this.reportTime = builder.reportTime;
            this.returnMaxRowCount = builder.returnMaxRowCount;
            this.returnTotalRowCounts = builder.returnTotalRowCounts;
            this.SQLHASH = builder.SQLHASH;
            this.SQLIdStr = builder.SQLIdStr;
            this.SQLServerAvgCpuTime = builder.SQLServerAvgCpuTime;
            this.SQLServerAvgExecutionTime = builder.SQLServerAvgExecutionTime;
            this.SQLServerMaxCpuTime = builder.SQLServerMaxCpuTime;
            this.SQLServerMinCpuTime = builder.SQLServerMinCpuTime;
            this.SQLServerMinExecutionTime = builder.SQLServerMinExecutionTime;
            this.SQLServerTotalCpuTime = builder.SQLServerTotalCpuTime;
            this.SQLServerTotalExecutionCounts = builder.SQLServerTotalExecutionCounts;
            this.SQLServerTotalExecutionTimes = builder.SQLServerTotalExecutionTimes;
            this.SQLText = builder.SQLText;
            this.slowLogId = builder.slowLogId;
            this.totalIOWriteCounts = builder.totalIOWriteCounts;
            this.totalLastRowsAffectedCounts = builder.totalLastRowsAffectedCounts;
            this.totalLockTimes = builder.totalLockTimes;
            this.totalLogicalReadCounts = builder.totalLogicalReadCounts;
            this.totalPhysicalReadCounts = builder.totalPhysicalReadCounts;
            this.totalRowsAffectedCounts = builder.totalRowsAffectedCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLSlowLog create() {
            return builder().build();
        }

        /**
         * @return avgExecutionTime
         */
        public Long getAvgExecutionTime() {
            return this.avgExecutionTime;
        }

        /**
         * @return avgIOWriteCounts
         */
        public Long getAvgIOWriteCounts() {
            return this.avgIOWriteCounts;
        }

        /**
         * @return avgLastRowsAffectedCounts
         */
        public Long getAvgLastRowsAffectedCounts() {
            return this.avgLastRowsAffectedCounts;
        }

        /**
         * @return avgLogicalReadCounts
         */
        public Long getAvgLogicalReadCounts() {
            return this.avgLogicalReadCounts;
        }

        /**
         * @return avgPhysicalReadCounts
         */
        public Long getAvgPhysicalReadCounts() {
            return this.avgPhysicalReadCounts;
        }

        /**
         * @return avgRowsAffectedCounts
         */
        public Long getAvgRowsAffectedCounts() {
            return this.avgRowsAffectedCounts;
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
         * @return maxExecutionTime
         */
        public Long getMaxExecutionTime() {
            return this.maxExecutionTime;
        }

        /**
         * @return maxExecutionTimeMS
         */
        public Long getMaxExecutionTimeMS() {
            return this.maxExecutionTimeMS;
        }

        /**
         * @return maxIOWriteCounts
         */
        public Long getMaxIOWriteCounts() {
            return this.maxIOWriteCounts;
        }

        /**
         * @return maxLastRowsAffectedCounts
         */
        public Long getMaxLastRowsAffectedCounts() {
            return this.maxLastRowsAffectedCounts;
        }

        /**
         * @return maxLockTime
         */
        public Long getMaxLockTime() {
            return this.maxLockTime;
        }

        /**
         * @return maxLockTimeMS
         */
        public Long getMaxLockTimeMS() {
            return this.maxLockTimeMS;
        }

        /**
         * @return maxLogicalReadCounts
         */
        public Long getMaxLogicalReadCounts() {
            return this.maxLogicalReadCounts;
        }

        /**
         * @return maxPhysicalReadCounts
         */
        public Long getMaxPhysicalReadCounts() {
            return this.maxPhysicalReadCounts;
        }

        /**
         * @return maxRowsAffectedCounts
         */
        public Long getMaxRowsAffectedCounts() {
            return this.maxRowsAffectedCounts;
        }

        /**
         * @return minIOWriteCounts
         */
        public Long getMinIOWriteCounts() {
            return this.minIOWriteCounts;
        }

        /**
         * @return minLastRowsAffectedCounts
         */
        public Long getMinLastRowsAffectedCounts() {
            return this.minLastRowsAffectedCounts;
        }

        /**
         * @return minLogicalReadCounts
         */
        public Long getMinLogicalReadCounts() {
            return this.minLogicalReadCounts;
        }

        /**
         * @return minPhysicalReadCounts
         */
        public Long getMinPhysicalReadCounts() {
            return this.minPhysicalReadCounts;
        }

        /**
         * @return minRowsAffectedCounts
         */
        public Long getMinRowsAffectedCounts() {
            return this.minRowsAffectedCounts;
        }

        /**
         * @return mySQLTotalExecutionCounts
         */
        public Long getMySQLTotalExecutionCounts() {
            return this.mySQLTotalExecutionCounts;
        }

        /**
         * @return mySQLTotalExecutionTimes
         */
        public Long getMySQLTotalExecutionTimes() {
            return this.mySQLTotalExecutionTimes;
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
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
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
         * @return SQLIdStr
         */
        public String getSQLIdStr() {
            return this.SQLIdStr;
        }

        /**
         * @return SQLServerAvgCpuTime
         */
        public Long getSQLServerAvgCpuTime() {
            return this.SQLServerAvgCpuTime;
        }

        /**
         * @return SQLServerAvgExecutionTime
         */
        public Long getSQLServerAvgExecutionTime() {
            return this.SQLServerAvgExecutionTime;
        }

        /**
         * @return SQLServerMaxCpuTime
         */
        public Long getSQLServerMaxCpuTime() {
            return this.SQLServerMaxCpuTime;
        }

        /**
         * @return SQLServerMinCpuTime
         */
        public Long getSQLServerMinCpuTime() {
            return this.SQLServerMinCpuTime;
        }

        /**
         * @return SQLServerMinExecutionTime
         */
        public Long getSQLServerMinExecutionTime() {
            return this.SQLServerMinExecutionTime;
        }

        /**
         * @return SQLServerTotalCpuTime
         */
        public Long getSQLServerTotalCpuTime() {
            return this.SQLServerTotalCpuTime;
        }

        /**
         * @return SQLServerTotalExecutionCounts
         */
        public Long getSQLServerTotalExecutionCounts() {
            return this.SQLServerTotalExecutionCounts;
        }

        /**
         * @return SQLServerTotalExecutionTimes
         */
        public Long getSQLServerTotalExecutionTimes() {
            return this.SQLServerTotalExecutionTimes;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return slowLogId
         */
        public Long getSlowLogId() {
            return this.slowLogId;
        }

        /**
         * @return totalIOWriteCounts
         */
        public Long getTotalIOWriteCounts() {
            return this.totalIOWriteCounts;
        }

        /**
         * @return totalLastRowsAffectedCounts
         */
        public Long getTotalLastRowsAffectedCounts() {
            return this.totalLastRowsAffectedCounts;
        }

        /**
         * @return totalLockTimes
         */
        public Long getTotalLockTimes() {
            return this.totalLockTimes;
        }

        /**
         * @return totalLogicalReadCounts
         */
        public Long getTotalLogicalReadCounts() {
            return this.totalLogicalReadCounts;
        }

        /**
         * @return totalPhysicalReadCounts
         */
        public Long getTotalPhysicalReadCounts() {
            return this.totalPhysicalReadCounts;
        }

        /**
         * @return totalRowsAffectedCounts
         */
        public Long getTotalRowsAffectedCounts() {
            return this.totalRowsAffectedCounts;
        }

        public static final class Builder {
            private Long avgExecutionTime; 
            private Long avgIOWriteCounts; 
            private Long avgLastRowsAffectedCounts; 
            private Long avgLogicalReadCounts; 
            private Long avgPhysicalReadCounts; 
            private Long avgRowsAffectedCounts; 
            private String createTime; 
            private String DBName; 
            private Long maxExecutionTime; 
            private Long maxExecutionTimeMS; 
            private Long maxIOWriteCounts; 
            private Long maxLastRowsAffectedCounts; 
            private Long maxLockTime; 
            private Long maxLockTimeMS; 
            private Long maxLogicalReadCounts; 
            private Long maxPhysicalReadCounts; 
            private Long maxRowsAffectedCounts; 
            private Long minIOWriteCounts; 
            private Long minLastRowsAffectedCounts; 
            private Long minLogicalReadCounts; 
            private Long minPhysicalReadCounts; 
            private Long minRowsAffectedCounts; 
            private Long mySQLTotalExecutionCounts; 
            private Long mySQLTotalExecutionTimes; 
            private Long parseMaxRowCount; 
            private Long parseTotalRowCounts; 
            private String reportTime; 
            private Long returnMaxRowCount; 
            private Long returnTotalRowCounts; 
            private String SQLHASH; 
            private String SQLIdStr; 
            private Long SQLServerAvgCpuTime; 
            private Long SQLServerAvgExecutionTime; 
            private Long SQLServerMaxCpuTime; 
            private Long SQLServerMinCpuTime; 
            private Long SQLServerMinExecutionTime; 
            private Long SQLServerTotalCpuTime; 
            private Long SQLServerTotalExecutionCounts; 
            private Long SQLServerTotalExecutionTimes; 
            private String SQLText; 
            private Long slowLogId; 
            private Long totalIOWriteCounts; 
            private Long totalLastRowsAffectedCounts; 
            private Long totalLockTimes; 
            private Long totalLogicalReadCounts; 
            private Long totalPhysicalReadCounts; 
            private Long totalRowsAffectedCounts; 

            /**
             * <p>The average execution duration per SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder avgExecutionTime(Long avgExecutionTime) {
                this.avgExecutionTime = avgExecutionTime;
                return this;
            }

            /**
             * <p>The average number of I/O writes per SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgIOWriteCounts(Long avgIOWriteCounts) {
                this.avgIOWriteCounts = avgIOWriteCounts;
                return this;
            }

            /**
             * <p>The average number of rows that were affected by the last SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgLastRowsAffectedCounts(Long avgLastRowsAffectedCounts) {
                this.avgLastRowsAffectedCounts = avgLastRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The average number of logical reads per SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgLogicalReadCounts(Long avgLogicalReadCounts) {
                this.avgLogicalReadCounts = avgLogicalReadCounts;
                return this;
            }

            /**
             * <p>The average number of physical reads per SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgPhysicalReadCounts(Long avgPhysicalReadCounts) {
                this.avgPhysicalReadCounts = avgPhysicalReadCounts;
                return this;
            }

            /**
             * <p>The average number of rows that were affected per SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgRowsAffectedCounts(Long avgRowsAffectedCounts) {
                this.avgRowsAffectedCounts = avgRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The date when the data was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_MySQL</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
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
             * <p>The longest execution duration of a specific SQL statement in the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
             */
            public Builder maxExecutionTimeMS(Long maxExecutionTimeMS) {
                this.maxExecutionTimeMS = maxExecutionTimeMS;
                return this;
            }

            /**
             * <p>The largest number of I/O writes that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxIOWriteCounts(Long maxIOWriteCounts) {
                this.maxIOWriteCounts = maxIOWriteCounts;
                return this;
            }

            /**
             * <p>The largest number of rows that were affected by the last SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxLastRowsAffectedCounts(Long maxLastRowsAffectedCounts) {
                this.maxLastRowsAffectedCounts = maxLastRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The longest lock duration that was caused by a specific SQL statement in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxLockTime(Long maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * <p>The longest lock duration that was caused by a specific SQL statement in the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxLockTimeMS(Long maxLockTimeMS) {
                this.maxLockTimeMS = maxLockTimeMS;
                return this;
            }

            /**
             * <p>The largest number of logical reads that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxLogicalReadCounts(Long maxLogicalReadCounts) {
                this.maxLogicalReadCounts = maxLogicalReadCounts;
                return this;
            }

            /**
             * <p>The largest number of physical reads that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxPhysicalReadCounts(Long maxPhysicalReadCounts) {
                this.maxPhysicalReadCounts = maxPhysicalReadCounts;
                return this;
            }

            /**
             * <p>The largest number of rows that were affected by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRowsAffectedCounts(Long maxRowsAffectedCounts) {
                this.maxRowsAffectedCounts = maxRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The smallest number of I/O writes that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minIOWriteCounts(Long minIOWriteCounts) {
                this.minIOWriteCounts = minIOWriteCounts;
                return this;
            }

            /**
             * <p>The smallest number of rows that were affected by the last SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minLastRowsAffectedCounts(Long minLastRowsAffectedCounts) {
                this.minLastRowsAffectedCounts = minLastRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The smallest number of logical reads that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minLogicalReadCounts(Long minLogicalReadCounts) {
                this.minLogicalReadCounts = minLogicalReadCounts;
                return this;
            }

            /**
             * <p>The smallest number of physical reads that were performed by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minPhysicalReadCounts(Long minPhysicalReadCounts) {
                this.minPhysicalReadCounts = minPhysicalReadCounts;
                return this;
            }

            /**
             * <p>The smallest number of rows that were affected by a specific SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minRowsAffectedCounts(Long minRowsAffectedCounts) {
                this.minRowsAffectedCounts = minRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The total number of SQL statements that were executed in the query. This parameter is returned only for instances that run MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
                this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
                return this;
            }

            /**
             * <p>The total execution duration of all SQL statements in the query. Unit: seconds. This parameter is returned only for instances that run MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
                this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
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
             * <p>1</p>
             */
            public Builder parseTotalRowCounts(Long parseTotalRowCounts) {
                this.parseTotalRowCounts = parseTotalRowCounts;
                return this;
            }

            /**
             * <p>The date on which the data report was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30Z</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * <p>The largest number of rows that were returned by a specific SQL statement in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The ID of the SQL statement in the statistical template of slow query logs. This parameter is replaced by the <strong>SQLHASH</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>521584</p>
             */
            public Builder SQLIdStr(String SQLIdStr) {
                this.SQLIdStr = SQLIdStr;
                return this;
            }

            /**
             * <p>The average amount of CPU time per SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerAvgCpuTime(Long SQLServerAvgCpuTime) {
                this.SQLServerAvgCpuTime = SQLServerAvgCpuTime;
                return this;
            }

            /**
             * <p>The average execution duration per SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerAvgExecutionTime(Long SQLServerAvgExecutionTime) {
                this.SQLServerAvgExecutionTime = SQLServerAvgExecutionTime;
                return this;
            }

            /**
             * <p>The largest amount of CPU time that was used by a specific SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerMaxCpuTime(Long SQLServerMaxCpuTime) {
                this.SQLServerMaxCpuTime = SQLServerMaxCpuTime;
                return this;
            }

            /**
             * <p>The smallest amount of CPU time that was used by a specific SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerMinCpuTime(Long SQLServerMinCpuTime) {
                this.SQLServerMinCpuTime = SQLServerMinCpuTime;
                return this;
            }

            /**
             * <p>The smallest execution duration of a specific SQL statement in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerMinExecutionTime(Long SQLServerMinExecutionTime) {
                this.SQLServerMinExecutionTime = SQLServerMinExecutionTime;
                return this;
            }

            /**
             * <p>The total amount of CPU time that was used by all SQL statements in the query. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder SQLServerTotalCpuTime(Long SQLServerTotalCpuTime) {
                this.SQLServerTotalCpuTime = SQLServerTotalCpuTime;
                return this;
            }

            /**
             * <p>The total number of SQL statements that were executed in the query. This parameter is returned only for instances that run SQL Server.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder SQLServerTotalExecutionCounts(Long SQLServerTotalExecutionCounts) {
                this.SQLServerTotalExecutionCounts = SQLServerTotalExecutionCounts;
                return this;
            }

            /**
             * <p>The total execution duration of all SQL statements in the query. This parameter is returned only for instances that run SQL Server. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder SQLServerTotalExecutionTimes(Long SQLServerTotalExecutionTimes) {
                this.SQLServerTotalExecutionTimes = SQLServerTotalExecutionTimes;
                return this;
            }

            /**
             * <p>The SQL statement that was executed in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>select id,name from tb_table</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The ID of the slow query log summary.</p>
             * 
             * <strong>example:</strong>
             * <p>26584213</p>
             */
            public Builder slowLogId(Long slowLogId) {
                this.slowLogId = slowLogId;
                return this;
            }

            /**
             * <p>The total number of I/O writes that were performed by all SQL statements in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalIOWriteCounts(Long totalIOWriteCounts) {
                this.totalIOWriteCounts = totalIOWriteCounts;
                return this;
            }

            /**
             * <p>The total number of rows that were affected by the last SQL statement in the query.</p>
             * <blockquote>
             * <p> This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalLastRowsAffectedCounts(Long totalLastRowsAffectedCounts) {
                this.totalLastRowsAffectedCounts = totalLastRowsAffectedCounts;
                return this;
            }

            /**
             * <p>The total lock duration that was caused by all SQL statements in the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalLockTimes(Long totalLockTimes) {
                this.totalLockTimes = totalLockTimes;
                return this;
            }

            /**
             * <p>The total number of logical reads that were performed by all SQL statements in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalLogicalReadCounts(Long totalLogicalReadCounts) {
                this.totalLogicalReadCounts = totalLogicalReadCounts;
                return this;
            }

            /**
             * <p>The total number of physical reads that were performed by all SQL statements in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPhysicalReadCounts(Long totalPhysicalReadCounts) {
                this.totalPhysicalReadCounts = totalPhysicalReadCounts;
                return this;
            }

            /**
             * <p>The total number of rows that were affected by all SQL statements in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalRowsAffectedCounts(Long totalRowsAffectedCounts) {
                this.totalRowsAffectedCounts = totalRowsAffectedCounts;
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
