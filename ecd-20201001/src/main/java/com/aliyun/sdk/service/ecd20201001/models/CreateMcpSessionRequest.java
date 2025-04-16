// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link CreateMcpSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateMcpSessionRequest</p>
 */
public class CreateMcpSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private CreateMcpSessionRequest(Builder builder) {
        super(builder);
        this.authorization = builder.authorization;
        this.externalUserId = builder.externalUserId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<CreateMcpSessionRequest, Builder> {
        private String authorization; 
        private String externalUserId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcpSessionRequest request) {
            super(request);
            this.authorization = request.authorization;
            this.externalUserId = request.externalUserId;
            this.sessionId = request.sessionId;
        } 

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putBodyParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public CreateMcpSessionRequest build() {
            return new CreateMcpSessionRequest(this);
        } 

    } 

}
