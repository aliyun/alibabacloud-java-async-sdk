// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlowLogRecords")
    private SlowLogRecords slowLogRecords;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slowLogRecords = builder.slowLogRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slowLogRecords
     */
    public SlowLogRecords getSlowLogRecords() {
        return this.slowLogRecords;
    }

    public static final class Builder {
        private String requestId; 
        private SlowLogRecords slowLogRecords; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details about the slow query logs.
         */
        public Builder slowLogRecords(SlowLogRecords slowLogRecords) {
            this.slowLogRecords = slowLogRecords;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class ResultSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitialAddress")
        private String initialAddress;

        @com.aliyun.core.annotation.NameInMap("InitialQueryId")
        private String initialQueryId;

        @com.aliyun.core.annotation.NameInMap("InitialUser")
        private String initialUser;

        @com.aliyun.core.annotation.NameInMap("MemoryUsage")
        private String memoryUsage;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
        private String queryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("ReadBytes")
        private String readBytes;

        @com.aliyun.core.annotation.NameInMap("ReadRows")
        private String readRows;

        @com.aliyun.core.annotation.NameInMap("ResultBytes")
        private String resultBytes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResultSet(Builder builder) {
            this.initialAddress = builder.initialAddress;
            this.initialQueryId = builder.initialQueryId;
            this.initialUser = builder.initialUser;
            this.memoryUsage = builder.memoryUsage;
            this.query = builder.query;
            this.queryDurationMs = builder.queryDurationMs;
            this.queryStartTime = builder.queryStartTime;
            this.readBytes = builder.readBytes;
            this.readRows = builder.readRows;
            this.resultBytes = builder.resultBytes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultSet create() {
            return builder().build();
        }

        /**
         * @return initialAddress
         */
        public String getInitialAddress() {
            return this.initialAddress;
        }

        /**
         * @return initialQueryId
         */
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        /**
         * @return initialUser
         */
        public String getInitialUser() {
            return this.initialUser;
        }

        /**
         * @return memoryUsage
         */
        public String getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryDurationMs
         */
        public String getQueryDurationMs() {
            return this.queryDurationMs;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        /**
         * @return readBytes
         */
        public String getReadBytes() {
            return this.readBytes;
        }

        /**
         * @return readRows
         */
        public String getReadRows() {
            return this.readRows;
        }

        /**
         * @return resultBytes
         */
        public String getResultBytes() {
            return this.resultBytes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String initialAddress; 
            private String initialQueryId; 
            private String initialUser; 
            private String memoryUsage; 
            private String query; 
            private String queryDurationMs; 
            private String queryStartTime; 
            private String readBytes; 
            private String readRows; 
            private String resultBytes; 
            private String type; 

            /**
             * The IP address of the client that initiated the query.
             */
            public Builder initialAddress(String initialAddress) {
                this.initialAddress = initialAddress;
                return this;
            }

            /**
             * The query ID.
             */
            public Builder initialQueryId(String initialQueryId) {
                this.initialQueryId = initialQueryId;
                return this;
            }

            /**
             * The username that is used to initiate the query.
             */
            public Builder initialUser(String initialUser) {
                this.initialUser = initialUser;
                return this;
            }

            /**
             * The peak memory usage for the query. Unit: bytes.
             */
            public Builder memoryUsage(String memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * The statement that was executed in the query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * The duration of the query. Unit: milliseconds.
             */
            public Builder queryDurationMs(String queryDurationMs) {
                this.queryDurationMs = queryDurationMs;
                return this;
            }

            /**
             * The beginning of the time range to query. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            /**
             * The size of the data read by executing the statement. Unit: bytes.
             */
            public Builder readBytes(String readBytes) {
                this.readBytes = readBytes;
                return this;
            }

            /**
             * The number of rows read by executing the statement.
             */
            public Builder readRows(String readRows) {
                this.readRows = readRows;
                return this;
            }

            /**
             * The size of the result data. Unit: bytes.
             */
            public Builder resultBytes(String resultBytes) {
                this.resultBytes = resultBytes;
                return this;
            }

            /**
             * The query status. Valid values:
             * <p>
             * 
             * *   **QueryFinish**: The query is complete.
             * *   **Processing**: The query is running.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultSet build() {
                return new ResultSet(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultSet")
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
        @com.aliyun.core.annotation.NameInMap("BytesRead")
        private Integer bytesRead;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Float elapsedTime;

        @com.aliyun.core.annotation.NameInMap("RowsRead")
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
             * The total size of data that were read. Unit: bytes.
             */
            public Builder bytesRead(Integer bytesRead) {
                this.bytesRead = bytesRead;
                return this;
            }

            /**
             * The time consumed by the slow query. Unit: milliseconds.
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The total number of rows that were read.
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * The name of the column.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the column.
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
        @com.aliyun.core.annotation.NameInMap("ResultSet")
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
    public static class SlowLogRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("RowsBeforeLimitAtLeast")
        private String rowsBeforeLimitAtLeast;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private Statistics statistics;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private TableSchema tableSchema;

        private SlowLogRecords(Builder builder) {
            this.data = builder.data;
            this.rows = builder.rows;
            this.rowsBeforeLimitAtLeast = builder.rowsBeforeLimitAtLeast;
            this.statistics = builder.statistics;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowLogRecords create() {
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
             * Details about the slow query logs.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The number of rows in the result set.
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder rowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
                this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
                return this;
            }

            /**
             * The statistics of the results.
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The schema of the table in the database.
             */
            public Builder tableSchema(TableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public SlowLogRecords build() {
                return new SlowLogRecords(this);
            } 

        } 

    }
}
