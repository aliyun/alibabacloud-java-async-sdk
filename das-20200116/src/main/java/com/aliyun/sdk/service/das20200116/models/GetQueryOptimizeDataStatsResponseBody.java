// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQueryOptimizeDataStatsResponseBody build() {
            return new GetQueryOptimizeDataStatsResponseBody(this);
        } 

    } 

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
             * The rule name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * * **Predefined**
             * * **UserDefined**
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
             * The average lock wait time. Unit: seconds.
             */
            public Builder avgLockTime(Double avgLockTime) {
                this.avgLockTime = avgLockTime;
                return this;
            }

            /**
             * The average query execution time. Unit: seconds.
             */
            public Builder avgQueryTime(Double avgQueryTime) {
                this.avgQueryTime = avgQueryTime;
                return this;
            }

            /**
             * The average number of rows affected by the SQL statement.
             * <p>
             * 
             * > A value of -1 indicates that this parameter is not collected.
             */
            public Builder avgRowsAffected(Double avgRowsAffected) {
                this.avgRowsAffected = avgRowsAffected;
                return this;
            }

            /**
             * The average number of scanned rows.
             */
            public Builder avgRowsExamined(Double avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * The average number of returned rows.
             */
            public Builder avgRowsSent(Double avgRowsSent) {
                this.avgRowsSent = avgRowsSent;
                return this;
            }

            /**
             * The number of times that the SQL template is executed.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the database to which the SQL template belongs.
             */
            public Builder dbname(String dbname) {
                this.dbname = dbname;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The longest lock wait time. Unit: seconds.
             */
            public Builder maxLockTime(Double maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * The longest query execution time. Unit: seconds.
             */
            public Builder maxQueryTime(Double maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * The largest number of rows affected by the SQL template.
             * <p>
             * 
             * > A value of -1 indicates that this parameter is not collected.
             */
            public Builder maxRowsAffected(Long maxRowsAffected) {
                this.maxRowsAffected = maxRowsAffected;
                return this;
            }

            /**
             * The largest number of scanned rows.
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * The largest number of returned rows.
             */
            public Builder maxRowsSent(Long maxRowsSent) {
                this.maxRowsSent = maxRowsSent;
                return this;
            }

            /**
             * The SQL template.
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * The information about the rules.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * The SQL template ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The sample query that took the longest time to execute.
             */
            public Builder sqlSample(String sqlSample) {
                this.sqlSample = sqlSample;
                return this;
            }

            /**
             * The type of the SQL statement.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The account of the database.
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
             * The reserved parameter.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The information about the SQL templates.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The reserved parameter.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The reserved parameter.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
