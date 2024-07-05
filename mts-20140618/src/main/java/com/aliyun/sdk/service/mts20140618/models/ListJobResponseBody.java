// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobResponseBody</p>
 */
public class ListJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private JobList jobList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListJobResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobList
     */
    public JobList getJobList() {
        return this.jobList;
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
        private JobList jobList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * The transcoding jobs.
         */
        public Builder jobList(JobList jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * The pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListJobResponseBody build() {
            return new ListJobResponseBody(this);
        } 

    } 

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
             * The name of the OSS bucket in which the job input is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the job input is stored.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the job input.
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
             * The error code returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the message returned if the job was successful.
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
             * The volume adjustment range.
             * <p>
             * 
             * *   Unit: decibel.
             * *   Default value: **-20**.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The method that is used to adjust the volume. Valid values:
             * <p>
             * 
             * *   **auto**
             * *   **dynamic**
             * *   **linear**
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
             * The audio bitrate of the output file.
             * <p>
             * 
             * *   Unit: Kbit/s.
             * *   Default value: **128**.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The number of sound channels.
             * <p>
             * 
             * *   If the value of Codec is mp3, the value of this parameter can only be 1 or 2.
             * *   If the value of Codec is aac, the value of this parameter can only be 1, 2, 4, 5, 6, or 8.
             * *   Default value: 2.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * The audio codec.
             * <p>
             * 
             * *   Valid values: aac, mp3, vorbis, and flac.
             * *   Default value: **aac**.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The codec profile of the audio. Valid values if the value of Codec is aac: aaclow, aache, aachev2, aacld, and aaceld.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The level of quality control on the audio.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * The sampling rate.
             * <p>
             * 
             * *   Valid values: 22050, 32000, 44100, 48000, and 96000.
             * *   Unit: Hz.
             * *   Default value: 44100.
             * *   If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * The volume configurations.
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
             * The duration of the clip.
             * <p>
             * 
             * *   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.
             * *   Valid values: `[00:00:00.000,23:59:59.999]` or `[0.000,86399.999]`.
             * *   Examples: 01:00:59.999 and 32000.23.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The point in time when the clip starts.
             * <p>
             * 
             * *   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.
             * *   Valid values: `[00:00:00.000,23:59:59.999]` or `[0.000,86399.999]`.
             * *   Examples: 01:59:59.999 and 32000.23.
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
             * The time span of the clip.
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
             * The container format.
             * <p>
             * 
             * *   Default value: mp4.
             * *   Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).
             * *   Audio formats include MP3, MP4, Ogg, FLAC, and M4A.
             * *   Image formats include GIF and WebP.
             * *   If the container format is GIF, the video codec must be GIF.
             * *   If the container format is WebP, the video codec must be WebP.
             * *   If the container format is FLV, the video codec cannot be H.265.
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
             * The encryption ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The key that is used to encrypt the video.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key encryption method. Valid values: Base64 and KMS.
             * <p>
             * 
             * >  For example, if the key is encryptionkey128, you can encrypt the key in the Base64 format or use Key Management Service (KMS) to encrypt the key.``````
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * The URL that is used to request the key. The URL is Base64-encoded.
             */
            public Builder keyUri(String keyUri) {
                this.keyUri = keyUri;
                return this;
            }

            /**
             * The number of unencrypted frames at the beginning of the video. Leaving these frames unencrypted enables video playback to quickly start.
             */
            public Builder skipCnt(String skipCnt) {
                this.skipCnt = skipCnt;
                return this;
            }

            /**
             * The encryption type. Only hls-aes-128 may be returned.
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
             * Indicates whether the MD5 value of the TS file is included in the M3U8 file. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder md5Support(Boolean md5Support) {
                this.md5Support = md5Support;
                return this;
            }

            /**
             * Indicates whether the size of the TS file is included in the M3U8 file.
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * The non-standard support configurations for TS files. The value is a JSON object. For more information, see [Parameter details](~~29253~~).
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
             * The duration of the clip.
             * <p>
             * 
             * *   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.
             * *   Examples: 01:59:59.999 and 32000.23.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The OSS URL of the clip.
             * <p>
             * 
             * *   Example: `http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object.flv`.
             * *   The object must be URL-encoded by using the UTF-8 standard.
             */
            public Builder mergeURL(String mergeURL) {
                this.mergeURL = mergeURL;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role used for delegated authorization.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * The start point in time of the clip.
             * <p>
             * 
             * *   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.
             * *   Examples: 01:59:59.999 and 32000.23.
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
             * The color dithering algorithm of the palette. Valid values: **sierra** and **bayer**.
             */
            public Builder ditherMode(String ditherMode) {
                this.ditherMode = ditherMode;
                return this;
            }

            /**
             * The duration for which the final frame is paused. Unit: centisecond.
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * Indicates whether a custom palette is used. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isCustomPalette(String isCustomPalette) {
                this.isCustomPalette = isCustomPalette;
                return this;
            }

            /**
             * The loop count.
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
             * The length of the segment. The value must be an integer. Unit: seconds.
             * <p>
             * 
             * *   Valid values: \[1,10].
             * *   Default value: 10.
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
             * The loop count.
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
             * The transmuxing configurations for GIF.
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * The segment configurations. The value is a JSON object.
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * The transmuxing configurations for WebP.
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
             * The height of the opening part. Valid values: values in the range of (0, 4096), -1, and full.
             * <p>
             * 
             * *   Default value: **-1**.
             * *   A value of -1 indicates that the height of the source of the opening part is retained.
             * *   A value of full indicates that the height of the opening part equals the height of the main part.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The amount of time after which the opening part is played. The value starts from 0.
             * <p>
             * 
             * *   Unit: seconds.
             * *   Default value: **0**.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * The width of the opening part. Valid values: values in the range of (0, 4096), -1, and full.
             * <p>
             * 
             * *   Default value: **-1**.
             * *   A value of -1 indicates that the width of the source of the opening part is retained.
             * *   A value of full indicates that the width of the opening part equals the width of the main part.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * The OSS URL of the opening part.
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
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the output file is stored.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the output file.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The ARN of the RAM role used for delegated authorization.
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
             * The video track. Format: 0:{Stream}:{Stream sequence number}, that is, 0:v:{video_index}. The value of Stream is v, which indicates a video stream. The sequence number is the index of the video stream in the list and starts from 0.
             */
            public Builder map(String map) {
                this.map = map;
                return this;
            }

            /**
             * The error message returned if the job failed to be created. This parameter is not returned if the job was created.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The details of the output file.
             */
            public Builder outSubtitleFile(OutSubtitleFile outSubtitleFile) {
                this.outSubtitleFile = outSubtitleFile;
                return this;
            }

            /**
             * Indicates whether the job was created. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the output file is stored.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the output file.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The ARN of the RAM role used for delegated authorization.
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
             * The total bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The total duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The full name of the container format.
             */
            public Builder formatLongName(String formatLongName) {
                this.formatLongName = formatLongName;
                return this;
            }

            /**
             * The short name of the container format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * The total number of program streams.
             */
            public Builder numPrograms(String numPrograms) {
                this.numPrograms = numPrograms;
                return this;
            }

            /**
             * The total number of media streams.
             */
            public Builder numStreams(String numStreams) {
                this.numStreams = numStreams;
                return this;
            }

            /**
             * The size of the file.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The start time.
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
             * The bitrate of the audio stream.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The output layout of the sound channels.
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
             * The full name of the codec.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * The short name of the codec.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * The tag of the codec.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * The tag string of the codec.
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
             * The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The language of the audio stream. For more information, see [FFmpeg documentation](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO 639](https://en.wikipedia.org/wiki/List_of_ISO\_639-1\_codes).
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
             * The sampling rate of the audio stream.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * The start time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time base of the audio stream.
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
             * The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The language of the subtitle stream.
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
             * The average bitrate of the video stream.
             */
            public Builder avgBitrate(String avgBitrate) {
                this.avgBitrate = avgBitrate;
                return this;
            }

            /**
             * The maximum bandwidth that was consumed.
             */
            public Builder costBandwidth(String costBandwidth) {
                this.costBandwidth = costBandwidth;
                return this;
            }

            /**
             * The amount of time consumed to preload the video stream.
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

            /**
             * The average frame rate of the video stream.
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * The bitrate of the video stream.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The full name of the codec.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * The short name of the codec.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * The tag of the codec.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * The tag string of the codec.
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
             * The display aspect ratio (DAR).
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
             * The frame rate of the video stream.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Indicates whether the video stream contains B-frames.
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * The height of the video stream in pixels.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The sequence number of the video stream. The value indicates the position of the video stream in all video streams.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The language of the video stream. For more information, see [FFmpeg documentation](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO 639](https://en.wikipedia.org/wiki/List_of_ISO\_639-1\_codes).
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
             * The network bandwidth that was consumed.
             */
            public Builder networkCost(NetworkCost networkCost) {
                this.networkCost = networkCost;
                return this;
            }

            /**
             * The total frame rate.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * The pixel format of the video stream.
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
             * The sample aspect ratio (SAR) of the video stream.
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * The start time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time base of the video stream.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * The width of the video stream in pixels.
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
             * The audio streams.
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * The subtitle streams.
             */
            public Builder subtitleStreamList(SubtitleStreamList subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * The video streams.
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
             * The bitrate of the video.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The duration of the video.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The format of the video.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * The size of the file.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The format information.
             */
            public Builder format(Format format) {
                this.format = format;
                return this;
            }

            /**
             * The frame rate of the video.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The height of the video.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The stream information.
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            /**
             * The width of the video.
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
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the input file is stored.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the input file.
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
             * The character set used by the external subtitle.
             * <p>
             * 
             * *   Valid values: UTF-8, GBK, BIG5, and auto.
             * *   Default value: **auto**.
             * 
             * >  If this parameter is set to auto, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * The font of the hardcoded subtitles converted from external subtitles.
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * The input subtitle file.
             * <p>
             * 
             * *   Files in the SRT or ASS format are supported. For more information, see [Parameter details](~~29253~~).
             * *   Example: `{"Bucket":"example-bucket","Location":"oss-cn-hangzhou","Object":"example.srt"}`.
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
             * The sequence number of the video stream. The sequence number is the index of the video stream in the list and starts from 0. If you do not set the corresponding parameter in the request, the default video stream is selected.
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
             * The external subtitles. The value is a JSON array.
             */
            public Builder extSubtitleList(ExtSubtitleList extSubtitleList) {
                this.extSubtitleList = extSubtitleList;
                return this;
            }

            /**
             * The subtitles.
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
             * Indicates whether parameters related to the sampling rate are obtained. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: **White**. For more information, see [Background colors](https://docs-aliyun.cn-hangzhou.oss.aliyun-inc.com/assets/attach/29253/cn_zh/1502784952344/color.txt?spm=a2c4g.11186623.2.63.1df840f74IH4Eq\&file=color.txt).
             */
            public Builder bgColor(String bgColor) {
                this.bgColor = bgColor;
                return this;
            }

            /**
             * The duration of the transition between the main part and the ending part. A fade transition is used: The last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: 0.
             */
            public Builder blendDuration(String blendDuration) {
                this.blendDuration = blendDuration;
                return this;
            }

            /**
             * The height of the ending part. Valid values: values in the range of (0, 4096), -1, and full.
             * <p>
             * 
             * *   A value of -1 indicates that the height of the source of the ending part is retained.
             * *   A value of full indicates that the height of the ending part equals the height of the main part.
             * *   Default value: -1.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Indicates whether the audio content of the ending part is merged. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isMergeAudio(Boolean isMergeAudio) {
                this.isMergeAudio = isMergeAudio;
                return this;
            }

            /**
             * The start time.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * The OSS URL of the ending part.
             */
            public Builder tailUrl(String tailUrl) {
                this.tailUrl = tailUrl;
                return this;
            }

            /**
             * The width of the ending part. Valid values: values in the range of (0, 4096), -1, and full.
             * <p>
             * 
             * *   A value of -1 indicates that the width of the source of the ending part is retained. A value of full indicates that the width of the ending part equals the width of the main part.
             * *   Default value: -1.
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
             * The method of resolution adjustment. Default value: **none**. Valid values: rescale, crop, pad, and none.
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input bitrate is retained and the specified audio bitrate does not take effect. This parameter has a lower priority than IsCheckAudioBitrateFail. Valid values:
             * <p>
             * 
             * *   **true**
             * 
             * *   **false**
             * 
             * *   Default value:
             * 
             *     *   If this parameter is empty and the codec of the output audio is different from the codec of the input audio, the default value is false.
             *     *   If this parameter is empty and the codec of the output audio is the same as the codec of the input audio, the default value is true.
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, a transcoding failure is returned without transcoding the audio. This parameter has a higher priority than IsCheckAudioBitrate. Valid values:
             * <p>
             * 
             * *   **false**: The audio bitrate is checked.
             * *   **true**: The audio bitrate is not checked.
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input bitrate is retained. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: **false**.
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, a transcoding failure is returned without transcoding the video. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * *   Default value: false.
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * The transcoding mode.
             * <p>
             * 
             * *   Valid values: onepass, twopass, and CBR.
             * *   Default value: onepass.
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
             * The maximum bitrate. Unit: Kbit/s.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * The minimum bitrate. Unit: Kbit/s.
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
             * The average bitrate of the video. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The bitrate range of the video.
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * The size of the buffer.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * The video codec. Valid values: **H.264**, **H.265**, **GIF**, and **WEBP**.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * The constant rate factor. If this parameter is returned, the value of Bitrate is invalid. Default value: **26**.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * The video cropping mode. Valid values:
             * <p>
             * 
             * *   **border**: automatically detects and removes black borders.
             * *   A value in the width:height:left:top format: crops the videos based on the custom settings. Example: 1280:800:0:140.
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * The strength of the independent noise reduction algorithm.
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * The frame rate.
             * <p>
             * 
             * *   The value is 60 if the frame rate of the input video exceeds 60.
             * *   Default value: the frame rate of the input file.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The maximum number of frames between two keyframes. Default value: 250.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * The height of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: the height of the input video.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The maximum frame rate.
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * The maximum bitrate of the video. Unit: Kbit/s.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * The black borders that are added to the video. Unit: pixel.
             * <p>
             * 
             * *   Format: width:height:left:top.
             * *   Example: 1280:800:0:140.
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * The preset video algorithm. Default value: medium. Valid values:
             * <p>
             * 
             * *   **veryfast**
             * *   **fast**
             * *   **medium**
             * *   **slow**
             * *   **slower**
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * The codec profile. Valid values:
             * <p>
             * 
             * *   **baseline**: applicable to mobile devices.
             * *   **main**: applicable to standard-definition devices.
             * *   **high**: applicable to high-definition devices.
             * *   Default value: **high**.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The level of quality control on the video.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * The priority of the resource.
             */
            public Builder resoPriority(String resoPriority) {
                this.resoPriority = resoPriority;
                return this;
            }

            /**
             * The scan mode. Valid values:
             * <p>
             * 
             * *   If this parameter is **empty**, the scan mode of the input file is used.
             * *   **auto**: automatic deinterlacing.
             * *   **progressive**: progressive scan.
             * *   **interlaced**: interlaced scan.
             * *   **By default**, this parameter is empty.
             * 
             * **Best practice**: Interlaced scan consumes less bandwidth than progressive scan, but the image quality is poor. Therefore, mainstream video production uses progressive scan.
             * 
             * *   If **progressive scan** or **interlaced scan** is used when the scan mode of the input file is neither of them, the transcoding job fails.
             * *   We recommend that you use **the scan mode of the input file** or **automatic deinterlacing** to improve compatibility.
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * The width of the video.
             * <p>
             * 
             * *   Unit: pixel.
             * *   Default value: the width of the input video.
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
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the input file is stored.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the Object Storage Service (OSS) object that is used as the input file.
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
             * The horizontal offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Default value: 0. The value can be an integer or a decimal number.
             * <p>
             * 
             * *   An integer indicates the pixel value of the horizontal offset.
             * 
             *     *   Valid values: \[8,4096].
             *     *   Unit: pixel.
             * 
             * *   A decimal number indicates the ratio of the horizontal offset to the width in the output video resolution.
             * 
             *     *   Valid values: (0,1).
             *     *   The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * The vertical offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.
             * <p>
             * 
             * *   An integer indicates the pixel value of the vertical offset.
             * 
             *     *   Valid values: \[8,4096].
             *     *   Unit: pixel.
             * 
             * *   A decimal indicates the ratio of the vertical offset to the height in the output video resolution.
             * 
             *     *   Valid values: (0,1).
             *     *   The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * The height of the watermark. If this parameter is specified in the request, the corresponding parameter in the specified watermark template is overwritten. The value can be an integer or a decimal number.
             * <p>
             * 
             * *   An integer indicates the pixel value of the watermark height.
             * 
             *     *   Valid values: \[8,4096].
             *     *   Unit: pixel.
             * 
             * *   A decimal indicates the ratio of the watermark height to the height in the output video resolution.
             * 
             *     *   Valid values: (0,1).
             *     *   The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The watermark input file.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * The position of the watermark.
             * <p>
             * 
             * *   **TopRight**
             * *   **TopLeft**
             * *   **BottomRight**
             * *   **BottomLeft**
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * The type of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. For more information, see [Parameter details](~~29253~~). Valid values:
             * <p>
             * 
             * *   **Image**
             * *   **Text**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the watermark template.
             */
            public Builder waterMarkTemplateId(String waterMarkTemplateId) {
                this.waterMarkTemplateId = waterMarkTemplateId;
                return this;
            }

            /**
             * The width of the watermark image. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.
             * <p>
             * 
             * *   An integer indicates the pixel value of the watermark width.
             * 
             *     *   Valid values: \[8,4096].
             *     *   Unit: pixel.
             * 
             * *   A decimal indicates the ratio of the watermark width to the width in the output video resolution.
             * 
             *     *   Valid values: (0,1).
             *     *   The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.
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
            this.audio = builder.audio;
            this.audioStreamMap = builder.audioStreamMap;
            this.clip = builder.clip;
            this.container = builder.container;
            this.deWatermark = builder.deWatermark;
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
            private Audio audio; 
            private String audioStreamMap; 
            private Clip clip; 
            private Container container; 
            private String deWatermark; 
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

            /**
             * The audio configurations.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The sequence number of the audio stream.
             * <p>
             * 
             * *   Format: `0:a:{Sequence number}`.
             * *   The sequence number is the index of the audio stream in the list and starts from 0. If no sequence number is specified, the default audio stream is used.
             */
            public Builder audioStreamMap(String audioStreamMap) {
                this.audioStreamMap = audioStreamMap;
                return this;
            }

            /**
             * The information about the clip.
             */
            public Builder clip(Clip clip) {
                this.clip = clip;
                return this;
            }

            /**
             * The container format configurations.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * The configurations of watermark blurring. The value is a JSON object. For more information, see [Parameter details](~~29253~~).
             */
            public Builder deWatermark(String deWatermark) {
                this.deWatermark = deWatermark;
                return this;
            }

            /**
             * The encryption configurations. Only outputs in the M3U8 format are supported.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * The non-standard support configuration for M3U8. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).
             */
            public Builder m3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
                this.m3U8NonStandardSupport = m3U8NonStandardSupport;
                return this;
            }

            /**
             * The URL of the merging configuration file. You can specify either MergeList or MergeConfigUrl when you submit the transcoding job.
             * <p>
             * 
             * *   The configuration file specified by MergeConfigUrl can contain up to 50 clips.
             * *   MergeConfigUrl indicates the URL of the configuration file for merging clips.
             * *   Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details of merging parameters.
             * *   Example of the content of the merging configuration file: `{"MergeList":[{"MergeURL":"http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4"}]}`.
             */
            public Builder mergeConfigUrl(String mergeConfigUrl) {
                this.mergeConfigUrl = mergeConfigUrl;
                return this;
            }

            /**
             * The configurations for merging clips.
             */
            public Builder mergeList(MergeList mergeList) {
                this.mergeList = mergeList;
                return this;
            }

            /**
             * The transmuxing configurations.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * The opening parts.
             */
            public Builder openingList(OpeningList openingList) {
                this.openingList = openingList;
                return this;
            }

            /**
             * The output subtitles.
             */
            public Builder outSubtitleList(OutSubtitleList outSubtitleList) {
                this.outSubtitleList = outSubtitleList;
                return this;
            }

            /**
             * The details of the output file.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * The priority of the job in the MPS queue to which the job is added.
             * <p>
             * 
             * *   A value of 10 indicates the highest priority.
             * *   Default value: **6**.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The media properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The rotation angle of the video.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * The subtitle configurations.
             */
            public Builder subtitleConfig(SubtitleConfig subtitleConfig) {
                this.subtitleConfig = subtitleConfig;
                return this;
            }

            /**
             * The configurations for using the resolution of the source video.
             */
            public Builder superReso(SuperReso superReso) {
                this.superReso = superReso;
                return this;
            }

            /**
             * The ending parts.
             */
            public Builder tailSlateList(TailSlateList tailSlateList) {
                this.tailSlateList = tailSlateList;
                return this;
            }

            /**
             * The template ID.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The general transcoding configurations. If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * The custom data.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The video configurations.
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            /**
             * The sequence number of the video stream.
             * <p>
             * 
             * *   Format: 0:a:{Sequence number}. Example value: 0:a:0.
             * *   The sequence number is the index of the video stream in the list and starts from 0.
             * *   If no sequence number is specified, the default video stream is used.
             */
            public Builder videoStreamMap(String videoStreamMap) {
                this.videoStreamMap = videoStreamMap;
                return this;
            }

            /**
             * The URL of the watermark configuration file.
             */
            public Builder waterMarkConfigUrl(String waterMarkConfigUrl) {
                this.waterMarkConfigUrl = waterMarkConfigUrl;
                return this;
            }

            /**
             * The watermarks.
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

            /**
             * The error code returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the job was complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The information about the job input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The message sent by Message Service (MNS) to notify users of the job result.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * The error message returned if the job failed. This parameter is not returned if the job was successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The output of the job.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * The transcoding progress.
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the MPS queue.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The state of the job. Valid values:
             * <p>
             * 
             * *   **Submitted**
             * *   **Transcoding**
             * *   **TranscodeSuccess**
             * *   **TranscodeFail**
             * *   **TranscodeCancelled**
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
}
