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
 * {@link GetApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiKeyResponseBody</p>
 */
public class GetApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private ApiKey apiKey;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ApiKey apiKey; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(ApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DFD55E7B-0615-5343-BDA0-FBEE86F29935</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetApiKeyResponseBody build() {
            return new GetApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
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
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
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
    /**
     * 
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
     */
    public static class ApiKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyId")
        private Long apiKeyId;

        @com.aliyun.core.annotation.NameInMap("apiKeyValue")
        private String apiKeyValue;

        @com.aliyun.core.annotation.NameInMap("auth")
        private Auth auth;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("disabled")
        private Integer disabled;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private ApiKey(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.apiKeyValue = builder.apiKeyValue;
            this.auth = builder.auth;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.disabled = builder.disabled;
            this.gmtCreate = builder.gmtCreate;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKey create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        /**
         * @return auth
         */
        public Auth getAuth() {
            return this.auth;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disabled
         */
        public Integer getDisabled() {
            return this.disabled;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Long apiKeyId; 
            private String apiKeyValue; 
            private Auth auth; 
            private String createdBy; 
            private String description; 
            private Integer disabled; 
            private Long gmtCreate; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ApiKey model) {
                this.apiKeyId = model.apiKeyId;
                this.apiKeyValue = model.apiKeyValue;
                this.auth = model.auth;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.disabled = model.disabled;
                this.gmtCreate = model.gmtCreate;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>API Key ID。</p>
             * 
             * <strong>example:</strong>
             * <p>2965964</p>
             */
            public Builder apiKeyId(Long apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * apiKeyValue.
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            /**
             * auth.
             */
            public Builder auth(Auth auth) {
                this.auth = auth;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * disabled.
             */
            public Builder disabled(Integer disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ApiKey build() {
                return new ApiKey(this);
            } 

        } 

    }
}
