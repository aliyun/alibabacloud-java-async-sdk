// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainQpsDataByLayerRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainQpsDataByLayerRequest</p>
 */
public class DescribeDcdnDomainQpsDataByLayerRequest extends Request {
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
    @NameInMap("IspNameEn")
    private String ispNameEn;

    @Query
    @NameInMap("Layer")
    private String layer;

    @Query
    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainQpsDataByLayerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.layer = builder.layer;
        this.locationNameEn = builder.locationNameEn;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainQpsDataByLayerRequest create() {
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
     * @return layer
     */
    public String getLayer() {
        return this.layer;
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainQpsDataByLayerRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String interval; 
        private String ispNameEn; 
        private String layer; 
        private String locationNameEn; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainQpsDataByLayerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.layer = request.layer;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
        } 

        /**
         * The accelerated domain name. You can specify multiple domain names and separate them with commas (,). You can specify up to 500 domain names in each request. The query results of multiple domain names are aggregated. If you do not specify a domain name, data of all domain names is queried.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The time interval between the data entries. Unit: seconds.
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
         * The name of the ISP. You can call the DescribeDcdnRegionAndIsp operation to query the ISP name. If you do not specify a value for this parameter, all ISPs are queried.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The layers at which you want to query the QPS. The network layer supports IPv4 and IPv6. The application layer supports http, https, and quic. You can also set the value to all. Default value: all.
         */
        public Builder layer(String layer) {
            this.putQueryParameter("Layer", layer);
            this.layer = layer;
            return this;
        }

        /**
         * The name of the region. You can call the DescribeDcdnRegionAndIsp operation to query the region name. If you do not specify a value for this parameter, all regions are queried.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The minimum data granularity is 5 minutes. If you do not set this parameter, data in the last 24 hours is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnDomainQpsDataByLayerRequest build() {
            return new DescribeDcdnDomainQpsDataByLayerRequest(this);
        } 

    } 

}
