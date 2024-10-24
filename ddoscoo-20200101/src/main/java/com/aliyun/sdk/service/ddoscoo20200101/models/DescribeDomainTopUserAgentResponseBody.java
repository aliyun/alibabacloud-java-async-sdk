// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainTopUserAgentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopUserAgentResponseBody</p>
 */
public class DescribeDomainTopUserAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTopUa")
    private java.util.List < DomainTopUa> domainTopUa;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopUserAgentResponseBody(Builder builder) {
        this.domainTopUa = builder.domainTopUa;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopUserAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainTopUa
     */
    public java.util.List < DomainTopUa> getDomainTopUa() {
        return this.domainTopUa;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainTopUa> domainTopUa; 
        private String requestId; 

        /**
         * DomainTopUa.
         */
        public Builder domainTopUa(java.util.List < DomainTopUa> domainTopUa) {
            this.domainTopUa = domainTopUa;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopUserAgentResponseBody build() {
            return new DescribeDomainTopUserAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopUserAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopUserAgentResponseBody</p>
     */
    public static class DomainTopUa extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        @com.aliyun.core.annotation.NameInMap("UserAgent")
        private String userAgent;

        private DomainTopUa(Builder builder) {
            this.domain = builder.domain;
            this.pv = builder.pv;
            this.userAgent = builder.userAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTopUa create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return userAgent
         */
        public String getUserAgent() {
            return this.userAgent;
        }

        public static final class Builder {
            private String domain; 
            private Long pv; 
            private String userAgent; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * UserAgent.
             */
            public Builder userAgent(String userAgent) {
                this.userAgent = userAgent;
                return this;
            }

            public DomainTopUa build() {
                return new DomainTopUa(this);
            } 

        } 

    }
}
