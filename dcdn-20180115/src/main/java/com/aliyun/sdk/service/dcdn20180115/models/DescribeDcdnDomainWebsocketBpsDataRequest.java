// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainWebsocketBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainWebsocketBpsDataRequest</p>
 */
public class DescribeDcdnDomainWebsocketBpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

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

    private DescribeDcdnDomainWebsocketBpsDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainWebsocketBpsDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainWebsocketBpsDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainWebsocketBpsDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
        } 

        /**
         * The accelerated domain name.
         * <p>
         * 
         * Separate multiple domain names with commas (,). If you do not specify a value for this parameter, all accelerated domain names are queried.
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
         * The time granularity for a query. Unit: seconds.
         * <p>
         * 
         * The time granularity varies with the maximum time range per query. Valid values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Usage notes**.
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

        @Override
        public DescribeDcdnDomainWebsocketBpsDataRequest build() {
            return new DescribeDcdnDomainWebsocketBpsDataRequest(this);
        } 

    } 

}
