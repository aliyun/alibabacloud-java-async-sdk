// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeDetailDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainRealTimeDetailDataRequest</p>
 */
public class DescribeDomainRealTimeDetailDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    @com.aliyun.core.annotation.Validation(required = true)
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNameEn")
    private String ispNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNameEn")
    private String locationNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Merge")
    private String merge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeLocIsp")
    private String mergeLocIsp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDomainRealTimeDetailDataRequest(Builder builder) {
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

    public static DescribeDomainRealTimeDetailDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainRealTimeDetailDataRequest, Builder> {
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

        private Builder(DescribeDomainRealTimeDetailDataRequest request) {
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
         * The accelerated domain name that you want to query.
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
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:40:00Z.
         * 
         * > The end time must be later than the start time. The difference between the end time and the start time cannot exceed 10 minutes.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of data that you want to query. You can specify multiple data types and separate them with commas (,). Valid values:
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
         * The name of the Internet service provider (ISP). You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs. If you do not specify an ISP, data of all ISPs is queried.
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * The name of the region. If you do not specify a region, data in all regions is queried. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * Specifies whether to return a summary value based on ISPs and regions. Valid values:
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
         * Specifies whether to return a summary value based on ISPs and regions. Valid values:
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
         * The beginning of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:33:00Z.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainRealTimeDetailDataRequest build() {
            return new DescribeDomainRealTimeDetailDataRequest(this);
        } 

    } 

}
