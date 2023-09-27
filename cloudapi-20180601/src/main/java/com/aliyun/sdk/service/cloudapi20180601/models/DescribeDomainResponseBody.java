// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

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

    @NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainNameResolution")
    private String domainNameResolution;

    @NameInMap("DomainRemark")
    private String domainRemark;

    @NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubDomain")
    private String subDomain;

    private DescribeDomainResponseBody(Builder builder) {
        this.certificateBody = builder.certificateBody;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.domainBindingStatus = builder.domainBindingStatus;
        this.domainLegalStatus = builder.domainLegalStatus;
        this.domainName = builder.domainName;
        this.domainNameResolution = builder.domainNameResolution;
        this.domainRemark = builder.domainRemark;
        this.domainWebSocketStatus = builder.domainWebSocketStatus;
        this.groupId = builder.groupId;
        this.privateKey = builder.privateKey;
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
     * @return domainBindingStatus
     */
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
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
     * @return domainNameResolution
     */
    public String getDomainNameResolution() {
        return this.domainNameResolution;
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
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
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
        private String domainBindingStatus; 
        private String domainLegalStatus; 
        private String domainName; 
        private String domainNameResolution; 
        private String domainRemark; 
        private String domainWebSocketStatus; 
        private String groupId; 
        private String privateKey; 
        private String requestId; 
        private String subDomain; 

        /**
         * CertificateBody.
         */
        public Builder certificateBody(String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
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
         * DomainBindingStatus.
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * DomainLegalStatus.
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainNameResolution.
         */
        public Builder domainNameResolution(String domainNameResolution) {
            this.domainNameResolution = domainNameResolution;
            return this;
        }

        /**
         * DomainRemark.
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * DomainWebSocketStatus.
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubDomain.
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
