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
 * {@link DescribeRTSNativeSDKVvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRTSNativeSDKVvDataResponseBody</p>
 */
public class DescribeRTSNativeSDKVvDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("VvData")
    private java.util.List<VvData> vvData;

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
    public java.util.List<VvData> getVvData() {
        return this.vvData;
    }

    public static final class Builder {
        private String dataInterval; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private java.util.List<VvData> vvData; 

        private Builder() {
        } 

        private Builder(DescribeRTSNativeSDKVvDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.vvData = model.vvData;
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

        /**
         * <p>The total number of playbacks and the number of successful playbacks at each interval.</p>
         */
        public Builder vvData(java.util.List<VvData> vvData) {
            this.vvData = vvData;
            return this;
        }

        public DescribeRTSNativeSDKVvDataResponseBody build() {
            return new DescribeRTSNativeSDKVvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRTSNativeSDKVvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRTSNativeSDKVvDataResponseBody</p>
     */
    public static class VvData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("VvSuccess")
        private String vvSuccess;

        @com.aliyun.core.annotation.NameInMap("VvTotal")
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

            private Builder() {
            } 

            private Builder(VvData model) {
                this.timeStamp = model.timeStamp;
                this.vvSuccess = model.vvSuccess;
                this.vvTotal = model.vvTotal;
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
             * <p>The number of successful playbacks within the period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder vvSuccess(String vvSuccess) {
                this.vvSuccess = vvSuccess;
                return this;
            }

            /**
             * <p>The total number of playbacks within the period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
