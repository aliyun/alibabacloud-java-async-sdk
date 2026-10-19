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
 * {@link UpdateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiKeyRequest</p>
 */
public class UpdateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auth")
    private Auth auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String description;

    private UpdateApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyId = builder.apiKeyId;
        this.auth = builder.auth;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
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

    public static final class Builder extends Request.Builder<UpdateApiKeyRequest, Builder> {
        private Long apiKeyId; 
        private Auth auth; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiKeyRequest request) {
            super(request);
            this.apiKeyId = request.apiKeyId;
            this.auth = request.auth;
            this.description = request.description;
        } 

        /**
         * <p>API Key ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3268483</p>
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.putPathParameter("apiKeyId", apiKeyId);
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * <p>The API Key permission settings.</p>
         * <blockquote>
         * <p>Do not specify this parameter or specify it completely for each UpdateApiKey operation. Otherwise, the configuration may not match your expectations.</p>
         * </blockquote>
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
         * <p>update description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateApiKeyRequest build() {
            return new UpdateApiKeyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApiKeyRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyRequest</p>
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
             * <p>Notice: The specified content takes effect only when allowAllModels is set to false.</p>
             * </blockquote>
             */
            public Builder accessibleModels(java.util.List<String> accessibleModels) {
                this.accessibleModels = accessibleModels;
                return this;
            }

            /**
             * <p>Specifies whether all models with inference permissions in the workspace are accessible. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
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
     * {@link UpdateApiKeyRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyRequest</p>
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
             * <p>The IP access whitelist.</p>
             * <blockquote>
             * <ul>
             * <li>When you customize the permission scope, if the IP access whitelist is not specified, the server sets it to IPv4 (0.0.0.0/0) and IPv6 (::/0) by default, which allows all traffic.</li>
             * </ul>
             * </blockquote>
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * <p>The model access scope.</p>
             */
            public Builder modelAccessScope(ModelAccessScope modelAccessScope) {
                this.modelAccessScope = modelAccessScope;
                return this;
            }

            /**
             * <p>The permission type. Valid values:</p>
             * <ul>
             * <li>All: full permissions.</li>
             * <li>Custom: custom permissions.</li>
             * </ul>
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
