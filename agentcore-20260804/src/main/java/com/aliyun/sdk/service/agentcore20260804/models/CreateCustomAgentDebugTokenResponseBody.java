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
 * {@link CreateCustomAgentDebugTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomAgentDebugTokenResponseBody</p>
 */
public class CreateCustomAgentDebugTokenResponseBody extends TeaModel {
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

    private CreateCustomAgentDebugTokenResponseBody(Builder builder) {
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

    public static CreateCustomAgentDebugTokenResponseBody create() {
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

        private Builder(CreateCustomAgentDebugTokenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. SUCCESS is returned if the call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The debugging token, token fingerprint, and the corresponding resource and network information issued in this request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F2B17684-703A-4F29-9D14-30C334A85162</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCustomAgentDebugTokenResponseBody build() {
            return new CreateCustomAgentDebugTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomAgentDebugTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentDebugTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("bootstrapToken")
        private String bootstrapToken;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("tokenFingerprint")
        private String tokenFingerprint;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.bootstrapToken = builder.bootstrapToken;
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
            private String networkType; 
            private String tokenFingerprint; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.bootstrapToken = model.bootstrapToken;
                this.networkType = model.networkType;
                this.tokenFingerprint = model.tokenFingerprint;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the high-code agent corresponding to the token.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-0123456789abcdef0123456789abcdef</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The token used by the AgentCore SDK for local debugging. Keep the token secure. Do not write it to logs or commit it to code repositories.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJwcm9kdWN0****</p>
             */
            public Builder bootstrapToken(String bootstrapToken) {
                this.bootstrapToken = bootstrapToken;
                return this;
            }

            /**
             * <p>The network type used by the token, which is the same as the networkType parameter in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The fingerprint used to identify the issued token. You can use the fingerprint to troubleshoot issuance records.</p>
             * 
             * <strong>example:</strong>
             * <p>c4f5b8813a0d</p>
             */
            public Builder tokenFingerprint(String tokenFingerprint) {
                this.tokenFingerprint = tokenFingerprint;
                return this;
            }

            /**
             * <p>The ID of the workspace corresponding to the token.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-0123456789abcdef01234</p>
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
