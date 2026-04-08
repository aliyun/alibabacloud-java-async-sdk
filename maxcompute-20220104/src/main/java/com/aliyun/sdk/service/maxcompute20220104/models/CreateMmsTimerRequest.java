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
 * {@link CreateMmsTimerRequest} extends {@link RequestModel}
 *
 * <p>CreateMmsTimerRequest</p>
 */
public class CreateMmsTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columnMapping")
    private java.util.Map<String, String> columnMapping;

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
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDbName")
    private String srcDbName;

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
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private CreateMmsTimerRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.columnMapping = builder.columnMapping;
        this.enableDataMigration = builder.enableDataMigration;
        this.enableSchemaMigration = builder.enableSchemaMigration;
        this.enableVerification = builder.enableVerification;
        this.name = builder.name;
        this.others = builder.others;
        this.partitionFilters = builder.partitionFilters;
        this.partitions = builder.partitions;
        this.scheduleType = builder.scheduleType;
        this.srcDbName = builder.srcDbName;
        this.tableBlackList = builder.tableBlackList;
        this.tableMapping = builder.tableMapping;
        this.tableWhiteList = builder.tableWhiteList;
        this.tables = builder.tables;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsTimerRequest create() {
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
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return srcDbName
     */
    public String getSrcDbName() {
        return this.srcDbName;
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateMmsTimerRequest, Builder> {
        private Long sourceId; 
        private java.util.Map<String, String> columnMapping; 
        private Boolean enableDataMigration; 
        private Boolean enableSchemaMigration; 
        private Boolean enableVerification; 
        private String name; 
        private java.util.Map<String, ?> others; 
        private java.util.Map<String, String> partitionFilters; 
        private java.util.List<Long> partitions; 
        private String scheduleType; 
        private String srcDbName; 
        private java.util.List<String> tableBlackList; 
        private java.util.Map<String, String> tableMapping; 
        private java.util.List<String> tableWhiteList; 
        private java.util.List<String> tables; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateMmsTimerRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.columnMapping = request.columnMapping;
            this.enableDataMigration = request.enableDataMigration;
            this.enableSchemaMigration = request.enableSchemaMigration;
            this.enableVerification = request.enableVerification;
            this.name = request.name;
            this.others = request.others;
            this.partitionFilters = request.partitionFilters;
            this.partitions = request.partitions;
            this.scheduleType = request.scheduleType;
            this.srcDbName = request.srcDbName;
            this.tableBlackList = request.tableBlackList;
            this.tableMapping = request.tableMapping;
            this.tableWhiteList = request.tableWhiteList;
            this.tables = request.tables;
            this.value = request.value;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * columnMapping.
         */
        public Builder columnMapping(java.util.Map<String, String> columnMapping) {
            this.putBodyParameter("columnMapping", columnMapping);
            this.columnMapping = columnMapping;
            return this;
        }

        /**
         * enableDataMigration.
         */
        public Builder enableDataMigration(Boolean enableDataMigration) {
            this.putBodyParameter("enableDataMigration", enableDataMigration);
            this.enableDataMigration = enableDataMigration;
            return this;
        }

        /**
         * enableSchemaMigration.
         */
        public Builder enableSchemaMigration(Boolean enableSchemaMigration) {
            this.putBodyParameter("enableSchemaMigration", enableSchemaMigration);
            this.enableSchemaMigration = enableSchemaMigration;
            return this;
        }

        /**
         * enableVerification.
         */
        public Builder enableVerification(Boolean enableVerification) {
            this.putBodyParameter("enableVerification", enableVerification);
            this.enableVerification = enableVerification;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * others.
         */
        public Builder others(java.util.Map<String, ?> others) {
            this.putBodyParameter("others", others);
            this.others = others;
            return this;
        }

        /**
         * partitionFilters.
         */
        public Builder partitionFilters(java.util.Map<String, String> partitionFilters) {
            this.putBodyParameter("partitionFilters", partitionFilters);
            this.partitionFilters = partitionFilters;
            return this;
        }

        /**
         * partitions.
         */
        public Builder partitions(java.util.List<Long> partitions) {
            this.putBodyParameter("partitions", partitions);
            this.partitions = partitions;
            return this;
        }

        /**
         * scheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * srcDbName.
         */
        public Builder srcDbName(String srcDbName) {
            this.putBodyParameter("srcDbName", srcDbName);
            this.srcDbName = srcDbName;
            return this;
        }

        /**
         * tableBlackList.
         */
        public Builder tableBlackList(java.util.List<String> tableBlackList) {
            this.putBodyParameter("tableBlackList", tableBlackList);
            this.tableBlackList = tableBlackList;
            return this;
        }

        /**
         * tableMapping.
         */
        public Builder tableMapping(java.util.Map<String, String> tableMapping) {
            this.putBodyParameter("tableMapping", tableMapping);
            this.tableMapping = tableMapping;
            return this;
        }

        /**
         * tableWhiteList.
         */
        public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
            this.putBodyParameter("tableWhiteList", tableWhiteList);
            this.tableWhiteList = tableWhiteList;
            return this;
        }

        /**
         * tables.
         */
        public Builder tables(java.util.List<String> tables) {
            this.putBodyParameter("tables", tables);
            this.tables = tables;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateMmsTimerRequest build() {
            return new CreateMmsTimerRequest(this);
        } 

    } 

}
