// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessListResponseBody</p>
 */
public class DescribeProcessListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProcessList")
    private ProcessList processList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProcessListResponseBody(Builder builder) {
        this.processList = builder.processList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessListResponseBody create() {
        return builder().build();
    }

    /**
     * @return processList
     */
    public ProcessList getProcessList() {
        return this.processList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProcessList processList; 
        private String requestId; 

        /**
         * <p>The queries.</p>
         */
        public Builder processList(ProcessList processList) {
            this.processList = processList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FD61BB0D-788A-5185-A8E3-1B90BA8F6F04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessListResponseBody build() {
            return new DescribeProcessListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class ResultSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitialAddress")
        private String initialAddress;

        @com.aliyun.core.annotation.NameInMap("InitialQueryId")
        private String initialQueryId;

        @com.aliyun.core.annotation.NameInMap("InitialUser")
        private String initialUser;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
        private String queryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        private ResultSet(Builder builder) {
            this.initialAddress = builder.initialAddress;
            this.initialQueryId = builder.initialQueryId;
            this.initialUser = builder.initialUser;
            this.query = builder.query;
            this.queryDurationMs = builder.queryDurationMs;
            this.queryStartTime = builder.queryStartTime;
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

        public static final class Builder {
            private String initialAddress; 
            private String initialQueryId; 
            private String initialUser; 
            private String query; 
            private String queryDurationMs; 
            private String queryStartTime; 

            /**
             * <p>The IP address of the client that initiates the query.</p>
             * 
             * <strong>example:</strong>
             * <p>::ffff:10.1.XX.XX</p>
             */
            public Builder initialAddress(String initialAddress) {
                this.initialAddress = initialAddress;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2dd144fd-4230-4249-b15c-e63f964fbb5a</p>
             */
            public Builder initialQueryId(String initialQueryId) {
                this.initialQueryId = initialQueryId;
                return this;
            }

            /**
             * <p>The database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder initialUser(String initialUser) {
                this.initialUser = initialUser;
                return this;
            }

            /**
             * <p>The SQL statement that is executed in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from test order by score limit 1;</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder queryDurationMs(String queryDurationMs) {
                this.queryDurationMs = queryDurationMs;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The value is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-02T09:14:48Z</p>
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
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultSet")
        private java.util.List<ResultSet> resultSet;

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
        public java.util.List<ResultSet> getResultSet() {
            return this.resultSet;
        }

        public static final class Builder {
            private java.util.List<ResultSet> resultSet; 

            /**
             * ResultSet.
             */
            public Builder resultSet(java.util.List<ResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
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
             * <p>The size of the data that was scanned. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>9141300000</p>
             */
            public Builder bytesRead(Integer bytesRead) {
                this.bytesRead = bytesRead;
                return this;
            }

            /**
             * <p>The average response time.</p>
             * 
             * <strong>example:</strong>
             * <p>4156</p>
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
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
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
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
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>InitialUser</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
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
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class TableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultSet")
        private java.util.List<TableSchemaResultSet> resultSet;

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
        public java.util.List<TableSchemaResultSet> getResultSet() {
            return this.resultSet;
        }

        public static final class Builder {
            private java.util.List<TableSchemaResultSet> resultSet; 

            /**
             * ResultSet.
             */
            public Builder resultSet(java.util.List<TableSchemaResultSet> resultSet) {
                this.resultSet = resultSet;
                return this;
            }

            public TableSchema build() {
                return new TableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessListResponseBody</p>
     */
    public static class ProcessList extends TeaModel {
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

        private ProcessList(Builder builder) {
            this.data = builder.data;
            this.rows = builder.rows;
            this.rowsBeforeLimitAtLeast = builder.rowsBeforeLimitAtLeast;
            this.statistics = builder.statistics;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessList create() {
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
             * <p>The details of the query.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The number of rows returned for the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1145700</p>
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rowsBeforeLimitAtLeast(String rowsBeforeLimitAtLeast) {
                this.rowsBeforeLimitAtLeast = rowsBeforeLimitAtLeast;
                return this;
            }

            /**
             * <p>The statistics of the results.</p>
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>Details of the columns.</p>
             */
            public Builder tableSchema(TableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public ProcessList build() {
                return new ProcessList(this);
            } 

        } 

    }
}
