// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailDataByLayerRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainDetailDataByLayerRequest</p>
 */
public class DescribeDomainDetailDataByLayerRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Field")
    @Validation(required = true)
    private String field;

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
    @Validation(required = true)
    private String startTime;

    private DescribeDomainDetailDataByLayerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.ispNameEn = builder.ispNameEn;
        this.layer = builder.layer;
        this.locationNameEn = builder.locationNameEn;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailDataByLayerRequest create() {
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
     * @return field
     */
    public String getField() {
        return this.field;
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

    public static final class Builder extends Request.Builder<DescribeDomainDetailDataByLayerRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String field; 
        private String ispNameEn; 
        private String layer; 
        private String locationNameEn; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainDetailDataByLayerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.field = request.field;
            this.ispNameEn = request.ispNameEn;
            this.layer = request.layer;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
        } 

        /**
         * The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISP names.
         * <p>
         * 
         * If you do not specify an ISP, data of all ISPs is queried.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The protocol by which you want to query data. Valid values: **http**, **https**, **quic**, and **all**.
         * <p>
         * 
         * The default value is **all**.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * >  The end time must be later than the start time.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The amount of network traffic. Unit: bytes.
         */
        public Builder layer(String layer) {
            this.putQueryParameter("Layer", layer);
            this.layer = layer;
            return this;
        }

        /**
         * The detailed data of the accelerated domain names.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
         * <p>
         * 
         * If you do not specify a region, data in all regions is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainDetailDataByLayerRequest build() {
            return new DescribeDomainDetailDataByLayerRequest(this);
        } 

    } 

}
