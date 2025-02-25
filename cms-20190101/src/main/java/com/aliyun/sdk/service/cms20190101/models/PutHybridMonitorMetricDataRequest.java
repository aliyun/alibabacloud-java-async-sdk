// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutHybridMonitorMetricDataRequest} extends {@link RequestModel}
 *
 * <p>PutHybridMonitorMetricDataRequest</p>
 */
public class PutHybridMonitorMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < MetricList> metricList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The monitoring data.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder metricList(java.util.List < MetricList> metricList) {
            this.putQueryParameter("MetricList", metricList);
            this.metricList = metricList;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-aliyun</p>
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

    /**
     * 
     * {@link PutHybridMonitorMetricDataRequest} extends {@link TeaModel}
     *
     * <p>PutHybridMonitorMetricDataRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key of the metric.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <p>The key can contain letters, digits, and underscores (<em>). The key must start with a letter or an underscore (</em>).</p>
             * <blockquote>
             * <p> You must specify both the Key and Value parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IP</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the metric.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <blockquote>
             * <p> You must specify both the Key and Value parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
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
    /**
     * 
     * {@link PutHybridMonitorMetricDataRequest} extends {@link TeaModel}
     *
     * <p>PutHybridMonitorMetricDataRequest</p>
     */
    public static class MetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("TS")
        private Long ts;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The tags of the metric.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>app、ip、hostName等标识信息</p>
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <p>The name can contain letters, digits, and underscores (_). The name must start with a letter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU_Usage</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the monitoring data is imported. The value is a timestamp.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <p>Unit: milliseconds. By default, the current time is used.</p>
             * 
             * <strong>example:</strong>
             * <p>1640776119473</p>
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <p>The value must be an integer or a floating-point number.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
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
