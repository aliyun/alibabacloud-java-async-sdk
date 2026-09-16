// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorDataRequest</p>
 */
public class DescribeMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKeyName")
    private java.util.List<String> apiKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeMonitorDataRequest(Builder builder) {
        super(builder);
        this.apiKeyName = builder.apiKeyName;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.metric = builder.metric;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyName
     */
    public java.util.List<String> getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorDataRequest, Builder> {
        private java.util.List<String> apiKeyName; 
        private Long endTime; 
        private String instanceId; 
        private Integer interval; 
        private String metric; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorDataRequest request) {
            super(request);
            this.apiKeyName = request.apiKeyName;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.metric = request.metric;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The API key name.</p>
         */
        public Builder apiKeyName(java.util.List<String> apiKeyName) {
            String apiKeyNameShrink = shrink(apiKeyName, "ApiKeyName", "json");
            this.putQueryParameter("ApiKeyName", apiKeyNameShrink);
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The end time. Format: Timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627269085</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The statistical period. Default value: 15s.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The metric to query.</p>
         * <ul>
         * <li><p>pv</p>
         * </li>
         * <li><p>uv</p>
         * </li>
         * <li><p>qps</p>
         * </li>
         * <li><p>success_rate</p>
         * </li>
         * <li><p>rt</p>
         * </li>
         * <li><p>rate_limited_count</p>
         * </li>
         * <li><p>tpm</p>
         * </li>
         * <li><p>cache</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>● pv</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The start time. Format: Timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627268185</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMonitorDataRequest build() {
            return new DescribeMonitorDataRequest(this);
        } 

    } 

}
