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
 * {@link AuthLoginWithAligenieUserInfoRequest} extends {@link RequestModel}
 *
 * <p>AuthLoginWithAligenieUserInfoRequest</p>
 */
public class AuthLoginWithAligenieUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptedAligenieUserIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptedAligenieUserIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private AuthLoginWithAligenieUserInfoRequest(Builder builder) {
        super(builder);
        this.encryptedAligenieUserIdentifier = builder.encryptedAligenieUserIdentifier;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithAligenieUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedAligenieUserIdentifier
     */
    public String getEncryptedAligenieUserIdentifier() {
        return this.encryptedAligenieUserIdentifier;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<AuthLoginWithAligenieUserInfoRequest, Builder> {
        private String encryptedAligenieUserIdentifier; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthLoginWithAligenieUserInfoRequest request) {
            super(request);
            this.encryptedAligenieUserIdentifier = request.encryptedAligenieUserIdentifier;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Encrypted Aligenie User Identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UYugfm/3Nb9q24AyES2rYmC5tIglSoDX3Mbna/vrldcjGPtC8VzFwo+CU5c4CHLjrK7ekskG2WVaevM5Zi9f0w==</p>
         */
        public Builder encryptedAligenieUserIdentifier(String encryptedAligenieUserIdentifier) {
            this.putBodyParameter("EncryptedAligenieUserIdentifier", encryptedAligenieUserIdentifier);
            this.encryptedAligenieUserIdentifier = encryptedAligenieUserIdentifier;
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
        public AuthLoginWithAligenieUserInfoRequest build() {
            return new AuthLoginWithAligenieUserInfoRequest(this);
        } 

    } 

}
