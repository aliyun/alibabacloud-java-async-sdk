// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAverageResponseTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainAverageResponseTimeRequest</p>
 */
public class DescribeDomainAverageResponseTimeRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainType")
    private String domainType;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("IspNameEn")
    private String ispNameEn;

    @Query
    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TimeMerge")
    private String timeMerge;

    private DescribeDomainAverageResponseTimeRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.timeMerge = builder.timeMerge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAverageResponseTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
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
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeMerge
     */
    public String getTimeMerge() {
        return this.timeMerge;
    }

    public static final class Builder extends Request.Builder<DescribeDomainAverageResponseTimeRequest, Builder> {
        private String domainName; 
        private String domainType; 
        private String endTime; 
        private String interval; 
        private String ispNameEn; 
        private String locationNameEn; 
        private Long ownerId; 
        private String startTime; 
        private String timeMerge; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainAverageResponseTimeRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.domainType = response.domainType;
            this.endTime = response.endTime;
            this.interval = response.interval;
            this.ispNameEn = response.ispNameEn;
            this.locationNameEn = response.locationNameEn;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.timeMerge = response.timeMerge;
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
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
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
         * IspNameEn.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * LocationNameEn.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeMerge.
         */
        public Builder timeMerge(String timeMerge) {
            this.putQueryParameter("TimeMerge", timeMerge);
            this.timeMerge = timeMerge;
            return this;
        }

        @Override
        public DescribeDomainAverageResponseTimeRequest build() {
            return new DescribeDomainAverageResponseTimeRequest(this);
        } 

    } 

}
