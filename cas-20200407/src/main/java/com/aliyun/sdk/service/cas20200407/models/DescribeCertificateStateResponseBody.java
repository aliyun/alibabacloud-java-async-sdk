// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateStateResponseBody</p>
 */
public class DescribeCertificateStateResponseBody extends TeaModel {
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

        /**
         * The content of the certificate in the PEM format. For more information about the PEM format and how to convert certificate formats, see [What formats are used for mainstream digital certificates?](~~42214~~)
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **certificate**. The value certificate indicates that the certificate is issued.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * The content that you need to write to the newly created file when you use the file verification method.
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The domain name to be verified when you use the file verification method. You must connect to the DNS server of the domain name and create a file on the server. The file is specified by the **Uri** parameter.
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The private key of the certificate in the PEM format. For more information about the PEM format and how to convert certificate formats, see [What formats are used for mainstream digital certificates?](~~42214~~)
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **certificate**. The value certificate indicates that the certificate is issued.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The DNS record that you need to manage when you use the DNS verification method.
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value DNS indicates that the DNS verification method is used.
         */
        public Builder recordDomain(String recordDomain) {
            this.recordDomain = recordDomain;
            return this;
        }

        /**
         * The type of the DNS record that you need to add when you use the DNS verification method. Valid values:
         * <p>
         * 
         * *   **TXT**
         * *   **CNAME**
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * You need to add a TXT record to the DNS records only when you use the DNS verification method.
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value DNS indicates that the DNS verification method is used.
         */
        public Builder recordValue(String recordValue) {
            this.recordValue = recordValue;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the certificate application order. Valid values:
         * <p>
         * 
         * *   **domain_verify**: **pending review**, which indicates that you have not completed the verification of the domain name ownership after you submit the certificate application.
         * 
         *     > After you submit a certificate application, you must manually complete the verification of the domain name ownership. The CA reviews the certificate application only after the verification is complete. If you have not completed the verification of the domain name ownership, you can complete the verification based on the data returned by this operation.
         * 
         * *   **process**: **being reviewed**, which indicates that the certificate application is being reviewed by the CA.
         * 
         * *   **verify_fail**: **review failed**, which indicates that the certificate application failed to be reviewed.
         * 
         *     > If a certificate application fails to be reviewed, the information that you specified in the certificate application may be incorrect. We recommend that you call the [DeleteCertificateRequest](~~455294~~) operation to delete the certificate application order and resubmit a certificate application. After the order is deleted, the quota that is consumed for the order is released.
         * 
         * *   **certificate**: **issued**, which indicates that the certificate is issued.
         * *   **payed**: **pending application**, which indicates that you have not submitted a certificate application.
         * *   **unknow**: The status is **unknown**.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The file that you need to create on the DNS server when you use the file verification method. **The value of this parameter contains the file path and file name.**
         * <p>
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * The verification method of the domain name ownership. Valid values:
         * <p>
         * 
         * *   **DNS**: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name.
         * *   **FILE**: file verification. If you use this method, you must create a specified file on the DNS server.
         * 
         * > This parameter is returned only when the value of the **Type** parameter is **domain\_verify**. The value domain\_verify indicates that the verification of the domain name ownership is not complete.
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
