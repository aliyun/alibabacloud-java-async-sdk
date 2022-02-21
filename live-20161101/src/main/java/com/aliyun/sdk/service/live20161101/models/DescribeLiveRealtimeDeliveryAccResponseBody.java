// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeDeliveryAccResponseBody</p>
 */
public class DescribeLiveRealtimeDeliveryAccResponseBody extends TeaModel {
    @NameInMap("RealTimeDeliveryAccData")
    private RealTimeDeliveryAccData realTimeDeliveryAccData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveRealtimeDeliveryAccResponseBody(Builder builder) {
        this.realTimeDeliveryAccData = builder.realTimeDeliveryAccData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRealtimeDeliveryAccResponseBody create() {
        return builder().build();
    }

    /**
     * @return realTimeDeliveryAccData
     */
    public RealTimeDeliveryAccData getRealTimeDeliveryAccData() {
        return this.realTimeDeliveryAccData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RealTimeDeliveryAccData realTimeDeliveryAccData; 
        private String requestId; 

        /**
         * RealTimeDeliveryAccData.
         */
        public Builder realTimeDeliveryAccData(RealTimeDeliveryAccData realTimeDeliveryAccData) {
            this.realTimeDeliveryAccData = realTimeDeliveryAccData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRealtimeDeliveryAccResponseBody build() {
            return new DescribeLiveRealtimeDeliveryAccResponseBody(this);
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
             * FailedNum.
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * SuccessNum.
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * TimeStamp.
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
    public static class RealTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        private java.util.List < AccData> accData;

        private RealTimeDeliveryAccData(Builder builder) {
            this.accData = builder.accData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeDeliveryAccData create() {
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

            public RealTimeDeliveryAccData build() {
                return new RealTimeDeliveryAccData(this);
            } 

        } 

    }
}
