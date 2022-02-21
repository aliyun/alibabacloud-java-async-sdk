// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessListResponseBody</p>
 */
public class DescribeProcessListResponseBody extends TeaModel {
    @NameInMap("ProcessList")
    private ProcessList processList;

    @NameInMap("RequestId")
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
         * ProcessList.
         */
        public Builder processList(ProcessList processList) {
            this.processList = processList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessListResponseBody build() {
            return new DescribeProcessListResponseBody(this);
        } 

    } 

    public static class ResultSet extends TeaModel {
        @NameInMap("InitialAddress")
        private String initialAddress;

        @NameInMap("InitialQueryId")
        private String initialQueryId;

        @NameInMap("InitialUser")
        private String initialUser;

        @NameInMap("Query")
        private String query;

        @NameInMap("QueryDurationMs")
        private String queryDurationMs;

        @NameInMap("QueryStartTime")
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
             * InitialAddress.
             */
            public Builder initialAddress(String initialAddress) {
                this.initialAddress = initialAddress;
                return this;
            }

            /**
             * InitialQueryId.
             */
            public Builder initialQueryId(String initialQueryId) {
                this.initialQueryId = initialQueryId;
                return this;
            }

            /**
             * InitialUser.
             */
            public Builder initialUser(String initialUser) {
                this.initialUser = initialUser;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * QueryDurationMs.
             */
            public Builder queryDurationMs(String queryDurationMs) {
                this.queryDurationMs = queryDurationMs;
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
    public static class ProcessList extends TeaModel {
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

            public ProcessList build() {
                return new ProcessList(this);
            } 

        } 

    }
}
