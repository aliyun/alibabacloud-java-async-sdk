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
 * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
 *
 * <p>ProbeMcpOriginResponseBody</p>
 */
public class ProbeMcpOriginResponseBody extends TeaModel {
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

    private ProbeMcpOriginResponseBody(Builder builder) {
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

    public static ProbeMcpOriginResponseBody create() {
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

        private Builder(ProbeMcpOriginResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code. SUCCESS indicates that the API completed normally. For the origin server result, see data.status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The read-only, one-time, and bounded probe result. It is not persisted and is not associated with any subsequently created MCP.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the POP API request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The API processing result, which does not include the original response from the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID used to correlate this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>8F7A9D02-8E5B-4376-8D2B-6A9CB3A42B16</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API was processed successfully. This indicates that authorization, parameter checks, and execution mechanisms completed normally, but does not mean the origin server check succeeded.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ProbeMcpOriginResponseBody build() {
            return new ProbeMcpOriginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Coverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("headerNames")
        private java.util.List<String> headerNames;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("viaGateway")
        private Boolean viaGateway;

        private Coverage(Builder builder) {
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.headerNames = builder.headerNames;
            this.method = builder.method;
            this.path = builder.path;
            this.protocol = builder.protocol;
            this.target = builder.target;
            this.viaGateway = builder.viaGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coverage create() {
            return builder().build();
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        /**
         * @return headerNames
         */
        public java.util.List<String> getHeaderNames() {
            return this.headerNames;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return viaGateway
         */
        public Boolean getViaGateway() {
            return this.viaGateway;
        }

        public static final class Builder {
            private String backendMcpProtocol; 
            private java.util.List<String> headerNames; 
            private String method; 
            private String path; 
            private String protocol; 
            private String target; 
            private Boolean viaGateway; 

            private Builder() {
            } 

            private Builder(Coverage model) {
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.headerNames = model.headerNames;
                this.method = model.method;
                this.path = model.path;
                this.protocol = model.protocol;
                this.target = model.target;
                this.viaGateway = model.viaGateway;
            } 

            /**
             * <p>The evidence-verified legacy or modern protocol. This field is empty during HTTP interface checks.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>The list of non-sensitive header names. Internal platform routing and network identities are excluded.</p>
             */
            public Builder headerNames(java.util.List<String> headerNames) {
                this.headerNames = headerNames;
                return this;
            }

            /**
             * <p>The HTTP method selected for this check. This field is empty for direct connections.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The redacted summary of the HTTP path selected for this check. This field is empty for direct connections.</p>
             * 
             * <strong>example:</strong>
             * <p>/mcp</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The evidence-verified MCP transport. This field is empty during HTTP interface checks.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The summary of the origin server target for this request. It does not contain sensitive query parameters or credentials.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>This field is fixed to false for origin server checks before creation and does not indicate that the resource is ready.</p>
             */
            public Builder viaGateway(Boolean viaGateway) {
                this.viaGateway = viaGateway;
                return this;
            }

            public Coverage build() {
                return new Coverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.retryable = builder.retryable;
            this.source = builder.source;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private Boolean retryable; 
            private String source; 
            private String stage; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.retryable = model.retryable;
                this.source = model.source;
                this.stage = model.stage;
            } 

            /**
             * <p>The bounded diagnostic code. The original error body from the origin server is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>PROBE_TIMEOUT</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The trimmed and redacted diagnostic information. This field does not contain credentials or original responses.</p>
             * 
             * <strong>example:</strong>
             * <p>The probe deadline was exceeded.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Specifies whether the operation is suitable for retry under a restricted policy. This field does not trigger automatic retries.</p>
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * <p>The source of the error. Valid values: MAGIC, ROUTER, NETWORK, ORIGIN, or UNKNOWN. This value is determined solely based on actual evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>UNKNOWN</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The detection or publishing stage where the error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>INITIALIZE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class HttpResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("definitionStatus")
        private String definitionStatus;

        @com.aliyun.core.annotation.NameInMap("httpStatusCode")
        private Integer httpStatusCode;

        private HttpResult(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.definitionStatus = builder.definitionStatus;
            this.httpStatusCode = builder.httpStatusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpResult create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return definitionStatus
         */
        public String getDefinitionStatus() {
            return this.definitionStatus;
        }

        /**
         * @return httpStatusCode
         */
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String definitionStatus; 
            private Integer httpStatusCode; 

            private Builder() {
            } 

            private Builder(HttpResult model) {
                this.connectionStatus = model.connectionStatus;
                this.definitionStatus = model.definitionStatus;
                this.httpStatusCode = model.httpStatusCode;
            } 

            /**
             * <p>The target connection status. Valid values: PASSED, FAILED, NOT_RUN, or UNKNOWN. It is judged only based on the actual target connection evidence for this request.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The API definition check result. Valid values: PASSED, FAILED, or NOT_RUN. The value is NOT_RUN when no OpenAPI specification is available.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder definitionStatus(String definitionStatus) {
                this.definitionStatus = definitionStatus;
                return this;
            }

            /**
             * <p>The actual HTTP status code received. It is empty if the request was not executed or no response was received.</p>
             * 
             * <strong>example:</strong>
             * <p>405</p>
             */
            public Builder httpStatusCode(Integer httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            public HttpResult build() {
                return new HttpResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Observations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("declared")
        private Boolean declared;

        @com.aliyun.core.annotation.NameInMap("declaredVersions")
        private java.util.List<String> declaredVersions;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("negotiatedVersion")
        private String negotiatedVersion;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("sessionMode")
        private String sessionMode;

        @com.aliyun.core.annotation.NameInMap("verificationStatus")
        private String verificationStatus;

        private Observations(Builder builder) {
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.declared = builder.declared;
            this.declaredVersions = builder.declaredVersions;
            this.endpoint = builder.endpoint;
            this.negotiatedVersion = builder.negotiatedVersion;
            this.protocol = builder.protocol;
            this.sessionMode = builder.sessionMode;
            this.verificationStatus = builder.verificationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Observations create() {
            return builder().build();
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        /**
         * @return declared
         */
        public Boolean getDeclared() {
            return this.declared;
        }

        /**
         * @return declaredVersions
         */
        public java.util.List<String> getDeclaredVersions() {
            return this.declaredVersions;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return negotiatedVersion
         */
        public String getNegotiatedVersion() {
            return this.negotiatedVersion;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sessionMode
         */
        public String getSessionMode() {
            return this.sessionMode;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public static final class Builder {
            private String backendMcpProtocol; 
            private Boolean declared; 
            private java.util.List<String> declaredVersions; 
            private String endpoint; 
            private String negotiatedVersion; 
            private String protocol; 
            private String sessionMode; 
            private String verificationStatus; 

            private Builder() {
            } 

            private Builder(Observations model) {
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.declared = model.declared;
                this.declaredVersions = model.declaredVersions;
                this.endpoint = model.endpoint;
                this.negotiatedVersion = model.negotiatedVersion;
                this.protocol = model.protocol;
                this.sessionMode = model.sessionMode;
                this.verificationStatus = model.verificationStatus;
            } 

            /**
             * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>Indicates whether the origin server declares support for this combination. This field is empty when there is no declaration evidence.</p>
             */
            public Builder declared(Boolean declared) {
                this.declared = declared;
                return this;
            }

            /**
             * <p>The list of declared versions. It only retains the date versions actually declared by the origin server and does not infer the full set from a single negotiation.</p>
             */
            public Builder declaredVersions(java.util.List<String> declaredVersions) {
                this.declaredVersions = declaredVersions;
                return this;
            }

            /**
             * <p>The desensitized origin server or controlled subsequent endpoint. Sensitive query parameters are not returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mcp.example.com/mcp">https://mcp.example.com/mcp</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The actual version used. For legacy, it is the negotiated version. For modern, it is the selected and verified date version. This field is empty when unconfirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26</p>
             */
            public Builder negotiatedVersion(String negotiatedVersion) {
                this.negotiatedVersion = negotiatedVersion;
                return this;
            }

            /**
             * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The session mode. Valid values: STATEFUL, STATELESS, NOT_APPLICABLE, or UNKNOWN. A direct legacy connection without a session is not automatically judged as failed.</p>
             * 
             * <strong>example:</strong>
             * <p>STATELESS</p>
             */
            public Builder sessionMode(String sessionMode) {
                this.sessionMode = sessionMode;
                return this;
            }

            /**
             * <p>The protocol verification status. Valid values: VERIFIED, UNSUPPORTED, FAILED, or UNKNOWN. UNSUPPORTED requires protocol evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>VERIFIED</p>
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            public Observations build() {
                return new Observations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Recommendation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("originProtocolVersion")
        private String originProtocolVersion;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Recommendation(Builder builder) {
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.originProtocolVersion = builder.originProtocolVersion;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recommendation create() {
            return builder().build();
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        /**
         * @return originProtocolVersion
         */
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String backendMcpProtocol; 
            private String originProtocolVersion; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Recommendation model) {
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.originProtocolVersion = model.originProtocolVersion;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>The origin server MCP date version actually negotiated or selected and verified in this request, in YYYY-MM-DD format. It is null when unconfirmed. It only displays the origin server protocol date metadata. It can be filled in during creation and modified during updates. If omitted during an update, the current value is retained. It does not control backend requests or the external protocol of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26</p>
             */
            public Builder originProtocolVersion(String originProtocolVersion) {
                this.originProtocolVersion = originProtocolVersion;
                return this;
            }

            /**
             * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Recommendation build() {
                return new Recommendation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class SelectedConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendMcpProtocol")
        private String backendMcpProtocol;

        @com.aliyun.core.annotation.NameInMap("originProtocolVersion")
        private String originProtocolVersion;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private SelectedConfiguration(Builder builder) {
            this.backendMcpProtocol = builder.backendMcpProtocol;
            this.originProtocolVersion = builder.originProtocolVersion;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedConfiguration create() {
            return builder().build();
        }

        /**
         * @return backendMcpProtocol
         */
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        /**
         * @return originProtocolVersion
         */
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String backendMcpProtocol; 
            private String originProtocolVersion; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(SelectedConfiguration model) {
                this.backendMcpProtocol = model.backendMcpProtocol;
                this.originProtocolVersion = model.originProtocolVersion;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The backend MCP protocol policy. Valid values: legacy or modern.</p>
             * 
             * <strong>example:</strong>
             * <p>modern</p>
             */
            public Builder backendMcpProtocol(String backendMcpProtocol) {
                this.backendMcpProtocol = backendMcpProtocol;
                return this;
            }

            /**
             * <p>The origin server MCP date version actually negotiated or selected and verified in this request, in YYYY-MM-DD format. It is null when unconfirmed. It only displays the origin server protocol date metadata. It can be filled in during creation and modified during updates. If omitted during an update, the current value is retained. It does not control backend requests or the external protocol of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26</p>
             */
            public Builder originProtocolVersion(String originProtocolVersion) {
                this.originProtocolVersion = originProtocolVersion;
                return this;
            }

            /**
             * <p>The protocol. Valid values: SSE or StreamableHTTP. The modern policy is only combined with StreamableHTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SelectedConfiguration build() {
                return new SelectedConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputSchema")
        private String inputSchema;

        @com.aliyun.core.annotation.NameInMap("outputSchema")
        private String outputSchema;

        @com.aliyun.core.annotation.NameInMap("toolDescription")
        private String toolDescription;

        @com.aliyun.core.annotation.NameInMap("toolName")
        private String toolName;

        private Tools(Builder builder) {
            this.inputSchema = builder.inputSchema;
            this.outputSchema = builder.outputSchema;
            this.toolDescription = builder.toolDescription;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return inputSchema
         */
        public String getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return outputSchema
         */
        public String getOutputSchema() {
            return this.outputSchema;
        }

        /**
         * @return toolDescription
         */
        public String getToolDescription() {
            return this.toolDescription;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String inputSchema; 
            private String outputSchema; 
            private String toolDescription; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.inputSchema = model.inputSchema;
                this.outputSchema = model.outputSchema;
                this.toolDescription = model.toolDescription;
                this.toolName = model.toolName;
            } 

            /**
             * <p>The input schema defined by the protocol, represented as a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{}}</p>
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
                return this;
            }

            /**
             * <p>The output schema defined by the protocol, represented as a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;total&quot;:{&quot;type&quot;:&quot;integer&quot;}}}</p>
             */
            public Builder outputSchema(String outputSchema) {
                this.outputSchema = outputSchema;
                return this;
            }

            /**
             * <p>The untrusted description text returned by the origin server. It is escaped when displayed and is not executed as an instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>List inventory items</p>
             */
            public Builder toolDescription(String toolDescription) {
                this.toolDescription = toolDescription;
                return this;
            }

            /**
             * <p>The declared name of the tool. Only metadata is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>list_inventory</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Warnings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Warnings(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warnings create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Warnings model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The structured identifier for the detection limitation.</p>
             * 
             * <strong>example:</strong>
             * <p>TOOLS_TRUNCATED</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of limitations such as UNKNOWN, not executed, or truncated. This field does not contain credentials or original responses.</p>
             * 
             * <strong>example:</strong>
             * <p>The tool preview limit was reached; protocol verification succeeded.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Warnings build() {
                return new Warnings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProbeMcpOriginResponseBody} extends {@link TeaModel}
     *
     * <p>ProbeMcpOriginResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("coverage")
        private Coverage coverage;

        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("httpResult")
        private HttpResult httpResult;

        @com.aliyun.core.annotation.NameInMap("observations")
        private java.util.List<Observations> observations;

        @com.aliyun.core.annotation.NameInMap("probeId")
        private String probeId;

        @com.aliyun.core.annotation.NameInMap("probedAt")
        private String probedAt;

        @com.aliyun.core.annotation.NameInMap("recommendation")
        private Recommendation recommendation;

        @com.aliyun.core.annotation.NameInMap("selectedConfiguration")
        private SelectedConfiguration selectedConfiguration;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("toolsComplete")
        private Boolean toolsComplete;

        @com.aliyun.core.annotation.NameInMap("toolsStatus")
        private String toolsStatus;

        @com.aliyun.core.annotation.NameInMap("warnings")
        private java.util.List<Warnings> warnings;

        private Data(Builder builder) {
            this.coverage = builder.coverage;
            this.error = builder.error;
            this.httpResult = builder.httpResult;
            this.observations = builder.observations;
            this.probeId = builder.probeId;
            this.probedAt = builder.probedAt;
            this.recommendation = builder.recommendation;
            this.selectedConfiguration = builder.selectedConfiguration;
            this.stage = builder.stage;
            this.status = builder.status;
            this.tools = builder.tools;
            this.toolsComplete = builder.toolsComplete;
            this.toolsStatus = builder.toolsStatus;
            this.warnings = builder.warnings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public Coverage getCoverage() {
            return this.coverage;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return httpResult
         */
        public HttpResult getHttpResult() {
            return this.httpResult;
        }

        /**
         * @return observations
         */
        public java.util.List<Observations> getObservations() {
            return this.observations;
        }

        /**
         * @return probeId
         */
        public String getProbeId() {
            return this.probeId;
        }

        /**
         * @return probedAt
         */
        public String getProbedAt() {
            return this.probedAt;
        }

        /**
         * @return recommendation
         */
        public Recommendation getRecommendation() {
            return this.recommendation;
        }

        /**
         * @return selectedConfiguration
         */
        public SelectedConfiguration getSelectedConfiguration() {
            return this.selectedConfiguration;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return toolsComplete
         */
        public Boolean getToolsComplete() {
            return this.toolsComplete;
        }

        /**
         * @return toolsStatus
         */
        public String getToolsStatus() {
            return this.toolsStatus;
        }

        /**
         * @return warnings
         */
        public java.util.List<Warnings> getWarnings() {
            return this.warnings;
        }

        public static final class Builder {
            private Coverage coverage; 
            private Error error; 
            private HttpResult httpResult; 
            private java.util.List<Observations> observations; 
            private String probeId; 
            private String probedAt; 
            private Recommendation recommendation; 
            private SelectedConfiguration selectedConfiguration; 
            private String stage; 
            private String status; 
            private java.util.List<Tools> tools; 
            private Boolean toolsComplete; 
            private String toolsStatus; 
            private java.util.List<Warnings> warnings; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.coverage = model.coverage;
                this.error = model.error;
                this.httpResult = model.httpResult;
                this.observations = model.observations;
                this.probeId = model.probeId;
                this.probedAt = model.probedAt;
                this.recommendation = model.recommendation;
                this.selectedConfiguration = model.selectedConfiguration;
                this.stage = model.stage;
                this.status = model.status;
                this.tools = model.tools;
                this.toolsComplete = model.toolsComplete;
                this.toolsStatus = model.toolsStatus;
                this.warnings = model.warnings;
            } 

            /**
             * <p>The check coverage. It describes the target, protocol, or HTTP request conditions for this request and does not prove that the formal gateway and other APIs are available.</p>
             */
            public Builder coverage(Coverage coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The origin server diagnostics. This field indicates origin server failures and is empty upon success. Origin 401 errors or connection failures are not uniformly mapped to API exceptions.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The HTTP check result. It is only returned for the HTTP type. The definition is separated from the actual request status. It is null for direct connections. A 2xx status code only proves the success of this request and does not prove that business functions or other APIs are available.</p>
             */
            public Builder httpResult(HttpResult httpResult) {
                this.httpResult = httpResult;
                return this;
            }

            /**
             * <p>The declared and actual test results for a single origin server controlled endpoint. This is an empty array for the HTTP type.</p>
             */
            public Builder observations(java.util.List<Observations> observations) {
                this.observations = observations;
                return this;
            }

            /**
             * <p>The ID used only to correlate desensitized logs. It is not used for queries, authorization, binding MCPs, or reusing check evidence.</p>
             * 
             * <strong>example:</strong>
             * <p>mcpprobe-8f7a9d02-8e5b-4376-8d2b-6a9cb3a42b16</p>
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * <p>The observation time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-19T08:30:00Z</p>
             */
            public Builder probedAt(String probedAt) {
                this.probedAt = probedAt;
                return this;
            }

            /**
             * <p>The recommended protocol combination. It only comes from verified combinations that the platform can access. This field is empty when no combinations are available or for the HTTP type.</p>
             */
            public Builder recommendation(Recommendation recommendation) {
                this.recommendation = recommendation;
                return this;
            }

            /**
             * <p>The combination actually used for tool queries. Filling in this field does not mean verification passed. It is empty for the HTTP type.</p>
             */
            public Builder selectedConfiguration(SelectedConfiguration selectedConfiguration) {
                this.selectedConfiguration = selectedConfiguration;
                return this;
            }

            /**
             * <p>The current check stage. Valid values: AUTHORIZE, VALIDATE, RATE_LIMIT, NETWORK, NETWORK_CONTEXT, CONNECT, DISCOVER, INITIALIZE, SESSION_CHECK, TOOLS_LIST, HTTP_DEFINITION, HTTP_REQUEST, CLEANUP, EXECUTION, or COMPLETE.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The check result of the origin server. Valid values: SUCCESS, PARTIAL, or FAILED. SUCCESS indicates that the protocol check passed but no capabilities were declared or the tools capability is missing. A completely empty tool list also passes. PARTIAL indicates that the tool query failed or was truncated. For HTTP, PARTIAL indicates that only the definition was checked or required evidence is unknown.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of restricted metadata for this request. Tools are not executed. An empty array is returned if tools are not declared, the list is completely empty, or it is the HTTP type. Evaluate this together with toolsStatus and toolsComplete.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p>Indicates whether the tool list is complete. The value is true for COMPLETE or EMPTY, and false for TRUNCATED. The value is null if not queried, not declared, or failed. Completeness cannot be determined solely by an empty array.</p>
             */
            public Builder toolsComplete(Boolean toolsComplete) {
                this.toolsComplete = toolsComplete;
                return this;
            }

            /**
             * <p>The tool query status. Valid values: NOT_RUN, NOT_DECLARED, EMPTY, COMPLETE, TRUNCATED, or FAILED. If tools are not declared, the value is NOT_DECLARED and tools/list is not executed. For the HTTP type, the value is NOT_RUN.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder toolsStatus(String toolsStatus) {
                this.toolsStatus = toolsStatus;
                return this;
            }

            /**
             * <p>The coverage and completeness limitations of this check.</p>
             */
            public Builder warnings(java.util.List<Warnings> warnings) {
                this.warnings = warnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
