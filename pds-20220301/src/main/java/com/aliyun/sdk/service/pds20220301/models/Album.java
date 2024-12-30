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
 * {@link Album} extends {@link TeaModel}
 *
 * <p>Album</p>
 */
public class Album extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("album_id")
    private String albumId;

    @com.aliyun.core.annotation.NameInMap("base_face_file")
    private File baseFaceFile;

    @com.aliyun.core.annotation.NameInMap("base_face_group_id")
    private String baseFaceGroupId;

    @com.aliyun.core.annotation.NameInMap("cover_file")
    private File coverFile;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("file_count")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_tags")
    private java.util.Map<String, String> userTags;

    private Album(Builder builder) {
        this.albumId = builder.albumId;
        this.baseFaceFile = builder.baseFaceFile;
        this.baseFaceGroupId = builder.baseFaceGroupId;
        this.coverFile = builder.coverFile;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.fileCount = builder.fileCount;
        this.name = builder.name;
        this.owner = builder.owner;
        this.updatedAt = builder.updatedAt;
        this.userTags = builder.userTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Album create() {
        return builder().build();
    }

    /**
     * @return albumId
     */
    public String getAlbumId() {
        return this.albumId;
    }

    /**
     * @return baseFaceFile
     */
    public File getBaseFaceFile() {
        return this.baseFaceFile;
    }

    /**
     * @return baseFaceGroupId
     */
    public String getBaseFaceGroupId() {
        return this.baseFaceGroupId;
    }

    /**
     * @return coverFile
     */
    public File getCoverFile() {
        return this.coverFile;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileCount
     */
    public Long getFileCount() {
        return this.fileCount;
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
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userTags
     */
    public java.util.Map<String, String> getUserTags() {
        return this.userTags;
    }

    public static final class Builder {
        private String albumId; 
        private File baseFaceFile; 
        private String baseFaceGroupId; 
        private File coverFile; 
        private String createdAt; 
        private String description; 
        private Long fileCount; 
        private String name; 
        private String owner; 
        private String updatedAt; 
        private java.util.Map<String, String> userTags; 

        /**
         * album_id.
         */
        public Builder albumId(String albumId) {
            this.albumId = albumId;
            return this;
        }

        /**
         * base_face_file.
         */
        public Builder baseFaceFile(File baseFaceFile) {
            this.baseFaceFile = baseFaceFile;
            return this;
        }

        /**
         * base_face_group_id.
         */
        public Builder baseFaceGroupId(String baseFaceGroupId) {
            this.baseFaceGroupId = baseFaceGroupId;
            return this;
        }

        /**
         * cover_file.
         */
        public Builder coverFile(File coverFile) {
            this.coverFile = coverFile;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * file_count.
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
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
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_tags.
         */
        public Builder userTags(java.util.Map<String, String> userTags) {
            this.userTags = userTags;
            return this;
        }

        public Album build() {
            return new Album(this);
        } 

    } 

}
