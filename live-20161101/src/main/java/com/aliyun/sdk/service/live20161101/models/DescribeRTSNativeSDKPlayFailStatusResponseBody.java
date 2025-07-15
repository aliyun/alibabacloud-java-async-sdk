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
 * {@link DescribeRTSNativeSDKPlayFailStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKPlayFailStatusResponseBody</p>
 */
public class DescribeRTSNativeSDKPlayFailStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PlayFailStatus")
    private java.util.List<PlayFailStatus> playFailStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
     * @return playFailStatus
     */
    public java.util.List<PlayFailStatus> getPlayFailStatus() {
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
        private java.util.List<PlayFailStatus> playFailStatus; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeRTSNativeSDKPlayFailStatusResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.endTime = model.endTime;
            this.playFailStatus = model.playFailStatus;
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
         * <p>The number of error status codes at each interval.</p>
         */
        public Builder playFailStatus(java.util.List<PlayFailStatus> playFailStatus) {
            this.playFailStatus = playFailStatus;
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

        public DescribeRTSNativeSDKPlayFailStatusResponseBody build() {
            return new DescribeRTSNativeSDKPlayFailStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRTSNativeSDKPlayFailStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRTSNativeSDKPlayFailStatusResponseBody</p>
     */
    public static class PlayFailStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("V20001")
        private String v20001;

        @com.aliyun.core.annotation.NameInMap("V20002")
        private String v20002;

        @com.aliyun.core.annotation.NameInMap("V20011")
        private String v20011;

        @com.aliyun.core.annotation.NameInMap("V20012")
        private String v20012;

        @com.aliyun.core.annotation.NameInMap("V20013")
        private String v20013;

        @com.aliyun.core.annotation.NameInMap("V20052")
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

            private Builder() {
            } 

            private Builder(PlayFailStatus model) {
                this.timeStamp = model.timeStamp;
                this.v20001 = model.v20001;
                this.v20002 = model.v20002;
                this.v20011 = model.v20011;
                this.v20012 = model.v20012;
                this.v20013 = model.v20013;
                this.v20052 = model.v20052;
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

            /**
             * <p>The status code that indicates failed DNS resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder v20001(String v20001) {
                this.v20001 = v20001;
                return this;
            }

            /**
             * <p>The status code that indicates failed authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder v20002(String v20002) {
                this.v20002 = v20002;
                return this;
            }

            /**
             * <p>The status code that indicates a connection signaling timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder v20011(String v20011) {
                this.v20011 = v20011;
                return this;
            }

            /**
             * <p>The status code that indicates a subscription signaling error.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder v20012(String v20012) {
                this.v20012 = v20012;
                return this;
            }

            /**
             * <p>The status code indicating that the stream to subscribe to does not exist.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder v20013(String v20013) {
                this.v20013 = v20013;
                return this;
            }

            /**
             * <p>The status code that indicates a media packet collection timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
