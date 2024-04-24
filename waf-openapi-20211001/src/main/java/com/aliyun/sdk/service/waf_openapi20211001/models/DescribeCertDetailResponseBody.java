// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertDetailResponseBody</p>
 */
public class DescribeCertDetailResponseBody extends TeaModel {
    @NameInMap("CertDetail")
    private CertDetail certDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCertDetailResponseBody(Builder builder) {
        this.certDetail = builder.certDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return certDetail
     */
    public CertDetail getCertDetail() {
        return this.certDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertDetail certDetail; 
        private String requestId; 

        /**
         * The details of the certificate.
         */
        public Builder certDetail(CertDetail certDetail) {
            this.certDetail = certDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertDetailResponseBody build() {
            return new DescribeCertDetailResponseBody(this);
        } 

    } 

    public static class CertDetail extends TeaModel {
        @NameInMap("AfterDate")
        private Long afterDate;

        @NameInMap("BeforeDate")
        private Long beforeDate;

        @NameInMap("CertIdentifier")
        private String certIdentifier;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Sans")
        private java.util.List < String > sans;

        private CertDetail(Builder builder) {
            this.afterDate = builder.afterDate;
            this.beforeDate = builder.beforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.sans = builder.sans;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertDetail create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public Long getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return beforeDate
         */
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return sans
         */
        public java.util.List < String > getSans() {
            return this.sans;
        }

        public static final class Builder {
            private Long afterDate; 
            private Long beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private String domain; 
            private java.util.List < String > sans; 

            /**
             * The time when the certificate expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The time when the certificate was issued. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The ID of the certificate.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The primary domain name, which is a common name.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The domain name that is associated with the certificate.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The other domain names that are associated with the certificate.
             */
            public Builder sans(java.util.List < String > sans) {
                this.sans = sans;
                return this;
            }

            public CertDetail build() {
                return new CertDetail(this);
            } 

        } 

    }
}
