// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainIpaBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainIpaBpsDataRequest</p>
 */
public class DescribeDcdnDomainIpaBpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixTimeGap")
    private String fixTimeGap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNameEn")
    private String ispNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNameEn")
    private String locationNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeMerge")
    private String timeMerge;

    private DescribeDcdnDomainIpaBpsDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.fixTimeGap = builder.fixTimeGap;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.startTime = builder.startTime;
        this.timeMerge = builder.timeMerge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainIpaBpsDataRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fixTimeGap
     */
    public String getFixTimeGap() {
        return this.fixTimeGap;
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainIpaBpsDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String fixTimeGap; 
        private String interval; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String startTime; 
        private String timeMerge; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainIpaBpsDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.fixTimeGap = request.fixTimeGap;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
            this.timeMerge = request.timeMerge;
        } 

        /**
         * The accelerated domain name.
         * <p>
         * 
         * Separate multiple domain names with commas (,). If you leave this parameter empty, all accelerated domain names are queried.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Specifies whether to implement padding with zeros. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder fixTimeGap(String fixTimeGap) {
            this.putQueryParameter("FixTimeGap", fixTimeGap);
            this.fixTimeGap = fixTimeGap;
            return this;
        }

        /**
         * The time granularity of data entries. Unit: seconds.
         * <p>
         * 
         * The time granularity varies with the time range specified by **StartTime** and **EndTime**.
         * 
         * *   If the time range between StartTime and EndTime is less than 3 days, the valid values are **300**, **3600**, and **86400**. If you leave this parameter empty, **300** is used.
         * *   If the time range between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, the valid values are **3600** and **86400**. Default value: **3600**.
         * *   If the time range between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The name of the Internet service provider (ISP).
         * <p>
         * 
         * You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query ISPs.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The name of the region.
         * <p>
         * 
         * You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query regions.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Specifies whether to automatically set the interval. If you set **TimeMerge** to **1**, the value of the **Interval** parameter is automatically assigned based on the **startTime** and **endTime** parameters. You can specify either this parameter or the **Interval** parameter.
         */
        public Builder timeMerge(String timeMerge) {
            this.putQueryParameter("TimeMerge", timeMerge);
            this.timeMerge = timeMerge;
            return this;
        }

        @Override
        public DescribeDcdnDomainIpaBpsDataRequest build() {
            return new DescribeDcdnDomainIpaBpsDataRequest(this);
        } 

    } 

}
