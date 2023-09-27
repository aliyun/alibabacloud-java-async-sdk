// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDomainResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshDomainResponseBody</p>
 */
public class RefreshDomainResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("CertificateName")
    private String certificateName;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainNameResolution")
    private String domainNameResolution;

    @NameInMap("DomainStatus")
    private String domainStatus;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubDomain")
    private String subDomain;

    private RefreshDomainResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.domainName = builder.domainName;
        this.domainNameResolution = builder.domainNameResolution;
        this.domainStatus = builder.domainStatus;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshDomainResponseBody create() {
        return builder().build();
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
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
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
        private String certificateId; 
        private String certificateName; 
        private String domainName; 
        private String domainNameResolution; 
        private String domainStatus; 
        private String groupId; 
        private String requestId; 
        private String subDomain; 

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
         * DomainStatus.
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
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

        public RefreshDomainResponseBody build() {
            return new RefreshDomainResponseBody(this);
        } 

    } 

}
