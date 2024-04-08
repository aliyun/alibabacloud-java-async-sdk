// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNetworkTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkTrendResponseBody</p>
 */
public class GetNetworkTrendResponseBody extends TeaModel {
    @NameInMap("code")
    private Long code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("success")
    private Boolean success;

    private GetNetworkTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String msg; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNetworkTrendResponseBody build() {
            return new GetNetworkTrendResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("avgCost")
        private Double avgCost;

        @NameInMap("avgResponseTime")
        private Double avgResponseTime;

        @NameInMap("avgTransformBytes")
        private Double avgTransformBytes;

        @NameInMap("requestPerMinute")
        private Double requestPerMinute;

        @NameInMap("timePoint")
        private String timePoint;

        private Data(Builder builder) {
            this.avgCost = builder.avgCost;
            this.avgResponseTime = builder.avgResponseTime;
            this.avgTransformBytes = builder.avgTransformBytes;
            this.requestPerMinute = builder.requestPerMinute;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgCost
         */
        public Double getAvgCost() {
            return this.avgCost;
        }

        /**
         * @return avgResponseTime
         */
        public Double getAvgResponseTime() {
            return this.avgResponseTime;
        }

        /**
         * @return avgTransformBytes
         */
        public Double getAvgTransformBytes() {
            return this.avgTransformBytes;
        }

        /**
         * @return requestPerMinute
         */
        public Double getRequestPerMinute() {
            return this.requestPerMinute;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Double avgCost; 
            private Double avgResponseTime; 
            private Double avgTransformBytes; 
            private Double requestPerMinute; 
            private String timePoint; 

            /**
             * avgCost.
             */
            public Builder avgCost(Double avgCost) {
                this.avgCost = avgCost;
                return this;
            }

            /**
             * avgResponseTime.
             */
            public Builder avgResponseTime(Double avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * avgTransformBytes.
             */
            public Builder avgTransformBytes(Double avgTransformBytes) {
                this.avgTransformBytes = avgTransformBytes;
                return this;
            }

            /**
             * requestPerMinute.
             */
            public Builder requestPerMinute(Double requestPerMinute) {
                this.requestPerMinute = requestPerMinute;
                return this;
            }

            /**
             * timePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
