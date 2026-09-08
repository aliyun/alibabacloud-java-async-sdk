// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetNodeMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetNodeMetricsRequest</p>
 */
public class GetNodeMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStep")
    private String timeStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetNodeMetricsRequest(Builder builder) {
        super(builder);
        this.resourceGroupID = builder.resourceGroupID;
        this.metricType = builder.metricType;
        this.endTime = builder.endTime;
        this.GPUType = builder.GPUType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeStep
     */
    public String getTimeStep() {
        return this.timeStep;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetNodeMetricsRequest, Builder> {
        private String resourceGroupID; 
        private String metricType; 
        private String endTime; 
        private String GPUType; 
        private String startTime; 
        private String timeStep; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeMetricsRequest request) {
            super(request);
            this.resourceGroupID = request.resourceGroupID;
            this.metricType = request.metricType;
            this.endTime = request.endTime;
            this.GPUType = request.GPUType;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
            this.verbose = request.verbose;
        } 

        /**
         * <p>The resource group ID. Each resource group has a globally unique resource group ID. You can use the resource group ID to retrieve information about the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rgf0zhfqn1d4ity2</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The name of the metric to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUsageRate</p>
         */
        public Builder metricType(String metricType) {
            this.putPathParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T10:17:06</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The GPU type. Valid values:</p>
         * <ul>
         * <li>V100</li>
         * <li>A100</li>
         * <li>A10</li>
         * <li>T4</li>
         * <li>P100</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V100</p>
         */
        public Builder GPUType(String GPUType) {
            this.putQueryParameter("GPUType", GPUType);
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-08T02:23:30.292Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time step. Default value: 5m. Valid values for the time unit:</p>
         * <ul>
         * <li><p>h: hours.</p>
         * </li>
         * <li><p>m: minutes.</p>
         * </li>
         * <li><p>s: seconds.</p>
         * </li>
         * </ul>
         * <p>If no unit is specified, the default unit is s (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1h</p>
         */
        public Builder timeStep(String timeStep) {
            this.putQueryParameter("TimeStep", timeStep);
            this.timeStep = timeStep;
            return this;
        }

        /**
         * <p>Specifies whether to display non-essential information. Non-essential information currently includes Labels. Valid values:</p>
         * <p>false: does not display non-essential information (default).
         * true: displays non-essential information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetNodeMetricsRequest build() {
            return new GetNodeMetricsRequest(this);
        } 

    } 

}
