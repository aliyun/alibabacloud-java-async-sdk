// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardMetricsFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardMetricsFlowsResponseBody</p>
 */
public class ListDashboardMetricsFlowsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListDashboardMetricsFlowsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardMetricsFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDashboardMetricsFlowsResponseBody build() {
            return new ListDashboardMetricsFlowsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("MetricData")
        private java.util.Map < String, ? > metricData;

        @NameInMap("MetricType")
        private String metricType;

        private Result(Builder builder) {
            this.metricData = builder.metricData;
            this.metricType = builder.metricType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return metricData
         */
        public java.util.Map < String, ? > getMetricData() {
            return this.metricData;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        public static final class Builder {
            private java.util.Map < String, ? > metricData; 
            private String metricType; 

            /**
             * MetricData.
             */
            public Builder metricData(java.util.Map < String, ? > metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
