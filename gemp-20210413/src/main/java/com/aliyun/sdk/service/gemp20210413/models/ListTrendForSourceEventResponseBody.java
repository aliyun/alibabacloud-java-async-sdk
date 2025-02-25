// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrendForSourceEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrendForSourceEventResponseBody</p>
 */
public class ListTrendForSourceEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListTrendForSourceEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrendForSourceEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListTrendForSourceEventResponseBody build() {
            return new ListTrendForSourceEventResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("convergenceRate")
        private String convergenceRate;

        @com.aliyun.core.annotation.NameInMap("maxSustainTime")
        private Long maxSustainTime;

        @com.aliyun.core.annotation.NameInMap("skipDay")
        private Boolean skipDay;

        @com.aliyun.core.annotation.NameInMap("sourceEventsStatMap")
        private java.util.Map < String, ? > sourceEventsStatMap;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.convergenceRate = builder.convergenceRate;
            this.maxSustainTime = builder.maxSustainTime;
            this.skipDay = builder.skipDay;
            this.sourceEventsStatMap = builder.sourceEventsStatMap;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return convergenceRate
         */
        public String getConvergenceRate() {
            return this.convergenceRate;
        }

        /**
         * @return maxSustainTime
         */
        public Long getMaxSustainTime() {
            return this.maxSustainTime;
        }

        /**
         * @return skipDay
         */
        public Boolean getSkipDay() {
            return this.skipDay;
        }

        /**
         * @return sourceEventsStatMap
         */
        public java.util.Map < String, ? > getSourceEventsStatMap() {
            return this.sourceEventsStatMap;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String convergenceRate; 
            private Long maxSustainTime; 
            private Boolean skipDay; 
            private java.util.Map < String, ? > sourceEventsStatMap; 
            private String unit; 

            /**
             * convergenceRate.
             */
            public Builder convergenceRate(String convergenceRate) {
                this.convergenceRate = convergenceRate;
                return this;
            }

            /**
             * maxSustainTime.
             */
            public Builder maxSustainTime(Long maxSustainTime) {
                this.maxSustainTime = maxSustainTime;
                return this;
            }

            /**
             * skipDay.
             */
            public Builder skipDay(Boolean skipDay) {
                this.skipDay = skipDay;
                return this;
            }

            /**
             * sourceEventsStatMap.
             */
            public Builder sourceEventsStatMap(java.util.Map < String, ? > sourceEventsStatMap) {
                this.sourceEventsStatMap = sourceEventsStatMap;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
