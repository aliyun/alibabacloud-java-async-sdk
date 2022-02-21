// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificatesResponseBody</p>
 */
public class ListCertificatesResponseBody extends TeaModel {
    @NameInMap("Certificates")
    private Certificates certificates;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSize")
    private Integer totalSize;

    private ListCertificatesResponseBody(Builder builder) {
        this.certificates = builder.certificates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificates
     */
    public Certificates getCertificates() {
        return this.certificates;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private Certificates certificates; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalSize; 

        /**
         * Certificates.
         */
        public Builder certificates(Certificates certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListCertificatesResponseBody build() {
            return new ListCertificatesResponseBody(this);
        } 

    } 

    public static class Certificate extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        private Certificate(Builder builder) {
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificate create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String certificateId; 

            /**
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public Certificate build() {
                return new Certificate(this);
            } 

        } 

    }
    public static class Certificates extends TeaModel {
        @NameInMap("Certificate")
        private java.util.List < Certificate> certificate;

        private Certificates(Builder builder) {
            this.certificate = builder.certificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificate
         */
        public java.util.List < Certificate> getCertificate() {
            return this.certificate;
        }

        public static final class Builder {
            private java.util.List < Certificate> certificate; 

            /**
             * Certificate.
             */
            public Builder certificate(java.util.List < Certificate> certificate) {
                this.certificate = certificate;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
