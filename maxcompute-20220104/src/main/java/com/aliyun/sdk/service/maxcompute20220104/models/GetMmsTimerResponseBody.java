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
 * {@link GetMmsTimerResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsTimerResponseBody</p>
 */
public class GetMmsTimerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsTimerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsTimerResponseBody create() {
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

        private Builder(GetMmsTimerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06dfe716674588654372173ec0da</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsTimerResponseBody build() {
            return new GetMmsTimerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsTimerResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsTimerResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columnMapping")
        private java.util.Map<String, String> columnMapping;

        @com.aliyun.core.annotation.NameInMap("enableDataMigration")
        private Boolean enableDataMigration;

        @com.aliyun.core.annotation.NameInMap("enableSchemaMigration")
        private Boolean enableSchemaMigration;

        @com.aliyun.core.annotation.NameInMap("enableVerification")
        private Boolean enableVerification;

        @com.aliyun.core.annotation.NameInMap("others")
        private java.util.Map<String, ?> others;

        @com.aliyun.core.annotation.NameInMap("partitionFilters")
        private java.util.Map<String, String> partitionFilters;

        @com.aliyun.core.annotation.NameInMap("partitions")
        private java.util.List<Long> partitions;

        @com.aliyun.core.annotation.NameInMap("tableBlackList")
        private java.util.List<String> tableBlackList;

        @com.aliyun.core.annotation.NameInMap("tableMapping")
        private java.util.Map<String, String> tableMapping;

        @com.aliyun.core.annotation.NameInMap("tableWhiteList")
        private java.util.List<String> tableWhiteList;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List<String> tables;

        private Config(Builder builder) {
            this.columnMapping = builder.columnMapping;
            this.enableDataMigration = builder.enableDataMigration;
            this.enableSchemaMigration = builder.enableSchemaMigration;
            this.enableVerification = builder.enableVerification;
            this.others = builder.others;
            this.partitionFilters = builder.partitionFilters;
            this.partitions = builder.partitions;
            this.tableBlackList = builder.tableBlackList;
            this.tableMapping = builder.tableMapping;
            this.tableWhiteList = builder.tableWhiteList;
            this.tables = builder.tables;
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
         * @return enableDataMigration
         */
        public Boolean getEnableDataMigration() {
            return this.enableDataMigration;
        }

        /**
         * @return enableSchemaMigration
         */
        public Boolean getEnableSchemaMigration() {
            return this.enableSchemaMigration;
        }

        /**
         * @return enableVerification
         */
        public Boolean getEnableVerification() {
            return this.enableVerification;
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

        public static final class Builder {
            private java.util.Map<String, String> columnMapping; 
            private Boolean enableDataMigration; 
            private Boolean enableSchemaMigration; 
            private Boolean enableVerification; 
            private java.util.Map<String, ?> others; 
            private java.util.Map<String, String> partitionFilters; 
            private java.util.List<Long> partitions; 
            private java.util.List<String> tableBlackList; 
            private java.util.Map<String, String> tableMapping; 
            private java.util.List<String> tableWhiteList; 
            private java.util.List<String> tables; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.columnMapping = model.columnMapping;
                this.enableDataMigration = model.enableDataMigration;
                this.enableSchemaMigration = model.enableSchemaMigration;
                this.enableVerification = model.enableVerification;
                this.others = model.others;
                this.partitionFilters = model.partitionFilters;
                this.partitions = model.partitions;
                this.tableBlackList = model.tableBlackList;
                this.tableMapping = model.tableMapping;
                this.tableWhiteList = model.tableWhiteList;
                this.tables = model.tables;
            } 

            /**
             * <p>A map of source column names to destination column names.</p>
             */
            public Builder columnMapping(java.util.Map<String, String> columnMapping) {
                this.columnMapping = columnMapping;
                return this;
            }

            /**
             * <p>Whether to migrate table data.</p>
             */
            public Builder enableDataMigration(Boolean enableDataMigration) {
                this.enableDataMigration = enableDataMigration;
                return this;
            }

            /**
             * <p>Whether to migrate the table schema.</p>
             */
            public Builder enableSchemaMigration(Boolean enableSchemaMigration) {
                this.enableSchemaMigration = enableSchemaMigration;
                return this;
            }

            /**
             * <p>Whether to enable verification. The system performs verification by running a <code>SELECT COUNT(*)</code> query on both the source and destination to compare the row count.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVerification(Boolean enableVerification) {
                this.enableVerification = enableVerification;
                return this;
            }

            /**
             * <p>Other configurations.</p>
             */
            public Builder others(java.util.Map<String, ?> others) {
                this.others = others;
                return this;
            }

            /**
             * <p>A map of table names to their corresponding partition filter expressions.</p>
             */
            public Builder partitionFilters(java.util.Map<String, String> partitionFilters) {
                this.partitionFilters = partitionFilters;
                return this;
            }

            /**
             * <p>If <code>type</code> is set to <code>Partitions</code>, this parameter specifies a list of partition IDs to migrate.</p>
             */
            public Builder partitions(java.util.List<Long> partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * <p>If <code>type</code> is set to <code>Database</code>, this parameter specifies a table deny list. Tables on this list are excluded from the migration.</p>
             */
            public Builder tableBlackList(java.util.List<String> tableBlackList) {
                this.tableBlackList = tableBlackList;
                return this;
            }

            /**
             * <p>A map of source table names to destination table names.</p>
             */
            public Builder tableMapping(java.util.Map<String, String> tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * <p>If <code>type</code> is set to <code>Database</code>, this parameter specifies a table allowlist. If this parameter is not specified, all tables in the database are migrated.</p>
             */
            public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
                this.tableWhiteList = tableWhiteList;
                return this;
            }

            /**
             * <p>If <code>type</code> is set to <code>Tables</code>, this parameter specifies a list of table names to migrate.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMmsTimerResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsTimerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("srcDbName")
        private String srcDbName;

        @com.aliyun.core.annotation.NameInMap("stopped")
        private Boolean stopped;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Data(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.id = builder.id;
            this.name = builder.name;
            this.scheduleType = builder.scheduleType;
            this.sourceId = builder.sourceId;
            this.srcDbName = builder.srcDbName;
            this.stopped = builder.stopped;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.value = builder.value;
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
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return srcDbName
         */
        public String getSrcDbName() {
            return this.srcDbName;
        }

        /**
         * @return stopped
         */
        public Boolean getStopped() {
            return this.stopped;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private Long dbId; 
            private Long id; 
            private String name; 
            private String scheduleType; 
            private Long sourceId; 
            private String srcDbName; 
            private Boolean stopped; 
            private String type; 
            private String updateTime; 
            private String value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.createTime = model.createTime;
                this.dbId = model.dbId;
                this.id = model.id;
                this.name = model.name;
                this.scheduleType = model.scheduleType;
                this.sourceId = model.sourceId;
                this.srcDbName = model.srcDbName;
                this.stopped = model.stopped;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.value = model.value;
            } 

            /**
             * <p>The configuration of the migration job.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time of the scheduled task. This is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1730946421757</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the source database.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>2523</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>sale_detail</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The scheduling type of the scheduled task. Valid values: <code>Daily</code> and <code>Hourly</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>2000017</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
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
             * <p>Indicates whether the scheduled task is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily, Hourly</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The last update time of the scheduled task, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-01T02:18:01Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The scheduling time. If <code>scheduleType</code> is <code>Daily</code>, the value is in the <code>HH:MM</code> format. If <code>scheduleType</code> is <code>Hourly</code>, the value is in the <code>MM</code> format.</p>
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
