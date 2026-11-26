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
 * {@link AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest</p>
 */
public class AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest, Builder> {
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest request) {
            super(request);
            this.sessionId = request.sessionId;
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
        public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest build() {
            return new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest(this);
        } 

    } 

}
