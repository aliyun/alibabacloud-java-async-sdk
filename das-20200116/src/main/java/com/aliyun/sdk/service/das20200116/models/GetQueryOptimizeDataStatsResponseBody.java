// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQueryOptimizeDataStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeDataStatsResponseBody</p>
 */
public class GetQueryOptimizeDataStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetQueryOptimizeDataStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataStatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQueryOptimizeDataStatsResponseBody build() {
            return new GetQueryOptimizeDataStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQueryOptimizeDataStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeDataStatsResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RuleList(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>DAS_NOT_IMPORTANT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>Predefined</strong></li>
             * <li><strong>UserDefined</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Predefined</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueryOptimizeDataStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeDataStatsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgLockTime")
        private Double avgLockTime;

        @com.aliyun.core.annotation.NameInMap("AvgQueryTime")
        private Double avgQueryTime;

        @com.aliyun.core.annotation.NameInMap("AvgRowsAffected")
        private Double avgRowsAffected;

        @com.aliyun.core.annotation.NameInMap("AvgRowsExamined")
        private Double avgRowsExamined;

        @com.aliyun.core.annotation.NameInMap("AvgRowsSent")
        private Double avgRowsSent;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Dbname")
        private String dbname;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxLockTime")
        private Double maxLockTime;

        @com.aliyun.core.annotation.NameInMap("MaxQueryTime")
        private Double maxQueryTime;

        @com.aliyun.core.annotation.NameInMap("MaxRowsAffected")
        private Long maxRowsAffected;

        @com.aliyun.core.annotation.NameInMap("MaxRowsExamined")
        private Long maxRowsExamined;

        @com.aliyun.core.annotation.NameInMap("MaxRowsSent")
        private Long maxRowsSent;

        @com.aliyun.core.annotation.NameInMap("Psql")
        private String psql;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlSample")
        private String sqlSample;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private List(Builder builder) {
            this.avgLockTime = builder.avgLockTime;
            this.avgQueryTime = builder.avgQueryTime;
            this.avgRowsAffected = builder.avgRowsAffected;
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRowsSent = builder.avgRowsSent;
            this.count = builder.count;
            this.dbname = builder.dbname;
            this.instanceId = builder.instanceId;
            this.maxLockTime = builder.maxLockTime;
            this.maxQueryTime = builder.maxQueryTime;
            this.maxRowsAffected = builder.maxRowsAffected;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.maxRowsSent = builder.maxRowsSent;
            this.psql = builder.psql;
            this.ruleList = builder.ruleList;
            this.sqlId = builder.sqlId;
            this.sqlSample = builder.sqlSample;
            this.sqlType = builder.sqlType;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgLockTime
         */
        public Double getAvgLockTime() {
            return this.avgLockTime;
        }

        /**
         * @return avgQueryTime
         */
        public Double getAvgQueryTime() {
            return this.avgQueryTime;
        }

        /**
         * @return avgRowsAffected
         */
        public Double getAvgRowsAffected() {
            return this.avgRowsAffected;
        }

        /**
         * @return avgRowsExamined
         */
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        /**
         * @return avgRowsSent
         */
        public Double getAvgRowsSent() {
            return this.avgRowsSent;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return dbname
         */
        public String getDbname() {
            return this.dbname;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxLockTime
         */
        public Double getMaxLockTime() {
            return this.maxLockTime;
        }

        /**
         * @return maxQueryTime
         */
        public Double getMaxQueryTime() {
            return this.maxQueryTime;
        }

        /**
         * @return maxRowsAffected
         */
        public Long getMaxRowsAffected() {
            return this.maxRowsAffected;
        }

        /**
         * @return maxRowsExamined
         */
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        /**
         * @return maxRowsSent
         */
        public Long getMaxRowsSent() {
            return this.maxRowsSent;
        }

        /**
         * @return psql
         */
        public String getPsql() {
            return this.psql;
        }

        /**
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlSample
         */
        public String getSqlSample() {
            return this.sqlSample;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Double avgLockTime; 
            private Double avgQueryTime; 
            private Double avgRowsAffected; 
            private Double avgRowsExamined; 
            private Double avgRowsSent; 
            private Integer count; 
            private String dbname; 
            private String instanceId; 
            private Double maxLockTime; 
            private Double maxQueryTime; 
            private Long maxRowsAffected; 
            private Long maxRowsExamined; 
            private Long maxRowsSent; 
            private String psql; 
            private java.util.List < RuleList> ruleList; 
            private String sqlId; 
            private String sqlSample; 
            private String sqlType; 
            private String user; 

            /**
             * <p>The average lock wait time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder avgLockTime(Double avgLockTime) {
                this.avgLockTime = avgLockTime;
                return this;
            }

            /**
             * <p>The average query execution time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
             */
            public Builder avgQueryTime(Double avgQueryTime) {
                this.avgQueryTime = avgQueryTime;
                return this;
            }

            /**
             * <p>The average number of rows affected by the SQL statement.</p>
             * <blockquote>
             * <p>A value of -1 indicates that this parameter is not collected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100.1</p>
             */
            public Builder avgRowsAffected(Double avgRowsAffected) {
                this.avgRowsAffected = avgRowsAffected;
                return this;
            }

            /**
             * <p>The average number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100.1</p>
             */
            public Builder avgRowsExamined(Double avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * <p>The average number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100.1</p>
             */
            public Builder avgRowsSent(Double avgRowsSent) {
                this.avgRowsSent = avgRowsSent;
                return this;
            }

            /**
             * <p>The number of times that the SQL template is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the database to which the SQL template belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb01</p>
             */
            public Builder dbname(String dbname) {
                this.dbname = dbname;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The longest lock wait time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder maxLockTime(Double maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * <p>The longest query execution time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1</p>
             */
            public Builder maxQueryTime(Double maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * <p>The largest number of rows affected by the SQL template.</p>
             * <blockquote>
             * <p>A value of -1 indicates that this parameter is not collected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxRowsAffected(Long maxRowsAffected) {
                this.maxRowsAffected = maxRowsAffected;
                return this;
            }

            /**
             * <p>The largest number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * <p>The largest number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxRowsSent(Long maxRowsSent) {
                this.maxRowsSent = maxRowsSent;
                return this;
            }

            /**
             * <p>The SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>select 1</p>
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * <p>The information about the rules.</p>
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>The SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The sample query that took the longest time to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>select 2</p>
             */
            public Builder sqlSample(String sqlSample) {
                this.sqlSample = sqlSample;
                return this;
            }

            /**
             * <p>The type of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The account of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueryOptimizeDataStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueryOptimizeDataStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private java.util.List < List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The information about the SQL templates.</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
