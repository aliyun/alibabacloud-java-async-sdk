// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetMediaInfosResponseBody</p>
 */
public class BatchGetMediaInfosResponseBody extends TeaModel {
    @NameInMap("MediaInfos")
    private java.util.List < MediaInfos> mediaInfos;

    @NameInMap("RequestId")
    private String requestId;

    private BatchGetMediaInfosResponseBody(Builder builder) {
        this.mediaInfos = builder.mediaInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetMediaInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaInfos
     */
    public java.util.List < MediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MediaInfos> mediaInfos; 
        private String requestId; 

        /**
         * MediaInfos.
         */
        public Builder mediaInfos(java.util.List < MediaInfos> mediaInfos) {
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

        public BatchGetMediaInfosResponseBody build() {
            return new BatchGetMediaInfosResponseBody(this);
        } 

    } 

    public static class FileBasicInfo extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("FileStatus")
        private String fileStatus;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("FormatName")
        private String formatName;

        @NameInMap("Height")
        private String height;

        @NameInMap("Region")
        private String region;

        @NameInMap("Width")
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
    public static class FileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
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
    public static class MediaBasicInfo extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Category")
        private String category;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletedTime")
        private String deletedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InputURL")
        private String inputURL;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaTags")
        private String mediaTags;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Snapshots")
        private String snapshots;

        @NameInMap("Source")
        private String source;

        @NameInMap("SpriteImages")
        private String spriteImages;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @NameInMap("UserData")
        private String userData;

        private MediaBasicInfo(Builder builder) {
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
             * MediaId
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
    public static class MediaInfos extends TeaModel {
        @NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaId")
        private String mediaId;

        private MediaInfos(Builder builder) {
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
         * @return fileInfoList
         */
        public java.util.List < FileInfoList> getFileInfoList() {
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
            private java.util.List < FileInfoList> fileInfoList; 
            private MediaBasicInfo mediaBasicInfo; 
            private String mediaId; 

            /**
             * FileInfos
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
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
             * MediaId
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
