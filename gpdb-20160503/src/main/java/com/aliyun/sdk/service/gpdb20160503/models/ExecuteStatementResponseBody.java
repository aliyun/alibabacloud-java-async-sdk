// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteStatementResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteStatementResponseBody</p>
 */
public class ExecuteStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretArn")
    private String secretArn;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ExecuteStatementResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.DBInstanceId = builder.DBInstanceId;
        this.data = builder.data;
        this.database = builder.database;
        this.id = builder.id;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretArn = builder.secretArn;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteStatementResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createdAt; 
        private String DBInstanceId; 
        private Data data; 
        private String database; 
        private String id; 
        private String message; 
        private String requestId; 
        private String secretArn; 
        private String status; 

        /**
         * The time when the SQL statements were created.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The returned results of the synchronous call.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * The ID of the job for asynchronously executing the SQL statements.
         */
        public Builder id(String id) {
            this.id = id;
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
         * The ARN of the access credential for the created Data API account.
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * The status of the operation. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ExecuteStatementResponseBody build() {
            return new ExecuteStatementResponseBody(this);
        } 

    } 

    public static class ColumnMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnMetadata")
        private java.util.List < ColumnMetadata > columnMetadata;

        private ColumnMetadata(Builder builder) {
            this.columnMetadata = builder.columnMetadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMetadata create() {
            return builder().build();
        }

        /**
         * @return columnMetadata
         */
        public java.util.List < ColumnMetadata > getColumnMetadata() {
            return this.columnMetadata;
        }

        public static final class Builder {
            private java.util.List < ColumnMetadata > columnMetadata; 

            /**
             * ColumnMetadata.
             */
            public Builder columnMetadata(java.util.List < ColumnMetadata > columnMetadata) {
                this.columnMetadata = columnMetadata;
                return this;
            }

            public ColumnMetadata build() {
                return new ColumnMetadata(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List < Field > record;

        private Records(Builder builder) {
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public java.util.List < Field > getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List < Field > record; 

            /**
             * Record.
             */
            public Builder record(java.util.List < Field > record) {
                this.record = record;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class DataRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List < Records> records;

        private DataRecords(Builder builder) {
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataRecords create() {
            return builder().build();
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private java.util.List < Records> records; 

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public DataRecords build() {
                return new DataRecords(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnMetadata")
        private ColumnMetadata columnMetadata;

        @com.aliyun.core.annotation.NameInMap("Records")
        private DataRecords records;

        @com.aliyun.core.annotation.NameInMap("TotalNumRows")
        private Long totalNumRows;

        private Data(Builder builder) {
            this.columnMetadata = builder.columnMetadata;
            this.records = builder.records;
            this.totalNumRows = builder.totalNumRows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return columnMetadata
         */
        public ColumnMetadata getColumnMetadata() {
            return this.columnMetadata;
        }

        /**
         * @return records
         */
        public DataRecords getRecords() {
            return this.records;
        }

        /**
         * @return totalNumRows
         */
        public Long getTotalNumRows() {
            return this.totalNumRows;
        }

        public static final class Builder {
            private ColumnMetadata columnMetadata; 
            private DataRecords records; 
            private Long totalNumRows; 

            /**
             * The metadata of the columns.
             */
            public Builder columnMetadata(ColumnMetadata columnMetadata) {
                this.columnMetadata = columnMetadata;
                return this;
            }

            /**
             * The rows of data.
             */
            public Builder records(DataRecords records) {
                this.records = records;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalNumRows(Long totalNumRows) {
                this.totalNumRows = totalNumRows;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
