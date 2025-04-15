// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRtcPeakChannelCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcPeakChannelCntDataResponseBody</p>
 */
public class DescribeRtcPeakChannelCntDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PeakChannelCntDataPerInterval")
    private PeakChannelCntDataPerInterval peakChannelCntDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRtcPeakChannelCntDataResponseBody(Builder builder) {
        this.peakChannelCntDataPerInterval = builder.peakChannelCntDataPerInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcPeakChannelCntDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return peakChannelCntDataPerInterval
     */
    public PeakChannelCntDataPerInterval getPeakChannelCntDataPerInterval() {
        return this.peakChannelCntDataPerInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PeakChannelCntDataPerInterval peakChannelCntDataPerInterval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRtcPeakChannelCntDataResponseBody model) {
            this.peakChannelCntDataPerInterval = model.peakChannelCntDataPerInterval;
            this.requestId = model.requestId;
        } 

        /**
         * PeakChannelCntDataPerInterval.
         */
        public Builder peakChannelCntDataPerInterval(PeakChannelCntDataPerInterval peakChannelCntDataPerInterval) {
            this.peakChannelCntDataPerInterval = peakChannelCntDataPerInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRtcPeakChannelCntDataResponseBody build() {
            return new DescribeRtcPeakChannelCntDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcPeakChannelCntDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcPeakChannelCntDataResponseBody</p>
     */
    public static class PeakChannelCntModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveChannelPeak")
        private Long activeChannelPeak;

        @com.aliyun.core.annotation.NameInMap("ActiveChannelPeakTime")
        private String activeChannelPeakTime;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private PeakChannelCntModule(Builder builder) {
            this.activeChannelPeak = builder.activeChannelPeak;
            this.activeChannelPeakTime = builder.activeChannelPeakTime;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeakChannelCntModule create() {
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
        public String getActiveChannelPeakTime() {
            return this.activeChannelPeakTime;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long activeChannelPeak; 
            private String activeChannelPeakTime; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(PeakChannelCntModule model) {
                this.activeChannelPeak = model.activeChannelPeak;
                this.activeChannelPeakTime = model.activeChannelPeakTime;
                this.timeStamp = model.timeStamp;
            } 

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
            public Builder activeChannelPeakTime(String activeChannelPeakTime) {
                this.activeChannelPeakTime = activeChannelPeakTime;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public PeakChannelCntModule build() {
                return new PeakChannelCntModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcPeakChannelCntDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcPeakChannelCntDataResponseBody</p>
     */
    public static class PeakChannelCntDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeakChannelCntModule")
        private java.util.List<PeakChannelCntModule> peakChannelCntModule;

        private PeakChannelCntDataPerInterval(Builder builder) {
            this.peakChannelCntModule = builder.peakChannelCntModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeakChannelCntDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return peakChannelCntModule
         */
        public java.util.List<PeakChannelCntModule> getPeakChannelCntModule() {
            return this.peakChannelCntModule;
        }

        public static final class Builder {
            private java.util.List<PeakChannelCntModule> peakChannelCntModule; 

            private Builder() {
            } 

            private Builder(PeakChannelCntDataPerInterval model) {
                this.peakChannelCntModule = model.peakChannelCntModule;
            } 

            /**
             * PeakChannelCntModule.
             */
            public Builder peakChannelCntModule(java.util.List<PeakChannelCntModule> peakChannelCntModule) {
                this.peakChannelCntModule = peakChannelCntModule;
                return this;
            }

            public PeakChannelCntDataPerInterval build() {
                return new PeakChannelCntDataPerInterval(this);
            } 

        } 

    }
}
