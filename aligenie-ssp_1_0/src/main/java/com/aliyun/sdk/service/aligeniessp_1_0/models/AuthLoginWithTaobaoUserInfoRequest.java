// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link AuthLoginWithTaobaoUserInfoRequest} extends {@link RequestModel}
 *
 * <p>AuthLoginWithTaobaoUserInfoRequest</p>
 */
public class AuthLoginWithTaobaoUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptedTaobaoUserIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptedTaobaoUserIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private AuthLoginWithTaobaoUserInfoRequest(Builder builder) {
        super(builder);
        this.encryptedTaobaoUserIdentifier = builder.encryptedTaobaoUserIdentifier;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithTaobaoUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedTaobaoUserIdentifier
     */
    public String getEncryptedTaobaoUserIdentifier() {
        return this.encryptedTaobaoUserIdentifier;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<AuthLoginWithTaobaoUserInfoRequest, Builder> {
        private String encryptedTaobaoUserIdentifier; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthLoginWithTaobaoUserInfoRequest request) {
            super(request);
            this.encryptedTaobaoUserIdentifier = request.encryptedTaobaoUserIdentifier;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Encrypted Taobao User Identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KsVgypxAipf+xNECMZV2ONMcheqiIoEGFvgx+T8s1oV6/euTK9+ImYvLVPsSqFDh</p>
         */
        public Builder encryptedTaobaoUserIdentifier(String encryptedTaobaoUserIdentifier) {
            this.putBodyParameter("EncryptedTaobaoUserIdentifier", encryptedTaobaoUserIdentifier);
            this.encryptedTaobaoUserIdentifier = encryptedTaobaoUserIdentifier;
            return this;
        }

        /**
         * <p>Session ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public AuthLoginWithTaobaoUserInfoRequest build() {
            return new AuthLoginWithTaobaoUserInfoRequest(this);
        } 

    } 

}
