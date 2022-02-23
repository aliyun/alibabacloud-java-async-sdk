// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySqlAnalysisDataResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySqlAnalysisDataResponseBody</p>
 */
public class QuerySqlAnalysisDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySqlAnalysisDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySqlAnalysisDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Long code) {
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySqlAnalysisDataResponseBody build() {
            return new QuerySqlAnalysisDataResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AvgRowsExamined")
        private Long avgRowsExamined;

        @NameInMap("AvgRt")
        private Double avgRt;

        @NameInMap("Cnt")
        private Long cnt;

        @NameInMap("CurrentEndTime")
        private Long currentEndTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("ErrorCnt")
        private Long errorCnt;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxRowsExamined")
        private Long maxRowsExamined;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("SqlId")
        private String sqlId;

        @NameInMap("SqlTextFeature")
        private String sqlTextFeature;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("SumRt")
        private Double sumRt;

        @NameInMap("TableList")
        private String tableList;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        private List(Builder builder) {
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRt = builder.avgRt;
            this.cnt = builder.cnt;
            this.currentEndTime = builder.currentEndTime;
            this.dbName = builder.dbName;
            this.errorCnt = builder.errorCnt;
            this.firstTime = builder.firstTime;
            this.instanceId = builder.instanceId;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.sqlTextFeature = builder.sqlTextFeature;
            this.sqlType = builder.sqlType;
            this.sumRt = builder.sumRt;
            this.tableList = builder.tableList;
            this.taskId = builder.taskId;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgRowsExamined
         */
        public Long getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return cnt
         */
        public Long getCnt() {
            return this.cnt;
        }

        /**
         * @return currentEndTime
         */
        public Long getCurrentEndTime() {
            return this.currentEndTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return errorCnt
         */
        public Long getErrorCnt() {
            return this.errorCnt;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxRowsExamined
         */
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlTextFeature
         */
        public String getSqlTextFeature() {
            return this.sqlTextFeature;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return sumRt
         */
        public Double getSumRt() {
            return this.sumRt;
        }

        /**
         * @return tableList
         */
        public String getTableList() {
            return this.tableList;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long avgRowsExamined; 
            private Double avgRt; 
            private Long cnt; 
            private Long currentEndTime; 
            private String dbName; 
            private Long errorCnt; 
            private Long firstTime; 
            private String instanceId; 
            private Long maxRowsExamined; 
            private String sql; 
            private String sqlId; 
            private String sqlTextFeature; 
            private String sqlType; 
            private Double sumRt; 
            private String tableList; 
            private String taskId; 
            private String type; 
            private String userId; 

            /**
             * AvgRowsExamined.
             */
            public Builder avgRowsExamined(Long avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * Cnt.
             */
            public Builder cnt(Long cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * CurrentEndTime.
             */
            public Builder currentEndTime(Long currentEndTime) {
                this.currentEndTime = currentEndTime;
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
             * ErrorCnt.
             */
            public Builder errorCnt(Long errorCnt) {
                this.errorCnt = errorCnt;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
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
             * MaxRowsExamined.
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
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
             * SqlTextFeature.
             */
            public Builder sqlTextFeature(String sqlTextFeature) {
                this.sqlTextFeature = sqlTextFeature;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * SumRt.
             */
            public Builder sumRt(Double sumRt) {
                this.sumRt = sumRt;
                return this;
            }

            /**
             * TableList.
             */
            public Builder tableList(String tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
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
