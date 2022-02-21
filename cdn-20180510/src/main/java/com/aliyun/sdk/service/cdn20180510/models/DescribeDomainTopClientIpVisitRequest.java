// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopClientIpVisitRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainTopClientIpVisitRequest</p>
 */
public class DescribeDomainTopClientIpVisitRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Limit")
    private String limit;

    @Query
    @NameInMap("LocationNameEn")
    private String locationNameEn;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainTopClientIpVisitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.locationNameEn = builder.locationNameEn;
        this.ownerId = builder.ownerId;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopClientIpVisitRequest create() {
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
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<DescribeDomainTopClientIpVisitRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String limit; 
        private String locationNameEn; 
        private Long ownerId; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainTopClientIpVisitRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.limit = response.limit;
            this.locationNameEn = response.locationNameEn;
            this.ownerId = response.ownerId;
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
         * Limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * LocationNameEn.
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
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
        public DescribeDomainTopClientIpVisitRequest build() {
            return new DescribeDomainTopClientIpVisitRequest(this);
        } 

    } 

}
