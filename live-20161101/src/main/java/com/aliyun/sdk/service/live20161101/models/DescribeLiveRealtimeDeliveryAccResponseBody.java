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
 * {@link DescribeLiveRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeDeliveryAccResponseBody</p>
 */
public class DescribeLiveRealtimeDeliveryAccResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RealTimeDeliveryAccData")
    private RealTimeDeliveryAccData realTimeDeliveryAccData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveRealtimeDeliveryAccResponseBody model) {
            this.realTimeDeliveryAccData = model.realTimeDeliveryAccData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about real-time log deliveries.</p>
         */
        public Builder realTimeDeliveryAccData(RealTimeDeliveryAccData realTimeDeliveryAccData) {
            this.realTimeDeliveryAccData = realTimeDeliveryAccData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>684306D2-2511-4977-991D-CE97E91FD7C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRealtimeDeliveryAccResponseBody build() {
            return new DescribeLiveRealtimeDeliveryAccResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRealtimeDeliveryAccResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AccData model) {
                this.failedNum = model.failedNum;
                this.successNum = model.successNum;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The number of failed real-time log deliveries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * <p>The number of successful real-time log deliveries.</p>
             * 
             * <strong>example:</strong>
             * <p>321321</p>
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-10T20:00:00Z</p>
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
     * {@link DescribeLiveRealtimeDeliveryAccResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRealtimeDeliveryAccResponseBody</p>
     */
    public static class RealTimeDeliveryAccData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccData")
        private java.util.List<AccData> accData;

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
        public java.util.List<AccData> getAccData() {
            return this.accData;
        }

        public static final class Builder {
            private java.util.List<AccData> accData; 

            private Builder() {
            } 

            private Builder(RealTimeDeliveryAccData model) {
                this.accData = model.accData;
            } 

            /**
             * AccData.
             */
            public Builder accData(java.util.List<AccData> accData) {
                this.accData = accData;
                return this;
            }

            public RealTimeDeliveryAccData build() {
                return new RealTimeDeliveryAccData(this);
            } 

        } 

    }
}
