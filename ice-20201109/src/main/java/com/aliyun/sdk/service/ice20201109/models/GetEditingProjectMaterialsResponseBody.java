// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingProjectMaterialsResponseBody</p>
 */
public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveMaterials")
    private java.util.List < LiveMaterials> liveMaterials;

    @com.aliyun.core.annotation.NameInMap("MediaInfos")
    private java.util.List < MediaInfos> mediaInfos;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectMaterials")
    private java.util.List < String > projectMaterials;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEditingProjectMaterialsResponseBody(Builder builder) {
        this.liveMaterials = builder.liveMaterials;
        this.mediaInfos = builder.mediaInfos;
        this.projectId = builder.projectId;
        this.projectMaterials = builder.projectMaterials;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingProjectMaterialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveMaterials
     */
    public java.util.List < LiveMaterials> getLiveMaterials() {
        return this.liveMaterials;
    }

    /**
     * @return mediaInfos
     */
    public java.util.List < MediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectMaterials
     */
    public java.util.List < String > getProjectMaterials() {
        return this.projectMaterials;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LiveMaterials> liveMaterials; 
        private java.util.List < MediaInfos> mediaInfos; 
        private String projectId; 
        private java.util.List < String > projectMaterials; 
        private String requestId; 

        /**
         * <p>The materials associated with the live stream.</p>
         */
        public Builder liveMaterials(java.util.List < LiveMaterials> liveMaterials) {
            this.liveMaterials = liveMaterials;
            return this;
        }

        /**
         * <p>The media assets that meet the specified conditions.</p>
         */
        public Builder mediaInfos(java.util.List < MediaInfos> mediaInfos) {
            this.mediaInfos = mediaInfos;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>67ae06542b9b93e0d1c387</strong></strong></em></p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The materials associated with the editing project. A live stream editing project will be associated with a regular editing project after the live streaming ends.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>9b145c5cafc2e057304fcd</strong></strong></em></p>
         */
        public Builder projectMaterials(java.util.List < String > projectMaterials) {
            this.projectMaterials = projectMaterials;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>89-C21D-4B78-AE24-3788B8</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEditingProjectMaterialsResponseBody build() {
            return new GetEditingProjectMaterialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class LiveMaterials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("LiveUrl")
        private String liveUrl;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LiveMaterials(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.liveUrl = builder.liveUrl;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveMaterials create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return liveUrl
         */
        public String getLiveUrl() {
            return this.liveUrl;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String liveUrl; 
            private String streamName; 

            /**
             * <p>The application name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>testrecord</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The domain name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>test.alivecdn.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://test.alivecdn.com/testrecord/teststream</p>
             */
            public Builder liveUrl(String liveUrl) {
                this.liveUrl = liveUrl;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>testrecord</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveMaterials build() {
                return new LiveMaterials(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
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

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1132.68</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>216.206667</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.mp4</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>30611502</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The file status.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>source_file</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The container format.</p>
             * 
             * <strong>example:</strong>
             * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>540</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The region in which the file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>960</p>
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
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
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

            /**
             * <p>The basic information of the file, such as the duration and size.</p>
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
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class MediaBasicInfo extends TeaModel {
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
             * <p>The business type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The category of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The thumbnail URL of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://sample-bucket.oss-cn-shanghai.aliyuncs.com/sample-corver.jpg?Expires=1628670610&OSSAccessKeyId=AK&Signature=signature">http://sample-bucket.oss-cn-shanghai.aliyuncs.com/sample-corver.jpg?Expires=1628670610&amp;OSSAccessKeyId=AK&amp;Signature=signature</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media asset was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the media asset was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:08Z</p>
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
                return this;
            }

            /**
             * <p>The description of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>sample_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the media asset in another service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/file.mp4">http://bucket.oss-cn-shanghai.aliyuncs.com/file.mp4</a></p>
             */
            public Builder inputURL(String inputURL) {
                this.inputURL = inputURL;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong><strong>64623a94eca8516569c8f</strong></strong></em></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The tags of the media asset.</p>
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * <p>The type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The time when the media asset was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T04:11:08Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The snapshots of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder snapshots(String snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The source of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The sprite of the media asset</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * <p>The status of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>file.mp4</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The transcoding status of the media asset.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TranscodeSuccess: transcoding completed.</li>
             * <li>TranscodeFailed: transcoding failed.</li>
             * <li>Init: initializing.</li>
             * <li>Transcoding: transcoding in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>userData</p>
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
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class MediaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @com.aliyun.core.annotation.NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
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
             * <p>The information about the file.</p>
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * <p>The basic information of the media asset.</p>
             */
            public Builder mediaBasicInfo(MediaBasicInfo mediaBasicInfo) {
                this.mediaBasicInfo = mediaBasicInfo;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong><strong>64623a94eca8516569c8fe</strong></strong></em></p>
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
