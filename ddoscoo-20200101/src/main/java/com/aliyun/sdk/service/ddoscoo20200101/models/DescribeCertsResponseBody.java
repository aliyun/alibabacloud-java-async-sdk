// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertsResponseBody</p>
 */
public class DescribeCertsResponseBody extends TeaModel {
    @NameInMap("Certs")
    private java.util.List < Certs> certs;

    @NameInMap("RequestId")
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
        @NameInMap("CertIdentifier")
        private String certIdentifier;

        @NameInMap("Common")
        private String common;

        @NameInMap("DomainRelated")
        private Boolean domainRelated;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Name")
        private String name;

        @NameInMap("StartDate")
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
             * CertIdentifier.
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
             * *   **true**: The certificate is associated with the domain name.
             * *   **false**: The certificate is not associated with the domain name.
             */
            public Builder domainRelated(Boolean domainRelated) {
                this.domainRelated = domainRelated;
                return this;
            }

            /**
             * The expiration date of the certificate. string
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The ID of the certificate.
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
             * The issuance date of the certificate. string
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
