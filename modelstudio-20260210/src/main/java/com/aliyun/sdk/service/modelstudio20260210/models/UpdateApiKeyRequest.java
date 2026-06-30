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
             * accessibleModels.
             */
            public Builder accessibleModels(java.util.List<String> accessibleModels) {
                this.accessibleModels = accessibleModels;
                return this;
            }

            /**
             * allowAllModels.
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
             * accessIps.
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * modelAccessScope.
             */
            public Builder modelAccessScope(ModelAccessScope modelAccessScope) {
                this.modelAccessScope = modelAccessScope;
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
