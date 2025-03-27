// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCertDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertDetailResponseBody</p>
 */
public class DescribeCertDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertDetail")
    private CertDetail certDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCertDetailResponseBody model) {
            this.certDetail = model.certDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the certificate.</p>
         */
        public Builder certDetail(CertDetail certDetail) {
            this.certDetail = certDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3C115DBE-8E53-5A12-9CAF-FD3F****CDF6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertDetailResponseBody build() {
            return new DescribeCertDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCertDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCertDetailResponseBody</p>
     */
    public static class CertDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private java.util.List<String> sans;

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
        public java.util.List<String> getSans() {
            return this.sans;
        }

        public static final class Builder {
            private Long afterDate; 
            private Long beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private String domain; 
            private java.util.List<String> sans; 

            private Builder() {
            } 

            private Builder(CertDetail model) {
                this.afterDate = model.afterDate;
                this.beforeDate = model.beforeDate;
                this.certIdentifier = model.certIdentifier;
                this.certName = model.certName;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.sans = model.sans;
            } 

            /**
             * <p>The time when the certificate expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1976256736582</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The time when the certificate was issued. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1976256736582</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>testCertName</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The primary domain name, which is a common name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.xxxaliyun.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The domain name that is associated with the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.xxxaliyun.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The other domain names that are associated with the certificate.</p>
             */
            public Builder sans(java.util.List<String> sans) {
                this.sans = sans;
                return this;
            }

            public CertDetail build() {
                return new CertDetail(this);
            } 

        } 

    }
}
