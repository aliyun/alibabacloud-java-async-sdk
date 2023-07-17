// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetNodeMetricsRequest</p>
 */
public class GetNodeMetricsRequest extends Request {
    @Path
    @NameInMap("ResourceGroupID")
    @Validation(required = true)
    private String resourceGroupID;

    @Path
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("GPUType")
    private String GPUType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeStep")
    private String timeStep;

    @Query
    @NameInMap("Verbose")
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
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putPathParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.putQueryParameter("GPUType", GPUType);
            this.GPUType = GPUType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeStep.
         */
        public Builder timeStep(String timeStep) {
            this.putQueryParameter("TimeStep", timeStep);
            this.timeStep = timeStep;
            return this;
        }

        /**
         * Verbose.
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
