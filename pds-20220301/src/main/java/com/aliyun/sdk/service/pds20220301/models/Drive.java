// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Drive} extends {@link TeaModel}
 *
 * <p>Drive</p>
 */
public class Drive extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

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

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    @com.aliyun.core.annotation.NameInMap("used_size")
    private Long usedSize;

    private Drive(Builder builder) {
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.driveName = builder.driveName;
        this.driveType = builder.driveType;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.status = builder.status;
        this.totalSize = builder.totalSize;
        this.usedSize = builder.usedSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Drive create() {
        return builder().build();
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return usedSize
     */
    public Long getUsedSize() {
        return this.usedSize;
    }

    public static final class Builder {
        private String createdAt; 
        private String creator; 
        private String description; 
        private String domainId; 
        private String driveId; 
        private String driveName; 
        private String driveType; 
        private String owner; 
        private String ownerType; 
        private String status; 
        private Long totalSize; 
        private Long usedSize; 

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * drive_name.
         */
        public Builder driveName(String driveName) {
            this.driveName = driveName;
            return this;
        }

        /**
         * drive_type.
         */
        public Builder driveType(String driveType) {
            this.driveType = driveType;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * owner_type.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * total_size.
         */
        public Builder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * used_size.
         */
        public Builder usedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }

        public Drive build() {
            return new Drive(this);
        } 

    } 

}
