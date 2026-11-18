// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetVideoInfoResponseBody model) {
            this.requestId = model.requestId;
            this.video = model.video;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The audio or video information.</p>
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
        private java.util.List<String> snapshot;

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
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<String> snapshot; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.snapshot = model.snapshot;
            } 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<String> snapshot) {
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

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

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

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

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
            this.referenceId = builder.referenceId;
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
            this.userData = builder.userData;
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
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
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
         * @return userData
         */
        public String getUserData() {
            return this.userData;
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
            private String referenceId; 
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
            private String userData; 
            private String videoId; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.appId = model.appId;
                this.auditStatus = model.auditStatus;
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.coverURL = model.coverURL;
                this.creationTime = model.creationTime;
                this.customMediaInfo = model.customMediaInfo;
                this.description = model.description;
                this.downloadSwitch = model.downloadSwitch;
                this.duration = model.duration;
                this.modificationTime = model.modificationTime;
                this.referenceId = model.referenceId;
                this.regionId = model.regionId;
                this.restoreExpiration = model.restoreExpiration;
                this.restoreStatus = model.restoreStatus;
                this.size = model.size;
                this.snapshots = model.snapshots;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.storageLocation = model.storageLocation;
                this.tags = model.tags;
                this.templateGroupId = model.templateGroupId;
                this.title = model.title;
                this.userData = model.userData;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The application ID.</p>
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
             * <li><strong>Normal</strong>: Approved.</li>
             * <li><strong>Blocked</strong>: Blocked.</li>
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
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>781111****</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>cate1</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The thumbnail URL of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the audio or video file was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The custom media asset information.</p>
             * <blockquote>
             * <p>This parameter is deprecated. The API no longer returns this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;aaa&quot;:&quot;test&quot;}</p>
             */
            public Builder customMediaInfo(String customMediaInfo) {
                this.customMediaInfo = customMediaInfo;
                return this;
            }

            /**
             * <p>The description of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud VOD video description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The status of the offline download switch. After the offline download feature is enabled, mobile users can cache videos to their local devices for offline viewing by using ApsaraVideo Player. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Offline download</a>. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled. Offline download is allowed.</li>
             * <li><strong>off</strong>: disabled. Offline download is not allowed.</li>
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
             * <p>The duration of the audio or video file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>135.6</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the audio or video file was last updated. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T10:15:50Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. The length is 6 to 64 characters. The ID is unique at the user level.</p>
             * 
             * <strong>example:</strong>
             * <p>123-123</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            /**
             * <p>The region where the audio or video file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The expiration time of the media asset restoration.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T10:14:14Z</p>
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * <p>The restoration status of the media asset. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: The media asset is being restored.</li>
             * <li><strong>Success</strong>: The media asset is restored.</li>
             * <li><strong>Failed</strong>: The media asset failed to be restored.</li>
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
             * <p>The size of the audio or video source file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10897890</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The status of the audio or video file. For more information about the operations that can be performed on audio and video files in each status and the limits, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: audio and video status</a>. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong>: The file is being uploaded.</li>
             * <li><strong>UploadFail</strong>: The file failed to be uploaded.</li>
             * <li><strong>UploadSucc</strong>: The file is uploaded.</li>
             * <li><strong>Transcoding</strong>: The file is being transcoded.</li>
             * <li><strong>TranscodeFail</strong>: The file failed to be transcoded.</li>
             * <li><strong>Blocked</strong>: The file is blocked.</li>
             * <li><strong>Normal</strong>: The file is in a normal state.</li>
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
             * <p>The storage class of the media asset. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: standard.</li>
             * <li><strong>IA</strong>: Infrequent Access (media asset).</li>
             * <li><strong>Archive</strong>: Archive (media asset).</li>
             * <li><strong>ColdArchive</strong>: Cold Archive (media asset).</li>
             * <li><strong>SourceIA</strong>: Infrequent Access (source file).</li>
             * <li><strong>SourceArchive</strong>: Archive (source file).</li>
             * <li><strong>SourceColdArchive</strong>: Cold Archive (source file).</li>
             * <li><strong>Changing</strong>: The storage class of the media asset is being changed.</li>
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
             * <p>The storage address of the audio or video file.</p>
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
             * <p>tag1, tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The transcoding template group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9ae2af636ca64835b0c10412f448****</p>
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * <p>The title of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud VOD Video Title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The audio or video ID.</p>
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
