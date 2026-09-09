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
 * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsTablesResponseBody</p>
 */
public class ListMmsTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsTablesResponseBody create() {
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

        private Builder(ListMmsTablesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7FB14F1-4ACD-5C73-A755-B302D70AB9AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsTablesResponseBody build() {
            return new ListMmsTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTablesResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.defaultValue = builder.defaultValue;
            this.name = builder.name;
            this.nullable = builder.nullable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String defaultValue; 
            private String name; 
            private Boolean nullable; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.defaultValue = model.defaultValue;
                this.name = model.name;
                this.nullable = model.nullable;
                this.type = model.type;
            } 

            /**
             * <p>The comment on the column.</p>
             * 
             * <strong>example:</strong>
             * <p>user id</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default value of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>user_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the column can be null.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTablesResponseBody</p>
     */
    public static class Partitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Partitions(Builder builder) {
            this.comment = builder.comment;
            this.defaultValue = builder.defaultValue;
            this.name = builder.name;
            this.nullable = builder.nullable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Partitions create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String defaultValue; 
            private String name; 
            private Boolean nullable; 
            private String type; 

            private Builder() {
            } 

            private Builder(Partitions model) {
                this.comment = model.comment;
                this.defaultValue = model.defaultValue;
                this.name = model.name;
                this.nullable = model.nullable;
                this.type = model.type;
            } 

            /**
             * <p>The comment on the column.</p>
             * 
             * <strong>example:</strong>
             * <p>第一分区</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default value of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>p1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the column can be null.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Partitions build() {
                return new Partitions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTablesResponseBody</p>
     */
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private java.util.List<Partitions> partitions;

        private Schema(Builder builder) {
            this.columns = builder.columns;
            this.comment = builder.comment;
            this.name = builder.name;
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitions
         */
        public java.util.List<Partitions> getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private String comment; 
            private String name; 
            private java.util.List<Partitions> partitions; 

            private Builder() {
            } 

            private Builder(Schema model) {
                this.columns = model.columns;
                this.comment = model.comment;
                this.name = model.name;
                this.partitions = model.partitions;
            } 

            /**
             * <p>All non-partition key columns of the table.</p>
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The comment on the table.</p>
             * 
             * <strong>example:</strong>
             * <p>for mms test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>All partition key columns.</p>
             */
            public Builder partitions(java.util.List<Partitions> partitions) {
                this.partitions = partitions;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTablesResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("dstName")
        private String dstName;

        @com.aliyun.core.annotation.NameInMap("dstProjectName")
        private String dstProjectName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("hasPartitions")
        private Boolean hasPartitions;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("inputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("lastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("numRows")
        private Long numRows;

        @com.aliyun.core.annotation.NameInMap("outputFormat")
        private String outputFormat;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private Integer partitions;

        @com.aliyun.core.annotation.NameInMap("partitionsDoing")
        private Integer partitionsDoing;

        @com.aliyun.core.annotation.NameInMap("partitionsDone")
        private Integer partitionsDone;

        @com.aliyun.core.annotation.NameInMap("partitionsFailed")
        private Integer partitionsFailed;

        @com.aliyun.core.annotation.NameInMap("schema")
        private Schema schema;

        @com.aliyun.core.annotation.NameInMap("serde")
        private String serde;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Boolean updated;

        private ObjectList(Builder builder) {
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.dstName = builder.dstName;
            this.dstProjectName = builder.dstProjectName;
            this.dstSchemaName = builder.dstSchemaName;
            this.extra = builder.extra;
            this.hasPartitions = builder.hasPartitions;
            this.id = builder.id;
            this.inputFormat = builder.inputFormat;
            this.lastDdlTime = builder.lastDdlTime;
            this.location = builder.location;
            this.name = builder.name;
            this.numRows = builder.numRows;
            this.outputFormat = builder.outputFormat;
            this.owner = builder.owner;
            this.partitions = builder.partitions;
            this.partitionsDoing = builder.partitionsDoing;
            this.partitionsDone = builder.partitionsDone;
            this.partitionsFailed = builder.partitionsFailed;
            this.schema = builder.schema;
            this.serde = builder.serde;
            this.size = builder.size;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.status = builder.status;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
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
         * @return dstName
         */
        public String getDstName() {
            return this.dstName;
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return hasPartitions
         */
        public Boolean getHasPartitions() {
            return this.hasPartitions;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numRows
         */
        public Long getNumRows() {
            return this.numRows;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return partitions
         */
        public Integer getPartitions() {
            return this.partitions;
        }

        /**
         * @return partitionsDoing
         */
        public Integer getPartitionsDoing() {
            return this.partitionsDoing;
        }

        /**
         * @return partitionsDone
         */
        public Integer getPartitionsDone() {
            return this.partitionsDone;
        }

        /**
         * @return partitionsFailed
         */
        public Integer getPartitionsFailed() {
            return this.partitionsFailed;
        }

        /**
         * @return schema
         */
        public Schema getSchema() {
            return this.schema;
        }

        /**
         * @return serde
         */
        public String getSerde() {
            return this.serde;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public Boolean getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbName; 
            private String dstName; 
            private String dstProjectName; 
            private String dstSchemaName; 
            private String extra; 
            private Boolean hasPartitions; 
            private Long id; 
            private String inputFormat; 
            private String lastDdlTime; 
            private String location; 
            private String name; 
            private Long numRows; 
            private String outputFormat; 
            private String owner; 
            private Integer partitions; 
            private Integer partitionsDoing; 
            private Integer partitionsDone; 
            private Integer partitionsFailed; 
            private Schema schema; 
            private String serde; 
            private Long size; 
            private Long sourceId; 
            private String sourceName; 
            private String status; 
            private String type; 
            private Boolean updated; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.dbId = model.dbId;
                this.dbName = model.dbName;
                this.dstName = model.dstName;
                this.dstProjectName = model.dstProjectName;
                this.dstSchemaName = model.dstSchemaName;
                this.extra = model.extra;
                this.hasPartitions = model.hasPartitions;
                this.id = model.id;
                this.inputFormat = model.inputFormat;
                this.lastDdlTime = model.lastDdlTime;
                this.location = model.location;
                this.name = model.name;
                this.numRows = model.numRows;
                this.outputFormat = model.outputFormat;
                this.owner = model.owner;
                this.partitions = model.partitions;
                this.partitionsDoing = model.partitionsDoing;
                this.partitionsDone = model.partitionsDone;
                this.partitionsFailed = model.partitionsFailed;
                this.schema = model.schema;
                this.serde = model.serde;
                this.size = model.size;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.status = model.status;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>196</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The name of the destination MaxCompute table. By default, this name is the same as the source table name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dstName(String dstName) {
                this.dstName = dstName;
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
             * <p>The name of the destination MaxCompute schema. This parameter is null if the destination MaxCompute project does not have a schema layer.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * <p>Other information stored in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;mapkey.delim&quot;:&quot;:&quot;,&quot;collection.delim&quot;:&quot;,&quot;,&quot;serialization.format&quot;:&quot;|&quot;,&quot;field.delim&quot;:&quot;|&quot;}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPartitions(Boolean hasPartitions) {
                this.hasPartitions = hasPartitions;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1003476</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The input format.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * <p>The last DDL time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:42</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * <p>The storage location of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>| hdfs://master-1-1.c-c127cd184bb029ea.cn-zhangjiakou.emr.aliyuncs.com:9000/user/hive/warehouse/demo</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>232323</p>
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * <p>The output format.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat</p>
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * <p>The owner of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder partitions(Integer partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * <p>The number of partitions that are being migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder partitionsDoing(Integer partitionsDoing) {
                this.partitionsDoing = partitionsDoing;
                return this;
            }

            /**
             * <p>The number of partitions that are migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder partitionsDone(Integer partitionsDone) {
                this.partitionsDone = partitionsDone;
                return this;
            }

            /**
             * <p>The number of partitions that failed to be migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder partitionsFailed(Integer partitionsFailed) {
                this.partitionsFailed = partitionsFailed;
                return this;
            }

            /**
             * <p>The table schema.</p>
             */
            public Builder schema(Schema schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The serializer/deserializer (SerDe).</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe</p>
             */
            public Builder serde(String serde) {
                this.serde = serde;
                return this;
            }

            /**
             * <p>The data size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2985028</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>2000028</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
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
             * <p>The table type.</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED_TABLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the metadata is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectList")
        private java.util.List<ObjectList> objectList;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.objectList = builder.objectList;
            this.pageNum = builder.pageNum;
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
         * @return objectList
         */
        public java.util.List<ObjectList> getObjectList() {
            return this.objectList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ObjectList> objectList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.objectList = model.objectList;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of tables.</p>
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
