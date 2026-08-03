// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeDataAgentMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataAgentMetricsRequest</p>
 */
public class DescribeDataAgentMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricNames")
    private String metricNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDataAgentMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.metricNames = builder.metricNames;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricNames
     */
    public String getMetricNames() {
        return this.metricNames;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDataAgentMetricsRequest, Builder> {
        private Long endTime; 
        private String metricNames; 
        private String metricType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataAgentMetricsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.metricNames = request.metricNames;
            this.metricType = request.metricType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MetricNames.
         */
        public Builder metricNames(String metricNames) {
            this.putQueryParameter("MetricNames", metricNames);
            this.metricNames = metricNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDataAgentMetricsRequest build() {
            return new DescribeDataAgentMetricsRequest(this);
        } 

    } 

}
