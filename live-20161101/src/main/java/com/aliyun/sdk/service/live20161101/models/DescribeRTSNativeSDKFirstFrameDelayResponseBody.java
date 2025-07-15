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
 * {@link DescribeRTSNativeSDKFirstFrameDelayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameDelayResponseBody</p>
 */
public class DescribeRTSNativeSDKFirstFrameDelayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FrameDelayData")
    private java.util.List<FrameDelayData> frameDelayData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<FrameDelayData> getFrameDelayData() {
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
        private java.util.List<FrameDelayData> frameDelayData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeRTSNativeSDKFirstFrameDelayResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.endTime = model.endTime;
            this.frameDelayData = model.frameDelayData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The end of the time range for which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The average latency of first frames at each interval. Unit: milliseconds.</p>
         */
        public Builder frameDelayData(java.util.List<FrameDelayData> frameDelayData) {
            this.frameDelayData = frameDelayData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range for which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeRTSNativeSDKFirstFrameDelayResponseBody build() {
            return new DescribeRTSNativeSDKFirstFrameDelayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRTSNativeSDKFirstFrameDelayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRTSNativeSDKFirstFrameDelayResponseBody</p>
     */
    public static class FrameDelayData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameDelay")
        private String frameDelay;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(FrameDelayData model) {
                this.frameDelay = model.frameDelay;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The average latency of first frames within the period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder frameDelay(String frameDelay) {
                this.frameDelay = frameDelay;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-10T20:00:00Z</p>
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
