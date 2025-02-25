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
 * {@link File} extends {@link TeaModel}
 *
 * <p>File</p>
 */
public class File extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_list")
    private java.util.List<String> actionList;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("content_hash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("content_hash_name")
    private String contentHashName;

    @com.aliyun.core.annotation.NameInMap("content_type")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("crc64_hash")
    private String crc64Hash;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("download_url")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_extension")
    private String fileExtension;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.NameInMap("id_path")
    private String idPath;

    @com.aliyun.core.annotation.NameInMap("image_media_metadata")
    private ImageMediaMetadata imageMediaMetadata;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<String> labels;

    @com.aliyun.core.annotation.NameInMap("local_created_at")
    private String localCreatedAt;

    @com.aliyun.core.annotation.NameInMap("local_modified_at")
    private String localModifiedAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("name_path")
    private String namePath;

    @com.aliyun.core.annotation.NameInMap("parent_file_id")
    private String parentFileId;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("starred")
    private Boolean starred;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("thumbnail")
    private String thumbnail;

    @com.aliyun.core.annotation.NameInMap("thumbnail_urls")
    private java.util.Map<String, String> thumbnailUrls;

    @com.aliyun.core.annotation.NameInMap("trashed_at")
    private String trashedAt;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    @com.aliyun.core.annotation.NameInMap("user_tags")
    private java.util.Map<String, String> userTags;

    @com.aliyun.core.annotation.NameInMap("video_media_metadata")
    private VideoMediaMetadata videoMediaMetadata;

    private File(Builder builder) {
        this.actionList = builder.actionList;
        this.category = builder.category;
        this.contentHash = builder.contentHash;
        this.contentHashName = builder.contentHashName;
        this.contentType = builder.contentType;
        this.crc64Hash = builder.crc64Hash;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.downloadUrl = builder.downloadUrl;
        this.driveId = builder.driveId;
        this.fileExtension = builder.fileExtension;
        this.fileId = builder.fileId;
        this.hidden = builder.hidden;
        this.idPath = builder.idPath;
        this.imageMediaMetadata = builder.imageMediaMetadata;
        this.labels = builder.labels;
        this.localCreatedAt = builder.localCreatedAt;
        this.localModifiedAt = builder.localModifiedAt;
        this.name = builder.name;
        this.namePath = builder.namePath;
        this.parentFileId = builder.parentFileId;
        this.revisionId = builder.revisionId;
        this.size = builder.size;
        this.starred = builder.starred;
        this.status = builder.status;
        this.thumbnail = builder.thumbnail;
        this.thumbnailUrls = builder.thumbnailUrls;
        this.trashedAt = builder.trashedAt;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
        this.uploadId = builder.uploadId;
        this.userTags = builder.userTags;
        this.videoMediaMetadata = builder.videoMediaMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static File create() {
        return builder().build();
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
     * @return contentHash
     */
    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * @return contentHashName
     */
    public String getContentHashName() {
        return this.contentHashName;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return crc64Hash
     */
    public String getCrc64Hash() {
        return this.crc64Hash;
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileExtension
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return hidden
     */
    public Boolean getHidden() {
        return this.hidden;
    }

    /**
     * @return idPath
     */
    public String getIdPath() {
        return this.idPath;
    }

    /**
     * @return imageMediaMetadata
     */
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    /**
     * @return labels
     */
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    /**
     * @return localCreatedAt
     */
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    /**
     * @return localModifiedAt
     */
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namePath
     */
    public String getNamePath() {
        return this.namePath;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return starred
     */
    public Boolean getStarred() {
        return this.starred;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    /**
     * @return thumbnailUrls
     */
    public java.util.Map<String, String> getThumbnailUrls() {
        return this.thumbnailUrls;
    }

    /**
     * @return trashedAt
     */
    public String getTrashedAt() {
        return this.trashedAt;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return userTags
     */
    public java.util.Map<String, String> getUserTags() {
        return this.userTags;
    }

    /**
     * @return videoMediaMetadata
     */
    public VideoMediaMetadata getVideoMediaMetadata() {
        return this.videoMediaMetadata;
    }

    public static final class Builder {
        private java.util.List<String> actionList; 
        private String category; 
        private String contentHash; 
        private String contentHashName; 
        private String contentType; 
        private String crc64Hash; 
        private String createdAt; 
        private String description; 
        private String domainId; 
        private String downloadUrl; 
        private String driveId; 
        private String fileExtension; 
        private String fileId; 
        private Boolean hidden; 
        private String idPath; 
        private ImageMediaMetadata imageMediaMetadata; 
        private java.util.List<String> labels; 
        private String localCreatedAt; 
        private String localModifiedAt; 
        private String name; 
        private String namePath; 
        private String parentFileId; 
        private String revisionId; 
        private Long size; 
        private Boolean starred; 
        private String status; 
        private String thumbnail; 
        private java.util.Map<String, String> thumbnailUrls; 
        private String trashedAt; 
        private String type; 
        private String updatedAt; 
        private String uploadId; 
        private java.util.Map<String, String> userTags; 
        private VideoMediaMetadata videoMediaMetadata; 

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
         * content_hash.
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * content_hash_name.
         */
        public Builder contentHashName(String contentHashName) {
            this.contentHashName = contentHashName;
            return this;
        }

        /**
         * content_type.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * crc64_hash.
         */
        public Builder crc64Hash(String crc64Hash) {
            this.crc64Hash = crc64Hash;
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
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * download_url.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
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
         * file_extension.
         */
        public Builder fileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
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
         * hidden.
         */
        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        /**
         * id_path.
         */
        public Builder idPath(String idPath) {
            this.idPath = idPath;
            return this;
        }

        /**
         * image_media_metadata.
         */
        public Builder imageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
            this.imageMediaMetadata = imageMediaMetadata;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * local_created_at.
         */
        public Builder localCreatedAt(String localCreatedAt) {
            this.localCreatedAt = localCreatedAt;
            return this;
        }

        /**
         * local_modified_at.
         */
        public Builder localModifiedAt(String localModifiedAt) {
            this.localModifiedAt = localModifiedAt;
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
         * name_path.
         */
        public Builder namePath(String namePath) {
            this.namePath = namePath;
            return this;
        }

        /**
         * parent_file_id.
         */
        public Builder parentFileId(String parentFileId) {
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * revision_id.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
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
         * starred.
         */
        public Builder starred(Boolean starred) {
            this.starred = starred;
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
         * thumbnail.
         */
        public Builder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        /**
         * thumbnail_urls.
         */
        public Builder thumbnailUrls(java.util.Map<String, String> thumbnailUrls) {
            this.thumbnailUrls = thumbnailUrls;
            return this;
        }

        /**
         * trashed_at.
         */
        public Builder trashedAt(String trashedAt) {
            this.trashedAt = trashedAt;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
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
         * upload_id.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /**
         * user_tags.
         */
        public Builder userTags(java.util.Map<String, String> userTags) {
            this.userTags = userTags;
            return this;
        }

        /**
         * video_media_metadata.
         */
        public Builder videoMediaMetadata(VideoMediaMetadata videoMediaMetadata) {
            this.videoMediaMetadata = videoMediaMetadata;
            return this;
        }

        public File build() {
            return new File(this);
        } 

    } 

}
