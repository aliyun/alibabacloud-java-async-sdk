// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcRtBandWidthUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcRtBandWidthUsageResponseBody</p>
 */
public class DescribeMeterRtcRtBandWidthUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcRtBandWidthUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcRtBandWidthUsageResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBody build() {
            return new DescribeMeterRtcRtBandWidthUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AnchorPeakRate")
        private Float anchorPeakRate;

        @NameInMap("AnchorPeakTs")
        private Long anchorPeakTs;

        @NameInMap("AudiencePeakRate")
        private Float audiencePeakRate;

        @NameInMap("AudiencePeakTs")
        private Long audiencePeakTs;

        @NameInMap("PeakRate")
        private Float peakRate;

        @NameInMap("PeakTs")
        private Long peakTs;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.anchorPeakRate = builder.anchorPeakRate;
            this.anchorPeakTs = builder.anchorPeakTs;
            this.audiencePeakRate = builder.audiencePeakRate;
            this.audiencePeakTs = builder.audiencePeakTs;
            this.peakRate = builder.peakRate;
            this.peakTs = builder.peakTs;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return anchorPeakRate
         */
        public Float getAnchorPeakRate() {
            return this.anchorPeakRate;
        }

        /**
         * @return anchorPeakTs
         */
        public Long getAnchorPeakTs() {
            return this.anchorPeakTs;
        }

        /**
         * @return audiencePeakRate
         */
        public Float getAudiencePeakRate() {
            return this.audiencePeakRate;
        }

        /**
         * @return audiencePeakTs
         */
        public Long getAudiencePeakTs() {
            return this.audiencePeakTs;
        }

        /**
         * @return peakRate
         */
        public Float getPeakRate() {
            return this.peakRate;
        }

        /**
         * @return peakTs
         */
        public Long getPeakTs() {
            return this.peakTs;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Float anchorPeakRate; 
            private Long anchorPeakTs; 
            private Float audiencePeakRate; 
            private Long audiencePeakTs; 
            private Float peakRate; 
            private Long peakTs; 
            private Long timestamp; 

            /**
             * AnchorPeakRate.
             */
            public Builder anchorPeakRate(Float anchorPeakRate) {
                this.anchorPeakRate = anchorPeakRate;
                return this;
            }

            /**
             * AnchorPeakTs.
             */
            public Builder anchorPeakTs(Long anchorPeakTs) {
                this.anchorPeakTs = anchorPeakTs;
                return this;
            }

            /**
             * AudiencePeakRate.
             */
            public Builder audiencePeakRate(Float audiencePeakRate) {
                this.audiencePeakRate = audiencePeakRate;
                return this;
            }

            /**
             * AudiencePeakTs.
             */
            public Builder audiencePeakTs(Long audiencePeakTs) {
                this.audiencePeakTs = audiencePeakTs;
                return this;
            }

            /**
             * PeakRate.
             */
            public Builder peakRate(Float peakRate) {
                this.peakRate = peakRate;
                return this;
            }

            /**
             * PeakTs.
             */
            public Builder peakTs(Long peakTs) {
                this.peakTs = peakTs;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
