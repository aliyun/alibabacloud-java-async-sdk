// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceInstanceCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceInstanceCertsResponseBody</p>
 */
public class DescribeResourceInstanceCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certs")
    private java.util.List < Certs> certs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeResourceInstanceCertsResponseBody(Builder builder) {
        this.certs = builder.certs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceInstanceCertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return certs
     */
    public java.util.List < Certs> getCerts() {
        return this.certs;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Certs> certs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The certificates.
         */
        public Builder certs(java.util.List < Certs> certs) {
            this.certs = certs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeResourceInstanceCertsResponseBody build() {
            return new DescribeResourceInstanceCertsResponseBody(this);
        } 

    } 

    public static class Certs extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("IsChainCompleted")
        private Boolean isChainCompleted;

        private Certs(Builder builder) {
            this.afterDate = builder.afterDate;
            this.beforeDate = builder.beforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.isChainCompleted = builder.isChainCompleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certs create() {
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
         * @return isChainCompleted
         */
        public Boolean getIsChainCompleted() {
            return this.isChainCompleted;
        }

        public static final class Builder {
            private Long afterDate; 
            private Long beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private String domain; 
            private Boolean isChainCompleted; 

            /**
             * The time when the certificate expires.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * The time when the certificate was issued.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * The globally unique ID of the certificate. The value is in the "Certificate ID-cn-hangzhou" format. For example, if the ID of the certificate is 123, the value of CertIdentifier is 123-cn-hangzhou.
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
             * The common name.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The domain name for which the certificate is issued.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether the certificate chain is complete.
             */
            public Builder isChainCompleted(Boolean isChainCompleted) {
                this.isChainCompleted = isChainCompleted;
                return this;
            }

            public Certs build() {
                return new Certs(this);
            } 

        } 

    }
}
