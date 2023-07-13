// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorStatisticsRequest</p>
 */
public class DescribeSiteMonitorStatisticsRequest extends Request {
    @Query
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("TimeRange")
    private String timeRange;

    private DescribeSiteMonitorStatisticsRequest(Builder builder) {
        super(builder);
        this.metricName = builder.metricName;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorStatisticsRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorStatisticsRequest, Builder> {
        private String metricName; 
        private String startTime; 
        private String taskId; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorStatisticsRequest request) {
            super(request);
            this.metricName = request.metricName;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
            this.timeRange = request.timeRange;
        } 

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public DescribeSiteMonitorStatisticsRequest build() {
            return new DescribeSiteMonitorStatisticsRequest(this);
        } 

    } 

}
