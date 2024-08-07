// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertsResponseBody</p>
 */
public class DescribeCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certs")
    private java.util.List < Certs> certs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCertsResponseBody(Builder builder) {
        this.certs = builder.certs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertsResponseBody create() {
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

    public static final class Builder {
        private java.util.List < Certs> certs; 
        private String requestId; 

        /**
         * The certificate information about the website.
         */
        public Builder certs(java.util.List < Certs> certs) {
            this.certs = certs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertsResponseBody build() {
            return new DescribeCertsResponseBody(this);
        } 

    } 

    public static class Certs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("Common")
        private String common;

        @com.aliyun.core.annotation.NameInMap("DomainRelated")
        private Boolean domainRelated;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        private Certs(Builder builder) {
            this.certIdentifier = builder.certIdentifier;
            this.common = builder.common;
            this.domainRelated = builder.domainRelated;
            this.endDate = builder.endDate;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certs create() {
            return builder().build();
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return common
         */
        public String getCommon() {
            return this.common;
        }

        /**
         * @return domainRelated
         */
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String certIdentifier; 
            private String common; 
            private Boolean domainRelated; 
            private String endDate; 
            private Integer id; 
            private String issuer; 
            private String name; 
            private String startDate; 

            /**
             * The global certificate ID, which is in the certificate ID-cn-hangzhou format. If the ID of the certificate is 123, CertIdentifier is 123-cn-hangzhou.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * The domain name that is associated with the certificate.
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * Indicates whether the certificate is associated with the domain name. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder domainRelated(Boolean domainRelated) {
                this.domainRelated = domainRelated;
                return this;
            }

            /**
             * The expiration date of the certificate. The value is a string.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The certificate ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The certificate authority (CA) that issued the certificate.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The issuance date of the certificate. The value is a string.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public Certs build() {
                return new Certs(this);
            } 

        } 

    }
}
