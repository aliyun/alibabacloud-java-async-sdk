// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListTlsInspectCACertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTlsInspectCACertificatesResponseBody</p>
 */
public class ListTlsInspectCACertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List<Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTlsInspectCACertificatesResponseBody(Builder builder) {
        this.certificates = builder.certificates;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTlsInspectCACertificatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificates
     */
    public java.util.List<Certificates> getCertificates() {
        return this.certificates;
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
        private java.util.List<Certificates> certificates; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTlsInspectCACertificatesResponseBody model) {
            this.certificates = model.certificates;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Certificates.
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTlsInspectCACertificatesResponseBody build() {
            return new ListTlsInspectCACertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTlsInspectCACertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTlsInspectCACertificatesResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CaCertId")
        private String caCertId;

        @com.aliyun.core.annotation.NameInMap("CaCertType")
        private String caCertType;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("KeySize")
        private Integer keySize;

        @com.aliyun.core.annotation.NameInMap("ParentCaCertId")
        private String parentCaCertId;

        @com.aliyun.core.annotation.NameInMap("SignAlgorithm")
        private String signAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Certificates(Builder builder) {
            this.algorithm = builder.algorithm;
            this.aliasName = builder.aliasName;
            this.caCertId = builder.caCertId;
            this.caCertType = builder.caCertType;
            this.expirationTime = builder.expirationTime;
            this.keySize = builder.keySize;
            this.parentCaCertId = builder.parentCaCertId;
            this.signAlgorithm = builder.signAlgorithm;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return caCertId
         */
        public String getCaCertId() {
            return this.caCertId;
        }

        /**
         * @return caCertType
         */
        public String getCaCertType() {
            return this.caCertType;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return keySize
         */
        public Integer getKeySize() {
            return this.keySize;
        }

        /**
         * @return parentCaCertId
         */
        public String getParentCaCertId() {
            return this.parentCaCertId;
        }

        /**
         * @return signAlgorithm
         */
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String algorithm; 
            private String aliasName; 
            private String caCertId; 
            private String caCertType; 
            private Long expirationTime; 
            private Integer keySize; 
            private String parentCaCertId; 
            private String signAlgorithm; 
            private String status; 

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.algorithm = model.algorithm;
                this.aliasName = model.aliasName;
                this.caCertId = model.caCertId;
                this.caCertType = model.caCertType;
                this.expirationTime = model.expirationTime;
                this.keySize = model.keySize;
                this.parentCaCertId = model.parentCaCertId;
                this.signAlgorithm = model.signAlgorithm;
                this.status = model.status;
            } 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * CaCertId.
             */
            public Builder caCertId(String caCertId) {
                this.caCertId = caCertId;
                return this;
            }

            /**
             * CaCertType.
             */
            public Builder caCertType(String caCertType) {
                this.caCertType = caCertType;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * KeySize.
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * ParentCaCertId.
             */
            public Builder parentCaCertId(String parentCaCertId) {
                this.parentCaCertId = parentCaCertId;
                return this;
            }

            /**
             * SignAlgorithm.
             */
            public Builder signAlgorithm(String signAlgorithm) {
                this.signAlgorithm = signAlgorithm;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
