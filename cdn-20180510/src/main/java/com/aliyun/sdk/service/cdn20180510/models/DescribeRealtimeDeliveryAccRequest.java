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
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.ownerId = builder.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeRealtimeDeliveryAccRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String logStore; 
        private Long ownerId; 
        private String project; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRealtimeDeliveryAccRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.interval = response.interval;
            this.logStore = response.logStore;
            this.ownerId = response.ownerId;
            this.project = response.project;
            this.startTime = response.startTime;
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
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * LogStore.
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
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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

        @Override
        public DescribeRealtimeDeliveryAccRequest build() {
            return new DescribeRealtimeDeliveryAccRequest(this);
        } 

    } 

}
