// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDomainServerCertificateRequest</p>
 */
public class SetDomainServerCertificateRequest extends Request {
    @Query
    @NameInMap("CertName")
    private String certName;

    @Query
    @NameInMap("CertType")
    private String certType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("ForceSet")
    private String forceSet;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ServerCertificate")
    private String serverCertificate;

    @Query
    @NameInMap("ServerCertificateStatus")
    @Validation(required = true)
    private String serverCertificateStatus;

    private SetDomainServerCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.forceSet = builder.forceSet;
        this.ownerId = builder.ownerId;
        this.privateKey = builder.privateKey;
        this.securityToken = builder.securityToken;
        this.serverCertificate = builder.serverCertificate;
        this.serverCertificateStatus = builder.serverCertificateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainServerCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return forceSet
     */
    public String getForceSet() {
        return this.forceSet;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    /**
     * @return serverCertificateStatus
     */
    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

    public static final class Builder extends Request.Builder<SetDomainServerCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domainName; 
        private String forceSet; 
        private Long ownerId; 
        private String privateKey; 
        private String securityToken; 
        private String serverCertificate; 
        private String serverCertificateStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainServerCertificateRequest response) {
            super(response);
            this.certName = response.certName;
            this.certType = response.certType;
            this.domainName = response.domainName;
            this.forceSet = response.forceSet;
            this.ownerId = response.ownerId;
            this.privateKey = response.privateKey;
            this.securityToken = response.securityToken;
            this.serverCertificate = response.serverCertificate;
            this.serverCertificateStatus = response.serverCertificateStatus;
        } 

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ForceSet.
         */
        public Builder forceSet(String forceSet) {
            this.putQueryParameter("ForceSet", forceSet);
            this.forceSet = forceSet;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ServerCertificate.
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * ServerCertificateStatus.
         */
        public Builder serverCertificateStatus(String serverCertificateStatus) {
            this.putQueryParameter("ServerCertificateStatus", serverCertificateStatus);
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }

        @Override
        public SetDomainServerCertificateRequest build() {
            return new SetDomainServerCertificateRequest(this);
        } 

    } 

}
