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
 * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomAgentResponseBody</p>
 */
public class CreateCustomAgentResponseBody extends TeaModel {
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

    private CreateCustomAgentResponseBody(Builder builder) {
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

    public static CreateCustomAgentResponseBody create() {
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

        private Builder(CreateCustomAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request result code. The value is SUCCESS when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The latest submitted configuration and status of the custom agent. A successful response indicates that the request is accepted, but the configuration may not have taken effect yet.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the request. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the processing result for the request. A value of success indicates that the request was processed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>550E8400-E29B-41D4-A716-446655440000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. Note that a successful creation, update, or deletion does not mean that the background operation is complete.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCustomAgentResponseBody build() {
            return new CreateCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class AgenticFsMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("server")
        private String server;

        private AgenticFsMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.server = builder.server;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticFsMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        public static final class Builder {
            private String mountPath; 
            private String path; 
            private Boolean readOnly; 
            private String server; 

            private Builder() {
            } 

            private Builder(AgenticFsMounts model) {
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.readOnly = model.readOnly;
                this.server = model.server;
            } 

            /**
             * <p>The AgenticFS mount directory in the container, located under /mnt/agenticfs/.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/agenticfs/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The relative directory within the mounted access point.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether the mount is read-only. A value of true indicates that the mount is read-only. A value of false indicates that the mount is readable and writable.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The domain name of the AgenticFS access point used for the mount.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            public AgenticFsMounts build() {
                return new AgenticFsMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Code extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entrypoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entrypoint;

        @com.aliyun.core.annotation.NameInMap("languageRuntime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String languageRuntime;

        @com.aliyun.core.annotation.NameInMap("sourceUri")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceUri;

        private Code(Builder builder) {
            this.entrypoint = builder.entrypoint;
            this.languageRuntime = builder.languageRuntime;
            this.sourceUri = builder.sourceUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Code create() {
            return builder().build();
        }

        /**
         * @return entrypoint
         */
        public String getEntrypoint() {
            return this.entrypoint;
        }

        /**
         * @return languageRuntime
         */
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        public static final class Builder {
            private String entrypoint; 
            private String languageRuntime; 
            private String sourceUri; 

            private Builder() {
            } 

            private Builder(Code model) {
                this.entrypoint = model.entrypoint;
                this.languageRuntime = model.languageRuntime;
                this.sourceUri = model.sourceUri;
            } 

            /**
             * <p>The startup entry point of the code package. Code package deployment is not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>python app.py</p>
             */
            public Builder entrypoint(String entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The language runtime identifier of the code package. Code package deployment is not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>python</p>
             */
            public Builder languageRuntime(String languageRuntime) {
                this.languageRuntime = languageRuntime;
                return this;
            }

            /**
             * <p>The source URI of the code package. Code package deployment is not supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://my-agent-bucket/packages/agent.zip</p>
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            public Code build() {
                return new Code(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entrypoint")
        private String entrypoint;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("repo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repo;

        @com.aliyun.core.annotation.NameInMap("tag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tag;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Container(Builder builder) {
            this.entrypoint = builder.entrypoint;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.repo = builder.repo;
            this.tag = builder.tag;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return entrypoint
         */
        public String getEntrypoint() {
            return this.entrypoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String entrypoint; 
            private String instanceId; 
            private String namespace; 
            private String repo; 
            private String tag; 
            private String type; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.entrypoint = model.entrypoint;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.repo = model.repo;
                this.tag = model.tag;
                this.type = model.type;
            } 

            /**
             * <p>The custom executable program and startup parameters. If not configured, the default startup method of the image is used.</p>
             * 
             * <strong>example:</strong>
             * <p>python app.py</p>
             */
            public Builder entrypoint(String entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The ID of the ACR instance to which the image repository belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-a1b2c3d4e5f6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace to which the ACR image repository belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the image repository in the ACR namespace.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>chat-agent</p>
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            /**
             * <p>The latest submitted image tag.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The image source type. A value of acr indicates Alibaba Cloud Container Registry.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acr</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Artifact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Code code;

        @com.aliyun.core.annotation.NameInMap("container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        private Artifact(Builder builder) {
            this.code = builder.code;
            this.container = builder.container;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifact create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Code getCode() {
            return this.code;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Code code; 
            private Container container; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(Artifact model) {
                this.code = model.code;
                this.container = model.container;
                this.port = model.port;
            } 

            /**
             * <p>The code package configuration field. Code package deployment is not supported.</p>
             */
            public Builder code(Code code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The latest submitted ACR container image configuration.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The TCP port listened on by the agent service.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public Artifact build() {
                return new Artifact(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LOG_LEVEL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The string value of the environment variable. Empty strings are allowed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private Environment(Builder builder) {
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.variables = model.variables;
            } 

            /**
             * <p>The latest submitted list of environment variables.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("healthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("intervalSeconds")
        private Integer intervalSeconds;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
        private Integer timeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("unhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheck(Builder builder) {
            this.healthyThreshold = builder.healthyThreshold;
            this.intervalSeconds = builder.intervalSeconds;
            this.path = builder.path;
            this.port = builder.port;
            this.timeoutSeconds = builder.timeoutSeconds;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return intervalSeconds
         */
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Integer healthyThreshold; 
            private Integer intervalSeconds; 
            private String path; 
            private Integer port; 
            private Integer timeoutSeconds; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.healthyThreshold = model.healthyThreshold;
                this.intervalSeconds = model.intervalSeconds;
                this.path = model.path;
                this.port = model.port;
                this.timeoutSeconds = model.timeoutSeconds;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>This parameter does not take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder intervalSeconds(Integer intervalSeconds) {
                this.intervalSeconds = intervalSeconds;
                return this;
            }

            /**
             * <p>The HTTP Health Check Path.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthz</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port accessed for the HTTP health check.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The timeout period for a single health check, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The number of consecutive health check failures required to mark the agent as unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class LatestExecutionError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        private LatestExecutionError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.retryable = builder.retryable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestExecutionError create() {
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

        public static final class Builder {
            private String code; 
            private String message; 
            private Boolean retryable; 

            private Builder() {
            } 

            private Builder(LatestExecutionError model) {
                this.code = model.code;
                this.message = model.message;
                this.retryable = model.retryable;
            } 

            /**
             * <p>The reason code for the waiting or execution failure of the latest configuration. This code is used to determine the subsequent handling method.</p>
             * 
             * <strong>example:</strong>
             * <p>AgentExecutionFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the reason why the latest configuration is waiting or has failed to execute. Refer to the code and retryable fields to determine what to do next.</p>
             * 
             * <strong>example:</strong>
             * <p>The agent execution failed. Check the configuration and resubmit</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Specifies whether the operation is automatically retried. A value of true indicates that you can query again later. A value of false indicates that you must check and fix the configuration based on the reason, and then resubmit the request.</p>
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            public LatestExecutionError build() {
                return new LatestExecutionError(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Sls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private Sls(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sls create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(Sls model) {
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * <p>The name of the Simple Log Service Logstore that receives agent logs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-runtime</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that receives agent logs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-logs</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public Sls build() {
                return new Sls(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Logging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sls")
        private Sls sls;

        private Logging(Builder builder) {
            this.sls = builder.sls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logging create() {
            return builder().build();
        }

        /**
         * @return sls
         */
        public Sls getSls() {
            return this.sls;
        }

        public static final class Builder {
            private Sls sls; 

            private Builder() {
            } 

            private Builder(Logging model) {
                this.sls = model.sls;
            } 

            /**
             * <p>The Simple Log Service (SLS) log delivery destination.</p>
             */
            public Builder sls(Sls sls) {
                this.sls = sls;
                return this;
            }

            public Logging build() {
                return new Logging(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class AccessInternet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private AccessInternet(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInternet create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessInternet model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether Internet access is allowed on the agent side. The actual access is still restricted by the workspace.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessInternet build() {
                return new AccessInternet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class AccessVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private AccessVpc(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessVpc create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessVpc model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether access to the user VPC configured for the workspace is allowed on the agent side. The actual access is still restricted by the workspace.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessVpc build() {
                return new AccessVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessInternet")
        private AccessInternet accessInternet;

        @com.aliyun.core.annotation.NameInMap("accessVpc")
        private AccessVpc accessVpc;

        private Network(Builder builder) {
            this.accessInternet = builder.accessInternet;
            this.accessVpc = builder.accessVpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessInternet
         */
        public AccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        /**
         * @return accessVpc
         */
        public AccessVpc getAccessVpc() {
            return this.accessVpc;
        }

        public static final class Builder {
            private AccessInternet accessInternet; 
            private AccessVpc accessVpc; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessInternet = model.accessInternet;
                this.accessVpc = model.accessVpc;
            } 

            /**
             * <p>The Internet access configuration of the agent. If this field is not configured, Internet access is allowed on the agent side, but it is still restricted by the workspace.</p>
             */
            public Builder accessInternet(AccessInternet accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * <p>The user VPC access configuration of the agent. If this field is not configured, user VPC access is allowed on the agent side, but it is still restricted by the workspace.</p>
             */
            public Builder accessVpc(AccessVpc accessVpc) {
                this.accessVpc = accessVpc;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class OssMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private OssMounts(Builder builder) {
            this.bucketName = builder.bucketName;
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMounts create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String bucketName; 
            private String mountPath; 
            private String path; 
            private Boolean readOnly; 

            private Builder() {
            } 

            private Builder(OssMounts model) {
                this.bucketName = model.bucketName;
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.readOnly = model.readOnly;
            } 

            /**
             * <p>The name of the mounted OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-data</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The OSS mount directory in the container, located under /mnt/oss/.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/oss/train</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The prefix of the object directory in the mounted bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>datasets/train</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether the mount is read-only. A value of true indicates that the mount is read-only. A value of false indicates that the mount is readable and writable.</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public OssMounts build() {
                return new OssMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Paths(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The usage description of the current API path.</p>
             * 
             * <strong>example:</strong>
             * <p>AG-UI conversation API</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The API path corresponding to the current protocol.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/agui</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Protocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<Paths> paths;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Protocol(Builder builder) {
            this.headers = builder.headers;
            this.paths = builder.paths;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocol create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return paths
         */
        public java.util.List<Paths> getPaths() {
            return this.paths;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, String> headers; 
            private java.util.List<Paths> paths; 
            private String type; 

            private Builder() {
            } 

            private Builder(Protocol model) {
                this.headers = model.headers;
                this.paths = model.paths;
                this.type = model.type;
            } 

            /**
             * <p>The request header configurations for the current protocol. The key is the header name and the value is a string.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The list of API paths corresponding to the current protocol.</p>
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The invocation protocol type. Valid values:</p>
             * <ul>
             * <li>agui: AG-UI protocol.</li>
             * <li>openai-chat-completion: OpenAI Chat Completions compatible protocol.</li>
             * <li>custom: Custom protocol.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agui</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Protocol build() {
                return new Protocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeClass")
        @com.aliyun.core.annotation.Validation(required = true)
        private String computeClass;

        private Compute(Builder builder) {
            this.computeClass = builder.computeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return computeClass
         */
        public String getComputeClass() {
            return this.computeClass;
        }

        public static final class Builder {
            private String computeClass; 

            private Builder() {
            } 

            private Builder(Compute model) {
                this.computeClass = model.computeClass;
            } 

            /**
             * <p>The compute specification. Valid values:</p>
             * <ul>
             * <li>INTERACTIVE: 1 vCPU and 2 GiB of memory.</li>
             * <li>STANDARD: 2 vCPUs and 4 GiB of memory.</li>
             * <li>HEAVY: 4 vCPUs and 8 GiB of memory.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder computeClass(String computeClass) {
                this.computeClass = computeClass;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Hpa extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxConcurrentSessionsPerSandbox")
        private Integer maxConcurrentSessionsPerSandbox;

        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
        private Integer minSandboxCount;

        @com.aliyun.core.annotation.NameInMap("sessionTtlSeconds")
        private Integer sessionTtlSeconds;

        private Hpa(Builder builder) {
            this.enabled = builder.enabled;
            this.maxConcurrentSessionsPerSandbox = builder.maxConcurrentSessionsPerSandbox;
            this.maxSandboxCount = builder.maxSandboxCount;
            this.minSandboxCount = builder.minSandboxCount;
            this.sessionTtlSeconds = builder.sessionTtlSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hpa create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxConcurrentSessionsPerSandbox
         */
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        /**
         * @return maxSandboxCount
         */
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        /**
         * @return minSandboxCount
         */
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        /**
         * @return sessionTtlSeconds
         */
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer maxConcurrentSessionsPerSandbox; 
            private Integer maxSandboxCount; 
            private Integer minSandboxCount; 
            private Integer sessionTtlSeconds; 

            private Builder() {
            } 

            private Builder(Hpa model) {
                this.enabled = model.enabled;
                this.maxConcurrentSessionsPerSandbox = model.maxConcurrentSessionsPerSandbox;
                this.maxSandboxCount = model.maxSandboxCount;
                this.minSandboxCount = model.minSandboxCount;
                this.sessionTtlSeconds = model.sessionTtlSeconds;
            } 

            /**
             * <p>Specifies whether elastic scaling is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions configured for a single runtime instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
                this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
                return this;
            }

            /**
             * <p>The maximum number of runtime instances configured.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The minimum number of runtime instances configured.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            /**
             * <p>The maximum idle time configured for a session, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder sessionTtlSeconds(Integer sessionTtlSeconds) {
                this.sessionTtlSeconds = sessionTtlSeconds;
                return this;
            }

            public Hpa build() {
                return new Hpa(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class SessionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headerName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private SessionPolicy(Builder builder) {
            this.headerName = builder.headerName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionPolicy create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String headerName; 
            private String type; 

            private Builder() {
            } 

            private Builder(SessionPolicy model) {
                this.headerName = model.headerName;
                this.type = model.type;
            } 

            /**
             * <p>The name of the HTTP request header used by the session policy. This parameter applies to ISOLATED_HEADER_FIELD.</p>
             * 
             * <strong>example:</strong>
             * <p>X-Session-Id</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The session policy type. Valid values:</p>
             * <ul>
             * <li>AFFINITY: Session affinity.</li>
             * <li>ISOLATED_HEADER_FIELD: Associates sessions by using the request header specified by headerName.</li>
             * <li>ISOLATED_COOKIE: Not recommended.
             * Note: The compatibility value DISABLED in a request is returned as AFFINITY.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AFFINITY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SessionPolicy build() {
                return new SessionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compute")
        @com.aliyun.core.annotation.Validation(required = true)
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("hpa")
        private Hpa hpa;

        @com.aliyun.core.annotation.NameInMap("sessionPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
        private SessionPolicy sessionPolicy;

        private Runtime(Builder builder) {
            this.compute = builder.compute;
            this.hpa = builder.hpa;
            this.sessionPolicy = builder.sessionPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return hpa
         */
        public Hpa getHpa() {
            return this.hpa;
        }

        /**
         * @return sessionPolicy
         */
        public SessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

        public static final class Builder {
            private Compute compute; 
            private Hpa hpa; 
            private SessionPolicy sessionPolicy; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.compute = model.compute;
                this.hpa = model.hpa;
                this.sessionPolicy = model.sessionPolicy;
            } 

            /**
             * <p>The compute resource configuration for the agent runtime instance.</p>
             * <p>This parameter is required.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>The elastic policy configurations for the agent.</p>
             */
            public Builder hpa(Hpa hpa) {
                this.hpa = hpa;
                return this;
            }

            /**
             * <p>The session policy configurations for the agent.</p>
             * <p>This parameter is required.</p>
             */
            public Builder sessionPolicy(SessionPolicy sessionPolicy) {
                this.sessionPolicy = sessionPolicy;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agenticFsMounts")
        private java.util.List<AgenticFsMounts> agenticFsMounts;

        @com.aliyun.core.annotation.NameInMap("artifact")
        private Artifact artifact;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("healthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("latestExecutionError")
        private LatestExecutionError latestExecutionError;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestVersionStatus")
        private String latestVersionStatus;

        @com.aliyun.core.annotation.NameInMap("logging")
        private Logging logging;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("ossMounts")
        private java.util.List<OssMounts> ossMounts;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private java.util.List<Protocol> protocol;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("sandboxPhaseCounts")
        private java.util.Map<String, Long> sandboxPhaseCounts;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agenticFsMounts = builder.agenticFsMounts;
            this.artifact = builder.artifact;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.environment = builder.environment;
            this.healthCheck = builder.healthCheck;
            this.latestExecutionError = builder.latestExecutionError;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.latestVersionStatus = builder.latestVersionStatus;
            this.logging = builder.logging;
            this.name = builder.name;
            this.network = builder.network;
            this.ossMounts = builder.ossMounts;
            this.protocol = builder.protocol;
            this.regionId = builder.regionId;
            this.roleArn = builder.roleArn;
            this.runtime = builder.runtime;
            this.sandboxPhaseCounts = builder.sandboxPhaseCounts;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
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
         * @return agenticFsMounts
         */
        public java.util.List<AgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        /**
         * @return artifact
         */
        public Artifact getArtifact() {
            return this.artifact;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environment
         */
        public Environment getEnvironment() {
            return this.environment;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return latestExecutionError
         */
        public LatestExecutionError getLatestExecutionError() {
            return this.latestExecutionError;
        }

        /**
         * @return latestSpecVersion
         */
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        /**
         * @return latestVersionStatus
         */
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        /**
         * @return logging
         */
        public Logging getLogging() {
            return this.logging;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return ossMounts
         */
        public java.util.List<OssMounts> getOssMounts() {
            return this.ossMounts;
        }

        /**
         * @return protocol
         */
        public java.util.List<Protocol> getProtocol() {
            return this.protocol;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        /**
         * @return sandboxPhaseCounts
         */
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private java.util.List<AgenticFsMounts> agenticFsMounts; 
            private Artifact artifact; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
            private Environment environment; 
            private HealthCheck healthCheck; 
            private LatestExecutionError latestExecutionError; 
            private Long latestSpecVersion; 
            private String latestVersionStatus; 
            private Logging logging; 
            private String name; 
            private Network network; 
            private java.util.List<OssMounts> ossMounts; 
            private java.util.List<Protocol> protocol; 
            private String regionId; 
            private String roleArn; 
            private Runtime runtime; 
            private java.util.Map<String, Long> sandboxPhaseCounts; 
            private String status; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agenticFsMounts = model.agenticFsMounts;
                this.artifact = model.artifact;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
                this.environment = model.environment;
                this.healthCheck = model.healthCheck;
                this.latestExecutionError = model.latestExecutionError;
                this.latestSpecVersion = model.latestSpecVersion;
                this.latestVersionStatus = model.latestVersionStatus;
                this.logging = model.logging;
                this.name = model.name;
                this.network = model.network;
                this.ossMounts = model.ossMounts;
                this.protocol = model.protocol;
                this.regionId = model.regionId;
                this.roleArn = model.roleArn;
                this.runtime = model.runtime;
                this.sandboxPhaseCounts = model.sandboxPhaseCounts;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The unique identifier of the custom agent. You can obtain this ID from the response of the CreateCustomAgent or ListCustomAgents operation.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-550e8400e29b41d4a716446655440000</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The latest submitted list of additional AgenticFS mounts.</p>
             */
            public Builder agenticFsMounts(java.util.List<AgenticFsMounts> agenticFsMounts) {
                this.agenticFsMounts = agenticFsMounts;
                return this;
            }

            /**
             * <p>The latest submitted deployment artifact configuration, including the service listening port and the ACR container image. To check whether the configuration has taken effect, refer to the latestVersionStatus field.</p>
             */
            public Builder artifact(Artifact artifact) {
                this.artifact = artifact;
                return this;
            }

            /**
             * <p>The creation method of the agent. The value is CUSTOM for custom agents.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The creation time of the agent. The time is in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T06:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform. The value is MANAGED for custom agents.</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The description of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom agent that provides conversation services</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment variable configuration for the agent process.</p>
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The HTTP health check configuration of the agent. This field is empty if no health check is configured.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The waiting or execution error of the latest configuration version. This field is returned only when the version is waiting for a retry or fails to execute.</p>
             */
            public Builder latestExecutionError(LatestExecutionError latestExecutionError) {
                this.latestExecutionError = latestExecutionError;
                return this;
            }

            /**
             * <p>The latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * <p>The execution status corresponding to latestSpecVersion. Valid values:</p>
             * <ul>
             * <li>pending: Waiting for execution.</li>
             * <li>processing: Executing.</li>
             * <li>waiting_retry: Waiting for a retry.</li>
             * <li>succeeded: Execution succeeded.</li>
             * <li>failed: Execution failed.</li>
             * <li>superseded: Superseded by a subsequent version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>succeeded</p>
             */
            public Builder latestVersionStatus(String latestVersionStatus) {
                this.latestVersionStatus = latestVersionStatus;
                return this;
            }

            /**
             * <p>The latest submitted log delivery configuration.</p>
             */
            public Builder logging(Logging logging) {
                this.logging = logging;
                return this;
            }

            /**
             * <p>The name of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>my-custom-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network access configuration of the agent. The actual access scope is also restricted by the network configuration of the workspace.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The latest submitted list of OSS directory mounts.</p>
             */
            public Builder ossMounts(java.util.List<OssMounts> ossMounts) {
                this.ossMounts = ossMounts;
                return this;
            }

            /**
             * <p>The list of invocation protocol configurations for the agent.</p>
             */
            public Builder protocol(java.util.List<Protocol> protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The region ID of the workspace to which the agent belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used by the agent to access user cloud resources.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The runtime configurations of the latest commit, including compute specifications, session policy, and elastic policy.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The instance counts grouped by runtime instance phase. Keys include PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), and FAILED (failed). Only phases that actually occur are returned. Missing keys are treated as 0.</p>
             */
            public Builder sandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
                this.sandboxPhaseCounts = sandboxPhaseCounts;
                return this;
            }

            /**
             * <p>The overall status of the agent. Valid values:</p>
             * <ul>
             * <li>Creating: The agent is being created.</li>
             * <li>Running: The agent is running.</li>
             * <li>Failed: The agent failed.</li>
             * <li>Updating: The agent is being updated.</li>
             * <li>Deleting: The agent is being deleted.</li>
             * <li>Deleted: The agent is deleted.
             * To query the execution progress of the latest configuration, check latestVersionStatus.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the agent was last updated. The time is in ISO 8601 format. A trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T06:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the custom agent belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-a1b2c3d4e5f6</p>
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
