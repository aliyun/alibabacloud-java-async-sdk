// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalRecordCount.
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
        @NameInMap("AvgExecutionTime")
        private Long avgExecutionTime;

        @NameInMap("AvgIOWriteCounts")
        private Long avgIOWriteCounts;

        @NameInMap("AvgLastRowsAffectedCounts")
        private Long avgLastRowsAffectedCounts;

        @NameInMap("AvgLogicalReadCounts")
        private Long avgLogicalReadCounts;

        @NameInMap("AvgPhysicalReadCounts")
        private Long avgPhysicalReadCounts;

        @NameInMap("AvgRowsAffectedCounts")
        private Long avgRowsAffectedCounts;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("MaxExecutionTime")
        private Long maxExecutionTime;

        @NameInMap("MaxIOWriteCounts")
        private Long maxIOWriteCounts;

        @NameInMap("MaxLastRowsAffectedCounts")
        private Long maxLastRowsAffectedCounts;

        @NameInMap("MaxLockTime")
        private Long maxLockTime;

        @NameInMap("MaxLogicalReadCounts")
        private Long maxLogicalReadCounts;

        @NameInMap("MaxPhysicalReadCounts")
        private Long maxPhysicalReadCounts;

        @NameInMap("MaxRowsAffectedCounts")
        private Long maxRowsAffectedCounts;

        @NameInMap("MinIOWriteCounts")
        private Long minIOWriteCounts;

        @NameInMap("MinLastRowsAffectedCounts")
        private Long minLastRowsAffectedCounts;

        @NameInMap("MinLogicalReadCounts")
        private Long minLogicalReadCounts;

        @NameInMap("MinPhysicalReadCounts")
        private Long minPhysicalReadCounts;

        @NameInMap("MinRowsAffectedCounts")
        private Long minRowsAffectedCounts;

        @NameInMap("MySQLTotalExecutionCounts")
        private Long mySQLTotalExecutionCounts;

        @NameInMap("MySQLTotalExecutionTimes")
        private Long mySQLTotalExecutionTimes;

        @NameInMap("ParseMaxRowCount")
        private Long parseMaxRowCount;

        @NameInMap("ParseTotalRowCounts")
        private Long parseTotalRowCounts;

        @NameInMap("ReportTime")
        private String reportTime;

        @NameInMap("ReturnMaxRowCount")
        private Long returnMaxRowCount;

        @NameInMap("ReturnTotalRowCounts")
        private Long returnTotalRowCounts;

        @NameInMap("SQLHASH")
        private String SQLHASH;

        @NameInMap("SQLIdStr")
        private String SQLIdStr;

        @NameInMap("SQLServerAvgCpuTime")
        private Long SQLServerAvgCpuTime;

        @NameInMap("SQLServerAvgExecutionTime")
        private Long SQLServerAvgExecutionTime;

        @NameInMap("SQLServerMaxCpuTime")
        private Long SQLServerMaxCpuTime;

        @NameInMap("SQLServerMinCpuTime")
        private Long SQLServerMinCpuTime;

        @NameInMap("SQLServerMinExecutionTime")
        private Long SQLServerMinExecutionTime;

        @NameInMap("SQLServerTotalCpuTime")
        private Long SQLServerTotalCpuTime;

        @NameInMap("SQLServerTotalExecutionCounts")
        private Long SQLServerTotalExecutionCounts;

        @NameInMap("SQLServerTotalExecutionTimes")
        private Long SQLServerTotalExecutionTimes;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("SlowLogId")
        private Long slowLogId;

        @NameInMap("TotalIOWriteCounts")
        private Long totalIOWriteCounts;

        @NameInMap("TotalLastRowsAffectedCounts")
        private Long totalLastRowsAffectedCounts;

        @NameInMap("TotalLockTimes")
        private Long totalLockTimes;

        @NameInMap("TotalLogicalReadCounts")
        private Long totalLogicalReadCounts;

        @NameInMap("TotalPhysicalReadCounts")
        private Long totalPhysicalReadCounts;

        @NameInMap("TotalRowsAffectedCounts")
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
            this.maxIOWriteCounts = builder.maxIOWriteCounts;
            this.maxLastRowsAffectedCounts = builder.maxLastRowsAffectedCounts;
            this.maxLockTime = builder.maxLockTime;
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
            private Long maxIOWriteCounts; 
            private Long maxLastRowsAffectedCounts; 
            private Long maxLockTime; 
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
             * AvgExecutionTime.
             */
            public Builder avgExecutionTime(Long avgExecutionTime) {
                this.avgExecutionTime = avgExecutionTime;
                return this;
            }

            /**
             * AvgIOWriteCounts.
             */
            public Builder avgIOWriteCounts(Long avgIOWriteCounts) {
                this.avgIOWriteCounts = avgIOWriteCounts;
                return this;
            }

            /**
             * AvgLastRowsAffectedCounts.
             */
            public Builder avgLastRowsAffectedCounts(Long avgLastRowsAffectedCounts) {
                this.avgLastRowsAffectedCounts = avgLastRowsAffectedCounts;
                return this;
            }

            /**
             * AvgLogicalReadCounts.
             */
            public Builder avgLogicalReadCounts(Long avgLogicalReadCounts) {
                this.avgLogicalReadCounts = avgLogicalReadCounts;
                return this;
            }

            /**
             * AvgPhysicalReadCounts.
             */
            public Builder avgPhysicalReadCounts(Long avgPhysicalReadCounts) {
                this.avgPhysicalReadCounts = avgPhysicalReadCounts;
                return this;
            }

            /**
             * AvgRowsAffectedCounts.
             */
            public Builder avgRowsAffectedCounts(Long avgRowsAffectedCounts) {
                this.avgRowsAffectedCounts = avgRowsAffectedCounts;
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
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * MaxExecutionTime.
             */
            public Builder maxExecutionTime(Long maxExecutionTime) {
                this.maxExecutionTime = maxExecutionTime;
                return this;
            }

            /**
             * MaxIOWriteCounts.
             */
            public Builder maxIOWriteCounts(Long maxIOWriteCounts) {
                this.maxIOWriteCounts = maxIOWriteCounts;
                return this;
            }

            /**
             * MaxLastRowsAffectedCounts.
             */
            public Builder maxLastRowsAffectedCounts(Long maxLastRowsAffectedCounts) {
                this.maxLastRowsAffectedCounts = maxLastRowsAffectedCounts;
                return this;
            }

            /**
             * MaxLockTime.
             */
            public Builder maxLockTime(Long maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * MaxLogicalReadCounts.
             */
            public Builder maxLogicalReadCounts(Long maxLogicalReadCounts) {
                this.maxLogicalReadCounts = maxLogicalReadCounts;
                return this;
            }

            /**
             * MaxPhysicalReadCounts.
             */
            public Builder maxPhysicalReadCounts(Long maxPhysicalReadCounts) {
                this.maxPhysicalReadCounts = maxPhysicalReadCounts;
                return this;
            }

            /**
             * MaxRowsAffectedCounts.
             */
            public Builder maxRowsAffectedCounts(Long maxRowsAffectedCounts) {
                this.maxRowsAffectedCounts = maxRowsAffectedCounts;
                return this;
            }

            /**
             * MinIOWriteCounts.
             */
            public Builder minIOWriteCounts(Long minIOWriteCounts) {
                this.minIOWriteCounts = minIOWriteCounts;
                return this;
            }

            /**
             * MinLastRowsAffectedCounts.
             */
            public Builder minLastRowsAffectedCounts(Long minLastRowsAffectedCounts) {
                this.minLastRowsAffectedCounts = minLastRowsAffectedCounts;
                return this;
            }

            /**
             * MinLogicalReadCounts.
             */
            public Builder minLogicalReadCounts(Long minLogicalReadCounts) {
                this.minLogicalReadCounts = minLogicalReadCounts;
                return this;
            }

            /**
             * MinPhysicalReadCounts.
             */
            public Builder minPhysicalReadCounts(Long minPhysicalReadCounts) {
                this.minPhysicalReadCounts = minPhysicalReadCounts;
                return this;
            }

            /**
             * MinRowsAffectedCounts.
             */
            public Builder minRowsAffectedCounts(Long minRowsAffectedCounts) {
                this.minRowsAffectedCounts = minRowsAffectedCounts;
                return this;
            }

            /**
             * MySQLTotalExecutionCounts.
             */
            public Builder mySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
                this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
                return this;
            }

            /**
             * MySQLTotalExecutionTimes.
             */
            public Builder mySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
                this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
                return this;
            }

            /**
             * ParseMaxRowCount.
             */
            public Builder parseMaxRowCount(Long parseMaxRowCount) {
                this.parseMaxRowCount = parseMaxRowCount;
                return this;
            }

            /**
             * ParseTotalRowCounts.
             */
            public Builder parseTotalRowCounts(Long parseTotalRowCounts) {
                this.parseTotalRowCounts = parseTotalRowCounts;
                return this;
            }

            /**
             * ReportTime.
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * ReturnMaxRowCount.
             */
            public Builder returnMaxRowCount(Long returnMaxRowCount) {
                this.returnMaxRowCount = returnMaxRowCount;
                return this;
            }

            /**
             * ReturnTotalRowCounts.
             */
            public Builder returnTotalRowCounts(Long returnTotalRowCounts) {
                this.returnTotalRowCounts = returnTotalRowCounts;
                return this;
            }

            /**
             * SQLHASH.
             */
            public Builder SQLHASH(String SQLHASH) {
                this.SQLHASH = SQLHASH;
                return this;
            }

            /**
             * SQLIdStr.
             */
            public Builder SQLIdStr(String SQLIdStr) {
                this.SQLIdStr = SQLIdStr;
                return this;
            }

            /**
             * SQLServerAvgCpuTime.
             */
            public Builder SQLServerAvgCpuTime(Long SQLServerAvgCpuTime) {
                this.SQLServerAvgCpuTime = SQLServerAvgCpuTime;
                return this;
            }

            /**
             * SQLServerAvgExecutionTime.
             */
            public Builder SQLServerAvgExecutionTime(Long SQLServerAvgExecutionTime) {
                this.SQLServerAvgExecutionTime = SQLServerAvgExecutionTime;
                return this;
            }

            /**
             * SQLServerMaxCpuTime.
             */
            public Builder SQLServerMaxCpuTime(Long SQLServerMaxCpuTime) {
                this.SQLServerMaxCpuTime = SQLServerMaxCpuTime;
                return this;
            }

            /**
             * SQLServerMinCpuTime.
             */
            public Builder SQLServerMinCpuTime(Long SQLServerMinCpuTime) {
                this.SQLServerMinCpuTime = SQLServerMinCpuTime;
                return this;
            }

            /**
             * SQLServerMinExecutionTime.
             */
            public Builder SQLServerMinExecutionTime(Long SQLServerMinExecutionTime) {
                this.SQLServerMinExecutionTime = SQLServerMinExecutionTime;
                return this;
            }

            /**
             * SQLServerTotalCpuTime.
             */
            public Builder SQLServerTotalCpuTime(Long SQLServerTotalCpuTime) {
                this.SQLServerTotalCpuTime = SQLServerTotalCpuTime;
                return this;
            }

            /**
             * SQLServerTotalExecutionCounts.
             */
            public Builder SQLServerTotalExecutionCounts(Long SQLServerTotalExecutionCounts) {
                this.SQLServerTotalExecutionCounts = SQLServerTotalExecutionCounts;
                return this;
            }

            /**
             * SQLServerTotalExecutionTimes.
             */
            public Builder SQLServerTotalExecutionTimes(Long SQLServerTotalExecutionTimes) {
                this.SQLServerTotalExecutionTimes = SQLServerTotalExecutionTimes;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * SlowLogId.
             */
            public Builder slowLogId(Long slowLogId) {
                this.slowLogId = slowLogId;
                return this;
            }

            /**
             * TotalIOWriteCounts.
             */
            public Builder totalIOWriteCounts(Long totalIOWriteCounts) {
                this.totalIOWriteCounts = totalIOWriteCounts;
                return this;
            }

            /**
             * TotalLastRowsAffectedCounts.
             */
            public Builder totalLastRowsAffectedCounts(Long totalLastRowsAffectedCounts) {
                this.totalLastRowsAffectedCounts = totalLastRowsAffectedCounts;
                return this;
            }

            /**
             * TotalLockTimes.
             */
            public Builder totalLockTimes(Long totalLockTimes) {
                this.totalLockTimes = totalLockTimes;
                return this;
            }

            /**
             * TotalLogicalReadCounts.
             */
            public Builder totalLogicalReadCounts(Long totalLogicalReadCounts) {
                this.totalLogicalReadCounts = totalLogicalReadCounts;
                return this;
            }

            /**
             * TotalPhysicalReadCounts.
             */
            public Builder totalPhysicalReadCounts(Long totalPhysicalReadCounts) {
                this.totalPhysicalReadCounts = totalPhysicalReadCounts;
                return this;
            }

            /**
             * TotalRowsAffectedCounts.
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
