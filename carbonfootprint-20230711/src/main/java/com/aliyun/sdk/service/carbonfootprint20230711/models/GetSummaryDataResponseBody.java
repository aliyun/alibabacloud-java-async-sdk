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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
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
        @NameInMap("AircraftConsumptionConversion")
        private String aircraftConsumptionConversion;

        @NameInMap("CarConsumptionConversion")
        private String carConsumptionConversion;

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

        @NameInMap("TreeConsumptionConversion")
        private String treeConsumptionConversion;

        private Data(Builder builder) {
            this.aircraftConsumptionConversion = builder.aircraftConsumptionConversion;
            this.carConsumptionConversion = builder.carConsumptionConversion;
            this.lastMonthConsumptionConversion = builder.lastMonthConsumptionConversion;
            this.lastYearConsumptionConversion = builder.lastYearConsumptionConversion;
            this.lastYearConsumptionConversionSum = builder.lastYearConsumptionConversionSum;
            this.latestDataTime = builder.latestDataTime;
            this.thisMonthConsumptionConversion = builder.thisMonthConsumptionConversion;
            this.thisYearConsumptionConversion = builder.thisYearConsumptionConversion;
            this.totalCarbonConsumptionConversion = builder.totalCarbonConsumptionConversion;
            this.treeConsumptionConversion = builder.treeConsumptionConversion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aircraftConsumptionConversion
         */
        public String getAircraftConsumptionConversion() {
            return this.aircraftConsumptionConversion;
        }

        /**
         * @return carConsumptionConversion
         */
        public String getCarConsumptionConversion() {
            return this.carConsumptionConversion;
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

        /**
         * @return treeConsumptionConversion
         */
        public String getTreeConsumptionConversion() {
            return this.treeConsumptionConversion;
        }

        public static final class Builder {
            private String aircraftConsumptionConversion; 
            private String carConsumptionConversion; 
            private String lastMonthConsumptionConversion; 
            private String lastYearConsumptionConversion; 
            private String lastYearConsumptionConversionSum; 
            private String latestDataTime; 
            private String thisMonthConsumptionConversion; 
            private String thisYearConsumptionConversion; 
            private String totalCarbonConsumptionConversion; 
            private String treeConsumptionConversion; 

            /**
             * Converted aircraft carbon emissions.
             */
            public Builder aircraftConsumptionConversion(String aircraftConsumptionConversion) {
                this.aircraftConsumptionConversion = aircraftConsumptionConversion;
                return this;
            }

            /**
             * Converted car carbon emissions.
             */
            public Builder carConsumptionConversion(String carConsumptionConversion) {
                this.carConsumptionConversion = carConsumptionConversion;
                return this;
            }

            /**
             * The carbon emissions in the previous month, in kgCO₂e.
             */
            public Builder lastMonthConsumptionConversion(String lastMonthConsumptionConversion) {
                this.lastMonthConsumptionConversion = lastMonthConsumptionConversion;
                return this;
            }

            /**
             * The carbon emissions in the same month of the previous year, in kgCO₂e.
             */
            public Builder lastYearConsumptionConversion(String lastYearConsumptionConversion) {
                this.lastYearConsumptionConversion = lastYearConsumptionConversion;
                return this;
            }

            /**
             * The carbon emissions of the previous year, in kgCO₂e.
             */
            public Builder lastYearConsumptionConversionSum(String lastYearConsumptionConversionSum) {
                this.lastYearConsumptionConversionSum = lastYearConsumptionConversionSum;
                return this;
            }

            /**
             * The point in time at which the data is last updated.
             */
            public Builder latestDataTime(String latestDataTime) {
                this.latestDataTime = latestDataTime;
                return this;
            }

            /**
             * The carbon emissions in this month, in kgCO₂e.
             */
            public Builder thisMonthConsumptionConversion(String thisMonthConsumptionConversion) {
                this.thisMonthConsumptionConversion = thisMonthConsumptionConversion;
                return this;
            }

            /**
             * The carbon emissions in the year of this month, in kgCO₂e.
             */
            public Builder thisYearConsumptionConversion(String thisYearConsumptionConversion) {
                this.thisYearConsumptionConversion = thisYearConsumptionConversion;
                return this;
            }

            /**
             * The total carbon emissions within the specified time range, in kgCO₂e.
             */
            public Builder totalCarbonConsumptionConversion(String totalCarbonConsumptionConversion) {
                this.totalCarbonConsumptionConversion = totalCarbonConsumptionConversion;
                return this;
            }

            /**
             * Converted tree carbon absorption.
             */
            public Builder treeConsumptionConversion(String treeConsumptionConversion) {
                this.treeConsumptionConversion = treeConsumptionConversion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
