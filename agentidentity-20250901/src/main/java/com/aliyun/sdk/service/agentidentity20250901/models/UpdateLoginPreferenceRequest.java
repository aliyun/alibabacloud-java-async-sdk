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
 * {@link UpdateLoginPreferenceRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoginPreferenceRequest</p>
 */
public class UpdateLoginPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginPreference")
    private LoginPreference loginPreference;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private UpdateLoginPreferenceRequest(Builder builder) {
        super(builder);
        this.loginPreference = builder.loginPreference;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoginPreferenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginPreference
     */
    public LoginPreference getLoginPreference() {
        return this.loginPreference;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<UpdateLoginPreferenceRequest, Builder> {
        private LoginPreference loginPreference; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoginPreferenceRequest request) {
            super(request);
            this.loginPreference = request.loginPreference;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * LoginPreference.
         */
        public Builder loginPreference(LoginPreference loginPreference) {
            String loginPreferenceShrink = shrink(loginPreference, "LoginPreference", "json");
            this.putQueryParameter("LoginPreference", loginPreferenceShrink);
            this.loginPreference = loginPreference;
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
        public UpdateLoginPreferenceRequest build() {
            return new UpdateLoginPreferenceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoginPreferenceRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoginPreferenceRequest</p>
     */
    public static class LoginPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnablePasswordLogin")
        private Boolean enablePasswordLogin;

        private LoginPreference(Builder builder) {
            this.enablePasswordLogin = builder.enablePasswordLogin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginPreference create() {
            return builder().build();
        }

        /**
         * @return enablePasswordLogin
         */
        public Boolean getEnablePasswordLogin() {
            return this.enablePasswordLogin;
        }

        public static final class Builder {
            private Boolean enablePasswordLogin; 

            private Builder() {
            } 

            private Builder(LoginPreference model) {
                this.enablePasswordLogin = model.enablePasswordLogin;
            } 

            /**
             * EnablePasswordLogin.
             */
            public Builder enablePasswordLogin(Boolean enablePasswordLogin) {
                this.enablePasswordLogin = enablePasswordLogin;
                return this;
            }

            public LoginPreference build() {
                return new LoginPreference(this);
            } 

        } 

    }
}
