// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterLiveRtcDurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterLiveRtcDurationResponseBody</p>
 */
public class DescribeMeterLiveRtcDurationResponseBody extends TeaModel {
    @NameInMap("AudioSummaryDuration")
    private Long audioSummaryDuration;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSummaryDuration")
    private Long totalSummaryDuration;

    @NameInMap("V1080SummaryDuration")
    private Long v1080SummaryDuration;

    @NameInMap("V480SummaryDuration")
    private Long v480SummaryDuration;

    @NameInMap("V720SummaryDuration")
    private Long v720SummaryDuration;

    private DescribeMeterLiveRtcDurationResponseBody(Builder builder) {
        this.audioSummaryDuration = builder.audioSummaryDuration;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalSummaryDuration = builder.totalSummaryDuration;
        this.v1080SummaryDuration = builder.v1080SummaryDuration;
        this.v480SummaryDuration = builder.v480SummaryDuration;
        this.v720SummaryDuration = builder.v720SummaryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterLiveRtcDurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return audioSummaryDuration
     */
    public Long getAudioSummaryDuration() {
        return this.audioSummaryDuration;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSummaryDuration
     */
    public Long getTotalSummaryDuration() {
        return this.totalSummaryDuration;
    }

    /**
     * @return v1080SummaryDuration
     */
    public Long getV1080SummaryDuration() {
        return this.v1080SummaryDuration;
    }

    /**
     * @return v480SummaryDuration
     */
    public Long getV480SummaryDuration() {
        return this.v480SummaryDuration;
    }

    /**
     * @return v720SummaryDuration
     */
    public Long getV720SummaryDuration() {
        return this.v720SummaryDuration;
    }

    public static final class Builder {
        private Long audioSummaryDuration; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalSummaryDuration; 
        private Long v1080SummaryDuration; 
        private Long v480SummaryDuration; 
        private Long v720SummaryDuration; 

        /**
         * AudioSummaryDuration.
         */
        public Builder audioSummaryDuration(Long audioSummaryDuration) {
            this.audioSummaryDuration = audioSummaryDuration;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalSummaryDuration.
         */
        public Builder totalSummaryDuration(Long totalSummaryDuration) {
            this.totalSummaryDuration = totalSummaryDuration;
            return this;
        }

        /**
         * V1080SummaryDuration.
         */
        public Builder v1080SummaryDuration(Long v1080SummaryDuration) {
            this.v1080SummaryDuration = v1080SummaryDuration;
            return this;
        }

        /**
         * V480SummaryDuration.
         */
        public Builder v480SummaryDuration(Long v480SummaryDuration) {
            this.v480SummaryDuration = v480SummaryDuration;
            return this;
        }

        /**
         * V720SummaryDuration.
         */
        public Builder v720SummaryDuration(Long v720SummaryDuration) {
            this.v720SummaryDuration = v720SummaryDuration;
            return this;
        }

        public DescribeMeterLiveRtcDurationResponseBody build() {
            return new DescribeMeterLiveRtcDurationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AudioDuration")
        private Long audioDuration;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("TotalDuration")
        private Long totalDuration;

        @NameInMap("V1080Duration")
        private Long v1080Duration;

        @NameInMap("V480Duration")
        private Long v480Duration;

        @NameInMap("V720Duration")
        private Long v720Duration;

        private Data(Builder builder) {
            this.audioDuration = builder.audioDuration;
            this.timestamp = builder.timestamp;
            this.totalDuration = builder.totalDuration;
            this.v1080Duration = builder.v1080Duration;
            this.v480Duration = builder.v480Duration;
            this.v720Duration = builder.v720Duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioDuration
         */
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return v1080Duration
         */
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        /**
         * @return v480Duration
         */
        public Long getV480Duration() {
            return this.v480Duration;
        }

        /**
         * @return v720Duration
         */
        public Long getV720Duration() {
            return this.v720Duration;
        }

        public static final class Builder {
            private Long audioDuration; 
            private String timestamp; 
            private Long totalDuration; 
            private Long v1080Duration; 
            private Long v480Duration; 
            private Long v720Duration; 

            /**
             * AudioDuration.
             */
            public Builder audioDuration(Long audioDuration) {
                this.audioDuration = audioDuration;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TotalDuration.
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * V1080Duration.
             */
            public Builder v1080Duration(Long v1080Duration) {
                this.v1080Duration = v1080Duration;
                return this;
            }

            /**
             * V480Duration.
             */
            public Builder v480Duration(Long v480Duration) {
                this.v480Duration = v480Duration;
                return this;
            }

            /**
             * V720Duration.
             */
            public Builder v720Duration(Long v720Duration) {
                this.v720Duration = v720Duration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
