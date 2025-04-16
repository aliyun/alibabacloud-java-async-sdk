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
 * {@link ReleaseMcpSessionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseMcpSessionRequest</p>
 */
public class ReleaseMcpSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Authorization")
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private ReleaseMcpSessionRequest(Builder builder) {
        super(builder);
        this.authorization = builder.authorization;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseMcpSessionRequest create() {
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ReleaseMcpSessionRequest, Builder> {
        private String authorization; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseMcpSessionRequest request) {
            super(request);
            this.authorization = request.authorization;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ReleaseMcpSessionRequest build() {
            return new ReleaseMcpSessionRequest(this);
        } 

    } 

}
