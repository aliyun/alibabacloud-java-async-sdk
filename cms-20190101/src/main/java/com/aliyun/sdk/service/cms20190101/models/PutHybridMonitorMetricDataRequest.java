// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutHybridMonitorMetricDataRequest} extends {@link RequestModel}
 *
 * <p>PutHybridMonitorMetricDataRequest</p>
 */
public class PutHybridMonitorMetricDataRequest extends Request {
    @Query
    @NameInMap("MetricList")
    @Validation(required = true)
    private java.util.List < MetricList> metricList;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private PutHybridMonitorMetricDataRequest(Builder builder) {
        super(builder);
        this.metricList = builder.metricList;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutHybridMonitorMetricDataRequest create() {
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

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<PutHybridMonitorMetricDataRequest, Builder> {
        private java.util.List < MetricList> metricList; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(PutHybridMonitorMetricDataRequest request) {
            super(request);
            this.metricList = request.metricList;
            this.namespace = request.namespace;
        } 

        /**
         * The monitoring data.
         * <p>
         * 
         * Valid values of N: 1 to 100.
         */
        public Builder metricList(java.util.List < MetricList> metricList) {
            this.putQueryParameter("MetricList", metricList);
            this.metricList = metricList;
            return this;
        }

        /**
         * The name of the namespace.
         * <p>
         * 
         * For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public PutHybridMonitorMetricDataRequest build() {
            return new PutHybridMonitorMetricDataRequest(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * The key can contain letters, digits, and underscores (*). The key must start with a letter or an underscore (*).
             * 
             * >  You must specify both the Key and Value parameters.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * >  You must specify both the Key and Value parameters.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class MetricList extends TeaModel {
        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("Name")
        @Validation(required = true, maxLength = 128, minLength = 1)
        private String name;

        @NameInMap("TS")
        private Long ts;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private MetricList(Builder builder) {
            this.labels = builder.labels;
            this.name = builder.name;
            this.ts = builder.ts;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricList create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List < Labels> labels; 
            private String name; 
            private Long ts; 
            private String value; 

            /**
             * The tags of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The metric name.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * The name can contain letters, digits, and underscores (\_). The name must start with a letter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The timestamp when the monitoring data is imported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * Unit: milliseconds. By default, the current timestamp is used.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            /**
             * The value of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * The value must be an integer or a floating-point number.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MetricList build() {
                return new MetricList(this);
            } 

        } 

    }
}
