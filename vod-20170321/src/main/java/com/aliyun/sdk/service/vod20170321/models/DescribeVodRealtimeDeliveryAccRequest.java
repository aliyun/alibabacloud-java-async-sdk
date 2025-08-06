// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodRealtimeDeliveryAccRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodRealtimeDeliveryAccRequest</p>
 */
public class DescribeVodRealtimeDeliveryAccRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodRealtimeDeliveryAccRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.logStore = builder.logStore;
        this.ownerId = builder.ownerId;
        this.project = builder.project;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodRealtimeDeliveryAccRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeVodRealtimeDeliveryAccRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String logStore; 
        private Long ownerId; 
        private String project; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodRealtimeDeliveryAccRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.logStore = request.logStore;
            this.ownerId = request.ownerId;
            this.project = request.project;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>The end time must be later than the start time. The interval between the start time and the end time cannot exceed a year.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-30T13:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time granularity of the data entries. Unit: seconds. Valid values: 300, 3600, and 86400.</p>
         * <p>The default time granularity varies based on the interval between the start time and end time that you specify. If you set the interval to a value within (0,3] days, the default time granularity is 300 seconds. If you set the interval to a value within (3,30] days, the default time granularity is 3,600 seconds. If you set the interval to a value greater than 30 days, the default time granularity is 86,400 seconds. The default value is used if you specify an invalid value for this parameter or leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The name of the Logstore to which log entries are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>vod-log-store</p>
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>vod-logs</p>
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
        public DescribeVodRealtimeDeliveryAccRequest build() {
            return new DescribeVodRealtimeDeliveryAccRequest(this);
        } 

    } 

}
