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
 * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomAgentResponseBody</p>
 */
public class GetCustomAgentResponseBody extends TeaModel {
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

    private GetCustomAgentResponseBody(Builder builder) {
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

    public static GetCustomAgentResponseBody create() {
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

        private Builder(GetCustomAgentResponseBody model) {
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

        public GetCustomAgentResponseBody build() {
            return new GetCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * mountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * readOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * server.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * code.
             */
            public Builder code(Code code) {
                this.code = code;
                return this;
            }

            /**
             * container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * variables.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * healthyThreshold.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * intervalSeconds.
             */
            public Builder intervalSeconds(Integer intervalSeconds) {
                this.intervalSeconds = intervalSeconds;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * timeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * unhealthyThreshold.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * retryable.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * project.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * sls.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * enabled.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * enabled.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * accessInternet.
             */
            public Builder accessInternet(AccessInternet accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * accessVpc.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * mountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * readOnly.
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * headers.
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * paths.
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * <p>This parameter is required.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>正整数，必须与 sessionTtlSeconds 同时配置。</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
                this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
                return this;
            }

            /**
             * <p>开启时为正整数，关闭时为非负整数；不得小于 minSandboxCount。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>非负整数。开启弹性时必填；关闭时如提供上下限，必须成对提供。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            /**
             * <p>正整数，必须与 maxConcurrentSessionsPerSandbox 同时配置。</p>
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * headerName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * <p>This parameter is required.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>Agent 当前 spec 版本的 HPA 配置，与 Managed Agent 一致。开启时必须提供最小和最大 Sandbox 数；并发会话上限与会话空闲超时必须一起配置。</p>
             */
            public Builder hpa(Hpa hpa) {
                this.hpa = hpa;
                return this;
            }

            /**
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
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
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
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * agenticFsMounts.
             */
            public Builder agenticFsMounts(java.util.List<AgenticFsMounts> agenticFsMounts) {
                this.agenticFsMounts = agenticFsMounts;
                return this;
            }

            /**
             * artifact.
             */
            public Builder artifact(Artifact artifact) {
                this.artifact = artifact;
                return this;
            }

            /**
             * createMode.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * deployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
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
             * environment.
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * healthCheck.
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>可选。仅解释同一响应 latestSpecVersion/latestVersionStatus 的等待或失败；正常待处理、执行中或成功时省略。消息由 Console 白名单映射，不返回原始运行时诊断、Checkpoint 或凭证。</p>
             */
            public Builder latestExecutionError(LatestExecutionError latestExecutionError) {
                this.latestExecutionError = latestExecutionError;
                return this;
            }

            /**
             * latestSpecVersion.
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * latestVersionStatus.
             */
            public Builder latestVersionStatus(String latestVersionStatus) {
                this.latestVersionStatus = latestVersionStatus;
                return this;
            }

            /**
             * logging.
             */
            public Builder logging(Logging logging) {
                this.logging = logging;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/agui</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * ossMounts.
             */
            public Builder ossMounts(java.util.List<OssMounts> ossMounts) {
                this.ossMounts = ossMounts;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(java.util.List<Protocol> protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * roleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * runtime.
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * sandboxPhaseCounts.
             */
            public Builder sandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
                this.sandboxPhaseCounts = sandboxPhaseCounts;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
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
