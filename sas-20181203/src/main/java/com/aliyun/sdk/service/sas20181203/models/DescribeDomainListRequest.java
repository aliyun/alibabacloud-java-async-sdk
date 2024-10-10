// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainListRequest</p>
 */
public class DescribeDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyDomain")
    private String fuzzyDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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

        private Builder(DescribeDomainListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.domainType = request.domainType;
            this.fuzzyDomain = request.fuzzyDomain;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The type of the domain name that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>root</strong>: root domain name</li>
         * <li><strong>sub</strong>: subdomain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The keyword that is used to query domain names. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder fuzzyDomain(String fuzzyDomain) {
            this.putQueryParameter("FuzzyDomain", fuzzyDomain);
            this.fuzzyDomain = fuzzyDomain;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.122.XX.XX</p>
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
