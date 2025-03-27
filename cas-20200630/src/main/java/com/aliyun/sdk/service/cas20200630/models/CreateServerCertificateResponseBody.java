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
 * {@link CreateServerCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServerCertificateResponseBody</p>
 */
public class CreateServerCertificateResponseBody extends TeaModel {
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

    private CreateServerCertificateResponseBody(Builder builder) {
        this.certificateChain = builder.certificateChain;
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String certificateChain; 
        private String identifier; 
        private String requestId; 
        private String serialNumber; 
        private String x509Certificate; 

        private Builder() {
        } 

        private Builder(CreateServerCertificateResponseBody model) {
            this.certificateChain = model.certificateChain;
            this.identifier = model.identifier;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
            this.x509Certificate = model.x509Certificate;
        } 

        /**
         * <p>The certificate chain of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n</p>
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * <p>The unique identifier of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
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
         * <p>The content of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
         */
        public Builder x509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public CreateServerCertificateResponseBody build() {
            return new CreateServerCertificateResponseBody(this);
        } 

    } 

}
