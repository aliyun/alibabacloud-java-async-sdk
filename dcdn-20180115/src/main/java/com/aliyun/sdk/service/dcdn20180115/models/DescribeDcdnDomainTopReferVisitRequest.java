// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainTopReferVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainTopReferVisitRequest</p>
 */
public class DescribeDcdnDomainTopReferVisitRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnDomainTopReferVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTopReferVisitRequest create() {
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainTopReferVisitRequest, Builder> {
        private String domainName; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainTopReferVisitRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
        } 

        /**
         * The accelerated domain name. You can specify only one domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The sorting order. Valid values:
         * <p>
         * 
         * *   **traf**: by network traffic
         * *   **pv**: by the number of visits
         * 
         * Default value: **pv**.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * To query the data on a specified day, use the yyyy-MM-ddT16:00:00Z format.
         * 
         * If you do not set this parameter, data collected within the last 24 hours is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnDomainTopReferVisitRequest build() {
            return new DescribeDcdnDomainTopReferVisitRequest(this);
        } 

    } 

}
