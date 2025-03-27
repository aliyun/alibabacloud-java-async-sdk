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
 * {@link CreateCustomCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomCertificateResponseBody</p>
 */
public class CreateCustomCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("CertificateChain")
    private String certificateChain;

    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    private CreateCustomCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
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

    public static final class Builder {
        private String certificate; 
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 

        private Builder() {
        } 

        private Builder(CreateCustomCertificateResponseBody model) {
            this.certificate = model.certificate;
            this.certificateChain = model.certificateChain;
            this.identifier = model.identifier;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
        } 

        /**
         * <p>The content of the certificate. This parameter is returned only if Immediately is set to 1 or 2.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIEkjCCA3qgAwIBAgIQCgFBQgAAAVOFc2oLheynCDANBgkqhkiG9w0BAQsFADA/
         * ...
         * ...
         * ...
         * KOqkqm57TH2H3eDJAkSnh6/DNFu0Qg==
         * -----END CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The certificate chain of the certificate. This parameter is returned only if Immediately is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIBfzCCATGgAwIBAgIUfI5kSdcO2S0+LkpdL3b2VUJG10YwBQYDK2VwMDUxCzAJ
         * ...
         * ...
         * ...
         * ZYYG
         * -----END CERTIFICATE-----
         * -----BEGIN CERTIFICATE-----
         * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
         * ...
         * ...
         * ...
         * KL5cUmF
         * -----END CERTIFICATE-----</p>
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789ABC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the certificate. This parameter is returned only if Immediately is set to 1 or 2.</p>
         * 
         * <strong>example:</strong>
         * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public CreateCustomCertificateResponseBody build() {
            return new CreateCustomCertificateResponseBody(this);
        } 

    } 

}
