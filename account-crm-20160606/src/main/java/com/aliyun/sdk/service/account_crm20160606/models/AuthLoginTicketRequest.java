// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link AuthLoginTicketRequest} extends {@link RequestModel}
 *
 * <p>AuthLoginTicketRequest</p>
 */
public class AuthLoginTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorAuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minorAuthCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    private AuthLoginTicketRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.authCode = builder.authCode;
        this.minorAuthCode = builder.minorAuthCode;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return minorAuthCode
     */
    public String getMinorAuthCode() {
        return this.minorAuthCode;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<AuthLoginTicketRequest, Builder> {
        private String appName; 
        private String authCode; 
        private String minorAuthCode; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(AuthLoginTicketRequest request) {
            super(request);
            this.appName = request.appName;
            this.authCode = request.authCode;
            this.minorAuthCode = request.minorAuthCode;
            this.scene = request.scene;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder minorAuthCode(String minorAuthCode) {
            this.putQueryParameter("MinorAuthCode", minorAuthCode);
            this.minorAuthCode = minorAuthCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public AuthLoginTicketRequest build() {
            return new AuthLoginTicketRequest(this);
        } 

    } 

}
