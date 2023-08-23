// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRealtimeDeliveryAccRequest} extends {@link RequestModel}
 *
 * <p>DescribeRealtimeDeliveryAccRequest</p>
 */
public class DescribeRealtimeDeliveryAccRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("LogStore")
    private String logStore;

    @Query
    @NameInMap("Project")
    private String project;

    @Query
    @NameInMap("StartTime")
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
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The time granularity of the data entries. Unit: seconds. The value varies based on the values of the **StartTime** and **EndTime** parameters. Valid values:
         * <p>
         * 
         * *   If the time span between StartTime and EndTime is less than 3 days, valid values are **300**, **3600**, and **86400**. Default value: **300**.
         * *   If the time span between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, valid values are **3600** and **86400**. Default value: **3600**.
         * *   If the time span between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The name of the Logstore that stores log data. If you do leave this parameter empty, real-time log deliveries of all Logstores are queried.
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * The name of the Log Service project that is used for real-time log delivery. If you do leave this parameter empty, real-time log deliveries of all projects are queried.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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
