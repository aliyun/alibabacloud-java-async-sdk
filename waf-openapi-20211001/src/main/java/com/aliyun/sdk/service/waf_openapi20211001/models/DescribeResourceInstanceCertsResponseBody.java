// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceInstanceCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceInstanceCertsResponseBody</p>
 */
public class DescribeResourceInstanceCertsResponseBody extends TeaModel {
    @NameInMap("Certs")
    private java.util.List < Certs> certs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Certs.
         */
        public Builder certs(java.util.List < Certs> certs) {
            this.certs = certs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

        @NameInMap("IsChainCompleted")
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
             * AfterDate.
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * BeforeDate.
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * IsChainCompleted.
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
