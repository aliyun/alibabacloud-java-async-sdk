// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogTrendResponseBody</p>
 */
public class DescribeSlowLogTrendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlowLogTrend")
    private SlowLogTrend slowLogTrend;

    private DescribeSlowLogTrendResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slowLogTrend = builder.slowLogTrend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slowLogTrend
     */
    public SlowLogTrend getSlowLogTrend() {
        return this.slowLogTrend;
    }

    public static final class Builder {
        private String requestId; 
        private SlowLogTrend slowLogTrend; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlowLogTrend.
         */
        public Builder slowLogTrend(SlowLogTrend slowLogTrend) {
            this.slowLogTrend = slowLogTrend;
            return this;
        }

        public DescribeSlowLogTrendResponseBody build() {
            return new DescribeSlowLogTrendResponseBody(this);
        } 

    } 

    public static class ResultSet extends TeaModel {
        @NameInMap("AvgQueryDurationMs")
        private String avgQueryDurationMs;

        @NameInMap("Count")
        private String count;

        @NameInMap("MaxQueryDurationMs")
        private String maxQueryDurationMs;

        @NameInMap("MinQueryDurationMs")
        private String minQueryDurationMs;

        @NameInMap("QueryStartTime")
        private String queryStartTime;

        private ResultSet(Builder builder) {
            this.avgQueryDurationMs = builder.avgQueryDurationMs;
            this.count = builder.count;
            this.maxQueryDurationMs = builder.maxQueryDurationMs;
            this.minQueryDurationMs = builder.minQueryDurationMs;
            this.queryStartTime = builder.queryStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultSet create() {
            return builder().build();
        }

        /**
         * @return avgQueryDurationMs
         */
        public String getAvgQueryDurationMs() {
            return this.avgQueryDurationMs;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return maxQueryDurationMs
         */
        public String getMaxQueryDurationMs() {
            return this.maxQueryDurationMs;
        }

        /**
         * @return minQueryDurationMs
         */
        public String getMinQueryDurationMs() {
            return this.minQueryDurationMs;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public static final class Builder {
            private String avgQueryDurationMs; 
            private String count; 
            private String maxQueryDurationMs; 
            private String minQueryDurationMs; 
            private String queryStartTime; 

            /**
             * AvgQueryDurationMs.
             */
            public Builder avgQueryDurationMs(String avgQueryDurationMs) {
                this.avgQueryDurationMs = avgQueryDurationMs;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * MaxQueryDurationMs.
             */
            public Builder maxQueryDurationMs(String maxQueryDurationMs) {
                this.maxQueryDurationMs = maxQueryDurationMs;
                return this;
            }

            /**
             * MinQueryDurationMs.
             */
            public Builder minQueryDurationMs(String minQueryDurationMs) {
                this.minQueryDurationMs = minQueryDurationMs;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            public ResultSet build() {
                return new ResultSet(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResultSet")
        private java.util.List < ResultSet> resultSet;

        private Data(Builder builder) {
            this.resultSet = builder.resultSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultSet
         */
        public java.util.List < ResultSet> getResultSet() {
            return this.resultSet;
        }

        public static final class Builder {
            private java.util.List < ResultSet> resultSet; 

            /**
             * ResultSet.
             */
            public Builder resultSet(java.util.List < ResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("BytesRead")
        private Integer bytesRead;

        @NameInMap("ElapsedTime")
        private Float elapsedTime;

        @NameInMap("RowsRead")
        private Integer rowsRead;

        private Statistics(Builder builder) {
            this.bytesRead = builder.bytesRead;
            this.elapsedTime = builder.elapsedTime;
            this.rowsRead = builder.rowsRead;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return bytesRead
         */
        public Integer getBytesRead() {
            return this.bytesRead;
        }

        /**
         * @return elapsedTime
         */
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return rowsRead
         */
        public Integer getRowsRead() {
            return this.rowsRead;
        }

        public static final class Builder {
            private Integer bytesRead; 
            private Float elapsedTime; 
            private Integer rowsRead; 

            /**
             * BytesRead.
             */
            public Builder bytesRead(Integer bytesRead) {
                this.bytesRead = bytesRead;
                return this;
            }

            /**
             * ElapsedTime.
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * RowsRead.
             */
            public Builder rowsRead(Integer rowsRead) {
                this.rowsRead = rowsRead;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    public static class TableSchemaResultSet extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private TableSchemaResultSet(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSchemaResultSet create() {
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

            public TableSchemaResultSet build() {
                return new TableSchemaResultSet(this);
            } 

        } 

    }
    public static class TableSchema extends TeaModel {
        @NameInMap("ResultSet")
        private java.util.List < TableSchemaResultSet> resultSet;

        private TableSchema(Builder builder) {
            this.resultSet = builder.resultSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSchema create() {
            return builder().build();
        }

        /**
         * @return resultSet
         */
        public java.util.List < TableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

        public static final class Builder {
            private java.util.List < TableSchemaResultSet> resultSet; 

            /**
             * ResultSet.
             */
            public Builder resultSet(java.util.List < TableSchemaResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            public TableSchema build() {
                return new TableSchema(this);
            } 

        } 

    }
    public static class SlowLogTrend extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("Rows")
        private String rows;

        @NameInMap("RowsBeforeLimitAtLeast")
        private String rowsBeforeLimitAtLeast;

        @NameInMap("Statistics")
        private Statistics statistics;

        @NameInMap("TableSchema")
        private TableSchema tableSchema;

        private SlowLogTrend(Builder builder) {
            this.data = builder.data;
            this.rows = builder.rows;
            this.rowsBeforeLimitAtLeast = builder.rowsBeforeLimitAtLeast;
            this.statistics = builder.statistics;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowLogTrend create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return rows
         */
        public String getRows() {
            return this.rows;
        }

        /**
         * @return rowsBeforeLimitAtLeast
         */
        public String getRowsBeforeLimitAtLeast() {
            return this.rowsBeforeLimitAtLeast;
        }

        /**
         * @return statistics
         */
        public Statistics getStatistics() {
            return this.statistics;
        }

        /**
         * @return tableSchema
         */
        public TableSchema getTableSchema() {
            return this.tableSchema;
        }

        public static final class Builder {
            private Data data; 
            private String rows; 
            private String rowsBeforeLimitAtLeast; 
            private Statistics statistics; 
            private TableSchema tableSchema; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * RowsBeforeLimitAtLeast.
             */
            public Builder rowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
                this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * TableSchema.
             */
            public Builder tableSchema(TableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public SlowLogTrend build() {
                return new SlowLogTrend(this);
            } 

        } 

    }
}
