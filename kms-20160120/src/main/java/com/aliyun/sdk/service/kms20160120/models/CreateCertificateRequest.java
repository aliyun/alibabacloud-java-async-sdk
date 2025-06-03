// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CreateCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateRequest</p>
 */
public class CreateCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportablePrivateKey")
    private Boolean exportablePrivateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keySpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
    private java.util.Map<String, ?> subjectAlternativeNames;

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
    public java.util.Map<String, ?> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public static final class Builder extends Request.Builder<CreateCertificateRequest, Builder> {
        private Boolean exportablePrivateKey; 
        private String keySpec; 
        private String subject; 
        private java.util.Map<String, ?> subjectAlternativeNames; 

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
         * <p>Specifies whether the private key of the certificate can be exported for use. Valid values:</p>
         * <ul>
         * <li>true: The private key of the certificate can be exported for use. This is the default value.</li>
         * <li>false: The private key of the certificate cannot be exported for use. We recommend that you set this parameter to false to protect keys with a higher security level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.putQueryParameter("ExportablePrivateKey", exportablePrivateKey);
            this.exportablePrivateKey = exportablePrivateKey;
            return this;
        }

        /**
         * <p>The type of the key. Valid values:</p>
         * <ul>
         * <li>RSA_2048</li>
         * <li>EC_P256</li>
         * <li>EC_SM2</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * <p>The certificate subject, which is the owner of the certificate.</p>
         * <p>Specify the value in the distinguished name (DN) format, as defined in <a href="https://tools.ietf.org/html/rfc2253?spm=a2c4g.11186623.2.13.265f1a1cGFCn3Q">RFC 2253</a>. A DN is a sequence of relative distinguished names (RDNs).</p>
         * <p>RDNs are key-value pairs in the format of <code>attribute1=value1,attribute2=value2</code>. Separate multiple RDNs with commas (,).</p>
         * <p>The Subject parameter consists of the following fields:</p>
         * <ul>
         * <li>CN: required. The name of the certificate subject.</li>
         * <li>C: required. The two-character country or region code in the <a href="https://www.iso.org/obp/ui/#search/code/">ISO 3166-1</a> standard. For example, CN indicates China.</li>
         * <li>O: required. The legal name of the enterprise, company, organization, or institution.</li>
         * <li>OU: required. The name of the department.</li>
         * <li>ST: optional. The name of the province, municipality, autonomous region, or special administrative region.</li>
         * <li>L: optional. The name of the city.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=userName,OU=kms,O=aliyun,C=CN</p>
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * <p>The subject alternative names.</p>
         * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test1.example.com&quot;,&quot;test2.example.com&quot;]</p>
         */
        public Builder subjectAlternativeNames(java.util.Map<String, ?> subjectAlternativeNames) {
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
