// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsPartitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsPartitionResponseBody</p>
 */
public class GetMmsPartitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsPartitionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsPartitionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsPartitionResponseBody build() {
            return new GetMmsPartitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsPartitionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsPartitionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("numRows")
        private Long numRows;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Boolean updated;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Data(Builder builder) {
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.id = builder.id;
            this.lastDdlTime = builder.lastDdlTime;
            this.numRows = builder.numRows;
            this.size = builder.size;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.status = builder.status;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.updated = builder.updated;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return numRows
         */
        public Long getNumRows() {
            return this.numRows;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return updated
         */
        public Boolean getUpdated() {
            return this.updated;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbName; 
            private Long id; 
            private String lastDdlTime; 
            private Long numRows; 
            private Long size; 
            private Long sourceId; 
            private String sourceName; 
            private String status; 
            private Long tableId; 
            private String tableName; 
            private Boolean updated; 
            private String value; 

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * dbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>lastDdlTime</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * numRows.
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tableId.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
