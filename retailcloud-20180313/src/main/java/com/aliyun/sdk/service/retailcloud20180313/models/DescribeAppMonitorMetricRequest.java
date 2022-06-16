// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppMonitorMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppMonitorMetricRequest</p>
 */
public class DescribeAppMonitorMetricRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true, minimum = 1)
    private Long appId;

    @Query
    @NameInMap("DeployOrderId")
    private String deployOrderId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 4783160922000D, minimum = 1)
    private Long endTime;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true, minimum = 1)
    private Long envId;

    @Query
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Query
    @NameInMap("PodName")
    private String podName;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 4783160922000D, minimum = 1)
    private Long startTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeAppMonitorMetricRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deployOrderId = builder.deployOrderId;
        this.endTime = builder.endTime;
        this.envId = builder.envId;
        this.metric = builder.metric;
        this.podName = builder.podName;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppMonitorMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return deployOrderId
     */
    public String getDeployOrderId() {
        return this.deployOrderId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeAppMonitorMetricRequest, Builder> {
        private Long appId; 
        private String deployOrderId; 
        private Long endTime; 
        private Long envId; 
        private String metric; 
        private String podName; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppMonitorMetricRequest request) {
            super(request);
            this.appId = request.appId;
            this.deployOrderId = request.deployOrderId;
            this.endTime = request.endTime;
            this.envId = request.envId;
            this.metric = request.metric;
            this.podName = request.podName;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(String deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeAppMonitorMetricRequest build() {
            return new DescribeAppMonitorMetricRequest(this);
        } 

    } 

}
