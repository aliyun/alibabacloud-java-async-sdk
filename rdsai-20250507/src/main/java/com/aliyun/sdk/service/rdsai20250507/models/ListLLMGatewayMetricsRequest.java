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
 * {@link ListLLMGatewayMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListLLMGatewayMetricsRequest</p>
 */
public class ListLLMGatewayMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ListLLMGatewayMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.instanceName = builder.instanceName;
        this.metricType = builder.metricType;
        this.model = builder.model;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLLMGatewayMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListLLMGatewayMetricsRequest, Builder> {
        private String endTime; 
        private String granularity; 
        private String instanceName; 
        private String metricType; 
        private String model; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListLLMGatewayMetricsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.instanceName = request.instanceName;
            this.metricType = request.metricType;
            this.model = request.model;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time for the metric query in ISO 8601 format. The time must be later than StartTime and is aligned to the minute. The maximum query range is 7 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-26T20:55:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity. Default value: minute.</p>
         * 
         * <strong>example:</strong>
         * <p>minute</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The name of the Supabase instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-7kox9010itfcn1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The metric type. The match is case-insensitive. Valid values:</p>
         * <ul>
         * <li>tokenPerMinute: tokens per minute</li>
         * <li>requestPerMinute: requests per minute</li>
         * <li>errorRequestPerMinute: error requests per minute</li>
         * <li>timeToFirstToken: time to first token percentiles</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tokenPerMinute</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The model filter condition. Separate multiple model names with commas. If this parameter is not specified, data for all models is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus,deepseek-v4-pro</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time for the metric query in ISO 8601 format. The time is aligned to the minute. The maximum query range between StartTime and EndTime is 7 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-26T20:40:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListLLMGatewayMetricsRequest build() {
            return new ListLLMGatewayMetricsRequest(this);
        } 

    } 

}
