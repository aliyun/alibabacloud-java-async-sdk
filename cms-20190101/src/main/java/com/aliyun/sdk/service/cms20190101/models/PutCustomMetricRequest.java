// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutCustomMetricRequest} extends {@link RequestModel}
 *
 * <p>PutCustomMetricRequest</p>
 */
public class PutCustomMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < MetricList> metricList;

    private PutCustomMetricRequest(Builder builder) {
        super(builder);
        this.metricList = builder.metricList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricList
     */
    public java.util.List < MetricList> getMetricList() {
        return this.metricList;
    }

    public static final class Builder extends Request.Builder<PutCustomMetricRequest, Builder> {
        private java.util.List < MetricList> metricList; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomMetricRequest request) {
            super(request);
            this.metricList = request.metricList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricList(java.util.List < MetricList> metricList) {
            this.putQueryParameter("MetricList", metricList);
            this.metricList = metricList;
            return this;
        }

        @Override
        public PutCustomMetricRequest build() {
            return new PutCustomMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutCustomMetricRequest} extends {@link TeaModel}
     *
     * <p>PutCustomMetricRequest</p>
     */
    public static class MetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        @com.aliyun.core.annotation.Validation(required = true)
        private String values;

        private MetricList(Builder builder) {
            this.dimensions = builder.dimensions;
            this.groupId = builder.groupId;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.time = builder.time;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricList create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String dimensions; 
            private String groupId; 
            private String metricName; 
            private String period; 
            private String time; 
            private String type; 
            private String values; 

            /**
             * <p>The dimensions that specify the resources whose monitoring data you want to query. Valid values of N: 1 to 21.</p>
             * <p>Set the value to a collection of key-value pairs. Format:<code>{&quot;Key&quot;:&quot;Value&quot;}</code>.</p>
             * <p>The key or value must be 1 to 64 bytes in length. Excessive characters are truncated.</p>
             * <p>The key or value can contain letters, digits, periods (.), hyphens (-), underscores (_), forward slashes (/), and backslashes (\).</p>
             * <blockquote>
             * <p> Dimensions must be formatted as a JSON string in a specified order.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;sampleName1&quot;:&quot;value1&quot;,&quot;sampleName2&quot;:&quot;value2&quot;}</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The ID of the application group. Valid values of N: 1 to 21.</p>
             * <blockquote>
             * <p> If the metric does not belong to any application group, enter 0.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the metric. Valid values of N: 1 to 21. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The aggregation period. Valid values of N: 1 to 21. Unit: seconds. Valid values: 60 and 300.</p>
             * <blockquote>
             * <p> If the MetricList.N.Type parameter is set to 1, the MetricList.N.Period parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The timestamp when the metric data is generated. Valid values of N: 1 to 21. The timestamp can be in one of the following formats:</p>
             * <ul>
             * <li>The UTC timestamp that is in the YYYY-MM-DDThh:mm:ssZ format. Example: 20171012T132456.888+0800.</li>
             * <li>The UNIX timestamp of the LONG type. Example: 1508136760000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1508136760000</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the reported data. Valid values of N: 1 to 21. Valid values:</p>
             * <ul>
             * <li>0: reports raw data</li>
             * <li>1: reports aggregate data</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you report aggregate data in both the aggregation periods of 60s and 300s. Otherwise, you cannot query monitoring data in a time span that is more than seven days.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The collection of metric values. Valid values of N: 1 to 21.</p>
             * <blockquote>
             * <p> If the MetricList.N.Type parameter is set to 0, the keys in this parameter must be set to the specified value. CloudMonitor aggregates raw data in each aggregation period to generate multiple statistical values, such as the maximum value, the count, and the total value.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;value&quot;:10.5}</p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public MetricList build() {
                return new MetricList(this);
            } 

        } 

    }
}
