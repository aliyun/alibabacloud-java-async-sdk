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
         * <p>The IdP identifier. This is the EntityID from the SAML metadata of the external IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        public Builder entityId(String entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The enabling status of Just-In-Time (JIT) user synchronization and creation. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled. If a user with the same name does not exist in the user pool during SAML logon, automatic creation is performed.</li>
         * <li>Disabled: Shutdown. If the user is not found, the logon is failed. Default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder JITProvisionStatus(String JITProvisionStatus) {
            this.putBodyParameter("JITProvisionStatus", JITProvisionStatus);
            this.JITProvisionStatus = JITProvisionStatus;
            return this;
        }

        /**
         * <p>The enabling status of updating user information through synchronization. Valid values:</p>
         * <ul>
         * <li>Enabled: The update is enabled. If a user with the same name exists during SAML logon, the user information is updated based on the attributes (DisplayName and Description) passed by the IdP.</li>
         * <li>Disabled: The update is disabled. Only the logon state is updated, and user attributes are not updated. Default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder JITUpdateStatus(String JITUpdateStatus) {
            this.putBodyParameter("JITUpdateStatus", JITUpdateStatus);
            this.JITUpdateStatus = JITUpdateStatus;
            return this;
        }

        /**
         * <p>The IdP logon URL. When a user logs on, the browser is redirected to this URL to complete SAML authentication.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso/saml">https://idp.example.com/sso/saml</a></p>
         */
        public Builder loginURL(String loginURL) {
            this.putBodyParameter("LoginURL", loginURL);
            this.loginURL = loginURL;
            return this;
        }

        /**
         * <p>The SAML protocol binding type. Valid values:</p>
         * <ul>
         * <li>HTTP-Redirect: AuthnRequest is sent by using HTTP redirect. Default value.</li>
         * <li>HTTP-POST: AuthnRequest is sent by using HTTP POST.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        public Builder SAMLBindingType(String SAMLBindingType) {
            this.putBodyParameter("SAMLBindingType", SAMLBindingType);
            this.SAMLBindingType = SAMLBindingType;
            return this;
        }

        /**
         * <p>The enabling status of single sign-on (SSO). Valid values:</p>
         * <ul>
         * <li>Enabled: SAML SSO is enabled, and users can log on through an external IdP.</li>
         * <li>Disabled: SAML SSO is disabled, and users cannot log on through the IdP. Default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putBodyParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        /**
         * <p>The list of X.509 certificates in PEM format. If you specify this parameter, all existing certificates are replaced.</p>
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
