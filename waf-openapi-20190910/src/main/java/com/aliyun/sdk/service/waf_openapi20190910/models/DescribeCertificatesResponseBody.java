// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificatesResponseBody</p>
 */
public class DescribeCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * RequestId.
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
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private Long certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("IsUsing")
        private Boolean isUsing;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private java.util.List < String > sans;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.commonName = builder.commonName;
            this.endTime = builder.endTime;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
            private Long endTime; 
            private Boolean isUsing; 
            private java.util.List < String > sans; 

            /**
             * CertificateId.
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsUsing.
             */
            public Builder isUsing(Boolean isUsing) {
                this.isUsing = isUsing;
                return this;
            }

            /**
             * Sans.
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
