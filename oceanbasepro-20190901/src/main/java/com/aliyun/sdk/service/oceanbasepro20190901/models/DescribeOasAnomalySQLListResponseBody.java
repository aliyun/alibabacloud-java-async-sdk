// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeOasAnomalySQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasAnomalySQLListResponseBody</p>
 */
public class DescribeOasAnomalySQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The information about suspicious SQL statements.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469**-AA6F-4D**-B3DB-A***********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOasAnomalySQLListResponseBody build() {
            return new DescribeOasAnomalySQLListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOasAnomalySQLListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOasAnomalySQLListResponseBody</p>
     */
    public static class SqlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgDbTime")
        private Double avgDbTime;

        @com.aliyun.core.annotation.NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @com.aliyun.core.annotation.NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalReads")
        private Float avgLogicalReads;

        @com.aliyun.core.annotation.NameInMap("AvgRetryCount")
        private Float avgRetryCount;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Double cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DiagTypes")
        private java.util.List<String> diagTypes;

        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private String diagnosis;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Double executions;

        @com.aliyun.core.annotation.NameInMap("LastExecutedTime")
        private String lastExecutedTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlTextShort")
        private String sqlTextShort;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("SumDbTime")
        private Double sumDbTime;

        @com.aliyun.core.annotation.NameInMap("SumElapsedTime")
        private String sumElapsedTime;

