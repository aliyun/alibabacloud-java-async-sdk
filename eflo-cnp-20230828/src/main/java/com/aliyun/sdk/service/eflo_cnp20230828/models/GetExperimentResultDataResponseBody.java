// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetExperimentResultDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentResultDataResponseBody</p>
 */
public class GetExperimentResultDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetExperimentResultDataResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentResultDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetExperimentResultDataResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access Denied Details</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>C1D34EC2-AB13-56F4-8322-F15AE563EA04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total Count of Queries</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetExperimentResultDataResponseBody build() {
            return new GetExperimentResultDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExperimentResultDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResultDataResponseBody</p>
     */
    public static class MetricsInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gpu_num")
        private String gpuNum;

        @com.aliyun.core.annotation.NameInMap("Iteration")
        private Long iteration;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private MetricsInfos(Builder builder) {
            this.gpuNum = builder.gpuNum;
            this.iteration = builder.iteration;
            this.tflops = builder.tflops;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricsInfos create() {
            return builder().build();
        }

        /**
         * @return gpuNum
         */
        public String getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return iteration
         */
        public Long getIteration() {
            return this.iteration;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String gpuNum; 
            private Long iteration; 
            private Double tflops; 
            private Long timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(MetricsInfos model) {
                this.gpuNum = model.gpuNum;
                this.iteration = model.iteration;
                this.tflops = model.tflops;
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(String gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Iteration</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder iteration(Long iteration) {
                this.iteration = iteration;
                return this;
            }

            /**
             * <p>TFLOPS</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Operation Timestamp</p>
             * 
             * <strong>example:</strong>
             * <p>1715393860</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>Metric Value</p>
             * 
             * <strong>example:</strong>
             * <p>126</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public MetricsInfos build() {
                return new MetricsInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResultDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResultDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private String gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("MetricsInfos")
        private java.util.List<MetricsInfos> metricsInfos;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        private Data(Builder builder) {
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.metricsInfos = builder.metricsInfos;
            this.podName = builder.podName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gpuNum
         */
        public String getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return metricsInfos
         */
        public java.util.List<MetricsInfos> getMetricsInfos() {
            return this.metricsInfos;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        public static final class Builder {
            private String gpuNum; 
            private String hostname; 
            private java.util.List<MetricsInfos> metricsInfos; 
            private String podName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.metricsInfos = model.metricsInfos;
                this.podName = model.podName;
            } 

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(String gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Host IP</p>
             * 
             * <strong>example:</strong>
             * <p>p-jt-waf-app1</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>List of Metrics Information</p>
             */
            public Builder metricsInfos(java.util.List<MetricsInfos> metricsInfos) {
                this.metricsInfos = metricsInfos;
                return this;
            }

            /**
             * <p>Pod Name</p>
             * 
             * <strong>example:</strong>
             * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
