// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSiteMonitorStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorStatisticsRequest</p>
 */
public class DescribeSiteMonitorStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
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
         * <p>The metric name. Valid values:</p>
         * <ul>
         * <li>Availability</li>
         * <li>ErrorRate</li>
         * <li>ResponseTime</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Availability</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Unit: milliseconds. The default value is 1 hour ahead of the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1576142850527</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the site monitoring task.</p>
         * <p>For more information about how to obtain the ID of a site monitoring task, see <a href="https://help.aliyun.com/document_detail/115052.html">DescribeSiteMonitorList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ef4cdc8b-9dc7-43e7-810e-f950e56c****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The statistical period.</p>
         * <p>Unit: minutes. Default value: 1440 (one day). Maximum value: 43200 (30 days).</p>
         * 
         * <strong>example:</strong>
         * <p>1440</p>
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
