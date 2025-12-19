// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link GetResourceOAuth2TokenRequest} extends {@link RequestModel}
 *
 * <p>GetResourceOAuth2TokenRequest</p>
 */
public class GetResourceOAuth2TokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomParameters")
    private java.util.Map<String, ?> customParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomState")
    private String customState;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceAuthentication")
    private Boolean forceAuthentication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OAuth2Flow")
    private String oAuth2Flow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCredentialProviderName")
    private String resourceCredentialProviderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceOAuth2ReturnURL")
    private String resourceOAuth2ReturnURL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionURI")
    private String sessionURI;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    private GetResourceOAuth2TokenRequest(Builder builder) {
        super(builder);
        this.customParameters = builder.customParameters;
        this.customState = builder.customState;
        this.forceAuthentication = builder.forceAuthentication;
        this.oAuth2Flow = builder.oAuth2Flow;
        this.resourceCredentialProviderName = builder.resourceCredentialProviderName;
        this.resourceOAuth2ReturnURL = builder.resourceOAuth2ReturnURL;
        this.scopes = builder.scopes;
        this.sessionURI = builder.sessionURI;
        this.workloadAccessToken = builder.workloadAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceOAuth2TokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customParameters
     */
    public java.util.Map<String, ?> getCustomParameters() {
        return this.customParameters;
    }

    /**
     * @return customState
     */
    public String getCustomState() {
        return this.customState;
    }

    /**
     * @return forceAuthentication
     */
    public Boolean getForceAuthentication() {
        return this.forceAuthentication;
    }

    /**
     * @return oAuth2Flow
     */
    public String getOAuth2Flow() {
        return this.oAuth2Flow;
    }

    /**
     * @return resourceCredentialProviderName
     */
    public String getResourceCredentialProviderName() {
        return this.resourceCredentialProviderName;
    }

    /**
     * @return resourceOAuth2ReturnURL
     */
    public String getResourceOAuth2ReturnURL() {
        return this.resourceOAuth2ReturnURL;
    }

    /**
     * @return scopes
     */
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    /**
     * @return sessionURI
     */
    public String getSessionURI() {
        return this.sessionURI;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public static final class Builder extends Request.Builder<GetResourceOAuth2TokenRequest, Builder> {
        private java.util.Map<String, ?> customParameters; 
        private String customState; 
        private Boolean forceAuthentication; 
        private String oAuth2Flow; 
        private String resourceCredentialProviderName; 
        private String resourceOAuth2ReturnURL; 
        private java.util.List<String> scopes; 
        private String sessionURI; 
        private String workloadAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceOAuth2TokenRequest request) {
            super(request);
            this.customParameters = request.customParameters;
            this.customState = request.customState;
            this.forceAuthentication = request.forceAuthentication;
            this.oAuth2Flow = request.oAuth2Flow;
            this.resourceCredentialProviderName = request.resourceCredentialProviderName;
            this.resourceOAuth2ReturnURL = request.resourceOAuth2ReturnURL;
            this.scopes = request.scopes;
            this.sessionURI = request.sessionURI;
            this.workloadAccessToken = request.workloadAccessToken;
        } 

        /**
         * CustomParameters.
         */
        public Builder customParameters(java.util.Map<String, ?> customParameters) {
            String customParametersShrink = shrink(customParameters, "CustomParameters", "json");
            this.putBodyParameter("CustomParameters", customParametersShrink);
            this.customParameters = customParameters;
            return this;
        }

        /**
         * CustomState.
         */
        public Builder customState(String customState) {
            this.putBodyParameter("CustomState", customState);
            this.customState = customState;
            return this;
        }

        /**
         * ForceAuthentication.
         */
        public Builder forceAuthentication(Boolean forceAuthentication) {
            this.putBodyParameter("ForceAuthentication", forceAuthentication);
            this.forceAuthentication = forceAuthentication;
            return this;
        }

        /**
         * OAuth2Flow.
         */
        public Builder oAuth2Flow(String oAuth2Flow) {
            this.putBodyParameter("OAuth2Flow", oAuth2Flow);
            this.oAuth2Flow = oAuth2Flow;
            return this;
        }

        /**
         * ResourceCredentialProviderName.
         */
        public Builder resourceCredentialProviderName(String resourceCredentialProviderName) {
            this.putBodyParameter("ResourceCredentialProviderName", resourceCredentialProviderName);
            this.resourceCredentialProviderName = resourceCredentialProviderName;
            return this;
        }

        /**
         * ResourceOAuth2ReturnURL.
         */
        public Builder resourceOAuth2ReturnURL(String resourceOAuth2ReturnURL) {
            this.putBodyParameter("ResourceOAuth2ReturnURL", resourceOAuth2ReturnURL);
            this.resourceOAuth2ReturnURL = resourceOAuth2ReturnURL;
            return this;
        }

        /**
         * Scopes.
         */
        public Builder scopes(java.util.List<String> scopes) {
            String scopesShrink = shrink(scopes, "Scopes", "json");
            this.putBodyParameter("Scopes", scopesShrink);
            this.scopes = scopes;
            return this;
        }

        /**
         * SessionURI.
         */
        public Builder sessionURI(String sessionURI) {
            this.putBodyParameter("SessionURI", sessionURI);
            this.sessionURI = sessionURI;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.putBodyParameter("WorkloadAccessToken", workloadAccessToken);
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        @Override
        public GetResourceOAuth2TokenRequest build() {
            return new GetResourceOAuth2TokenRequest(this);
        } 

    } 

}
