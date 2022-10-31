// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterLiveRtcDurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterLiveRtcDurationRequest</p>
 */
public class DescribeMeterLiveRtcDurationRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("ServiceArea")
    private String serviceArea;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("appId")
    private String appId;

    private DescribeMeterLiveRtcDurationRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.serviceArea = builder.serviceArea;
        this.startTime = builder.startTime;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterLiveRtcDurationRequest create() {
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

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DescribeMeterLiveRtcDurationRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String serviceArea; 
        private String startTime; 
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterLiveRtcDurationRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.serviceArea = request.serviceArea;
            this.startTime = request.startTime;
            this.appId = request.appId;
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

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeMeterLiveRtcDurationRequest build() {
            return new DescribeMeterLiveRtcDurationRequest(this);
        } 

    } 

}
