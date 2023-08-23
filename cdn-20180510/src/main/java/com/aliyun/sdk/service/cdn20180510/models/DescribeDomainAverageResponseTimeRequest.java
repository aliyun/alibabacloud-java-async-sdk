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
        private String startTime; 
        private String timeMerge; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainAverageResponseTimeRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
            this.timeMerge = request.timeMerge;
        } 

        /**
         * The accelerated domain name. Separate multiple accelerated domain names with commas (,).
         * <p>
         * 
         * By default, this operation queries the geographic distribution of users for all accelerated domain names.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The type of the query condition. When you set the value to dynamic, this operation queries the average response time of dynamic resources and static resources. If you do not set this parameter, this operation queries the average response time of only static resources.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
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
         * The time interval between the data entries. Unit: seconds. The value varies based on the values of the **StartTime** and **EndTime** parameters. Valid values:
         * <p>
         * 
         * *   If the time span between StartTime and EndTime is less than 3 days, valid values are **300**, **3600**, and **86400**. Default value: **300**.
         * *   If the time span between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, valid values are **3600** and **86400**. Default value: **3600**.
         * *   If the time range between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs. If you do not set this parameter, data of all ISPs is queried.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions. If you do not set this parameter, data in all regions is queried.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
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

        /**
         * Specifies whether to automatically set the interval. If you set the value to 1, the value of the Interval parameter is automatically assigned based on the StartTime and EndTime parameters. You can set this parameter or the Interval parameter.
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
