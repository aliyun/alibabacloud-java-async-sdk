// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMezzanineInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMezzanineInfoResponseBody</p>
 */
public class GetMezzanineInfoResponseBody extends TeaModel {
    @NameInMap("Mezzanine")
    private Mezzanine mezzanine;

    @NameInMap("RequestId")
    private String requestId;

    private GetMezzanineInfoResponseBody(Builder builder) {
        this.mezzanine = builder.mezzanine;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMezzanineInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return mezzanine
     */
    public Mezzanine getMezzanine() {
        return this.mezzanine;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Mezzanine mezzanine; 
        private String requestId; 

        /**
         * The information about the source file.
         */
        public Builder mezzanine(Mezzanine mezzanine) {
            this.mezzanine = mezzanine;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMezzanineInfoResponseBody build() {
            return new GetMezzanineInfoResponseBody(this);
        } 

    } 

    public static class AudioStreamList extends TeaModel {
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

        @NameInMap("NumFrames")
        private String numFrames;

        @NameInMap("SampleFmt")
        private String sampleFmt;

        @NameInMap("SampleRate")
        private String sampleRate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Timebase")
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

            /**
             * The bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The output layout of the sound channels. Valid values:
             * <p>
             * 
             * *   **mono**: mono sound channel
             * *   **stereo**: two sound channels
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * The number of sound channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The full name of the codec format.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * The short name of the codec format.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * The tag of the codec format.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * The tag string of the codec format.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * The codec time base.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * The duration of the audio stream.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The sequence number of the audio stream, which specifies the position of the audio stream in all audio streams.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The language.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The total number of frames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * The sampling format.
             */
            public Builder sampleFmt(String sampleFmt) {
                this.sampleFmt = sampleFmt;
                return this;
            }

            /**
             * The sample rate.
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * The beginning of the time range that was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time base.
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
    public static class VideoStreamList extends TeaModel {
        @NameInMap("AvgFPS")
        private String avgFPS;

        @NameInMap("Bitrate")
        private String bitrate;

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

        @NameInMap("Dar")
        private String dar;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("HDRType")
        private String HDRType;

        @NameInMap("HasBFrames")
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

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Timebase")
        private String timebase;

        @NameInMap("Width")
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

            /**
             * The average frame rate.
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * The bitrate of the file. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The full name of the codec format.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * The short name of the codec format.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * The tag of the codec format.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * The tag string of the codec format.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * The codec time base.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * The display aspect ratio.
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * The duration of the video stream.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The target frame rate.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The HDR type.
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * Indicates whether the video stream contains bidirectional frames (B-frames).
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * The height of the video resolution.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The sequence number of the video stream, which indicates the position of the video stream in all video streams.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The language.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The codec level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The total number of frames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * The pixel format.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * The codec profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The rotation angle of the video. Valid values: **\[0, 360)**.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * The sample aspect ratio.
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * The beginning of the time range that was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time base.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * The width of the video resolution.
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
    public static class Mezzanine extends TeaModel {
        @NameInMap("AudioStreamList")
        private java.util.List < AudioStreamList> audioStreamList;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private Long height;

        @NameInMap("OutputType")
        private String outputType;

        @NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @NameInMap("RestoreStatus")
        private String restoreStatus;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("VideoId")
        private String videoId;

        @NameInMap("VideoStreamList")
        private java.util.List < VideoStreamList> videoStreamList;

        @NameInMap("Width")
        private Long width;

        private Mezzanine(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.bitrate = builder.bitrate;
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileURL = builder.fileURL;
            this.fps = builder.fps;
            this.height = builder.height;
            this.outputType = builder.outputType;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.size = builder.size;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.videoId = builder.videoId;
            this.videoStreamList = builder.videoStreamList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mezzanine create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public java.util.List < AudioStreamList> getAudioStreamList() {
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
         * @return outputType
         */
        public String getOutputType() {
            return this.outputType;
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
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        /**
         * @return videoStreamList
         */
        public java.util.List < VideoStreamList> getVideoStreamList() {
            return this.videoStreamList;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private java.util.List < AudioStreamList> audioStreamList; 
            private String bitrate; 
            private String creationTime; 
            private String duration; 
            private String fileName; 
            private String fileURL; 
            private String fps; 
            private Long height; 
            private String outputType; 
            private String restoreExpiration; 
            private String restoreStatus; 
            private Long size; 
            private String status; 
            private String storageClass; 
            private String videoId; 
            private java.util.List < VideoStreamList> videoStreamList; 
            private Long width; 

            /**
             * The codec time base.
             */
            public Builder audioStreamList(java.util.List < AudioStreamList> audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * The bitrate of the file. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The time when the file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The duration of the file. Unit: seconds.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The URL of the file.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * The frame rate of the file. Unit: frames per second.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The height of the file. Unit: pixel.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * The type of the mezzanine file URL. Valid values:
             * <p>
             * 
             * - **oss**: OSS URL
             * - **cdn** (default): CDN URL
             * 
             * > If you specify an OSS URL for the video stream, the video stream must be in the MP4 format.
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * The period of time in which the object remains in the restored state.
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * The restoration status of the audio or video file. Valid values:
             * <p>
             * 
             * *   **Processing**
             * *   **Success**
             * *   **Failed**
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * The size of the file. Unit: byte.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the file. Valid values:
             * <p>
             * 
             * *   **Uploading**: The file is being uploaded. This is the initial status.
             * *   **Normal**: The file is uploaded.
             * *   **UploadFail**: The file fails to be uploaded.
             * *   **Deleted**: The file is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage class of the audio or video file. Valid values:
             * <p>
             * 
             * *   **Standard**: All media resources are stored as Standard objects.
             * *   **IA**: All media resources are stored as IA objects.
             * *   **Archive**: All media resources are stored as Archive objects.
             * *   **ColdArchive**: All media resources are stored as Cold Archive objects.
             * *   **SourceIA**: Only the source files are IA objects.
             * *   **SourceArchive**: Only the source files are Archive objects.
             * *   **SourceColdArchive**: Only the source files are Cold Archive objects.
             * *   **Changing**: The storage class is being modified.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The ID of the video.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            /**
             * The HDR type of the video stream.
             */
            public Builder videoStreamList(java.util.List < VideoStreamList> videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            /**
             * The width of the file. Unit: pixel.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Mezzanine build() {
                return new Mezzanine(this);
            } 

        } 

    }
}
