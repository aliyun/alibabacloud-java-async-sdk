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
 * {@link DescribeRTSNativeSDKPlayTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKPlayTimeResponseBody</p>
 */
public class DescribeRTSNativeSDKPlayTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PlayTimeData")
    private java.util.List<PlayTimeData> playTimeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
     * @return playTimeData
     */
    public java.util.List<PlayTimeData> getPlayTimeData() {
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
        private java.util.List<PlayTimeData> playTimeData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeRTSNativeSDKPlayTimeResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.endTime = model.endTime;
            this.playTimeData = model.playTimeData;
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
         * <p>The average playback duration and average stuttering duration at each interval. Unit: milliseconds.</p>
         */
        public Builder playTimeData(java.util.List<PlayTimeData> playTimeData) {
            this.playTimeData = playTimeData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7BF95F2A-3B24-4CDE-9346-7F6FA86697A1</p>
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

        public DescribeRTSNativeSDKPlayTimeResponseBody build() {
            return new DescribeRTSNativeSDKPlayTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRTSNativeSDKPlayTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRTSNativeSDKPlayTimeResponseBody</p>
     */
    public static class PlayTimeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlayTime")
        private String playTime;

        @com.aliyun.core.annotation.NameInMap("StallTime")
        private String stallTime;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(PlayTimeData model) {
                this.playTime = model.playTime;
                this.stallTime = model.stallTime;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The average playback duration within the period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder playTime(String playTime) {
                this.playTime = playTime;
                return this;
            }

            /**
             * <p>The average stuttering duration within the period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder stallTime(String stallTime) {
                this.stallTime = stallTime;
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

            public PlayTimeData build() {
                return new PlayTimeData(this);
            } 

        } 

    }
}
