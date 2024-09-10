// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMonitorAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogMonitorAttributeRequest</p>
 */
public class DescribeLogMonitorAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    private DescribeLogMonitorAttributeRequest(Builder builder) {
        super(builder);
        this.metricName = builder.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogMonitorAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLogMonitorAttributeRequest, Builder> {
        private String metricName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogMonitorAttributeRequest request) {
            super(request);
            this.metricName = request.metricName;
        } 

        /**
         * The name of the log monitoring metric. Exact match is supported.
         * <p>
         * 
         * For more information, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        @Override
        public DescribeLogMonitorAttributeRequest build() {
            return new DescribeLogMonitorAttributeRequest(this);
        } 

    } 

}
