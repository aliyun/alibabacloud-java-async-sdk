// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody</p>
 */
public class GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebAuthnAuthenticatorRegistrationUrl")
    private WebAuthnAuthenticatorRegistrationUrl webAuthnAuthenticatorRegistrationUrl;

    private GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webAuthnAuthenticatorRegistrationUrl = builder.webAuthnAuthenticatorRegistrationUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webAuthnAuthenticatorRegistrationUrl
     */
    public WebAuthnAuthenticatorRegistrationUrl getWebAuthnAuthenticatorRegistrationUrl() {
        return this.webAuthnAuthenticatorRegistrationUrl;
    }

    public static final class Builder {
        private String requestId; 
        private WebAuthnAuthenticatorRegistrationUrl webAuthnAuthenticatorRegistrationUrl; 

        private Builder() {
        } 

        private Builder(GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody model) {
            this.requestId = model.requestId;
            this.webAuthnAuthenticatorRegistrationUrl = model.webAuthnAuthenticatorRegistrationUrl;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebAuthnAuthenticatorRegistrationUrl.
         */
        public Builder webAuthnAuthenticatorRegistrationUrl(WebAuthnAuthenticatorRegistrationUrl webAuthnAuthenticatorRegistrationUrl) {
            this.webAuthnAuthenticatorRegistrationUrl = webAuthnAuthenticatorRegistrationUrl;
            return this;
        }

        public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody build() {
            return new GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody</p>
     */
    public static class WebAuthnAuthenticatorRegistrationUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegistrationUrl")
        private String registrationUrl;

        @com.aliyun.core.annotation.NameInMap("RegistrationUrlParameters")
        private String registrationUrlParameters;

        private WebAuthnAuthenticatorRegistrationUrl(Builder builder) {
            this.registrationUrl = builder.registrationUrl;
            this.registrationUrlParameters = builder.registrationUrlParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebAuthnAuthenticatorRegistrationUrl create() {
            return builder().build();
        }

        /**
         * @return registrationUrl
         */
        public String getRegistrationUrl() {
            return this.registrationUrl;
        }

        /**
         * @return registrationUrlParameters
         */
        public String getRegistrationUrlParameters() {
            return this.registrationUrlParameters;
        }

        public static final class Builder {
            private String registrationUrl; 
            private String registrationUrlParameters; 

            private Builder() {
            } 

            private Builder(WebAuthnAuthenticatorRegistrationUrl model) {
                this.registrationUrl = model.registrationUrl;
                this.registrationUrlParameters = model.registrationUrlParameters;
            } 

            /**
             * <p>注册WebAuthn认证器URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://012cnaliyunidaas..com./login/webauthn/registration">https://012cnaliyunidaas..com./login/webauthn/registration</a></p>
             */
            public Builder registrationUrl(String registrationUrl) {
                this.registrationUrl = registrationUrl;
                return this;
            }

            /**
             * <p>注册WebAuthn认证器URL参数</p>
             * 
             * <strong>example:</strong>
             * <p>eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIiwia2lkIjoia2V5X29ueWNzbXNib3Y1bmV2anlncHgyZnlsbjdhIn0</p>
             */
            public Builder registrationUrlParameters(String registrationUrlParameters) {
                this.registrationUrlParameters = registrationUrlParameters;
                return this;
            }

            public WebAuthnAuthenticatorRegistrationUrl build() {
                return new WebAuthnAuthenticatorRegistrationUrl(this);
            } 

        } 

    }
}
