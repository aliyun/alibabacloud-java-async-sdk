// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaListByURLResponseBody</p>
 */
public class QueryMediaListByURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaList")
    private MediaList mediaList;

    @com.aliyun.core.annotation.NameInMap("NonExistFileURLs")
    private NonExistFileURLs nonExistFileURLs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMediaListByURLResponseBody(Builder builder) {
        this.mediaList = builder.mediaList;
        this.nonExistFileURLs = builder.nonExistFileURLs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaListByURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaList
     */
    public MediaList getMediaList() {
        return this.mediaList;
    }

    /**
     * @return nonExistFileURLs
     */
    public NonExistFileURLs getNonExistFileURLs() {
        return this.nonExistFileURLs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaList mediaList; 
        private NonExistFileURLs nonExistFileURLs; 
        private String requestId; 

        /**
         * <p>The list of media files.</p>
         */
        public Builder mediaList(MediaList mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * <p>The IDs of the media files that do not exist. This parameter is not returned if all specified media files exist.</p>
         */
        public Builder nonExistFileURLs(NonExistFileURLs nonExistFileURLs) {
            this.nonExistFileURLs = nonExistFileURLs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1C8A0AEB-4321-485B-B4CB-DA4E9E6C9B42</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaListByURLResponseBody build() {
            return new QueryMediaListByURLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private File(Builder builder) {
            this.state = builder.state;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String state; 
            private String URL; 

            /**
             * <p>The status of the media file. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The file is normal.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The OSS URL of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4</a></p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Format extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FormatLongName")
        private String formatLongName;

        @com.aliyun.core.annotation.NameInMap("FormatName")
        private String formatName;

        @com.aliyun.core.annotation.NameInMap("NumPrograms")
        private String numPrograms;

        @com.aliyun.core.annotation.NameInMap("NumStreams")
        private String numStreams;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Format(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.formatLongName = builder.formatLongName;
            this.formatName = builder.formatName;
            this.numPrograms = builder.numPrograms;
            this.numStreams = builder.numStreams;
            this.size = builder.size;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Format create() {
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
         * @return formatLongName
         */
        public String getFormatLongName() {
            return this.formatLongName;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return numPrograms
         */
        public String getNumPrograms() {
            return this.numPrograms;
        }

        /**
         * @return numStreams
         */
        public String getNumStreams() {
            return this.numStreams;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String bitrate; 
            private String duration; 
            private String formatLongName; 
            private String formatName; 
            private String numPrograms; 
            private String numStreams; 
            private String size; 
            private String startTime; 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>593.192</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>79.204000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The full name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickTime/MOV</p>
             */
            public Builder formatLongName(String formatLongName) {
                this.formatLongName = formatLongName;
                return this;
            }

            /**
             * <p>The short name of the container format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
             * 
             * <strong>example:</strong>
             * <p>mov</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The total number of program streams.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder numPrograms(String numPrograms) {
                this.numPrograms = numPrograms;
                return this;
            }

            /**
             * <p>The total number of media streams.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder numStreams(String numStreams) {
                this.numStreams = numStreams;
                return this;
            }

            /**
             * <p>The size.</p>
             * 
             * <strong>example:</strong>
             * <p>5872904</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Format build() {
                return new Format(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class AudioStream extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        private AudioStream(Builder builder) {
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
            this.samplerate = builder.samplerate;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStream create() {
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
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
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
            private String samplerate; 
            private String startTime; 
            private String timebase; 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>76.356</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The output layout of the sound channels.</p>
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
             * <p>The short name of the encoding format. Valid values: H264, mov, aac, avc, and mpeg.</p>
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
             * <p>The codec time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/44100</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The duration of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>79.203265</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg language definition</a>.</p>
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
             * <p>100</p>
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
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.000000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/44100</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public AudioStream build() {
                return new AudioStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class AudioStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStream")
        private java.util.List < AudioStream> audioStream;

        private AudioStreamList(Builder builder) {
            this.audioStream = builder.audioStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreamList create() {
            return builder().build();
        }

        /**
         * @return audioStream
         */
        public java.util.List < AudioStream> getAudioStream() {
            return this.audioStream;
        }

        public static final class Builder {
            private java.util.List < AudioStream> audioStream; 

            /**
             * AudioStream.
             */
            public Builder audioStream(java.util.List < AudioStream> audioStream) {
                this.audioStream = audioStream;
                return this;
            }

            public AudioStreamList build() {
                return new AudioStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SubtitleStream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        private SubtitleStream(Builder builder) {
            this.index = builder.index;
            this.lang = builder.lang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStream create() {
            return builder().build();
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

        public static final class Builder {
            private String index; 
            private String lang; 

            /**
             * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg language definition</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>und</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            public SubtitleStream build() {
                return new SubtitleStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SubtitleStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubtitleStream")
        private java.util.List < SubtitleStream> subtitleStream;

        private SubtitleStreamList(Builder builder) {
            this.subtitleStream = builder.subtitleStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStreamList create() {
            return builder().build();
        }

        /**
         * @return subtitleStream
         */
        public java.util.List < SubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

        public static final class Builder {
            private java.util.List < SubtitleStream> subtitleStream; 

            /**
             * SubtitleStream.
             */
            public Builder subtitleStream(java.util.List < SubtitleStream> subtitleStream) {
                this.subtitleStream = subtitleStream;
                return this;
            }

            public SubtitleStreamList build() {
                return new SubtitleStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class NetworkCost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgBitrate")
        private String avgBitrate;

        @com.aliyun.core.annotation.NameInMap("CostBandwidth")
        private String costBandwidth;

        @com.aliyun.core.annotation.NameInMap("PreloadTime")
        private String preloadTime;

        private NetworkCost(Builder builder) {
            this.avgBitrate = builder.avgBitrate;
            this.costBandwidth = builder.costBandwidth;
            this.preloadTime = builder.preloadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCost create() {
            return builder().build();
        }

        /**
         * @return avgBitrate
         */
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        /**
         * @return costBandwidth
         */
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        /**
         * @return preloadTime
         */
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public static final class Builder {
            private String avgBitrate; 
            private String costBandwidth; 
            private String preloadTime; 

            /**
             * <p>The average bitrate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>2659.326</p>
             */
            public Builder avgBitrate(String avgBitrate) {
                this.avgBitrate = avgBitrate;
                return this;
            }

            /**
             * <p>The maximum bandwidth that was consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder costBandwidth(String costBandwidth) {
                this.costBandwidth = costBandwidth;
                return this;
            }

            /**
             * <p>The amount of preload time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder preloadTime(String preloadTime) {
                this.preloadTime = preloadTime;
                return this;
            }

            public NetworkCost build() {
                return new NetworkCost(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class VideoStream extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("NetworkCost")
        private NetworkCost networkCost;

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

        private VideoStream(Builder builder) {
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
            this.networkCost = builder.networkCost;
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

        public static VideoStream create() {
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
         * @return networkCost
         */
        public NetworkCost getNetworkCost() {
            return this.networkCost;
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
            private NetworkCost networkCost; 
            private String numFrames; 
            private String pixFmt; 
            private String profile; 
            private String rotate; 
            private String sar; 
            private String startTime; 
            private String timebase; 
            private String width; 

            /**
             * <p>The average frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>15.0</p>
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>512.701</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The full name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264/AVC/MPEG-4 AVC/MPEG-4 part 10</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The short name of the encoding format. Valid values: H264, mov, aac, avc, and mpeg.</p>
             * 
             * <strong>example:</strong>
             * <p>H264</p>
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
             * <p>The codec time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/30</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The display aspect ratio (DAR) of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>79.200000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>15.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames). A value of <strong>1</strong> indicates that the video stream contains B-frames. A value of <strong>2</strong> indicates that the video stream does not contain B-frames.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The latter number in the video resolution. The number indicates the video height.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a>.</p>
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
             * <p>31</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The network bandwidth consumption.</p>
             */
            public Builder networkCost(NetworkCost networkCost) {
                this.networkCost = networkCost;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
             * <p>High</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The rotation angle of the video.</p>
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
             * <p>1:1</p>
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.046029</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/15360</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * <p>The former number in the video resolution. The number indicates the video width and cannot be negative.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoStream build() {
                return new VideoStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class VideoStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoStream")
        private java.util.List < VideoStream> videoStream;

        private VideoStreamList(Builder builder) {
            this.videoStream = builder.videoStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreamList create() {
            return builder().build();
        }

        /**
         * @return videoStream
         */
        public java.util.List < VideoStream> getVideoStream() {
            return this.videoStream;
        }

        public static final class Builder {
            private java.util.List < VideoStream> videoStream; 

            /**
             * VideoStream.
             */
            public Builder videoStream(java.util.List < VideoStream> videoStream) {
                this.videoStream = videoStream;
                return this;
            }

            public VideoStreamList build() {
                return new VideoStreamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Streams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamList")
        private AudioStreamList audioStreamList;

        @com.aliyun.core.annotation.NameInMap("SubtitleStreamList")
        private SubtitleStreamList subtitleStreamList;

        @com.aliyun.core.annotation.NameInMap("VideoStreamList")
        private VideoStreamList videoStreamList;

        private Streams(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.subtitleStreamList = builder.subtitleStreamList;
            this.videoStreamList = builder.videoStreamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Streams create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public AudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return subtitleStreamList
         */
        public SubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        /**
         * @return videoStreamList
         */
        public VideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public static final class Builder {
            private AudioStreamList audioStreamList; 
            private SubtitleStreamList subtitleStreamList; 
            private VideoStreamList videoStreamList; 

            /**
             * <p>The list of audio streams.</p>
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The list of subtitle streams.</p>
             */
            public Builder subtitleStreamList(SubtitleStreamList subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * <p>The list of video streams.</p>
             */
            public Builder videoStreamList(VideoStreamList videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            public Streams build() {
                return new Streams(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class MediaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private Format format;

        @com.aliyun.core.annotation.NameInMap("Streams")
        private Streams streams;

        private MediaInfo(Builder builder) {
            this.format = builder.format;
            this.streams = builder.streams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfo create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public Format getFormat() {
            return this.format;
        }

        /**
         * @return streams
         */
        public Streams getStreams() {
            return this.streams;
        }

        public static final class Builder {
            private Format format; 
            private Streams streams; 

            /**
             * <p>The format information.</p>
             */
            public Builder format(Format format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The stream information.</p>
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            public MediaInfo build() {
                return new MediaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class PlayFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private PlayFile(Builder builder) {
            this.state = builder.state;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayFile create() {
            return builder().build();
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String state; 
            private String URL; 

            /**
             * <p>The status of the media file. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The file is normal.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The OSS URL of the playback file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4l-test/in/1.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4l-test/in/1.mp4</a></p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public PlayFile build() {
                return new PlayFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Play extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("File")
        private PlayFile file;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowName")
        private String mediaWorkflowName;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Play(Builder builder) {
            this.activityName = builder.activityName;
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.encryption = builder.encryption;
            this.file = builder.file;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.mediaWorkflowName = builder.mediaWorkflowName;
            this.size = builder.size;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Play create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
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
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return file
         */
        public PlayFile getFile() {
            return this.file;
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
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return mediaWorkflowName
         */
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String activityName; 
            private String bitrate; 
            private String duration; 
            private String encryption; 
            private PlayFile file; 
            private String format; 
            private String fps; 
            private String height; 
            private String mediaWorkflowId; 
            private String mediaWorkflowName; 
            private String size; 
            private String width; 

            /**
             * <p>The name of the workflow activity.</p>
             * 
             * <strong>example:</strong>
             * <p>test name</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The bitrate of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>25.067</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>7.965000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether the media file is encrypted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The media file is not encrypted.</li>
             * <li><strong>1</strong>: The media file is encrypted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The playback file.</p>
             */
            public Builder file(PlayFile file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The encoding format of the media file. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
             * 
             * <strong>example:</strong>
             * <p>mov</p>
             */
            public Builder format(String format) {
                this.format = format;
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
             * <p>The height of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the workflow that generates the playback file.</p>
             * 
             * <strong>example:</strong>
             * <p>6cc3aa66d1cb4bb2adf14e726c0a****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the workflow that generates the playback file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder mediaWorkflowName(String mediaWorkflowName) {
                this.mediaWorkflowName = mediaWorkflowName;
                return this;
            }

            /**
             * <p>The size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Play build() {
                return new Play(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class PlayList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Play")
        private java.util.List < Play> play;

        private PlayList(Builder builder) {
            this.play = builder.play;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayList create() {
            return builder().build();
        }

        /**
         * @return play
         */
        public java.util.List < Play> getPlay() {
            return this.play;
        }

        public static final class Builder {
            private java.util.List < Play> play; 

            /**
             * Play.
             */
            public Builder play(java.util.List < Play> play) {
                this.play = play;
                return this;
            }

            public PlayList build() {
                return new PlayList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class RunIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RunId")
        private java.util.List < String > runId;

        private RunIdList(Builder builder) {
            this.runId = builder.runId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunIdList create() {
            return builder().build();
        }

        /**
         * @return runId
         */
        public java.util.List < String > getRunId() {
            return this.runId;
        }

        public static final class Builder {
            private java.util.List < String > runId; 

            /**
             * RunId.
             */
            public Builder runId(java.util.List < String > runId) {
                this.runId = runId;
                return this;
            }

            public RunIdList build() {
                return new RunIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SnapshotFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private SnapshotFile(Builder builder) {
            this.state = builder.state;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotFile create() {
            return builder().build();
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String state; 
            private String URL; 

            /**
             * <p>The status of the file. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The file is normal.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The OSS URL of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example1-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example111-****.png">http://example1-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example111-****.png</a></p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public SnapshotFile build() {
                return new SnapshotFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("File")
        private SnapshotFile file;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowName")
        private String mediaWorkflowName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Snapshot(Builder builder) {
            this.activityName = builder.activityName;
            this.count = builder.count;
            this.file = builder.file;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.mediaWorkflowName = builder.mediaWorkflowName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return file
         */
        public SnapshotFile getFile() {
            return this.file;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return mediaWorkflowName
         */
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String activityName; 
            private String count; 
            private SnapshotFile file; 
            private String mediaWorkflowId; 
            private String mediaWorkflowName; 
            private String type; 

            /**
             * <p>The name of the workflow activity that generates the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>example-activity1-****</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The number of snapshots. This parameter is valid only when the value of the <strong>Type</strong> parameter is <strong>Sequence</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The snapshot.</p>
             */
            public Builder file(SnapshotFile file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The ID of the workflow that generates the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>6cc3aa66d1cb4bb2adf14e726c0a****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the workflow that generates the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>example-workflow-****</p>
             */
            public Builder mediaWorkflowName(String mediaWorkflowName) {
                this.mediaWorkflowName = mediaWorkflowName;
                return this;
            }

            /**
             * <p>The type of the snapshot. Valid values:</p>
             * <ul>
             * <li><strong>Single</strong>: a single snapshot</li>
             * <li><strong>Sequence</strong>: snapshots in sequence</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Single</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SnapshotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List < Snapshot> snapshot;

        private SnapshotList(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotList create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public SnapshotList build() {
                return new SnapshotList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SummaryFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private SummaryFile(Builder builder) {
            this.state = builder.state;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryFile create() {
            return builder().build();
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String state; 
            private String URL; 

            /**
             * <p>The status of the media file. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The file is normal.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The OSS URL of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.o">http://example-bucket-****.o</a></p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public SummaryFile build() {
                return new SummaryFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("File")
        private SummaryFile file;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowName")
        private String mediaWorkflowName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Summary(Builder builder) {
            this.activityName = builder.activityName;
            this.file = builder.file;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.mediaWorkflowName = builder.mediaWorkflowName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return file
         */
        public SummaryFile getFile() {
            return this.file;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return mediaWorkflowName
         */
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String activityName; 
            private SummaryFile file; 
            private String mediaWorkflowId; 
            private String mediaWorkflowName; 
            private String type; 

            /**
             * <p>The name of the workflow activity.</p>
             * 
             * <strong>example:</strong>
             * <p>example-activity-****</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The information about the input file.</p>
             */
            public Builder file(SummaryFile file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The ID of the workflow that generates the summary.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f6f44eab54b6e91d24d****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the workflow that generates the summary.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder mediaWorkflowName(String mediaWorkflowName) {
                this.mediaWorkflowName = mediaWorkflowName;
                return this;
            }

            /**
             * <p>The type of the summary. Valid values:</p>
             * <ul>
             * <li><strong>Video</strong>: video</li>
             * <li><strong>Gif</strong>: dynamic image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Gif</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class SummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Summary")
        private java.util.List < Summary> summary;

        private SummaryList(Builder builder) {
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryList create() {
            return builder().build();
        }

        /**
         * @return summary
         */
        public java.util.List < Summary> getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < Summary> summary; 

            /**
             * Summary.
             */
            public Builder summary(java.util.List < Summary> summary) {
                this.summary = summary;
                return this;
            }

            public SummaryList build() {
                return new SummaryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < String > tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class Media extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CensorState")
        private String censorState;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaInfo")
        private MediaInfo mediaInfo;

        @com.aliyun.core.annotation.NameInMap("PlayList")
        private PlayList playList;

        @com.aliyun.core.annotation.NameInMap("PublishState")
        private String publishState;

        @com.aliyun.core.annotation.NameInMap("RunIdList")
        private RunIdList runIdList;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("SnapshotList")
        private SnapshotList snapshotList;

        @com.aliyun.core.annotation.NameInMap("SummaryList")
        private SummaryList summaryList;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Media(Builder builder) {
            this.bitrate = builder.bitrate;
            this.cateId = builder.cateId;
            this.censorState = builder.censorState;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.file = builder.file;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.mediaId = builder.mediaId;
            this.mediaInfo = builder.mediaInfo;
            this.playList = builder.playList;
            this.publishState = builder.publishState;
            this.runIdList = builder.runIdList;
            this.size = builder.size;
            this.snapshotList = builder.snapshotList;
            this.summaryList = builder.summaryList;
            this.tags = builder.tags;
            this.title = builder.title;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Media create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return censorState
         */
        public String getCensorState() {
            return this.censorState;
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
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
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
         * @return mediaInfo
         */
        public MediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        /**
         * @return playList
         */
        public PlayList getPlayList() {
            return this.playList;
        }

        /**
         * @return publishState
         */
        public String getPublishState() {
            return this.publishState;
        }

        /**
         * @return runIdList
         */
        public RunIdList getRunIdList() {
            return this.runIdList;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return snapshotList
         */
        public SnapshotList getSnapshotList() {
            return this.snapshotList;
        }

        /**
         * @return summaryList
         */
        public SummaryList getSummaryList() {
            return this.summaryList;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private Long cateId; 
            private String censorState; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String duration; 
            private File file; 
            private String format; 
            private String fps; 
            private String height; 
            private String mediaId; 
            private MediaInfo mediaInfo; 
            private PlayList playList; 
            private String publishState; 
            private RunIdList runIdList; 
            private String size; 
            private SnapshotList snapshotList; 
            private SummaryList summaryList; 
            private Tags tags; 
            private String title; 
            private String width; 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>593.192</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The ID of the category to which the media file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The review status of the media file. Valid values:</p>
             * <ul>
             * <li><strong>Initiated</strong>: The media file is uploaded but not reviewed.</li>
             * <li><strong>Pass</strong>: The media file is uploaded and passes the review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Initiated</p>
             */
            public Builder censorState(String censorState) {
                this.censorState = censorState;
                return this;
            }

            /**
             * <p>The OSS URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example-****.png">http://example-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example-****.png</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-14T13:05:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description ****</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>79.204000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The details of the input file.</p>
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The encoding format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
             * 
             * <strong>example:</strong>
             * <p>mov</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>15.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the queried media file.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>52d7e98b05e648199612290bb819****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The media information.</p>
             */
            public Builder mediaInfo(MediaInfo mediaInfo) {
                this.mediaInfo = mediaInfo;
                return this;
            }

            /**
             * <p>The playlist.</p>
             */
            public Builder playList(PlayList playList) {
                this.playList = playList;
                return this;
            }

            /**
             * <p>The publishing status of the media file. Valid values:</p>
             * <ul>
             * <li><strong>Initiated</strong>: The media file is in the initial state.</li>
             * <li><strong>UnPublish</strong>: The media file has not been published, and the playback permission on the OSS object is Private.</li>
             * <li><strong>Published</strong>: The media file has been published, and the playback permission on the OSS object is Default.</li>
             * <li><strong>Deleted</strong>: The file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder publishState(String publishState) {
                this.publishState = publishState;
                return this;
            }

            /**
             * <p>The IDs of the media workflow execution instances.</p>
             */
            public Builder runIdList(RunIdList runIdList) {
                this.runIdList = runIdList;
                return this;
            }

            /**
             * <p>The size of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>5872904</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The list of snapshots.</p>
             */
            public Builder snapshotList(SnapshotList snapshotList) {
                this.snapshotList = snapshotList;
                return this;
            }

            /**
             * <p>The list of video summaries.</p>
             */
            public Builder summaryList(SummaryList summaryList) {
                this.summaryList = summaryList;
                return this;
            }

            /**
             * <p>The tags of the media file.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>kled.mp4</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Media build() {
                return new Media(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class MediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private java.util.List < Media> media;

        private MediaList(Builder builder) {
            this.media = builder.media;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaList create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public java.util.List < Media> getMedia() {
            return this.media;
        }

        public static final class Builder {
            private java.util.List < Media> media; 

            /**
             * Media.
             */
            public Builder media(java.util.List < Media> media) {
                this.media = media;
                return this;
            }

            public MediaList build() {
                return new MediaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaListByURLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaListByURLResponseBody</p>
     */
    public static class NonExistFileURLs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileURL")
        private java.util.List < String > fileURL;

        private NonExistFileURLs(Builder builder) {
            this.fileURL = builder.fileURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistFileURLs create() {
            return builder().build();
        }

        /**
         * @return fileURL
         */
        public java.util.List < String > getFileURL() {
            return this.fileURL;
        }

        public static final class Builder {
            private java.util.List < String > fileURL; 

            /**
             * FileURL.
             */
            public Builder fileURL(java.util.List < String > fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            public NonExistFileURLs build() {
                return new NonExistFileURLs(this);
            } 

        } 

    }
}
