// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricMetaListResponseBody</p>
 */
public class DescribeMetricMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private Resources resources;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeMetricMetaListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricMetaListResponseBody create() {
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
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private String totalCount; 

        /**
         * The response code.
         * <p>
         * 
         * >  The HTTP 200 code indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configuration of the metric.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Indicates whether the request was successful. The value true indicates success. The value false indicates failure.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned records.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMetricMetaListResponseBody build() {
            return new DescribeMetricMetaListResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Periods")
        private String periods;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Unit")
        private String unit;

        private Resource(Builder builder) {
            this.description = builder.description;
            this.dimensions = builder.dimensions;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.periods = builder.periods;
            this.statistics = builder.statistics;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return periods
         */
        public String getPeriods() {
            return this.periods;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String description; 
            private String dimensions; 
            private String labels; 
            private String metricName; 
            private String namespace; 
            private String periods; 
            private String statistics; 
            private String unit; 

            /**
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The dimensions of the metric. Multiple dimensions are separated with commas (,).
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The tags of the metric, including one or more JSON strings. Format: `[{"name":"tag name","value":"tag value"}]`. The `name` can be repeated.
             * <p>
             * 
             * The following tags are available:
             * 
             * *   metricCategory: the category of the metric.
             * *   alertEnable: specifies whether to report alerts for the metric.
             * *   alertUnit: the suggested unit of the metric value in alerts.
             * *   unitFactor: the factor for metric unit conversion.
             * *   minAlertPeriod: the minimum time interval to report a new alert.
             * *   productCategory: the category of the service.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The namespace of the service. The value is usually in the format of acs_Service.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The statistical period of the metric. Multiple statistical periods are separated with commas (,).
             */
            public Builder periods(String periods) {
                this.periods = periods;
                return this;
            }

            /**
             * The statistical method. Multiple statistic methods are separated with commas (,).
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
