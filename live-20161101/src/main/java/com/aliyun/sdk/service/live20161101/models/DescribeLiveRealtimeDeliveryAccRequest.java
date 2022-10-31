// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeDeliveryAccRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveRealtimeDeliveryAccRequest</p>
 */
public class DescribeLiveRealtimeDeliveryAccRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    private String domainName;

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

    private DescribeLiveRealtimeDeliveryAccRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
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

    public static DescribeLiveRealtimeDeliveryAccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<DescribeLiveRealtimeDeliveryAccRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String endTime; 
        private String interval; 
        private String logStore; 
        private Long ownerId; 
        private String project; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveRealtimeDeliveryAccRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.logStore = request.logStore;
            this.ownerId = request.ownerId;
            this.project = request.project;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
        public DescribeLiveRealtimeDeliveryAccRequest build() {
            return new DescribeLiveRealtimeDeliveryAccRequest(this);
        } 

    } 

}
