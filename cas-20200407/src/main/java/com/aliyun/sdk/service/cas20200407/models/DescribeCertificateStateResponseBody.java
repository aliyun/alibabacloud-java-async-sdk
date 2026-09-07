// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link DescribeCertificateStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateStateResponseBody</p>
 */
public class DescribeCertificateStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.NameInMap("RecordDomain")
    private String recordDomain;

    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    @com.aliyun.core.annotation.NameInMap("RecordValue")
    private String recordValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    @com.aliyun.core.annotation.NameInMap("ValidateType")
    private String validateType;

    private DescribeCertificateStateResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.certificate = builder.certificate;
        this.content = builder.content;
        this.domain = builder.domain;
        this.privateKey = builder.privateKey;
        this.recordDomain = builder.recordDomain;
        this.recordType = builder.recordType;
        this.recordValue = builder.recordValue;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.uri = builder.uri;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertificateStateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return recordDomain
     */
    public String getRecordDomain() {
        return this.recordDomain;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return recordValue
     */
    public String getRecordValue() {
        return this.recordValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return validateType
     */
    public String getValidateType() {
        return this.validateType;
    }

    public static final class Builder {
        private String certId; 
        private String certificate; 
        private String content; 
        private String domain; 
        private String privateKey; 
        private String recordDomain; 
        private String recordType; 
        private String recordValue; 
        private String requestId; 
        private String type; 
        private String uri; 
        private String validateType; 

        private Builder() {
        } 

        private Builder(DescribeCertificateStateResponseBody model) {
            this.certId = model.certId;
            this.certificate = model.certificate;
            this.content = model.content;
            this.domain = model.domain;
            this.privateKey = model.privateKey;
            this.recordDomain = model.recordDomain;
            this.recordType = model.recordType;
            this.recordValue = model.recordValue;
            this.requestId = model.requestId;
            this.type = model.type;
            this.uri = model.uri;
            this.validateType = model.validateType;
        } 

        /**
         * <p>The certificate ID.</p>
         * <blockquote>
         * <p>This parameter is returned when the certificate is issued.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The certificate content (in PEM format). For more information about the PEM format and how to convert the format of a certificate, see <a href="https://help.aliyun.com/document_detail/42214.html">What are the formats of mainstream digital certificates?</a>.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>certificate</strong> (indicating that the certificate has been issued).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- …… -----END CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The content that you need to write to the newly created file when you use the file validation method for domain validation.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/.well-known/pki-validation/fileauth.txt">http://example.com/.well-known/pki-validation/fileauth.txt</a></p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The domain name to be validated when you use the file validation method for domain validation. You need to connect to the server corresponding to this domain name and create the specified file (i.e., <strong>Uri</strong>) on the server.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The content of the certificate private key (in PEM format). For more information about the PEM format and how to convert the format of a certificate, see <a href="https://help.aliyun.com/document_detail/42214.html">What are the formats of mainstream digital certificates?</a>.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>certificate</strong> (indicating that the certificate has been issued).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----…… -----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The host record that you need to operate when you use the DNS validation method for domain validation.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>_dnsauth</p>
         */
        public Builder recordDomain(String recordDomain) {
            this.recordDomain = recordDomain;
            return this;
        }

        /**
         * <p>The type of DNS record that you need to add when you use the DNS validation method for domain validation. Valid values:</p>
         * <ul>
         * <li><p><strong>TXT</strong>: text record.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: alias record.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TXT</p>
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * <p>The record value that you need to add when you use the DNS validation method for domain validation.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20200420000000223erigacv46uhaubchcm0o7spxi7i2isvjq59mlx9lucnkqcy</p>
         */
        public Builder recordValue(String recordValue) {
            this.recordValue = recordValue;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the certificate request order. Valid values:</p>
         * <ul>
         * <li><p><strong>domain_verify</strong>: <strong>Pending validation</strong>, which indicates that you have not completed domain validation after submitting the certificate request.</p>
         * <blockquote>
         * <p>After you submit a certificate request, you must manually complete domain ownership validation before the certificate request can enter the review stage. If you have not completed domain validation, you can refer to the response parameters of this operation to complete domain validation.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>process</strong>: <strong>Under review</strong>, which indicates that the certificate request is being reviewed by the CA center.</p>
         * </li>
         * <li><p><strong>verify_fail</strong>: <strong>Review failed</strong>, which indicates that the certificate request failed the review.</p>
         * <blockquote>
         * <p>The review may fail because the certificate request information you submitted is incorrect. We recommend that you call <a href="https://help.aliyun.com/document_detail/455294.html">DeleteCertificateRequest</a> to delete the order that failed the review (deleted orders do not consume certificate resource plan quota) and submit a new certificate request.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>certificate</strong>: <strong>Issued</strong>, which indicates that the certificate has been issued.</p>
         * </li>
         * <li><p><strong>payed</strong>: <strong>Pending request</strong>, which indicates that the certificate is pending request.</p>
         * </li>
         * <li><p><strong>unknow</strong>: <strong>Unknown status</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain_verify</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The file that you need to create on the domain server when you use the file validation method for domain validation. <strong>Uri</strong> includes the file path and name.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/.well-known/pki-validation/fileauth.txt</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>The domain validation method selected when submitting the certificate request. Valid values:</p>
         * <ul>
         * <li><p><strong>DNS</strong>: DNS validation. This method validates domain ownership by adding the specified DNS record to the domain on the DNS management platform.</p>
         * </li>
         * <li><p><strong>FILE</strong>: file validation. This method validates domain ownership by creating the specified file on the domain server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        public Builder validateType(String validateType) {
            this.validateType = validateType;
            return this;
        }

        public DescribeCertificateStateResponseBody build() {
            return new DescribeCertificateStateResponseBody(this);
        } 

    } 

}
