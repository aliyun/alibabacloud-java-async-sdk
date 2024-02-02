// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasAnomalySQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasAnomalySQLListResponseBody</p>
 */
public class DescribeOasAnomalySQLListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeOasAnomalySQLListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasAnomalySQLListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The list of suspicious SQLs.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * The total count.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOasAnomalySQLListResponseBody build() {
            return new DescribeOasAnomalySQLListResponseBody(this);
        } 

    } 

    public static class SqlList extends TeaModel {
        @NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @NameInMap("AvgDbTime")
        private Double avgDbTime;

        @NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @NameInMap("AvgLogicalReads")
        private Float avgLogicalReads;

        @NameInMap("AvgRetryCount")
        private Float avgRetryCount;

        @NameInMap("CpuTime")
        private Double cpuTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DiagTypes")
        private java.util.List < String > diagTypes;

        @NameInMap("Diagnosis")
        private String diagnosis;

        @NameInMap("Executions")
        private Double executions;

        @NameInMap("LastExecutedTime")
        private Double lastExecutedTime;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlTextShort")
        private String sqlTextShort;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("SumDbTime")
        private Double sumDbTime;

        @NameInMap("SumElapsedTime")
        private String sumElapsedTime;

        @NameInMap("SumRetryCount")
        private Float sumRetryCount;

        @NameInMap("UserName")
        private String userName;

        private SqlList(Builder builder) {
            this.avgCpuTime = builder.avgCpuTime;
            this.avgDbTime = builder.avgDbTime;
            this.avgElapsedTime = builder.avgElapsedTime;
            this.avgGetPlanTime = builder.avgGetPlanTime;
            this.avgLogicalReads = builder.avgLogicalReads;
            this.avgRetryCount = builder.avgRetryCount;
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.diagTypes = builder.diagTypes;
            this.diagnosis = builder.diagnosis;
            this.executions = builder.executions;
            this.lastExecutedTime = builder.lastExecutedTime;
            this.riskLevel = builder.riskLevel;
            this.sqlId = builder.sqlId;
            this.sqlTextShort = builder.sqlTextShort;
            this.suggestion = builder.suggestion;
            this.sumDbTime = builder.sumDbTime;
            this.sumElapsedTime = builder.sumElapsedTime;
            this.sumRetryCount = builder.sumRetryCount;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlList create() {
            return builder().build();
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgDbTime
         */
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        /**
         * @return avgElapsedTime
         */
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgGetPlanTime
         */
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        /**
         * @return avgLogicalReads
         */
        public Float getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        /**
         * @return avgRetryCount
         */
        public Float getAvgRetryCount() {
            return this.avgRetryCount;
        }

        /**
         * @return cpuTime
         */
        public Double getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return diagTypes
         */
        public java.util.List < String > getDiagTypes() {
            return this.diagTypes;
        }

        /**
         * @return diagnosis
         */
        public String getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return executions
         */
        public Double getExecutions() {
            return this.executions;
        }

        /**
         * @return lastExecutedTime
         */
        public Double getLastExecutedTime() {
            return this.lastExecutedTime;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlTextShort
         */
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return sumDbTime
         */
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        /**
         * @return sumElapsedTime
         */
        public String getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        /**
         * @return sumRetryCount
         */
        public Float getSumRetryCount() {
            return this.sumRetryCount;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Double avgCpuTime; 
            private Double avgDbTime; 
            private Double avgElapsedTime; 
            private Double avgGetPlanTime; 
            private Float avgLogicalReads; 
            private Float avgRetryCount; 
            private Double cpuTime; 
            private String dbName; 
            private java.util.List < String > diagTypes; 
            private String diagnosis; 
            private Double executions; 
            private Double lastExecutedTime; 
            private String riskLevel; 
            private String sqlId; 
            private String sqlTextShort; 
            private String suggestion; 
            private Double sumDbTime; 
            private String sumElapsedTime; 
            private Float sumRetryCount; 
            private String userName; 

            /**
             * AvgCpuTime.
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * AvgDbTime.
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * AvgElapsedTime.
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * AvgGetPlanTime.
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * AvgLogicalReads.
             */
            public Builder avgLogicalReads(Float avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * AvgRetryCount.
             */
            public Builder avgRetryCount(Float avgRetryCount) {
                this.avgRetryCount = avgRetryCount;
                return this;
            }

            /**
             * CpuTime.
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DiagTypes.
             */
            public Builder diagTypes(java.util.List < String > diagTypes) {
                this.diagTypes = diagTypes;
                return this;
            }

            /**
             * Diagnosis.
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * Executions.
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * LastExecutedTime.
             */
            public Builder lastExecutedTime(Double lastExecutedTime) {
                this.lastExecutedTime = lastExecutedTime;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SqlId.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlTextShort.
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * SumDbTime.
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * SumElapsedTime.
             */
            public Builder sumElapsedTime(String sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * SumRetryCount.
             */
            public Builder sumRetryCount(Float sumRetryCount) {
                this.sumRetryCount = sumRetryCount;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SqlList build() {
                return new SqlList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @NameInMap("AvgDbTime")
        private Double avgDbTime;

        @NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @NameInMap("AvgLogicalReads")
        private Float avgLogicalReads;

        @NameInMap("AvgRetryCount")
        private Float avgRetryCount;

        @NameInMap("CpuTime")
        private Double cpuTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DiagTypes")
        private java.util.List < String > diagTypes;

        @NameInMap("Diagnosis")
        private String diagnosis;

        @NameInMap("DynamicSql")
        private Boolean dynamicSql;

        @NameInMap("Executions")
        private Double executions;

        @NameInMap("LastExecutedTime")
        private Double lastExecutedTime;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlList")
        private java.util.List < SqlList> sqlList;

        @NameInMap("SqlTextShort")
        private String sqlTextShort;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("SumDbTime")
        private Double sumDbTime;

        @NameInMap("SumElapsedTime")
        private String sumElapsedTime;

        @NameInMap("SumRetryCount")
        private Float sumRetryCount;

        @NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.avgCpuTime = builder.avgCpuTime;
            this.avgDbTime = builder.avgDbTime;
            this.avgElapsedTime = builder.avgElapsedTime;
            this.avgGetPlanTime = builder.avgGetPlanTime;
            this.avgLogicalReads = builder.avgLogicalReads;
            this.avgRetryCount = builder.avgRetryCount;
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.diagTypes = builder.diagTypes;
            this.diagnosis = builder.diagnosis;
            this.dynamicSql = builder.dynamicSql;
            this.executions = builder.executions;
            this.lastExecutedTime = builder.lastExecutedTime;
            this.riskLevel = builder.riskLevel;
            this.sqlId = builder.sqlId;
            this.sqlList = builder.sqlList;
            this.sqlTextShort = builder.sqlTextShort;
            this.suggestion = builder.suggestion;
            this.sumDbTime = builder.sumDbTime;
            this.sumElapsedTime = builder.sumElapsedTime;
            this.sumRetryCount = builder.sumRetryCount;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgDbTime
         */
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        /**
         * @return avgElapsedTime
         */
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        /**
         * @return avgGetPlanTime
         */
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        /**
         * @return avgLogicalReads
         */
        public Float getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        /**
         * @return avgRetryCount
         */
        public Float getAvgRetryCount() {
            return this.avgRetryCount;
        }

        /**
         * @return cpuTime
         */
        public Double getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return diagTypes
         */
        public java.util.List < String > getDiagTypes() {
            return this.diagTypes;
        }

        /**
         * @return diagnosis
         */
        public String getDiagnosis() {
            return this.diagnosis;
        }

        /**
         * @return dynamicSql
         */
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        /**
         * @return executions
         */
        public Double getExecutions() {
            return this.executions;
        }

        /**
         * @return lastExecutedTime
         */
        public Double getLastExecutedTime() {
            return this.lastExecutedTime;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlList
         */
        public java.util.List < SqlList> getSqlList() {
            return this.sqlList;
        }

        /**
         * @return sqlTextShort
         */
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return sumDbTime
         */
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        /**
         * @return sumElapsedTime
         */
        public String getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        /**
         * @return sumRetryCount
         */
        public Float getSumRetryCount() {
            return this.sumRetryCount;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Double avgCpuTime; 
            private Double avgDbTime; 
            private Double avgElapsedTime; 
            private Double avgGetPlanTime; 
            private Float avgLogicalReads; 
            private Float avgRetryCount; 
            private Double cpuTime; 
            private String dbName; 
            private java.util.List < String > diagTypes; 
            private String diagnosis; 
            private Boolean dynamicSql; 
            private Double executions; 
            private Double lastExecutedTime; 
            private String riskLevel; 
            private String sqlId; 
            private java.util.List < SqlList> sqlList; 
            private String sqlTextShort; 
            private String suggestion; 
            private Double sumDbTime; 
            private String sumElapsedTime; 
            private Float sumRetryCount; 
            private String userName; 

            /**
             * Average CPU time of the suspicious SQL.
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * AvgDbTime.
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * Average response time of the suspicious SQL.
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * Average time to obtain the execution plan of the suspicious SQL.
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * AvgLogicalReads.
             */
            public Builder avgLogicalReads(Float avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * AvgRetryCount.
             */
            public Builder avgRetryCount(Float avgRetryCount) {
                this.avgRetryCount = avgRetryCount;
                return this;
            }

            /**
             * CPU time of the suspicious SQL.
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The type of the diagnosis.
             */
            public Builder diagTypes(java.util.List < String > diagTypes) {
                this.diagTypes = diagTypes;
                return this;
            }

            /**
             * The details of diagnosis.
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * DynamicSql.
             */
            public Builder dynamicSql(Boolean dynamicSql) {
                this.dynamicSql = dynamicSql;
                return this;
            }

            /**
             * Total execution count of the suspicious SQL.
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * Last execution time of the suspicious SQL.
             */
            public Builder lastExecutedTime(Double lastExecutedTime) {
                this.lastExecutedTime = lastExecutedTime;
                return this;
            }

            /**
             * Risk level.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SQL ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlList.
             */
            public Builder sqlList(java.util.List < SqlList> sqlList) {
                this.sqlList = sqlList;
                return this;
            }

            /**
             * Prefix of the SQL text.
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
                return this;
            }

            /**
             * Suggestion for the suspicious SQL.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * SumDbTime.
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * Total response time of the suspicious SQL.
             */
            public Builder sumElapsedTime(String sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * SumRetryCount.
             */
            public Builder sumRetryCount(Float sumRetryCount) {
                this.sumRetryCount = sumRetryCount;
                return this;
            }

            /**
             * Username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
