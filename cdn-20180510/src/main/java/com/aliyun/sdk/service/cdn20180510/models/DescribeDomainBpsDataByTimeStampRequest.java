// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBpsDataByTimeStampRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainBpsDataByTimeStampRequest</p>
 */
public class DescribeDomainBpsDataByTimeStampRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("IspNames")
    @Validation(required = true)
    private String ispNames;

    @Query
    @NameInMap("LocationNames")
    @Validation(required = true)
    private String locationNames;

    @Query
    @NameInMap("TimePoint")
    @Validation(required = true)
    private String timePoint;

    private DescribeDomainBpsDataByTimeStampRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ispNames = builder.ispNames;
        this.locationNames = builder.locationNames;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsDataByTimeStampRequest create() {
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
     * @return ispNames
     */
    public String getIspNames() {
        return this.ispNames;
    }

    /**
     * @return locationNames
     */
    public String getLocationNames() {
        return this.locationNames;
    }

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<DescribeDomainBpsDataByTimeStampRequest, Builder> {
        private String domainName; 
        private String ispNames; 
        private String locationNames; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainBpsDataByTimeStampRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ispNames = request.ispNames;
            this.locationNames = request.locationNames;
            this.timePoint = request.timePoint;
        } 

        /**
         * The accelerated domain name. You can specify only one domain name in each request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The names of the Internet service providers (ISPs). Separate multiple ISPs with commas (,).
         * <p>
         * 
         * You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
         */
        public Builder ispNames(String ispNames) {
            this.putQueryParameter("IspNames", ispNames);
            this.ispNames = ispNames;
            return this;
        }

        /**
         * The regions. Separate multiple regions with commas (,).
         * <p>
         * 
         * You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
         */
        public Builder locationNames(String locationNames) {
            this.putQueryParameter("LocationNames", locationNames);
            this.locationNames = locationNames;
            return this;
        }

        /**
         * The point in time to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The data is collected every 5 minutes.
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public DescribeDomainBpsDataByTimeStampRequest build() {
            return new DescribeDomainBpsDataByTimeStampRequest(this);
        } 

    } 

}
