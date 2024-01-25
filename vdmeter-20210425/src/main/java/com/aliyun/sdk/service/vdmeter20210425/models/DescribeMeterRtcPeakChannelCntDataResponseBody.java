// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcPeakChannelCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcPeakChannelCntDataResponseBody</p>
 */
public class DescribeMeterRtcPeakChannelCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcPeakChannelCntDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcPeakChannelCntDataResponseBody create() {
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

        public DescribeMeterRtcPeakChannelCntDataResponseBody build() {
            return new DescribeMeterRtcPeakChannelCntDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveChannelPeak")
        private Long activeChannelPeak;

        @NameInMap("ActiveChannelPeakTime")
        private Long activeChannelPeakTime;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.activeChannelPeak = builder.activeChannelPeak;
            this.activeChannelPeakTime = builder.activeChannelPeakTime;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeChannelPeak
         */
        public Long getActiveChannelPeak() {
            return this.activeChannelPeak;
        }

        /**
         * @return activeChannelPeakTime
         */
        public Long getActiveChannelPeakTime() {
            return this.activeChannelPeakTime;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long activeChannelPeak; 
            private Long activeChannelPeakTime; 
            private Long timestamp; 

            /**
             * ActiveChannelPeak.
             */
            public Builder activeChannelPeak(Long activeChannelPeak) {
                this.activeChannelPeak = activeChannelPeak;
                return this;
            }

            /**
             * ActiveChannelPeakTime.
             */
            public Builder activeChannelPeakTime(Long activeChannelPeakTime) {
                this.activeChannelPeakTime = activeChannelPeakTime;
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
