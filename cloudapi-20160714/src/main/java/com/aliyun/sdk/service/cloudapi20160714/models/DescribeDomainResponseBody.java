// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResponseBody</p>
 */
public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("CertificateBody")
    private String certificateBody;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("CertificateName")
    private String certificateName;

    @NameInMap("CertificatePrivateKey")
    private String certificatePrivateKey;

    @NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @NameInMap("DomainCNAMEStatus")
    private String domainCNAMEStatus;

    @NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainRemark")
    private String domainRemark;

    @NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubDomain")
    private String subDomain;

    private DescribeDomainResponseBody(Builder builder) {
        this.certificateBody = builder.certificateBody;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
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
         * The second-level domain name that is automatically assigned to the API group.
         */
        public Builder certificateBody(String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * The status of the domain name that uses WebSocket.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The validity status of the domain name. Valid values:
         * <p>
         * 
         * *   NORMAL
         * *   ABNORMAL: This status affects API calls and must be resolved as soon as possible.
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * The custom domain name.
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * Remarks about the domain name, such as the cause of an exception.
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * *   This operation is intended for API providers.
         */
        public Builder domainCNAMEStatus(String domainCNAMEStatus) {
            this.domainCNAMEStatus = domainCNAMEStatus;
            return this;
        }

        /**
         * The ID of the API group to which the domain name is bound. This ID is generated by the system and globally unique.
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * The binding status of the custom domain name. Valid values:
         * <p>
         * 
         * *   BINDING: The domain name has been bound.
         * *   BOUND: The domain name has not been bound.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The domain name does not have an ICP filing.
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * The content of the certificate.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the SSL certificate.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The domain name resolution status. Valid values:
         * <p>
         * 
         * *   RESOLVED: The domain name has been resolved.
         * *   UNRESOLVED: The domain name has not been resolved.
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
