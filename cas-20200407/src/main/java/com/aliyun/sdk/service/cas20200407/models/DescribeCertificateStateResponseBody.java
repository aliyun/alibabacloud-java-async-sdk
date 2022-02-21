// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertificateStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertificateStateResponseBody</p>
 */
public class DescribeCertificateStateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("Content")
    private String content;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RecordDomain")
    private String recordDomain;

    @NameInMap("RecordType")
    private String recordType;

    @NameInMap("RecordValue")
    private String recordValue;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
    private String type;

    @NameInMap("Uri")
    private String uri;

    @NameInMap("ValidateType")
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
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * RecordDomain.
         */
        public Builder recordDomain(String recordDomain) {
            this.recordDomain = recordDomain;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * RecordValue.
         */
        public Builder recordValue(String recordValue) {
            this.recordValue = recordValue;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * ValidateType.
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
