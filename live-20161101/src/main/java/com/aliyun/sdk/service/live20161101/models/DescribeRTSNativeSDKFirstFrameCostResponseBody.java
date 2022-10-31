// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKFirstFrameCostResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKFirstFrameCostResponseBody</p>
 */
public class DescribeRTSNativeSDKFirstFrameCostResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FirstFrameCostData")
    private java.util.List < FirstFrameCostData> firstFrameCostData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
    public java.util.List < FirstFrameCostData> getFirstFrameCostData() {
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
        private java.util.List < FirstFrameCostData> firstFrameCostData; 
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
         * FirstFrameCostData.
         */
        public Builder firstFrameCostData(java.util.List < FirstFrameCostData> firstFrameCostData) {
            this.firstFrameCostData = firstFrameCostData;
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

        public DescribeRTSNativeSDKFirstFrameCostResponseBody build() {
            return new DescribeRTSNativeSDKFirstFrameCostResponseBody(this);
        } 

    } 

    public static class FirstFrameCostData extends TeaModel {
        @NameInMap("Connected")
        private String connected;

        @NameInMap("FinishGetStreamInfo")
        private String finishGetStreamInfo;

        @NameInMap("FirstFrameComplete")
        private String firstFrameComplete;

        @NameInMap("FirstPacket")
        private String firstPacket;

        @NameInMap("Initialized")
        private String initialized;

        @NameInMap("TimeStamp")
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

            /**
             * Connected.
             */
            public Builder connected(String connected) {
                this.connected = connected;
                return this;
            }

            /**
             * FinishGetStreamInfo.
             */
            public Builder finishGetStreamInfo(String finishGetStreamInfo) {
                this.finishGetStreamInfo = finishGetStreamInfo;
                return this;
            }

            /**
             * FirstFrameComplete.
             */
            public Builder firstFrameComplete(String firstFrameComplete) {
                this.firstFrameComplete = firstFrameComplete;
                return this;
            }

            /**
             * FirstPacket.
             */
            public Builder firstPacket(String firstPacket) {
                this.firstPacket = firstPacket;
                return this;
            }

            /**
             * Initialized.
             */
            public Builder initialized(String initialized) {
                this.initialized = initialized;
                return this;
            }

            /**
             * TimeStamp.
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
