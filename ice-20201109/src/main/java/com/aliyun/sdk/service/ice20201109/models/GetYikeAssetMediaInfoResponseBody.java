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
 * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeAssetMediaInfoResponseBody</p>
 */
public class GetYikeAssetMediaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaInfo")
    private MediaInfo mediaInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeAssetMediaInfoResponseBody(Builder builder) {
        this.mediaInfo = builder.mediaInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeAssetMediaInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaInfo
     */
    public MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaInfo mediaInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeAssetMediaInfoResponseBody model) {
            this.mediaInfo = model.mediaInfo;
            this.requestId = model.requestId;
        } 

        /**
         * MediaInfo.
         */
        public Builder mediaInfo(MediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeAssetMediaInfoResponseBody build() {
            return new GetYikeAssetMediaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

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
            this.prompt = builder.prompt;
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
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
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
            private String prompt; 
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
                this.prompt = model.prompt;
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
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
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
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class AudioStreamInfoList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("NumFrames")
        private String numFrames;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("SampleFmt")
        private String sampleFmt;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private String sampleRate;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        private AudioStreamInfoList(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.index = builder.index;
            this.lang = builder.lang;
            this.numFrames = builder.numFrames;
            this.profile = builder.profile;
            this.sampleFmt = builder.sampleFmt;
            this.sampleRate = builder.sampleRate;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreamInfoList create() {
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
         * @return fps
         */
        public String getFps() {
            return this.fps;
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
         * @return profile
         */
        public String getProfile() {
            return this.profile;
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
            private String fps; 
            private String index; 
            private String lang; 
            private String numFrames; 
            private String profile; 
            private String sampleFmt; 
            private String sampleRate; 
            private String startTime; 
            private String timebase; 

            private Builder() {
            } 

            private Builder(AudioStreamInfoList model) {
                this.bitrate = model.bitrate;
                this.channelLayout = model.channelLayout;
                this.channels = model.channels;
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.duration = model.duration;
                this.fps = model.fps;
                this.index = model.index;
                this.lang = model.lang;
                this.numFrames = model.numFrames;
                this.profile = model.profile;
                this.sampleFmt = model.sampleFmt;
                this.sampleRate = model.sampleRate;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * ChannelLayout.
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
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
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * NumFrames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * SampleFmt.
             */
            public Builder sampleFmt(String sampleFmt) {
                this.sampleFmt = sampleFmt;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Timebase.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public AudioStreamInfoList build() {
                return new AudioStreamInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class FileBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

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

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private FileBasicInfo(Builder builder) {
            this.bitrate = builder.bitrate;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileStatus = builder.fileStatus;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
            this.formatName = builder.formatName;
            this.height = builder.height;
            this.modifiedTime = builder.modifiedTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
            private String createTime; 
            private String duration; 
            private String fileName; 
            private String fileSize; 
            private String fileStatus; 
            private String fileType; 
            private String fileUrl; 
            private String formatName; 
            private String height; 
            private String modifiedTime; 
            private String region; 
            private String width; 

            private Builder() {
            } 

            private Builder(FileBasicInfo model) {
                this.bitrate = model.bitrate;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileStatus = model.fileStatus;
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
                this.formatName = model.formatName;
                this.height = model.height;
                this.modifiedTime = model.modifiedTime;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class SubtitleStreamInfoList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        private SubtitleStreamInfoList(Builder builder) {
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.index = builder.index;
            this.lang = builder.lang;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStreamInfoList create() {
            return builder().build();
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
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String duration; 
            private String index; 
            private String lang; 
            private String startTime; 
            private String timebase; 

            private Builder() {
            } 

            private Builder(SubtitleStreamInfoList model) {
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.duration = model.duration;
                this.index = model.index;
                this.lang = model.lang;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
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
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Timebase.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public SubtitleStreamInfoList build() {
                return new SubtitleStreamInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class VideoStreamInfoList extends TeaModel {
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

        private VideoStreamInfoList(Builder builder) {
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

        public static VideoStreamInfoList create() {
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

            private Builder(VideoStreamInfoList model) {
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
             * AvgFPS.
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * Dar.
             */
            public Builder dar(String dar) {
                this.dar = dar;
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
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * HasBFrames.
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
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
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * NumFrames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * PixFmt.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Rotate.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * Sar.
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Timebase.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoStreamInfoList build() {
                return new VideoStreamInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class FileInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamInfoList")
        private java.util.List<AudioStreamInfoList> audioStreamInfoList;

        @com.aliyun.core.annotation.NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        @com.aliyun.core.annotation.NameInMap("SubtitleStreamInfoList")
        private java.util.List<SubtitleStreamInfoList> subtitleStreamInfoList;

        @com.aliyun.core.annotation.NameInMap("VideoStreamInfoList")
        private java.util.List<VideoStreamInfoList> videoStreamInfoList;

        private FileInfoList(Builder builder) {
            this.audioStreamInfoList = builder.audioStreamInfoList;
            this.fileBasicInfo = builder.fileBasicInfo;
            this.subtitleStreamInfoList = builder.subtitleStreamInfoList;
            this.videoStreamInfoList = builder.videoStreamInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfoList create() {
            return builder().build();
        }

        /**
         * @return audioStreamInfoList
         */
        public java.util.List<AudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        /**
         * @return fileBasicInfo
         */
        public FileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        /**
         * @return subtitleStreamInfoList
         */
        public java.util.List<SubtitleStreamInfoList> getSubtitleStreamInfoList() {
            return this.subtitleStreamInfoList;
        }

        /**
         * @return videoStreamInfoList
         */
        public java.util.List<VideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

        public static final class Builder {
            private java.util.List<AudioStreamInfoList> audioStreamInfoList; 
            private FileBasicInfo fileBasicInfo; 
            private java.util.List<SubtitleStreamInfoList> subtitleStreamInfoList; 
            private java.util.List<VideoStreamInfoList> videoStreamInfoList; 

            private Builder() {
            } 

            private Builder(FileInfoList model) {
                this.audioStreamInfoList = model.audioStreamInfoList;
                this.fileBasicInfo = model.fileBasicInfo;
                this.subtitleStreamInfoList = model.subtitleStreamInfoList;
                this.videoStreamInfoList = model.videoStreamInfoList;
            } 

            /**
             * AudioStreamInfoList.
             */
            public Builder audioStreamInfoList(java.util.List<AudioStreamInfoList> audioStreamInfoList) {
                this.audioStreamInfoList = audioStreamInfoList;
                return this;
            }

            /**
             * FileBasicInfo.
             */
            public Builder fileBasicInfo(FileBasicInfo fileBasicInfo) {
                this.fileBasicInfo = fileBasicInfo;
                return this;
            }

            /**
             * SubtitleStreamInfoList.
             */
            public Builder subtitleStreamInfoList(java.util.List<SubtitleStreamInfoList> subtitleStreamInfoList) {
                this.subtitleStreamInfoList = subtitleStreamInfoList;
                return this;
            }

            /**
             * VideoStreamInfoList.
             */
            public Builder videoStreamInfoList(java.util.List<VideoStreamInfoList> videoStreamInfoList) {
                this.videoStreamInfoList = videoStreamInfoList;
                return this;
            }

            public FileInfoList build() {
                return new FileInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class MediaBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

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

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private String snapshots;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpriteImages")
        private String spriteImages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ThumbURL240P")
        private String thumbURL240P;

        @com.aliyun.core.annotation.NameInMap("ThumbURLWebp")
        private String thumbURLWebp;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UploadSource")
        private String uploadSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaBasicInfo(Builder builder) {
            this.biz = builder.biz;
            this.businessType = builder.businessType;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
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
            this.referenceId = builder.referenceId;
            this.snapshots = builder.snapshots;
            this.source = builder.source;
            this.spriteImages = builder.spriteImages;
            this.status = builder.status;
            this.thumbURL240P = builder.thumbURL240P;
            this.thumbURLWebp = builder.thumbURLWebp;
            this.title = builder.title;
            this.uploadSource = builder.uploadSource;
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
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
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
         * @return thumbURL240P
         */
        public String getThumbURL240P() {
            return this.thumbURL240P;
        }

        /**
         * @return thumbURLWebp
         */
        public String getThumbURLWebp() {
            return this.thumbURLWebp;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uploadSource
         */
        public String getUploadSource() {
            return this.uploadSource;
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
            private Long cateId; 
            private String cateName; 
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
            private String referenceId; 
            private String snapshots; 
            private String source; 
            private String spriteImages; 
            private String status; 
            private String thumbURL240P; 
            private String thumbURLWebp; 
            private String title; 
            private String uploadSource; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaBasicInfo model) {
                this.biz = model.biz;
                this.businessType = model.businessType;
                this.cateId = model.cateId;
                this.cateName = model.cateName;
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
                this.referenceId = model.referenceId;
                this.snapshots = model.snapshots;
                this.source = model.source;
                this.spriteImages = model.spriteImages;
                this.status = model.status;
                this.thumbURL240P = model.thumbURL240P;
                this.thumbURLWebp = model.thumbURLWebp;
                this.title = model.title;
                this.uploadSource = model.uploadSource;
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
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
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
             * ReferenceId.
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
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
             * ThumbURL240P.
             */
            public Builder thumbURL240P(String thumbURL240P) {
                this.thumbURL240P = thumbURL240P;
                return this;
            }

            /**
             * ThumbURLWebp.
             */
            public Builder thumbURLWebp(String thumbURLWebp) {
                this.thumbURLWebp = thumbURLWebp;
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
             * UploadSource.
             */
            public Builder uploadSource(String uploadSource) {
                this.uploadSource = uploadSource;
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
     * {@link GetYikeAssetMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeAssetMediaInfoResponseBody</p>
     */
    public static class MediaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizData")
        private BizData bizData;

        @com.aliyun.core.annotation.NameInMap("FileInfoList")
        private java.util.List<FileInfoList> fileInfoList;

        @com.aliyun.core.annotation.NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private MediaInfo(Builder builder) {
            this.bizData = builder.bizData;
            this.fileInfoList = builder.fileInfoList;
            this.mediaBasicInfo = builder.mediaBasicInfo;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfo create() {
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

            private Builder(MediaInfo model) {
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

            public MediaInfo build() {
                return new MediaInfo(this);
            } 

        } 

    }
}
