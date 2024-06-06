// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAreaElecConstituteResponseBody} extends {@link TeaModel}
 *
 * <p>GetAreaElecConstituteResponseBody</p>
 */
public class GetAreaElecConstituteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAreaElecConstituteResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAreaElecConstituteResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String requestId; 

        /**
         * The code returned for the request. A value of Success indicates that the request was successful. Other values indicate that the request failed. You can troubleshoot the error by viewing the error message returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

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

        public GetAreaElecConstituteResponseBody build() {
            return new GetAreaElecConstituteResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("light")
        private java.util.List < CarbonEmissionElecSummaryItem > light;

        @com.aliyun.core.annotation.NameInMap("nuclear")
        private java.util.List < CarbonEmissionElecSummaryItem > nuclear;

        @com.aliyun.core.annotation.NameInMap("renewing")
        private java.util.List < CarbonEmissionElecSummaryItem > renewing;

        @com.aliyun.core.annotation.NameInMap("urban")
        private java.util.List < CarbonEmissionElecSummaryItem > urban;

        @com.aliyun.core.annotation.NameInMap("water")
        private java.util.List < CarbonEmissionElecSummaryItem > water;

        @com.aliyun.core.annotation.NameInMap("wind")
        private java.util.List < CarbonEmissionElecSummaryItem > wind;

        @com.aliyun.core.annotation.NameInMap("zero")
        private java.util.List < CarbonEmissionElecSummaryItem > zero;

        private Data(Builder builder) {
            this.light = builder.light;
            this.nuclear = builder.nuclear;
            this.renewing = builder.renewing;
            this.urban = builder.urban;
            this.water = builder.water;
            this.wind = builder.wind;
            this.zero = builder.zero;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return light
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getLight() {
            return this.light;
        }

        /**
         * @return nuclear
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getNuclear() {
            return this.nuclear;
        }

        /**
         * @return renewing
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getRenewing() {
            return this.renewing;
        }

        /**
         * @return urban
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getUrban() {
            return this.urban;
        }

        /**
         * @return water
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getWater() {
            return this.water;
        }

        /**
         * @return wind
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getWind() {
            return this.wind;
        }

        /**
         * @return zero
         */
        public java.util.List < CarbonEmissionElecSummaryItem > getZero() {
            return this.zero;
        }

        public static final class Builder {
            private java.util.List < CarbonEmissionElecSummaryItem > light; 
            private java.util.List < CarbonEmissionElecSummaryItem > nuclear; 
            private java.util.List < CarbonEmissionElecSummaryItem > renewing; 
            private java.util.List < CarbonEmissionElecSummaryItem > urban; 
            private java.util.List < CarbonEmissionElecSummaryItem > water; 
            private java.util.List < CarbonEmissionElecSummaryItem > wind; 
            private java.util.List < CarbonEmissionElecSummaryItem > zero; 

            /**
             * Photoelectric power consumption and carbon emission data of each enterprise.
             */
            public Builder light(java.util.List < CarbonEmissionElecSummaryItem > light) {
                this.light = light;
                return this;
            }

            /**
             * Data on nuclear power consumption and carbon emissions at each enterprise.
             */
            public Builder nuclear(java.util.List < CarbonEmissionElecSummaryItem > nuclear) {
                this.nuclear = nuclear;
                return this;
            }

            /**
             * Data on renewable electricity consumption and carbon emissions at each enterprise.
             */
            public Builder renewing(java.util.List < CarbonEmissionElecSummaryItem > renewing) {
                this.renewing = renewing;
                return this;
            }

            /**
             * Data on mains electricity consumption and carbon emission of each enterprise.
             */
            public Builder urban(java.util.List < CarbonEmissionElecSummaryItem > urban) {
                this.urban = urban;
                return this;
            }

            /**
             * Hydropower consumption and carbon emission data of each enterprise.
             */
            public Builder water(java.util.List < CarbonEmissionElecSummaryItem > water) {
                this.water = water;
                return this;
            }

            /**
             * Wind power consumption and carbon emission data of each enterprise.
             */
            public Builder wind(java.util.List < CarbonEmissionElecSummaryItem > wind) {
                this.wind = wind;
                return this;
            }

            /**
             * Data of zero electricity consumption and carbon emission of each enterprise.
             */
            public Builder zero(java.util.List < CarbonEmissionElecSummaryItem > zero) {
                this.zero = zero;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
