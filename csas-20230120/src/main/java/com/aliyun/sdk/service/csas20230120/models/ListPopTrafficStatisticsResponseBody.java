// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPopTrafficStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPopTrafficStatisticsResponseBody</p>
 */
public class ListPopTrafficStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficData")
    private java.util.List < TrafficData> trafficData;

    private ListPopTrafficStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficData = builder.trafficData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPopTrafficStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficData
     */
    public java.util.List < TrafficData> getTrafficData() {
        return this.trafficData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TrafficData> trafficData; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficData.
         */
        public Builder trafficData(java.util.List < TrafficData> trafficData) {
            this.trafficData = trafficData;
            return this;
        }

        public ListPopTrafficStatisticsResponseBody build() {
            return new ListPopTrafficStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPopTrafficStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPopTrafficStatisticsResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Average")
        private Double average;

        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        private Datapoints(Builder builder) {
            this.average = builder.average;
            this.dateTime = builder.dateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
            return builder().build();
        }

        /**
         * @return average
         */
        public Double getAverage() {
            return this.average;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        public static final class Builder {
            private Double average; 
            private String dateTime; 

            /**
             * Average.
             */
            public Builder average(Double average) {
                this.average = average;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPopTrafficStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPopTrafficStatisticsResponseBody</p>
     */
    public static class TrafficData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datapoints")
        private java.util.List < Datapoints> datapoints;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        private TrafficData(Builder builder) {
            this.datapoints = builder.datapoints;
            this.metricName = builder.metricName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficData create() {
            return builder().build();
        }

        /**
         * @return datapoints
         */
        public java.util.List < Datapoints> getDatapoints() {
            return this.datapoints;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        public static final class Builder {
            private java.util.List < Datapoints> datapoints; 
            private String metricName; 

            /**
             * Datapoints.
             */
            public Builder datapoints(java.util.List < Datapoints> datapoints) {
                this.datapoints = datapoints;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            public TrafficData build() {
                return new TrafficData(this);
            } 

        } 

    }
}
