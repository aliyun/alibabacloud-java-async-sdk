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
 * {@link DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody</p>
 */
public class DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrameRateAndBitRateInfos")
    private java.util.List<FrameRateAndBitRateInfos> frameRateAndBitRateInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody(Builder builder) {
        this.frameRateAndBitRateInfos = builder.frameRateAndBitRateInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return frameRateAndBitRateInfos
     */
    public java.util.List<FrameRateAndBitRateInfos> getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FrameRateAndBitRateInfos> frameRateAndBitRateInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody model) {
            this.frameRateAndBitRateInfos = model.frameRateAndBitRateInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The audio and video frame rates and bitrates at each time granularity.</p>
         */
        public Builder frameRateAndBitRateInfos(java.util.List<FrameRateAndBitRateInfos> frameRateAndBitRateInfos) {
            this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody build() {
            return new DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamDetailFrameRateAndBitRateDataResponseBody</p>
     */
    public static class FrameRateAndBitRateInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioBitRate")
        private Float audioBitRate;

        @com.aliyun.core.annotation.NameInMap("AudioFrameRate")
        private Float audioFrameRate;

        @com.aliyun.core.annotation.NameInMap("BitRate")
        private Float bitRate;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("VideoBitRate")
        private Float videoBitRate;

        @com.aliyun.core.annotation.NameInMap("VideoFrameRate")
        private Float videoFrameRate;

        private FrameRateAndBitRateInfos(Builder builder) {
            this.audioBitRate = builder.audioBitRate;
            this.audioFrameRate = builder.audioFrameRate;
            this.bitRate = builder.bitRate;
            this.streamUrl = builder.streamUrl;
            this.time = builder.time;
            this.videoBitRate = builder.videoBitRate;
            this.videoFrameRate = builder.videoFrameRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameRateAndBitRateInfos create() {
            return builder().build();
        }

        /**
         * @return audioBitRate
         */
        public Float getAudioBitRate() {
            return this.audioBitRate;
        }

        /**
         * @return audioFrameRate
         */
        public Float getAudioFrameRate() {
            return this.audioFrameRate;
        }

        /**
         * @return bitRate
         */
        public Float getBitRate() {
            return this.bitRate;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return videoBitRate
         */
        public Float getVideoBitRate() {
            return this.videoBitRate;
        }

        /**
         * @return videoFrameRate
         */
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public static final class Builder {
            private Float audioBitRate; 
            private Float audioFrameRate; 
            private Float bitRate; 
            private String streamUrl; 
            private String time; 
            private Float videoBitRate; 
            private Float videoFrameRate; 

            private Builder() {
            } 

            private Builder(FrameRateAndBitRateInfos model) {
                this.audioBitRate = model.audioBitRate;
                this.audioFrameRate = model.audioFrameRate;
                this.bitRate = model.bitRate;
                this.streamUrl = model.streamUrl;
                this.time = model.time;
                this.videoBitRate = model.videoBitRate;
                this.videoFrameRate = model.videoFrameRate;
            } 

            /**
             * <p>The audio bitrate of the live stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder audioBitRate(Float audioBitRate) {
                this.audioBitRate = audioBitRate;
                return this;
            }

            /**
             * <p>The audio frame rate of the live stream. Unit: FPS.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder audioFrameRate(Float audioFrameRate) {
                this.audioFrameRate = audioFrameRate;
                return this;
            }

            /**
             * <p>The bitrate of the live stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1420</p>
             */
            public Builder bitRate(Float bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/AppName/exampleStreamName</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * <p>The time when the data was collected. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-09-13T16:04:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The video bitrate of the live stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder videoBitRate(Float videoBitRate) {
                this.videoBitRate = videoBitRate;
                return this;
            }

            /**
             * <p>The video frame rate of the live stream. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder videoFrameRate(Float videoFrameRate) {
                this.videoFrameRate = videoFrameRate;
                return this;
            }

            public FrameRateAndBitRateInfos build() {
                return new FrameRateAndBitRateInfos(this);
            } 

        } 

    }
}
