// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResponseBody</p>
 */
public class DescribeDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateBody")
    private String certificateBody;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.NameInMap("CertificatePrivateKey")
    private String certificatePrivateKey;

    @com.aliyun.core.annotation.NameInMap("CertificateValidEnd")
    private Long certificateValidEnd;

    @com.aliyun.core.annotation.NameInMap("CertificateValidStart")
    private Long certificateValidStart;

    @com.aliyun.core.annotation.NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @com.aliyun.core.annotation.NameInMap("DomainCNAMEStatus")
    private String domainCNAMEStatus;

    @com.aliyun.core.annotation.NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainRemark")
    private String domainRemark;

    @com.aliyun.core.annotation.NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    private DescribeDomainResponseBody(Builder builder) {
        this.certificateBody = builder.certificateBody;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.certificateValidEnd = builder.certificateValidEnd;
        this.certificateValidStart = builder.certificateValidStart;
        this.domainBindingStatus = builder.domainBindingStatus;
        this.domainCNAMEStatus = builder.domainCNAMEStatus;
        this.domainLegalStatus = builder.domainLegalStatus;
        this.domainName = builder.domainName;
        this.domainRemark = builder.domainRemark;
        this.domainWebSocketStatus = builder.domainWebSocketStatus;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateBody
     */
    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificatePrivateKey
     */
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * @return certificateValidEnd
     */
    public Long getCertificateValidEnd() {
        return this.certificateValidEnd;
    }

    /**
     * @return certificateValidStart
     */
    public Long getCertificateValidStart() {
        return this.certificateValidStart;
    }

    /**
     * @return domainBindingStatus
     */
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    /**
     * @return domainCNAMEStatus
     */
    public String getDomainCNAMEStatus() {
        return this.domainCNAMEStatus;
    }

    /**
     * @return domainLegalStatus
     */
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainRemark
     */
    public String getDomainRemark() {
        return this.domainRemark;
    }

    /**
     * @return domainWebSocketStatus
     */
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String certificateBody; 
        private String certificateId; 
        private String certificateName; 
        private String certificatePrivateKey; 
        private Long certificateValidEnd; 
        private Long certificateValidStart; 
        private String domainBindingStatus; 
        private String domainCNAMEStatus; 
        private String domainLegalStatus; 
        private String domainName; 
        private String domainRemark; 
        private String domainWebSocketStatus; 
        private String groupId; 
        private String requestId; 
        private String subDomain; 

        /**
         * The certificate content.
         */
        public Builder certificateBody(String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * The unique ID of the SSL certificate, which is automatically generated by the system.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The SSL certificate name.
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * The private key of the SSL certificate.
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * The time when the certificate expires. The value is a timestamp. Unit: milliseconds.
         */
        public Builder certificateValidEnd(Long certificateValidEnd) {
            this.certificateValidEnd = certificateValidEnd;
            return this;
        }

        /**
         * The time when the certificate takes effect. The value is a timestamp. Unit: milliseconds.
         */
        public Builder certificateValidStart(Long certificateValidStart) {
            this.certificateValidStart = certificateValidStart;
            return this;
        }

        /**
         * The binding status of the custom domain name. Valid values:
         * <p>
         * 
         * *   BINDING: The domain name is bound to the API group.
         * *   BOUND: The domain name is not bound to the API group.
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * The domain name resolution status. Valid values:
         * <p>
         * 
         * *   RESOLVED: The domain name has been resolved.
         * *   UNRESOLVED: The domain name has not been resolved.
         */
        public Builder domainCNAMEStatus(String domainCNAMEStatus) {
            this.domainCNAMEStatus = domainCNAMEStatus;
            return this;
        }

        /**
         * The validity status of the domain name. Valid values:
         * <p>
         * 
         * *   NORMAL
         * *   ABNORMAL: This status affects API calls and must be rectified as soon as possible.
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * The custom domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Remarks about the domain name, such as the cause of an exception.
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * The status of the domain name that uses WebSocket.
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * The ID of the API group. This ID is generated by the system and globally unique.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The second-level domain name that is automatically assigned to the API group.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public DescribeDomainResponseBody build() {
            return new DescribeDomainResponseBody(this);
        } 

    } 

}
