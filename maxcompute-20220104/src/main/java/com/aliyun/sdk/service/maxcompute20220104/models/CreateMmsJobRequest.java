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
 * {@link CreateMmsJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMmsJobRequest</p>
 */
public class CreateMmsJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columnMapping")
    private java.util.Map<String, String> columnMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDbName")
    private String dstDbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstSchemaName")
    private String dstSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableDataMigration")
    private Boolean enableDataMigration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableSchemaMigration")
    private Boolean enableSchemaMigration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableVerification")
    private Boolean enableVerification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eta")
    private String eta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("increment")
    private Boolean increment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("others")
    private java.util.Map<String, ?> others;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partitionFilters")
    private java.util.Map<String, String> partitionFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partitions")
    private java.util.List<Long> partitions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schemaOnly")
    private Boolean schemaOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceName")
    private String sourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDbName")
    private String srcDbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcSchemaName")
    private String srcSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableBlackList")
    private java.util.List<String> tableBlackList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableMapping")
    private java.util.Map<String, String> tableMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableWhiteList")
    private java.util.List<String> tableWhiteList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tables")
    private java.util.List<String> tables;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private CreateMmsJobRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.columnMapping = builder.columnMapping;
        this.dstDbName = builder.dstDbName;
        this.dstSchemaName = builder.dstSchemaName;
        this.enableDataMigration = builder.enableDataMigration;
        this.enableSchemaMigration = builder.enableSchemaMigration;
        this.enableVerification = builder.enableVerification;
        this.eta = builder.eta;
        this.increment = builder.increment;
        this.name = builder.name;
        this.others = builder.others;
        this.partitionFilters = builder.partitionFilters;
        this.partitions = builder.partitions;
        this.schemaOnly = builder.schemaOnly;
        this.sourceName = builder.sourceName;
        this.srcDbName = builder.srcDbName;
        this.srcSchemaName = builder.srcSchemaName;
        this.tableBlackList = builder.tableBlackList;
        this.tableMapping = builder.tableMapping;
        this.tableWhiteList = builder.tableWhiteList;
        this.tables = builder.tables;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return columnMapping
     */
    public java.util.Map<String, String> getColumnMapping() {
        return this.columnMapping;
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
     * @return eta
     */
    public String getEta() {
        return this.eta;
    }

    /**
     * @return increment
     */
    public Boolean getIncrement() {
        return this.increment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<CreateMmsJobRequest, Builder> {
        private Long sourceId; 
        private java.util.Map<String, String> columnMapping; 
        private String dstDbName; 
        private String dstSchemaName; 
        private Boolean enableDataMigration; 
        private Boolean enableSchemaMigration; 
        private Boolean enableVerification; 
        private String eta; 
        private Boolean increment; 
        private String name; 
        private java.util.Map<String, ?> others; 
        private java.util.Map<String, String> partitionFilters; 
        private java.util.List<Long> partitions; 
        private Boolean schemaOnly; 
        private String sourceName; 
        private String srcDbName; 
        private String srcSchemaName; 
        private java.util.List<String> tableBlackList; 
        private java.util.Map<String, String> tableMapping; 
        private java.util.List<String> tableWhiteList; 
        private java.util.List<String> tables; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateMmsJobRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.columnMapping = request.columnMapping;
            this.dstDbName = request.dstDbName;
            this.dstSchemaName = request.dstSchemaName;
            this.enableDataMigration = request.enableDataMigration;
            this.enableSchemaMigration = request.enableSchemaMigration;
            this.enableVerification = request.enableVerification;
            this.eta = request.eta;
            this.increment = request.increment;
            this.name = request.name;
            this.others = request.others;
            this.partitionFilters = request.partitionFilters;
            this.partitions = request.partitions;
            this.schemaOnly = request.schemaOnly;
            this.sourceName = request.sourceName;
            this.srcDbName = request.srcDbName;
            this.srcSchemaName = request.srcSchemaName;
            this.tableBlackList = request.tableBlackList;
            this.tableMapping = request.tableMapping;
            this.tableWhiteList = request.tableWhiteList;
            this.tables = request.tables;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The ID of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000014</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>{Source column name: Destination column name}</p>
         */
        public Builder columnMapping(java.util.Map<String, String> columnMapping) {
            this.putBodyParameter("columnMapping", columnMapping);
            this.columnMapping = columnMapping;
            return this;
        }

        /**
         * <p>The destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        public Builder dstDbName(String dstDbName) {
            this.putBodyParameter("dstDbName", dstDbName);
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
            this.putBodyParameter("dstSchemaName", dstSchemaName);
            this.dstSchemaName = dstSchemaName;
            return this;
        }

        /**
         * <p>Specifies whether to migrate table data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDataMigration(Boolean enableDataMigration) {
            this.putBodyParameter("enableDataMigration", enableDataMigration);
            this.enableDataMigration = enableDataMigration;
            return this;
        }

        /**
         * <p>Specifies whether to migrate table schemas.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSchemaMigration(Boolean enableSchemaMigration) {
            this.putBodyParameter("enableSchemaMigration", enableSchemaMigration);
            this.enableSchemaMigration = enableSchemaMigration;
            return this;
        }

        /**
         * <p>Specifies whether to enable data verification. The current verification method is to execute SELECT COUNT(\*) on the source and destination to compare the number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableVerification(Boolean enableVerification) {
            this.putBodyParameter("enableVerification", enableVerification);
            this.enableVerification = enableVerification;
            return this;
        }

        /**
         * <p>The expected completion time of the migration. Note: A smaller eta value gives the migration task higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-04</p>
         */
        public Builder eta(String eta) {
            this.putBodyParameter("eta", eta);
            this.eta = eta;
            return this;
        }

        /**
         * <p>Specifies whether to perform an incremental migration. In an incremental migration, only new or changed partitions are migrated. Note that changed partitions are re-migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder increment(Boolean increment) {
            this.putBodyParameter("increment", increment);
            this.increment = increment;
            return this;
        }

        /**
         * <p>The name of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>migrate_db_1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Other configuration information.</p>
         */
        public Builder others(java.util.Map<String, ?> others) {
            this.putBodyParameter("others", others);
            this.others = others;
            return this;
        }

        /**
         * <p>{Table name: Partition filter expression}</p>
         */
        public Builder partitionFilters(java.util.Map<String, String> partitionFilters) {
            this.putBodyParameter("partitionFilters", partitionFilters);
            this.partitionFilters = partitionFilters;
            return this;
        }

        /**
         * <p>The list of partition IDs.</p>
         */
        public Builder partitions(java.util.List<Long> partitions) {
            this.putBodyParameter("partitions", partitions);
            this.partitions = partitions;
            return this;
        }

        /**
         * <p>Specifies whether to migrate only metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder schemaOnly(Boolean schemaOnly) {
            this.putBodyParameter("schemaOnly", schemaOnly);
            this.schemaOnly = schemaOnly;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder sourceName(String sourceName) {
            this.putBodyParameter("sourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The name of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>src_db</p>
         */
        public Builder srcDbName(String srcDbName) {
            this.putBodyParameter("srcDbName", srcDbName);
            this.srcDbName = srcDbName;
            return this;
        }

        /**
         * <p>The name of the source schema. This is the schema in a Layer 3 namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder srcSchemaName(String srcSchemaName) {
            this.putBodyParameter("srcSchemaName", srcSchemaName);
            this.srcSchemaName = srcSchemaName;
            return this;
        }

        /**
         * <p>The blacklist of tables.</p>
         */
        public Builder tableBlackList(java.util.List<String> tableBlackList) {
            this.putBodyParameter("tableBlackList", tableBlackList);
            this.tableBlackList = tableBlackList;
            return this;
        }

        /**
         * <p>{Source table: Destination table}</p>
         */
        public Builder tableMapping(java.util.Map<String, String> tableMapping) {
            this.putBodyParameter("tableMapping", tableMapping);
            this.tableMapping = tableMapping;
            return this;
        }

        /**
         * <p>The whitelist of tables. Note: If you configure both a whitelist and a blacklist, only the blacklist takes effect.</p>
         */
        public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
            this.putBodyParameter("tableWhiteList", tableWhiteList);
            this.tableWhiteList = tableWhiteList;
            return this;
        }

        /**
         * <p>The list of table names.</p>
         */
        public Builder tables(java.util.List<String> tables) {
            this.putBodyParameter("tables", tables);
            this.tables = tables;
            return this;
        }

        /**
         * <p>The type of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGQUERY</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateMmsJobRequest build() {
            return new CreateMmsJobRequest(this);
        } 

    } 

}
