// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseDriveResponse} extends {@link TeaModel}
 *
 * <p>BaseDriveResponse</p>
 */
public class BaseDriveResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List < String > actionList;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("delta_enabled")
    private Boolean deltaEnabled;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("drive_name")
    private String driveName;

    @com.aliyun.core.annotation.NameInMap("drive_type")
    private String driveType;

    @com.aliyun.core.annotation.NameInMap("encrypt_data_access")
    private Boolean encryptDataAccess;

    @com.aliyun.core.annotation.NameInMap("encrypt_mode")
    private String encryptMode;

    @com.aliyun.core.annotation.NameInMap("is_handover")
    private Boolean isHandover;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("path_status")
    private String pathStatus;

    @com.aliyun.core.annotation.NameInMap("permission")
    private java.util.Map < String, IDPermission > permission;

    @com.aliyun.core.annotation.NameInMap("relative_path")
    private String relativePath;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("store_id")
    private String storeId;

    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("used_size")
    private Long usedSize;

    private BaseDriveResponse(BuilderImpl builder) {
        super(builder);
        this.actionList = builder.actionList;
        this.category = builder.category;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.deltaEnabled = builder.deltaEnabled;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.driveName = builder.driveName;
        this.driveType = builder.driveType;
        this.encryptDataAccess = builder.encryptDataAccess;
        this.encryptMode = builder.encryptMode;
        this.isHandover = builder.isHandover;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.pathStatus = builder.pathStatus;
        this.permission = builder.permission;
        this.relativePath = builder.relativePath;
        this.status = builder.status;
        this.storeId = builder.storeId;
        this.totalSize = builder.totalSize;
        this.updatedAt = builder.updatedAt;
        this.usedSize = builder.usedSize;
    }

    public static BaseDriveResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return actionList
     */
    public java.util.List < String > getActionList() {
        return this.actionList;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deltaEnabled
     */
    public Boolean getDeltaEnabled() {
        return this.deltaEnabled;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return driveType
     */
    public String getDriveType() {
        return this.driveType;
    }

    /**
     * @return encryptDataAccess
     */
    public Boolean getEncryptDataAccess() {
        return this.encryptDataAccess;
    }

    /**
     * @return encryptMode
     */
    public String getEncryptMode() {
        return this.encryptMode;
    }

    /**
     * @return isHandover
     */
    public Boolean getIsHandover() {
        return this.isHandover;
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
     * @return pathStatus
     */
    public String getPathStatus() {
        return this.pathStatus;
    }

    /**
     * @return permission
     */
    public java.util.Map < String, IDPermission > getPermission() {
        return this.permission;
    }

    /**
     * @return relativePath
     */
    public String getRelativePath() {
        return this.relativePath;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return usedSize
     */
    public Long getUsedSize() {
        return this.usedSize;
    }

    public interface Builder extends Response.Builder<BaseDriveResponse, Builder> {

        Builder actionList(java.util.List < String > actionList);

        Builder category(String category);

        Builder createdAt(String createdAt);

        Builder creator(String creator);

        Builder deltaEnabled(Boolean deltaEnabled);

        Builder description(String description);

        Builder domainId(String domainId);

        Builder driveId(String driveId);

        Builder driveName(String driveName);

        Builder driveType(String driveType);

        Builder encryptDataAccess(Boolean encryptDataAccess);

        Builder encryptMode(String encryptMode);

        Builder isHandover(Boolean isHandover);

        Builder owner(String owner);

        Builder ownerType(String ownerType);

        Builder pathStatus(String pathStatus);

        Builder permission(java.util.Map < String, IDPermission > permission);

        Builder relativePath(String relativePath);

        Builder status(String status);

        Builder storeId(String storeId);

        Builder totalSize(Long totalSize);

        Builder updatedAt(String updatedAt);

        Builder usedSize(Long usedSize);

        @Override
        BaseDriveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseDriveResponse, Builder>
            implements Builder {
        private java.util.List < String > actionList; 
        private String category; 
        private String createdAt; 
        private String creator; 
        private Boolean deltaEnabled; 
        private String description; 
        private String domainId; 
        private String driveId; 
        private String driveName; 
        private String driveType; 
        private Boolean encryptDataAccess; 
        private String encryptMode; 
        private Boolean isHandover; 
        private String owner; 
        private String ownerType; 
        private String pathStatus; 
        private java.util.Map < String, IDPermission > permission; 
        private String relativePath; 
        private String status; 
        private String storeId; 
        private Long totalSize; 
        private String updatedAt; 
        private Long usedSize; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseDriveResponse response) {
            super(response);
            this.actionList = response.actionList;
            this.category = response.category;
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.deltaEnabled = response.deltaEnabled;
            this.description = response.description;
            this.domainId = response.domainId;
            this.driveId = response.driveId;
            this.driveName = response.driveName;
            this.driveType = response.driveType;
            this.encryptDataAccess = response.encryptDataAccess;
            this.encryptMode = response.encryptMode;
            this.isHandover = response.isHandover;
            this.owner = response.owner;
            this.ownerType = response.ownerType;
            this.pathStatus = response.pathStatus;
            this.permission = response.permission;
            this.relativePath = response.relativePath;
            this.status = response.status;
            this.storeId = response.storeId;
            this.totalSize = response.totalSize;
            this.updatedAt = response.updatedAt;
            this.usedSize = response.usedSize;
        } 

        /**
         * action_list.
         */
        @Override
        public Builder actionList(java.util.List < String > actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * category.
         */
        @Override
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * delta_enabled.
         */
        @Override
        public Builder deltaEnabled(Boolean deltaEnabled) {
            this.deltaEnabled = deltaEnabled;
            return this;
        }

        /**
         * description.
         */
        @Override
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_id.
         */
        @Override
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * drive_name.
         */
        @Override
        public Builder driveName(String driveName) {
            this.driveName = driveName;
            return this;
        }

        /**
         * drive_type.
         */
        @Override
        public Builder driveType(String driveType) {
            this.driveType = driveType;
            return this;
        }

        /**
         * encrypt_data_access.
         */
        @Override
        public Builder encryptDataAccess(Boolean encryptDataAccess) {
            this.encryptDataAccess = encryptDataAccess;
            return this;
        }

        /**
         * encrypt_mode.
         */
        @Override
        public Builder encryptMode(String encryptMode) {
            this.encryptMode = encryptMode;
            return this;
        }

        /**
         * is_handover.
         */
        @Override
        public Builder isHandover(Boolean isHandover) {
            this.isHandover = isHandover;
            return this;
        }

        /**
         * owner.
         */
        @Override
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * owner_type.
         */
        @Override
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * path_status.
         */
        @Override
        public Builder pathStatus(String pathStatus) {
            this.pathStatus = pathStatus;
            return this;
        }

        /**
         * permission.
         */
        @Override
        public Builder permission(java.util.Map < String, IDPermission > permission) {
            this.permission = permission;
            return this;
        }

        /**
         * relative_path.
         */
        @Override
        public Builder relativePath(String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * store_id.
         */
        @Override
        public Builder storeId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        /**
         * total_size.
         */
        @Override
        public Builder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * updated_at.
         */
        @Override
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * used_size.
         */
        @Override
        public Builder usedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }

        @Override
        public BaseDriveResponse build() {
            return new BaseDriveResponse(this);
        } 

    } 

}
