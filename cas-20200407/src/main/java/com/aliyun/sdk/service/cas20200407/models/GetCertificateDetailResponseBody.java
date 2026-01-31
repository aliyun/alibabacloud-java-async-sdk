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
 * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateDetailResponseBody</p>
 */
public class GetCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CertificateChainList")
    private java.util.List<CertificateChainList> certificateChainList;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private Integer certificateId;

    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.NameInMap("CertificateSource")
    private String certificateSource;

    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private String certificateStatus;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("ExistPrivateKey")
    private Boolean existPrivateKey;

    @com.aliyun.core.annotation.NameInMap("FingerPrint")
    private String fingerPrint;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("KeySize")
    private Integer keySize;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private Long notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private Long notBefore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Serial")
    private String serial;

    @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
    private java.util.List<String> subjectAlternativeNames;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UsingProductList")
    private java.util.List<String> usingProductList;

    private GetCertificateDetailResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.certificateChainList = builder.certificateChainList;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificateSource = builder.certificateSource;
        this.certificateStatus = builder.certificateStatus;
        this.commonName = builder.commonName;
        this.domain = builder.domain;
        this.existPrivateKey = builder.existPrivateKey;
        this.fingerPrint = builder.fingerPrint;
        this.instanceId = builder.instanceId;
        this.issuer = builder.issuer;
        this.keySize = builder.keySize;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.requestId = builder.requestId;
        this.serial = builder.serial;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
        this.tags = builder.tags;
        this.usingProductList = builder.usingProductList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return certificateChainList
     */
    public java.util.List<CertificateChainList> getCertificateChainList() {
        return this.certificateChainList;
    }

    /**
     * @return certificateId
     */
    public Integer getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificateSource
     */
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * @return certificateStatus
     */
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return existPrivateKey
     */
    public Boolean getExistPrivateKey() {
        return this.existPrivateKey;
    }

    /**
     * @return fingerPrint
     */
    public String getFingerPrint() {
        return this.fingerPrint;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return keySize
     */
    public Integer getKeySize() {
        return this.keySize;
    }

    /**
     * @return notAfter
     */
    public Long getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public Long getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serial
     */
    public String getSerial() {
        return this.serial;
    }

    /**
     * @return subjectAlternativeNames
     */
    public java.util.List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return usingProductList
     */
    public java.util.List<String> getUsingProductList() {
        return this.usingProductList;
    }

    public static final class Builder {
        private String algorithm; 
        private String certIdentifier; 
        private java.util.List<CertificateChainList> certificateChainList; 
        private Integer certificateId; 
        private String certificateName; 
        private String certificateSource; 
        private String certificateStatus; 
        private String commonName; 
        private String domain; 
        private Boolean existPrivateKey; 
        private String fingerPrint; 
        private String instanceId; 
        private String issuer; 
        private Integer keySize; 
        private Long notAfter; 
        private Long notBefore; 
        private String requestId; 
        private String serial; 
        private java.util.List<String> subjectAlternativeNames; 
        private java.util.List<Tags> tags; 
        private java.util.List<String> usingProductList; 

        private Builder() {
        } 

        private Builder(GetCertificateDetailResponseBody model) {
            this.algorithm = model.algorithm;
            this.certIdentifier = model.certIdentifier;
            this.certificateChainList = model.certificateChainList;
            this.certificateId = model.certificateId;
            this.certificateName = model.certificateName;
            this.certificateSource = model.certificateSource;
            this.certificateStatus = model.certificateStatus;
            this.commonName = model.commonName;
            this.domain = model.domain;
            this.existPrivateKey = model.existPrivateKey;
            this.fingerPrint = model.fingerPrint;
            this.instanceId = model.instanceId;
            this.issuer = model.issuer;
            this.keySize = model.keySize;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.requestId = model.requestId;
            this.serial = model.serial;
            this.subjectAlternativeNames = model.subjectAlternativeNames;
            this.tags = model.tags;
            this.usingProductList = model.usingProductList;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * CertificateChainList.
         */
        public Builder certificateChainList(java.util.List<CertificateChainList> certificateChainList) {
            this.certificateChainList = certificateChainList;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(Integer certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * CertificateName.
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * CertificateSource.
         */
        public Builder certificateSource(String certificateSource) {
            this.certificateSource = certificateSource;
            return this;
        }

        /**
         * CertificateStatus.
         */
        public Builder certificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
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
         * ExistPrivateKey.
         */
        public Builder existPrivateKey(Boolean existPrivateKey) {
            this.existPrivateKey = existPrivateKey;
            return this;
        }

        /**
         * FingerPrint.
         */
        public Builder fingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * KeySize.
         */
        public Builder keySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(Long notBefore) {
            this.notBefore = notBefore;
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
         * Serial.
         */
        public Builder serial(String serial) {
            this.serial = serial;
            return this;
        }

        /**
         * SubjectAlternativeNames.
         */
        public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UsingProductList.
         */
        public Builder usingProductList(java.util.List<String> usingProductList) {
            this.usingProductList = usingProductList;
            return this;
        }

        public GetCertificateDetailResponseBody build() {
            return new GetCertificateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateDetailResponseBody</p>
     */
    public static class CertificateChainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("RemainDay")
        private Integer remainDay;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private CertificateChainList(Builder builder) {
            this.issuer = builder.issuer;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.remainDay = builder.remainDay;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateChainList create() {
            return builder().build();
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return notAfter
         */
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return remainDay
         */
        public Integer getRemainDay() {
            return this.remainDay;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String issuer; 
            private Long notAfter; 
            private Long notBefore; 
            private Integer remainDay; 
            private String subject; 

            private Builder() {
            } 

            private Builder(CertificateChainList model) {
                this.issuer = model.issuer;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.remainDay = model.remainDay;
                this.subject = model.subject;
            } 

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * NotAfter.
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * NotBefore.
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * RemainDay.
             */
            public Builder remainDay(Integer remainDay) {
                this.remainDay = remainDay;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public CertificateChainList build() {
                return new CertificateChainList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCertificateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateDetailResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
