// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRealtimeDeliveryAccResponseBody</p>
 */
public class DescribeRealtimeDeliveryAccResponseBody extends TeaModel {
    @NameInMap("ReatTimeDeliveryAccData")
    private ReatTimeDeliveryAccData reatTimeDeliveryAccData;

    @NameInMap("RequestId")
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
         * The statistics about real-time log deliveries.
         */
        public Builder reatTimeDeliveryAccData(ReatTimeDeliveryAccData reatTimeDeliveryAccData) {
            this.reatTimeDeliveryAccData = reatTimeDeliveryAccData;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRealtimeDeliveryAccResponseBody build() {
            return new DescribeRealtimeDeliveryAccResponseBody(this);
        } 

    } 

    public static class AccData extends TeaModel {
        @NameInMap("FailedNum")
        private Integer failedNum;

        @NameInMap("SuccessNum")
        private Integer successNum;

        @NameInMap("TimeStamp")
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
             * The number of failed attempts to deliver log data to Log Service.
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * The number of successful deliveries of log data to Log Service.
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * The timestamp of the data returned.
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
    public static class ReatTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        private java.util.List < AccData> accData;

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
        public java.util.List < AccData> getAccData() {
            return this.accData;
        }

        public static final class Builder {
            private java.util.List < AccData> accData; 

            /**
             * AccData.
             */
            public Builder accData(java.util.List < AccData> accData) {
                this.accData = accData;
                return this;
            }

            public ReatTimeDeliveryAccData build() {
                return new ReatTimeDeliveryAccData(this);
            } 

        } 

    }
}
