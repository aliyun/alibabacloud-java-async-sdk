// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKPlayTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKPlayTimeResponseBody</p>
 */
public class DescribeRTSNativeSDKPlayTimeResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PlayTimeData")
    private java.util.List < PlayTimeData> playTimeData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKPlayTimeResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.endTime = builder.endTime;
        this.playTimeData = builder.playTimeData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKPlayTimeResponseBody create() {
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
     * @return playTimeData
     */
    public java.util.List < PlayTimeData> getPlayTimeData() {
        return this.playTimeData;
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
        private java.util.List < PlayTimeData> playTimeData; 
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
         * PlayTimeData.
         */
        public Builder playTimeData(java.util.List < PlayTimeData> playTimeData) {
            this.playTimeData = playTimeData;
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

        public DescribeRTSNativeSDKPlayTimeResponseBody build() {
            return new DescribeRTSNativeSDKPlayTimeResponseBody(this);
        } 

    } 

    public static class PlayTimeData extends TeaModel {
        @NameInMap("PlayTime")
        private String playTime;

        @NameInMap("StallTime")
        private String stallTime;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private PlayTimeData(Builder builder) {
            this.playTime = builder.playTime;
            this.stallTime = builder.stallTime;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayTimeData create() {
            return builder().build();
        }

        /**
         * @return playTime
         */
        public String getPlayTime() {
            return this.playTime;
        }

        /**
         * @return stallTime
         */
        public String getStallTime() {
            return this.stallTime;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String playTime; 
            private String stallTime; 
            private String timeStamp; 

            /**
             * PlayTime.
             */
            public Builder playTime(String playTime) {
                this.playTime = playTime;
                return this;
            }

            /**
             * StallTime.
             */
            public Builder stallTime(String stallTime) {
                this.stallTime = stallTime;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public PlayTimeData build() {
                return new PlayTimeData(this);
            } 

        } 

    }
}
