// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link TableKnowledgeVO} extends {@link TeaModel}
 *
 * <p>TableKnowledgeVO</p>
 */
public class TableKnowledgeVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetCreatedGmt")
    private String assetCreatedGmt;

    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    private String assetDescription;

    @com.aliyun.core.annotation.NameInMap("AssetModifiedGmt")
    private String assetModifiedGmt;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.NameInMap("HotLevel")
    private Integer hotLevel;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Integer instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("LevelType")
    private String levelType;

    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

    @com.aliyun.core.annotation.NameInMap("NumRows")
    private Long numRows;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TableId")
    private Long tableId;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private TableKnowledgeVO(Builder builder) {
        this.assetCreatedGmt = builder.assetCreatedGmt;
        this.assetDescription = builder.assetDescription;
        this.assetModifiedGmt = builder.assetModifiedGmt;
        this.dbId = builder.dbId;
        this.dbName = builder.dbName;
        this.dbType = builder.dbType;
        this.description = builder.description;
        this.envType = builder.envType;
        this.hotLevel = builder.hotLevel;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.level = builder.level;
        this.levelType = builder.levelType;
        this.logic = builder.logic;
        this.numRows = builder.numRows;
        this.schemaName = builder.schemaName;
        this.size = builder.size;
        this.summary = builder.summary;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableKnowledgeVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetCreatedGmt
     */
    public String getAssetCreatedGmt() {
        return this.assetCreatedGmt;
    }

    /**
     * @return assetDescription
     */
    public String getAssetDescription() {
        return this.assetDescription;
    }

    /**
     * @return assetModifiedGmt
     */
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return hotLevel
     */
    public Integer getHotLevel() {
        return this.hotLevel;
    }

    /**
     * @return instanceId
     */
    public Integer getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return levelType
     */
    public String getLevelType() {
        return this.levelType;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return numRows
     */
    public Long getNumRows() {
        return this.numRows;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String assetCreatedGmt; 
        private String assetDescription; 
        private String assetModifiedGmt; 
        private Integer dbId; 
        private String dbName; 
        private String dbType; 
        private String description; 
        private String envType; 
        private Integer hotLevel; 
        private Integer instanceId; 
        private String instanceName; 
        private Integer level; 
        private String levelType; 
        private Boolean logic; 
        private Long numRows; 
        private String schemaName; 
        private Long size; 
        private String summary; 
        private Long tableId; 
        private String tableName; 
        private String title; 

        private Builder() {
        } 

        private Builder(TableKnowledgeVO model) {
            this.assetCreatedGmt = model.assetCreatedGmt;
            this.assetDescription = model.assetDescription;
            this.assetModifiedGmt = model.assetModifiedGmt;
            this.dbId = model.dbId;
            this.dbName = model.dbName;
            this.dbType = model.dbType;
            this.description = model.description;
            this.envType = model.envType;
            this.hotLevel = model.hotLevel;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.level = model.level;
            this.levelType = model.levelType;
            this.logic = model.logic;
            this.numRows = model.numRows;
            this.schemaName = model.schemaName;
            this.size = model.size;
            this.summary = model.summary;
            this.tableId = model.tableId;
            this.tableName = model.tableName;
            this.title = model.title;
        } 

        /**
         * AssetCreatedGmt.
         */
        public Builder assetCreatedGmt(String assetCreatedGmt) {
            this.assetCreatedGmt = assetCreatedGmt;
            return this;
        }

        /**
         * AssetDescription.
         */
        public Builder assetDescription(String assetDescription) {
            this.assetDescription = assetDescription;
            return this;
        }

        /**
         * AssetModifiedGmt.
         */
        public Builder assetModifiedGmt(String assetModifiedGmt) {
            this.assetModifiedGmt = assetModifiedGmt;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.envType = envType;
            return this;
        }

        /**
         * HotLevel.
         */
        public Builder hotLevel(Integer hotLevel) {
            this.hotLevel = hotLevel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * LevelType.
         */
        public Builder levelType(String levelType) {
            this.levelType = levelType;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.logic = logic;
            return this;
        }

        /**
         * NumRows.
         */
        public Builder numRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public TableKnowledgeVO build() {
            return new TableKnowledgeVO(this);
        } 

    } 

}
