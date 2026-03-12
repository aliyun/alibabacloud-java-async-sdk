// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
 */
public class BatchGetYikeAssetMediaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private java.util.List<String> ignoredList;

    @com.aliyun.core.annotation.NameInMap("MediaInfos")
    private java.util.List<MediaInfos> mediaInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetYikeAssetMediaInfosResponseBody(Builder builder) {
        this.ignoredList = builder.ignoredList;
        this.mediaInfos = builder.mediaInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetYikeAssetMediaInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoredList
     */
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return mediaInfos
     */
    public java.util.List<MediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> ignoredList; 
        private java.util.List<MediaInfos> mediaInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchGetYikeAssetMediaInfosResponseBody model) {
            this.ignoredList = model.ignoredList;
            this.mediaInfos = model.mediaInfos;
            this.requestId = model.requestId;
        } 

        /**
         * IgnoredList.
         */
        public Builder ignoredList(java.util.List<String> ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * MediaInfos.
         */
        public Builder mediaInfos(java.util.List<MediaInfos> mediaInfos) {
            this.mediaInfos = mediaInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetYikeAssetMediaInfosResponseBody build() {
            return new BatchGetYikeAssetMediaInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
     */
    public static class BizData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditBlockedLabel")
        private String auditBlockedLabel;

        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("CreationJobId")
        private String creationJobId;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("IsFavorite")
        private String isFavorite;

        @com.aliyun.core.annotation.NameInMap("IsLogicalDeleted")
        private String isLogicalDeleted;

        @com.aliyun.core.annotation.NameInMap("MediaAssetSubType")
        private String mediaAssetSubType;

        @com.aliyun.core.annotation.NameInMap("MediaAssetType")
        private String mediaAssetType;

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private BizData(Builder builder) {
            this.auditBlockedLabel = builder.auditBlockedLabel;
            this.auditStatus = builder.auditStatus;
            this.creationJobId = builder.creationJobId;
            this.folderId = builder.folderId;
            this.isFavorite = builder.isFavorite;
            this.isLogicalDeleted = builder.isLogicalDeleted;
            this.mediaAssetSubType = builder.mediaAssetSubType;
            this.mediaAssetType = builder.mediaAssetType;
            this.productionId = builder.productionId;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizData create() {
            return builder().build();
        }

        /**
         * @return auditBlockedLabel
         */
        public String getAuditBlockedLabel() {
            return this.auditBlockedLabel;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return creationJobId
         */
        public String getCreationJobId() {
            return this.creationJobId;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return isFavorite
         */
        public String getIsFavorite() {
            return this.isFavorite;
        }

        /**
         * @return isLogicalDeleted
         */
        public String getIsLogicalDeleted() {
            return this.isLogicalDeleted;
        }

        /**
         * @return mediaAssetSubType
         */
        public String getMediaAssetSubType() {
            return this.mediaAssetSubType;
        }

        /**
         * @return mediaAssetType
         */
        public String getMediaAssetType() {
            return this.mediaAssetType;
        }

        /**
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String auditBlockedLabel; 
            private String auditStatus; 
            private String creationJobId; 
            private String folderId; 
            private String isFavorite; 
            private String isLogicalDeleted; 
            private String mediaAssetSubType; 
            private String mediaAssetType; 
            private String productionId; 
            private String sourceId; 
            private String sourceName; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(BizData model) {
                this.auditBlockedLabel = model.auditBlockedLabel;
                this.auditStatus = model.auditStatus;
                this.creationJobId = model.creationJobId;
                this.folderId = model.folderId;
                this.isFavorite = model.isFavorite;
                this.isLogicalDeleted = model.isLogicalDeleted;
                this.mediaAssetSubType = model.mediaAssetSubType;
                this.mediaAssetType = model.mediaAssetType;
                this.productionId = model.productionId;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.sourceType = model.sourceType;
            } 

            /**
             * AuditBlockedLabel.
             */
            public Builder auditBlockedLabel(String auditBlockedLabel) {
                this.auditBlockedLabel = auditBlockedLabel;
                return this;
            }

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * CreationJobId.
             */
            public Builder creationJobId(String creationJobId) {
                this.creationJobId = creationJobId;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * IsFavorite.
             */
            public Builder isFavorite(String isFavorite) {
                this.isFavorite = isFavorite;
                return this;
            }

            /**
             * IsLogicalDeleted.
             */
            public Builder isLogicalDeleted(String isLogicalDeleted) {
                this.isLogicalDeleted = isLogicalDeleted;
                return this;
            }

            /**
             * MediaAssetSubType.
             */
            public Builder mediaAssetSubType(String mediaAssetSubType) {
                this.mediaAssetSubType = mediaAssetSubType;
                return this;
            }

            /**
             * MediaAssetType.
             */
            public Builder mediaAssetType(String mediaAssetType) {
                this.mediaAssetType = mediaAssetType;
                return this;
            }

            /**
             * ProductionId.
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public BizData build() {
                return new BizData(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
     */
    public static class FileBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FileStatus")
        private String fileStatus;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("FormatName")
        private String formatName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private FileBasicInfo(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileStatus = builder.fileStatus;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
            this.formatName = builder.formatName;
            this.height = builder.height;
            this.region = builder.region;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileBasicInfo create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileStatus
         */
        public String getFileStatus() {
            return this.fileStatus;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String duration; 
            private String fileName; 
            private String fileSize; 
            private String fileStatus; 
            private String fileType; 
            private String fileUrl; 
            private String formatName; 
            private String height; 
            private String region; 
            private String width; 

            private Builder() {
            } 

            private Builder(FileBasicInfo model) {
                this.bitrate = model.bitrate;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileStatus = model.fileStatus;
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
                this.formatName = model.formatName;
                this.height = model.height;
                this.region = model.region;
                this.width = model.width;
            } 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileStatus.
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * FormatName.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public FileBasicInfo build() {
                return new FileBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
     */
    public static class FileInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        private FileInfoList(Builder builder) {
            this.fileBasicInfo = builder.fileBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfoList create() {
            return builder().build();
        }

        /**
         * @return fileBasicInfo
         */
        public FileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public static final class Builder {
            private FileBasicInfo fileBasicInfo; 

            private Builder() {
            } 

            private Builder(FileInfoList model) {
                this.fileBasicInfo = model.fileBasicInfo;
            } 

            /**
             * FileBasicInfo.
             */
            public Builder fileBasicInfo(FileBasicInfo fileBasicInfo) {
                this.fileBasicInfo = fileBasicInfo;
                return this;
            }

            public FileInfoList build() {
                return new FileInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
     */
    public static class MediaBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletedTime")
        private String deletedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputURL")
        private String inputURL;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaTags")
        private String mediaTags;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private String snapshots;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpriteImages")
        private String spriteImages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaBasicInfo(Builder builder) {
            this.biz = builder.biz;
            this.businessType = builder.businessType;
            this.category = builder.category;
            this.coverURL = builder.coverURL;
            this.createTime = builder.createTime;
            this.deletedTime = builder.deletedTime;
            this.description = builder.description;
            this.inputURL = builder.inputURL;
            this.mediaId = builder.mediaId;
            this.mediaTags = builder.mediaTags;
            this.mediaType = builder.mediaType;
            this.modifiedTime = builder.modifiedTime;
            this.snapshots = builder.snapshots;
            this.source = builder.source;
            this.spriteImages = builder.spriteImages;
            this.status = builder.status;
            this.title = builder.title;
            this.transcodeStatus = builder.transcodeStatus;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBasicInfo create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletedTime
         */
        public String getDeletedTime() {
            return this.deletedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputURL
         */
        public String getInputURL() {
            return this.inputURL;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaTags
         */
        public String getMediaTags() {
            return this.mediaTags;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return snapshots
         */
        public String getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return spriteImages
         */
        public String getSpriteImages() {
            return this.spriteImages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return transcodeStatus
         */
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String biz; 
            private String businessType; 
            private String category; 
            private String coverURL; 
            private String createTime; 
            private String deletedTime; 
            private String description; 
            private String inputURL; 
            private String mediaId; 
            private String mediaTags; 
            private String mediaType; 
            private String modifiedTime; 
            private String snapshots; 
            private String source; 
            private String spriteImages; 
            private String status; 
            private String title; 
            private String transcodeStatus; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaBasicInfo model) {
                this.biz = model.biz;
                this.businessType = model.businessType;
                this.category = model.category;
                this.coverURL = model.coverURL;
                this.createTime = model.createTime;
                this.deletedTime = model.deletedTime;
                this.description = model.description;
                this.inputURL = model.inputURL;
                this.mediaId = model.mediaId;
                this.mediaTags = model.mediaTags;
                this.mediaType = model.mediaType;
                this.modifiedTime = model.modifiedTime;
                this.snapshots = model.snapshots;
                this.source = model.source;
                this.spriteImages = model.spriteImages;
                this.status = model.status;
                this.title = model.title;
                this.transcodeStatus = model.transcodeStatus;
                this.userData = model.userData;
            } 

            /**
             * Biz.
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeletedTime.
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
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
             * InputURL.
             */
            public Builder inputURL(String inputURL) {
                this.inputURL = inputURL;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaTags.
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(String snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SpriteImages.
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * TranscodeStatus.
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaBasicInfo build() {
                return new MediaBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetYikeAssetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetYikeAssetMediaInfosResponseBody</p>
     */
    public static class MediaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizData")
        private BizData bizData;

        @com.aliyun.core.annotation.NameInMap("FileInfoList")
        private java.util.List<FileInfoList> fileInfoList;

        @com.aliyun.core.annotation.NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private MediaInfos(Builder builder) {
            this.bizData = builder.bizData;
            this.fileInfoList = builder.fileInfoList;
            this.mediaBasicInfo = builder.mediaBasicInfo;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfos create() {
            return builder().build();
        }

        /**
         * @return bizData
         */
        public BizData getBizData() {
            return this.bizData;
        }

        /**
         * @return fileInfoList
         */
        public java.util.List<FileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        /**
         * @return mediaBasicInfo
         */
        public MediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private BizData bizData; 
            private java.util.List<FileInfoList> fileInfoList; 
            private MediaBasicInfo mediaBasicInfo; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(MediaInfos model) {
                this.bizData = model.bizData;
                this.fileInfoList = model.fileInfoList;
                this.mediaBasicInfo = model.mediaBasicInfo;
                this.mediaId = model.mediaId;
            } 

            /**
             * BizData.
             */
            public Builder bizData(BizData bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * FileInfoList.
             */
            public Builder fileInfoList(java.util.List<FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * MediaBasicInfo.
             */
            public Builder mediaBasicInfo(MediaBasicInfo mediaBasicInfo) {
                this.mediaBasicInfo = mediaBasicInfo;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public MediaInfos build() {
                return new MediaInfos(this);
            } 

        } 

    }
}
