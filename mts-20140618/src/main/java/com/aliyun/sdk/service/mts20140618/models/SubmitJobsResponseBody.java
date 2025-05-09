// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link SubmitJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitJobsResponseBody</p>
 */
public class SubmitJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobResultList")
    private JobResultList jobResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitJobsResponseBody(Builder builder) {
        this.jobResultList = builder.jobResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobResultList
     */
    public JobResultList getJobResultList() {
        return this.jobResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobResultList jobResultList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitJobsResponseBody model) {
            this.jobResultList = model.jobResultList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The transcoding jobs that are generated.</p>
         */
        public Builder jobResultList(JobResultList jobResultList) {
            this.jobResultList = jobResultList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A45S71F6-D73936451234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitJobsResponseBody build() {
            return new SubmitJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The name of the OSS bucket in which the job input is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the job input is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the job input.</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MNSMessageResult model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.messageId = model.messageId;
            } 

            /**
             * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated &quot;%s&quot; cannot be found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the error message returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Amix extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmixURL")
        private String amixURL;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Map")
        private String map;

        @com.aliyun.core.annotation.NameInMap("MixDurMode")
        private String mixDurMode;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Amix(Builder builder) {
            this.amixURL = builder.amixURL;
            this.duration = builder.duration;
            this.map = builder.map;
            this.mixDurMode = builder.mixDurMode;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Amix create() {
            return builder().build();
        }

        /**
         * @return amixURL
         */
        public String getAmixURL() {
            return this.amixURL;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return map
         */
        public String getMap() {
            return this.map;
        }

        /**
         * @return mixDurMode
         */
        public String getMixDurMode() {
            return this.mixDurMode;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String amixURL; 
            private String duration; 
            private String map; 
            private String mixDurMode; 
            private String start; 

            private Builder() {
            } 

            private Builder(Amix model) {
                this.amixURL = model.amixURL;
                this.duration = model.duration;
                this.map = model.map;
                this.mixDurMode = model.mixDurMode;
                this.start = model.start;
            } 

            /**
             * <p>The URL of the audio track that is mixed as the background music.</p>
             * <ul>
             * <li>The URL can be an OSS URL or the string <code>input</code>.</li>
             * <li>A value of input indicates that two audio tracks are mixed in a video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outpu***.oss-cn-shanghai.aliyuncs.com/mp4-to-mp3%5E1571025263578816%40.mp3">https://outpu***.oss-cn-shanghai.aliyuncs.com/mp4-to-mp3%5E1571025263578816%40.mp3</a></p>
             */
            public Builder amixURL(String amixURL) {
                this.amixURL = amixURL;
                return this;
            }

            /**
             * <p>The duration of the mixed audio track. The value is in the number or time format.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The audio track that is mixed. Format: 0:a:{audio_index}. Example: 0:a:0.</p>
             * 
             * <strong>example:</strong>
             * <p>0:a:0</p>
             */
            public Builder map(String map) {
                this.map = map;
                return this;
            }

            /**
             * <p>The mode to specify the mixing duration. Valid values: <strong>first</strong> and <strong>long</strong>.</p>
             * <ul>
             * <li><strong>first</strong>: The length of the output media equals the length of the input media.</li>
             * <li><strong>long</strong>: The length of the output media equals the length of the output media or the length of the input media, whichever is longer.</li>
             * <li>Default value: <strong>long</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>long</p>
             */
            public Builder mixDurMode(String mixDurMode) {
                this.mixDurMode = mixDurMode;
                return this;
            }

            /**
             * <p>The start time. The value is in the number or time format. Examples: 1:25:36.240 and 32000.23.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Amix build() {
                return new Amix(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class AmixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amix")
        private java.util.List<Amix> amix;

        private AmixList(Builder builder) {
            this.amix = builder.amix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AmixList create() {
            return builder().build();
        }

        /**
         * @return amix
         */
        public java.util.List<Amix> getAmix() {
            return this.amix;
        }

        public static final class Builder {
            private java.util.List<Amix> amix; 

            private Builder() {
            } 

            private Builder(AmixList model) {
                this.amix = model.amix;
            } 

            /**
             * Amix.
             */
            public Builder amix(java.util.List<Amix> amix) {
                this.amix = amix;
                return this;
            }

            public AmixList build() {
                return new AmixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Volume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        private Volume(Builder builder) {
            this.level = builder.level;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private String level; 
            private String method; 

            private Builder() {
            } 

            private Builder(Volume model) {
                this.level = model.level;
                this.method = model.method;
            } 

            /**
             * <p>The volume adjustment range.</p>
             * <ul>
             * <li>Unit: decibel.</li>
             * <li>Default value: <strong>-20</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-20</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The method that is used to adjust the volume. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong></li>
             * <li><strong>dynamic</strong></li>
             * <li><strong>linear</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Volume volume;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.samplerate = builder.samplerate;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        /**
         * @return volume
         */
        public Volume getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String qscale; 
            private String samplerate; 
            private Volume volume; 

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.samplerate = model.samplerate;
                this.volume = model.volume;
            } 

            /**
             * <p>The audio bitrate of the output file.</p>
             * <ul>
             * <li>Unit: Kbit/s.</li>
             * <li>Default value: <strong>128</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels.</p>
             * <ul>
             * <li>If the value of Codec is mp3, the value of this parameter can only be <strong>1</strong> or <strong>2</strong>.</li>
             * <li>If the value of Codec is aac, the value of this parameter can only be <strong>1</strong>, <strong>2</strong>, <strong>4</strong>, <strong>5</strong>, <strong>6</strong>, or <strong>8</strong>.</li>
             * <li>Default value: <strong>2</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec.</p>
             * <ul>
             * <li>Valid values: <strong>aac</strong>, <strong>mp3</strong>, <strong>vorbis</strong>, and <strong>flac</strong>.</li>
             * <li>Default value: <strong>aac</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The codec profile of the audio.</p>
             * <blockquote>
             * <p> Valid values if the value of <strong>Codec</strong> is <strong>aac</strong>: <strong>aac_low</strong>, <strong>aac_he</strong>, <strong>aac_he_v2</strong>, <strong>aac_ld</strong>, and <strong>aac_eld</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The level of quality control on the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * <ul>
             * <li>Valid values: <strong>22050</strong>, <strong>32000</strong>, <strong>44100</strong>, <strong>48000</strong>, and <strong>96000</strong>.</li>
             * <li>Unit: Hz.</li>
             * <li>Default value: <strong>44100</strong>.</li>
             * </ul>
             * <blockquote>
             * <p> If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The volume configurations.</p>
             */
            public Builder volume(Volume volume) {
                this.volume = volume;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class TimeSpan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Seek")
        private String seek;

        private TimeSpan(Builder builder) {
            this.duration = builder.duration;
            this.seek = builder.seek;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSpan create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return seek
         */
        public String getSeek() {
            return this.seek;
        }

        public static final class Builder {
            private String duration; 
            private String seek; 

            private Builder() {
            } 

            private Builder(TimeSpan model) {
                this.duration = model.duration;
                this.seek = model.seek;
            } 

            /**
             * <p>The duration of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:00:59.999</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:59:59.999</p>
             */
            public Builder seek(String seek) {
                this.seek = seek;
                return this;
            }

            public TimeSpan build() {
                return new TimeSpan(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Clip extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeSpan")
        private TimeSpan timeSpan;

        private Clip(Builder builder) {
            this.timeSpan = builder.timeSpan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clip create() {
            return builder().build();
        }

        /**
         * @return timeSpan
         */
        public TimeSpan getTimeSpan() {
            return this.timeSpan;
        }

        public static final class Builder {
            private TimeSpan timeSpan; 

            private Builder() {
            } 

            private Builder(Clip model) {
                this.timeSpan = model.timeSpan;
            } 

            /**
             * <p>The time span of the clip.</p>
             */
            public Builder timeSpan(TimeSpan timeSpan) {
                this.timeSpan = timeSpan;
                return this;
            }

            public Clip build() {
                return new Clip(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private Container(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String format; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.format = model.format;
            } 

            /**
             * <p>The container format.</p>
             * <ul>
             * <li>Default value: <strong>mp4</strong>.</li>
             * <li>Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).</li>
             * <li>Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</li>
             * <li>Image formats include GIF and WebP.</li>
             * <li>If the container format is GIF, the video codec must be GIF.</li>
             * <li>If the container format is WebP, the video codec must be WebP.</li>
             * <li>If the container format is FLV, the video codec cannot be H.265.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flv</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
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

            private Builder() {
            } 

            private Builder(InputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-intput.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class DigiWaterMark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private String alpha;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DigiWaterMark(Builder builder) {
            this.alpha = builder.alpha;
            this.inputFile = builder.inputFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DigiWaterMark create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public String getAlpha() {
            return this.alpha;
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String alpha; 
            private InputFile inputFile; 
            private String type; 

            private Builder() {
            } 

            private Builder(DigiWaterMark model) {
                this.alpha = model.alpha;
                this.inputFile = model.inputFile;
                this.type = model.type;
            } 

            /**
             * <p>The transparency of the text or image.</p>
             * <ul>
             * <li>Value values: <strong>(0,1]</strong>.</li>
             * <li>Default value: <strong>1.0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder alpha(String alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The details of the input file.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The type of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
             * <ul>
             * <li><strong>Image</strong> (default)</li>
             * <li><strong>Text</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DigiWaterMark build() {
                return new DigiWaterMark(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("KeyUri")
        private String keyUri;

        @com.aliyun.core.annotation.NameInMap("SkipCnt")
        private String skipCnt;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Encryption(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.keyUri = builder.keyUri;
            this.skipCnt = builder.skipCnt;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return keyUri
         */
        public String getKeyUri() {
            return this.keyUri;
        }

        /**
         * @return skipCnt
         */
        public String getSkipCnt() {
            return this.skipCnt;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String key; 
            private String keyType; 
            private String keyUri; 
            private String skipCnt; 
            private String type; 

            private Builder() {
            } 

            private Builder(Encryption model) {
                this.id = model.id;
                this.key = model.key;
                this.keyType = model.keyType;
                this.keyUri = model.keyUri;
                this.skipCnt = model.skipCnt;
                this.type = model.type;
            } 

            /**
             * <p>The encryption ID.</p>
             * 
             * <strong>example:</strong>
             * <p>31fa3c9ca8134f9cec2b4b0b0f78****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The key that is used to encrypt the video.</p>
             * 
             * <strong>example:</strong>
             * <p>encryptionkey128</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The key encryption method. Keys cannot be transmitted to MPS in plaintext. Keys must be encrypted by using Base64 or Key Management Service (KMS). For example, if the key is encryptionkey128, you can encrypt the key by using the following method: Base64(&quot;encryptionkey128&quot;) or KMS(Base64(&quot;encryptionkey128&quot;).</p>
             * 
             * <strong>example:</strong>
             * <p>Base64</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * <p>The URL that is used to request the key. The URL is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://1161758785*****.cn-shanghai.fc.aliyuncs.com/2016-08-15/proxy/HLS-decyptServer/decyptServer/">https://1161758785*****.cn-shanghai.fc.aliyuncs.com/2016-08-15/proxy/HLS-decyptServer/decyptServer/</a></p>
             */
            public Builder keyUri(String keyUri) {
                this.keyUri = keyUri;
                return this;
            }

            /**
             * <p>The number of unencrypted frames at the beginning of the video. Leaving these frames unencrypted enables video playback to quickly start.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder skipCnt(String skipCnt) {
                this.skipCnt = skipCnt;
                return this;
            }

            /**
             * <p>The encryption type. Only <strong>hls-aes-128</strong> may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>hls-aes-128</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Ts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Md5Support")
        private Boolean md5Support;

        @com.aliyun.core.annotation.NameInMap("SizeSupport")
        private Boolean sizeSupport;

        private Ts(Builder builder) {
            this.md5Support = builder.md5Support;
            this.sizeSupport = builder.sizeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ts create() {
            return builder().build();
        }

        /**
         * @return md5Support
         */
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        /**
         * @return sizeSupport
         */
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public static final class Builder {
            private Boolean md5Support; 
            private Boolean sizeSupport; 

            private Builder() {
            } 

            private Builder(Ts model) {
                this.md5Support = model.md5Support;
                this.sizeSupport = model.sizeSupport;
            } 

            /**
             * <p>Indicates whether the output of the MD5 value of the TS file is supported in the M3U8 video. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder md5Support(Boolean md5Support) {
                this.md5Support = md5Support;
                return this;
            }

            /**
             * <p>Indicates whether the size of the TS file is generated in the output M3U8 video. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sizeSupport(Boolean sizeSupport) {
                this.sizeSupport = sizeSupport;
                return this;
            }

            public Ts build() {
                return new Ts(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class M3U8NonStandardSupport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TS")
        private Ts ts;

        private M3U8NonStandardSupport(Builder builder) {
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static M3U8NonStandardSupport create() {
            return builder().build();
        }

        /**
         * @return ts
         */
        public Ts getTs() {
            return this.ts;
        }

        public static final class Builder {
            private Ts ts; 

            private Builder() {
            } 

            private Builder(M3U8NonStandardSupport model) {
                this.ts = model.ts;
            } 

            /**
             * <p>The non-standard support configurations for TS files. The value is a JSON object. For more information, see the <strong>TS</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
             */
            public Builder ts(Ts ts) {
                this.ts = ts;
                return this;
            }

            public M3U8NonStandardSupport build() {
                return new M3U8NonStandardSupport(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Merge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("MergeURL")
        private String mergeURL;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Merge(Builder builder) {
            this.duration = builder.duration;
            this.mergeURL = builder.mergeURL;
            this.roleArn = builder.roleArn;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Merge create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return mergeURL
         */
        public String getMergeURL() {
            return this.mergeURL;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String mergeURL; 
            private String roleArn; 
            private String start; 

            private Builder() {
            } 

            private Builder(Merge model) {
                this.duration = model.duration;
                this.mergeURL = model.mergeURL;
                this.roleArn = model.roleArn;
                this.start = model.start;
            } 

            /**
             * <p>The duration of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Examples: 01:59:59.999 and 32000.23.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>00000.20</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The OSS URL of the clip.</p>
             * <ul>
             * <li>Example: <code>http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv</code>.</li>
             * <li>The OSS URL of the object must be URL-encoded by using the UTF-8 standard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv</a></p>
             */
            public Builder mergeURL(String mergeURL) {
                this.mergeURL = mergeURL;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role used for delegated authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::<your uid>:role/<your role name></p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The start point in time of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Examples: 01:59:59.999 and 32000.23.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>00000.50</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Merge build() {
                return new Merge(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class MergeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Merge")
        private java.util.List<Merge> merge;

        private MergeList(Builder builder) {
            this.merge = builder.merge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeList create() {
            return builder().build();
        }

        /**
         * @return merge
         */
        public java.util.List<Merge> getMerge() {
            return this.merge;
        }

        public static final class Builder {
            private java.util.List<Merge> merge; 

            private Builder() {
            } 

            private Builder(MergeList model) {
                this.merge = model.merge;
            } 

            /**
             * Merge.
             */
            public Builder merge(java.util.List<Merge> merge) {
                this.merge = merge;
                return this;
            }

            public MergeList build() {
                return new MergeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Gif extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DitherMode")
        private String ditherMode;

        @com.aliyun.core.annotation.NameInMap("FinalDelay")
        private String finalDelay;

        @com.aliyun.core.annotation.NameInMap("IsCustomPalette")
        private String isCustomPalette;

        @com.aliyun.core.annotation.NameInMap("Loop")
        private String loop;

        private Gif(Builder builder) {
            this.ditherMode = builder.ditherMode;
            this.finalDelay = builder.finalDelay;
            this.isCustomPalette = builder.isCustomPalette;
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gif create() {
            return builder().build();
        }

        /**
         * @return ditherMode
         */
        public String getDitherMode() {
            return this.ditherMode;
        }

        /**
         * @return finalDelay
         */
        public String getFinalDelay() {
            return this.finalDelay;
        }

        /**
         * @return isCustomPalette
         */
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String ditherMode; 
            private String finalDelay; 
            private String isCustomPalette; 
            private String loop; 

            private Builder() {
            } 

            private Builder(Gif model) {
                this.ditherMode = model.ditherMode;
                this.finalDelay = model.finalDelay;
                this.isCustomPalette = model.isCustomPalette;
                this.loop = model.loop;
            } 

            /**
             * <p>The color dithering algorithm of the palette. Valid values: <strong>sierra</strong> and <strong>bayer</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>bayer</p>
             */
            public Builder ditherMode(String ditherMode) {
                this.ditherMode = ditherMode;
                return this;
            }

            /**
             * <p>The duration for which the final frame is paused. Unit: centisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * <p>Indicates whether a custom palette is used. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCustomPalette(String isCustomPalette) {
                this.isCustomPalette = isCustomPalette;
                return this;
            }

            /**
             * <p>The loop count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Gif build() {
                return new Gif(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        private Segment(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String duration; 

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
            } 

            /**
             * <p>The length of the segment. The value is an integer. Unit: seconds.</p>
             * <ul>
             * <li>Valid values: <strong>[1,10]</strong>.</li>
             * <li>Default value: <strong>10</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Webp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Loop")
        private String loop;

        private Webp(Builder builder) {
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webp create() {
            return builder().build();
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String loop; 

            private Builder() {
            } 

            private Builder(Webp model) {
                this.loop = model.loop;
            } 

            /**
             * <p>The loop count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Webp build() {
                return new Webp(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class MuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gif")
        private Gif gif;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        @com.aliyun.core.annotation.NameInMap("Webp")
        private Webp webp;

        private MuxConfig(Builder builder) {
            this.gif = builder.gif;
            this.segment = builder.segment;
            this.webp = builder.webp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return gif
         */
        public Gif getGif() {
            return this.gif;
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        /**
         * @return webp
         */
        public Webp getWebp() {
            return this.webp;
        }

        public static final class Builder {
            private Gif gif; 
            private Segment segment; 
            private Webp webp; 

            private Builder() {
            } 

            private Builder(MuxConfig model) {
                this.gif = model.gif;
                this.segment = model.segment;
                this.webp = model.webp;
            } 

            /**
             * <p>The transmuxing configurations for GIF.</p>
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * <p>The segment configuration. The value is a JSON object.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The transmuxing configurations for WebP.</p>
             */
            public Builder webp(Webp webp) {
                this.webp = webp;
                return this;
            }

            public MuxConfig build() {
                return new MuxConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Opening extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("openUrl")
        private String openUrl;

        private Opening(Builder builder) {
            this.height = builder.height;
            this.start = builder.start;
            this.width = builder.width;
            this.openUrl = builder.openUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Opening create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        /**
         * @return openUrl
         */
        public String getOpenUrl() {
            return this.openUrl;
        }

        public static final class Builder {
            private String height; 
            private String start; 
            private String width; 
            private String openUrl; 

            private Builder() {
            } 

            private Builder(Opening model) {
                this.height = model.height;
                this.start = model.start;
                this.width = model.width;
                this.openUrl = model.openUrl;
            } 

            /**
             * <p>The height of the opening part.</p>
             * <ul>
             * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
             * <li>Default value: <strong>-1</strong>.</li>
             * <li>A value of <strong>-1</strong> indicates that the height of the source of the opening part is retained.</li>
             * <li>A value of <strong>full</strong> indicates that the height of the main part is used for the opening part.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The amount of time after which the opening part is played. The value starts from 0.</p>
             * <ul>
             * <li>Unit: seconds.</li>
             * <li>Default value: <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The width of the opening part.</p>
             * <ul>
             * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
             * <li>Default value: <strong>-1</strong>.</li>
             * <li>A value of <strong>-1</strong> indicates that the width of the source of the opening part is retained.</li>
             * <li>A value of <strong>full</strong> indicates that the width of the main part is used for the opening part.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The OSS URL of the opening part.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv</a></p>
             */
            public Builder openUrl(String openUrl) {
                this.openUrl = openUrl;
                return this;
            }

            public Opening build() {
                return new Opening(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class OpeningList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Opening")
        private java.util.List<Opening> opening;

        private OpeningList(Builder builder) {
            this.opening = builder.opening;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpeningList create() {
            return builder().build();
        }

        /**
         * @return opening
         */
        public java.util.List<Opening> getOpening() {
            return this.opening;
        }

        public static final class Builder {
            private java.util.List<Opening> opening; 

            private Builder() {
            } 

            private Builder(OpeningList model) {
                this.opening = model.opening;
            } 

            /**
             * Opening.
             */
            public Builder opening(java.util.List<Opening> opening) {
                this.opening = opening;
                return this;
            }

            public OpeningList build() {
                return new OpeningList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class OutSubtitleFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private OutSubtitleFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutSubtitleFile create() {
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

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            private Builder() {
            } 

            private Builder(OutSubtitleFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the output file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-output.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used for delegated authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::<your uid>:role/<your role name></p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OutSubtitleFile build() {
                return new OutSubtitleFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class OutSubtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Map")
        private String map;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OutSubtitleFile")
        private OutSubtitleFile outSubtitleFile;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private OutSubtitle(Builder builder) {
            this.map = builder.map;
            this.message = builder.message;
            this.outSubtitleFile = builder.outSubtitleFile;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutSubtitle create() {
            return builder().build();
        }

        /**
         * @return map
         */
        public String getMap() {
            return this.map;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return outSubtitleFile
         */
        public OutSubtitleFile getOutSubtitleFile() {
            return this.outSubtitleFile;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String map; 
            private String message; 
            private OutSubtitleFile outSubtitleFile; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(OutSubtitle model) {
                this.map = model.map;
                this.message = model.message;
                this.outSubtitleFile = model.outSubtitleFile;
                this.success = model.success;
            } 

            /**
             * <p>The video track. Format: <code>0:{Stream}:{Stream sequence number}</code>, which is <code>0:v:{video_index}</code>. The value of Stream is v, which indicates a video stream. The sequence number is the index of the video stream in the list and starts from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0:v:0</p>
             */
            public Builder map(String map) {
                this.map = map;
                return this;
            }

            /**
             * <p>The error message returned if the job failed to be created. This parameter is not returned if the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified parameter “%s” cannot be null.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The details of the output file.</p>
             */
            public Builder outSubtitleFile(OutSubtitleFile outSubtitleFile) {
                this.outSubtitleFile = outSubtitleFile;
                return this;
            }

            /**
             * <p>Indicates whether the job was created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public OutSubtitle build() {
                return new OutSubtitle(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class OutSubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutSubtitle")
        private java.util.List<OutSubtitle> outSubtitle;

        private OutSubtitleList(Builder builder) {
            this.outSubtitle = builder.outSubtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutSubtitleList create() {
            return builder().build();
        }

        /**
         * @return outSubtitle
         */
        public java.util.List<OutSubtitle> getOutSubtitle() {
            return this.outSubtitle;
        }

        public static final class Builder {
            private java.util.List<OutSubtitle> outSubtitle; 

            private Builder() {
            } 

            private Builder(OutSubtitleList model) {
                this.outSubtitle = model.outSubtitle;
            } 

            /**
             * OutSubtitle.
             */
            public Builder outSubtitle(java.util.List<OutSubtitle> outSubtitle) {
                this.outSubtitle = outSubtitle;
                return this;
            }

            public OutSubtitleList build() {
                return new OutSubtitleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class OutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private OutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
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

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            private Builder() {
            } 

            private Builder(OutputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the output file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-output.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used for delegated authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::<your uid>:role/<your role name></p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Format model) {
                this.bitrate = model.bitrate;
                this.duration = model.duration;
                this.formatLongName = model.formatLongName;
                this.formatName = model.formatName;
                this.numPrograms = model.numPrograms;
                this.numStreams = model.numStreams;
                this.size = model.size;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The total bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The total duration.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The full name of the container format.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickTime / MOV</p>
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
             * <p>The size of the file.</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AudioStream model) {
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
                this.samplerate = model.samplerate;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * <p>The bitrate of the audio stream.</p>
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
             * <p>The full name of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC (Advanced Audio Coding)</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The short name of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The tag of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>0x6134706d</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the codec.</p>
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
             * <p>The duration of the audio stream.</p>
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
             * <p>The language of the audio stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
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
             * <p>25</p>
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
             * <p>The sampling rate of the audio stream.</p>
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
             * <p>The time base of the audio stream.</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class AudioStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStream")
        private java.util.List<AudioStream> audioStream;

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
        public java.util.List<AudioStream> getAudioStream() {
            return this.audioStream;
        }

        public static final class Builder {
            private java.util.List<AudioStream> audioStream; 

            private Builder() {
            } 

            private Builder(AudioStreamList model) {
                this.audioStream = model.audioStream;
            } 

            /**
             * AudioStream.
             */
            public Builder audioStream(java.util.List<AudioStream> audioStream) {
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SubtitleStream model) {
                this.index = model.index;
                this.lang = model.lang;
            } 

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
             * <p>The language of the subtitle stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class SubtitleStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubtitleStream")
        private java.util.List<SubtitleStream> subtitleStream;

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
        public java.util.List<SubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

        public static final class Builder {
            private java.util.List<SubtitleStream> subtitleStream; 

            private Builder() {
            } 

            private Builder(SubtitleStreamList model) {
                this.subtitleStream = model.subtitleStream;
            } 

            /**
             * SubtitleStream.
             */
            public Builder subtitleStream(java.util.List<SubtitleStream> subtitleStream) {
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NetworkCost model) {
                this.avgBitrate = model.avgBitrate;
                this.costBandwidth = model.costBandwidth;
                this.preloadTime = model.preloadTime;
            } 

            /**
             * <p>The average bitrate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder avgBitrate(String avgBitrate) {
                this.avgBitrate = avgBitrate;
                return this;
            }

            /**
             * <p>The maximum bandwidth that was consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder costBandwidth(String costBandwidth) {
                this.costBandwidth = costBandwidth;
                return this;
            }

            /**
             * <p>The amount of time consumed to preload the video stream.</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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
            private String sar; 
            private String startTime; 
            private String timebase; 
            private String width; 

            private Builder() {
            } 

            private Builder(VideoStream model) {
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
                this.networkCost = model.networkCost;
                this.numFrames = model.numFrames;
                this.pixFmt = model.pixFmt;
                this.profile = model.profile;
                this.sar = model.sar;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
                this.width = model.width;
            } 

            /**
             * <p>The average frame rate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>23.976025</p>
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * <p>The bitrate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1496.46</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The full name of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
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
             * <p>The tag of the codec.</p>
             * 
             * <strong>example:</strong>
             * <p>0x31637661</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the codec.</p>
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
             * <p>The duration of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>17.225542</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>23.976025</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains B-frames.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The height of the video stream in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the video stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
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
             * <p>51</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The network bandwidth that was consumed.</p>
             */
            public Builder networkCost(NetworkCost networkCost) {
                this.networkCost = networkCost;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
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
             * <p>high</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The sample aspect ratio (SAR) of the video stream.</p>
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
             * <p>0.000000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1/24000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * <p>The width of the video stream in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class VideoStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoStream")
        private java.util.List<VideoStream> videoStream;

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
        public java.util.List<VideoStream> getVideoStream() {
            return this.videoStream;
        }

        public static final class Builder {
            private java.util.List<VideoStream> videoStream; 

            private Builder() {
            } 

            private Builder(VideoStreamList model) {
                this.videoStream = model.videoStream;
            } 

            /**
             * VideoStream.
             */
            public Builder videoStream(java.util.List<VideoStream> videoStream) {
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Streams model) {
                this.audioStreamList = model.audioStreamList;
                this.subtitleStreamList = model.subtitleStreamList;
                this.videoStreamList = model.videoStreamList;
            } 

            /**
             * <p>The audio streams.</p>
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The subtitle streams.</p>
             */
            public Builder subtitleStreamList(SubtitleStreamList subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * <p>The video streams.</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Properties model) {
                this.bitrate = model.bitrate;
                this.duration = model.duration;
                this.fileFormat = model.fileFormat;
                this.fileSize = model.fileSize;
                this.format = model.format;
                this.fps = model.fps;
                this.height = model.height;
                this.streams = model.streams;
                this.width = model.width;
            } 

            /**
             * <p>The bitrate of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The format of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickTime / MOV</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>The size of the file.</p>
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
             * <p>The frame rate of the video. The value is a number.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The stream information.</p>
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            /**
             * <p>The width of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
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
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class ExtSubtitleInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private ExtSubtitleInput(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtSubtitleInput create() {
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

            private Builder() {
            } 

            private Builder(ExtSubtitleInput model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-output.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public ExtSubtitleInput build() {
                return new ExtSubtitleInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class ExtSubtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharEnc")
        private String charEnc;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("Input")
        private ExtSubtitleInput input;

        private ExtSubtitle(Builder builder) {
            this.charEnc = builder.charEnc;
            this.fontName = builder.fontName;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtSubtitle create() {
            return builder().build();
        }

        /**
         * @return charEnc
         */
        public String getCharEnc() {
            return this.charEnc;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return input
         */
        public ExtSubtitleInput getInput() {
            return this.input;
        }

        public static final class Builder {
            private String charEnc; 
            private String fontName; 
            private ExtSubtitleInput input; 

            private Builder() {
            } 

            private Builder(ExtSubtitle model) {
                this.charEnc = model.charEnc;
                this.fontName = model.fontName;
                this.input = model.input;
            } 

            /**
             * <p>The character set used by the external subtitle.</p>
             * <ul>
             * <li>Valid values: <strong>UTF-8</strong>, <strong>GBK</strong>, <strong>BIG5</strong>, and <strong>auto</strong>.</li>
             * <li>Default value: <strong>auto</strong>.</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is set to <strong>auto</strong>, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * <p>The font of the hardcoded subtitles converted from external subtitles. Default value: <strong>SimSun</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/59950.html">Fonts</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;WenQuanYi Zen Hei&quot;, &quot;Yuanti SC Regular&quot;, &quot;SimSun&quot;</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The OSS object that is used as the external subtitle. The value is a JSON object. Files in the <strong>SRT</strong> or <strong>ASS</strong> format are supported.</p>
             */
            public Builder input(ExtSubtitleInput input) {
                this.input = input;
                return this;
            }

            public ExtSubtitle build() {
                return new ExtSubtitle(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class ExtSubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtSubtitle")
        private java.util.List<ExtSubtitle> extSubtitle;

        private ExtSubtitleList(Builder builder) {
            this.extSubtitle = builder.extSubtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtSubtitleList create() {
            return builder().build();
        }

        /**
         * @return extSubtitle
         */
        public java.util.List<ExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

        public static final class Builder {
            private java.util.List<ExtSubtitle> extSubtitle; 

            private Builder() {
            } 

            private Builder(ExtSubtitleList model) {
                this.extSubtitle = model.extSubtitle;
            } 

            /**
             * ExtSubtitle.
             */
            public Builder extSubtitle(java.util.List<ExtSubtitle> extSubtitle) {
                this.extSubtitle = extSubtitle;
                return this;
            }

            public ExtSubtitleList build() {
                return new ExtSubtitleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Subtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Map")
        private String map;

        private Subtitle(Builder builder) {
            this.map = builder.map;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitle create() {
            return builder().build();
        }

        /**
         * @return map
         */
        public String getMap() {
            return this.map;
        }

        public static final class Builder {
            private String map; 

            private Builder() {
            } 

            private Builder(Subtitle model) {
                this.map = model.map;
            } 

            /**
             * <p>The audio track. Format: <code>0:{Stream}:{Stream sequence number}</code>, which is <code>0:a:{audio_index}</code>. The value of Stream is a, which indicates an audio stream. The sequence number is the index of the audio stream in the list and starts from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0:a:0</p>
             */
            public Builder map(String map) {
                this.map = map;
                return this;
            }

            public Subtitle build() {
                return new Subtitle(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class SubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private java.util.List<Subtitle> subtitle;

        private SubtitleList(Builder builder) {
            this.subtitle = builder.subtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleList create() {
            return builder().build();
        }

        /**
         * @return subtitle
         */
        public java.util.List<Subtitle> getSubtitle() {
            return this.subtitle;
        }

        public static final class Builder {
            private java.util.List<Subtitle> subtitle; 

            private Builder() {
            } 

            private Builder(SubtitleList model) {
                this.subtitle = model.subtitle;
            } 

            /**
             * Subtitle.
             */
            public Builder subtitle(java.util.List<Subtitle> subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public SubtitleList build() {
                return new SubtitleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class SubtitleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtSubtitleList")
        private ExtSubtitleList extSubtitleList;

        @com.aliyun.core.annotation.NameInMap("SubtitleList")
        private SubtitleList subtitleList;

        private SubtitleConfig(Builder builder) {
            this.extSubtitleList = builder.extSubtitleList;
            this.subtitleList = builder.subtitleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleConfig create() {
            return builder().build();
        }

        /**
         * @return extSubtitleList
         */
        public ExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        /**
         * @return subtitleList
         */
        public SubtitleList getSubtitleList() {
            return this.subtitleList;
        }

        public static final class Builder {
            private ExtSubtitleList extSubtitleList; 
            private SubtitleList subtitleList; 

            private Builder() {
            } 

            private Builder(SubtitleConfig model) {
                this.extSubtitleList = model.extSubtitleList;
                this.subtitleList = model.subtitleList;
            } 

            /**
             * <p>The external subtitles. The value is a JSON array that contains up to <strong>four</strong> objects.</p>
             */
            public Builder extSubtitleList(ExtSubtitleList extSubtitleList) {
                this.extSubtitleList = extSubtitleList;
                return this;
            }

            /**
             * <p>The subtitles.</p>
             */
            public Builder subtitleList(SubtitleList subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            public SubtitleConfig build() {
                return new SubtitleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class SuperReso extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsHalfSample")
        private String isHalfSample;

        private SuperReso(Builder builder) {
            this.isHalfSample = builder.isHalfSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuperReso create() {
            return builder().build();
        }

        /**
         * @return isHalfSample
         */
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

        public static final class Builder {
            private String isHalfSample; 

            private Builder() {
            } 

            private Builder(SuperReso model) {
                this.isHalfSample = model.isHalfSample;
            } 

            /**
             * <p>Indicates whether parameters related to the sampling rate are obtained. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isHalfSample(String isHalfSample) {
                this.isHalfSample = isHalfSample;
                return this;
            }

            public SuperReso build() {
                return new SuperReso(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class TailSlate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgColor")
        private String bgColor;

        @com.aliyun.core.annotation.NameInMap("BlendDuration")
        private String blendDuration;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("IsMergeAudio")
        private Boolean isMergeAudio;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("TailUrl")
        private String tailUrl;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private TailSlate(Builder builder) {
            this.bgColor = builder.bgColor;
            this.blendDuration = builder.blendDuration;
            this.height = builder.height;
            this.isMergeAudio = builder.isMergeAudio;
            this.start = builder.start;
            this.tailUrl = builder.tailUrl;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TailSlate create() {
            return builder().build();
        }

        /**
         * @return bgColor
         */
        public String getBgColor() {
            return this.bgColor;
        }

        /**
         * @return blendDuration
         */
        public String getBlendDuration() {
            return this.blendDuration;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return isMergeAudio
         */
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return tailUrl
         */
        public String getTailUrl() {
            return this.tailUrl;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bgColor; 
            private String blendDuration; 
            private String height; 
            private Boolean isMergeAudio; 
            private String start; 
            private String tailUrl; 
            private String width; 

            private Builder() {
            } 

            private Builder(TailSlate model) {
                this.bgColor = model.bgColor;
                this.blendDuration = model.blendDuration;
                this.height = model.height;
                this.isMergeAudio = model.isMergeAudio;
                this.start = model.start;
                this.tailUrl = model.tailUrl;
                this.width = model.width;
            } 

            /**
             * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: <strong>White</strong>. For more information, see <a href="https://docs-aliyun.cn-hangzhou.oss.aliyun-inc.com/assets/attach/29253/cn_zh/1502784952344/color.txt?spm=a2c4g.11186623.2.63.241240f77qp3Yy&file=color.txt">Background colors</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>White</p>
             */
            public Builder bgColor(String bgColor) {
                this.bgColor = bgColor;
                return this;
            }

            /**
             * <p>The duration of the transition between the main part and the ending part. A fade transition is used: The last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: <strong>0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder blendDuration(String blendDuration) {
                this.blendDuration = blendDuration;
                return this;
            }

            /**
             * <p>The height of the ending part.</p>
             * <ul>
             * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
             * <li>A value of <strong>-1</strong> indicates that the height of the source of the ending part is retained. A value of <strong>full</strong> indicates that the height of the main part is used for the ending part.</li>
             * <li>Default value: -1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Indicates whether the audio content of the ending part is merged. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isMergeAudio(Boolean isMergeAudio) {
                this.isMergeAudio = isMergeAudio;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The OSS URL of the ending part.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv</a></p>
             */
            public Builder tailUrl(String tailUrl) {
                this.tailUrl = tailUrl;
                return this;
            }

            /**
             * <p>The width of the ending part.</p>
             * <ul>
             * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
             * <li>A value of <strong>-1</strong> indicates that the width of the source of the ending part is retained. A value of <strong>full</strong> indicates that the width of the main part is used for the ending part.</li>
             * <li>Default value: -1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public TailSlate build() {
                return new TailSlate(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class TailSlateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TailSlate")
        private java.util.List<TailSlate> tailSlate;

        private TailSlateList(Builder builder) {
            this.tailSlate = builder.tailSlate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TailSlateList create() {
            return builder().build();
        }

        /**
         * @return tailSlate
         */
        public java.util.List<TailSlate> getTailSlate() {
            return this.tailSlate;
        }

        public static final class Builder {
            private java.util.List<TailSlate> tailSlate; 

            private Builder() {
            } 

            private Builder(TailSlateList model) {
                this.tailSlate = model.tailSlate;
            } 

            /**
             * TailSlate.
             */
            public Builder tailSlate(java.util.List<TailSlate> tailSlate) {
                this.tailSlate = tailSlate;
                return this;
            }

            public TailSlateList build() {
                return new TailSlateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class TransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckReso")
        private String isCheckReso;

        @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.adjDarMethod = builder.adjDarMethod;
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return adjDarMethod
         */
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String adjDarMethod; 
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            private Builder() {
            } 

            private Builder(TransConfig model) {
                this.adjDarMethod = model.adjDarMethod;
                this.isCheckAudioBitrate = model.isCheckAudioBitrate;
                this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
                this.isCheckReso = model.isCheckReso;
                this.isCheckResoFail = model.isCheckResoFail;
                this.isCheckVideoBitrate = model.isCheckVideoBitrate;
                this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
                this.transMode = model.transMode;
            } 

            /**
             * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
             * <ul>
             * <li>rescale: The video image is resized.</li>
             * <li>crop: The video image is cropped.</li>
             * <li>pad: The video image is scaled out to fill the view.</li>
             * <li>none: The resolution is not adjusted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>crop</p>
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input bitrate is retained and the specified audio bitrate does not take effect. This parameter has a lower priority than IsCheckAudioBitrateFail. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * <li><p>Default value:</p>
             * <ul>
             * <li>If this parameter is empty and the codec of the output audio is different from the codec of the input audio, the default value is false.</li>
             * <li>If this parameter is empty and the codec of the output audio is the same as the codec of the input audio, the default value is true.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate is checked. This parameter has a higher priority than <strong>IsCheckAudioBitrate</strong>. If the bitrate of the output audio is higher than that of the input audio, a transcoding failure is returned without transcoding the audio. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is checked. This parameter has a higher priority than IsCheckReso. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned without transcoding the video. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input bitrate is retained. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, a transcoding failure is returned without transcoding the video. This parameter has a higher priority than<strong>IsCheckVideoBitrate</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * <p>The transcoding mode. Valid values:</p>
             * <ul>
             * <li><strong>onepass</strong>: transcoding based on one-pass algorithms, which has higher accuracy.</li>
             * <li><strong>twopass</strong>: transcoding based on two-pass algorithms, which has lower accuracy.</li>
             * <li><strong>CBR</strong>: transcoding based on a fixed bitrate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>onepass</p>
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public TransConfig build() {
                return new TransConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class BitrateBnd extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private String min;

        private BitrateBnd(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BitrateBnd create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        public static final class Builder {
            private String max; 
            private String min; 

            private Builder() {
            } 

            private Builder(BitrateBnd model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            public BitrateBnd build() {
                return new BitrateBnd(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("BitrateBnd")
        private BitrateBnd bitrateBnd;

        @com.aliyun.core.annotation.NameInMap("Bufsize")
        private String bufsize;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Crf")
        private String crf;

        @com.aliyun.core.annotation.NameInMap("Crop")
        private String crop;

        @com.aliyun.core.annotation.NameInMap("Degrain")
        private String degrain;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MaxFps")
        private String maxFps;

        @com.aliyun.core.annotation.NameInMap("Maxrate")
        private String maxrate;

        @com.aliyun.core.annotation.NameInMap("Pad")
        private String pad;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Qscale")
        private String qscale;

        @com.aliyun.core.annotation.NameInMap("ResoPriority")
        private String resoPriority;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bitrateBnd = builder.bitrateBnd;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.crop = builder.crop;
            this.degrain = builder.degrain;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.maxFps = builder.maxFps;
            this.maxrate = builder.maxrate;
            this.pad = builder.pad;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.resoPriority = builder.resoPriority;
            this.scanMode = builder.scanMode;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bitrateBnd
         */
        public BitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        /**
         * @return bufsize
         */
        public String getBufsize() {
            return this.bufsize;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return crf
         */
        public String getCrf() {
            return this.crf;
        }

        /**
         * @return crop
         */
        public String getCrop() {
            return this.crop;
        }

        /**
         * @return degrain
         */
        public String getDegrain() {
            return this.degrain;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return maxFps
         */
        public String getMaxFps() {
            return this.maxFps;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return pad
         */
        public String getPad() {
            return this.pad;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return resoPriority
         */
        public String getResoPriority() {
            return this.resoPriority;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private BitrateBnd bitrateBnd; 
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String crop; 
            private String degrain; 
            private String fps; 
            private String gop; 
            private String height; 
            private String maxFps; 
            private String maxrate; 
            private String pad; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String qscale; 
            private String resoPriority; 
            private String scanMode; 
            private String width; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.bitrate = model.bitrate;
                this.bitrateBnd = model.bitrateBnd;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.crop = model.crop;
                this.degrain = model.degrain;
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.maxFps = model.maxFps;
                this.maxrate = model.maxrate;
                this.pad = model.pad;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.qscale = model.qscale;
                this.resoPriority = model.resoPriority;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * <p>The bitrate of the output video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The average bitrate range of the video.</p>
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * <p>The size of the buffer.</p>
             * <ul>
             * <li>Unit: KB.</li>
             * <li>Default value: <strong>6000</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * <p>The video codec.</p>
             * <ul>
             * <li>Valid values: <strong>H.264</strong>, <strong>H.265</strong>, <strong>GIF</strong>, and <strong>WEBP</strong>.</li>
             * <li>Default value: <strong>H.264</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The constant rate factor.</p>
             * <ul>
             * <li>If <strong>Crf</strong> is returned, the value of <strong>Bitrate</strong> is invalid.</li>
             * <li>Default value if the value of Codec is H.264: <strong>23</strong>. Default value if the value of Codec is H.265: <strong>26</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The method of video cropping. Valid values:</p>
             * <ul>
             * <li><strong>border</strong>: Black borders are automatically detected and removed.</li>
             * <li>A value in the format of width:height:left:top: The video is cropped based on the custom settings.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280:800:0:140</p>
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * <p>The strength of the independent noise reduction algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * <ul>
             * <li>Unit: frames per second.</li>
             * <li>Valid values: 0 to 60. The value is 60 if the frame rate of the input file exceeds 60.</li>
             * <li>Default value: the frame rate of the input file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The maximum interval between keyframes or the maximum number of frames in a frame group. Unit: seconds.</p>
             * <ul>
             * <li>Default value: 10.</li>
             * <li>If the maximum number of frames is returned, the value does not have a unit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The height of the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Default value: the height of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The maximum frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The black borders that are added to the video.</p>
             * <ul>
             * <li>The value is in the width:height:left:top format.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280:800:0:140</p>
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * <p>The pixel format of the video.</p>
             * <ul>
             * <li><p>The default pixel format can be <strong>yuv420p</strong> or the pixel format of the input file.</p>
             * </li>
             * <li><p>Valid values: standard pixel formats such as <strong>yuv420p</strong> and <strong>yuvj420p</strong>.</p>
             * <p>**</p>
             * <p><strong>Note</strong> If a non-standard pixel format such as yuvj420p(pc, bt470bg/bt470bg/smpte170m) is used, compatibility with the pixel format must be configured. Otherwise, the transcoding job fails.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yuvj420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The preset video algorithm. Default value: <strong>medium</strong>. Valid values:</p>
             * <ul>
             * <li><strong>veryfast</strong></li>
             * <li><strong>fast</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>slow</strong></li>
             * <li><strong>slower</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>veryfast</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * <p>The encoding profile. This parameter is returned only for the H.264 codec. Default value: <strong>high</strong>. Valid values:</p>
             * <blockquote>
             * <p> If multiple definitions are involved, we recommend that you use baseline for the lowest definition to ensure normal playback on low-definition devices, and use main or high for other definitions.</p>
             * </blockquote>
             * <ul>
             * <li><strong>baseline</strong>: applicable to mobile devices.</li>
             * <li><strong>main</strong>: applicable to standard-definition devices.</li>
             * <li><strong>high</strong>: applicable to high-definition devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>baseline</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The level of quality control on the video.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * <p>The priority of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resoPriority(String resoPriority) {
                this.resoPriority = resoPriority;
                return this;
            }

            /**
             * <p>The scan mode. Valid values:</p>
             * <ul>
             * <li>If this parameter is <strong>empty</strong>, the scan mode of the input file is used.</li>
             * <li><strong>auto</strong>: automatic deinterlacing.</li>
             * <li><strong>progressive</strong>: progressive scan.</li>
             * <li><strong>interlaced</strong>: interlaced scan.</li>
             * <li><strong>By default</strong>, this parameter is empty.</li>
             * </ul>
             * <p><strong>Best practice</strong>: Interlaced scan consumes less bandwidth than progressive scan, but the image quality is poor. Therefore, mainstream video production uses progressive scan.</p>
             * <ul>
             * <li>If <strong>progressive scan</strong> or <strong>interlaced scan</strong> is used when the scan mode of the input file is neither of them, the transcoding job fails.</li>
             * <li>We recommend that you use <strong>the scan mode of the input file</strong> or <strong>automatic deinterlacing</strong> to improve compatibility.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>interlaced</p>
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * <p>The width of the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Default value: <strong>the width of the input video</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class WaterMarkInputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private WaterMarkInputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkInputFile create() {
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

            private Builder() {
            } 

            private Builder(WaterMarkInputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-logo-****.png</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public WaterMarkInputFile build() {
                return new WaterMarkInputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class WaterMark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private WaterMarkInputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WaterMarkTemplateId")
        private String waterMarkTemplateId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private WaterMark(Builder builder) {
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.height = builder.height;
            this.inputFile = builder.inputFile;
            this.referPos = builder.referPos;
            this.type = builder.type;
            this.waterMarkTemplateId = builder.waterMarkTemplateId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMark create() {
            return builder().build();
        }

        /**
         * @return dx
         */
        public String getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public String getDy() {
            return this.dy;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return inputFile
         */
        public WaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return waterMarkTemplateId
         */
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String dx; 
            private String dy; 
            private String height; 
            private WaterMarkInputFile inputFile; 
            private String referPos; 
            private String type; 
            private String waterMarkTemplateId; 
            private String width; 

            private Builder() {
            } 

            private Builder(WaterMark model) {
                this.dx = model.dx;
                this.dy = model.dy;
                this.height = model.height;
                this.inputFile = model.inputFile;
                this.referPos = model.referPos;
                this.type = model.type;
                this.waterMarkTemplateId = model.waterMarkTemplateId;
                this.width = model.width;
            } 

            /**
             * <p>The horizontal offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Default value: 0. The value can be an integer or a decimal number.</p>
             * <ul>
             * <li><p>An integer indicates the pixel value of the horizontal offset.</p>
             * <ul>
             * <li>Valid values: <strong>[8,4096]</strong>.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * </li>
             * <li><p>A decimal number indicates the ratio of the horizontal offset to the width in the output video resolution.</p>
             * <ul>
             * <li>Valid values: (0,1).</li>
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The vertical offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
             * <ul>
             * <li><p>An integer indicates the pixel value of the vertical offset.</p>
             * <ul>
             * <li>Valid values: <strong>[8,4096]</strong>.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * </li>
             * <li><p>A decimal number indicates the ratio of the vertical offset to the height in the output video resolution.</p>
             * <ul>
             * <li>Valid values: <strong>(0,1)</strong>.</li>
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
             * <ul>
             * <li><p>An integer indicates the pixel value of the watermark height.</p>
             * <ul>
             * <li>Valid values: <strong>[8,4096]</strong>.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * </li>
             * <li><p>A decimal number indicates the ratio of the watermark height to the height in the output video resolution.</p>
             * <ul>
             * <li>Valid values: <strong>(0,1)</strong>.</li>
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The watermark input file. PNG images and MOV files are supported.</p>
             */
            public Builder inputFile(WaterMarkInputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The position of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
             * <ul>
             * <li><strong>TopRight</strong></li>
             * <li><strong>TopLeft</strong></li>
             * <li><strong>BottomRight</strong></li>
             * <li><strong>BottomLeft</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TopRight</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The type of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>. Valid values:</p>
             * <ul>
             * <li><strong>Image</strong></li>
             * <li><strong>Text</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the watermark template.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder waterMarkTemplateId(String waterMarkTemplateId) {
                this.waterMarkTemplateId = waterMarkTemplateId;
                return this;
            }

            /**
             * <p>The width of the watermark image. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
             * <ul>
             * <li><p>An integer indicates the pixel value of the watermark width.</p>
             * <ul>
             * <li>Valid values: <strong>[8,4096]</strong>.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             * </li>
             * <li><p>A decimal number indicates the ratio of the watermark width to the width in the output video resolution.</p>
             * <ul>
             * <li>Valid values: <strong>(0,1)</strong>.</li>
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public WaterMark build() {
                return new WaterMark(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class WaterMarkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WaterMark")
        private java.util.List<WaterMark> waterMark;

        private WaterMarkList(Builder builder) {
            this.waterMark = builder.waterMark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkList create() {
            return builder().build();
        }

        /**
         * @return waterMark
         */
        public java.util.List<WaterMark> getWaterMark() {
            return this.waterMark;
        }

        public static final class Builder {
            private java.util.List<WaterMark> waterMark; 

            private Builder() {
            } 

            private Builder(WaterMarkList model) {
                this.waterMark = model.waterMark;
            } 

            /**
             * WaterMark.
             */
            public Builder waterMark(java.util.List<WaterMark> waterMark) {
                this.waterMark = waterMark;
                return this;
            }

            public WaterMarkList build() {
                return new WaterMarkList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmixList")
        private AmixList amixList;

        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("AudioStreamMap")
        private String audioStreamMap;

        @com.aliyun.core.annotation.NameInMap("Clip")
        private Clip clip;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("DeWatermark")
        private String deWatermark;

        @com.aliyun.core.annotation.NameInMap("DigiWaterMark")
        private DigiWaterMark digiWaterMark;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("M3U8NonStandardSupport")
        private M3U8NonStandardSupport m3U8NonStandardSupport;

        @com.aliyun.core.annotation.NameInMap("MergeConfigUrl")
        private String mergeConfigUrl;

        @com.aliyun.core.annotation.NameInMap("MergeList")
        private MergeList mergeList;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("OpeningList")
        private OpeningList openingList;

        @com.aliyun.core.annotation.NameInMap("OutSubtitleList")
        private OutSubtitleList outSubtitleList;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private OutputFile outputFile;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("Rotate")
        private String rotate;

        @com.aliyun.core.annotation.NameInMap("SubtitleConfig")
        private SubtitleConfig subtitleConfig;

        @com.aliyun.core.annotation.NameInMap("SuperReso")
        private SuperReso superReso;

        @com.aliyun.core.annotation.NameInMap("TailSlateList")
        private TailSlateList tailSlateList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private TransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        @com.aliyun.core.annotation.NameInMap("VideoStreamMap")
        private String videoStreamMap;

        @com.aliyun.core.annotation.NameInMap("WaterMarkConfigUrl")
        private String waterMarkConfigUrl;

        @com.aliyun.core.annotation.NameInMap("WaterMarkList")
        private WaterMarkList waterMarkList;

        private Output(Builder builder) {
            this.amixList = builder.amixList;
            this.audio = builder.audio;
            this.audioStreamMap = builder.audioStreamMap;
            this.clip = builder.clip;
            this.container = builder.container;
            this.deWatermark = builder.deWatermark;
            this.digiWaterMark = builder.digiWaterMark;
            this.encryption = builder.encryption;
            this.m3U8NonStandardSupport = builder.m3U8NonStandardSupport;
            this.mergeConfigUrl = builder.mergeConfigUrl;
            this.mergeList = builder.mergeList;
            this.muxConfig = builder.muxConfig;
            this.openingList = builder.openingList;
            this.outSubtitleList = builder.outSubtitleList;
            this.outputFile = builder.outputFile;
            this.priority = builder.priority;
            this.properties = builder.properties;
            this.rotate = builder.rotate;
            this.subtitleConfig = builder.subtitleConfig;
            this.superReso = builder.superReso;
            this.tailSlateList = builder.tailSlateList;
            this.templateId = builder.templateId;
            this.transConfig = builder.transConfig;
            this.userData = builder.userData;
            this.video = builder.video;
            this.videoStreamMap = builder.videoStreamMap;
            this.waterMarkConfigUrl = builder.waterMarkConfigUrl;
            this.waterMarkList = builder.waterMarkList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return amixList
         */
        public AmixList getAmixList() {
            return this.amixList;
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return audioStreamMap
         */
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        /**
         * @return clip
         */
        public Clip getClip() {
            return this.clip;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return deWatermark
         */
        public String getDeWatermark() {
            return this.deWatermark;
        }

        /**
         * @return digiWaterMark
         */
        public DigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return m3U8NonStandardSupport
         */
        public M3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        /**
         * @return mergeConfigUrl
         */
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        /**
         * @return mergeList
         */
        public MergeList getMergeList() {
            return this.mergeList;
        }

        /**
         * @return muxConfig
         */
        public MuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return openingList
         */
        public OpeningList getOpeningList() {
            return this.openingList;
        }

        /**
         * @return outSubtitleList
         */
        public OutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return subtitleConfig
         */
        public SubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        /**
         * @return superReso
         */
        public SuperReso getSuperReso() {
            return this.superReso;
        }

        /**
         * @return tailSlateList
         */
        public TailSlateList getTailSlateList() {
            return this.tailSlateList;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        /**
         * @return videoStreamMap
         */
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        /**
         * @return waterMarkConfigUrl
         */
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        /**
         * @return waterMarkList
         */
        public WaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public static final class Builder {
            private AmixList amixList; 
            private Audio audio; 
            private String audioStreamMap; 
            private Clip clip; 
            private Container container; 
            private String deWatermark; 
            private DigiWaterMark digiWaterMark; 
            private Encryption encryption; 
            private M3U8NonStandardSupport m3U8NonStandardSupport; 
            private String mergeConfigUrl; 
            private MergeList mergeList; 
            private MuxConfig muxConfig; 
            private OpeningList openingList; 
            private OutSubtitleList outSubtitleList; 
            private OutputFile outputFile; 
            private String priority; 
            private Properties properties; 
            private String rotate; 
            private SubtitleConfig subtitleConfig; 
            private SuperReso superReso; 
            private TailSlateList tailSlateList; 
            private String templateId; 
            private TransConfig transConfig; 
            private String userData; 
            private Video video; 
            private String videoStreamMap; 
            private String waterMarkConfigUrl; 
            private WaterMarkList waterMarkList; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.amixList = model.amixList;
                this.audio = model.audio;
                this.audioStreamMap = model.audioStreamMap;
                this.clip = model.clip;
                this.container = model.container;
                this.deWatermark = model.deWatermark;
                this.digiWaterMark = model.digiWaterMark;
                this.encryption = model.encryption;
                this.m3U8NonStandardSupport = model.m3U8NonStandardSupport;
                this.mergeConfigUrl = model.mergeConfigUrl;
                this.mergeList = model.mergeList;
                this.muxConfig = model.muxConfig;
                this.openingList = model.openingList;
                this.outSubtitleList = model.outSubtitleList;
                this.outputFile = model.outputFile;
                this.priority = model.priority;
                this.properties = model.properties;
                this.rotate = model.rotate;
                this.subtitleConfig = model.subtitleConfig;
                this.superReso = model.superReso;
                this.tailSlateList = model.tailSlateList;
                this.templateId = model.templateId;
                this.transConfig = model.transConfig;
                this.userData = model.userData;
                this.video = model.video;
                this.videoStreamMap = model.videoStreamMap;
                this.waterMarkConfigUrl = model.waterMarkConfigUrl;
                this.waterMarkList = model.waterMarkList;
            } 

            /**
             * <p>The audio tracks that are mixed.</p>
             */
            public Builder amixList(AmixList amixList) {
                this.amixList = amixList;
                return this;
            }

            /**
             * <p>The audio configurations.</p>
             * <blockquote>
             * <p> If this parameter is specified in the request, the corresponding configurations in the specified transcoding template are overwritten.</p>
             * </blockquote>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The sequence number of the audio stream.</p>
             * <ul>
             * <li>Format: 0:a:{Sequence number}. Example: 0:a:0.</li>
             * <li>The sequence number is the index of the audio stream in the list and starts from 0.</li>
             * <li>If no sequence number is specified, the default audio stream is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:a:0</p>
             */
            public Builder audioStreamMap(String audioStreamMap) {
                this.audioStreamMap = audioStreamMap;
                return this;
            }

            /**
             * <p>The information about the clip.</p>
             */
            public Builder clip(Clip clip) {
                this.clip = clip;
                return this;
            }

            /**
             * <p>The container format configurations.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The configurations of watermark blurring. The value is a JSON object. For more information, see the <strong>DeWatermark</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;0&quot;: [{&quot;l&quot;: 10,&quot;t&quot;: 10,&quot;w&quot;: 10,&quot;h&quot;: 10},{&quot;l&quot;: 100,&quot;t&quot;: 0.1,&quot;w&quot;: 10,&quot;h&quot;: 10}],&quot;128000&quot;: [],&quot;250000&quot;: [{&quot;l&quot;: 0.2,&quot;t&quot;: 0.1,&quot;w&quot;: 0.01,&quot;h&quot;: 0.05}]}</p>
             */
            public Builder deWatermark(String deWatermark) {
                this.deWatermark = deWatermark;
                return this;
            }

            /**
             * <p>The digital watermarks.</p>
             */
            public Builder digiWaterMark(DigiWaterMark digiWaterMark) {
                this.digiWaterMark = digiWaterMark;
                return this;
            }

            /**
             * <p>The encryption configurations. Only outputs in the M3U8 format are supported.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The non-standard support configuration for M3U8. The value is a JSON object. For more information, see the <strong>M3U8NonStandardSupport</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
             */
            public Builder m3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
                this.m3U8NonStandardSupport = m3U8NonStandardSupport;
                return this;
            }

            /**
             * <p>The URL of the merging configuration file. Only one of <strong>MergeList</strong> and <strong>MergeConfigUrl</strong> takes effect.</p>
             * <ul>
             * <li>The configuration file specified by MergeConfigUrl can contain up to 50 clips.</li>
             * <li>MergeConfigUrl indicates the URL of the configuration file for merging clips.</li>
             * <li>Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</li>
             * <li>Example of the content of the merging configuration file: <code>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>`{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;<a href="http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4%22%7D%5D%7D">http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</a></p>
             */
            public Builder mergeConfigUrl(String mergeConfigUrl) {
                this.mergeConfigUrl = mergeConfigUrl;
                return this;
            }

            /**
             * <p>The configurations for merging clips.</p>
             */
            public Builder mergeList(MergeList mergeList) {
                this.mergeList = mergeList;
                return this;
            }

            /**
             * <p>The transmuxing configurations. If this parameter is specified in the request, the corresponding configurations in the specified transcoding template are overwritten.</p>
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * <p>The opening parts. The value is a JSON object.</p>
             */
            public Builder openingList(OpeningList openingList) {
                this.openingList = openingList;
                return this;
            }

            /**
             * <p>The output subtitles.</p>
             */
            public Builder outSubtitleList(OutSubtitleList outSubtitleList) {
                this.outSubtitleList = outSubtitleList;
                return this;
            }

            /**
             * <p>The details of the output file.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>The priority of the job in the MPS queue to which the job is added.</p>
             * <ul>
             * <li>A value of <strong>10</strong> indicates the highest priority.</li>
             * <li>Default value: <strong>6</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The media properties.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The rotation angle of the video, in the clockwise direction.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The subtitle configurations.</p>
             */
            public Builder subtitleConfig(SubtitleConfig subtitleConfig) {
                this.subtitleConfig = subtitleConfig;
                return this;
            }

            /**
             * <p>The configurations for using the resolution of the source video.</p>
             */
            public Builder superReso(SuperReso superReso) {
                this.superReso = superReso;
                return this;
            }

            /**
             * <p>The ending parts. The value is a JSON object.</p>
             */
            public Builder tailSlateList(TailSlateList tailSlateList) {
                this.tailSlateList = tailSlateList;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000000-000010</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The general transcoding configurations.</p>
             * <blockquote>
             * <p> If this parameter is specified in the request, the corresponding parameter in the specified transcoding template are overwritten.</p>
             * </blockquote>
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>example data</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The video configurations.</p>
             * <blockquote>
             * <p> If this parameter is specified, <strong>AliyunVideoCodec</strong> in the template specified by <strong>TemplateId</strong> is overwritten.</p>
             * </blockquote>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            /**
             * <p>The sequence number of the video stream.</p>
             * <ul>
             * <li>Format: 0:a:{Sequence number}. Example: 0:a:0.</li>
             * <li>The sequence number is the index of the video stream in the list and starts from 0.</li>
             * <li>If no sequence number is specified, the default video stream is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:a:0</p>
             */
            public Builder videoStreamMap(String videoStreamMap) {
                this.videoStreamMap = videoStreamMap;
                return this;
            }

            /**
             * <p>The URL of the watermark configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/configure">http://example.com/configure</a></p>
             */
            public Builder waterMarkConfigUrl(String waterMarkConfigUrl) {
                this.waterMarkConfigUrl = waterMarkConfigUrl;
                return this;
            }

            /**
             * <p>The watermarks.</p>
             * <blockquote>
             * <p> If watermarks are truncated or fail to be generated, check whether the text watermarks that you add contain special characters. If the text watermarks contain special characters, you must escape the special characters before you add the watermarks. Alternatively, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12246746.top-nav.dticket.68797bbcm8H408#/ticket/add/?productId=1232">submit a ticket</a> to contact Alibaba Cloud customer service for compatibility processing.</p>
             * </blockquote>
             */
            public Builder waterMarkList(WaterMarkList waterMarkList) {
                this.waterMarkList = waterMarkList;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Long percent;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Job(Builder builder) {
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.output = builder.output;
            this.percent = builder.percent;
            this.pipelineId = builder.pipelineId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
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
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return percent
         */
        public Long getPercent() {
            return this.percent;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String code; 
            private String creationTime; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private Output output; 
            private Long percent; 
            private String pipelineId; 
            private String state; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.code = model.code;
                this.creationTime = model.creationTime;
                this.finishTime = model.finishTime;
                this.input = model.input;
                this.jobId = model.jobId;
                this.MNSMessageResult = model.MNSMessageResult;
                this.message = model.message;
                this.output = model.output;
                this.percent = model.percent;
                this.pipelineId = model.pipelineId;
                this.state = model.state;
            } 

            /**
             * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InternalError</p>
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
             * <p>The time when the job was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-01-10T12:20:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>31fa3c9ca8134f9cec2b4b0b0f78****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The message sent by MNS to notify users of the job result.</p>
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The operation has failed due to some unknown error, exception or failure.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The output of the job.</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The transcoding progress.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a126797</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The state of the job. Valid values:</p>
             * <ul>
             * <li><strong>Submitted</strong></li>
             * <li><strong>TranscodeFail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Submitted</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Job")
        private Job job;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private JobResult(Builder builder) {
            this.code = builder.code;
            this.job = builder.job;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return job
         */
        public Job getJob() {
            return this.job;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private Job job; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.code = model.code;
                this.job = model.job;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * <p>The error code returned if the job failed to be created. This parameter is not returned if the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.NullValue</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The details of the job. If the job fails to be submitted, no job ID is generated.</p>
             */
            public Builder job(Job job) {
                this.job = job;
                return this;
            }

            /**
             * <p>The error message returned if the job failed to be created. This parameter is not returned if the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified parameter &quot;%s&quot; cannot be null.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the job was successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitJobsResponseBody</p>
     */
    public static class JobResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobResult")
        private java.util.List<JobResult> jobResult;

        private JobResultList(Builder builder) {
            this.jobResult = builder.jobResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResultList create() {
            return builder().build();
        }

        /**
         * @return jobResult
         */
        public java.util.List<JobResult> getJobResult() {
            return this.jobResult;
        }

        public static final class Builder {
            private java.util.List<JobResult> jobResult; 

            private Builder() {
            } 

            private Builder(JobResultList model) {
                this.jobResult = model.jobResult;
            } 

            /**
             * JobResult.
             */
            public Builder jobResult(java.util.List<JobResult> jobResult) {
                this.jobResult = jobResult;
                return this;
            }

            public JobResultList build() {
                return new JobResultList(this);
            } 

        } 

    }
}
