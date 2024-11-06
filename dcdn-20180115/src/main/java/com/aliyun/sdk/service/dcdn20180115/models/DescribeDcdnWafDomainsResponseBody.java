// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafDomainsResponseBody</p>
 */
public class DescribeDcdnWafDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List < Domains> domains;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnWafDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
        return this.domains;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Domains> domains; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The protected domain name.</p>
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The page number of the returned page, which is the same as the PageNumber parameter in request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of domain names returned per page, which is the same as the PageSize parameter in request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>153ca2cd-3c01-44be-b408-64dbc6c88630</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of protected domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafDomainsResponseBody build() {
            return new DescribeDcdnWafDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIpTag")
        private String clientIpTag;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PolicyCount")
        private Integer policyCount;

        private Domains(Builder builder) {
            this.clientIpTag = builder.clientIpTag;
            this.domainName = builder.domainName;
            this.policyCount = builder.policyCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return clientIpTag
         */
        public String getClientIpTag() {
            return this.clientIpTag;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return policyCount
         */
        public Integer getPolicyCount() {
            return this.policyCount;
        }

        public static final class Builder {
            private String clientIpTag; 
            private String domainName; 
            private Integer policyCount; 

            /**
             * <p>The header of IP address of the client that is connected to the point of presence (POP).</p>
             * 
             * <strong>example:</strong>
             * <p>X-Forwarded-For</p>
             */
            public Builder clientIpTag(String clientIpTag) {
                this.clientIpTag = clientIpTag;
                return this;
            }

            /**
             * <p>The protected domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The number of protection policies that were configured for the protected domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder policyCount(Integer policyCount) {
                this.policyCount = policyCount;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
