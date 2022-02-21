// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeDataStatsResponseBody</p>
 */
public class GetQueryOptimizeDataStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("AvgLockTime")
        private Double avgLockTime;

        @NameInMap("AvgQueryTime")
        private Double avgQueryTime;

        @NameInMap("AvgRowsAffected")
        private Double avgRowsAffected;

        @NameInMap("AvgRowsExamined")
        private Double avgRowsExamined;

        @NameInMap("AvgRowsSent")
        private Double avgRowsSent;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Dbname")
        private String dbname;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxLockTime")
        private Double maxLockTime;

        @NameInMap("MaxQueryTime")
        private Double maxQueryTime;

        @NameInMap("MaxRowsAffected")
        private Long maxRowsAffected;

        @NameInMap("MaxRowsExamined")
        private Long maxRowsExamined;

        @NameInMap("MaxRowsSent")
        private Long maxRowsSent;

        @NameInMap("Psql")
        private String psql;

        @NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlSample")
        private String sqlSample;

        @NameInMap("SqlType")
        private String sqlType;

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

            /**
             * AvgLockTime.
             */
            public Builder avgLockTime(Double avgLockTime) {
                this.avgLockTime = avgLockTime;
                return this;
            }

            /**
             * AvgQueryTime.
             */
            public Builder avgQueryTime(Double avgQueryTime) {
                this.avgQueryTime = avgQueryTime;
                return this;
            }

            /**
             * AvgRowsAffected.
             */
            public Builder avgRowsAffected(Double avgRowsAffected) {
                this.avgRowsAffected = avgRowsAffected;
                return this;
            }

            /**
             * AvgRowsExamined.
             */
            public Builder avgRowsExamined(Double avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * AvgRowsSent.
             */
            public Builder avgRowsSent(Double avgRowsSent) {
                this.avgRowsSent = avgRowsSent;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Dbname.
             */
            public Builder dbname(String dbname) {
                this.dbname = dbname;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MaxLockTime.
             */
            public Builder maxLockTime(Double maxLockTime) {
                this.maxLockTime = maxLockTime;
                return this;
            }

            /**
             * MaxQueryTime.
             */
            public Builder maxQueryTime(Double maxQueryTime) {
                this.maxQueryTime = maxQueryTime;
                return this;
            }

            /**
             * MaxRowsAffected.
             */
            public Builder maxRowsAffected(Long maxRowsAffected) {
                this.maxRowsAffected = maxRowsAffected;
                return this;
            }

            /**
             * MaxRowsExamined.
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * MaxRowsSent.
             */
            public Builder maxRowsSent(Long maxRowsSent) {
                this.maxRowsSent = maxRowsSent;
                return this;
            }

            /**
             * Psql.
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
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
             * SqlSample.
             */
            public Builder sqlSample(String sqlSample) {
                this.sqlSample = sqlSample;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Extra")
        private String extra;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
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
