// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link CreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateApiKeyRequest</p>
 */
public class CreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auth")
    private Auth auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String workspaceId;

    private CreateApiKeyRequest(Builder builder) {
        super(builder);
        this.auth = builder.auth;
        this.description = builder.description;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auth
     */
    public Auth getAuth() {
        return this.auth;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateApiKeyRequest, Builder> {
        private Auth auth; 
        private String description; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiKeyRequest request) {
            super(request);
            this.auth = request.auth;
            this.description = request.description;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * auth.
         */
        public Builder auth(Auth auth) {
            this.putBodyParameter("auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateApiKeyRequest build() {
            return new CreateApiKeyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApiKeyRequest} extends {@link TeaModel}
     *
     * <p>CreateApiKeyRequest</p>
     */
    public static class Auth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessIps")
        private java.util.List<String> accessIps;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Auth(Builder builder) {
            this.accessIps = builder.accessIps;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auth create() {
            return builder().build();
        }

        /**
         * @return accessIps
         */
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> accessIps; 
            private String type; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.accessIps = model.accessIps;
                this.type = model.type;
            } 

            /**
             * accessIps.
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Auth build() {
                return new Auth(this);
            } 

        } 

    }
}
