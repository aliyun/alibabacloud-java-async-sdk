// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeRealtimeDeliveryAccRequest} extends {@link RequestModel}
 *
 * <p>DescribeRealtimeDeliveryAccRequest</p>
 */
public class DescribeRealtimeDeliveryAccRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStore")
    private String logStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeRealtimeDeliveryAccRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.logStore = builder.logStore;
        this.project = builder.project;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRealtimeDeliveryAccRequest create() {
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRealtimeDeliveryAccRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String logStore; 
        private String project; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRealtimeDeliveryAccRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.logStore = request.logStore;
            this.project = request.project;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The end time must be later than the start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-10-20T05:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the data entries. Unit: seconds. The value varies based on the values of the <strong>StartTime</strong> and <strong>EndTime</strong> parameters. Valid values:</p>
         * <ul>
         * <li>If the time span between StartTime and EndTime is less than 3 days, valid values are <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. Default value: <strong>300</strong>.</li>
         * <li>If the time span between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, valid values are <strong>3600</strong> and <strong>86400</strong>. Default value: <strong>3600</strong>.</li>
         * <li>If the time span between StartTime and EndTime is 31 days or longer, the valid value is <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The name of the Logstore that stores log data. If you do leave this parameter empty, real-time log deliveries of all Logstores are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>LogStore</p>
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery. If you do leave this parameter empty, real-time log deliveries of all projects are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-10-20T04:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRealtimeDeliveryAccRequest build() {
            return new DescribeRealtimeDeliveryAccRequest(this);
        } 

    } 

}
