// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainRealTimeDetailDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainRealTimeDetailDataRequest</p>
 */
public class DescribeDcdnDomainRealTimeDetailDataRequest extends Request {
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
    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @Query
    @NameInMap("Merge")
    private String merge;

    @Query
    @NameInMap("MergeLocIsp")
    private String mergeLocIsp;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeDcdnDomainRealTimeDetailDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.merge = builder.merge;
        this.mergeLocIsp = builder.mergeLocIsp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainRealTimeDetailDataRequest create() {
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
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return merge
     */
    public String getMerge() {
        return this.merge;
    }

    /**
     * @return mergeLocIsp
     */
    public String getMergeLocIsp() {
        return this.mergeLocIsp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainRealTimeDetailDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String field; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String merge; 
        private String mergeLocIsp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainRealTimeDetailDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.field = request.field;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.merge = request.merge;
            this.mergeLocIsp = request.mergeLocIsp;
            this.startTime = request.startTime;
        } 

        /**
         * The accelerated domain name. Separate multiple accelerated domain names with commas (,).
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
         * > The end time must be later than the start time, and the maximum time range to query is 10 minutes.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of information that you want to query. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **qps**: queries per second (QPS)
         * *   **bps**: bandwidth
         * *   **http_code**: HTTP status code
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * The name of the ISP. You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query the ISP name.
         * <p>
         * 
         * If you leave this parameter empty, all ISPs are queried.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The name of the region. You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query the region name.
         * <p>
         * 
         * If you leave this parameter empty, all regions are queried.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * Specifies whether to return a summary value. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * Default value: **false**.
         */
        public Builder merge(String merge) {
            this.putQueryParameter("Merge", merge);
            this.merge = merge;
            return this;
        }

        /**
         * Specifies whether to return a summary value of **LocationNameEn** and **IspNameEn**. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * Default value: **false**.
         */
        public Builder mergeLocIsp(String mergeLocIsp) {
            this.putQueryParameter("MergeLocIsp", mergeLocIsp);
            this.mergeLocIsp = mergeLocIsp;
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

        @Override
        public DescribeDcdnDomainRealTimeDetailDataRequest build() {
            return new DescribeDcdnDomainRealTimeDetailDataRequest(this);
        } 

    } 

}
