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
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The Bootstrap Token and CMS configuration required for connecting the external agent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message indicating the request processing result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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
             * <p>The CMS reporting endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://public.example.com/apm/trace/opentelemetry">https://public.example.com/apm/trace/opentelemetry</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The license key used for CMS connection.</p>
             * 
             * <strong>example:</strong>
             * <p>license-key</p>
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * <p>The CMS workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>cms-workspace</p>
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
             * <p>The external agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The Bootstrap Token used for connecting the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>bootstrap-token</p>
             */
            public Builder bootstrapToken(String bootstrapToken) {
                this.bootstrapToken = bootstrapToken;
                return this;
            }

            /**
             * <p>The CMS configuration used for connecting the external agent.</p>
             */
            public Builder cms(Cms cms) {
                this.cms = cms;
                return this;
            }

            /**
             * <p>The network type for connection. Valid values:</p>
             * <ul>
             * <li>INTERNET: public network</li>
             * <li>INTRANET: internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The fingerprint of the Bootstrap Token.</p>
             * 
             * <strong>example:</strong>
             * <p>fingerprint</p>
             */
            public Builder tokenFingerprint(String tokenFingerprint) {
                this.tokenFingerprint = tokenFingerprint;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
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
