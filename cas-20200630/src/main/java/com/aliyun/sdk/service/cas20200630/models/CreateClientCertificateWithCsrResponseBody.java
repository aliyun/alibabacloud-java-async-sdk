// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link CreateClientCertificateWithCsrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientCertificateWithCsrResponseBody</p>
 */
public class CreateClientCertificateWithCsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertKmcRep1")
    private String certKmcRep1;

    @com.aliyun.core.annotation.NameInMap("CertSignBufKmc")
    private String certSignBufKmc;

    @com.aliyun.core.annotation.NameInMap("CertificateChain")
    private String certificateChain;

    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("X509Certificate")
    private String x509Certificate;

    private CreateClientCertificateWithCsrResponseBody(Builder builder) {
        this.certKmcRep1 = builder.certKmcRep1;
        this.certSignBufKmc = builder.certSignBufKmc;
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientCertificateWithCsrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certKmcRep1
     */
    public String getCertKmcRep1() {
        return this.certKmcRep1;
    }

    /**
     * @return certSignBufKmc
     */
    public String getCertSignBufKmc() {
        return this.certSignBufKmc;
    }

    /**
     * @return certificateChain
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder {
        private String certKmcRep1; 
        private String certSignBufKmc; 
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 
        private String x509Certificate; 

        private Builder() {
        } 

        private Builder(CreateClientCertificateWithCsrResponseBody model) {
            this.certKmcRep1 = model.certKmcRep1;
            this.certSignBufKmc = model.certSignBufKmc;
            this.certificateChain = model.certificateChain;
            this.identifier = model.identifier;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
            this.x509Certificate = model.x509Certificate;
        } 

        /**
         * CertKmcRep1.
         */
        public Builder certKmcRep1(String certKmcRep1) {
            this.certKmcRep1 = certKmcRep1;
            return this;
        }

        /**
         * CertSignBufKmc.
         */
        public Builder certSignBufKmc(String certSignBufKmc) {
            this.certSignBufKmc = certSignBufKmc;
            return this;
        }

        /**
         * <p>The certificate chain of the client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n</p>
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * <p>The unique identifier of the client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>200ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>31C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>0f29522da2dae7a1c4b6ab7132ad3c06</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The content of the client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
         */
        public Builder x509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public CreateClientCertificateWithCsrResponseBody build() {
            return new CreateClientCertificateWithCsrResponseBody(this);
        } 

    } 

}
