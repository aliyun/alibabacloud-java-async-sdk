// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKPlayFailStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKPlayFailStatusResponseBody</p>
 */
public class DescribeRTSNativeSDKPlayFailStatusResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PlayFailStatus")
    private java.util.List < PlayFailStatus> playFailStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeRTSNativeSDKPlayFailStatusResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.endTime = builder.endTime;
        this.playFailStatus = builder.playFailStatus;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKPlayFailStatusResponseBody create() {
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
     * @return playFailStatus
     */
    public java.util.List < PlayFailStatus> getPlayFailStatus() {
        return this.playFailStatus;
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
        private java.util.List < PlayFailStatus> playFailStatus; 
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
         * PlayFailStatus.
         */
        public Builder playFailStatus(java.util.List < PlayFailStatus> playFailStatus) {
            this.playFailStatus = playFailStatus;
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

        public DescribeRTSNativeSDKPlayFailStatusResponseBody build() {
            return new DescribeRTSNativeSDKPlayFailStatusResponseBody(this);
        } 

    } 

    public static class PlayFailStatus extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("V20001")
        private String v20001;

        @NameInMap("V20002")
        private String v20002;

        @NameInMap("V20011")
        private String v20011;

        @NameInMap("V20012")
        private String v20012;

        @NameInMap("V20013")
        private String v20013;

        @NameInMap("V20052")
        private String v20052;

        private PlayFailStatus(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.v20001 = builder.v20001;
            this.v20002 = builder.v20002;
            this.v20011 = builder.v20011;
            this.v20012 = builder.v20012;
            this.v20013 = builder.v20013;
            this.v20052 = builder.v20052;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayFailStatus create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return v20001
         */
        public String getV20001() {
            return this.v20001;
        }

        /**
         * @return v20002
         */
        public String getV20002() {
            return this.v20002;
        }

        /**
         * @return v20011
         */
        public String getV20011() {
            return this.v20011;
        }

        /**
         * @return v20012
         */
        public String getV20012() {
            return this.v20012;
        }

        /**
         * @return v20013
         */
        public String getV20013() {
            return this.v20013;
        }

        /**
         * @return v20052
         */
        public String getV20052() {
            return this.v20052;
        }

        public static final class Builder {
            private String timeStamp; 
            private String v20001; 
            private String v20002; 
            private String v20011; 
            private String v20012; 
            private String v20013; 
            private String v20052; 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * V20001.
             */
            public Builder v20001(String v20001) {
                this.v20001 = v20001;
                return this;
            }

            /**
             * V20002.
             */
            public Builder v20002(String v20002) {
                this.v20002 = v20002;
                return this;
            }

            /**
             * V20011.
             */
            public Builder v20011(String v20011) {
                this.v20011 = v20011;
                return this;
            }

            /**
             * V20012.
             */
            public Builder v20012(String v20012) {
                this.v20012 = v20012;
                return this;
            }

            /**
             * V20013.
             */
            public Builder v20013(String v20013) {
                this.v20013 = v20013;
                return this;
            }

            /**
             * V20052.
             */
            public Builder v20052(String v20052) {
                this.v20052 = v20052;
                return this;
            }

            public PlayFailStatus build() {
                return new PlayFailStatus(this);
            } 

        } 

    }
}
