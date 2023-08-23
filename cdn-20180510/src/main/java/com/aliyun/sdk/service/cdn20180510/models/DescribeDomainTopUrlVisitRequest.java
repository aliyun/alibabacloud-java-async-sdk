// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopUrlVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainTopUrlVisitRequest</p>
 */
public class DescribeDomainTopUrlVisitRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainTopUrlVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopUrlVisitRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainTopUrlVisitRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainTopUrlVisitRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.sortBy = request.sortBy;
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
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * > The end time must be later than the start time. The maximum time range that can be specified is seven days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The method that is used to sort the returned URLs. Default value: **pv**. Valid values:
         * <p>
         * 
         * *   **traf**: by network traffic
         * *   **pv**: by the number of page views
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The start of the time range to query.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * If you want to query data of a specific day, we recommend that you set the value in the yyyy-MM-ddT16:00:00Z format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainTopUrlVisitRequest build() {
            return new DescribeDomainTopUrlVisitRequest(this);
        } 

    } 

}
