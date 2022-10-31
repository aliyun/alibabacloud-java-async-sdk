// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRTSNativeSDKVvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKVvDataResponseBody</p>
 */
public class DescribeRTSNativeSDKVvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("VvData")
    private java.util.List < VvData> vvData;

    private DescribeRTSNativeSDKVvDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.vvData = builder.vvData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRTSNativeSDKVvDataResponseBody create() {
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

    /**
     * @return vvData
     */
    public java.util.List < VvData> getVvData() {
        return this.vvData;
    }

    public static final class Builder {
        private String dataInterval; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private java.util.List < VvData> vvData; 

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

        /**
         * VvData.
         */
        public Builder vvData(java.util.List < VvData> vvData) {
            this.vvData = vvData;
            return this;
        }

        public DescribeRTSNativeSDKVvDataResponseBody build() {
            return new DescribeRTSNativeSDKVvDataResponseBody(this);
        } 

    } 

    public static class VvData extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("VvSuccess")
        private String vvSuccess;

        @NameInMap("VvTotal")
        private String vvTotal;

        private VvData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.vvSuccess = builder.vvSuccess;
            this.vvTotal = builder.vvTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VvData create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return vvSuccess
         */
        public String getVvSuccess() {
            return this.vvSuccess;
        }

        /**
         * @return vvTotal
         */
        public String getVvTotal() {
            return this.vvTotal;
        }

        public static final class Builder {
            private String timeStamp; 
            private String vvSuccess; 
            private String vvTotal; 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * VvSuccess.
             */
            public Builder vvSuccess(String vvSuccess) {
                this.vvSuccess = vvSuccess;
                return this;
            }

            /**
             * VvTotal.
             */
            public Builder vvTotal(String vvTotal) {
                this.vvTotal = vvTotal;
                return this;
            }

            public VvData build() {
                return new VvData(this);
            } 

        } 

    }
}
