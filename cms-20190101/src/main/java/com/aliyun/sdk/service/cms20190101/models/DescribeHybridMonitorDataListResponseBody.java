// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridMonitorDataListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorDataListResponseBody</p>
 */
public class DescribeHybridMonitorDataListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TimeSeries")
    private java.util.List < TimeSeries> timeSeries;

    private DescribeHybridMonitorDataListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeSeries = builder.timeSeries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorDataListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timeSeries
     */
    public java.util.List < TimeSeries> getTimeSeries() {
        return this.timeSeries;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String success; 
        private java.util.List < TimeSeries> timeSeries; 

        /**
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>end timestamp must not be before start time.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C240412F-3F5F-50E2-ACEC-DE808EF9C4BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The returned monitoring data.</p>
         */
        public Builder timeSeries(java.util.List < TimeSeries> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }

        public DescribeHybridMonitorDataListResponseBody build() {
            return new DescribeHybridMonitorDataListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridMonitorDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorDataListResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("K")
        private String k;

        @com.aliyun.core.annotation.NameInMap("V")
        private String v;

        private Labels(Builder builder) {
            this.k = builder.k;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return k
         */
        public String getK() {
            return this.k;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String k; 
            private String v; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder k(String k) {
                this.k = k;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>i-rj99xc6cptkk64ml****</p>
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorDataListResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ts")
        private String ts;

        @com.aliyun.core.annotation.NameInMap("V")
        private String v;

        private Values(Builder builder) {
            this.ts = builder.ts;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return ts
         */
        public String getTs() {
            return this.ts;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String ts; 
            private String v; 

            /**
             * <p>The timestamp that indicates the time when the metric value is collected.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1653804865</p>
             */
            public Builder ts(String ts) {
                this.ts = ts;
                return this;
            }

            /**
             * <p>The metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>0.13</p>
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorDataListResponseBody</p>
     */
    public static class TimeSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < Labels> labels;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < Values> values;

        private TimeSeries(Builder builder) {
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSeries create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < Labels> labels; 
            private String metricName; 
            private java.util.List < Values> values; 

            /**
             * <p>The tags of the time dimension.</p>
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunEcs_cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The metric values that are collected at different timestamps.</p>
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public TimeSeries build() {
                return new TimeSeries(this);
            } 

        } 

    }
}
