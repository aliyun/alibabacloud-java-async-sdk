// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainResourceRequest</p>
 */
public class DescribeDomainResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDomainPattern")
    private String queryDomainPattern;

    private DescribeDomainResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDomainPattern = builder.queryDomainPattern;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeDomainResourceRequest, Builder> {
        private String regionId; 
        private String domain; 
        private java.util.List < String > instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryDomainPattern; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.instanceIds = request.instanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryDomainPattern = request.queryDomainPattern;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The domain name of the website that you want to query.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * An array that consists of the IDs of instances to query.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The match mode. Valid values:
         * <p>
         * 
         * *   **fuzzy**: fuzzy match. This is the default value.
         * *   **exact**: exact match.
         */
        public Builder queryDomainPattern(String queryDomainPattern) {
            this.putQueryParameter("QueryDomainPattern", queryDomainPattern);
            this.queryDomainPattern = queryDomainPattern;
            return this;
        }

        @Override
        public DescribeDomainResourceRequest build() {
            return new DescribeDomainResourceRequest(this);
        } 

    } 

}
