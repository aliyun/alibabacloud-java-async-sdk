// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Table} extends {@link TeaModel}
 *
 * <p>Table</p>
 */
public class Table extends TeaModel {
    @NameInMap("Cascade")
    private Boolean cascade;

    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("CreatedBy")
    private String createdBy;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @NameInMap("LastAnalyzedTime")
    private Integer lastAnalyzedTime;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("OwnerType")
    private String ownerType;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("PartitionKeys")
    private java.util.List < FieldSchema > partitionKeys;

    @NameInMap("Privileges")
    private PrincipalPrivilegeSet privileges;

    @NameInMap("Retention")
    private Integer retention;

    @NameInMap("RewriteEnabled")
    private Boolean rewriteEnabled;

    @NameInMap("Sd")
    private StorageDescriptor sd;

    @NameInMap("TableId")
    private String tableId;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("TableType")
    private String tableType;

    @NameInMap("TableVersion")
    private TableVersion tableVersion;

    @NameInMap("Temporary")
    private Boolean temporary;

    @NameInMap("UpdateTime")
    private Integer updateTime;

    @NameInMap("ViewExpandedText")
    private String viewExpandedText;

    @NameInMap("ViewOriginalText")
    private String viewOriginalText;

    private Table(Builder builder) {
        this.cascade = builder.cascade;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.databaseName = builder.databaseName;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastAnalyzedTime = builder.lastAnalyzedTime;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.parameters = builder.parameters;
        this.partitionKeys = builder.partitionKeys;
        this.privileges = builder.privileges;
        this.retention = builder.retention;
        this.rewriteEnabled = builder.rewriteEnabled;
        this.sd = builder.sd;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
        this.tableVersion = builder.tableVersion;
        this.temporary = builder.temporary;
        this.updateTime = builder.updateTime;
        this.viewExpandedText = builder.viewExpandedText;
        this.viewOriginalText = builder.viewOriginalText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    /**
     * @return cascade
     */
    public Boolean getCascade() {
        return this.cascade;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return lastAnalyzedTime
     */
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List < FieldSchema > getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return privileges
     */
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return rewriteEnabled
     */
    public Boolean getRewriteEnabled() {
        return this.rewriteEnabled;
    }

    /**
     * @return sd
     */
    public StorageDescriptor getSd() {
        return this.sd;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return tableVersion
     */
    public TableVersion getTableVersion() {
        return this.tableVersion;
    }

    /**
     * @return temporary
     */
    public Boolean getTemporary() {
        return this.temporary;
    }

    /**
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return viewExpandedText
     */
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * @return viewOriginalText
     */
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public static final class Builder {
        private Boolean cascade; 
        private Integer createTime; 
        private String createdBy; 
        private String databaseName; 
        private Integer lastAccessTime; 
        private Integer lastAnalyzedTime; 
        private String owner; 
        private String ownerType; 
        private java.util.Map < String, String > parameters; 
        private java.util.List < FieldSchema > partitionKeys; 
        private PrincipalPrivilegeSet privileges; 
        private Integer retention; 
        private Boolean rewriteEnabled; 
        private StorageDescriptor sd; 
        private String tableId; 
        private String tableName; 
        private String tableType; 
        private TableVersion tableVersion; 
        private Boolean temporary; 
        private Integer updateTime; 
        private String viewExpandedText; 
        private String viewOriginalText; 

        /**
         * Cascade
         */
        public Builder cascade(Boolean cascade) {
            this.cascade = cascade;
            return this;
        }

        /**
         * CreateTime
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * LastAccessTime
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * LastAnalyzedTime
         */
        public Builder lastAnalyzedTime(Integer lastAnalyzedTime) {
            this.lastAnalyzedTime = lastAnalyzedTime;
            return this;
        }

        /**
         * Owner
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * OwnerType
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * PartitionKeys.
         */
        public Builder partitionKeys(java.util.List < FieldSchema > partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * Privileges.
         */
        public Builder privileges(PrincipalPrivilegeSet privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Retention
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        /**
         * RewriteEnabled
         */
        public Builder rewriteEnabled(Boolean rewriteEnabled) {
            this.rewriteEnabled = rewriteEnabled;
            return this;
        }

        /**
         * Sd.
         */
        public Builder sd(StorageDescriptor sd) {
            this.sd = sd;
            return this;
        }

        /**
         * TableId
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * TableType
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * TableVersion
         */
        public Builder tableVersion(TableVersion tableVersion) {
            this.tableVersion = tableVersion;
            return this;
        }

        /**
         * Temporary
         */
        public Builder temporary(Boolean temporary) {
            this.temporary = temporary;
            return this;
        }

        /**
         * UpdateTime
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ViewExpandedText
         */
        public Builder viewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * ViewOriginalText
         */
        public Builder viewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        public Table build() {
            return new Table(this);
        } 

    } 

}
