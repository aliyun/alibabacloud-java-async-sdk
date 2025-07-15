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
 * {@link DescribeRTSNativeSDKFirstFrameCostResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameCostResponseBody</p>
 */
public class DescribeRTSNativeSDKFirstFrameCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FirstFrameCostData")
    private java.util.List<FirstFrameCostData> firstFrameCostData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKFirstFrameCostResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.endTime = builder.endTime;
        this.firstFrameCostData = builder.firstFrameCostData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKFirstFrameCostResponseBody create() {
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
     * @return firstFrameCostData
     */
    public java.util.List<FirstFrameCostData> getFirstFrameCostData() {
        return this.firstFrameCostData;
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
        private java.util.List<FirstFrameCostData> firstFrameCostData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeRTSNativeSDKFirstFrameCostResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.endTime = model.endTime;
            this.firstFrameCostData = model.firstFrameCostData;
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
        public Builder firstFrameCostData(java.util.List<FirstFrameCostData> firstFrameCostData) {
            this.firstFrameCostData = firstFrameCostData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
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

        public DescribeRTSNativeSDKFirstFrameCostResponseBody build() {
            return new DescribeRTSNativeSDKFirstFrameCostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRTSNativeSDKFirstFrameCostResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRTSNativeSDKFirstFrameCostResponseBody</p>
     */
    public static class FirstFrameCostData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connected")
        private String connected;

        @com.aliyun.core.annotation.NameInMap("FinishGetStreamInfo")
        private String finishGetStreamInfo;

        @com.aliyun.core.annotation.NameInMap("FirstFrameComplete")
        private String firstFrameComplete;

        @com.aliyun.core.annotation.NameInMap("FirstPacket")
        private String firstPacket;

        @com.aliyun.core.annotation.NameInMap("Initialized")
        private String initialized;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private FirstFrameCostData(Builder builder) {
            this.connected = builder.connected;
            this.finishGetStreamInfo = builder.finishGetStreamInfo;
            this.firstFrameComplete = builder.firstFrameComplete;
            this.firstPacket = builder.firstPacket;
            this.initialized = builder.initialized;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstFrameCostData create() {
            return builder().build();
        }

        /**
         * @return connected
         */
        public String getConnected() {
            return this.connected;
        }

        /**
         * @return finishGetStreamInfo
         */
        public String getFinishGetStreamInfo() {
            return this.finishGetStreamInfo;
        }

        /**
         * @return firstFrameComplete
         */
        public String getFirstFrameComplete() {
            return this.firstFrameComplete;
        }

        /**
         * @return firstPacket
         */
        public String getFirstPacket() {
            return this.firstPacket;
        }

        /**
         * @return initialized
         */
        public String getInitialized() {
            return this.initialized;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String connected; 
            private String finishGetStreamInfo; 
            private String firstFrameComplete; 
            private String firstPacket; 
            private String initialized; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(FirstFrameCostData model) {
                this.connected = model.connected;
                this.finishGetStreamInfo = model.finishGetStreamInfo;
                this.firstFrameComplete = model.firstFrameComplete;
                this.firstPacket = model.firstPacket;
                this.initialized = model.initialized;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The time elapsed from initialization to connection establishment.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder connected(String connected) {
                this.connected = connected;
                return this;
            }

            /**
             * <p>The time elapsed from connection establishment to subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder finishGetStreamInfo(String finishGetStreamInfo) {
                this.finishGetStreamInfo = finishGetStreamInfo;
                return this;
            }

            /**
             * <p>The time elapsed from first packet processing to display of the first frame.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder firstFrameComplete(String firstFrameComplete) {
                this.firstFrameComplete = firstFrameComplete;
                return this;
            }

            /**
             * <p>The time elapsed from subscription to first packet processing.</p>
             * 
             * <strong>example:</strong>
             * <p>132</p>
             */
            public Builder firstPacket(String firstPacket) {
                this.firstPacket = firstPacket;
                return this;
            }

            /**
             * <p>The time consumed by initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>1100</p>
             */
            public Builder initialized(String initialized) {
                this.initialized = initialized;
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

            public FirstFrameCostData build() {
                return new FirstFrameCostData(this);
            } 

        } 

    }
}
