// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRequest</p>
 */
public class SetDomainRequest extends Request {
    @Query
    @NameInMap("BindStageName")
    private String bindStageName;

    @Query
    @NameInMap("CertificateBody")
    private String certificateBody;

    @Query
    @NameInMap("CertificateName")
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
    @NameInMap("IsForce")
    private Boolean isForce;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetDomainRequest(Builder builder) {
        super(builder);
        this.bindStageName = builder.bindStageName;
        this.certificateBody = builder.certificateBody;
        this.certificateName = builder.certificateName;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.isForce = builder.isForce;
        this.privateKey = builder.privateKey;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindStageName
     */
    public String getBindStageName() {
        return this.bindStageName;
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
     * @return isForce
     */
    public Boolean getIsForce() {
        return this.isForce;
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

    public static final class Builder extends Request.Builder<SetDomainRequest, Builder> {
        private String bindStageName; 
        private String certificateBody; 
        private String certificateName; 
        private String domainName; 
        private String groupId; 
        private Boolean isForce; 
        private String privateKey; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRequest request) {
            super(request);
            this.bindStageName = request.bindStageName;
            this.certificateBody = request.certificateBody;
            this.certificateName = request.certificateName;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.isForce = request.isForce;
            this.privateKey = request.privateKey;
            this.securityToken = request.securityToken;
        } 

        /**
         * BindStageName.
         */
        public Builder bindStageName(String bindStageName) {
            this.putQueryParameter("BindStageName", bindStageName);
            this.bindStageName = bindStageName;
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
         * IsForce.
         */
        public Builder isForce(Boolean isForce) {
            this.putQueryParameter("IsForce", isForce);
            this.isForce = isForce;
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
        public SetDomainRequest build() {
            return new SetDomainRequest(this);
        } 

    } 

}
