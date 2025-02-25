// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleCountRequest</p>
 */
public class DescribeMetricRuleCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    private DescribeMetricRuleCountRequest(Builder builder) {
        super(builder);
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeMetricRuleCountRequest, Builder> {
        private String metricName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleCountRequest request) {
            super(request);
            this.metricName = request.metricName;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The metric name. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DescribeMetricRuleCountRequest build() {
            return new DescribeMetricRuleCountRequest(this);
        } 

    } 

}
