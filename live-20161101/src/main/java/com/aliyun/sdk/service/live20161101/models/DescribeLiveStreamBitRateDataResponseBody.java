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
 * {@link DescribeLiveStreamBitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamBitRateDataResponseBody</p>
 */
public class DescribeLiveStreamBitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrameRateAndBitRateInfos")
    private FrameRateAndBitRateInfos frameRateAndBitRateInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamBitRateDataResponseBody(Builder builder) {
        this.frameRateAndBitRateInfos = builder.frameRateAndBitRateInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamBitRateDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return frameRateAndBitRateInfos
     */
    public FrameRateAndBitRateInfos getFrameRateAndBitRateInfos() {
        return this.frameRateAndBitRateInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FrameRateAndBitRateInfos frameRateAndBitRateInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamBitRateDataResponseBody model) {
            this.frameRateAndBitRateInfos = model.frameRateAndBitRateInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The frame rates and bitrates of the live stream.</p>
         */
        public Builder frameRateAndBitRateInfos(FrameRateAndBitRateInfos frameRateAndBitRateInfos) {
            this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamBitRateDataResponseBody build() {
            return new DescribeLiveStreamBitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamBitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamBitRateDataResponseBody</p>
     */
    public static class FrameRateAndBitRateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFrameRate")
        private Float audioFrameRate;

        @com.aliyun.core.annotation.NameInMap("BitRate")
        private Float bitRate;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("VideoFrameRate")
        private Float videoFrameRate;

        private FrameRateAndBitRateInfo(Builder builder) {
            this.audioFrameRate = builder.audioFrameRate;
            this.bitRate = builder.bitRate;
            this.streamUrl = builder.streamUrl;
            this.time = builder.time;
            this.videoFrameRate = builder.videoFrameRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameRateAndBitRateInfo create() {
            return builder().build();
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
         * @return videoFrameRate
         */
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public static final class Builder {
            private Float audioFrameRate; 
            private Float bitRate; 
            private String streamUrl; 
            private String time; 
            private Float videoFrameRate; 

            private Builder() {
            } 

            private Builder(FrameRateAndBitRateInfo model) {
                this.audioFrameRate = model.audioFrameRate;
                this.bitRate = model.bitRate;
                this.streamUrl = model.streamUrl;
                this.time = model.time;
                this.videoFrameRate = model.videoFrameRate;
            } 

            /**
             * <p>The audio frame rate of the live stream. Unit: FPS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder audioFrameRate(Float audioFrameRate) {
                this.audioFrameRate = audioFrameRate;
                return this;
            }

            /**
             * <p>The bitrate of the live stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder bitRate(Float bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
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
             * <p>The video frame rate of the live stream. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder videoFrameRate(Float videoFrameRate) {
                this.videoFrameRate = videoFrameRate;
                return this;
            }

            public FrameRateAndBitRateInfo build() {
                return new FrameRateAndBitRateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamBitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamBitRateDataResponseBody</p>
     */
    public static class FrameRateAndBitRateInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRateAndBitRateInfo")
        private java.util.List<FrameRateAndBitRateInfo> frameRateAndBitRateInfo;

        private FrameRateAndBitRateInfos(Builder builder) {
            this.frameRateAndBitRateInfo = builder.frameRateAndBitRateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameRateAndBitRateInfos create() {
            return builder().build();
        }

        /**
         * @return frameRateAndBitRateInfo
         */
        public java.util.List<FrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

        public static final class Builder {
            private java.util.List<FrameRateAndBitRateInfo> frameRateAndBitRateInfo; 

            private Builder() {
            } 

            private Builder(FrameRateAndBitRateInfos model) {
                this.frameRateAndBitRateInfo = model.frameRateAndBitRateInfo;
            } 

            /**
             * FrameRateAndBitRateInfo.
             */
            public Builder frameRateAndBitRateInfo(java.util.List<FrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
                this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
                return this;
            }

            public FrameRateAndBitRateInfos build() {
                return new FrameRateAndBitRateInfos(this);
            } 

        } 

    }
}
