// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExpenseSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetExpenseSummaryResponseBody</p>
 */
public class GetExpenseSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetExpenseSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExpenseSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExpenseSummaryResponseBody build() {
            return new GetExpenseSummaryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CoverRate")
        private Float coverRate;

        @NameInMap("ForecastFluency")
        private Float forecastFluency;

        @NameInMap("ShareRate")
        private Float shareRate;

        @NameInMap("TopBandwidth")
        private Long topBandwidth;

        @NameInMap("TotalTraffic")
        private Long totalTraffic;

        @NameInMap("TotalUV")
        private Integer totalUV;

        private Data(Builder builder) {
            this.coverRate = builder.coverRate;
            this.forecastFluency = builder.forecastFluency;
            this.shareRate = builder.shareRate;
            this.topBandwidth = builder.topBandwidth;
            this.totalTraffic = builder.totalTraffic;
            this.totalUV = builder.totalUV;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coverRate
         */
        public Float getCoverRate() {
            return this.coverRate;
        }

        /**
         * @return forecastFluency
         */
        public Float getForecastFluency() {
            return this.forecastFluency;
        }

        /**
         * @return shareRate
         */
        public Float getShareRate() {
            return this.shareRate;
        }

        /**
         * @return topBandwidth
         */
        public Long getTopBandwidth() {
            return this.topBandwidth;
        }

        /**
         * @return totalTraffic
         */
        public Long getTotalTraffic() {
            return this.totalTraffic;
        }

        /**
         * @return totalUV
         */
        public Integer getTotalUV() {
            return this.totalUV;
        }

        public static final class Builder {
            private Float coverRate; 
            private Float forecastFluency; 
            private Float shareRate; 
            private Long topBandwidth; 
            private Long totalTraffic; 
            private Integer totalUV; 

            /**
             * CoverRate.
             */
            public Builder coverRate(Float coverRate) {
                this.coverRate = coverRate;
                return this;
            }

            /**
             * ForecastFluency.
             */
            public Builder forecastFluency(Float forecastFluency) {
                this.forecastFluency = forecastFluency;
                return this;
            }

            /**
             * ShareRate.
             */
            public Builder shareRate(Float shareRate) {
                this.shareRate = shareRate;
                return this;
            }

            /**
             * TopBandwidth.
             */
            public Builder topBandwidth(Long topBandwidth) {
                this.topBandwidth = topBandwidth;
                return this;
            }

            /**
             * TotalTraffic.
             */
            public Builder totalTraffic(Long totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            /**
             * TotalUV.
             */
            public Builder totalUV(Integer totalUV) {
                this.totalUV = totalUV;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
