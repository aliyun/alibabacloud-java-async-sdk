// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSSLCertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSSLCertificateListRequest</p>
 */
public class DescribeDcdnSSLCertificateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeDcdnSSLCertificateListRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKeyword = builder.searchKeyword;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSSLCertificateListRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSSLCertificateListRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchKeyword; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSSLCertificateListRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKeyword = request.searchKeyword;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The accelerated domain secured by the SSL certificate. HTTPS secure acceleration is enabled for the accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * <p>The number of the page. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page. Valid values: <strong>1 to 1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keyword that is used to query the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>taobao</p>
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putQueryParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeDcdnSSLCertificateListRequest build() {
            return new DescribeDcdnSSLCertificateListRequest(this);
        } 

    } 

}
