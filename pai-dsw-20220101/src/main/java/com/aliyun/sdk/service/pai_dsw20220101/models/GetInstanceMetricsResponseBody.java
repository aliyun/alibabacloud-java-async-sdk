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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PodMetrics.
         */
        public Builder podMetrics(java.util.List<PodMetrics> podMetrics) {
            this.podMetrics = podMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
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

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * PodId.
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
