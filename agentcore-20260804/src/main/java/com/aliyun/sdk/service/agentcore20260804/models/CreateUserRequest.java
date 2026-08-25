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
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateUserRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
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
    public CreateUserRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String workspaceId; 
        private CreateUserRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
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
        public Builder body(CreateUserRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserRequest} extends {@link TeaModel}
     *
     * <p>CreateUserRequest</p>
     */
    public static class CreateUserRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        private CreateUserRequestBody(Builder builder) {
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.name = builder.name;
            this.note = builder.note;
            this.password = builder.password;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateUserRequestBody create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String displayName; 
            private String email; 
            private String name; 
            private String note; 
            private String password; 

            private Builder() {
            } 

            private Builder(CreateUserRequestBody model) {
                this.displayName = model.displayName;
                this.email = model.email;
                this.name = model.name;
                this.note = model.note;
                this.password = model.password;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public CreateUserRequestBody build() {
                return new CreateUserRequestBody(this);
            } 

        } 

    }
}
