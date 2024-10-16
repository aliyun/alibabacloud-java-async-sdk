// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaInfoJobResponseBody</p>
 */
public class SubmitMediaInfoJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaInfoJob")
    private MediaInfoJob mediaInfoJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the media information analysis job.</p>
         */
        public Builder mediaInfoJob(MediaInfoJob mediaInfoJob) {
            this.mediaInfoJob = mediaInfoJob;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62D9BE16-B7D5-550C-A482-7A0F60E09877</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitMediaInfoJobResponseBody build() {
            return new SubmitMediaInfoJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private Input(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * <p>The name of the OSS bucket in which the input media file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The region in which the OSS bucket that stores the input media file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>example-location</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input media file.</p>
             * 
             * <strong>example:</strong>
             * <p>example.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
     */
    public static class MNSMessageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        private MNSMessageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MNSMessageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String messageId; 

            /**
             * <p>The error code that is returned if the job fails. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The parameter &quot;Input&quot; does not conform to the JSON Object specification</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is returned if the job fails. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.JsonObjectFormatInvalid</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the message that is returned if the job is successful. This parameter is not returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>16f01ad6175e4230ac42bb5182cd****</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public MNSMessageResult build() {
                return new MNSMessageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
             * <p>The total bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1630.045</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration of the input media file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17.226000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The full name of the container format.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickTime/MOV</p>
             */
            public Builder formatLongName(String formatLongName) {
                this.formatLongName = formatLongName;
                return this;
            }

            /**
             * <p>The short name of the container format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
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
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3509895</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
             * <p>The bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>128.806</p>
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
             * <p>The short name of the encoding format. Default value: acc. Valid values:</p>
             * <ul>
             * <li><strong>acc</strong></li>
             * <li><strong>mp3</strong></li>
             * <li><strong>mp4</strong></li>
             * <li><strong>ogg</strong></li>
             * <li><strong>flac</strong></li>
             * </ul>
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
             * <p>The duration of the audio stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17.159546</p>
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
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
             * <p>The sampling rate. Unit: Hz.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The start time of the audio stream.</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
     */
    public static class SubtitleStream extends TeaModel {
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

        private SubtitleStream(Builder builder) {
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

        public static SubtitleStream create() {
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

            /**
             * <p>The full name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>ASS (Advanced SSA) subtitle</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The short name of the encoding format. Valid values:</p>
             * <ul>
             * <li><strong>srt</strong></li>
             * <li><strong>ass</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ass</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The tag of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>0x0000</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>[0][0][0][0]</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The codec time base.</p>
             * 
             * <strong>example:</strong>
             * <p>0/1</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The duration of the audio stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1370.116000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The start time of the subtitle stream.</p>
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
             * <p>1/1000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public SubtitleStream build() {
                return new SubtitleStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
             * <p>The average bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300.34</p>
             */
            public Builder avgBitrate(String avgBitrate) {
                this.avgBitrate = avgBitrate;
                return this;
            }

            /**
             * <p>The maximum bandwidth that is consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder costBandwidth(String costBandwidth) {
                this.costBandwidth = costBandwidth;
                return this;
            }

            /**
             * <p>The time consumed to preload the video.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ColorPrimaries")
        private String colorPrimaries;

        @com.aliyun.core.annotation.NameInMap("ColorRange")
        private String colorRange;

        @com.aliyun.core.annotation.NameInMap("ColorTransfer")
        private String colorTransfer;

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
            this.colorPrimaries = builder.colorPrimaries;
            this.colorRange = builder.colorRange;
            this.colorTransfer = builder.colorTransfer;
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
         * @return colorPrimaries
         */
        public String getColorPrimaries() {
            return this.colorPrimaries;
        }

        /**
         * @return colorRange
         */
        public String getColorRange() {
            return this.colorRange;
        }

        /**
         * @return colorTransfer
         */
        public String getColorTransfer() {
            return this.colorTransfer;
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
            private String colorPrimaries; 
            private String colorRange; 
            private String colorTransfer; 
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
             * <p>23.976025</p>
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * <p>The bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1496.46</p>
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
             * <p>The short name of the encoding format. Valid values:</p>
             * <ul>
             * <li><strong>h264</strong></li>
             * <li><strong>h265</strong></li>
             * <li><strong>gif</strong></li>
             * <li><strong>webp</strong></li>
             * </ul>
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
             * <p>The codec time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1001/48000</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The level of color reconstruction.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder colorPrimaries(String colorPrimaries) {
                this.colorPrimaries = colorPrimaries;
                return this;
            }

            /**
             * <p>The color range.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder colorRange(String colorRange) {
                this.colorRange = colorRange;
                return this;
            }

            /**
             * <p>The color channel.</p>
             * 
             * <strong>example:</strong>
             * <p>R255 G83 B170</p>
             */
            public Builder colorTransfer(String colorTransfer) {
                this.colorTransfer = colorTransfer;
                return this;
            }

            /**
             * <p>The display aspect ratio (DAR). DAR is the proportional relationship between the width and the height of a video. The value is used to determine whether the video is in portrait mode or landscape mode.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration of the video stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17.225542</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames). A value of 1 indicates that the video stream contains B-frames. A value of 0 indicates that the video stream does not contain B-frames.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The height of the video. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams. The sequence number of the first video stream to be played can be specified in some players. Default value: 1.</p>
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
             * <p>eng</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The codec level.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The network bandwidth that is consumed.</p>
             */
            public Builder networkCost(NetworkCost networkCost) {
                this.networkCost = networkCost;
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
             * <p>The start time of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>0.042000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/24000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * <p>The width of the video. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
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
             * <p>The audio streams. A media file can contain up to four audio streams.</p>
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The subtitle streams. A media file can contain up to four subtitle streams.</p>
             */
            public Builder subtitleStreamList(SubtitleStreamList subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * <p>The video streams. A media file can contain up to four video streams.</p>
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
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileFormat")
        private String fileFormat;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private Format format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Streams")
        private Streams streams;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Properties(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.fileFormat = builder.fileFormat;
            this.fileSize = builder.fileSize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.streams = builder.streams;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
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
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return format
         */
        public Format getFormat() {
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
         * @return streams
         */
        public Streams getStreams() {
            return this.streams;
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
            private String fileFormat; 
            private String fileSize; 
            private Format format; 
            private String fps; 
            private String height; 
            private Streams streams; 
            private String width; 

            /**
             * <p>The bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1630.045</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration of the input media file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17.226000</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The format of the input media file.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickTime/MOV</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3509895</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The format information.</p>
             */
            public Builder format(Format format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the video. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The media streams that are contained in the input media file.</p>
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            /**
             * <p>The width of the video. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaInfoJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitMediaInfoJobResponseBody</p>
     */
    public static class MediaInfoJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Async")
        private Boolean async;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaInfoJob(Builder builder) {
            this.async = builder.async;
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.properties = builder.properties;
            this.state = builder.state;
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
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return MNSMessageResult
         */
        public MNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean async; 
            private String code; 
            private String creationTime; 
            private Input input; 
            private String jobId; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private String pipelineId; 
            private Properties properties; 
            private String state; 
            private String userData; 

            /**
             * <p>Indicates whether the job is run in asynchronous mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder async(Boolean async) {
                this.async = async;
                return this;
            }

            /**
             * <p>The error code returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.JsonObjectFormatInvalid</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-01-10T12:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The information about the input media file.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>23ca1d184c0e4341e5b665e2a12****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The message sent by Message Service (MNS) to notify users of the job result.</p>
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * <p>The error message returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>The parameter ”*” does not conform to the JSON Object specification</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the analysis job is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e432bbf5b665e2a15****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The properties of the input media file.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The job is successful.</li>
             * <li><strong>Fail</strong>: The job fails.</li>
             * <li><strong>Analyzing</strong>: The job is being run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Analyzing</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>testid-001</p>
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
