// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainTopFingerprintResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopFingerprintResponseBody</p>
 */
public class DescribeDomainTopFingerprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTopFp")
    private java.util.List < DomainTopFp> domainTopFp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopFingerprintResponseBody(Builder builder) {
        this.domainTopFp = builder.domainTopFp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopFingerprintResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainTopFp
     */
    public java.util.List < DomainTopFp> getDomainTopFp() {
        return this.domainTopFp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainTopFp> domainTopFp; 
        private String requestId; 

        /**
         * DomainTopFp.
         */
        public Builder domainTopFp(java.util.List < DomainTopFp> domainTopFp) {
            this.domainTopFp = domainTopFp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopFingerprintResponseBody build() {
            return new DescribeDomainTopFingerprintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopFingerprintResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopFingerprintResponseBody</p>
     */
    public static class DomainTopFp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Fingerprinting")
        private String fingerprinting;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        private DomainTopFp(Builder builder) {
            this.domain = builder.domain;
            this.fingerprinting = builder.fingerprinting;
            this.pv = builder.pv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTopFp create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return fingerprinting
         */
        public String getFingerprinting() {
            return this.fingerprinting;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        public static final class Builder {
            private String domain; 
            private String fingerprinting; 
            private Long pv; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Fingerprinting.
             */
            public Builder fingerprinting(String fingerprinting) {
                this.fingerprinting = fingerprinting;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            public DomainTopFp build() {
                return new DomainTopFp(this);
            } 

        } 

    }
}
