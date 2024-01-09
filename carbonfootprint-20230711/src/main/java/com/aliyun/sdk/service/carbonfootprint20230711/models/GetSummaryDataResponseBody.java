// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSummaryDataResponseBody</p>
 */
public class GetSummaryDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSummaryDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryDataResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSummaryDataResponseBody build() {
            return new GetSummaryDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("LastMonthConsumptionConversion")
        private String lastMonthConsumptionConversion;

        @NameInMap("LastYearConsumptionConversion")
        private String lastYearConsumptionConversion;

        @NameInMap("LastYearConsumptionConversionSum")
        private String lastYearConsumptionConversionSum;

        @NameInMap("LatestDataTime")
        private String latestDataTime;

        @NameInMap("ThisMonthConsumptionConversion")
        private String thisMonthConsumptionConversion;

        @NameInMap("ThisYearConsumptionConversion")
        private String thisYearConsumptionConversion;

        @NameInMap("TotalCarbonConsumptionConversion")
        private String totalCarbonConsumptionConversion;

        private Data(Builder builder) {
            this.lastMonthConsumptionConversion = builder.lastMonthConsumptionConversion;
            this.lastYearConsumptionConversion = builder.lastYearConsumptionConversion;
            this.lastYearConsumptionConversionSum = builder.lastYearConsumptionConversionSum;
            this.latestDataTime = builder.latestDataTime;
            this.thisMonthConsumptionConversion = builder.thisMonthConsumptionConversion;
            this.thisYearConsumptionConversion = builder.thisYearConsumptionConversion;
            this.totalCarbonConsumptionConversion = builder.totalCarbonConsumptionConversion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return lastMonthConsumptionConversion
         */
        public String getLastMonthConsumptionConversion() {
            return this.lastMonthConsumptionConversion;
        }

        /**
         * @return lastYearConsumptionConversion
         */
        public String getLastYearConsumptionConversion() {
            return this.lastYearConsumptionConversion;
        }

        /**
         * @return lastYearConsumptionConversionSum
         */
        public String getLastYearConsumptionConversionSum() {
            return this.lastYearConsumptionConversionSum;
        }

        /**
         * @return latestDataTime
         */
        public String getLatestDataTime() {
            return this.latestDataTime;
        }

        /**
         * @return thisMonthConsumptionConversion
         */
        public String getThisMonthConsumptionConversion() {
            return this.thisMonthConsumptionConversion;
        }

        /**
         * @return thisYearConsumptionConversion
         */
        public String getThisYearConsumptionConversion() {
            return this.thisYearConsumptionConversion;
        }

        /**
         * @return totalCarbonConsumptionConversion
         */
        public String getTotalCarbonConsumptionConversion() {
            return this.totalCarbonConsumptionConversion;
        }

        public static final class Builder {
            private String lastMonthConsumptionConversion; 
            private String lastYearConsumptionConversion; 
            private String lastYearConsumptionConversionSum; 
            private String latestDataTime; 
            private String thisMonthConsumptionConversion; 
            private String thisYearConsumptionConversion; 
            private String totalCarbonConsumptionConversion; 

            /**
             * LastMonthConsumptionConversion.
             */
            public Builder lastMonthConsumptionConversion(String lastMonthConsumptionConversion) {
                this.lastMonthConsumptionConversion = lastMonthConsumptionConversion;
                return this;
            }

            /**
             * LastYearConsumptionConversion.
             */
            public Builder lastYearConsumptionConversion(String lastYearConsumptionConversion) {
                this.lastYearConsumptionConversion = lastYearConsumptionConversion;
                return this;
            }

            /**
             * LastYearConsumptionConversionSum.
             */
            public Builder lastYearConsumptionConversionSum(String lastYearConsumptionConversionSum) {
                this.lastYearConsumptionConversionSum = lastYearConsumptionConversionSum;
                return this;
            }

            /**
             * LatestDataTime.
             */
            public Builder latestDataTime(String latestDataTime) {
                this.latestDataTime = latestDataTime;
                return this;
            }

            /**
             * ThisMonthConsumptionConversion.
             */
            public Builder thisMonthConsumptionConversion(String thisMonthConsumptionConversion) {
                this.thisMonthConsumptionConversion = thisMonthConsumptionConversion;
                return this;
            }

            /**
             * ThisYearConsumptionConversion.
             */
            public Builder thisYearConsumptionConversion(String thisYearConsumptionConversion) {
                this.thisYearConsumptionConversion = thisYearConsumptionConversion;
                return this;
            }

            /**
             * TotalCarbonConsumptionConversion.
             */
            public Builder totalCarbonConsumptionConversion(String totalCarbonConsumptionConversion) {
                this.totalCarbonConsumptionConversion = totalCarbonConsumptionConversion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
