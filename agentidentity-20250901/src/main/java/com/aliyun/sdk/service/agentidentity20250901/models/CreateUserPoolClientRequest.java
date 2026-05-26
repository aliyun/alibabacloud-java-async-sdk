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
 * {@link CreateUserPoolClientRequest} extends {@link RequestModel}
 *
 * <p>CreateUserPoolClientRequest</p>
 */
public class CreateUserPoolClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
    private String accessTokenValidity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnforcePKCE")
    private Boolean enforcePKCE;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RedirectURIs")
    private java.util.List<String> redirectURIs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefreshTokenValidity")
    private String refreshTokenValidity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecretRequired")
    private Boolean secretRequired;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private CreateUserPoolClientRequest(Builder builder) {
        super(builder);
        this.accessTokenValidity = builder.accessTokenValidity;
        this.clientName = builder.clientName;
        this.enforcePKCE = builder.enforcePKCE;
        this.redirectURIs = builder.redirectURIs;
        this.refreshTokenValidity = builder.refreshTokenValidity;
        this.secretRequired = builder.secretRequired;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPoolClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokenValidity
     */
    public String getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return enforcePKCE
     */
    public Boolean getEnforcePKCE() {
        return this.enforcePKCE;
    }

    /**
     * @return redirectURIs
     */
    public java.util.List<String> getRedirectURIs() {
        return this.redirectURIs;
    }

    /**
     * @return refreshTokenValidity
     */
    public String getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * @return secretRequired
     */
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<CreateUserPoolClientRequest, Builder> {
        private String accessTokenValidity; 
        private String clientName; 
        private Boolean enforcePKCE; 
        private java.util.List<String> redirectURIs; 
        private String refreshTokenValidity; 
        private Boolean secretRequired; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserPoolClientRequest request) {
            super(request);
            this.accessTokenValidity = request.accessTokenValidity;
            this.clientName = request.clientName;
            this.enforcePKCE = request.enforcePKCE;
            this.redirectURIs = request.redirectURIs;
            this.refreshTokenValidity = request.refreshTokenValidity;
            this.secretRequired = request.secretRequired;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * AccessTokenValidity.
         */
        public Builder accessTokenValidity(String accessTokenValidity) {
            this.putBodyParameter("AccessTokenValidity", accessTokenValidity);
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * ClientName.
         */
        public Builder clientName(String clientName) {
            this.putBodyParameter("ClientName", clientName);
            this.clientName = clientName;
            return this;
        }

        /**
         * EnforcePKCE.
         */
        public Builder enforcePKCE(Boolean enforcePKCE) {
            this.putBodyParameter("EnforcePKCE", enforcePKCE);
            this.enforcePKCE = enforcePKCE;
            return this;
        }

        /**
         * RedirectURIs.
         */
        public Builder redirectURIs(java.util.List<String> redirectURIs) {
            String redirectURIsShrink = shrink(redirectURIs, "RedirectURIs", "json");
            this.putBodyParameter("RedirectURIs", redirectURIsShrink);
            this.redirectURIs = redirectURIs;
            return this;
        }

        /**
         * RefreshTokenValidity.
         */
        public Builder refreshTokenValidity(String refreshTokenValidity) {
            this.putBodyParameter("RefreshTokenValidity", refreshTokenValidity);
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * SecretRequired.
         */
        public Builder secretRequired(Boolean secretRequired) {
            this.putBodyParameter("SecretRequired", secretRequired);
            this.secretRequired = secretRequired;
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

        @Override
        public CreateUserPoolClientRequest build() {
            return new CreateUserPoolClientRequest(this);
        } 

    } 

}
