// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableInput} extends {@link TeaModel}
 *
 * <p>TableInput</p>
 */
public class TableInput extends TeaModel {
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

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("TableType")
    private String tableType;

    @NameInMap("Temporary")
    private Boolean temporary;

    @NameInMap("ViewExpandedText")
    private String viewExpandedText;

    @NameInMap("ViewOriginalText")
    private String viewOriginalText;

    private TableInput(Builder builder) {
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
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
        this.temporary = builder.temporary;
        this.viewExpandedText = builder.viewExpandedText;
        this.viewOriginalText = builder.viewOriginalText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableInput create() {
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
     * @return temporary
     */
    public Boolean getTemporary() {
        return this.temporary;
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
        private String tableName; 
        private String tableType; 
        private Boolean temporary; 
        private String viewExpandedText; 
        private String viewOriginalText; 

        /**
         * Cascade.
         */
        public Builder cascade(Boolean cascade) {
            this.cascade = cascade;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * LastAccessTime.
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * LastAnalyzedTime.
         */
        public Builder lastAnalyzedTime(Integer lastAnalyzedTime) {
            this.lastAnalyzedTime = lastAnalyzedTime;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * OwnerType.
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
         * Retention.
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        /**
         * RewriteEnabled.
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * TableType.
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * Temporary.
         */
        public Builder temporary(Boolean temporary) {
            this.temporary = temporary;
            return this;
        }

        /**
         * ViewExpandedText.
         */
        public Builder viewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * ViewOriginalText.
         */
        public Builder viewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        public TableInput build() {
            return new TableInput(this);
        } 

    } 

}
