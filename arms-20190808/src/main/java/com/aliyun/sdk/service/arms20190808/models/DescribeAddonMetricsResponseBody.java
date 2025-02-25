// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DescribeAddonMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonMetricsResponseBody</p>
 */
public class DescribeAddonMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAddonMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The metric details.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAddonMetricsResponseBody build() {
            return new DescribeAddonMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddonMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonMetricsResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Labels(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private String source; 

            /**
             * <p>The description of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>The number of times a B-tree page of size PAGE_SIZE was successfully compressed.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>page_size</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The source of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddonMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonMetricsResponseBody</p>
     */
    public static class MetricsLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private MetricsLabels(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricsLabels create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private String source; 

            /**
             * <p>The description of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>PAGE_SIZE</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>page_size</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The source of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public MetricsLabels build() {
                return new MetricsLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddonMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<MetricsLabels> labels;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Metrics(Builder builder) {
            this.description = builder.description;
            this.labels = builder.labels;
            this.metric = builder.metric;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labels
         */
        public java.util.List<MetricsLabels> getLabels() {
            return this.labels;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<MetricsLabels> labels; 
            private String metric; 
            private String type; 
            private String unit; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The number of times a B-tree page of size PAGE_SIZE was successfully compressed.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.List<MetricsLabels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_exporter_collector_duration_seconds</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The type of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>GAUGE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>bytes</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddonMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonMetricsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        private Data(Builder builder) {
            this.group = builder.group;
            this.labels = builder.labels;
            this.metrics = builder.metrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private String group; 
            private java.util.List<Labels> labels; 
            private java.util.List<Metrics> metrics; 

            /**
             * <p>The metric group.</p>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The metrics.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
