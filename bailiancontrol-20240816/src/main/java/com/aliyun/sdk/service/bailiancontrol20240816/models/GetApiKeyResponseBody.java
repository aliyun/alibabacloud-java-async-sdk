// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailiancontrol20240816.models;

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
    public static class AuthAppStructure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agents")
        private java.util.List<String> agents;

        @com.aliyun.core.annotation.NameInMap("highCodeApps")
        private java.util.List<String> highCodeApps;

        @com.aliyun.core.annotation.NameInMap("isAllowAccessAllApps")
        private Boolean isAllowAccessAllApps;

        @com.aliyun.core.annotation.NameInMap("workflows")
        private java.util.List<String> workflows;

        private AuthAppStructure(Builder builder) {
            this.agents = builder.agents;
            this.highCodeApps = builder.highCodeApps;
            this.isAllowAccessAllApps = builder.isAllowAccessAllApps;
            this.workflows = builder.workflows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthAppStructure create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<String> getAgents() {
            return this.agents;
        }

        /**
         * @return highCodeApps
         */
        public java.util.List<String> getHighCodeApps() {
            return this.highCodeApps;
        }

        /**
         * @return isAllowAccessAllApps
         */
        public Boolean getIsAllowAccessAllApps() {
            return this.isAllowAccessAllApps;
        }

        /**
         * @return workflows
         */
        public java.util.List<String> getWorkflows() {
            return this.workflows;
        }

        public static final class Builder {
            private java.util.List<String> agents; 
            private java.util.List<String> highCodeApps; 
            private Boolean isAllowAccessAllApps; 
            private java.util.List<String> workflows; 

            private Builder() {
            } 

            private Builder(AuthAppStructure model) {
                this.agents = model.agents;
                this.highCodeApps = model.highCodeApps;
                this.isAllowAccessAllApps = model.isAllowAccessAllApps;
                this.workflows = model.workflows;
            } 

            /**
             * agents.
             */
            public Builder agents(java.util.List<String> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * highCodeApps.
             */
            public Builder highCodeApps(java.util.List<String> highCodeApps) {
                this.highCodeApps = highCodeApps;
                return this;
            }

            /**
             * isAllowAccessAllApps.
             */
            public Builder isAllowAccessAllApps(Boolean isAllowAccessAllApps) {
                this.isAllowAccessAllApps = isAllowAccessAllApps;
                return this;
            }

            /**
             * workflows.
             */
            public Builder workflows(java.util.List<String> workflows) {
                this.workflows = workflows;
                return this;
            }

            public AuthAppStructure build() {
                return new AuthAppStructure(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
     */
    public static class AuthModelStructure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defineModels")
        private java.util.List<String> defineModels;

        @com.aliyun.core.annotation.NameInMap("deployments")
        private java.util.List<String> deployments;

        @com.aliyun.core.annotation.NameInMap("isAllowAccessAllModels")
        private Boolean isAllowAccessAllModels;

        @com.aliyun.core.annotation.NameInMap("models")
        private java.util.List<String> models;

        private AuthModelStructure(Builder builder) {
            this.defineModels = builder.defineModels;
            this.deployments = builder.deployments;
            this.isAllowAccessAllModels = builder.isAllowAccessAllModels;
            this.models = builder.models;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthModelStructure create() {
            return builder().build();
        }

        /**
         * @return defineModels
         */
        public java.util.List<String> getDefineModels() {
            return this.defineModels;
        }

        /**
         * @return deployments
         */
        public java.util.List<String> getDeployments() {
            return this.deployments;
        }

        /**
         * @return isAllowAccessAllModels
         */
        public Boolean getIsAllowAccessAllModels() {
            return this.isAllowAccessAllModels;
        }

        /**
         * @return models
         */
        public java.util.List<String> getModels() {
            return this.models;
        }

        public static final class Builder {
            private java.util.List<String> defineModels; 
            private java.util.List<String> deployments; 
            private Boolean isAllowAccessAllModels; 
            private java.util.List<String> models; 

            private Builder() {
            } 

            private Builder(AuthModelStructure model) {
                this.defineModels = model.defineModels;
                this.deployments = model.deployments;
                this.isAllowAccessAllModels = model.isAllowAccessAllModels;
                this.models = model.models;
            } 

            /**
             * defineModels.
             */
            public Builder defineModels(java.util.List<String> defineModels) {
                this.defineModels = defineModels;
                return this;
            }

            /**
             * deployments.
             */
            public Builder deployments(java.util.List<String> deployments) {
                this.deployments = deployments;
                return this;
            }

            /**
             * isAllowAccessAllModels.
             */
            public Builder isAllowAccessAllModels(Boolean isAllowAccessAllModels) {
                this.isAllowAccessAllModels = isAllowAccessAllModels;
                return this;
            }

            /**
             * models.
             */
            public Builder models(java.util.List<String> models) {
                this.models = models;
                return this;
            }

            public AuthModelStructure build() {
                return new AuthModelStructure(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiKeyResponseBody</p>
     */
    public static class AuthSetModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessIps")
        private java.util.List<String> accessIps;

        @com.aliyun.core.annotation.NameInMap("authAppStructure")
        private AuthAppStructure authAppStructure;

        @com.aliyun.core.annotation.NameInMap("authModelStructure")
        private AuthModelStructure authModelStructure;

        @com.aliyun.core.annotation.NameInMap("authSetMode")
        private String authSetMode;

        private AuthSetModel(Builder builder) {
            this.accessIps = builder.accessIps;
            this.authAppStructure = builder.authAppStructure;
            this.authModelStructure = builder.authModelStructure;
            this.authSetMode = builder.authSetMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthSetModel create() {
            return builder().build();
        }

        /**
         * @return accessIps
         */
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        /**
         * @return authAppStructure
         */
        public AuthAppStructure getAuthAppStructure() {
            return this.authAppStructure;
        }

        /**
         * @return authModelStructure
         */
        public AuthModelStructure getAuthModelStructure() {
            return this.authModelStructure;
        }

        /**
         * @return authSetMode
         */
        public String getAuthSetMode() {
            return this.authSetMode;
        }

        public static final class Builder {
            private java.util.List<String> accessIps; 
            private AuthAppStructure authAppStructure; 
            private AuthModelStructure authModelStructure; 
            private String authSetMode; 

            private Builder() {
            } 

            private Builder(AuthSetModel model) {
                this.accessIps = model.accessIps;
                this.authAppStructure = model.authAppStructure;
                this.authModelStructure = model.authModelStructure;
                this.authSetMode = model.authSetMode;
            } 

            /**
             * accessIps.
             */
            public Builder accessIps(java.util.List<String> accessIps) {
                this.accessIps = accessIps;
                return this;
            }

            /**
             * authAppStructure.
             */
            public Builder authAppStructure(AuthAppStructure authAppStructure) {
                this.authAppStructure = authAppStructure;
                return this;
            }

            /**
             * authModelStructure.
             */
            public Builder authModelStructure(AuthModelStructure authModelStructure) {
                this.authModelStructure = authModelStructure;
                return this;
            }

            /**
             * authSetMode.
             */
            public Builder authSetMode(String authSetMode) {
                this.authSetMode = authSetMode;
                return this;
            }

            public AuthSetModel build() {
                return new AuthSetModel(this);
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
        @com.aliyun.core.annotation.NameInMap("apiKeyValue")
        private String apiKeyValue;

        @com.aliyun.core.annotation.NameInMap("apikeyId")
        private String apikeyId;

        @com.aliyun.core.annotation.NameInMap("authSetModel")
        private AuthSetModel authSetModel;

        @com.aliyun.core.annotation.NameInMap("blocked")
        private String blocked;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("extData")
        private String extData;

        @com.aliyun.core.annotation.NameInMap("parentUid")
        private String parentUid;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private ApiKey(Builder builder) {
            this.apiKeyValue = builder.apiKeyValue;
            this.apikeyId = builder.apikeyId;
            this.authSetModel = builder.authSetModel;
            this.blocked = builder.blocked;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.extData = builder.extData;
            this.parentUid = builder.parentUid;
            this.uid = builder.uid;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKey create() {
            return builder().build();
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        /**
         * @return apikeyId
         */
        public String getApikeyId() {
            return this.apikeyId;
        }

        /**
         * @return authSetModel
         */
        public AuthSetModel getAuthSetModel() {
            return this.authSetModel;
        }

        /**
         * @return blocked
         */
        public String getBlocked() {
            return this.blocked;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extData
         */
        public String getExtData() {
            return this.extData;
        }

        /**
         * @return parentUid
         */
        public String getParentUid() {
            return this.parentUid;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String apiKeyValue; 
            private String apikeyId; 
            private AuthSetModel authSetModel; 
            private String blocked; 
            private Long createTime; 
            private String creator; 
            private String description; 
            private Long expireTime; 
            private String extData; 
            private String parentUid; 
            private String uid; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(ApiKey model) {
                this.apiKeyValue = model.apiKeyValue;
                this.apikeyId = model.apikeyId;
                this.authSetModel = model.authSetModel;
                this.blocked = model.blocked;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.extData = model.extData;
                this.parentUid = model.parentUid;
                this.uid = model.uid;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * apiKeyValue.
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            /**
             * apikeyId.
             */
            public Builder apikeyId(String apikeyId) {
                this.apikeyId = apikeyId;
                return this;
            }

            /**
             * authSetModel.
             */
            public Builder authSetModel(AuthSetModel authSetModel) {
                this.authSetModel = authSetModel;
                return this;
            }

            /**
             * blocked.
             */
            public Builder blocked(String blocked) {
                this.blocked = blocked;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * expireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * extData.
             */
            public Builder extData(String extData) {
                this.extData = extData;
                return this;
            }

            /**
             * parentUid.
             */
            public Builder parentUid(String parentUid) {
                this.parentUid = parentUid;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
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
