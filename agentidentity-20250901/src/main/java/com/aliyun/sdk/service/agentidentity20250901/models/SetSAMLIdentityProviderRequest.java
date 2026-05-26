// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link SetSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>SetSAMLIdentityProviderRequest</p>
 */
public class SetSAMLIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JITProvisionStatus")
    private String JITProvisionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JITUpdateStatus")
    private String JITUpdateStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginURL")
    private String loginURL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SAMLBindingType")
    private String SAMLBindingType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SSOStatus")
    private String SSOStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("X509Certificates")
    private java.util.List<String> x509Certificates;

    private SetSAMLIdentityProviderRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.JITProvisionStatus = builder.JITProvisionStatus;
        this.JITUpdateStatus = builder.JITUpdateStatus;
        this.loginURL = builder.loginURL;
        this.SAMLBindingType = builder.SAMLBindingType;
        this.SSOStatus = builder.SSOStatus;
        this.userPoolName = builder.userPoolName;
        this.x509Certificates = builder.x509Certificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSAMLIdentityProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return JITProvisionStatus
     */
    public String getJITProvisionStatus() {
        return this.JITProvisionStatus;
    }

    /**
     * @return JITUpdateStatus
     */
    public String getJITUpdateStatus() {
        return this.JITUpdateStatus;
    }

    /**
     * @return loginURL
     */
    public String getLoginURL() {
        return this.loginURL;
    }

    /**
     * @return SAMLBindingType
     */
    public String getSAMLBindingType() {
        return this.SAMLBindingType;
    }

    /**
     * @return SSOStatus
     */
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    /**
     * @return x509Certificates
     */
    public java.util.List<String> getX509Certificates() {
        return this.x509Certificates;
    }

    public static final class Builder extends Request.Builder<SetSAMLIdentityProviderRequest, Builder> {
        private String entityId; 
        private String JITProvisionStatus; 
        private String JITUpdateStatus; 
        private String loginURL; 
        private String SAMLBindingType; 
        private String SSOStatus; 
        private String userPoolName; 
        private java.util.List<String> x509Certificates; 

        private Builder() {
            super();
        } 

        private Builder(SetSAMLIdentityProviderRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.JITProvisionStatus = request.JITProvisionStatus;
            this.JITUpdateStatus = request.JITUpdateStatus;
            this.loginURL = request.loginURL;
            this.SAMLBindingType = request.SAMLBindingType;
            this.SSOStatus = request.SSOStatus;
            this.userPoolName = request.userPoolName;
            this.x509Certificates = request.x509Certificates;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * JITProvisionStatus.
         */
        public Builder JITProvisionStatus(String JITProvisionStatus) {
            this.putBodyParameter("JITProvisionStatus", JITProvisionStatus);
            this.JITProvisionStatus = JITProvisionStatus;
            return this;
        }

        /**
         * JITUpdateStatus.
         */
        public Builder JITUpdateStatus(String JITUpdateStatus) {
            this.putBodyParameter("JITUpdateStatus", JITUpdateStatus);
            this.JITUpdateStatus = JITUpdateStatus;
            return this;
        }

        /**
         * LoginURL.
         */
        public Builder loginURL(String loginURL) {
            this.putBodyParameter("LoginURL", loginURL);
            this.loginURL = loginURL;
            return this;
        }

        /**
         * SAMLBindingType.
         */
        public Builder SAMLBindingType(String SAMLBindingType) {
            this.putBodyParameter("SAMLBindingType", SAMLBindingType);
            this.SAMLBindingType = SAMLBindingType;
            return this;
        }

        /**
         * SSOStatus.
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putBodyParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        /**
         * X509Certificates.
         */
        public Builder x509Certificates(java.util.List<String> x509Certificates) {
            String x509CertificatesShrink = shrink(x509Certificates, "X509Certificates", "json");
            this.putBodyParameter("X509Certificates", x509CertificatesShrink);
            this.x509Certificates = x509Certificates;
            return this;
        }

        @Override
        public SetSAMLIdentityProviderRequest build() {
            return new SetSAMLIdentityProviderRequest(this);
        } 

    } 

}
