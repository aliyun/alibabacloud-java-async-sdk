// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainH2FingerprintResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainH2FingerprintResponseBody</p>
 */
public class DescribeDomainH2FingerprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainH2Fp")
    private java.util.List < DomainH2Fp> domainH2Fp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainH2FingerprintResponseBody(Builder builder) {
        this.domainH2Fp = builder.domainH2Fp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainH2FingerprintResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainH2Fp
     */
    public java.util.List < DomainH2Fp> getDomainH2Fp() {
        return this.domainH2Fp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainH2Fp> domainH2Fp; 
        private String requestId; 

        /**
         * DomainH2Fp.
         */
        public Builder domainH2Fp(java.util.List < DomainH2Fp> domainH2Fp) {
            this.domainH2Fp = domainH2Fp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainH2FingerprintResponseBody build() {
            return new DescribeDomainH2FingerprintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainH2FingerprintResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainH2FingerprintResponseBody</p>
     */
    public static class DomainH2Fp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("H2Fingerprint")
        private String h2Fingerprint;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        private DomainH2Fp(Builder builder) {
            this.domain = builder.domain;
            this.h2Fingerprint = builder.h2Fingerprint;
            this.pv = builder.pv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainH2Fp create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return h2Fingerprint
         */
        public String getH2Fingerprint() {
            return this.h2Fingerprint;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        public static final class Builder {
            private String domain; 
            private String h2Fingerprint; 
            private Long pv; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * H2Fingerprint.
             */
            public Builder h2Fingerprint(String h2Fingerprint) {
                this.h2Fingerprint = h2Fingerprint;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            public DomainH2Fp build() {
                return new DomainH2Fp(this);
            } 

        } 

    }
}
