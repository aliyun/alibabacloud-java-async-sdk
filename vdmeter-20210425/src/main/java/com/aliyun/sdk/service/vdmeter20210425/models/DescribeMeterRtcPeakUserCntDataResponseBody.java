// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcPeakUserCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcPeakUserCntDataResponseBody</p>
 */
public class DescribeMeterRtcPeakUserCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterRtcPeakUserCntDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcPeakUserCntDataResponseBody create() {
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

        public DescribeMeterRtcPeakUserCntDataResponseBody build() {
            return new DescribeMeterRtcPeakUserCntDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveUserPeak")
        private Long activeUserPeak;

        @NameInMap("ActiveUserPeakTime")
        private Long activeUserPeakTime;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.activeUserPeak = builder.activeUserPeak;
            this.activeUserPeakTime = builder.activeUserPeakTime;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeUserPeak
         */
        public Long getActiveUserPeak() {
            return this.activeUserPeak;
        }

        /**
         * @return activeUserPeakTime
         */
        public Long getActiveUserPeakTime() {
            return this.activeUserPeakTime;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long activeUserPeak; 
            private Long activeUserPeakTime; 
            private Long timestamp; 

            /**
             * ActiveUserPeak.
             */
            public Builder activeUserPeak(Long activeUserPeak) {
                this.activeUserPeak = activeUserPeak;
                return this;
            }

            /**
             * ActiveUserPeakTime.
             */
            public Builder activeUserPeakTime(Long activeUserPeakTime) {
                this.activeUserPeakTime = activeUserPeakTime;
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
