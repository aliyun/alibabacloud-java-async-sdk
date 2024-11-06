// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnCertificateDetailResponseBody</p>
 */
public class DescribeDcdnCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnCertificateDetailResponseBody(Builder builder) {
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.key = builder.key;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnCertificateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cert; 
        private Long certId; 
        private String certName; 
        private String key; 
        private String requestId; 

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----xxx-----END CERTIFICATE-----</p>
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>The key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>ak1htyxxxx</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7C69682-7F88-40DD-A198-10D0309E439B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnCertificateDetailResponseBody build() {
            return new DescribeDcdnCertificateDetailResponseBody(this);
        } 

    } 

}
