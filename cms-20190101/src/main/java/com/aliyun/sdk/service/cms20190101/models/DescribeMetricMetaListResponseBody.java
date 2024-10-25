// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricMetaListResponseBody</p>
 */
public class DescribeMetricMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0CCE0AF0-053C-4B13-A583-DC9A85785D49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configuration of the metrics in the resources.</p>
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMetricMetaListResponseBody build() {
            return new DescribeMetricMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricMetaListResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Periods")
        private String periods;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Unit")
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
             * <p>The metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>CPUUtilization</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The monitoring dimensions of the resource. Multiple monitoring dimensions are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The tags of the metric, including one or more JSON strings.</p>
             * <p>Format: <code>[{&quot;name&quot;:&quot;tag key&quot;,&quot;value&quot;:&quot;tag value&quot;}]</code>. The <code>name</code> can be repeated. The following tags are available:</p>
             * <ul>
             * <li>metricCategory: the category of the metric.</li>
             * <li>alertEnable: indicates whether to report alerts for the metric.</li>
             * <li>alertUnit: the unit of the metric in the alerts.</li>
             * <li>unitFactor: the factor for metric unit conversion.</li>
             * <li>minAlertPeriod: the minimum interval at which the alert is reported.</li>
             * <li>productCategory: the category of the service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;alertUnit&quot;,&quot;value&quot;:&quot;Bytes&quot;},{&quot;name&quot;:&quot;minAlertPeriod&quot;,&quot;value&quot;:&quot;60&quot;},{&quot;name&quot;:&quot;metricCategory&quot;,&quot;value&quot;:&quot;instanceId&quot;},{&quot;name&quot;:&quot;instanceType&quot;,&quot;value&quot;:&quot;disaster&quot;},{&quot;name&quot;:&quot;is_alarm&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;name&quot;:&quot;productCategory&quot;,&quot;value&quot;:&quot;kvstore_old&quot;}]</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>CPUUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_kvstore</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The statistical periods of the metric. Multiple statistical periods are separated with commas (,).</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60,300</p>
             */
            public Builder periods(String periods) {
                this.periods = periods;
                return this;
            }

            /**
             * <p>The statistical method. Multiple statistical methods are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>Average,Minimum,Maximum</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
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
    /**
     * 
     * {@link DescribeMetricMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricMetaListResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
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
