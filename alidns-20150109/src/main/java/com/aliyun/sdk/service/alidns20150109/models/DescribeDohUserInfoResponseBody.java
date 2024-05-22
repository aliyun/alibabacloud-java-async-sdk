// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDohUserInfoResponseBody</p>
 */
public class DescribeDohUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainCount")
    private Integer domainCount;

    @com.aliyun.core.annotation.NameInMap("PdnsId")
    private Long pdnsId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomainCount")
    private Integer subDomainCount;

    private DescribeDohUserInfoResponseBody(Builder builder) {
        this.domainCount = builder.domainCount;
        this.pdnsId = builder.pdnsId;
        this.requestId = builder.requestId;
        this.subDomainCount = builder.subDomainCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohUserInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainCount
     */
    public Integer getDomainCount() {
        return this.domainCount;
    }

    /**
     * @return pdnsId
     */
    public Long getPdnsId() {
        return this.pdnsId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomainCount
     */
    public Integer getSubDomainCount() {
        return this.subDomainCount;
    }

    public static final class Builder {
        private Integer domainCount; 
        private Long pdnsId; 
        private String requestId; 
        private Integer subDomainCount; 

        /**
         * The number of accessed domains.
         */
        public Builder domainCount(Integer domainCount) {
            this.domainCount = domainCount;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud public DNS user.
         */
        public Builder pdnsId(Long pdnsId) {
            this.pdnsId = pdnsId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of accessed subdomains.
         */
        public Builder subDomainCount(Integer subDomainCount) {
            this.subDomainCount = subDomainCount;
            return this;
        }

        public DescribeDohUserInfoResponseBody build() {
            return new DescribeDohUserInfoResponseBody(this);
        } 

    } 

}
