// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKFirstFrameDelayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameDelayResponseBody</p>
 */
public class DescribeRTSNativeSDKFirstFrameDelayResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FrameDelayData")
    private java.util.List < FrameDelayData> frameDelayData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKFirstFrameDelayResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.endTime = builder.endTime;
        this.frameDelayData = builder.frameDelayData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKFirstFrameDelayResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return frameDelayData
     */
    public java.util.List < FrameDelayData> getFrameDelayData() {
        return this.frameDelayData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String dataInterval; 
        private String endTime; 
        private java.util.List < FrameDelayData> frameDelayData; 
        private String requestId; 
        private String startTime; 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * FrameDelayData.
         */
        public Builder frameDelayData(java.util.List < FrameDelayData> frameDelayData) {
            this.frameDelayData = frameDelayData;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeRTSNativeSDKFirstFrameDelayResponseBody build() {
            return new DescribeRTSNativeSDKFirstFrameDelayResponseBody(this);
        } 

    } 

    public static class FrameDelayData extends TeaModel {
        @NameInMap("FrameDelay")
        private String frameDelay;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private FrameDelayData(Builder builder) {
            this.frameDelay = builder.frameDelay;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameDelayData create() {
            return builder().build();
        }

        /**
         * @return frameDelay
         */
        public String getFrameDelay() {
            return this.frameDelay;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String frameDelay; 
            private String timeStamp; 

            /**
             * FrameDelay.
             */
            public Builder frameDelay(String frameDelay) {
                this.frameDelay = frameDelay;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public FrameDelayData build() {
                return new FrameDelayData(this);
            } 

        } 

    }
}
