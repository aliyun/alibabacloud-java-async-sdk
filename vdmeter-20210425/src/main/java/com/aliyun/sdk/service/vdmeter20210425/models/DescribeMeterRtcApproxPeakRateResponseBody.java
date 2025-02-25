// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcApproxPeakRateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcApproxPeakRateResponseBody</p>
 */
public class DescribeMeterRtcApproxPeakRateResponseBody extends TeaModel {
    @NameInMap("ApproxPeakRate")
    private Float approxPeakRate;

    @NameInMap("ApproxPeakTs")
    private Long approxPeakTs;

    @NameInMap("PeakRateVoList")
    private java.util.List < PeakRateVoList> peakRateVoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcApproxPeakRateResponseBody(Builder builder) {
        this.approxPeakRate = builder.approxPeakRate;
        this.approxPeakTs = builder.approxPeakTs;
        this.peakRateVoList = builder.peakRateVoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcApproxPeakRateResponseBody create() {
        return builder().build();
    }

    /**
     * @return approxPeakRate
     */
    public Float getApproxPeakRate() {
        return this.approxPeakRate;
    }

    /**
     * @return approxPeakTs
     */
    public Long getApproxPeakTs() {
        return this.approxPeakTs;
    }

    /**
     * @return peakRateVoList
     */
    public java.util.List < PeakRateVoList> getPeakRateVoList() {
        return this.peakRateVoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Float approxPeakRate; 
        private Long approxPeakTs; 
        private java.util.List < PeakRateVoList> peakRateVoList; 
        private String requestId; 

        /**
         * ApproxPeakRate.
         */
        public Builder approxPeakRate(Float approxPeakRate) {
            this.approxPeakRate = approxPeakRate;
            return this;
        }

        /**
         * ApproxPeakTs.
         */
        public Builder approxPeakTs(Long approxPeakTs) {
            this.approxPeakTs = approxPeakTs;
            return this;
        }

        /**
         * PeakRateVoList.
         */
        public Builder peakRateVoList(java.util.List < PeakRateVoList> peakRateVoList) {
            this.peakRateVoList = peakRateVoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterRtcApproxPeakRateResponseBody build() {
            return new DescribeMeterRtcApproxPeakRateResponseBody(this);
        } 

    } 

    public static class PeakRateVoList extends TeaModel {
        @NameInMap("PeakRate")
        private Float peakRate;

        @NameInMap("PeakTs")
        private Long peakTs;

        @NameInMap("Timestamp")
        private Long timestamp;

        private PeakRateVoList(Builder builder) {
            this.peakRate = builder.peakRate;
            this.peakTs = builder.peakTs;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeakRateVoList create() {
            return builder().build();
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
            private Float peakRate; 
            private Long peakTs; 
            private Long timestamp; 

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

            public PeakRateVoList build() {
                return new PeakRateVoList(this);
            } 

        } 

    }
}
