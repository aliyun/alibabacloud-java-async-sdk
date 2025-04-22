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
 * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetMediaInfosResponseBody</p>
 */
public class BatchGetMediaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenMediaIds")
    private java.util.List<String> forbiddenMediaIds;

    @com.aliyun.core.annotation.NameInMap("MediaInfos")
    private java.util.List<MediaInfos> mediaInfos;

    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private java.util.List<String> nonExistMediaIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetMediaInfosResponseBody(Builder builder) {
        this.forbiddenMediaIds = builder.forbiddenMediaIds;
        this.mediaInfos = builder.mediaInfos;
        this.nonExistMediaIds = builder.nonExistMediaIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetMediaInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forbiddenMediaIds
     */
    public java.util.List<String> getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    /**
     * @return mediaInfos
     */
    public java.util.List<MediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    /**
     * @return nonExistMediaIds
     */
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> forbiddenMediaIds; 
        private java.util.List<MediaInfos> mediaInfos; 
        private java.util.List<String> nonExistMediaIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchGetMediaInfosResponseBody model) {
            this.forbiddenMediaIds = model.forbiddenMediaIds;
            this.mediaInfos = model.mediaInfos;
            this.nonExistMediaIds = model.nonExistMediaIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the media assets that do not support the operation typically because you are not authorized to perform the operation. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
         */
        public Builder forbiddenMediaIds(java.util.List<String> forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * <p>Details about media assets.</p>
         */
        public Builder mediaInfos(java.util.List<MediaInfos> mediaInfos) {
            this.mediaInfos = mediaInfos;
            return this;
        }

        /**
         * <p>The IDs of the media assets that do not exist.</p>
         */
        public Builder nonExistMediaIds(java.util.List<String> nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E290613-04F4-47F4-795D30732077****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetMediaInfosResponseBody build() {
            return new BatchGetMediaInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class MediaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @com.aliyun.core.annotation.NameInMap("RestoreStatus")
        private String restoreStatus;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List<String> snapshots;

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

        private MediaInfo(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.templateGroupId = builder.templateGroupId;
            this.title = builder.title;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
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
         * @return snapshots
         */
        public java.util.List<String> getSnapshots() {
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

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String downloadSwitch; 
            private String mediaId; 
            private String modificationTime; 
            private String restoreExpiration; 
            private String restoreStatus; 
            private java.util.List<String> snapshots; 
            private String status; 
            private String storageClass; 
            private String storageLocation; 
            private String tags; 
            private String templateGroupId; 
            private String title; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaInfo model) {
                this.appId = model.appId;
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.coverURL = model.coverURL;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.downloadSwitch = model.downloadSwitch;
                this.mediaId = model.mediaId;
                this.modificationTime = model.modificationTime;
                this.restoreExpiration = model.restoreExpiration;
                this.restoreStatus = model.restoreStatus;
                this.snapshots = model.snapshots;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.storageLocation = model.storageLocation;
                this.tags = model.tags;
                this.templateGroupId = model.templateGroupId;
                this.title = model.title;
                this.userData = model.userData;
            } 

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
             * <p>The ID of the category.</p>
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
             * <p>CateName</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The thumbnail URL of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun VOD Video Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the offline download feature is enabled. If you enable the offline download feature, users can download and play videos by using the ApsaraVideo Player on a local PC. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
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
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>7753d144efd74d6c45fe0570****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The time when the media asset was last updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-26T06:38:48Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The period of time in which the audio file remains in the restored state.</p>
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
             * <p>The array of video snapshot URLs.</p>
             */
            public Builder snapshots(java.util.List<String> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The status of the video. Valid values:</p>
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
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: All media assets are stored as Standard objects.</li>
             * <li><strong>IA</strong>: All media assets are stored as IA objects.</li>
             * <li><strong>Archive</strong>: All media assets are stored as Archive objects.</li>
             * <li><strong>ColdArchive</strong>: All media assets are stored as Cold Archive objects.</li>
             * <li><strong>SourceIA</strong>: Only the source files are IA objects.</li>
             * <li><strong>SourceArchive</strong>: Only the source files are Archive objects.</li>
             * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
             * <li><strong>Changing</strong>: The storage class of the media asset is being changed.</li>
             * <li><strong>SourceChanging</strong>: The storage class of the media asset is being changed.</li>
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
             * <p>The storage address of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-***.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the media asset. Separate tags with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>tag1,tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>b4039216985f4312a5382a4ed****</p>
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * <p>The title of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun VOD Video Title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The custom parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Extend&quot;:&quot;xxx&quot;,&quot;MessageCallback&quot;:&quot;xxx&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaInfo build() {
                return new MediaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class AudioStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("ChannelLayout")
        private String channelLayout;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("CodecLongName")
        private String codecLongName;

        @com.aliyun.core.annotation.NameInMap("CodecName")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("CodecTag")
        private String codecTag;

        @com.aliyun.core.annotation.NameInMap("CodecTagString")
        private String codecTagString;

        @com.aliyun.core.annotation.NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("NumFrames")
        private String numFrames;

        @com.aliyun.core.annotation.NameInMap("SampleFmt")
        private String sampleFmt;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private String sampleRate;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        private AudioStreamList(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.index = builder.index;
            this.lang = builder.lang;
            this.numFrames = builder.numFrames;
            this.sampleFmt = builder.sampleFmt;
            this.sampleRate = builder.sampleRate;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreamList create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channelLayout
         */
        public String getChannelLayout() {
            return this.channelLayout;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return numFrames
         */
        public String getNumFrames() {
            return this.numFrames;
        }

        /**
         * @return sampleFmt
         */
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        /**
         * @return sampleRate
         */
        public String getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timebase
         */
        public String getTimebase() {
            return this.timebase;
        }

        public static final class Builder {
            private String bitrate; 
            private String channelLayout; 
            private String channels; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String duration; 
            private String index; 
            private String lang; 
            private String numFrames; 
            private String sampleFmt; 
            private String sampleRate; 
            private String startTime; 
            private String timebase; 

            private Builder() {
            } 

            private Builder(AudioStreamList model) {
                this.bitrate = model.bitrate;
                this.channelLayout = model.channelLayout;
                this.channels = model.channels;
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.duration = model.duration;
                this.index = model.index;
                this.lang = model.lang;
                this.numFrames = model.numFrames;
                this.sampleFmt = model.sampleFmt;
                this.sampleRate = model.sampleRate;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>62.885</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The output layout of the audio channels. Valid values:</p>
             * <ul>
             * <li><strong>mono</strong></li>
             * <li><strong>stereo</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mono</p>
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * <p>The number of sound tracks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The full name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC (Advanced Audio Coding)</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The short name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The tag of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>0x6134706d</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4a</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The time base of the encoder.</p>
             * 
             * <strong>example:</strong>
             * <p>1/44100</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>3.227574</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>und</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * <p>The sampling format.</p>
             * 
             * <strong>example:</strong>
             * <p>fltp</p>
             */
            public Builder sampleFmt(String sampleFmt) {
                this.sampleFmt = sampleFmt;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * <p>The start time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public AudioStreamList build() {
                return new AudioStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class VideoStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgFPS")
        private String avgFPS;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CodecLongName")
        private String codecLongName;

        @com.aliyun.core.annotation.NameInMap("CodecName")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("CodecTag")
        private String codecTag;

        @com.aliyun.core.annotation.NameInMap("CodecTagString")
        private String codecTagString;

        @com.aliyun.core.annotation.NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @com.aliyun.core.annotation.NameInMap("Dar")
        private String dar;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("HDRType")
        private String HDRType;

        @com.aliyun.core.annotation.NameInMap("HasBFrames")
        private String hasBFrames;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("NumFrames")
        private String numFrames;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Rotate")
        private String rotate;

        @com.aliyun.core.annotation.NameInMap("Sar")
        private String sar;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private VideoStreamList(Builder builder) {
            this.avgFPS = builder.avgFPS;
            this.bitrate = builder.bitrate;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.dar = builder.dar;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.HDRType = builder.HDRType;
            this.hasBFrames = builder.hasBFrames;
            this.height = builder.height;
            this.index = builder.index;
            this.lang = builder.lang;
            this.level = builder.level;
            this.numFrames = builder.numFrames;
            this.pixFmt = builder.pixFmt;
            this.profile = builder.profile;
            this.rotate = builder.rotate;
            this.sar = builder.sar;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreamList create() {
            return builder().build();
        }

        /**
         * @return avgFPS
         */
        public String getAvgFPS() {
            return this.avgFPS;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return dar
         */
        public String getDar() {
            return this.dar;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return HDRType
         */
        public String getHDRType() {
            return this.HDRType;
        }

        /**
         * @return hasBFrames
         */
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return numFrames
         */
        public String getNumFrames() {
            return this.numFrames;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return sar
         */
        public String getSar() {
            return this.sar;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timebase
         */
        public String getTimebase() {
            return this.timebase;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avgFPS; 
            private String bitrate; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String dar; 
            private String duration; 
            private String fps; 
            private String HDRType; 
            private String hasBFrames; 
            private String height; 
            private String index; 
            private String lang; 
            private String level; 
            private String numFrames; 
            private String pixFmt; 
            private String profile; 
            private String rotate; 
            private String sar; 
            private String startTime; 
            private String timebase; 
            private String width; 

            private Builder() {
            } 

            private Builder(VideoStreamList model) {
                this.avgFPS = model.avgFPS;
                this.bitrate = model.bitrate;
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.dar = model.dar;
                this.duration = model.duration;
                this.fps = model.fps;
                this.HDRType = model.HDRType;
                this.hasBFrames = model.hasBFrames;
                this.height = model.height;
                this.index = model.index;
                this.lang = model.lang;
                this.level = model.level;
                this.numFrames = model.numFrames;
                this.pixFmt = model.pixFmt;
                this.profile = model.profile;
                this.rotate = model.rotate;
                this.sar = model.sar;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
                this.width = model.width;
            } 

            /**
             * <p>The average frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * <p>The bitrate of the file. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The full name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The short name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The tag of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>0x31637661</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>avc1</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The time base of the encoder.</p>
             * 
             * <strong>example:</strong>
             * <p>1/60</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The display aspect ratio (DAR).</p>
             * 
             * <strong>example:</strong>
             * <p>0:1</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>3.166667</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The HDR type of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>HDR</p>
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The height of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>320</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the video stream. The value identifies the position of the video stream in all video streams.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>und</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The codec level.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * <p>The pixel format of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The codec profile.</p>
             * 
             * <strong>example:</strong>
             * <p>Main</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The rotation angle of the video. Valid values: [0,360).</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The sample aspect ratio (SAR).</p>
             * 
             * <strong>example:</strong>
             * <p>0:1</p>
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * <p>The start time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-11T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * <p>The horizontal resolution of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>568</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoStreamList build() {
                return new VideoStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class MezzanineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamList")
        private java.util.List<AudioStreamList> audioStreamList;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VideoStreamList")
        private java.util.List<VideoStreamList> videoStreamList;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Long width;

        private MezzanineInfo(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.bitrate = builder.bitrate;
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileURL = builder.fileURL;
            this.fps = builder.fps;
            this.height = builder.height;
            this.mediaId = builder.mediaId;
            this.size = builder.size;
            this.status = builder.status;
            this.videoStreamList = builder.videoStreamList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MezzanineInfo create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public java.util.List<AudioStreamList> getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return videoStreamList
         */
        public java.util.List<VideoStreamList> getVideoStreamList() {
            return this.videoStreamList;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private java.util.List<AudioStreamList> audioStreamList; 
            private String bitrate; 
            private String creationTime; 
            private String duration; 
            private String fileName; 
            private String fileURL; 
            private String fps; 
            private Long height; 
            private String mediaId; 
            private Long size; 
            private String status; 
            private java.util.List<VideoStreamList> videoStreamList; 
            private Long width; 

            private Builder() {
            } 

            private Builder(MezzanineInfo model) {
                this.audioStreamList = model.audioStreamList;
                this.bitrate = model.bitrate;
                this.creationTime = model.creationTime;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileURL = model.fileURL;
                this.fps = model.fps;
                this.height = model.height;
                this.mediaId = model.mediaId;
                this.size = model.size;
                this.status = model.status;
                this.videoStreamList = model.videoStreamList;
                this.width = model.width;
            } 

            /**
             * <p>The information about the audio stream.</p>
             */
            public Builder audioStreamList(java.util.List<AudioStreamList> audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The bitrate of the file. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>771.2280</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The time when the source file was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T09:15:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The duration of the file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>42.4930</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The OSS URL of the source file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The frame rate of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0000</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the file. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>540</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1f1a6fc03ca04814031b8a6559e****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4096477</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The state of the file. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong>: The file is being uploaded. This is the initial status.</li>
             * <li><strong>Normal</strong>: The file is uploaded.</li>
             * <li><strong>UploadFail</strong>: The file failed to be uploaded.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
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
             * <p>The information about the video streams.</p>
             */
            public Builder videoStreamList(java.util.List<VideoStreamList> videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            /**
             * <p>The width of the file. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>960</p>
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public MezzanineInfo build() {
                return new MezzanineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class PlayInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BitDepth")
        private Integer bitDepth;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CodecName")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Long encrypt;

        @com.aliyun.core.annotation.NameInMap("EncryptMode")
        private String encryptMode;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("HDRType")
        private String HDRType;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("JobExt")
        private String jobExt;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("NarrowBandType")
        private String narrowBandType;

        @com.aliyun.core.annotation.NameInMap("PlayURL")
        private String playURL;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
        private String templateGroupId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Long width;

        private PlayInfoList(Builder builder) {
            this.bitDepth = builder.bitDepth;
            this.bitrate = builder.bitrate;
            this.codecName = builder.codecName;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.duration = builder.duration;
            this.encrypt = builder.encrypt;
            this.encryptMode = builder.encryptMode;
            this.encryptType = builder.encryptType;
            this.format = builder.format;
            this.fps = builder.fps;
            this.HDRType = builder.HDRType;
            this.height = builder.height;
            this.jobExt = builder.jobExt;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modificationTime = builder.modificationTime;
            this.narrowBandType = builder.narrowBandType;
            this.playURL = builder.playURL;
            this.size = builder.size;
            this.specification = builder.specification;
            this.status = builder.status;
            this.streamType = builder.streamType;
            this.templateGroupId = builder.templateGroupId;
            this.templateId = builder.templateId;
            this.watermarkId = builder.watermarkId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfoList create() {
            return builder().build();
        }

        /**
         * @return bitDepth
         */
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encrypt
         */
        public Long getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return encryptMode
         */
        public String getEncryptMode() {
            return this.encryptMode;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return HDRType
         */
        public String getHDRType() {
            return this.HDRType;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return jobExt
         */
        public String getJobExt() {
            return this.jobExt;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return narrowBandType
         */
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        /**
         * @return playURL
         */
        public String getPlayURL() {
            return this.playURL;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return templateGroupId
         */
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer bitDepth; 
            private String bitrate; 
            private String codecName; 
            private String creationTime; 
            private String definition; 
            private String duration; 
            private Long encrypt; 
            private String encryptMode; 
            private String encryptType; 
            private String format; 
            private String fps; 
            private String HDRType; 
            private Long height; 
            private String jobExt; 
            private String jobId; 
            private Integer jobType; 
            private String modificationTime; 
            private String narrowBandType; 
            private String playURL; 
            private Long size; 
            private String specification; 
            private String status; 
            private String streamType; 
            private String templateGroupId; 
            private String templateId; 
            private String watermarkId; 
            private Long width; 

            private Builder() {
            } 

            private Builder(PlayInfoList model) {
                this.bitDepth = model.bitDepth;
                this.bitrate = model.bitrate;
                this.codecName = model.codecName;
                this.creationTime = model.creationTime;
                this.definition = model.definition;
                this.duration = model.duration;
                this.encrypt = model.encrypt;
                this.encryptMode = model.encryptMode;
                this.encryptType = model.encryptType;
                this.format = model.format;
                this.fps = model.fps;
                this.HDRType = model.HDRType;
                this.height = model.height;
                this.jobExt = model.jobExt;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.modificationTime = model.modificationTime;
                this.narrowBandType = model.narrowBandType;
                this.playURL = model.playURL;
                this.size = model.size;
                this.specification = model.specification;
                this.status = model.status;
                this.streamType = model.streamType;
                this.templateGroupId = model.templateGroupId;
                this.templateId = model.templateId;
                this.watermarkId = model.watermarkId;
                this.width = model.width;
            } 

            /**
             * <p>The color depth. This value is an integer.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder bitDepth(Integer bitDepth) {
                this.bitDepth = bitDepth;
                return this;
            }

            /**
             * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>450.878</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The short name of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T07:37:15Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The quality of the video stream. Valid values:</p>
             * <ul>
             * <li><strong>FD</strong>: low definition</li>
             * <li><strong>LD</strong>: standard definition</li>
             * <li><strong>SD</strong>: high definition</li>
             * <li><strong>HD</strong>: ultra-high definition</li>
             * <li><strong>OD</strong>: original definition</li>
             * <li><strong>2K</strong></li>
             * <li><strong>4K</strong></li>
             * <li><strong>SQ</strong>: standard sound quality</li>
             * <li><strong>HQ</strong>: high sound quality</li>
             * <li><strong>AUTO</strong>: adaptive bitrate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The duration of the media stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>9.0464</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether the media stream was encrypted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The media stream is not encrypted.</li>
             * <li><strong>1</strong>: The media stream is encrypted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder encrypt(Long encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * <p>The encryption type of the media stream. Valid values:</p>
             * <ul>
             * <li><strong>License</strong>: decryption on local devices.</li>
             * </ul>
             * <blockquote>
             * <p> If the encryption type is <strong>License</strong>, only ApsaraVideo Player SDK can be used to play videos.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>License</p>
             */
            public Builder encryptMode(String encryptMode) {
                this.encryptMode = encryptMode;
                return this;
            }

            /**
             * <p>The encryption type of the media stream. Valid values:</p>
             * <ul>
             * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
             * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
             * </ul>
             * <blockquote>
             * <p> If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AliyunVoDEncryption</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The format of the media stream.</p>
             * <ul>
             * <li>If the media file is a video file, the valid values are <strong>mp4</strong> and <strong>m3u8</strong>.</li>
             * <li>If the media asset is an audio-only file, the value is <strong>mp3</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate of the media stream. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The HDR type of the media stream. Valid values:</p>
             * <ul>
             * <li>HDR</li>
             * <li>HDR10</li>
             * <li>HLG</li>
             * <li>DolbyVision</li>
             * <li>HDRVivid</li>
             * <li>SDR+</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HLG</p>
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * <p>The height of the media stream. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The custom watermark information of the copyright watermark. This parameter is returned if you set <code>JobType</code> to <code>2</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>CopyrightMarkTest</p>
             */
            public Builder jobExt(String jobExt) {
                this.jobExt = jobExt;
                return this;
            }

            /**
             * <p>The job ID for transcoding the media stream. This ID uniquely identifies a media stream.</p>
             * 
             * <strong>example:</strong>
             * <p>80e9c6580e754a798c3c19c59b16****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the digital watermark. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: user-tracing watermark</li>
             * <li><strong>2</strong>: copyright watermark</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The update time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-20T06:32:19Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The transcoding type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: regular transcoding</li>
             * <li><strong>1.0</strong>: Narrowband HD™ 1.0 transcoding</li>
             * <li><strong>2.0</strong>: Narrowband HD™ 2.0 transcoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder narrowBandType(String narrowBandType) {
                this.narrowBandType = narrowBandType;
                return this;
            }

            /**
             * <p>The playback URL of the video stream.</p>
             */
            public Builder playURL(String playURL) {
                this.playURL = playURL;
                return this;
            }

            /**
             * <p>The size of the media stream. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>418112</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The specifications of transcoded audio and video streams. For more information about the valid values, see <a href="~~124671#section-6bv-l0g-opq~~">Output specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>H264.LD</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The status of the audio or video stream. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The latest transcoded stream in each quality and format is in the Normal status.</li>
             * <li><strong>Invisible</strong>: If multiple streams are transcoded in the same quality and format, the latest transcoded stream is in the Normal status and other streams are in the Invisible status.</li>
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
             * <p>The type of the media stream. If the media stream is a video stream, the value is <strong>video</strong>. If the media stream is an audio-only stream, the value is <strong>audio</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>fb0716154b21a4ecb5b70a26ccc8****</p>
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>a86a4338dd2e83da45154004a541****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The ID of the watermark that is associated with the media stream.</p>
             * 
             * <strong>example:</strong>
             * <p>dgfn26457856****</p>
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * <p>The width of the media stream. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public PlayInfoList build() {
                return new PlayInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetMediaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetMediaInfosResponseBody</p>
     */
    public static class MediaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaInfo")
        private MediaInfo mediaInfo;

        @com.aliyun.core.annotation.NameInMap("MezzanineInfo")
        private MezzanineInfo mezzanineInfo;

        @com.aliyun.core.annotation.NameInMap("PlayInfoList")
        private java.util.List<PlayInfoList> playInfoList;

        private MediaInfos(Builder builder) {
            this.mediaId = builder.mediaId;
            this.mediaInfo = builder.mediaInfo;
            this.mezzanineInfo = builder.mezzanineInfo;
            this.playInfoList = builder.playInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfos create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaInfo
         */
        public MediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        /**
         * @return mezzanineInfo
         */
        public MezzanineInfo getMezzanineInfo() {
            return this.mezzanineInfo;
        }

        /**
         * @return playInfoList
         */
        public java.util.List<PlayInfoList> getPlayInfoList() {
            return this.playInfoList;
        }

        public static final class Builder {
            private String mediaId; 
            private MediaInfo mediaInfo; 
            private MezzanineInfo mezzanineInfo; 
            private java.util.List<PlayInfoList> playInfoList; 

            private Builder() {
            } 

            private Builder(MediaInfos model) {
                this.mediaId = model.mediaId;
                this.mediaInfo = model.mediaInfo;
                this.mezzanineInfo = model.mezzanineInfo;
                this.playInfoList = model.playInfoList;
            } 

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>10a5fa364a5b71ef89246733a78e****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The basic information of the media asset.</p>
             */
            public Builder mediaInfo(MediaInfo mediaInfo) {
                this.mediaInfo = mediaInfo;
                return this;
            }

            /**
             * <p>The source file information.</p>
             */
            public Builder mezzanineInfo(MezzanineInfo mezzanineInfo) {
                this.mezzanineInfo = mezzanineInfo;
                return this;
            }

            /**
             * <p>The information about the audio or video stream.</p>
             */
            public Builder playInfoList(java.util.List<PlayInfoList> playInfoList) {
                this.playInfoList = playInfoList;
                return this;
            }

            public MediaInfos build() {
                return new MediaInfos(this);
            } 

        } 

    }
}
