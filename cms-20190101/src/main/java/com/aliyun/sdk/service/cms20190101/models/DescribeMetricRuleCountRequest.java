// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleCountRequest</p>
 */
public class DescribeMetricRuleCountRequest extends Request {
    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("Namespace")
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
         * The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).
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
