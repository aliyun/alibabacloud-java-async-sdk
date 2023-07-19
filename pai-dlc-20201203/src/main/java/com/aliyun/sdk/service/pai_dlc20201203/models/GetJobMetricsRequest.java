// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetJobMetricsRequest</p>
 */
public class GetJobMetricsRequest extends Request {
    @Path
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeStep")
    private String timeStep;

    @Query
    @NameInMap("Token")
    private String token;

    private GetJobMetricsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
        this.timeStep = builder.timeStep;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetJobMetricsRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private String metricType; 
        private String startTime; 
        private String timeStep; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetJobMetricsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.metricType = request.metricType;
            this.startTime = request.startTime;
            this.timeStep = request.timeStep;
            this.token = request.token;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
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
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
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
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetJobMetricsRequest build() {
            return new GetJobMetricsRequest(this);
        } 

    } 

}
