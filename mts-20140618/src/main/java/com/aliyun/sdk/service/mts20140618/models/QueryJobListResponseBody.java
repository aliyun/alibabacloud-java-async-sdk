// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryJobListResponseBody</p>
 */
public class QueryJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private JobList jobList;

    @com.aliyun.core.annotation.NameInMap("NonExistJobIds")
    private NonExistJobIds nonExistJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryJobListResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.nonExistJobIds = builder.nonExistJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobList
     */
    public JobList getJobList() {
        return this.jobList;
    }

    /**
     * @return nonExistJobIds
     */
    public NonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobList jobList; 
        private NonExistJobIds nonExistJobIds; 
        private String requestId; 

        /**
         * <p>The transcoding jobs.</p>
         */
        public Builder jobList(JobList jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * <p>The list of nonexistent job IDs. If all queried job IDs exist, the response does not contain this parameter.</p>
         */
        public Builder nonExistJobIds(NonExistJobIds nonExistJobIds) {
            this.nonExistJobIds = nonExistJobIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>197ADF44-104C-514C-9F92-D8924CB34E2A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryJobListResponseBody build() {
            return new QueryJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the input file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>video_01.mp4</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The resource operated “%s” cannot be found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the message returned if the job was successful.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The volume adjustment range. Default value: -20. Unit: dB.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <li>Valid values: 1, 2, 3, 4, 5, 6, 7, and 8.</li>
             * <li>Default value: <strong>2</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec.</p>
             * <ul>
             * <li>Valid values: aac, mp3, vorbis, and flac.</li>
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
             * <p>The codec profile of the audio. Valid values when the value of Codec is aac: aaclow, aache, aachev2, aacld, and aaceld.</p>
             * 
             * <strong>example:</strong>
             * <p>aaclow</p>
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
             * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
             * <li>Unit: Hz.</li>
             * <li>Default value: 44100.</li>
             * </ul>
             * <blockquote>
             * <p> If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The duration of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code>.</li>
             * <li>Example: 01:00:59.999.</li>
             * </ul>
             * <p>Or</p>
             * <ul>
             * <li>Format: <code>sssss[.SSS]</code>.</li>
             * <li>Example: 32000.23.</li>
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
             * <p>The point in time when the clip starts.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code>.</li>
             * <li>Example: 01:59:59.999.</li>
             * </ul>
             * <p>Or</p>
             * <ul>
             * <li>Format: <code>sssss[.SSS]</code>.</li>
             * <li>Example: 32000.23.</li>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The container format.</p>
             * <ul>
             * <li>Default value: mp4.</li>
             * <li>Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).</li>
             * <li>Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</li>
             * <li>Image formats include GIF and WebP. If the container format is GIF, the video codec must be GIF.</li>
             * <li>If the container format is WebP, the video codec must be WebP.</li>
             * <li>If the container format is FLV, the video codec cannot be H.265.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The key encryption method. Valid values: Base64 and KMS.</p>
             * <blockquote>
             * <p> For example, if the key is <code>encryptionkey128</code>, the key can be encrypted as <code>Base64(&quot;encryptionkey128&quot;)</code> or <code>KMS(Base64(&quot;encryptionkey128&quot;)</code> depending on the encryption method used.</p>
             * </blockquote>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>Indicates whether the output of the MD5 value of the TS file is supported in the M3U8 file. Valid values:</p>
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
             * <p>Indicates whether the output of the size of the TS file is supported in the M3U8 file. Valid values:</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The non-standard support configurations for TS files. The value is a JSON object. For more information, see the TS section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The duration of the clip.</p>
             * <ul>
             * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
             * <li>Examples: 01:59:59.999 and 32000.23.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>01:59:59.999</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The OSS URL of the clip.</p>
             * <ul>
             * <li>Example: <code>http://example-bucket-.oss-cn-hangzhou.aliyuncs.com/example-object.flv</code>.</li>
             * <li>The object must be URL-encoded by using the UTF-8 standard. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-hangzhou.aliyuncs.com/example-object.flv">http://example-bucket.oss-cn-hangzhou.aliyuncs.com/example-object.flv</a></p>
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
             * <p>01:59:59.999</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class MergeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Merge")
        private java.util.List < Merge> merge;

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
        public java.util.List < Merge> getMerge() {
            return this.merge;
        }

        public static final class Builder {
            private java.util.List < Merge> merge; 

            /**
             * Merge.
             */
            public Builder merge(java.util.List < Merge> merge) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class MultiSpeedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DowngradePolicy")
        private String downgradePolicy;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RealSpeed")
        private Double realSpeed;

        @com.aliyun.core.annotation.NameInMap("SettingSpeed")
        private Integer settingSpeed;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private Double timeCost;

        private MultiSpeedInfo(Builder builder) {
            this.code = builder.code;
            this.downgradePolicy = builder.downgradePolicy;
            this.duration = builder.duration;
            this.enable = builder.enable;
            this.message = builder.message;
            this.realSpeed = builder.realSpeed;
            this.settingSpeed = builder.settingSpeed;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiSpeedInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return downgradePolicy
         */
        public String getDowngradePolicy() {
            return this.downgradePolicy;
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return realSpeed
         */
        public Double getRealSpeed() {
            return this.realSpeed;
        }

        /**
         * @return settingSpeed
         */
        public Integer getSettingSpeed() {
            return this.settingSpeed;
        }

        /**
         * @return timeCost
         */
        public Double getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String code; 
            private String downgradePolicy; 
            private Double duration; 
            private String enable; 
            private String message; 
            private Double realSpeed; 
            private Integer settingSpeed; 
            private Double timeCost; 

            /**
             * <p>The error code returned if high-speed transcoding is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Boost.NotNeedSpeed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The downgrade policy if high-speed transcoding is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>NormalSpeed</p>
             */
            public Builder downgradePolicy(String downgradePolicy) {
                this.downgradePolicy = downgradePolicy;
                return this;
            }

            /**
             * <p>The duration of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>21.0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether high-speed transcoding is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The error message returned if high-speed transcoding is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The actual transcoding speed.</p>
             * 
             * <strong>example:</strong>
             * <p>6.576886940181647</p>
             */
            public Builder realSpeed(Double realSpeed) {
                this.realSpeed = realSpeed;
                return this;
            }

            /**
             * <p>The speed setting.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder settingSpeed(Integer settingSpeed) {
                this.settingSpeed = settingSpeed;
                return this;
            }

            /**
             * <p>The amount of time consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>3.193</p>
             */
            public Builder timeCost(Double timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public MultiSpeedInfo build() {
                return new MultiSpeedInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The segment length. Unit: seconds.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The transmuxing configurations for GIF.</p>
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * <p>The segment configurations. The value is a JSON object.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The height of the opening part.</p>
             * <ul>
             * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
             * <li>A value of -1 indicates that the original height of the opening part is retained.</li>
             * <li>A value of full indicates that the height of the opening part equals the height of the main part.</li>
             * <li>Default value: <strong>-1</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The amount of time after which the opening part is played.</p>
             * <ul>
             * <li>The value starts from 0.</li>
             * <li>Unit: seconds.</li>
             * <li>Default value: <strong>0</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The width of the opening part.</p>
             * <ul>
             * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
             * <li>A value of -1 indicates that the original width of the opening part is retained.</li>
             * <li>A value of full indicates that the width of the opening part equals the width of the main part.</li>
             * <li>Default value: <strong>-1</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The OSS URL of the opening part.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.oss-cn-shanghai.aliyuncs.com/t5.mp4">http://example.oss-cn-shanghai.aliyuncs.com/t5.mp4</a></p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class OpeningList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Opening")
        private java.util.List < Opening> opening;

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
        public java.util.List < Opening> getOpening() {
            return this.opening;
        }

        public static final class Builder {
            private java.util.List < Opening> opening; 

            /**
             * Opening.
             */
            public Builder opening(java.util.List < Opening> opening) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The name of the OSS bucket in which the output caption is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the output caption resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the output caption.</p>
             * 
             * <strong>example:</strong>
             * <p>example.flv</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The details of the output caption.</p>
             */
            public Builder outSubtitleFile(OutSubtitleFile outSubtitleFile) {
                this.outSubtitleFile = outSubtitleFile;
                return this;
            }

            /**
             * <p>Indicates whether the job was successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The job was successful.</li>
             * <li><strong>false</strong>: The job failed.</li>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class OutSubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutSubtitle")
        private java.util.List < OutSubtitle> outSubtitle;

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
        public java.util.List < OutSubtitle> getOutSubtitle() {
            return this.outSubtitle;
        }

        public static final class Builder {
            private java.util.List < OutSubtitle> outSubtitle; 

            /**
             * OutSubtitle.
             */
            public Builder outSubtitle(java.util.List < OutSubtitle> outSubtitle) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The name of the OSS bucket in which the output file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the output file resides.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The total bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>490.784</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The total duration.</p>
             * 
             * <strong>example:</strong>
             * <p>17.234000</p>
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
             * <p>The size of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>1057273</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>-0.064000</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class SourceLogo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private SourceLogo(Builder builder) {
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceLogo create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String source; 

            /**
             * <p>The keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public SourceLogo build() {
                return new SourceLogo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class SourceLogos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceLogo")
        private java.util.List < SourceLogo> sourceLogo;

        private SourceLogos(Builder builder) {
            this.sourceLogo = builder.sourceLogo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceLogos create() {
            return builder().build();
        }

        /**
         * @return sourceLogo
         */
        public java.util.List < SourceLogo> getSourceLogo() {
            return this.sourceLogo;
        }

        public static final class Builder {
            private java.util.List < SourceLogo> sourceLogo; 

            /**
             * SourceLogo.
             */
            public Builder sourceLogo(java.util.List < SourceLogo> sourceLogo) {
                this.sourceLogo = sourceLogo;
                return this;
            }

            public SourceLogos build() {
                return new SourceLogos(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The bitrate of the audio stream.</p>
             * 
             * <strong>example:</strong>
             * <p>64.136</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The output layout of the sound channels.</p>
             * 
             * <strong>example:</strong>
             * <p>mono</p>
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * <p>The number of sound channels.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>mp4</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The codec time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/32000</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The duration of the audio stream.</p>
             * 
             * <strong>example:</strong>
             * <p>17.223562</p>
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
             * <p>50</p>
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
             * <p>32000</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>0.064000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base of the audio stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1/32000</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The sequence number of the caption stream. The value indicates the position of the caption stream in all caption streams.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the caption stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The average bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("bitsPerRawSample")
        private String bitsPerRawSample;

        @com.aliyun.core.annotation.NameInMap("colorPrimaries")
        private String colorPrimaries;

        @com.aliyun.core.annotation.NameInMap("colorTransfer")
        private String colorTransfer;

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
            this.bitsPerRawSample = builder.bitsPerRawSample;
            this.colorPrimaries = builder.colorPrimaries;
            this.colorTransfer = builder.colorTransfer;
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

        /**
         * @return bitsPerRawSample
         */
        public String getBitsPerRawSample() {
            return this.bitsPerRawSample;
        }

        /**
         * @return colorPrimaries
         */
        public String getColorPrimaries() {
            return this.colorPrimaries;
        }

        /**
         * @return colorTransfer
         */
        public String getColorTransfer() {
            return this.colorTransfer;
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
            private String bitsPerRawSample; 
            private String colorPrimaries; 
            private String colorTransfer; 

            /**
             * <p>The average frame rate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>421.117</p>
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
             * <p>1/60</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The display aspect ratio (DAR) of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>9:16</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>17.233333</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames).</p>
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
             * <p>1280</p>
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
             * <p>31</p>
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
             * <p>30</p>
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
             * <p>The time base of the video stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1/15360</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * <p>The width of the video stream in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The number of binary bits used by each sample or pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder bitsPerRawSample(String bitsPerRawSample) {
                this.bitsPerRawSample = bitsPerRawSample;
                return this;
            }

            /**
             * <p>The primary colors.</p>
             * 
             * <strong>example:</strong>
             * <p>bt709</p>
             */
            public Builder colorPrimaries(String colorPrimaries) {
                this.colorPrimaries = colorPrimaries;
                return this;
            }

            /**
             * <p>The color transfer configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>bt709</p>
             */
            public Builder colorTransfer(String colorTransfer) {
                this.colorTransfer = colorTransfer;
                return this;
            }

            public VideoStream build() {
                return new VideoStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The audio streams.</p>
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The caption streams.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("SourceLogos")
        private SourceLogos sourceLogos;

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
            this.sourceLogos = builder.sourceLogos;
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
         * @return sourceLogos
         */
        public SourceLogos getSourceLogos() {
            return this.sourceLogos;
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
            private SourceLogos sourceLogos; 
            private Streams streams; 
            private String width; 

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>490</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The video duration.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The video format.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>The size of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>1057273</p>
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
             * <p>The frame rate of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The video height.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The non-engine layer keywords.</p>
             */
            public Builder sourceLogos(SourceLogos sourceLogos) {
                this.sourceLogos = sourceLogos;
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
             * <p>The video width.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The name of the OSS bucket in which the input caption file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the input caption file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input caption file.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The character set used by the external caption.</p>
             * <ul>
             * <li>Valid values: UTF-8, GBK, BIG5, and auto.</li>
             * <li>Default value: <strong>auto</strong>.</li>
             * </ul>
             * <blockquote>
             * <p> If the value of CharEnc is auto, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * <p>The font of the hardcoded captions converted from external captions. Default value: SimSum. For more information, see <a href="https://help.aliyun.com/document_detail/59950.html">Fonts</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;WenQuanYi Zen Hei&quot;, &quot;Yuanti SC Regular&quot;, &quot;SimSun&quot;</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The input caption file.</p>
             * <ul>
             * <li>SRT and ASS files are supported. For more information, see the Input section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</li>
             * <li>Example: <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;example.srt&quot;}</code>.</li>
             * </ul>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class ExtSubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtSubtitle")
        private java.util.List < ExtSubtitle> extSubtitle;

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
        public java.util.List < ExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

        public static final class Builder {
            private java.util.List < ExtSubtitle> extSubtitle; 

            /**
             * ExtSubtitle.
             */
            public Builder extSubtitle(java.util.List < ExtSubtitle> extSubtitle) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class SubtitleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private java.util.List < Subtitle> subtitle;

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
        public java.util.List < Subtitle> getSubtitle() {
            return this.subtitle;
        }

        public static final class Builder {
            private java.util.List < Subtitle> subtitle; 

            /**
             * Subtitle.
             */
            public Builder subtitle(java.util.List < Subtitle> subtitle) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The external captions.</p>
             */
            public Builder extSubtitleList(ExtSubtitleList extSubtitleList) {
                this.extSubtitleList = extSubtitleList;
                return this;
            }

            /**
             * <p>The captions.</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: White. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>White</p>
             */
            public Builder bgColor(String bgColor) {
                this.bgColor = bgColor;
                return this;
            }

            /**
             * <p>The duration of the transition between the main part and the ending part. A fade transition is used: The last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder blendDuration(String blendDuration) {
                this.blendDuration = blendDuration;
                return this;
            }

            /**
             * <p>The height of the ending part.</p>
             * <ul>
             * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
             * <li>A value of -1 indicates that the original height of the ending part is retained.</li>
             * <li>A value of full indicates that the height of the ending part equals the height of the main part.</li>
             * <li>Default value: -1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
             * <p>true</p>
             */
            public Builder isMergeAudio(Boolean isMergeAudio) {
                this.isMergeAudio = isMergeAudio;
                return this;
            }

            /**
             * <p>The time when the ending part is played.</p>
             * 
             * <strong>example:</strong>
             * <p>00000.00</p>
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
             * <p>The width of the ending part. Valid values: values in the range of (0,4096), -1, and full.</p>
             * <ul>
             * <li>A value of -1 indicates that the original width of the ending part is retained.</li>
             * <li>A value of full indicates that the width of the ending part equals the width of the main part.</li>
             * <li>Default value: -1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class TailSlateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TailSlate")
        private java.util.List < TailSlate> tailSlate;

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
        public java.util.List < TailSlate> getTailSlate() {
            return this.tailSlate;
        }

        public static final class Builder {
            private java.util.List < TailSlate> tailSlate; 

            /**
             * TailSlate.
             */
            public Builder tailSlate(java.util.List < TailSlate> tailSlate) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values: rescale, crop, pad, and none.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
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
             * <li>If this parameter is empty and the codec of the output audio is different from that of the input audio, the default value is false.</li>
             * <li>If this parameter is empty and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
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
             * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input audio is not transcoded and a transcoding failure is returned. This parameter has a higher priority than IsCheckAudioBitrate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>:</li>
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
             * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned. Valid values:</p>
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
             * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input video is not transcoded and a transcoding failure is returned. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * <li>Default value: <strong>false</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * <p>The transcoding mode.</p>
             * <ul>
             * <li>Valid values: onepass, twopass, and CBR.</li>
             * <li>Default value: <strong>onepass</strong>.</li>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The maximum bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

            /**
             * <p>The average bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
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
             * <p>The buffer size.</p>
             * <ul>
             * <li>Unit: KB.</li>
             * <li>Default value: <strong>6000</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * <p>The video codec.</p>
             * <ul>
             * <li>Valid values: H.264 and H.265.</li>
             * <li>Default value: H.264.</li>
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
             * <li>Default value when the value of Codec is H.264: <strong>23</strong>, default value when the value of Codec is H.265: <strong>26</strong>.</li>
             * <li>If the value of this parameter is returned, the value of Bitrate becomes invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The method of video cropping. Valid values:</p>
             * <ul>
             * <li><strong>border</strong>: automatically detects and removes borders.</li>
             * <li>A value in the width:height:left:top format: The video image is cropped based on custom settings.</li>
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
             * <p>The frame rate of the video.</p>
             * <ul>
             * <li>Unit: frames per second.</li>
             * <li>The value is 60 if the frame rate of the input file exceeds 60.</li>
             * <li>Default value: the frame rate of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The maximum interval between keyframes or the maximum number of frames in a frame group. Unit: seconds.</p>
             * <ul>
             * <li>Default value: <strong>250</strong>.</li>
             * <li>If the maximum number of frames is returned, the value does not contain a unit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>250</p>
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
             * <p>720</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The maximum frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The black bars that are added to the video.</p>
             * <ul>
             * <li>Unit: pixel.</li>
             * <li>Format: width:height:left:top.</li>
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
             * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
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
             * <p>medium</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * <p>The codec profile of the video. Valid values: baseline, main, and high.</p>
             * <blockquote>
             * <p> If multiple definitions are involved, we recommend that you use baseline for the lowest definition to ensure normal playback on low-end devices, and use main or high for other definitions.</p>
             * </blockquote>
             * <ul>
             * <li><strong>baseline</strong>: applicable to mobile devices.</li>
             * <li><strong>main</strong>: applicable to standard-definition devices.</li>
             * <li><strong>high</strong>: applicable to high-definition devices.</li>
             * <li>Default value: <strong>high</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
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
             * <p>The resource priority.</p>
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
             * <li>If this parameter is left <strong>empty</strong>, the scan mode of the input video is used.</li>
             * <li><strong>auto</strong>: automatic deinterlacing.</li>
             * <li><strong>progressive</strong>: progressive scan.</li>
             * <li><strong>interlaced</strong>: interlaced scan.</li>
             * <li><strong>By default</strong>, this parameter is left empty.</li>
             * </ul>
             * <p><strong>Best practice</strong>: The interlaced scan mode saves data traffic than the progressive scan mode but provides poor image quality. Therefore, the progressive scan mode is commonly used in mainstream video production.</p>
             * <ul>
             * <li>If <strong>progressive</strong> or <strong>interlaced</strong> is used when the scan mode of the input video is neither of them, the transcoding job fails.</li>
             * <li>We recommend that you use <strong>the scan mode of the input video</strong> or <strong>automatic deinterlacing</strong> for higher compatibility.</li>
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
             * <li>Default value: the width of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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
             * <p>The OSS region in which the input file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-logo-****.png</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class WaterMark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

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
        public InputFile getInputFile() {
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
            private InputFile inputFile; 
            private String referPos; 
            private String type; 
            private String waterMarkTemplateId; 
            private String width; 

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
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The height of the watermark image. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
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
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The watermark input file. PNG images and MOV files are supported.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The position of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
             * <ul>
             * <li>TopRight</li>
             * <li>TopLeft</li>
             * <li>BottomRight</li>
             * <li>BottomLeft</li>
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
             * <li>Image</li>
             * <li>Text</li>
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
             * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class WaterMarkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WaterMark")
        private java.util.List < WaterMark> waterMark;

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
        public java.util.List < WaterMark> getWaterMark() {
            return this.waterMark;
        }

        public static final class Builder {
            private java.util.List < WaterMark> waterMark; 

            /**
             * WaterMark.
             */
            public Builder waterMark(java.util.List < WaterMark> waterMark) {
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class Output extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("ExtendData")
        private String extendData;

        @com.aliyun.core.annotation.NameInMap("M3U8NonStandardSupport")
        private M3U8NonStandardSupport m3U8NonStandardSupport;

        @com.aliyun.core.annotation.NameInMap("MergeConfigUrl")
        private String mergeConfigUrl;

        @com.aliyun.core.annotation.NameInMap("MergeList")
        private MergeList mergeList;

        @com.aliyun.core.annotation.NameInMap("MultiSpeedInfo")
        private MultiSpeedInfo multiSpeedInfo;

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
            this.audio = builder.audio;
            this.audioStreamMap = builder.audioStreamMap;
            this.clip = builder.clip;
            this.container = builder.container;
            this.deWatermark = builder.deWatermark;
            this.encryption = builder.encryption;
            this.extendData = builder.extendData;
            this.m3U8NonStandardSupport = builder.m3U8NonStandardSupport;
            this.mergeConfigUrl = builder.mergeConfigUrl;
            this.mergeList = builder.mergeList;
            this.multiSpeedInfo = builder.multiSpeedInfo;
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
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return extendData
         */
        public String getExtendData() {
            return this.extendData;
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
         * @return multiSpeedInfo
         */
        public MultiSpeedInfo getMultiSpeedInfo() {
            return this.multiSpeedInfo;
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
            private Audio audio; 
            private String audioStreamMap; 
            private Clip clip; 
            private Container container; 
            private String deWatermark; 
            private Encryption encryption; 
            private String extendData; 
            private M3U8NonStandardSupport m3U8NonStandardSupport; 
            private String mergeConfigUrl; 
            private MergeList mergeList; 
            private MultiSpeedInfo multiSpeedInfo; 
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

            /**
             * <p>The audio configurations.</p>
             * <blockquote>
             * <p> If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
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
             * <p>The information about clips.</p>
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
             * <p>The configurations of watermark blurring. The value is a JSON object. For more information, see the DeWatermark section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;0&quot;:[{&quot;l&quot;:10,&quot;t&quot;:10,&quot;w&quot;:10,&quot;h&quot;:10},{&quot;l&quot;:100,&quot;t&quot;:0.1,&quot;w&quot;:10,&quot;h&quot;:10}],&quot;128000&quot;:[],&quot;250000&quot;:[{&quot;l&quot;:0.2,&quot;t&quot;:0.1,&quot;w&quot;:0.01,&quot;h&quot;:0.05}]}</p>
             */
            public Builder deWatermark(String deWatermark) {
                this.deWatermark = deWatermark;
                return this;
            }

            /**
             * <p>The encryption configurations. The encrypted video file is generated in the M3U8 format.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The custom fields.</p>
             * 
             * <strong>example:</strong>
             * <p>testid-002</p>
             */
            public Builder extendData(String extendData) {
                this.extendData = extendData;
                return this;
            }

            /**
             * <p>The non-standard support configurations for M3U8. The value is a JSON object. For more information, see the M3U8NonStandardSupport section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
             */
            public Builder m3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
                this.m3U8NonStandardSupport = m3U8NonStandardSupport;
                return this;
            }

            /**
             * <p>The URL of the merging configuration file. Only one of MergeList and MergeConfigUrl takes effect.</p>
             * <ul>
             * <li>The configuration file specified by MergeConfigUrl can contain up to 50 clips.</li>
             * <li>MergeConfigUrl indicates the URL of the configuration file for merging clips. Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</li>
             * <li>Example of the content of the merging configuration file: <code>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ceshi-***.oss-cn-shanghai.aliyuncs.com/ccc/p0903q9wkkb.m3u8">https://ceshi-***.oss-cn-shanghai.aliyuncs.com/ccc/p0903q9wkkb.m3u8</a></p>
             */
            public Builder mergeConfigUrl(String mergeConfigUrl) {
                this.mergeConfigUrl = mergeConfigUrl;
                return this;
            }

            /**
             * <p>The configurations of clip merging. Up to four clips can be merged.</p>
             */
            public Builder mergeList(MergeList mergeList) {
                this.mergeList = mergeList;
                return this;
            }

            /**
             * <p>The information about the high-speed transcoding job. This information is available only for jobs that are submitted by using an MPS queue for high-speed transcoding. This does not support MPS queues for high-speed transcoding of an earlier version.</p>
             */
            public Builder multiSpeedInfo(MultiSpeedInfo multiSpeedInfo) {
                this.multiSpeedInfo = multiSpeedInfo;
                return this;
            }

            /**
             * <p>The transmuxing configurations. The transmuxing configurations. If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
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
             * <p>The output captions.</p>
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
             * <p>The priority of the job in the ApsaraVideo Media Processing (MPS) queue to which the job is added.</p>
             * <ul>
             * <li>A value of 10 indicates the highest priority.</li>
             * <li>Default value: <strong>6</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
             * <p>The caption configurations.</p>
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
             * <p>The ending parts.</p>
             */
            public Builder tailSlateList(TailSlateList tailSlateList) {
                this.tailSlateList = tailSlateList;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000001-200010</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The general transcoding configurations.</p>
             * <blockquote>
             * <p> If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
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
             * <p>testid-001</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The video configurations.</p>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            /**
             * <p>The sequence number of the video stream. The sequence number is the index of the video stream in the list and starts from 0. If no sequence number is specified, the default video stream is used.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

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
            this.submitTime = builder.submitTime;
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

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
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
            private String submitTime; 

            /**
             * <p>The error code returned if the job failed. If the job was successful, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.NullValue</p>
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
             * <p>2014-01-10T12:20:25Z</p>
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
             * <p>31fa3c9ca8134fb4b0b0f7878301****</p>
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
             * <p>The error message returned if the job failed. If the job was successful, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified parameter &quot;%s&quot; cannot be null.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The job output.</p>
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
             * <p>The ID of the MPS queue that is used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47b665e2a1267971****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The job state. Valid values:</p>
             * <ul>
             * <li><strong>Submitted</strong>: The job was submitted.</li>
             * <li><strong>Transcoding</strong>: Transcoding is in process.</li>
             * <li><strong>TranscodeSuccess</strong>: The job was successful.</li>
             * <li><strong>TranscodeFail</strong>: The job failed.</li>
             * <li><strong>TranscodeCancelled</strong>: The job was canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TranscodeSuccess</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-04T06:44:43Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Job")
        private java.util.List < Job> job;

        private JobList(Builder builder) {
            this.job = builder.job;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return job
         */
        public java.util.List < Job> getJob() {
            return this.job;
        }

        public static final class Builder {
            private java.util.List < Job> job; 

            /**
             * Job.
             */
            public Builder job(java.util.List < Job> job) {
                this.job = job;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryJobListResponseBody</p>
     */
    public static class NonExistJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistJobIds build() {
                return new NonExistJobIds(this);
            } 

        } 

    }
}
