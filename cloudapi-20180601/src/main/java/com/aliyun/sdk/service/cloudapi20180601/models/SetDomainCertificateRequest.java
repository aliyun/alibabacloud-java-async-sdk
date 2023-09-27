// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDomainCertificateRequest</p>
 */
public class SetDomainCertificateRequest extends Request {
    @Query
    @NameInMap("CertificateBody")
    private String certificateBody;

    @Query
    @NameInMap("CertificateName")
    @Validation(required = true)
    private String certificateName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetDomainCertificateRequest(Builder builder) {
        super(builder);
        this.certificateBody = builder.certificateBody;
        this.certificateName = builder.certificateName;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.privateKey = builder.privateKey;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateBody
     */
    public String getCertificateBody() {
        return this.certificateBody;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetDomainCertificateRequest, Builder> {
        private String certificateBody; 
        private String certificateName; 
        private String domainName; 
        private String groupId; 
        private String privateKey; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainCertificateRequest request) {
            super(request);
            this.certificateBody = request.certificateBody;
            this.certificateName = request.certificateName;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.privateKey = request.privateKey;
            this.securityToken = request.securityToken;
        } 

        /**
         * CertificateBody.
         */
        public Builder certificateBody(String certificateBody) {
            this.putQueryParameter("CertificateBody", certificateBody);
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * CertificateName.
         */
        public Builder certificateName(String certificateName) {
            this.putQueryParameter("CertificateName", certificateName);
            this.certificateName = certificateName;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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

        @Override
        public SetDomainCertificateRequest build() {
            return new SetDomainCertificateRequest(this);
        } 

    } 

}
