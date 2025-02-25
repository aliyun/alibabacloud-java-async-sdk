// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetEmissionSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmissionSummaryResponseBody</p>
 */
public class GetEmissionSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEmissionSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmissionSummaryResponseBody create() {
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
         * <p>Details of summarized data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEmissionSummaryResponseBody build() {
            return new GetEmissionSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEmissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmissionSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualEmissionRatio")
        private Double actualEmissionRatio;

        @com.aliyun.core.annotation.NameInMap("carbonSaveConversion")
        private Double carbonSaveConversion;

        @com.aliyun.core.annotation.NameInMap("currentPeriodCarbonEmissionData")
        private Double currentPeriodCarbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("isWeighting")
        private Boolean isWeighting;

        @com.aliyun.core.annotation.NameInMap("lastPeriodCarbonEmissionData")
        private Double lastPeriodCarbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("lastPeriodWeightingCarbonEmissionData")
        private Double lastPeriodWeightingCarbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        @com.aliyun.core.annotation.NameInMap("totalCarbonEmissionData")
        private Double totalCarbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("weightingCarbonEmissionData")
        private Double weightingCarbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("weightingRatio")
        private Double weightingRatio;

        private Data(Builder builder) {
            this.actualEmissionRatio = builder.actualEmissionRatio;
            this.carbonSaveConversion = builder.carbonSaveConversion;
            this.currentPeriodCarbonEmissionData = builder.currentPeriodCarbonEmissionData;
            this.isWeighting = builder.isWeighting;
            this.lastPeriodCarbonEmissionData = builder.lastPeriodCarbonEmissionData;
            this.lastPeriodWeightingCarbonEmissionData = builder.lastPeriodWeightingCarbonEmissionData;
            this.ratio = builder.ratio;
            this.totalCarbonEmissionData = builder.totalCarbonEmissionData;
            this.weightingCarbonEmissionData = builder.weightingCarbonEmissionData;
            this.weightingRatio = builder.weightingRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actualEmissionRatio
         */
        public Double getActualEmissionRatio() {
            return this.actualEmissionRatio;
        }

        /**
         * @return carbonSaveConversion
         */
        public Double getCarbonSaveConversion() {
            return this.carbonSaveConversion;
        }

        /**
         * @return currentPeriodCarbonEmissionData
         */
        public Double getCurrentPeriodCarbonEmissionData() {
            return this.currentPeriodCarbonEmissionData;
        }

        /**
         * @return isWeighting
         */
        public Boolean getIsWeighting() {
            return this.isWeighting;
        }

        /**
         * @return lastPeriodCarbonEmissionData
         */
        public Double getLastPeriodCarbonEmissionData() {
            return this.lastPeriodCarbonEmissionData;
        }

        /**
         * @return lastPeriodWeightingCarbonEmissionData
         */
        public Double getLastPeriodWeightingCarbonEmissionData() {
            return this.lastPeriodWeightingCarbonEmissionData;
        }

        /**
         * @return ratio
         */
        public Double getRatio() {
            return this.ratio;
        }

        /**
         * @return totalCarbonEmissionData
         */
        public Double getTotalCarbonEmissionData() {
            return this.totalCarbonEmissionData;
        }

        /**
         * @return weightingCarbonEmissionData
         */
        public Double getWeightingCarbonEmissionData() {
            return this.weightingCarbonEmissionData;
        }

        /**
         * @return weightingRatio
         */
        public Double getWeightingRatio() {
            return this.weightingRatio;
        }

        public static final class Builder {
            private Double actualEmissionRatio; 
            private Double carbonSaveConversion; 
            private Double currentPeriodCarbonEmissionData; 
            private Boolean isWeighting; 
            private Double lastPeriodCarbonEmissionData; 
            private Double lastPeriodWeightingCarbonEmissionData; 
            private Double ratio; 
            private Double totalCarbonEmissionData; 
            private Double weightingCarbonEmissionData; 
            private Double weightingRatio; 

            /**
             * <p>Percentage of scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>2.7657</p>
             */
            public Builder actualEmissionRatio(Double actualEmissionRatio) {
                this.actualEmissionRatio = actualEmissionRatio;
                return this;
            }

            /**
             * <p>Carbon emissions reduction.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder carbonSaveConversion(Double carbonSaveConversion) {
                this.carbonSaveConversion = carbonSaveConversion;
                return this;
            }

            /**
             * <p>Statistical indicators for this cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>276.4</p>
             */
            public Builder currentPeriodCarbonEmissionData(Double currentPeriodCarbonEmissionData) {
                this.currentPeriodCarbonEmissionData = currentPeriodCarbonEmissionData;
                return this;
            }

            /**
             * <p>Whether to show the weighting ratio carbon emission.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isWeighting(Boolean isWeighting) {
                this.isWeighting = isWeighting;
                return this;
            }

            /**
             * <p>Last period statistical indicators.</p>
             * 
             * <strong>example:</strong>
             * <p>9.40100</p>
             */
            public Builder lastPeriodCarbonEmissionData(Double lastPeriodCarbonEmissionData) {
                this.lastPeriodCarbonEmissionData = lastPeriodCarbonEmissionData;
                return this;
            }

            /**
             * <p>Calculation of carbon emissions based on shareholding ratio in the last cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>8.4609</p>
             */
            public Builder lastPeriodWeightingCarbonEmissionData(Double lastPeriodWeightingCarbonEmissionData) {
                this.lastPeriodWeightingCarbonEmissionData = lastPeriodWeightingCarbonEmissionData;
                return this;
            }

            /**
             * <p>Year-on-year.</p>
             * 
             * <strong>example:</strong>
             * <p>28.410</p>
             */
            public Builder ratio(Double ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>Total carbon emissions.</p>
             * 
             * <strong>example:</strong>
             * <p>276.46</p>
             */
            public Builder totalCarbonEmissionData(Double totalCarbonEmissionData) {
                this.totalCarbonEmissionData = totalCarbonEmissionData;
                return this;
            }

            /**
             * <p>Calculate carbon emissions by share ratio</p>
             * 
             * <strong>example:</strong>
             * <p>248.81400</p>
             */
            public Builder weightingCarbonEmissionData(Double weightingCarbonEmissionData) {
                this.weightingCarbonEmissionData = weightingCarbonEmissionData;
                return this;
            }

            /**
             * <p>Year-on-year of weighting ratio carbon emissions.</p>
             * 
             * <strong>example:</strong>
             * <p>28.4102</p>
             */
            public Builder weightingRatio(Double weightingRatio) {
                this.weightingRatio = weightingRatio;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
