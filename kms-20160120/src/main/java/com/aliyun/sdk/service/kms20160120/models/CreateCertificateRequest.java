// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateRequest</p>
 */
public class CreateCertificateRequest extends Request {
    @Query
    @NameInMap("ExportablePrivateKey")
    private Boolean exportablePrivateKey;

    @Query
    @NameInMap("KeySpec")
    @Validation(required = true)
    private String keySpec;

    @Query
    @NameInMap("Subject")
    @Validation(required = true)
    private String subject;

    @Query
    @NameInMap("SubjectAlternativeNames")
    private java.util.Map < String, ? > subjectAlternativeNames;

    private CreateCertificateRequest(Builder builder) {
        super(builder);
        this.exportablePrivateKey = builder.exportablePrivateKey;
        this.keySpec = builder.keySpec;
        this.subject = builder.subject;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportablePrivateKey
     */
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return subjectAlternativeNames
     */
    public java.util.Map < String, ? > getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public static final class Builder extends Request.Builder<CreateCertificateRequest, Builder> {
        private Boolean exportablePrivateKey; 
        private String keySpec; 
        private String subject; 
        private java.util.Map < String, ? > subjectAlternativeNames; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateRequest request) {
            super(request);
            this.exportablePrivateKey = request.exportablePrivateKey;
            this.keySpec = request.keySpec;
            this.subject = request.subject;
            this.subjectAlternativeNames = request.subjectAlternativeNames;
        } 

        /**
         * Specifies whether the private key of the certificate can be exported for use. Valid values:
         * <p>
         * 
         * *   true: The private key of the certificate can be exported for use. This is the default value.
         * *   false: The private key of the certificate cannot be exported for use. We recommend that you set this parameter to false to protect keys with a higher security level.
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.putQueryParameter("ExportablePrivateKey", exportablePrivateKey);
            this.exportablePrivateKey = exportablePrivateKey;
            return this;
        }

        /**
         * The type of the key. Valid values:
         * <p>
         * 
         * *   RSA\_2048
         * *   EC_P256
         * *   EC_SM2
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * The certificate subject, which is the owner of the certificate.
         * <p>
         * 
         * Specify the value in the distinguished name (DN) format, as defined in [RFC 2253](https://tools.ietf.org/html/rfc2253?spm=a2c4g.11186623.2.13.265f1a1cGFCn3Q). A DN is a sequence of relative distinguished names (RDNs).
         * 
         * RDNs are key-value pairs in the format of `attribute1=value1,attribute2=value2`. Separate multiple RDNs with commas (,).
         * 
         * The Subject parameter consists of the following fields:
         * 
         * *   CN: required. The name of the certificate subject.
         * *   C: required. The two-character country or region code in the [ISO 3166-1](https://www.iso.org/obp/ui/#search/code/) standard. For example, CN indicates China.
         * *   O: required. The legal name of the enterprise, company, organization, or institution.
         * *   OU: required. The name of the department.
         * *   ST: optional. The name of the province, municipality, autonomous region, or special administrative region.
         * *   L: optional. The name of the city.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * The subject alternative names.
         * <p>
         * 
         * A domain name list is supported. A maximum of 10 domain names are supported.
         */
        public Builder subjectAlternativeNames(java.util.Map < String, ? > subjectAlternativeNames) {
            String subjectAlternativeNamesShrink = shrink(subjectAlternativeNames, "SubjectAlternativeNames", "json");
            this.putQueryParameter("SubjectAlternativeNames", subjectAlternativeNamesShrink);
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        @Override
        public CreateCertificateRequest build() {
            return new CreateCertificateRequest(this);
        } 

    } 

}
