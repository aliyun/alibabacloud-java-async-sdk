// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
 */
public class DescribeLiveUpVideoAudioInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpItems")
    private UpItems upItems;

    private DescribeLiveUpVideoAudioInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upItems = builder.upItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUpVideoAudioInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return upItems
     */
    public UpItems getUpItems() {
        return this.upItems;
    }

    public static final class Builder {
        private String requestId; 
        private UpItems upItems; 

        private Builder() {
        } 

        private Builder(DescribeLiveUpVideoAudioInfoResponseBody model) {
            this.requestId = model.requestId;
            this.upItems = model.upItems;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         */
        public Builder upItems(UpItems upItems) {
            this.upItems = upItems;
            return this;
        }

        public DescribeLiveUpVideoAudioInfoResponseBody build() {
            return new DescribeLiveUpVideoAudioInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AacHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AacHeaders(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AacHeaders create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AacHeaders model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The number of AAC headers in the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AacHeaders build() {
                return new AacHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAacHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AacHeaders")
        private java.util.List<AacHeaders> aacHeaders;

        private PublishItemAacHeaders(Builder builder) {
            this.aacHeaders = builder.aacHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAacHeaders create() {
            return builder().build();
        }

        /**
         * @return aacHeaders
         */
        public java.util.List<AacHeaders> getAacHeaders() {
            return this.aacHeaders;
        }

        public static final class Builder {
            private java.util.List<AacHeaders> aacHeaders; 

            private Builder() {
            } 

            private Builder(PublishItemAacHeaders model) {
                this.aacHeaders = model.aacHeaders;
            } 

            /**
             * AacHeaders.
             */
            public Builder aacHeaders(java.util.List<AacHeaders> aacHeaders) {
                this.aacHeaders = aacHeaders;
                return this;
            }

            public PublishItemAacHeaders build() {
                return new PublishItemAacHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AudioBitRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AudioBitRate(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioBitRate create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AudioBitRate model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The bitrate of the audio. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>24552</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AudioBitRate build() {
                return new AudioBitRate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAudioBitRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioBitRate")
        private java.util.List<AudioBitRate> audioBitRate;

        private PublishItemAudioBitRate(Builder builder) {
            this.audioBitRate = builder.audioBitRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAudioBitRate create() {
            return builder().build();
        }

        /**
         * @return audioBitRate
         */
        public java.util.List<AudioBitRate> getAudioBitRate() {
            return this.audioBitRate;
        }

        public static final class Builder {
            private java.util.List<AudioBitRate> audioBitRate; 

            private Builder() {
            } 

            private Builder(PublishItemAudioBitRate model) {
                this.audioBitRate = model.audioBitRate;
            } 

            /**
             * AudioBitRate.
             */
            public Builder audioBitRate(java.util.List<AudioBitRate> audioBitRate) {
                this.audioBitRate = audioBitRate;
                return this;
            }

            public PublishItemAudioBitRate build() {
                return new PublishItemAudioBitRate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AudioFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AudioFrames(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioFrames create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AudioFrames model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The frame rate of the audio. Unit: frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AudioFrames build() {
                return new AudioFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAudioFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFrames")
        private java.util.List<AudioFrames> audioFrames;

        private PublishItemAudioFrames(Builder builder) {
            this.audioFrames = builder.audioFrames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAudioFrames create() {
            return builder().build();
        }

        /**
         * @return audioFrames
         */
        public java.util.List<AudioFrames> getAudioFrames() {
            return this.audioFrames;
        }

        public static final class Builder {
            private java.util.List<AudioFrames> audioFrames; 

            private Builder() {
            } 

            private Builder(PublishItemAudioFrames model) {
                this.audioFrames = model.audioFrames;
            } 

            /**
             * AudioFrames.
             */
            public Builder audioFrames(java.util.List<AudioFrames> audioFrames) {
                this.audioFrames = audioFrames;
                return this;
            }

            public PublishItemAudioFrames build() {
                return new PublishItemAudioFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AudioInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AudioInterval(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioInterval create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AudioInterval model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The maximum audio frame interval. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>254</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AudioInterval build() {
                return new AudioInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAudioInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioInterval")
        private java.util.List<AudioInterval> audioInterval;

        private PublishItemAudioInterval(Builder builder) {
            this.audioInterval = builder.audioInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAudioInterval create() {
            return builder().build();
        }

        /**
         * @return audioInterval
         */
        public java.util.List<AudioInterval> getAudioInterval() {
            return this.audioInterval;
        }

        public static final class Builder {
            private java.util.List<AudioInterval> audioInterval; 

            private Builder() {
            } 

            private Builder(PublishItemAudioInterval model) {
                this.audioInterval = model.audioInterval;
            } 

            /**
             * AudioInterval.
             */
            public Builder audioInterval(java.util.List<AudioInterval> audioInterval) {
                this.audioInterval = audioInterval;
                return this;
            }

            public PublishItemAudioInterval build() {
                return new PublishItemAudioInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AudioStamps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AudioStamps(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStamps create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AudioStamps model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The audio timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>725053422</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AudioStamps build() {
                return new AudioStamps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAudioStamps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStamps")
        private java.util.List<AudioStamps> audioStamps;

        private PublishItemAudioStamps(Builder builder) {
            this.audioStamps = builder.audioStamps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAudioStamps create() {
            return builder().build();
        }

        /**
         * @return audioStamps
         */
        public java.util.List<AudioStamps> getAudioStamps() {
            return this.audioStamps;
        }

        public static final class Builder {
            private java.util.List<AudioStamps> audioStamps; 

            private Builder() {
            } 

            private Builder(PublishItemAudioStamps model) {
                this.audioStamps = model.audioStamps;
            } 

            /**
             * AudioStamps.
             */
            public Builder audioStamps(java.util.List<AudioStamps> audioStamps) {
                this.audioStamps = audioStamps;
                return this;
            }

            public PublishItemAudioStamps build() {
                return new PublishItemAudioStamps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class AvcHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AvcHeaders(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvcHeaders create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AvcHeaders model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The number of AVC headers in the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AvcHeaders build() {
                return new AvcHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemAvcHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvcHeaders")
        private java.util.List<AvcHeaders> avcHeaders;

        private PublishItemAvcHeaders(Builder builder) {
            this.avcHeaders = builder.avcHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemAvcHeaders create() {
            return builder().build();
        }

        /**
         * @return avcHeaders
         */
        public java.util.List<AvcHeaders> getAvcHeaders() {
            return this.avcHeaders;
        }

        public static final class Builder {
            private java.util.List<AvcHeaders> avcHeaders; 

            private Builder() {
            } 

            private Builder(PublishItemAvcHeaders model) {
                this.avcHeaders = model.avcHeaders;
            } 

            /**
             * AvcHeaders.
             */
            public Builder avcHeaders(java.util.List<AvcHeaders> avcHeaders) {
                this.avcHeaders = avcHeaders;
                return this;
            }

            public PublishItemAvcHeaders build() {
                return new PublishItemAvcHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class ErrorFlags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private ErrorFlags(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorFlags create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(ErrorFlags model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The number of times the error code that indicates interrupted stream ingest was returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public ErrorFlags build() {
                return new ErrorFlags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemErrorFlags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlags")
        private java.util.List<ErrorFlags> errorFlags;

        private PublishItemErrorFlags(Builder builder) {
            this.errorFlags = builder.errorFlags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemErrorFlags create() {
            return builder().build();
        }

        /**
         * @return errorFlags
         */
        public java.util.List<ErrorFlags> getErrorFlags() {
            return this.errorFlags;
        }

        public static final class Builder {
            private java.util.List<ErrorFlags> errorFlags; 

            private Builder() {
            } 

            private Builder(PublishItemErrorFlags model) {
                this.errorFlags = model.errorFlags;
            } 

            /**
             * ErrorFlags.
             */
            public Builder errorFlags(java.util.List<ErrorFlags> errorFlags) {
                this.errorFlags = errorFlags;
                return this;
            }

            public PublishItemErrorFlags build() {
                return new PublishItemErrorFlags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VAStamp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private VAStamp(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VAStamp create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(VAStamp model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The difference between the audio and video timestamps. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>359</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public VAStamp build() {
                return new VAStamp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VideoAndAudioStamp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("V_AStamp")
        private java.util.List<VAStamp> vAStamp;

        private VideoAndAudioStamp(Builder builder) {
            this.vAStamp = builder.vAStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoAndAudioStamp create() {
            return builder().build();
        }

        /**
         * @return vAStamp
         */
        public java.util.List<VAStamp> getVAStamp() {
            return this.vAStamp;
        }

        public static final class Builder {
            private java.util.List<VAStamp> vAStamp; 

            private Builder() {
            } 

            private Builder(VideoAndAudioStamp model) {
                this.vAStamp = model.vAStamp;
            } 

            /**
             * V_AStamp.
             */
            public Builder vAStamp(java.util.List<VAStamp> vAStamp) {
                this.vAStamp = vAStamp;
                return this;
            }

            public VideoAndAudioStamp build() {
                return new VideoAndAudioStamp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VideoBitRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private VideoBitRate(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoBitRate create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(VideoBitRate model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The bitrate of the video. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3970160</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public VideoBitRate build() {
                return new VideoBitRate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemVideoBitRate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoBitRate")
        private java.util.List<VideoBitRate> videoBitRate;

        private PublishItemVideoBitRate(Builder builder) {
            this.videoBitRate = builder.videoBitRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemVideoBitRate create() {
            return builder().build();
        }

        /**
         * @return videoBitRate
         */
        public java.util.List<VideoBitRate> getVideoBitRate() {
            return this.videoBitRate;
        }

        public static final class Builder {
            private java.util.List<VideoBitRate> videoBitRate; 

            private Builder() {
            } 

            private Builder(PublishItemVideoBitRate model) {
                this.videoBitRate = model.videoBitRate;
            } 

            /**
             * VideoBitRate.
             */
            public Builder videoBitRate(java.util.List<VideoBitRate> videoBitRate) {
                this.videoBitRate = videoBitRate;
                return this;
            }

            public PublishItemVideoBitRate build() {
                return new PublishItemVideoBitRate(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VideoFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private VideoFrames(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoFrames create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(VideoFrames model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The frame rate of the video. Unit: frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public VideoFrames build() {
                return new VideoFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemVideoFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoFrames")
        private java.util.List<VideoFrames> videoFrames;

        private PublishItemVideoFrames(Builder builder) {
            this.videoFrames = builder.videoFrames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemVideoFrames create() {
            return builder().build();
        }

        /**
         * @return videoFrames
         */
        public java.util.List<VideoFrames> getVideoFrames() {
            return this.videoFrames;
        }

        public static final class Builder {
            private java.util.List<VideoFrames> videoFrames; 

            private Builder() {
            } 

            private Builder(PublishItemVideoFrames model) {
                this.videoFrames = model.videoFrames;
            } 

            /**
             * VideoFrames.
             */
            public Builder videoFrames(java.util.List<VideoFrames> videoFrames) {
                this.videoFrames = videoFrames;
                return this;
            }

            public PublishItemVideoFrames build() {
                return new PublishItemVideoFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VideoInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private VideoInterval(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInterval create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(VideoInterval model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The maximum video frame interval. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>278</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public VideoInterval build() {
                return new VideoInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemVideoInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoInterval")
        private java.util.List<VideoInterval> videoInterval;

        private PublishItemVideoInterval(Builder builder) {
            this.videoInterval = builder.videoInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemVideoInterval create() {
            return builder().build();
        }

        /**
         * @return videoInterval
         */
        public java.util.List<VideoInterval> getVideoInterval() {
            return this.videoInterval;
        }

        public static final class Builder {
            private java.util.List<VideoInterval> videoInterval; 

            private Builder() {
            } 

            private Builder(PublishItemVideoInterval model) {
                this.videoInterval = model.videoInterval;
            } 

            /**
             * VideoInterval.
             */
            public Builder videoInterval(java.util.List<VideoInterval> videoInterval) {
                this.videoInterval = videoInterval;
                return this;
            }

            public PublishItemVideoInterval build() {
                return new PublishItemVideoInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class VideoStamps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private VideoStamps(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStamps create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(VideoStamps model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The video timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1538134750408</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>725053781</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public VideoStamps build() {
                return new VideoStamps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItemVideoStamps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoStamps")
        private java.util.List<VideoStamps> videoStamps;

        private PublishItemVideoStamps(Builder builder) {
            this.videoStamps = builder.videoStamps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItemVideoStamps create() {
            return builder().build();
        }

        /**
         * @return videoStamps
         */
        public java.util.List<VideoStamps> getVideoStamps() {
            return this.videoStamps;
        }

        public static final class Builder {
            private java.util.List<VideoStamps> videoStamps; 

            private Builder() {
            } 

            private Builder(PublishItemVideoStamps model) {
                this.videoStamps = model.videoStamps;
            } 

            /**
             * VideoStamps.
             */
            public Builder videoStamps(java.util.List<VideoStamps> videoStamps) {
                this.videoStamps = videoStamps;
                return this;
            }

            public PublishItemVideoStamps build() {
                return new PublishItemVideoStamps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class PublishItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AacHeaders")
        private PublishItemAacHeaders aacHeaders;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AudioBitRate")
        private PublishItemAudioBitRate audioBitRate;

        @com.aliyun.core.annotation.NameInMap("AudioFrames")
        private PublishItemAudioFrames audioFrames;

        @com.aliyun.core.annotation.NameInMap("AudioInterval")
        private PublishItemAudioInterval audioInterval;

        @com.aliyun.core.annotation.NameInMap("AudioStamps")
        private PublishItemAudioStamps audioStamps;

        @com.aliyun.core.annotation.NameInMap("AvcHeaders")
        private PublishItemAvcHeaders avcHeaders;

        @com.aliyun.core.annotation.NameInMap("CodecInfo")
        private String codecInfo;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorFlags")
        private PublishItemErrorFlags errorFlags;

        @com.aliyun.core.annotation.NameInMap("PublishInterval")
        private String publishInterval;

        @com.aliyun.core.annotation.NameInMap("PublishIp")
        private String publishIp;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("VideoAndAudioStamp")
        private VideoAndAudioStamp videoAndAudioStamp;

        @com.aliyun.core.annotation.NameInMap("VideoBitRate")
        private PublishItemVideoBitRate videoBitRate;

        @com.aliyun.core.annotation.NameInMap("VideoFrames")
        private PublishItemVideoFrames videoFrames;

        @com.aliyun.core.annotation.NameInMap("VideoInterval")
        private PublishItemVideoInterval videoInterval;

        @com.aliyun.core.annotation.NameInMap("VideoStamps")
        private PublishItemVideoStamps videoStamps;

        private PublishItem(Builder builder) {
            this.aacHeaders = builder.aacHeaders;
            this.appName = builder.appName;
            this.audioBitRate = builder.audioBitRate;
            this.audioFrames = builder.audioFrames;
            this.audioInterval = builder.audioInterval;
            this.audioStamps = builder.audioStamps;
            this.avcHeaders = builder.avcHeaders;
            this.codecInfo = builder.codecInfo;
            this.domainName = builder.domainName;
            this.errorFlags = builder.errorFlags;
            this.publishInterval = builder.publishInterval;
            this.publishIp = builder.publishIp;
            this.publishStatus = builder.publishStatus;
            this.publishTime = builder.publishTime;
            this.stopTime = builder.stopTime;
            this.streamName = builder.streamName;
            this.uniqueId = builder.uniqueId;
            this.videoAndAudioStamp = builder.videoAndAudioStamp;
            this.videoBitRate = builder.videoBitRate;
            this.videoFrames = builder.videoFrames;
            this.videoInterval = builder.videoInterval;
            this.videoStamps = builder.videoStamps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishItem create() {
            return builder().build();
        }

        /**
         * @return aacHeaders
         */
        public PublishItemAacHeaders getAacHeaders() {
            return this.aacHeaders;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return audioBitRate
         */
        public PublishItemAudioBitRate getAudioBitRate() {
            return this.audioBitRate;
        }

        /**
         * @return audioFrames
         */
        public PublishItemAudioFrames getAudioFrames() {
            return this.audioFrames;
        }

        /**
         * @return audioInterval
         */
        public PublishItemAudioInterval getAudioInterval() {
            return this.audioInterval;
        }

        /**
         * @return audioStamps
         */
        public PublishItemAudioStamps getAudioStamps() {
            return this.audioStamps;
        }

        /**
         * @return avcHeaders
         */
        public PublishItemAvcHeaders getAvcHeaders() {
            return this.avcHeaders;
        }

        /**
         * @return codecInfo
         */
        public String getCodecInfo() {
            return this.codecInfo;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorFlags
         */
        public PublishItemErrorFlags getErrorFlags() {
            return this.errorFlags;
        }

        /**
         * @return publishInterval
         */
        public String getPublishInterval() {
            return this.publishInterval;
        }

        /**
         * @return publishIp
         */
        public String getPublishIp() {
            return this.publishIp;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return videoAndAudioStamp
         */
        public VideoAndAudioStamp getVideoAndAudioStamp() {
            return this.videoAndAudioStamp;
        }

        /**
         * @return videoBitRate
         */
        public PublishItemVideoBitRate getVideoBitRate() {
            return this.videoBitRate;
        }

        /**
         * @return videoFrames
         */
        public PublishItemVideoFrames getVideoFrames() {
            return this.videoFrames;
        }

        /**
         * @return videoInterval
         */
        public PublishItemVideoInterval getVideoInterval() {
            return this.videoInterval;
        }

        /**
         * @return videoStamps
         */
        public PublishItemVideoStamps getVideoStamps() {
            return this.videoStamps;
        }

        public static final class Builder {
            private PublishItemAacHeaders aacHeaders; 
            private String appName; 
            private PublishItemAudioBitRate audioBitRate; 
            private PublishItemAudioFrames audioFrames; 
            private PublishItemAudioInterval audioInterval; 
            private PublishItemAudioStamps audioStamps; 
            private PublishItemAvcHeaders avcHeaders; 
            private String codecInfo; 
            private String domainName; 
            private PublishItemErrorFlags errorFlags; 
            private String publishInterval; 
            private String publishIp; 
            private String publishStatus; 
            private String publishTime; 
            private String stopTime; 
            private String streamName; 
            private String uniqueId; 
            private VideoAndAudioStamp videoAndAudioStamp; 
            private PublishItemVideoBitRate videoBitRate; 
            private PublishItemVideoFrames videoFrames; 
            private PublishItemVideoInterval videoInterval; 
            private PublishItemVideoStamps videoStamps; 

            private Builder() {
            } 

            private Builder(PublishItem model) {
                this.aacHeaders = model.aacHeaders;
                this.appName = model.appName;
                this.audioBitRate = model.audioBitRate;
                this.audioFrames = model.audioFrames;
                this.audioInterval = model.audioInterval;
                this.audioStamps = model.audioStamps;
                this.avcHeaders = model.avcHeaders;
                this.codecInfo = model.codecInfo;
                this.domainName = model.domainName;
                this.errorFlags = model.errorFlags;
                this.publishInterval = model.publishInterval;
                this.publishIp = model.publishIp;
                this.publishStatus = model.publishStatus;
                this.publishTime = model.publishTime;
                this.stopTime = model.stopTime;
                this.streamName = model.streamName;
                this.uniqueId = model.uniqueId;
                this.videoAndAudioStamp = model.videoAndAudioStamp;
                this.videoBitRate = model.videoBitRate;
                this.videoFrames = model.videoFrames;
                this.videoInterval = model.videoInterval;
                this.videoStamps = model.videoStamps;
            } 

            /**
             * <p>The details about the audio and video data of the stream ingest occurrences.</p>
             */
            public Builder aacHeaders(PublishItemAacHeaders aacHeaders) {
                this.aacHeaders = aacHeaders;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             * 
             * <strong>example:</strong>
             * <p>AppName</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The name of the application to which the ingested stream belongs.</p>
             */
            public Builder audioBitRate(PublishItemAudioBitRate audioBitRate) {
                this.audioBitRate = audioBitRate;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder audioFrames(PublishItemAudioFrames audioFrames) {
                this.audioFrames = audioFrames;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder audioInterval(PublishItemAudioInterval audioInterval) {
                this.audioInterval = audioInterval;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder audioStamps(PublishItemAudioStamps audioStamps) {
                this.audioStamps = audioStamps;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder avcHeaders(PublishItemAvcHeaders avcHeaders) {
                this.avcHeaders = avcHeaders;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             * 
             * <strong>example:</strong>
             * <p>H264/AAC</p>
             */
            public Builder codecInfo(String codecInfo) {
                this.codecInfo = codecInfo;
                return this;
            }

            /**
             * <p>The audio and video encoding information.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ingest domain.</p>
             */
            public Builder errorFlags(PublishItemErrorFlags errorFlags) {
                this.errorFlags = errorFlags;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder publishInterval(String publishInterval) {
                this.publishInterval = publishInterval;
                return this;
            }

            /**
             * <p>The stream ingest duration. Unit: seconds. A hyphen (-) indicates that the stream is being ingested and the duration cannot be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>cn397</p>
             */
            public Builder publishIp(String publishIp) {
                this.publishIp = publishIp;
                return this;
            }

            /**
             * <p>The IP address of the stream ingest client.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The stream ingest status. A value of 1 indicates that the stream is being ingested. A value of 0 indicates that the stream was ingested.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T15:00:00Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The start time of stream ingest. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T15:10:00Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The end time of stream ingest. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamName</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>2.-395_37261_9848098_1538080899396</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>The unique ID of each stream ingest occurrence.</p>
             */
            public Builder videoAndAudioStamp(VideoAndAudioStamp videoAndAudioStamp) {
                this.videoAndAudioStamp = videoAndAudioStamp;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder videoBitRate(PublishItemVideoBitRate videoBitRate) {
                this.videoBitRate = videoBitRate;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder videoFrames(PublishItemVideoFrames videoFrames) {
                this.videoFrames = videoFrames;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder videoInterval(PublishItemVideoInterval videoInterval) {
                this.videoInterval = videoInterval;
                return this;
            }

            /**
             * <p>The metric value at a granularity of seconds at the query time.</p>
             */
            public Builder videoStamps(PublishItemVideoStamps videoStamps) {
                this.videoStamps = videoStamps;
                return this;
            }

            public PublishItem build() {
                return new PublishItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveUpVideoAudioInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveUpVideoAudioInfoResponseBody</p>
     */
    public static class UpItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishItem")
        private java.util.List<PublishItem> publishItem;

        private UpItems(Builder builder) {
            this.publishItem = builder.publishItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpItems create() {
            return builder().build();
        }

        /**
         * @return publishItem
         */
        public java.util.List<PublishItem> getPublishItem() {
            return this.publishItem;
        }

        public static final class Builder {
            private java.util.List<PublishItem> publishItem; 

            private Builder() {
            } 

            private Builder(UpItems model) {
                this.publishItem = model.publishItem;
            } 

            /**
             * PublishItem.
             */
            public Builder publishItem(java.util.List<PublishItem> publishItem) {
                this.publishItem = publishItem;
                return this;
            }

            public UpItems build() {
                return new UpItems(this);
            } 

        } 

    }
}
