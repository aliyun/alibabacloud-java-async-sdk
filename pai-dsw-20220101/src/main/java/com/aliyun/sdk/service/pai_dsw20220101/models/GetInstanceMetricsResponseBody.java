// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceMetricsResponseBody</p>
 */
public class GetInstanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PodMetrics")
    private java.util.List<PodMetrics> podMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.podMetrics = builder.podMetrics;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return podMetrics
     */
    public java.util.List<PodMetrics> getPodMetrics() {
        return this.podMetrics;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String message; 
        private java.util.List<PodMetrics> podMetrics; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceMetricsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.podMetrics = model.podMetrics;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>InternalError: an internal error. All errors, except for parameter validation errors, are classified as internal errors.</li>
         * <li>ValidationError: a parameter validation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li>400</li>
         * <li>404</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about the metrics of the pod that corresponds to the instance.</p>
         */
        public Builder podMetrics(java.util.List<PodMetrics> podMetrics) {
            this.podMetrics = podMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceMetricsResponseBody build() {
            return new GetInstanceMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private Metrics(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Float value; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The timestamp corresponding to the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1670890560</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>25.901031</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceMetricsResponseBody</p>
     */
    public static class PodMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("PodId")
        private String podId;

        private PodMetrics(Builder builder) {
            this.metrics = builder.metrics;
            this.podId = builder.podId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodMetrics create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        public static final class Builder {
            private java.util.List<Metrics> metrics; 
            private String podId; 

            private Builder() {
            } 

            private Builder(PodMetrics model) {
                this.metrics = model.metrics;
                this.podId = model.podId;
            } 

            /**
             * <p>The metrics of the pod that corresponds to the instance.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The ID of the pod that corresponds to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-15870-695f44c5bc-hd6xm</p>
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            public PodMetrics build() {
                return new PodMetrics(this);
            } 

        } 

    }
}
