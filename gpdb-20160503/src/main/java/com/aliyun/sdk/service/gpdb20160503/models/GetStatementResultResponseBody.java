// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetStatementResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStatementResultResponseBody</p>
 */
public class GetStatementResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetStatementResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatementResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetStatementResultResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The result of the asynchronous call.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>API execution status, with values as follows:</p>
         * <ul>
         * <li><strong>false</strong>: Execution failed.</li>
         * <li><strong>true</strong>: Execution succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetStatementResultResponseBody build() {
            return new GetStatementResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStatementResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatementResultResponseBody</p>
     */
    public static class ColumnMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnMetadata")
        private java.util.List<ColumnMetadata> columnMetadata;

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
        public java.util.List<ColumnMetadata> getColumnMetadata() {
            return this.columnMetadata;
        }

        public static final class Builder {
            private java.util.List<ColumnMetadata> columnMetadata; 

            private Builder() {
            } 

            private Builder(ColumnMetadata model) {
                this.columnMetadata = model.columnMetadata;
            } 

            /**
             * ColumnMetadata.
             */
            public Builder columnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
                this.columnMetadata = columnMetadata;
                return this;
            }

            public ColumnMetadata build() {
                return new ColumnMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatementResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatementResultResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List<Field> record;

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
        public java.util.List<Field> getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List<Field> record; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.record = model.record;
            } 

            /**
             * Record.
             */
            public Builder record(java.util.List<Field> record) {
                this.record = record;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatementResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatementResultResponseBody</p>
     */
    public static class DataRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

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
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private java.util.List<Records> records; 

            private Builder() {
            } 

            private Builder(DataRecords model) {
                this.records = model.records;
            } 

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            public DataRecords build() {
                return new DataRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStatementResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStatementResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.columnMetadata = model.columnMetadata;
                this.records = model.records;
                this.totalNumRows = model.totalNumRows;
            } 

            /**
             * <p>List of column metadata.</p>
             */
            public Builder columnMetadata(ColumnMetadata columnMetadata) {
                this.columnMetadata = columnMetadata;
                return this;
            }

            /**
             * <p>Multiple rows of data.</p>
             */
            public Builder records(DataRecords records) {
                this.records = records;
                return this;
            }

            /**
             * <p>Total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
