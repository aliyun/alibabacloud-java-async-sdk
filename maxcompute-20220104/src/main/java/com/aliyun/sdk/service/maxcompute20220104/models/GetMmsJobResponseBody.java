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
 * {@link GetMmsJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsJobResponseBody</p>
 */
public class GetMmsJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsJobResponseBody create() {
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

        private Builder(GetMmsJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The migration job object.</p>
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

        public GetMmsJobResponseBody build() {
            return new GetMmsJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsJobResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columnMapping")
        private java.util.Map<String, String> columnMapping;

        @com.aliyun.core.annotation.NameInMap("enableVerification")
        private Boolean enableVerification;

        @com.aliyun.core.annotation.NameInMap("increment")
        private Boolean increment;

        @com.aliyun.core.annotation.NameInMap("others")
        private java.util.Map<String, ?> others;

        @com.aliyun.core.annotation.NameInMap("partitionFilters")
        private java.util.Map<String, String> partitionFilters;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private java.util.List<Long> partitions;

        @com.aliyun.core.annotation.NameInMap("schemaOnly")
        private Boolean schemaOnly;

        @com.aliyun.core.annotation.NameInMap("tableBlackList")
        private java.util.List<String> tableBlackList;

        @com.aliyun.core.annotation.NameInMap("tableMapping")
        private java.util.Map<String, String> tableMapping;

        @com.aliyun.core.annotation.NameInMap("tableWhiteList")
        private java.util.List<String> tableWhiteList;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("tunnelQuota")
        private String tunnelQuota;

        private Config(Builder builder) {
            this.columnMapping = builder.columnMapping;
            this.enableVerification = builder.enableVerification;
            this.increment = builder.increment;
            this.others = builder.others;
            this.partitionFilters = builder.partitionFilters;
            this.partitions = builder.partitions;
            this.schemaOnly = builder.schemaOnly;
            this.tableBlackList = builder.tableBlackList;
            this.tableMapping = builder.tableMapping;
            this.tableWhiteList = builder.tableWhiteList;
            this.tables = builder.tables;
            this.taskType = builder.taskType;
            this.tunnelQuota = builder.tunnelQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return columnMapping
         */
        public java.util.Map<String, String> getColumnMapping() {
            return this.columnMapping;
        }

        /**
         * @return enableVerification
         */
        public Boolean getEnableVerification() {
            return this.enableVerification;
        }

        /**
         * @return increment
         */
        public Boolean getIncrement() {
            return this.increment;
        }

        /**
         * @return others
         */
        public java.util.Map<String, ?> getOthers() {
            return this.others;
        }

        /**
         * @return partitionFilters
         */
        public java.util.Map<String, String> getPartitionFilters() {
            return this.partitionFilters;
        }

        /**
         * @return partitions
         */
        public java.util.List<Long> getPartitions() {
            return this.partitions;
        }

        /**
         * @return schemaOnly
         */
        public Boolean getSchemaOnly() {
            return this.schemaOnly;
        }

        /**
         * @return tableBlackList
         */
        public java.util.List<String> getTableBlackList() {
            return this.tableBlackList;
        }

        /**
         * @return tableMapping
         */
        public java.util.Map<String, String> getTableMapping() {
            return this.tableMapping;
        }

        /**
         * @return tableWhiteList
         */
        public java.util.List<String> getTableWhiteList() {
            return this.tableWhiteList;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return tunnelQuota
         */
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public static final class Builder {
            private java.util.Map<String, String> columnMapping; 
            private Boolean enableVerification; 
            private Boolean increment; 
            private java.util.Map<String, ?> others; 
            private java.util.Map<String, String> partitionFilters; 
            private java.util.List<Long> partitions; 
            private Boolean schemaOnly; 
            private java.util.List<String> tableBlackList; 
            private java.util.Map<String, String> tableMapping; 
            private java.util.List<String> tableWhiteList; 
            private java.util.List<String> tables; 
            private String taskType; 
            private String tunnelQuota; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.columnMapping = model.columnMapping;
                this.enableVerification = model.enableVerification;
                this.increment = model.increment;
                this.others = model.others;
                this.partitionFilters = model.partitionFilters;
                this.partitions = model.partitions;
                this.schemaOnly = model.schemaOnly;
                this.tableBlackList = model.tableBlackList;
                this.tableMapping = model.tableMapping;
                this.tableWhiteList = model.tableWhiteList;
                this.tables = model.tables;
                this.taskType = model.taskType;
                this.tunnelQuota = model.tunnelQuota;
            } 

            /**
             * <p>{Source column name: Destination column name}</p>
             */
            public Builder columnMapping(java.util.Map<String, String> columnMapping) {
                this.columnMapping = columnMapping;
                return this;
            }

            /**
             * <p>Enables data verification. The current verification method is to execute a SELECT COUNT statement on the source and destination to compare the row counts.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVerification(Boolean enableVerification) {
                this.enableVerification = enableVerification;
                return this;
            }

            /**
             * <p>Incremental migration. Only new or modified partitions are migrated. Note: Modified partitions are re-migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder increment(Boolean increment) {
                this.increment = increment;
                return this;
            }

            /**
             * <p>Other configuration information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;spark.executor.mem&quot;: &quot;2g&quot;}</p>
             */
            public Builder others(java.util.Map<String, ?> others) {
                this.others = others;
                return this;
            }

            /**
             * <p>The partition filter expression. This parameter specifies the partition filter expression for a specific table.</p>
             */
            public Builder partitionFilters(java.util.Map<String, String> partitionFilters) {
                this.partitionFilters = partitionFilters;
                return this;
            }

            /**
             * <p>If type is set to Partitions, this parameter specifies the list of partition IDs of the table to migrate.</p>
             */
            public Builder partitions(java.util.List<Long> partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * <p>Deprecated</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder schemaOnly(Boolean schemaOnly) {
                this.schemaOnly = schemaOnly;
                return this;
            }

            /**
             * <p>If type is set to Database, this parameter specifies the tables to exclude from the migration.</p>
             */
            public Builder tableBlackList(java.util.List<String> tableBlackList) {
                this.tableBlackList = tableBlackList;
                return this;
            }

            /**
             * <p>The mapping from source table names to destination table names.</p>
             */
            public Builder tableMapping(java.util.Map<String, String> tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * <p>If type is set to Database, this parameter specifies the list of tables to migrate. If you do not specify this parameter, all tables in the database are migrated.</p>
             */
            public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
                this.tableWhiteList = tableWhiteList;
                return this;
            }

            /**
             * <p>If type is set to Tables, this parameter specifies the list of names of the tables to migrate.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>Deprecated. Valid values: MOCK, HIVE (a Hive user-defined table-valued function (UDTF) task), HIVE_DATAX (a Hive DataX task), COPY_TASK (an ODPS Copy Task), ODPS_INSERT_OVERWRITE (an ODPS simple insert overwrite task), MC2MC_VERIFY, OSS, HIVE_OSS, HIVE_SPARK, and BIGQUERY.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGQUERY</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>Deprecated</p>
             * 
             * <strong>example:</strong>
             * <p>Depcreated</p>
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMmsJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dstDbName")
        private String dstDbName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("eta")
        private String eta;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("srcDbName")
        private String srcDbName;

        @com.aliyun.core.annotation.NameInMap("srcSchemaName")
        private String srcSchemaName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("stopped")
        private Boolean stopped;

        @com.aliyun.core.annotation.NameInMap("taskDone")
        private Integer taskDone;

        @com.aliyun.core.annotation.NameInMap("taskNum")
        private Integer taskNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.dstDbName = builder.dstDbName;
            this.dstSchemaName = builder.dstSchemaName;
            this.eta = builder.eta;
            this.id = builder.id;
            this.name = builder.name;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.srcDbName = builder.srcDbName;
            this.srcSchemaName = builder.srcSchemaName;
            this.status = builder.status;
            this.stopped = builder.stopped;
            this.taskDone = builder.taskDone;
            this.taskNum = builder.taskNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dstDbName
         */
        public String getDstDbName() {
            return this.dstDbName;
        }

        /**
         * @return dstSchemaName
         */
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        /**
         * @return eta
         */
        public String getEta() {
            return this.eta;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return srcDbName
         */
        public String getSrcDbName() {
            return this.srcDbName;
        }

        /**
         * @return srcSchemaName
         */
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopped
         */
        public Boolean getStopped() {
            return this.stopped;
        }

        /**
         * @return taskDone
         */
        public Integer getTaskDone() {
            return this.taskDone;
        }

        /**
         * @return taskNum
         */
        public Integer getTaskNum() {
            return this.taskNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private Long dbId; 
            private String dstDbName; 
            private String dstSchemaName; 
            private String eta; 
            private Long id; 
            private String name; 
            private Long sourceId; 
            private String sourceName; 
            private String srcDbName; 
            private String srcSchemaName; 
            private String status; 
            private Boolean stopped; 
            private Integer taskDone; 
            private Integer taskNum; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.createTime = model.createTime;
                this.dbId = model.dbId;
                this.dstDbName = model.dstDbName;
                this.dstSchemaName = model.dstSchemaName;
                this.eta = model.eta;
                this.id = model.id;
                this.name = model.name;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.srcDbName = model.srcDbName;
                this.srcSchemaName = model.srcSchemaName;
                this.status = model.status;
                this.stopped = model.stopped;
                this.taskDone = model.taskDone;
                this.taskNum = model.taskNum;
                this.type = model.type;
            } 

            /**
             * <p>The configuration of the migration job.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-17 15:44:17</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The source database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The destination MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>mms_target</p>
             */
            public Builder dstDbName(String dstDbName) {
                this.dstDbName = dstDbName;
                return this;
            }

            /**
             * <p>The destination MaxCompute schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * <p>The expected completion time of the migration. Note: A smaller eta value indicates a higher priority for the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-06</p>
             */
            public Builder eta(String eta) {
                this.eta = eta;
                return this;
            }

            /**
             * <p>The migration job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the migration job.</p>
             * 
             * <strong>example:</strong>
             * <p>migrate_db_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The name of the source database.</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder srcDbName(String srcDbName) {
                this.srcDbName = srcDbName;
                return this;
            }

            /**
             * <p>The name of the source schema. This parameter specifies the schema in a Layer 3 namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder srcSchemaName(String srcSchemaName) {
                this.srcSchemaName = srcSchemaName;
                return this;
            }

            /**
             * <p>The status of the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>DOING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * <p>The number of completed migration tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder taskDone(Integer taskDone) {
                this.taskDone = taskDone;
                return this;
            }

            /**
             * <p>The number of migration tasks included in the job.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            /**
             * <p>The migration scope. Valid values: Database, Tables, and Partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>Tables</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
