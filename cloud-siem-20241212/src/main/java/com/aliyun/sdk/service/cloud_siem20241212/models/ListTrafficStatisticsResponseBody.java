// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListTrafficStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficStatisticsResponseBody</p>
 */
public class ListTrafficStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficStatistics")
    private java.util.List<TrafficStatistics> trafficStatistics;

    private ListTrafficStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficStatistics = builder.trafficStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficStatistics
     */
    public java.util.List<TrafficStatistics> getTrafficStatistics() {
        return this.trafficStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TrafficStatistics> trafficStatistics; 

        private Builder() {
        } 

        private Builder(ListTrafficStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.trafficStatistics = model.trafficStatistics;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of traffic statistics.</p>
         */
        public Builder trafficStatistics(java.util.List<TrafficStatistics> trafficStatistics) {
            this.trafficStatistics = trafficStatistics;
            return this;
        }

        public ListTrafficStatisticsResponseBody build() {
            return new ListTrafficStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficStatisticsResponseBody</p>
     */
    public static class TrafficStatisticData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficStatisticTime")
        private Long trafficStatisticTime;

        @com.aliyun.core.annotation.NameInMap("TrafficStatisticValue")
        private Double trafficStatisticValue;

        private TrafficStatisticData(Builder builder) {
            this.trafficStatisticTime = builder.trafficStatisticTime;
            this.trafficStatisticValue = builder.trafficStatisticValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficStatisticData create() {
            return builder().build();
        }

        /**
         * @return trafficStatisticTime
         */
        public Long getTrafficStatisticTime() {
            return this.trafficStatisticTime;
        }

        /**
         * @return trafficStatisticValue
         */
        public Double getTrafficStatisticValue() {
            return this.trafficStatisticValue;
        }

        public static final class Builder {
            private Long trafficStatisticTime; 
            private Double trafficStatisticValue; 

            private Builder() {
            } 

            private Builder(TrafficStatisticData model) {
                this.trafficStatisticTime = model.trafficStatisticTime;
                this.trafficStatisticValue = model.trafficStatisticValue;
            } 

            /**
             * <p>The statistical time. The value is a date number in the YYYYMMDD format. For example, 20250815 indicates August 15, 2025.</p>
             * 
             * <strong>example:</strong>
             * <p>20250815</p>
             */
            public Builder trafficStatisticTime(Long trafficStatisticTime) {
                this.trafficStatisticTime = trafficStatisticTime;
                return this;
            }

            /**
             * <p>The statistical value.</p>
             * 
             * <strong>example:</strong>
             * <p>1.699814</p>
             */
            public Builder trafficStatisticValue(Double trafficStatisticValue) {
                this.trafficStatisticValue = trafficStatisticValue;
                return this;
            }

            public TrafficStatisticData build() {
                return new TrafficStatisticData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTrafficStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficStatisticsResponseBody</p>
     */
    public static class TrafficStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficStatisticData")
        private java.util.List<TrafficStatisticData> trafficStatisticData;

        @com.aliyun.core.annotation.NameInMap("TrafficStatisticTarget")
        private String trafficStatisticTarget;

        private TrafficStatistics(Builder builder) {
            this.trafficStatisticData = builder.trafficStatisticData;
            this.trafficStatisticTarget = builder.trafficStatisticTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficStatistics create() {
            return builder().build();
        }

        /**
         * @return trafficStatisticData
         */
        public java.util.List<TrafficStatisticData> getTrafficStatisticData() {
            return this.trafficStatisticData;
        }

        /**
         * @return trafficStatisticTarget
         */
        public String getTrafficStatisticTarget() {
            return this.trafficStatisticTarget;
        }

        public static final class Builder {
            private java.util.List<TrafficStatisticData> trafficStatisticData; 
            private String trafficStatisticTarget; 

            private Builder() {
            } 

            private Builder(TrafficStatistics model) {
                this.trafficStatisticData = model.trafficStatisticData;
                this.trafficStatisticTarget = model.trafficStatisticTarget;
            } 

            /**
             * <p>The statistics information.</p>
             */
            public Builder trafficStatisticData(java.util.List<TrafficStatisticData> trafficStatisticData) {
                this.trafficStatisticData = trafficStatisticData;
                return this;
            }

            /**
             * <p>The statistical target.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder trafficStatisticTarget(String trafficStatisticTarget) {
                this.trafficStatisticTarget = trafficStatisticTarget;
                return this;
            }

            public TrafficStatistics build() {
                return new TrafficStatistics(this);
            } 

        } 

    }
}
