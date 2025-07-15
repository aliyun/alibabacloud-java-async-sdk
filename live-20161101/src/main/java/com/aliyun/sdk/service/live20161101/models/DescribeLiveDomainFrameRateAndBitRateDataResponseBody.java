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
 * {@link DescribeLiveDomainFrameRateAndBitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainFrameRateAndBitRateDataResponseBody</p>
 */
public class DescribeLiveDomainFrameRateAndBitRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrameRateAndBitRateInfos")
    private FrameRateAndBitRateInfos frameRateAndBitRateInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainFrameRateAndBitRateDataResponseBody(Builder builder) {
        this.frameRateAndBitRateInfos = builder.frameRateAndBitRateInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainFrameRateAndBitRateDataResponseBody create() {
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

        private Builder(DescribeLiveDomainFrameRateAndBitRateDataResponseBody model) {
            this.frameRateAndBitRateInfos = model.frameRateAndBitRateInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The frame rates and bitrates of the live streams that were queried.</p>
         */
        public Builder frameRateAndBitRateInfos(FrameRateAndBitRateInfos frameRateAndBitRateInfos) {
            this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3F2C2C4-59BB-4B62-81FF-345BE557E3E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainFrameRateAndBitRateDataResponseBody build() {
            return new DescribeLiveDomainFrameRateAndBitRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainFrameRateAndBitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainFrameRateAndBitRateDataResponseBody</p>
     */
    public static class FrameRateAndBitRateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFrameRate")
        private Float audioFrameRate;

        @com.aliyun.core.annotation.NameInMap("BitRate")
        private Float bitRate;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        @com.aliyun.core.annotation.NameInMap("VideoFrameRate")
        private Float videoFrameRate;

        private FrameRateAndBitRateInfo(Builder builder) {
            this.audioFrameRate = builder.audioFrameRate;
            this.bitRate = builder.bitRate;
            this.streamUrl = builder.streamUrl;
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
         * @return videoFrameRate
         */
        public Float getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public static final class Builder {
            private Float audioFrameRate; 
            private Float bitRate; 
            private String streamUrl; 
            private Float videoFrameRate; 

            private Builder() {
            } 

            private Builder(FrameRateAndBitRateInfo model) {
                this.audioFrameRate = model.audioFrameRate;
                this.bitRate = model.bitRate;
                this.streamUrl = model.streamUrl;
                this.videoFrameRate = model.videoFrameRate;
            } 

            /**
             * <p>The audio frame rate of the live stream. Unit: FPS.</p>
             * 
             * <strong>example:</strong>
             * <p>42.9</p>
             */
            public Builder audioFrameRate(Float audioFrameRate) {
                this.audioFrameRate = audioFrameRate;
                return this;
            }

            /**
             * <p>The bitrate of the live stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>30693.96</p>
             */
            public Builder bitRate(Float bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://demo.aliyundoc.com/test/liveStream****_3_4</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * <p>The video frame rate of the live stream. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>24.9</p>
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
     * {@link DescribeLiveDomainFrameRateAndBitRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainFrameRateAndBitRateDataResponseBody</p>
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
