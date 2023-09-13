// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaInfoJobResponseBody</p>
 */
public class SubmitMediaInfoJobResponseBody extends TeaModel {
    @NameInMap("MediaInfoJob")
    private MediaInfoJob mediaInfoJob;

    @NameInMap("RequestId")
    private String requestId;

    private SubmitMediaInfoJobResponseBody(Builder builder) {
        this.mediaInfoJob = builder.mediaInfoJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaInfoJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaInfoJob
     */
    public MediaInfoJob getMediaInfoJob() {
        return this.mediaInfoJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaInfoJob mediaInfoJob; 
        private String requestId; 

        /**
         * MediaInfoJobDTO
         */
        public Builder mediaInfoJob(MediaInfoJob mediaInfoJob) {
            this.mediaInfoJob = mediaInfoJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitMediaInfoJobResponseBody build() {
            return new SubmitMediaInfoJobResponseBody(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class AudioStreamInfoList extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("ChannelLayout")
        private String channelLayout;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("CodecLongName")
        private String codecLongName;

        @NameInMap("CodecName")
        private String codecName;

        @NameInMap("CodecTag")
        private String codecTag;

        @NameInMap("CodecTagString")
        private String codecTagString;

        @NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Index")
        private String index;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("SampleFmt")
        private String sampleFmt;

        @NameInMap("SampleRate")
        private String sampleRate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Timebase")
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
            this.index = builder.index;
            this.lang = builder.lang;
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
            private String sampleFmt; 
            private String sampleRate; 
            private String startTime; 
            private String timebase; 

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

        @NameInMap("MediaId")
        private String mediaId;

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
            this.mediaId = builder.mediaId;
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
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
            private String mediaId; 
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
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
    public static class VideoStreamInfoList extends TeaModel {
        @NameInMap("Avg_fps")
        private String avgFps;

        @NameInMap("Bit_rate")
        private String bitRate;

        @NameInMap("Codec_long_name")
        private String codecLongName;

        @NameInMap("Codec_name")
        private String codecName;

        @NameInMap("Codec_tag")
        private String codecTag;

        @NameInMap("Codec_tag_string")
        private String codecTagString;

        @NameInMap("Codec_time_base")
        private String codecTimeBase;

        @NameInMap("Dar")
        private String dar;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Has_b_frames")
        private String hasBFrames;

        @NameInMap("Height")
        private String height;

        @NameInMap("Index")
        private String index;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("Level")
        private String level;

        @NameInMap("NumFrames")
        private String numFrames;

        @NameInMap("PixFmt")
        private String pixFmt;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Rotate")
        private String rotate;

        @NameInMap("Sar")
        private String sar;

        @NameInMap("Start_time")
        private String startTime;

        @NameInMap("Time_base")
        private String timeBase;

        @NameInMap("Width")
        private String width;

        private VideoStreamInfoList(Builder builder) {
            this.avgFps = builder.avgFps;
            this.bitRate = builder.bitRate;
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
            this.timeBase = builder.timeBase;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreamInfoList create() {
            return builder().build();
        }

        /**
         * @return avgFps
         */
        public String getAvgFps() {
            return this.avgFps;
        }

        /**
         * @return bitRate
         */
        public String getBitRate() {
            return this.bitRate;
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
         * @return timeBase
         */
        public String getTimeBase() {
            return this.timeBase;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avgFps; 
            private String bitRate; 
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
            private String timeBase; 
            private String width; 

            /**
             * Avg_fps.
             */
            public Builder avgFps(String avgFps) {
                this.avgFps = avgFps;
                return this;
            }

            /**
             * Bit_rate.
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * Codec_long_name.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * Codec_name.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * Codec_tag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * Codec_tag_string.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * Codec_time_base.
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
             * Has_b_frames.
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
             * Start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Time_base.
             */
            public Builder timeBase(String timeBase) {
                this.timeBase = timeBase;
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
    public static class MediaInfoProperty extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        private java.util.List < AudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        @NameInMap("VideoStreamInfoList")
        private java.util.List < VideoStreamInfoList> videoStreamInfoList;

        private MediaInfoProperty(Builder builder) {
            this.audioStreamInfoList = builder.audioStreamInfoList;
            this.fileBasicInfo = builder.fileBasicInfo;
            this.videoStreamInfoList = builder.videoStreamInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfoProperty create() {
            return builder().build();
        }

        /**
         * @return audioStreamInfoList
         */
        public java.util.List < AudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        /**
         * @return fileBasicInfo
         */
        public FileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        /**
         * @return videoStreamInfoList
         */
        public java.util.List < VideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

        public static final class Builder {
            private java.util.List < AudioStreamInfoList> audioStreamInfoList; 
            private FileBasicInfo fileBasicInfo; 
            private java.util.List < VideoStreamInfoList> videoStreamInfoList; 

            /**
             * AudioStreamInfoList.
             */
            public Builder audioStreamInfoList(java.util.List < AudioStreamInfoList> audioStreamInfoList) {
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
             * VideoStreamInfoList.
             */
            public Builder videoStreamInfoList(java.util.List < VideoStreamInfoList> videoStreamInfoList) {
                this.videoStreamInfoList = videoStreamInfoList;
                return this;
            }

            public MediaInfoProperty build() {
                return new MediaInfoProperty(this);
            } 

        } 

    }
    public static class ScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Priority")
        private Integer priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private Integer priority; 

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    public static class MediaInfoJob extends TeaModel {
        @NameInMap("Async")
        private Boolean async;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Input")
        private Input input;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaInfoProperty")
        private MediaInfoProperty mediaInfoProperty;

        @NameInMap("Name")
        private String name;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ScheduleConfig")
        private ScheduleConfig scheduleConfig;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitResultJson")
        private java.util.Map < String, ? > submitResultJson;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("TriggerSource")
        private String triggerSource;

        @NameInMap("UserData")
        private String userData;

        private MediaInfoJob(Builder builder) {
            this.async = builder.async;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.mediaInfoProperty = builder.mediaInfoProperty;
            this.name = builder.name;
            this.requestId = builder.requestId;
            this.scheduleConfig = builder.scheduleConfig;
            this.status = builder.status;
            this.submitResultJson = builder.submitResultJson;
            this.submitTime = builder.submitTime;
            this.triggerSource = builder.triggerSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfoJob create() {
            return builder().build();
        }

        /**
         * @return async
         */
        public Boolean getAsync() {
            return this.async;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaInfoProperty
         */
        public MediaInfoProperty getMediaInfoProperty() {
            return this.mediaInfoProperty;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return scheduleConfig
         */
        public ScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitResultJson
         */
        public java.util.Map < String, ? > getSubmitResultJson() {
            return this.submitResultJson;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean async; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private MediaInfoProperty mediaInfoProperty; 
            private String name; 
            private String requestId; 
            private ScheduleConfig scheduleConfig; 
            private String status; 
            private java.util.Map < String, ? > submitResultJson; 
            private String submitTime; 
            private String triggerSource; 
            private String userData; 

            /**
             * Async.
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MediaInfoProperty.
             */
            public Builder mediaInfoProperty(MediaInfoProperty mediaInfoProperty) {
                this.mediaInfoProperty = mediaInfoProperty;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ScheduleConfig.
             */
            public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
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
             * SubmitResultJson.
             */
            public Builder submitResultJson(java.util.Map < String, ? > submitResultJson) {
                this.submitResultJson = submitResultJson;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * TriggerSource.
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaInfoJob build() {
                return new MediaInfoJob(this);
            } 

        } 

    }
}
