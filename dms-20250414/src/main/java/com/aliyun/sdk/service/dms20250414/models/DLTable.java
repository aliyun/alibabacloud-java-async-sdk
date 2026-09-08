// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DLTable} extends {@link TeaModel}
 *
 * <p>DLTable</p>
 */
public class DLTable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private Long creatorId;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Long dbId;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("ModifierId")
    private Long modifierId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("PartitionKeys")
    private java.util.List<DLColumn> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    @com.aliyun.core.annotation.NameInMap("StorageDescriptor")
    private DLStorageDescriptor storageDescriptor;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("ViewExpandedText")
    private String viewExpandedText;

    @com.aliyun.core.annotation.NameInMap("ViewOriginalText")
    private String viewOriginalText;

    private DLTable(Builder builder) {
        this.catalogName = builder.catalogName;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.dbId = builder.dbId;
        this.dbName = builder.dbName;
        this.description = builder.description;
        this.lastAccessTime = builder.lastAccessTime;
        this.location = builder.location;
        this.modifierId = builder.modifierId;
        this.name = builder.name;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.parameters = builder.parameters;
        this.partitionKeys = builder.partitionKeys;
        this.retention = builder.retention;
        this.storageDescriptor = builder.storageDescriptor;
        this.tableType = builder.tableType;
        this.viewExpandedText = builder.viewExpandedText;
        this.viewOriginalText = builder.viewOriginalText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLTable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creatorId
     */
    public Long getCreatorId() {
        return this.creatorId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return modifierId
     */
    public Long getModifierId() {
        return this.modifierId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<DLColumn> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return storageDescriptor
     */
    public DLStorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
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
        private String catalogName; 
        private Integer createTime; 
        private Long creatorId; 
        private Long dbId; 
        private String dbName; 
        private String description; 
        private Integer lastAccessTime; 
        private String location; 
        private Long modifierId; 
        private String name; 
        private String owner; 
        private String ownerType; 
        private java.util.Map<String, ?> parameters; 
        private java.util.List<DLColumn> partitionKeys; 
        private Integer retention; 
        private DLStorageDescriptor storageDescriptor; 
        private String tableType; 
        private String viewExpandedText; 
        private String viewOriginalText; 

        private Builder() {
        } 

        private Builder(DLTable model) {
            this.catalogName = model.catalogName;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.dbId = model.dbId;
            this.dbName = model.dbName;
            this.description = model.description;
            this.lastAccessTime = model.lastAccessTime;
            this.location = model.location;
            this.modifierId = model.modifierId;
            this.name = model.name;
            this.owner = model.owner;
            this.ownerType = model.ownerType;
            this.parameters = model.parameters;
            this.partitionKeys = model.partitionKeys;
            this.retention = model.retention;
            this.storageDescriptor = model.storageDescriptor;
            this.tableType = model.tableType;
            this.viewExpandedText = model.viewExpandedText;
            this.viewOriginalText = model.viewOriginalText;
        } 

        /**
         * <p>The name of the data catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The time when the table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1731586286</p>
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the table creator.</p>
         * 
         * <strong>example:</strong>
         * <p>8****</p>
         */
        public Builder creatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The ID of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder dbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The name of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The description of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the table was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>1608707407</p>
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * <p>The storage path of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://xxx</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The user who last modified the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1410769</p>
         */
        public Builder modifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>100g_customer</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the table owner.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The type of the owner. Valid values: USER, ROLE, and GROUP.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The key-value pairs of the parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;EXTERNAL&quot;: &quot;TRUE&quot;,
         *       &quot;delta.minReaderVersion&quot;: &quot;1&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The list of partition keys.</p>
         */
        public Builder partitionKeys(java.util.List<DLColumn> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * <p>The retention period of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        /**
         * <p>The storage description, including the storage features and format details of the table.</p>
         */
        public Builder storageDescriptor(DLStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }

        /**
         * <p>The type of the metadata table, such as MANAGED_TABLE, EXTERNAL_TABLE, VIRTUAL_VIEW, INDEX_TABLE, or MATERIALIZED_VIEW.</p>
         * 
         * <strong>example:</strong>
         * <p>EXTERNAL_TABLE</p>
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * <p>The expanded text of the view if the table is a view.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder viewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * <p>The original text of the view if the table is a view.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder viewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        public DLTable build() {
            return new DLTable(this);
        } 

    } 

}
