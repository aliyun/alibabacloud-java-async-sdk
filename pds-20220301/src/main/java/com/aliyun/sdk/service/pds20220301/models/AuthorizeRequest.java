// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeRequest</p>
 */
public class AuthorizeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("client_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hide_consent")
    private Boolean hideConsent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("login_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("redirect_uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String redirectUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("response_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String responseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    private java.util.List < String > scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private AuthorizeRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.clientId = builder.clientId;
        this.hideConsent = builder.hideConsent;
        this.loginType = builder.loginType;
        this.redirectUri = builder.redirectUri;
        this.responseType = builder.responseType;
        this.scope = builder.scope;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return hideConsent
     */
    public Boolean getHideConsent() {
        return this.hideConsent;
    }

    /**
     * @return loginType
     */
    public String getLoginType() {
        return this.loginType;
    }

    /**
     * @return redirectUri
     */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * @return responseType
     */
    public String getResponseType() {
        return this.responseType;
    }

    /**
     * @return scope
     */
    public java.util.List < String > getScope() {
        return this.scope;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<AuthorizeRequest, Builder> {
        private String domainId; 
        private String clientId; 
        private Boolean hideConsent; 
        private String loginType; 
        private String redirectUri; 
        private String responseType; 
        private java.util.List < String > scope; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.clientId = request.clientId;
            this.hideConsent = request.hideConsent;
            this.loginType = request.loginType;
            this.redirectUri = request.redirectUri;
            this.responseType = request.responseType;
            this.scope = request.scope;
            this.state = request.state;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The application ID returned when the application was created.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("client_id", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * Specifies whether to hide the consent page.
         */
        public Builder hideConsent(Boolean hideConsent) {
            this.putQueryParameter("hide_consent", hideConsent);
            this.hideConsent = hideConsent;
            return this;
        }

        /**
         * The authentication method. Valid values:
         * <p>
         * 
         * *   default: all logon methods that are integrated on the default logon page provided by Drive and Photo Service.
         * *   ding: logs on by scanning a DingTalk QR code.
         * *   ding_sns: logs on by entering a DingTalk account and its password.
         * *   ram: logs on as an Alibaba Cloud Resource Access Management (RAM) user.
         * *   wechat: logs on by scanning a WeCom QR code.
         * *   wechat_app: logs on without authentication in WeCom.
         */
        public Builder loginType(String loginType) {
            this.putQueryParameter("login_type", loginType);
            this.loginType = loginType;
            return this;
        }

        /**
         * The callback URL specified when the application was created.
         */
        public Builder redirectUri(String redirectUri) {
            this.putQueryParameter("redirect_uri", redirectUri);
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * The format in which to return the response. Set the value to code.
         */
        public Builder responseType(String responseType) {
            this.putQueryParameter("response_type", responseType);
            this.responseType = responseType;
            return this;
        }

        /**
         * The requested permissions. By default, all permissions are requested.
         */
        public Builder scope(java.util.List < String > scope) {
            String scopeShrink = shrink(scope, "scope", "simple");
            this.putQueryParameter("scope", scopeShrink);
            this.scope = scope;
            return this;
        }

        /**
         * The user-defined parameter to return in the callback URL after the requested permissions are granted.
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public AuthorizeRequest build() {
            return new AuthorizeRequest(this);
        } 

    } 

}
