// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UncompressedFileInfo} extends {@link TeaModel}
 *
 * <p>UncompressedFileInfo</p>
 */
public class UncompressedFileInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("is_folder")
    private Boolean isFolder;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < UncompressedFileInfo > items;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    private UncompressedFileInfo(Builder builder) {
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.isFolder = builder.isFolder;
        this.items = builder.items;
        this.name = builder.name;
        this.size = builder.size;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UncompressedFileInfo create() {
        return builder().build();
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return isFolder
     */
    public Boolean getIsFolder() {
        return this.isFolder;
    }

    /**
     * @return items
     */
    public java.util.List < UncompressedFileInfo > getItems() {
        return this.items;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String driveId; 
        private String fileId; 
        private Boolean isFolder; 
        private java.util.List < UncompressedFileInfo > items; 
        private String name; 
        private Long size; 
        private Long updatedAt; 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
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
         * is_folder.
         */
        public Builder isFolder(Boolean isFolder) {
            this.isFolder = isFolder;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List < UncompressedFileInfo > items) {
            this.items = items;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UncompressedFileInfo build() {
            return new UncompressedFileInfo(this);
        } 

    } 

}
