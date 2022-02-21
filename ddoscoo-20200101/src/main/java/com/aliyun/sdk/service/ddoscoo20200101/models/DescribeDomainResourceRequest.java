// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainResourceRequest</p>
 */
public class DescribeDomainResourceRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("QueryDomainPattern")
    private String queryDomainPattern;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDomainResourceRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDomainPattern = builder.queryDomainPattern;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryDomainPattern
     */
    public String getQueryDomainPattern() {
        return this.queryDomainPattern;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDomainResourceRequest, Builder> {
        private String domain; 
        private java.util.List < String > instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryDomainPattern; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainResourceRequest response) {
            super(response);
            this.domain = response.domain;
            this.instanceIds = response.instanceIds;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.queryDomainPattern = response.queryDomainPattern;
            this.regionId = response.regionId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryDomainPattern.
         */
        public Builder queryDomainPattern(String queryDomainPattern) {
            this.putQueryParameter("QueryDomainPattern", queryDomainPattern);
            this.queryDomainPattern = queryDomainPattern;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDomainResourceRequest build() {
            return new DescribeDomainResourceRequest(this);
        } 

    } 

}
