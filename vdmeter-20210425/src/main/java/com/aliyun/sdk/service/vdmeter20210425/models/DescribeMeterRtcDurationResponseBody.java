// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcDurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcDurationResponseBody</p>
 */
public class DescribeMeterRtcDurationResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ReadyTs")
    private Long readyTs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcDurationResponseBody(Builder builder) {
        this.data = builder.data;
        this.readyTs = builder.readyTs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcDurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return readyTs
     */
    public Long getReadyTs() {
        return this.readyTs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long readyTs; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ReadyTs.
         */
        public Builder readyTs(Long readyTs) {
            this.readyTs = readyTs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterRtcDurationResponseBody build() {
            return new DescribeMeterRtcDurationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AudioDuration")
        private Long audioDuration;

        @NameInMap("ContentDuration")
        private Long contentDuration;

        @NameInMap("Timestamp")
        private Long timestamp;

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
            this.contentDuration = builder.contentDuration;
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
         * @return contentDuration
         */
        public Long getContentDuration() {
            return this.contentDuration;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
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
            private Long contentDuration; 
            private Long timestamp; 
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
             * ContentDuration.
             */
            public Builder contentDuration(Long contentDuration) {
                this.contentDuration = contentDuration;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
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
