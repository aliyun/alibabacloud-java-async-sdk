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
 * {@link CreateExternalAgentBootstrapTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExternalAgentBootstrapTokenResponseBody</p>
 */
public class CreateExternalAgentBootstrapTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateExternalAgentBootstrapTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExternalAgentBootstrapTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateExternalAgentBootstrapTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * requestId.
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

        public CreateExternalAgentBootstrapTokenResponseBody build() {
            return new CreateExternalAgentBootstrapTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateExternalAgentBootstrapTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentBootstrapTokenResponseBody</p>
     */
    public static class Cms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("licenseKey")
        private String licenseKey;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Cms(Builder builder) {
            this.endpoint = builder.endpoint;
            this.licenseKey = builder.licenseKey;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cms create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String endpoint; 
            private String licenseKey; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Cms model) {
                this.endpoint = model.endpoint;
                this.licenseKey = model.licenseKey;
                this.workspace = model.workspace;
            } 

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * licenseKey.
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Cms build() {
                return new Cms(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentBootstrapTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentBootstrapTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("bootstrapToken")
        private String bootstrapToken;

        @com.aliyun.core.annotation.NameInMap("cms")
        private Cms cms;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("tokenFingerprint")
        private String tokenFingerprint;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.bootstrapToken = builder.bootstrapToken;
            this.cms = builder.cms;
            this.networkType = builder.networkType;
            this.tokenFingerprint = builder.tokenFingerprint;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return bootstrapToken
         */
        public String getBootstrapToken() {
            return this.bootstrapToken;
        }

        /**
         * @return cms
         */
        public Cms getCms() {
            return this.cms;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return tokenFingerprint
         */
        public String getTokenFingerprint() {
            return this.tokenFingerprint;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String bootstrapToken; 
            private Cms cms; 
            private String networkType; 
            private String tokenFingerprint; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.bootstrapToken = model.bootstrapToken;
                this.cms = model.cms;
                this.networkType = model.networkType;
                this.tokenFingerprint = model.tokenFingerprint;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * bootstrapToken.
             */
            public Builder bootstrapToken(String bootstrapToken) {
                this.bootstrapToken = bootstrapToken;
                return this;
            }

            /**
             * cms.
             */
            public Builder cms(Cms cms) {
                this.cms = cms;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * tokenFingerprint.
             */
            public Builder tokenFingerprint(String tokenFingerprint) {
                this.tokenFingerprint = tokenFingerprint;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
