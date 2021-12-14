// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificatesResponseBody</p>
 */
public class DescribeCertificatesResponseBody extends TeaModel {
    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeCertificatesResponseBody(Builder builder) {
        this.certificates = builder.certificates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Certificates> certificates; 
        private String requestId; 

        /**
         * <p>Certificates.</p>
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertificatesResponseBody build() {
            return new DescribeCertificatesResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("CertificateId")
        private Long certificateId;

        @NameInMap("CertificateName")
        private String certificateName;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("IsUsing")
        private Boolean isUsing;

        @NameInMap("Sans")
        private java.util.List < String > sans;


        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.commonName = builder.commonName;
            this.isUsing = builder.isUsing;
            this.sans = builder.sans;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public Long getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return isUsing
         */
        public Boolean getIsUsing() {
            return this.isUsing;
        }

        /**
         * @return sans
         */
        public java.util.List < String > getSans() {
            return this.sans;
        }

        public static final class Builder {
            private Long certificateId; 
            private String certificateName; 
            private String commonName; 
            private Boolean isUsing; 
            private java.util.List < String > sans; 

            /**
             * <p>CertificateId.</p>
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>CertificateName.</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>CommonName.</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>IsUsing.</p>
             */
            public Builder isUsing(Boolean isUsing) {
                this.isUsing = isUsing;
                return this;
            }

            /**
             * <p>Sans.</p>
             */
            public Builder sans(java.util.List < String > sans) {
                this.sans = sans;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
