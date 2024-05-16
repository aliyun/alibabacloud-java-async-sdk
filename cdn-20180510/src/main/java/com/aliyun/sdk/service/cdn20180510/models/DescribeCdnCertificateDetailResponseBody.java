// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnCertificateDetailResponseBody</p>
 */
public class DescribeCdnCertificateDetailResponseBody extends TeaModel {
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

    private DescribeCdnCertificateDetailResponseBody(Builder builder) {
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.key = builder.key;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnCertificateDetailResponseBody create() {
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
         * The certificate.
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * The ID of the certificate.
         */
        public Builder certId(Long certId) {
            this.certId = certId;
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
         * The key of the SSL certificate.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnCertificateDetailResponseBody build() {
            return new DescribeCdnCertificateDetailResponseBody(this);
        } 

    } 

}
