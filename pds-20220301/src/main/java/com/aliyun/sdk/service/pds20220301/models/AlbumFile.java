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
 * {@link AlbumFile} extends {@link TeaModel}
 *
 * <p>AlbumFile</p>
 */
public class AlbumFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("album_id")
    private String albumId;

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

    @com.aliyun.core.annotation.NameInMap("ex_fields_info")
    private java.util.Map<String, ?> exFieldsInfo;

    @com.aliyun.core.annotation.NameInMap("file_extension")
    private String fileExtension;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.NameInMap("image_media_metadata")
    private ImageMediaMetadata imageMediaMetadata;

    @com.aliyun.core.annotation.NameInMap("investigation_info")
    private InvestigationInfo investigationInfo;

    @com.aliyun.core.annotation.NameInMap("joined_at")
    private Long joinedAt;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<String> labels;

    @com.aliyun.core.annotation.NameInMap("local_created_at")
    private String localCreatedAt;

    @com.aliyun.core.annotation.NameInMap("local_modified_at")
    private String localModifiedAt;

    @com.aliyun.core.annotation.NameInMap("mime_type")
    private String mimeType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("object_uri")
    private String objectUri;

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

    @com.aliyun.core.annotation.NameInMap("transhed_at")
    private String transhedAt;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    @com.aliyun.core.annotation.NameInMap("user_meta")
    private String userMeta;

    private AlbumFile(Builder builder) {
        this.albumId = builder.albumId;
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
        this.exFieldsInfo = builder.exFieldsInfo;
        this.fileExtension = builder.fileExtension;
        this.fileId = builder.fileId;
        this.hidden = builder.hidden;
        this.imageMediaMetadata = builder.imageMediaMetadata;
        this.investigationInfo = builder.investigationInfo;
        this.joinedAt = builder.joinedAt;
        this.labels = builder.labels;
        this.localCreatedAt = builder.localCreatedAt;
        this.localModifiedAt = builder.localModifiedAt;
        this.mimeType = builder.mimeType;
        this.name = builder.name;
        this.objectUri = builder.objectUri;
        this.parentFileId = builder.parentFileId;
        this.revisionId = builder.revisionId;
        this.size = builder.size;
        this.starred = builder.starred;
        this.status = builder.status;
        this.thumbnail = builder.thumbnail;
        this.thumbnailUrls = builder.thumbnailUrls;
        this.transhedAt = builder.transhedAt;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
        this.uploadId = builder.uploadId;
        this.userMeta = builder.userMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlbumFile create() {
        return builder().build();
    }

    /**
     * @return albumId
     */
    public String getAlbumId() {
        return this.albumId;
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
     * @return exFieldsInfo
     */
    public java.util.Map<String, ?> getExFieldsInfo() {
        return this.exFieldsInfo;
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
     * @return imageMediaMetadata
     */
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    /**
     * @return investigationInfo
     */
    public InvestigationInfo getInvestigationInfo() {
        return this.investigationInfo;
    }

    /**
     * @return joinedAt
     */
    public Long getJoinedAt() {
        return this.joinedAt;
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
     * @return mimeType
     */
    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectUri
     */
    public String getObjectUri() {
        return this.objectUri;
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
     * @return transhedAt
     */
    public String getTranshedAt() {
        return this.transhedAt;
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
     * @return userMeta
     */
    public String getUserMeta() {
        return this.userMeta;
    }

    public static final class Builder {
        private String albumId; 
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
        private java.util.Map<String, ?> exFieldsInfo; 
        private String fileExtension; 
        private String fileId; 
        private Boolean hidden; 
        private ImageMediaMetadata imageMediaMetadata; 
        private InvestigationInfo investigationInfo; 
        private Long joinedAt; 
        private java.util.List<String> labels; 
        private String localCreatedAt; 
        private String localModifiedAt; 
        private String mimeType; 
        private String name; 
        private String objectUri; 
        private String parentFileId; 
        private String revisionId; 
        private Long size; 
        private Boolean starred; 
        private String status; 
        private String thumbnail; 
        private java.util.Map<String, String> thumbnailUrls; 
        private String transhedAt; 
        private String type; 
        private String updatedAt; 
        private String uploadId; 
        private String userMeta; 

        /**
         * album_id.
         */
        public Builder albumId(String albumId) {
            this.albumId = albumId;
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
         * ex_fields_info.
         */
        public Builder exFieldsInfo(java.util.Map<String, ?> exFieldsInfo) {
            this.exFieldsInfo = exFieldsInfo;
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
         * image_media_metadata.
         */
        public Builder imageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
            this.imageMediaMetadata = imageMediaMetadata;
            return this;
        }

        /**
         * investigation_info.
         */
        public Builder investigationInfo(InvestigationInfo investigationInfo) {
            this.investigationInfo = investigationInfo;
            return this;
        }

        /**
         * joined_at.
         */
        public Builder joinedAt(Long joinedAt) {
            this.joinedAt = joinedAt;
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
         * mime_type.
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
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
         * object_uri.
         */
        public Builder objectUri(String objectUri) {
            this.objectUri = objectUri;
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
         * transhed_at.
         */
        public Builder transhedAt(String transhedAt) {
            this.transhedAt = transhedAt;
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
         * user_meta.
         */
        public Builder userMeta(String userMeta) {
            this.userMeta = userMeta;
            return this;
        }

        public AlbumFile build() {
            return new AlbumFile(this);
        } 

    } 

}