        @com.aliyun.core.annotation.NameInMap("SumRetryCount")
        private Float sumRetryCount;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
        public java.util.List<String> getDiagTypes() {
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
        public String getLastExecutedTime() {
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
            private java.util.List<String> diagTypes; 
            private String diagnosis; 
            private Double executions; 
            private String lastExecutedTime; 
            private String riskLevel; 
            private String sqlId; 
            private String sqlTextShort; 
            private String suggestion; 
            private Double sumDbTime; 
            private String sumElapsedTime; 
            private Float sumRetryCount; 
            private String userName; 

            /**
             * <p>The average CPU time.</p>
             * 
             * <strong>example:</strong>
             * <p>100.24</p>
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * <p>The average DB time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * <p>The average response time.</p>
             * 
             * <strong>example:</strong>
             * <p>100.28</p>
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * <p>The average plan generation time.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * <p>The average number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder avgLogicalReads(Float avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * <p>The average number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder avgRetryCount(Float avgRetryCount) {
                this.avgRetryCount = avgRetryCount;
                return this;
            }

            /**
             * <p>The total CPU time.</p>
             * 
             * <strong>example:</strong>
             * <p>100.23</p>
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_hsp****eway</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The diagnostic types.</p>
             */
            public Builder diagTypes(java.util.List<String> diagTypes) {
                this.diagTypes = diagTypes;
                return this;
            }

            /**
             * <p>The diagnostic details. </p>
             * <blockquote>
             * <p>This parameter is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * <p>The total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * <p>The last execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-12T04:38:38Z</p>
             */
            public Builder lastExecutedTime(String lastExecutedTime) {
                this.lastExecutedTime = lastExecutedTime;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The ID of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>3A645<strong><strong>789F13DE0CF6D084FF9</strong></strong></p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The prefix of the SQL text.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test</p>
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
                return this;
            }

            /**
             * <p>The suggestion on the suspicious SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Role&quot;: &quot;eSG&quot;, &quot;Result&quot;: &quot;100&quot;, &quot;Suggestion&quot;: &quot;TRACER_OTHER_ERR&quot;}</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The total DB time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * <p>The total response time.</p>
             * 
             * <strong>example:</strong>
             * <p>11452126.36</p>
             */
            public Builder sumElapsedTime(String sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * <p>The total number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder sumRetryCount(Float sumRetryCount) {
                this.sumRetryCount = sumRetryCount;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
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
    /**
     * 
     * {@link DescribeOasAnomalySQLListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOasAnomalySQLListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgDbTime")
        private Double avgDbTime;

        @com.aliyun.core.annotation.NameInMap("AvgElapsedTime")
        private Double avgElapsedTime;

        @com.aliyun.core.annotation.NameInMap("AvgGetPlanTime")
        private Double avgGetPlanTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalReads")
        private Float avgLogicalReads;

        @com.aliyun.core.annotation.NameInMap("AvgRetryCount")
        private Float avgRetryCount;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Double cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DiagTypes")
        private java.util.List<String> diagTypes;

        @com.aliyun.core.annotation.NameInMap("Diagnosis")
        private String diagnosis;

        @com.aliyun.core.annotation.NameInMap("DynamicSql")
        private Boolean dynamicSql;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Double executions;

        @com.aliyun.core.annotation.NameInMap("LastExecutedTime")
        private Double lastExecutedTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlList")
        private java.util.List<SqlList> sqlList;

        @com.aliyun.core.annotation.NameInMap("SqlTextShort")
        private String sqlTextShort;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("SumDbTime")
        private Double sumDbTime;

        @com.aliyun.core.annotation.NameInMap("SumElapsedTime")
        private String sumElapsedTime;

        @com.aliyun.core.annotation.NameInMap("SumRetryCount")
        private Float sumRetryCount;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
        public java.util.List<String> getDiagTypes() {
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
        public java.util.List<SqlList> getSqlList() {
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
            private java.util.List<String> diagTypes; 
            private String diagnosis; 
            private Boolean dynamicSql; 
            private Double executions; 
            private Double lastExecutedTime; 
            private String riskLevel; 
            private String sqlId; 
            private java.util.List<SqlList> sqlList; 
            private String sqlTextShort; 
            private String suggestion; 
            private Double sumDbTime; 
            private String sumElapsedTime; 
            private Float sumRetryCount; 
            private String userName; 

            /**
             * <p>Average CPU time of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>100.24</p>
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * <p>The average DB time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder avgDbTime(Double avgDbTime) {
                this.avgDbTime = avgDbTime;
                return this;
            }

            /**
             * <p>Average response time of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>100.28</p>
             */
            public Builder avgElapsedTime(Double avgElapsedTime) {
                this.avgElapsedTime = avgElapsedTime;
                return this;
            }

            /**
             * <p>Average time to obtain the execution plan of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgGetPlanTime(Double avgGetPlanTime) {
                this.avgGetPlanTime = avgGetPlanTime;
                return this;
            }

            /**
             * <p>The average number of logical reads.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder avgLogicalReads(Float avgLogicalReads) {
                this.avgLogicalReads = avgLogicalReads;
                return this;
            }

            /**
             * <p>The average number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder avgRetryCount(Float avgRetryCount) {
                this.avgRetryCount = avgRetryCount;
                return this;
            }

            /**
             * <p>CPU time of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>100.23</p>
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db_***</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The type of the diagnosis.</p>
             */
            public Builder diagTypes(java.util.List<String> diagTypes) {
                this.diagTypes = diagTypes;
                return this;
            }

            /**
             * <p>The details of diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder diagnosis(String diagnosis) {
                this.diagnosis = diagnosis;
                return this;
            }

            /**
             * <p>是否动态SQL</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dynamicSql(Boolean dynamicSql) {
                this.dynamicSql = dynamicSql;
                return this;
            }

            /**
             * <p>Total execution count of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executions(Double executions) {
                this.executions = executions;
                return this;
            }

            /**
             * <p>Last execution time of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-12T04:38:38Z</p>
             */
            public Builder lastExecutedTime(Double lastExecutedTime) {
                this.lastExecutedTime = lastExecutedTime;
                return this;
            }

            /**
             * <p>Risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>SQL ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The list of SQL statements.</p>
             */
            public Builder sqlList(java.util.List<SqlList> sqlList) {
                this.sqlList = sqlList;
                return this;
            }

            /**
             * <p>Prefix of the SQL text.</p>
             */
            public Builder sqlTextShort(String sqlTextShort) {
                this.sqlTextShort = sqlTextShort;
                return this;
            }

            /**
             * <p>Suggestion for the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>review</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The total DB time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sumDbTime(Double sumDbTime) {
                this.sumDbTime = sumDbTime;
                return this;
            }

            /**
             * <p>Total response time of the suspicious SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>11452126.36</p>
             */
            public Builder sumElapsedTime(String sumElapsedTime) {
                this.sumElapsedTime = sumElapsedTime;
                return this;
            }

            /**
             * <p>The total number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder sumRetryCount(Float sumRetryCount) {
                this.sumRetryCount = sumRetryCount;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
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
