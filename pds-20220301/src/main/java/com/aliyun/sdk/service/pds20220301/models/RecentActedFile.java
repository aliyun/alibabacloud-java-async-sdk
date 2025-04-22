// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link RecentActedFile} extends {@link TeaModel}
 *
 * <p>RecentActedFile</p>
 */
public class RecentActedFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List<String> actionList;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("drive_is_handover")
    private Boolean driveIsHandover;

    @com.aliyun.core.annotation.NameInMap("drive_name")
    private String driveName;

    @com.aliyun.core.annotation.NameInMap("drive_owner_id")
    private String driveOwnerId;

    @com.aliyun.core.annotation.NameInMap("drive_owner_type")
    private String driveOwnerType;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("file_name")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("thumbnail")
    private String thumbnail;

    @com.aliyun.core.annotation.NameInMap("trashed")
    private Boolean trashed;

    private RecentActedFile(Builder builder) {
        this.actionList = builder.actionList;
        this.category = builder.category;
        this.deleted = builder.deleted;
        this.driveId = builder.driveId;
        this.driveIsHandover = builder.driveIsHandover;
        this.driveName = builder.driveName;
        this.driveOwnerId = builder.driveOwnerId;
        this.driveOwnerType = builder.driveOwnerType;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.size = builder.size;
        this.thumbnail = builder.thumbnail;
        this.trashed = builder.trashed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecentActedFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionList
     */
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return driveIsHandover
     */
    public Boolean getDriveIsHandover() {
        return this.driveIsHandover;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return driveOwnerId
     */
    public String getDriveOwnerId() {
        return this.driveOwnerId;
    }

    /**
     * @return driveOwnerType
     */
    public String getDriveOwnerType() {
        return this.driveOwnerType;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    /**
     * @return trashed
     */
    public Boolean getTrashed() {
        return this.trashed;
    }

    public static final class Builder {
        private java.util.List<String> actionList; 
        private String category; 
        private Boolean deleted; 
        private String driveId; 
        private Boolean driveIsHandover; 
        private String driveName; 
        private String driveOwnerId; 
        private String driveOwnerType; 
        private String fileId; 
        private String fileName; 
        private Long size; 
        private String thumbnail; 
        private Boolean trashed; 

        private Builder() {
        } 

        private Builder(RecentActedFile model) {
            this.actionList = model.actionList;
            this.category = model.category;
            this.deleted = model.deleted;
            this.driveId = model.driveId;
            this.driveIsHandover = model.driveIsHandover;
            this.driveName = model.driveName;
            this.driveOwnerId = model.driveOwnerId;
            this.driveOwnerType = model.driveOwnerType;
            this.fileId = model.fileId;
            this.fileName = model.fileName;
            this.size = model.size;
            this.thumbnail = model.thumbnail;
            this.trashed = model.trashed;
        } 

        /**
         * action_list.
         */
        public Builder actionList(java.util.List<String> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
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
         * drive_is_handover.
         */
        public Builder driveIsHandover(Boolean driveIsHandover) {
            this.driveIsHandover = driveIsHandover;
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
         * drive_owner_id.
         */
        public Builder driveOwnerId(String driveOwnerId) {
            this.driveOwnerId = driveOwnerId;
            return this;
        }

        /**
         * drive_owner_type.
         */
        public Builder driveOwnerType(String driveOwnerType) {
            this.driveOwnerType = driveOwnerType;
            return this;
        }

        /**
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * file_name.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * thumbnail.
         */
        public Builder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * trashed.
         */
        public Builder trashed(Boolean trashed) {
            this.trashed = trashed;
            return this;
        }

        public RecentActedFile build() {
            return new RecentActedFile(this);
        } 

    } 

}
