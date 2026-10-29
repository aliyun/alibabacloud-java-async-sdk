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
         * <p>The API key permission settings.</p>
         */
        public Builder auth(Auth auth) {
            this.putBodyParameter("auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the created API key is automatically assigned to the default workspace.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ws-8af73c50f5596193</p>
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
    public static class ModelAccessScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessibleModels")
        private java.util.List<String> accessibleModels;

        @com.aliyun.core.annotation.NameInMap("allowAllModels")
        private Boolean allowAllModels;

        private ModelAccessScope(Builder builder) {
            this.accessibleModels = builder.accessibleModels;
            this.allowAllModels = builder.allowAllModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelAccessScope create() {
            return builder().build();
        }

        /**
         * @return accessibleModels
         */
        public java.util.List<String> getAccessibleModels() {
            return this.accessibleModels;
        }

        /**
         * @return allowAllModels
         */
        public Boolean getAllowAllModels() {
            return this.allowAllModels;
        }

        public static final class Builder {
            private java.util.List<String> accessibleModels; 
            private Boolean allowAllModels; 

            private Builder() {
            } 

            private Builder(ModelAccessScope model) {
                this.accessibleModels = model.accessibleModels;
                this.allowAllModels = model.allowAllModels;
            } 

            /**
             * <p>The list of accessible models.</p>
             * <blockquote>
             * <p>Notice: This parameter takes effect only when allowAllModels is set to false.</p>
             * </blockquote>
             */
            public Builder accessibleModels(java.util.List<String> accessibleModels) {
                this.accessibleModels = accessibleModels;
                return this;
            }

            /**
             * <p>Specifies whether to allow access to all models that have been granted inference permissions in the workspace. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowAllModels(Boolean allowAllModels) {
                this.allowAllModels = allowAllModels;
                return this;
            }

            public ModelAccessScope build() {
                return new ModelAccessScope(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("modelAccessScope")
        private ModelAccessScope modelAccessScope;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Auth(Builder builder) {
            this.accessIps = builder.accessIps;
            this.modelAccessScope = builder.modelAccessScope;
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
         * @return modelAccessScope
         */
        public ModelAccessScope getModelAccessScope() {
            return this.modelAccessScope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> accessIps; 
            private ModelAccessScope modelAccessScope; 
            private String type; 

            private Builder() {
            } 

            private Builder(Auth model) {
                this.accessIps = model.accessIps;
                this.modelAccessScope = model.modelAccessScope;
                this.type = model.type;
            } 

            /**
             * <p>The IP address whitelist.</p>
             * <blockquote>
             * <ul>
             * <li>If you select custom permissions and do not specify an IP address whitelist, the server defaults to IPv4 (0.0.0.0/0) and IPv6 (::/0), which allows all IP addresses.</li>
             * </ul>
             * </blockquote>
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * <p>The model access scope. If you configure this parameter, you can only call the selected models. If you do not configure this parameter, you can access all models that have been granted inference permissions in the specified workspace by default.</p>
             */
            public Builder modelAccessScope(ModelAccessScope modelAccessScope) {
                this.modelAccessScope = modelAccessScope;
                return this;
            }

            /**
             * <p>The permission type. Valid values: All: all permissions. Custom: custom permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
