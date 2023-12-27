// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRtcPeakChannelCntDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeRtcPeakChannelCntDataRequest</p>
 */
public class DescribeRtcPeakChannelCntDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ServiceArea")
    private String serviceArea;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeRtcPeakChannelCntDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.serviceArea = builder.serviceArea;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcPeakChannelCntDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return serviceArea
     */
    public String getServiceArea() {
        return this.serviceArea;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRtcPeakChannelCntDataRequest, Builder> {
        private String appId; 
        private String endTime; 
        private String interval; 
        private Long ownerId; 
        private String serviceArea; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRtcPeakChannelCntDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ownerId = request.ownerId;
            this.serviceArea = request.serviceArea;
            this.startTime = request.startTime;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ServiceArea.
         */
        public Builder serviceArea(String serviceArea) {
            this.putQueryParameter("ServiceArea", serviceArea);
            this.serviceArea = serviceArea;
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
        public DescribeRtcPeakChannelCntDataRequest build() {
            return new DescribeRtcPeakChannelCntDataRequest(this);
        } 

    } 

}
