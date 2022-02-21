// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopReferVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainTopReferVisitRequest</p>
 */
public class DescribeDomainTopReferVisitRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Percent")
    private String percent;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainTopReferVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.percent = builder.percent;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopReferVisitRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return percent
     */
    public String getPercent() {
        return this.percent;
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

    public static final class Builder extends Request.Builder<DescribeDomainTopReferVisitRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private Long ownerId; 
        private String percent; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainTopReferVisitRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.ownerId = response.ownerId;
            this.percent = response.percent;
            this.sortBy = response.sortBy;
            this.startTime = response.startTime;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(String percent) {
            this.putQueryParameter("Percent", percent);
            this.percent = percent;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainTopReferVisitRequest build() {
            return new DescribeDomainTopReferVisitRequest(this);
        } 

    } 

}
