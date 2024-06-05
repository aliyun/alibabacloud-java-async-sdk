// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Revision} extends {@link TeaModel}
 *
 * <p>Revision</p>
 */
public class Revision extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content_hash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("content_hash_name")
    private String contentHashName;

    @com.aliyun.core.annotation.NameInMap("crc64_hash")
    private String crc64Hash;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator_id")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creator_name")
    private String creatorName;

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

    @com.aliyun.core.annotation.NameInMap("is_latest_version")
    private Boolean isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("keep_forever")
    private Boolean keepForever;

    @com.aliyun.core.annotation.NameInMap("revision_description")
    private String revisionDescription;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("revision_name")
    private String revisionName;

    @com.aliyun.core.annotation.NameInMap("revision_version")
    private Long revisionVersion;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("thumbnail")
    private String thumbnail;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private Revision(Builder builder) {
        this.contentHash = builder.contentHash;
        this.contentHashName = builder.contentHashName;
        this.crc64Hash = builder.crc64Hash;
        this.createdAt = builder.createdAt;
        this.creatorId = builder.creatorId;
        this.creatorName = builder.creatorName;
        this.domainId = builder.domainId;
        this.downloadUrl = builder.downloadUrl;
        this.driveId = builder.driveId;
        this.fileExtension = builder.fileExtension;
        this.fileId = builder.fileId;
        this.isLatestVersion = builder.isLatestVersion;
        this.keepForever = builder.keepForever;
        this.revisionDescription = builder.revisionDescription;
        this.revisionId = builder.revisionId;
        this.revisionName = builder.revisionName;
        this.revisionVersion = builder.revisionVersion;
        this.size = builder.size;
        this.thumbnail = builder.thumbnail;
        this.updatedAt = builder.updatedAt;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Revision create() {
        return builder().build();
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
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
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
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return keepForever
     */
    public Boolean getKeepForever() {
        return this.keepForever;
    }

    /**
     * @return revisionDescription
     */
    public String getRevisionDescription() {
        return this.revisionDescription;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return revisionName
     */
    public String getRevisionName() {
        return this.revisionName;
    }

    /**
     * @return revisionVersion
     */
    public Long getRevisionVersion() {
        return this.revisionVersion;
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
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String contentHash; 
        private String contentHashName; 
        private String crc64Hash; 
        private String createdAt; 
        private String creatorId; 
        private String creatorName; 
        private String domainId; 
        private String downloadUrl; 
        private String driveId; 
        private String fileExtension; 
        private String fileId; 
        private Boolean isLatestVersion; 
        private Boolean keepForever; 
        private String revisionDescription; 
        private String revisionId; 
        private String revisionName; 
        private Long revisionVersion; 
        private Long size; 
        private String thumbnail; 
        private String updatedAt; 
        private String url; 

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
         * creator_id.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * creator_name.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
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
         * is_latest_version.
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * keep_forever.
         */
        public Builder keepForever(Boolean keepForever) {
            this.keepForever = keepForever;
            return this;
        }

        /**
         * revision_description.
         */
        public Builder revisionDescription(String revisionDescription) {
            this.revisionDescription = revisionDescription;
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
         * revision_name.
         */
        public Builder revisionName(String revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        /**
         * revision_version.
         */
        public Builder revisionVersion(Long revisionVersion) {
            this.revisionVersion = revisionVersion;
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
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Revision build() {
            return new Revision(this);
        } 

    } 

}
