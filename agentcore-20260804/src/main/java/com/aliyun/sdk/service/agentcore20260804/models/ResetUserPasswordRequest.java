// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ResetUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetUserPasswordRequest</p>
 */
public class ResetUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ResetUserPasswordRequestBody body;

    private ResetUserPasswordRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public ResetUserPasswordRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ResetUserPasswordRequest, Builder> {
        private String workspaceId; 
        private ResetUserPasswordRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserPasswordRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(ResetUserPasswordRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ResetUserPasswordRequest build() {
            return new ResetUserPasswordRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResetUserPasswordRequest} extends {@link TeaModel}
     *
     * <p>ResetUserPasswordRequest</p>
     */
    public static class ResetUserPasswordRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentCoreUserId")
        private String agentCoreUserId;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private ResetUserPasswordRequestBody(Builder builder) {
            this.agentCoreUserId = builder.agentCoreUserId;
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResetUserPasswordRequestBody create() {
            return builder().build();
        }

        /**
         * @return agentCoreUserId
         */
        public String getAgentCoreUserId() {
            return this.agentCoreUserId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String agentCoreUserId; 
            private String password; 
            private String username; 

            private Builder() {
            } 

            private Builder(ResetUserPasswordRequestBody model) {
                this.agentCoreUserId = model.agentCoreUserId;
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * agentCoreUserId.
             */
            public Builder agentCoreUserId(String agentCoreUserId) {
                this.agentCoreUserId = agentCoreUserId;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ResetUserPasswordRequestBody build() {
                return new ResetUserPasswordRequestBody(this);
            } 

        } 

    }
}
