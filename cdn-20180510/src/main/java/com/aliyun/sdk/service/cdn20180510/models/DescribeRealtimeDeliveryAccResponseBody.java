// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRealtimeDeliveryAccResponseBody</p>
 */
public class DescribeRealtimeDeliveryAccResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReatTimeDeliveryAccData")
    private ReatTimeDeliveryAccData reatTimeDeliveryAccData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRealtimeDeliveryAccResponseBody(Builder builder) {
        this.reatTimeDeliveryAccData = builder.reatTimeDeliveryAccData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRealtimeDeliveryAccResponseBody create() {
        return builder().build();
    }

    /**
     * @return reatTimeDeliveryAccData
     */
    public ReatTimeDeliveryAccData getReatTimeDeliveryAccData() {
        return this.reatTimeDeliveryAccData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ReatTimeDeliveryAccData reatTimeDeliveryAccData; 
        private String requestId; 

        /**
         * <p>The statistics about real-time log deliveries.</p>
         */
        public Builder reatTimeDeliveryAccData(ReatTimeDeliveryAccData reatTimeDeliveryAccData) {
            this.reatTimeDeliveryAccData = reatTimeDeliveryAccData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>684306D2-2511-4977-991D-CE97E91FD7C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRealtimeDeliveryAccResponseBody build() {
            return new DescribeRealtimeDeliveryAccResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRealtimeDeliveryAccResponseBody</p>
     */
    public static class AccData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedNum")
        private Integer failedNum;

        @com.aliyun.core.annotation.NameInMap("SuccessNum")
        private Integer successNum;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private AccData(Builder builder) {
            this.failedNum = builder.failedNum;
            this.successNum = builder.successNum;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccData create() {
            return builder().build();
        }

        /**
         * @return failedNum
         */
        public Integer getFailedNum() {
            return this.failedNum;
        }

        /**
         * @return successNum
         */
        public Integer getSuccessNum() {
            return this.successNum;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Integer failedNum; 
            private Integer successNum; 
            private String timeStamp; 

            /**
             * <p>The number of failed attempts to deliver log data to Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * <p>The number of successful deliveries of log data to Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-03T06:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public AccData build() {
                return new AccData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRealtimeDeliveryAccResponseBody</p>
     */
    public static class ReatTimeDeliveryAccData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccData")
        private java.util.List<AccData> accData;

        private ReatTimeDeliveryAccData(Builder builder) {
            this.accData = builder.accData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReatTimeDeliveryAccData create() {
            return builder().build();
        }

        /**
         * @return accData
         */
        public java.util.List<AccData> getAccData() {
            return this.accData;
        }

        public static final class Builder {
            private java.util.List<AccData> accData; 

            /**
             * AccData.
             */
            public Builder accData(java.util.List<AccData> accData) {
                this.accData = accData;
                return this;
            }

            public ReatTimeDeliveryAccData build() {
                return new ReatTimeDeliveryAccData(this);
            } 

        } 

    }
}
