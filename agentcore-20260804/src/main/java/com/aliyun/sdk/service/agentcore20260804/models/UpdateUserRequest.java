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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentCoreUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentCoreUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateUserRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentCoreUserId = builder.agentCoreUserId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
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
     * @return agentCoreUserId
     */
    public String getAgentCoreUserId() {
        return this.agentCoreUserId;
    }

    /**
     * @return body
     */
    public UpdateUserRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String workspaceId; 
        private String agentCoreUserId; 
        private UpdateUserRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentCoreUserId = request.agentCoreUserId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        public Builder agentCoreUserId(String agentCoreUserId) {
            this.putPathParameter("agentCoreUserId", agentCoreUserId);
            this.agentCoreUserId = agentCoreUserId;
            return this;
        }

        /**
         * <p>The request body for updating a user.</p>
         */
        public Builder body(UpdateUserRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Not supported</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserRequest</p>
     */
    public static class UpdateUserRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        private UpdateUserRequestBody(Builder builder) {
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateUserRequestBody create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String displayName; 
            private String email; 
            private String note; 

            private Builder() {
            } 

            private Builder(UpdateUserRequestBody model) {
                this.displayName = model.displayName;
                this.email = model.email;
                this.note = model.note;
            } 

            /**
             * <p>The display name of the user. The name must be 1 to 32 characters in length. At least one of displayName, email, and note must be specified.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the user. The address can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The note for the user. The note can be up to 1,024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent operations team member</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public UpdateUserRequestBody build() {
                return new UpdateUserRequestBody(this);
            } 

        } 

    }
}
