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
 * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaInfoJobsResponseBody</p>
 */
public class ListMediaInfoJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMediaInfoJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaInfoJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private String nextPageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMediaInfoJobsResponseBody model) {
            this.jobs = model.jobs;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of media information analysis jobs.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The token of the next page is returned after you call this operation for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>019daf5780f74831b0e1a767c9f1c178</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaInfoJobsResponseBody build() {
            return new ListMediaInfoJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The media object.</p>
             * <ul>
             * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
             * <li>If Type is set to Media, the ID of a media asset is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an Object Storage Service (OSS) object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
    /**
     * 
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

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
                this.index = model.index;
                this.lang = model.lang;
                this.sampleFmt = model.sampleFmt;
                this.sampleRate = model.sampleRate;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.f</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The sound channel layout.</p>
             * 
             * <strong>example:</strong>
             * <p>stereo</p>
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * <p>The number of sound channels.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC (Advanced Audio Coding)</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The encoder tag.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000f</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The name of the encoder tag.</p>
             * 
             * <strong>example:</strong>
             * <p>[15][0][0][0]</p>
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
             * <p>The duration of the stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039989</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The sequence number of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
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
             * <p>The sampling rate. Unit: Hz.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * <p>The start time of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1.473556</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/90000</p>
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
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

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
                this.mediaId = model.mediaId;
                this.region = model.region;
                this.width = model.width;
            } 

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>888.563</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039999</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>file.m3u8</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>31737</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The state of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * <p>The file type. Valid values: source_file and transcode_file.</p>
             * 
             * <strong>example:</strong>
             * <p>source_file</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8">http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The name of the video format.</p>
             * 
             * <strong>example:</strong>
             * <p>hls,applehttp</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>478</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>4765337007f571edbfdf81848c016303</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
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
             * <p>848</p>
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
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
     */
    public static class VideoStreamInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avg_fps")
        private String avgFps;

        @com.aliyun.core.annotation.NameInMap("Bit_rate")
        private String bitRate;

        @com.aliyun.core.annotation.NameInMap("Codec_long_name")
        private String codecLongName;

        @com.aliyun.core.annotation.NameInMap("Codec_name")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("Codec_tag")
        private String codecTag;

        @com.aliyun.core.annotation.NameInMap("Codec_tag_string")
        private String codecTagString;

        @com.aliyun.core.annotation.NameInMap("Codec_time_base")
        private String codecTimeBase;

        @com.aliyun.core.annotation.NameInMap("Dar")
        private String dar;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Has_b_frames")
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

        @com.aliyun.core.annotation.NameInMap("Start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Time_base")
        private String timeBase;

        @com.aliyun.core.annotation.NameInMap("Width")
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

            private Builder() {
            } 

            private Builder(VideoStreamInfoList model) {
                this.avgFps = model.avgFps;
                this.bitRate = model.bitRate;
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
                this.timeBase = model.timeBase;
                this.width = model.width;
            } 

            /**
             * <p>The average frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0</p>
             */
            public Builder avgFps(String avgFps) {
                this.avgFps = avgFps;
                return this;
            }

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>888.563</p>
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * <p>The name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The encoding format.</p>
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
             * <p>0x001b</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>[27][0][0][0]</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The time base of the encoder.</p>
             * 
             * <strong>example:</strong>
             * <p>1/50</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The display aspect ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration of the stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039989</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames). Valid values:</p>
             * <ul>
             * <li>0: The stream contains no B-frames.</li>
             * <li>1: The stream contains one B-frame.</li>
             * <li>2: The stream contains multiple consecutive B-frames.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>478</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The codec level.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>10040</p>
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * <p>The pixel format.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The encoder profile.</p>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The rotation angle of the video image.</p>
             * <ul>
             * <li>Valid values: 0, 90, 180, and 270.</li>
             * <li>Default value: 0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The aspect ratio of the area from which the sampling points are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>478:477</p>
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * <p>The start time of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1.473556</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/90000</p>
             */
            public Builder timeBase(String timeBase) {
                this.timeBase = timeBase;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>848</p>
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
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
     */
    public static class MediaInfoProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamInfoList")
        private java.util.List<AudioStreamInfoList> audioStreamInfoList;

        @com.aliyun.core.annotation.NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        @com.aliyun.core.annotation.NameInMap("VideoStreamInfoList")
        private java.util.List<VideoStreamInfoList> videoStreamInfoList;

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
         * @return videoStreamInfoList
         */
        public java.util.List<VideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

        public static final class Builder {
            private java.util.List<AudioStreamInfoList> audioStreamInfoList; 
            private FileBasicInfo fileBasicInfo; 
            private java.util.List<VideoStreamInfoList> videoStreamInfoList; 

            private Builder() {
            } 

            private Builder(MediaInfoProperty model) {
                this.audioStreamInfoList = model.audioStreamInfoList;
                this.fileBasicInfo = model.fileBasicInfo;
                this.videoStreamInfoList = model.videoStreamInfoList;
            } 

            /**
             * <p>The information about the audio stream.</p>
             */
            public Builder audioStreamInfoList(java.util.List<AudioStreamInfoList> audioStreamInfoList) {
                this.audioStreamInfoList = audioStreamInfoList;
                return this;
            }

            /**
             * <p>The basic file information.</p>
             */
            public Builder fileBasicInfo(FileBasicInfo fileBasicInfo) {
                this.fileBasicInfo = fileBasicInfo;
                return this;
            }

            /**
             * <p>The information about the video stream.</p>
             */
            public Builder videoStreamInfoList(java.util.List<VideoStreamInfoList> videoStreamInfoList) {
                this.videoStreamInfoList = videoStreamInfoList;
                return this;
            }

            public MediaInfoProperty build() {
                return new MediaInfoProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
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

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the MPS queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>e37ebee5d98b4781897f6086e89f9c56</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
    /**
     * 
     * {@link ListMediaInfoJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaInfoJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Async")
        private Boolean async;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaInfoProperty")
        private MediaInfoProperty mediaInfoProperty;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private ScheduleConfig scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitResultJson")
        private java.util.Map<String, ?> submitResultJson;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Jobs(Builder builder) {
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

        public static Jobs create() {
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
        public java.util.Map<String, ?> getSubmitResultJson() {
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
            private java.util.Map<String, ?> submitResultJson; 
            private String submitTime; 
            private String triggerSource; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.async = model.async;
                this.finishTime = model.finishTime;
                this.input = model.input;
                this.jobId = model.jobId;
                this.mediaInfoProperty = model.mediaInfoProperty;
                this.name = model.name;
                this.requestId = model.requestId;
                this.scheduleConfig = model.scheduleConfig;
                this.status = model.status;
                this.submitResultJson = model.submitResultJson;
                this.submitTime = model.submitTime;
                this.triggerSource = model.triggerSource;
                this.userData = model.userData;
            } 

            /**
             * <p>Indicates whether asynchronous processing was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The input of the job.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ab4802364a2e49208c99efab82dfa8e8</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The details of the media information.</p>
             */
            public Builder mediaInfoProperty(MediaInfoProperty mediaInfoProperty) {
                this.mediaInfoProperty = mediaInfoProperty;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>job-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4879B9DE-E4B6-19DC-91F5-9D5F4DCE4168</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The scheduling information.</p>
             */
            public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The state of the job. Valid values:</p>
             * <ul>
             * <li>Init: The job is submitted.</li>
             * <li>Success: The job is successful.</li>
             * <li>Fail: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job submission information.</p>
             */
            public Builder submitResultJson(java.util.Map<String, ?> submitResultJson) {
                this.submitResultJson = submitResultJson;
                return this;
            }

            /**
             * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The source of the job. Valid values:</p>
             * <ul>
             * <li>API</li>
             * <li>WorkFlow</li>
             * <li>Console</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>user-data</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
