// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVideoInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoInfoResponseBody</p>
 */
public class GetVideoInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Video")
    private Video video;

    private GetVideoInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return video
     */
    public Video getVideo() {
        return this.video;
    }

    public static final class Builder {
        private String requestId; 
        private Video video; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the audio or video file.</p>
         */
        public Builder video(Video video) {
            this.video = video;
            return this;
        }

        public GetVideoInfoResponseBody build() {
            return new GetVideoInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoInfoResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List < String > snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < String > getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < String > snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < String > snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoInfoResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CustomMediaInfo")
        private String customMediaInfo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @com.aliyun.core.annotation.NameInMap("RestoreStatus")
        private String restoreStatus;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private Snapshots snapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
        private String templateGroupId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private Video(Builder builder) {
            this.appId = builder.appId;
            this.auditStatus = builder.auditStatus;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.customMediaInfo = builder.customMediaInfo;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.duration = builder.duration;
            this.modificationTime = builder.modificationTime;
            this.regionId = builder.regionId;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.templateGroupId = builder.templateGroupId;
            this.title = builder.title;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return customMediaInfo
         */
        public String getCustomMediaInfo() {
            return this.customMediaInfo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadSwitch
         */
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return restoreExpiration
         */
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        /**
         * @return restoreStatus
         */
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public Snapshots getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return templateGroupId
         */
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String appId; 
            private String auditStatus; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String customMediaInfo; 
            private String description; 
            private String downloadSwitch; 
            private Float duration; 
            private String modificationTime; 
            private String regionId; 
            private String restoreExpiration; 
            private String restoreStatus; 
            private Long size; 
            private Snapshots snapshots; 
            private String status; 
            private String storageClass; 
            private String storageLocation; 
            private String tags; 
            private String templateGroupId; 
            private String title; 
            private String videoId; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The final review result of the audio or video file. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: pass</li>
             * <li><strong>Blocked</strong>: blocked</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>The category ID of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>781111****</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>Category name</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The thumbnail URL of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The custom information about the media file.\n\n&gt; This parameter has been deprecated. This parameter is no longer returned after you call the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;aaa&quot;:&quot;test&quot;}</p>
             */
            public Builder customMediaInfo(String customMediaInfo) {
                this.customMediaInfo = customMediaInfo;
                return this;
            }

            /**
             * <p>The description of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>Video description in ApsaraVideo VOD</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the offline download feature is enabled. If you enable the offline download feature, users can download and play videos by using the ApsaraVideo Player on a local PC. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: the offline download feature is enabled.</li>
             * <li><strong>off</strong>: the offline download feature is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * <p>The duration of the media file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>135.6</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the audio or video file was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T10:15:50Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The region where the media file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The period of time in which the object remains in the restored state.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T10:14:14Z</p>
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * <p>The restoration status of the audio or video file. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong></li>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * <p>The size of the source file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10897890</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The video snapshot URLs.</p>
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The status of the media file. For more information about the operations that you can perform on files in different statuses and usage limits, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: the status of a video</a>. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>UploadFail</strong></li>
             * <li><strong>UploadSucc</strong></li>
             * <li><strong>Transcoding</strong></li>
             * <li><strong>TranscodeFail</strong></li>
             * <li><strong>Blocked</strong></li>
             * <li><strong>Normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage class of the audio or video file. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
             * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
             * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
             * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
             * <li><strong>SourceIA</strong>: Only the source files are IA objects.</li>
             * <li><strong>SourceArchive</strong>: Only the source files are Archive objects.</li>
             * <li><strong>SourceColdArchive</strong>: Only the source files are Cold Archive objects.</li>
             * <li><strong>Changing</strong>: The storage class of the audio or video file is being changed.</li>
             * <li><strong>SourceChanging</strong>: The storage class of the source file is being changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The storage address of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>out-201703232251****.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the audio or video file. Multiple tags are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>Tag 1,Tag 2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>9ae2af636ca64835b0c10412f448****</p>
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * <p>The title of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>Video title in ApsaraVideo VOD</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>9b73864d75f1d231e9001cd5f8****</p>
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
}
