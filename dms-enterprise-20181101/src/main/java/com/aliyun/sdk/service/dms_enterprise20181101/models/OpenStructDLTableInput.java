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
 * {@link OpenStructDLTableInput} extends {@link TeaModel}
 *
 * <p>OpenStructDLTableInput</p>
 */
public class OpenStructDLTableInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private Long creatorId;

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
    private java.util.Map<String, String> parameters;

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

    private OpenStructDLTableInput(Builder builder) {
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
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

    public static OpenStructDLTableInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, String> getParameters() {
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
        private Integer createTime; 
        private Long creatorId; 
        private String description; 
        private Integer lastAccessTime; 
        private String location; 
        private Long modifierId; 
        private String name; 
        private String owner; 
        private String ownerType; 
        private java.util.Map<String, String> parameters; 
        private java.util.List<DLColumn> partitionKeys; 
        private Integer retention; 
        private DLStorageDescriptor storageDescriptor; 
        private String tableType; 
        private String viewExpandedText; 
        private String viewOriginalText; 

        private Builder() {
        } 

        private Builder(OpenStructDLTableInput model) {
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
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
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(Long creatorId) {
            this.creatorId = creatorId;
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
         * LastAccessTime.
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * ModifierId.
         */
        public Builder modifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * PartitionKeys.
         */
        public Builder partitionKeys(java.util.List<DLColumn> partitionKeys) {
            this.partitionKeys = partitionKeys;
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
         * StorageDescriptor.
         */
        public Builder storageDescriptor(DLStorageDescriptor storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
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

        public OpenStructDLTableInput build() {
            return new OpenStructDLTableInput(this);
        } 

    } 

}
