// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationPerformanceRequest</p>
 */
public class DescribeApplicationPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Consumer")
    private String consumer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
    private String consumerGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Downsample")
    private String downsample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndStep")
    private Long endStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPoints")
    private Integer maxPoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelService")
    private String modelService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartStep")
    private Long startStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeApplicationPerformanceRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.consumer = builder.consumer;
        this.consumerGroup = builder.consumerGroup;
        this.downsample = builder.downsample;
        this.endStep = builder.endStep;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.key = builder.key;
        this.maxPoints = builder.maxPoints;
        this.modelService = builder.modelService;
        this.startStep = builder.startStep;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationPerformanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return consumer
     */
    public String getConsumer() {
        return this.consumer;
    }

    /**
     * @return consumerGroup
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * @return downsample
     */
    public String getDownsample() {
        return this.downsample;
    }

    /**
     * @return endStep
     */
    public Long getEndStep() {
        return this.endStep;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return maxPoints
     */
    public Integer getMaxPoints() {
        return this.maxPoints;
    }

    /**
     * @return modelService
     */
    public String getModelService() {
        return this.modelService;
    }

    /**
     * @return startStep
     */
    public Long getStartStep() {
        return this.startStep;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationPerformanceRequest, Builder> {
        private String applicationId; 
        private String consumer; 
        private String consumerGroup; 
        private String downsample; 
        private Long endStep; 
        private String endTime; 
        private String interval; 
        private String key; 
        private Integer maxPoints; 
        private String modelService; 
        private Long startStep; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationPerformanceRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.consumer = request.consumer;
            this.consumerGroup = request.consumerGroup;
            this.downsample = request.downsample;
            this.endStep = request.endStep;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.key = request.key;
            this.maxPoints = request.maxPoints;
            this.modelService = request.modelService;
            this.startStep = request.startStep;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Consumer.
         */
        public Builder consumer(String consumer) {
            this.putQueryParameter("Consumer", consumer);
            this.consumer = consumer;
            return this;
        }

        /**
         * ConsumerGroup.
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putQueryParameter("ConsumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * Downsample.
         */
        public Builder downsample(String downsample) {
            this.putQueryParameter("Downsample", downsample);
            this.downsample = downsample;
            return this;
        }

        /**
         * EndStep.
         */
        public Builder endStep(Long endStep) {
            this.putQueryParameter("EndStep", endStep);
            this.endStep = endStep;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDBSupabaseMemUsage</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * MaxPoints.
         */
        public Builder maxPoints(Integer maxPoints) {
            this.putQueryParameter("MaxPoints", maxPoints);
            this.maxPoints = maxPoints;
            return this;
        }

        /**
         * ModelService.
         */
        public Builder modelService(String modelService) {
            this.putQueryParameter("ModelService", modelService);
            this.modelService = modelService;
            return this;
        }

        /**
         * StartStep.
         */
        public Builder startStep(Long startStep) {
            this.putQueryParameter("StartStep", startStep);
            this.startStep = startStep;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-23T01:01Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeApplicationPerformanceRequest build() {
            return new DescribeApplicationPerformanceRequest(this);
        } 

    } 

}
