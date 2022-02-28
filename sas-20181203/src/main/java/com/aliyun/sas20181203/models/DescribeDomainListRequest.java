// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainListRequest</p>
 */
public class DescribeDomainListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DomainType")
    private String domainType;

    @Query
    @NameInMap("FuzzyDomain")
    private String fuzzyDomain;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeDomainListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.domainType = builder.domainType;
        this.fuzzyDomain = builder.fuzzyDomain;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return fuzzyDomain
     */
    public String getFuzzyDomain() {
        return this.fuzzyDomain;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeDomainListRequest, Builder> {
        private Integer currentPage; 
        private String domainType; 
        private String fuzzyDomain; 
        private Integer pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainListRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.domainType = response.domainType;
            this.fuzzyDomain = response.fuzzyDomain;
            this.pageSize = response.pageSize;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * FuzzyDomain.
         */
        public Builder fuzzyDomain(String fuzzyDomain) {
            this.putQueryParameter("FuzzyDomain", fuzzyDomain);
            this.fuzzyDomain = fuzzyDomain;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeDomainListRequest build() {
            return new DescribeDomainListRequest(this);
        } 

    } 

}
