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
 * {@link DescribeLiveCenterStreamRateDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveCenterStreamRateDataResponseBody</p>
 */
public class DescribeLiveCenterStreamRateDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RateDatas")
    private java.util.List<RateDatas> rateDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveCenterStreamRateDataResponseBody(Builder builder) {
        this.rateDatas = builder.rateDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveCenterStreamRateDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rateDatas
     */
    public java.util.List<RateDatas> getRateDatas() {
        return this.rateDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RateDatas> rateDatas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveCenterStreamRateDataResponseBody model) {
            this.rateDatas = model.rateDatas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of frame rates and bitrates.</p>
         */
        public Builder rateDatas(java.util.List<RateDatas> rateDatas) {
            this.rateDatas = rateDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6E125BE-E9B8-1103-8684-A3585CB632F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveCenterStreamRateDataResponseBody build() {
            return new DescribeLiveCenterStreamRateDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveCenterStreamRateDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveCenterStreamRateDataResponseBody</p>
     */
    public static class RateDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFps")
        private String audioFps;

        @com.aliyun.core.annotation.NameInMap("AudioRate")
        private String audioRate;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("VideoFps")
        private String videoFps;

        @com.aliyun.core.annotation.NameInMap("VideoRate")
        private String videoRate;

        private RateDatas(Builder builder) {
            this.audioFps = builder.audioFps;
            this.audioRate = builder.audioRate;
            this.time = builder.time;
            this.videoFps = builder.videoFps;
            this.videoRate = builder.videoRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RateDatas create() {
            return builder().build();
        }

        /**
         * @return audioFps
         */
        public String getAudioFps() {
            return this.audioFps;
        }

        /**
         * @return audioRate
         */
        public String getAudioRate() {
            return this.audioRate;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return videoFps
         */
        public String getVideoFps() {
            return this.videoFps;
        }

        /**
         * @return videoRate
         */
        public String getVideoRate() {
            return this.videoRate;
        }

        public static final class Builder {
            private String audioFps; 
            private String audioRate; 
            private String time; 
            private String videoFps; 
            private String videoRate; 

            private Builder() {
            } 

            private Builder(RateDatas model) {
                this.audioFps = model.audioFps;
                this.audioRate = model.audioRate;
                this.time = model.time;
                this.videoFps = model.videoFps;
                this.videoRate = model.videoRate;
            } 

            /**
             * <p>The audio frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder audioFps(String audioFps) {
                this.audioFps = audioFps;
                return this;
            }

            /**
             * <p>The audio bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder audioRate(String audioRate) {
                this.audioRate = audioRate;
                return this;
            }

            /**
             * <p>The time when the data was collected. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05T18:00:53Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The video frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder videoFps(String videoFps) {
                this.videoFps = videoFps;
                return this;
            }

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1953584</p>
             */
            public Builder videoRate(String videoRate) {
                this.videoRate = videoRate;
                return this;
            }

            public RateDatas build() {
                return new RateDatas(this);
            } 

        } 

    }
}
