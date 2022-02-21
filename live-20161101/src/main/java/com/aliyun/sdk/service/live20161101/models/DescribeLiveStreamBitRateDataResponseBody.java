// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamBitRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamBitRateDataResponseBody</p>
 */
public class DescribeLiveStreamBitRateDataResponseBody extends TeaModel {
    @NameInMap("FrameRateAndBitRateInfos")
    private FrameRateAndBitRateInfos frameRateAndBitRateInfos;

    @NameInMap("RequestId")
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

        /**
         * FrameRateAndBitRateInfos.
         */
        public Builder frameRateAndBitRateInfos(FrameRateAndBitRateInfos frameRateAndBitRateInfos) {
            this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamBitRateDataResponseBody build() {
            return new DescribeLiveStreamBitRateDataResponseBody(this);
        } 

    } 

    public static class FrameRateAndBitRateInfo extends TeaModel {
        @NameInMap("AudioFrameRate")
        private Float audioFrameRate;

        @NameInMap("BitRate")
        private Float bitRate;

        @NameInMap("StreamUrl")
        private String streamUrl;

        @NameInMap("Time")
        private String time;

        @NameInMap("VideoFrameRate")
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

            /**
             * AudioFrameRate.
             */
            public Builder audioFrameRate(Float audioFrameRate) {
                this.audioFrameRate = audioFrameRate;
                return this;
            }

            /**
             * BitRate.
             */
            public Builder bitRate(Float bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * StreamUrl.
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * VideoFrameRate.
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
    public static class FrameRateAndBitRateInfos extends TeaModel {
        @NameInMap("FrameRateAndBitRateInfo")
        private java.util.List < FrameRateAndBitRateInfo> frameRateAndBitRateInfo;

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
        public java.util.List < FrameRateAndBitRateInfo> getFrameRateAndBitRateInfo() {
            return this.frameRateAndBitRateInfo;
        }

        public static final class Builder {
            private java.util.List < FrameRateAndBitRateInfo> frameRateAndBitRateInfo; 

            /**
             * FrameRateAndBitRateInfo.
             */
            public Builder frameRateAndBitRateInfo(java.util.List < FrameRateAndBitRateInfo> frameRateAndBitRateInfo) {
                this.frameRateAndBitRateInfo = frameRateAndBitRateInfo;
                return this;
            }

            public FrameRateAndBitRateInfos build() {
                return new FrameRateAndBitRateInfos(this);
            } 

        } 

    }
}
