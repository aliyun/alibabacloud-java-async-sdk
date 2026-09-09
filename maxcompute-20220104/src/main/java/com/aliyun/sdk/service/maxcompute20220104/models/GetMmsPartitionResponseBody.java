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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMmsPartitionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The partition object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9F872FD-5DDE-30A6-8C8A-1B8C6A81059F</p>
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
        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("dstProjectName")
        private String dstProjectName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("dstTableName")
        private String dstTableName;

        @com.aliyun.core.annotation.NameInMap("dstValue")
        private String dstValue;

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
            this.dstProjectName = builder.dstProjectName;
            this.dstSchemaName = builder.dstSchemaName;
            this.dstTableName = builder.dstTableName;
            this.dstValue = builder.dstValue;
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
         * @return dstProjectName
         */
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        /**
         * @return dstSchemaName
         */
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        /**
         * @return dstTableName
         */
        public String getDstTableName() {
            return this.dstTableName;
        }

        /**
         * @return dstValue
         */
        public String getDstValue() {
            return this.dstValue;
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
            private String dstProjectName; 
            private String dstSchemaName; 
            private String dstTableName; 
            private String dstValue; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbId = model.dbId;
                this.dbName = model.dbName;
                this.dstProjectName = model.dstProjectName;
                this.dstSchemaName = model.dstSchemaName;
                this.dstTableName = model.dstTableName;
                this.dstValue = model.dstValue;
                this.id = model.id;
                this.lastDdlTime = model.lastDdlTime;
                this.numRows = model.numRows;
                this.size = model.size;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.status = model.status;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
                this.updated = model.updated;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the database that contains the partition. The name for this metadata layer depends on the data source. For example, it is a Dataset in BigQuery, a Database in Hive, or a Schema in Databricks and MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name of the database. The name for this metadata layer depends on the data source. For example, it is a Dataset in BigQuery, a Database in Hive, or a Schema in Databricks and MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>d1</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The name of the destination MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder dstProjectName(String dstProjectName) {
                this.dstProjectName = dstProjectName;
                return this;
            }

            /**
             * <p>The name of the destination MaxCompute schema. This parameter is null if the destination MaxCompute project does not use a schema layer.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * <p>The name of the destination MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dstTableName(String dstTableName) {
                this.dstTableName = dstTableName;
                return this;
            }

            /**
             * <p>The value of the destination MaxCompute partition. By default, this value is the same as the source partition value.</p>
             * 
             * <strong>example:</strong>
             * <p>p1=1/p2=abc</p>
             */
            public Builder dstValue(String dstValue) {
                this.dstValue = dstValue;
                return this;
            }

            /**
             * <p>The partition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2323</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time of the last DDL operation.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * <p>The number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>2323</p>
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * <p>The data size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>12323</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>200018</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The migration status.</p>
             * 
             * <strong>example:</strong>
             * <p>DONE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>t1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>Indicates whether the metadata is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>The partition value.</p>
             * 
             * <strong>example:</strong>
             * <p>p1=1/p2=abc</p>
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
