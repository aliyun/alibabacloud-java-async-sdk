// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
    @NameInMap("CaCertificateBody")
    private String caCertificateBody;

    @Query
    @NameInMap("CertificateBody")
    private String certificateBody;

    @Query
    @NameInMap("CertificateName")
    @Validation(required = true)
    private String certificateName;

    @Query
    @NameInMap("CertificatePrivateKey")
    private String certificatePrivateKey;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetDomainCertificateRequest(Builder builder) {
        super(builder);
        this.caCertificateBody = builder.caCertificateBody;
        this.certificateBody = builder.certificateBody;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
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
     * @return caCertificateBody
     */
    public String getCaCertificateBody() {
        return this.caCertificateBody;
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
     * @return certificatePrivateKey
     */
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetDomainCertificateRequest, Builder> {
        private String caCertificateBody; 
        private String certificateBody; 
        private String certificateName; 
        private String certificatePrivateKey; 
        private String domainName; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainCertificateRequest response) {
            super(response);
            this.caCertificateBody = response.caCertificateBody;
            this.certificateBody = response.certificateBody;
            this.certificateName = response.certificateName;
            this.certificatePrivateKey = response.certificatePrivateKey;
            this.domainName = response.domainName;
            this.groupId = response.groupId;
            this.securityToken = response.securityToken;
        } 

        /**
         * CaCertificateBody.
         */
        public Builder caCertificateBody(String caCertificateBody) {
            this.putQueryParameter("CaCertificateBody", caCertificateBody);
            this.caCertificateBody = caCertificateBody;
            return this;
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
         * CertificatePrivateKey.
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.putQueryParameter("CertificatePrivateKey", certificatePrivateKey);
            this.certificatePrivateKey = certificatePrivateKey;
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
