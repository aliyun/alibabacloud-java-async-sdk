// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationConfigResponseBody</p>
 */
public class DescribeApplicationConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationConfigResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Client error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidApplication.NotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information about the call result.</p>
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
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the application configuration information was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application configuration information was obtained.</li>
         * <li><strong>false</strong>: The application configuration information failed to be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID, which is used to accurately query call information.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a0b2215622246421415014e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationConfigResponseBody build() {
            return new DescribeApplicationConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class ConfigMapMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        @com.aliyun.core.annotation.NameInMap("ConfigMapName")
        private String configMapName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private ConfigMapMountDesc(Builder builder) {
            this.configMapId = builder.configMapId;
            this.configMapName = builder.configMapName;
            this.key = builder.key;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMapMountDesc create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        /**
         * @return configMapName
         */
        public String getConfigMapName() {
            return this.configMapName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private Long configMapId; 
            private String configMapName; 
            private String key; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(ConfigMapMountDesc model) {
                this.configMapId = model.configMapId;
                this.configMapName = model.configMapName;
                this.key = model.key;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The ConfigMap ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The ConfigMap name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * <p>The ConfigMap key-value pair.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The container mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public ConfigMapMountDesc build() {
                return new ConfigMapMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class EmptyDirDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EmptyDirDesc(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyDirDesc create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 

            private Builder() {
            } 

            private Builder(EmptyDirDesc model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
            } 

            /**
             * <p>The mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/tomcat/webapps</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The ephemeral storage name.</p>
             * 
             * <strong>example:</strong>
             * <p>workdir</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EmptyDirDesc build() {
                return new EmptyDirDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class InitContainersConfigConfigMapMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        @com.aliyun.core.annotation.NameInMap("ConfigMapName")
        private String configMapName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private InitContainersConfigConfigMapMountDesc(Builder builder) {
            this.configMapId = builder.configMapId;
            this.configMapName = builder.configMapName;
            this.key = builder.key;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersConfigConfigMapMountDesc create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        /**
         * @return configMapName
         */
        public String getConfigMapName() {
            return this.configMapName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private Long configMapId; 
            private String configMapName; 
            private String key; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(InitContainersConfigConfigMapMountDesc model) {
                this.configMapId = model.configMapId;
                this.configMapName = model.configMapName;
                this.key = model.key;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The ConfigMap ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The ConfigMap name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * <p>The ConfigMap key-value pair.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The container mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public InitContainersConfigConfigMapMountDesc build() {
                return new InitContainersConfigConfigMapMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class InitContainersConfigEmptyDirDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private InitContainersConfigEmptyDirDesc(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersConfigEmptyDirDesc create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 

            private Builder() {
            } 

            private Builder(InitContainersConfigEmptyDirDesc model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
            } 

            /**
             * <p>The mount path of the data volume in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/tomcat/webapps</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The ephemeral storage name.</p>
             * 
             * <strong>example:</strong>
             * <p>workdir</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InitContainersConfigEmptyDirDesc build() {
                return new InitContainersConfigEmptyDirDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class SecretMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private Long secretId;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        private SecretMountDesc(Builder builder) {
            this.key = builder.key;
            this.mountPath = builder.mountPath;
            this.secretId = builder.secretId;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretMountDesc create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return secretId
         */
        public Long getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private String key; 
            private String mountPath; 
            private Long secretId; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(SecretMountDesc model) {
                this.key = model.key;
                this.mountPath = model.mountPath;
                this.secretId = model.secretId;
                this.secretName = model.secretName;
            } 

            /**
             * <p>The key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The Secret instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder secretId(Long secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The Secret instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-auth</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public SecretMountDesc build() {
                return new SecretMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class InitContainersConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List<InitContainersConfigConfigMapMountDesc> configMapMountDesc;

        @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
        private java.util.List<InitContainersConfigEmptyDirDesc> emptyDirDesc;

        @com.aliyun.core.annotation.NameInMap("Envs")
        private String envs;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
        private java.util.List<SecretMountDesc> secretMountDesc;

        private InitContainersConfig(Builder builder) {
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.emptyDirDesc = builder.emptyDirDesc;
            this.envs = builder.envs;
            this.imageUrl = builder.imageUrl;
            this.name = builder.name;
            this.secretMountDesc = builder.secretMountDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersConfig create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return commandArgs
         */
        public String getCommandArgs() {
            return this.commandArgs;
        }

        /**
         * @return configMapMountDesc
         */
        public java.util.List<InitContainersConfigConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        /**
         * @return emptyDirDesc
         */
        public java.util.List<InitContainersConfigEmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        /**
         * @return envs
         */
        public String getEnvs() {
            return this.envs;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secretMountDesc
         */
        public java.util.List<SecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
        }

        public static final class Builder {
            private String command; 
            private String commandArgs; 
            private java.util.List<InitContainersConfigConfigMapMountDesc> configMapMountDesc; 
            private java.util.List<InitContainersConfigEmptyDirDesc> emptyDirDesc; 
            private String envs; 
            private String imageUrl; 
            private String name; 
            private java.util.List<SecretMountDesc> secretMountDesc; 

            private Builder() {
            } 

            private Builder(InitContainersConfig model) {
                this.command = model.command;
                this.commandArgs = model.commandArgs;
                this.configMapMountDesc = model.configMapMountDesc;
                this.emptyDirDesc = model.emptyDirDesc;
                this.envs = model.envs;
                this.imageUrl = model.imageUrl;
                this.name = model.name;
                this.secretMountDesc = model.secretMountDesc;
            } 

            /**
             * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
             * <pre><code>command:
             *       - echo
             *       - abc
             *       - &gt;
             *       - file0
             * </code></pre>
             * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/sh</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The image startup command parameters. The parameters required by the <strong>Command</strong> startup command. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;a&quot;,&quot;b&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The ConfigMap information.</p>
             */
            public Builder configMapMountDesc(java.util.List<InitContainersConfigConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * <p>The shared ephemeral storage.</p>
             */
            public Builder emptyDirDesc(java.util.List<InitContainersConfigEmptyDirDesc> emptyDirDesc) {
                this.emptyDirDesc = emptyDirDesc;
                return this;
            }

            /**
             * <p>The container environment variable parameters. You can customize the parameters or reference configuration items. To reference configuration items, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
             * <ul>
             * <li>Custom configuration<ul>
             * <li><strong>name</strong>: The environment variable name.</li>
             * <li><strong>value</strong>: The environment variable value. The priority is higher than valueFrom.</li>
             * </ul>
             * </li>
             * <li>Reference configuration items (valueFrom)<ul>
             * <li><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;Configuration item name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: The environment variable reference. Set the value to <code>configMapRef</code>.</li>
             * <li><strong>configMapId</strong>: The configuration item ID.</li>
             * <li><strong>key</strong>: The key. If all key-value pairs are referenced, do not set this field.</li>
             * </ul>
             * </li>
             * <li>Reference Secrets (valueFrom)<ul>
             * <li><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-secret-all-&lt;Secret name&gt;</code>, for example, <code>sae-sys-secret-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: The environment variable reference. Set the value to <code>secretRef</code>.</li>
             * <li><strong>secretId</strong>: The Secret ID.</li>
             * <li><strong>key</strong>: The key. If all key-value pairs are referenced, do not set this field.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * <p>The image address used by the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-shenzhen.aliyuncs.com/sae-serverless-demo/sae-demo:microservice-java-provider-v1.0</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The init container name.</p>
             * 
             * <strong>example:</strong>
             * <p>init-container</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Secret mount description.</p>
             */
            public Builder secretMountDesc(java.util.List<SecretMountDesc> secretMountDesc) {
                this.secretMountDesc = secretMountDesc;
                return this;
            }

            public InitContainersConfig build() {
                return new InitContainersConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class MountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("NasPath")
        private String nasPath;

        private MountDesc(Builder builder) {
            this.mountPath = builder.mountPath;
            this.nasPath = builder.nasPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountDesc create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return nasPath
         */
        public String getNasPath() {
            return this.nasPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String nasPath; 

            private Builder() {
            } 

            private Builder(MountDesc model) {
                this.mountPath = model.mountPath;
                this.nasPath = model.nasPath;
            } 

            /**
             * <p>The container mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The relative NAS file directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder nasPath(String nasPath) {
                this.nasPath = nasPath;
                return this;
            }

            public MountDesc build() {
                return new MountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class OssMountDescs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("bucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private OssMountDescs(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
            this.mountPath = builder.mountPath;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMountDescs create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String bucketName; 
            private String bucketPath; 
            private String mountPath; 
            private Boolean readOnly; 

            private Builder() {
            } 

            private Builder(OssMountDescs model) {
                this.bucketName = model.bucketName;
                this.bucketPath = model.bucketPath;
                this.mountPath = model.mountPath;
                this.readOnly = model.readOnly;
            } 

            /**
             * <p>The bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The directory or OSS object that you created in OSS. If the OSS mount directory does not exist, an exception is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>data/user.data</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The container path in SAE. If the path already exists, it is overwritten. If the path does not exist, it is created.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/data/user.data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>Specifies whether the container path has read-only permissions for the mounted directory resources. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Read-only permissions.</li>
             * <li><strong>false</strong>: Read and write permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public OssMountDescs build() {
                return new OssMountDescs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class RaspConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRasp")
        private Boolean enableRasp;

        @com.aliyun.core.annotation.NameInMap("RaspAppKey")
        private String raspAppKey;

        @com.aliyun.core.annotation.NameInMap("RaspAppName")
        private String raspAppName;

        private RaspConfig(Builder builder) {
            this.enableRasp = builder.enableRasp;
            this.raspAppKey = builder.raspAppKey;
            this.raspAppName = builder.raspAppName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RaspConfig create() {
            return builder().build();
        }

        /**
         * @return enableRasp
         */
        public Boolean getEnableRasp() {
            return this.enableRasp;
        }

        /**
         * @return raspAppKey
         */
        public String getRaspAppKey() {
            return this.raspAppKey;
        }

        /**
         * @return raspAppName
         */
        public String getRaspAppName() {
            return this.raspAppName;
        }

        public static final class Builder {
            private Boolean enableRasp; 
            private String raspAppKey; 
            private String raspAppName; 

            private Builder() {
            } 

            private Builder(RaspConfig model) {
                this.enableRasp = model.enableRasp;
                this.raspAppKey = model.raspAppKey;
                this.raspAppName = model.raspAppName;
            } 

            /**
             * <p>Specifies whether to enable RASP.</p>
             */
            public Builder enableRasp(Boolean enableRasp) {
                this.enableRasp = enableRasp;
                return this;
            }

            /**
             * <p>The RASP application key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder raspAppKey(String raspAppKey) {
                this.raspAppKey = raspAppKey;
                return this;
            }

            /**
             * <p>The RASP application name.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-test</p>
             */
            public Builder raspAppName(String raspAppName) {
                this.raspAppName = raspAppName;
                return this;
            }

            public RaspConfig build() {
                return new RaspConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class DataSecretMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private Long secretId;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        private DataSecretMountDesc(Builder builder) {
            this.key = builder.key;
            this.mountPath = builder.mountPath;
            this.secretId = builder.secretId;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSecretMountDesc create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return secretId
         */
        public Long getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private String key; 
            private String mountPath; 
            private Long secretId; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(DataSecretMountDesc model) {
                this.key = model.key;
                this.mountPath = model.mountPath;
                this.secretId = model.secretId;
                this.secretName = model.secretName;
            } 

            /**
             * <p>The key whose data value is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>task-center</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/www/runtime/logs</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The instance ID of the queried Secret.</p>
             * 
             * <strong>example:</strong>
             * <p>520</p>
             */
            public Builder secretId(Long secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The Secret instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dummy-name-opaque-894</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public DataSecretMountDesc build() {
                return new DataSecretMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class SidecarContainersConfigConfigMapMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        @com.aliyun.core.annotation.NameInMap("ConfigMapName")
        private String configMapName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        private SidecarContainersConfigConfigMapMountDesc(Builder builder) {
            this.configMapId = builder.configMapId;
            this.configMapName = builder.configMapName;
            this.key = builder.key;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarContainersConfigConfigMapMountDesc create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        /**
         * @return configMapName
         */
        public String getConfigMapName() {
            return this.configMapName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private Long configMapId; 
            private String configMapName; 
            private String key; 
            private String mountPath; 

            private Builder() {
            } 

            private Builder(SidecarContainersConfigConfigMapMountDesc model) {
                this.configMapId = model.configMapId;
                this.configMapName = model.configMapName;
                this.key = model.key;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The ConfigMap instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7361</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The ConfigMap name.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigMap-test</p>
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * <p>The ConfigMap key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The container mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/test</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public SidecarContainersConfigConfigMapMountDesc build() {
                return new SidecarContainersConfigConfigMapMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class SidecarContainersConfigEmptyDirDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SidecarContainersConfigEmptyDirDesc(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarContainersConfigEmptyDirDesc create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 

            private Builder() {
            } 

            private Builder(SidecarContainersConfigEmptyDirDesc model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
            } 

            /**
             * <p>The mount path of the data volume in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/cache</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The ephemeral storage name.</p>
             * 
             * <strong>example:</strong>
             * <p>sidecar-container</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SidecarContainersConfigEmptyDirDesc build() {
                return new SidecarContainersConfigEmptyDirDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class SidecarContainersConfigSecretMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private Long secretId;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        private SidecarContainersConfigSecretMountDesc(Builder builder) {
            this.key = builder.key;
            this.mountPath = builder.mountPath;
            this.secretId = builder.secretId;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarContainersConfigSecretMountDesc create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return secretId
         */
        public Long getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private String key; 
            private String mountPath; 
            private Long secretId; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(SidecarContainersConfigSecretMountDesc model) {
                this.key = model.key;
                this.mountPath = model.mountPath;
                this.secretId = model.secretId;
                this.secretName = model.secretName;
            } 

            /**
             * <p>The key whose data value is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The Secret instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder secretId(Long secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The Secret instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-auth</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public SidecarContainersConfigSecretMountDesc build() {
                return new SidecarContainersConfigSecretMountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class SidecarContainersConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List<SidecarContainersConfigConfigMapMountDesc> configMapMountDesc;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
        private java.util.List<SidecarContainersConfigEmptyDirDesc> emptyDirDesc;

        @com.aliyun.core.annotation.NameInMap("Envs")
        private String envs;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("Readiness")
        private String readiness;

        @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
        private java.util.List<SidecarContainersConfigSecretMountDesc> secretMountDesc;

        @com.aliyun.core.annotation.NameInMap("SlsConfigs")
        private String slsConfigs;

        private SidecarContainersConfig(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.cpu = builder.cpu;
            this.emptyDirDesc = builder.emptyDirDesc;
            this.envs = builder.envs;
            this.imageUrl = builder.imageUrl;
            this.liveness = builder.liveness;
            this.memory = builder.memory;
            this.name = builder.name;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.readiness = builder.readiness;
            this.secretMountDesc = builder.secretMountDesc;
            this.slsConfigs = builder.slsConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SidecarContainersConfig create() {
            return builder().build();
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return commandArgs
         */
        public String getCommandArgs() {
            return this.commandArgs;
        }

        /**
         * @return configMapMountDesc
         */
        public java.util.List<SidecarContainersConfigConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return emptyDirDesc
         */
        public java.util.List<SidecarContainersConfigEmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        /**
         * @return envs
         */
        public String getEnvs() {
            return this.envs;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return liveness
         */
        public String getLiveness() {
            return this.liveness;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return postStart
         */
        public String getPostStart() {
            return this.postStart;
        }

        /**
         * @return preStop
         */
        public String getPreStop() {
            return this.preStop;
        }

        /**
         * @return readiness
         */
        public String getReadiness() {
            return this.readiness;
        }

        /**
         * @return secretMountDesc
         */
        public java.util.List<SidecarContainersConfigSecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
        }

        /**
         * @return slsConfigs
         */
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        public static final class Builder {
            private String acrInstanceId; 
            private String command; 
            private String commandArgs; 
            private java.util.List<SidecarContainersConfigConfigMapMountDesc> configMapMountDesc; 
            private Integer cpu; 
            private java.util.List<SidecarContainersConfigEmptyDirDesc> emptyDirDesc; 
            private String envs; 
            private String imageUrl; 
            private String liveness; 
            private Integer memory; 
            private String name; 
            private String postStart; 
            private String preStop; 
            private String readiness; 
            private java.util.List<SidecarContainersConfigSecretMountDesc> secretMountDesc; 
            private String slsConfigs; 

            private Builder() {
            } 

            private Builder(SidecarContainersConfig model) {
                this.acrInstanceId = model.acrInstanceId;
                this.command = model.command;
                this.commandArgs = model.commandArgs;
                this.configMapMountDesc = model.configMapMountDesc;
                this.cpu = model.cpu;
                this.emptyDirDesc = model.emptyDirDesc;
                this.envs = model.envs;
                this.imageUrl = model.imageUrl;
                this.liveness = model.liveness;
                this.memory = model.memory;
                this.name = model.name;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.readiness = model.readiness;
                this.secretMountDesc = model.secretMountDesc;
                this.slsConfigs = model.slsConfigs;
            } 

            /**
             * <p>The instance ID of the Container Registry Enterprise instance. This parameter is required when <strong>ImageUrl</strong> is set to a Container Registry Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-fhzlneorxala66ip</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
             * <pre><code>command:
             *       - echo
             *       - abc
             *       - &gt;
             *       - file0
             * </code></pre>
             * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/sh</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The image startup command parameters. The parameters required by the <strong>Command</strong> startup command. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;-c\&quot;,\&quot;echo \\\&quot;test\\\&quot; &gt; /home/nas/test.log &amp;&amp; sleep 10000000s\&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The ConfigMap mount description. Uses the ConfigMap created on the namespace configuration item page to inject configuration information into the container. The metric description is as follows:</p>
             * <ul>
             * <li><strong>configMapId</strong>: The ConfigMap instance ID. You can invoke the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID.</li>
             * <li><strong>key</strong>: The key value.<blockquote>
             * <p>You can pass the <code>sae-sys-configmap-all</code> parameter to mount all keys.</p>
             * </blockquote>
             * </li>
             * <li><strong>mountPath</strong>: The mount path.</li>
             * <li><strong>ConfigMapName</strong>: The ConfigMap name.</li>
             * </ul>
             */
            public Builder configMapMountDesc(java.util.List<SidecarContainersConfigConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * <p>The maximum CPU resources that the sidecar container can use from the main container.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The shared ephemeral storage. Sets the ephemeral storage directory and mounts it to the main container and the sidecar container.</p>
             */
            public Builder emptyDirDesc(java.util.List<SidecarContainersConfigEmptyDirDesc> emptyDirDesc) {
                this.emptyDirDesc = emptyDirDesc;
                return this;
            }

            /**
             * <p>The container environment variable parameters. You can define custom variables or reference configuration items. To reference configuration items, you must first create a ConfigMap instance. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
             * <ul>
             * <li>Custom configuration<ul>
             * <li><strong>name</strong>: The name of the environment variable.</li>
             * <li><strong>value</strong>: The value of the environment variable. This parameter has a higher priority than valueFrom.</li>
             * </ul>
             * </li>
             * <li>Reference configuration items (valueFrom)<ul>
             * <li><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>configMapRef</code>.<ul>
             * <li><strong>configMapId</strong>: The ID of the ConfigMap.</li>
             * <li><strong>key</strong>: The key. If you reference all key-value pairs, do not set this field.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;k1\&quot;,\&quot;value\&quot;:\&quot;c8e3a815-e5d3-4adf-abb3-98b106a607c4\&quot;}]</p>
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * <p>The image address.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-beijing.aliyuncs.com/sae-dev-test/nginx:stable</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The container health check.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>The upper limit of memory resources that the sidecar container can use from the main container.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The container name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The script to execute after the container starts.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script to execute before the container stops.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The application startup status check.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * <p>The Secret mount description.</p>
             */
            public Builder secretMountDesc(java.util.List<SidecarContainersConfigSecretMountDesc> secretMountDesc) {
                this.secretMountDesc = secretMountDesc;
                return this;
            }

            /**
             * <p>The configuration for collecting sidecar logs to Simple Log Service (SLS). The structure is aligned with SlsConfigs.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            public SidecarContainersConfig build() {
                return new SidecarContainersConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcrAssumeRoleArn")
        private String acrAssumeRoleArn;

        @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("AlbIngressReadinessGate")
        private String albIngressReadinessGate;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppSource")
        private String appSource;

        @com.aliyun.core.annotation.NameInMap("AssociateEip")
        private Boolean associateEip;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
        private Integer batchWaitTime;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CmsServiceId")
        private String cmsServiceId;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List<ConfigMapMountDesc> configMapMountDesc;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CustomHostAlias")
        private String customHostAlias;

        @com.aliyun.core.annotation.NameInMap("CustomImageNetworkType")
        private String customImageNetworkType;

        @com.aliyun.core.annotation.NameInMap("DeploymentName")
        private String deploymentName;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("Dotnet")
        private String dotnet;

        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
        private java.util.List<EmptyDirDesc> emptyDirDesc;

        @com.aliyun.core.annotation.NameInMap("EnableAhas")
        private String enableAhas;

        @com.aliyun.core.annotation.NameInMap("EnableCpuBurst")
        private String enableCpuBurst;

        @com.aliyun.core.annotation.NameInMap("EnableGreyTagRoute")
        private Boolean enableGreyTagRoute;

        @com.aliyun.core.annotation.NameInMap("EnableIdle")
        private Boolean enableIdle;

        @com.aliyun.core.annotation.NameInMap("EnableNamespaceAgentVersion")
        private Boolean enableNamespaceAgentVersion;

        @com.aliyun.core.annotation.NameInMap("EnableNewArms")
        private Boolean enableNewArms;

        @com.aliyun.core.annotation.NameInMap("EnablePrometheus")
        private Boolean enablePrometheus;

        @com.aliyun.core.annotation.NameInMap("Envs")
        private String envs;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private String gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuType")
        private String gpuType;

        @com.aliyun.core.annotation.NameInMap("HeadlessPvtzDiscovery")
        private String headlessPvtzDiscovery;

        @com.aliyun.core.annotation.NameInMap("Html")
        private String html;

        @com.aliyun.core.annotation.NameInMap("IdleHour")
        private String idleHour;

        @com.aliyun.core.annotation.NameInMap("ImagePullSecrets")
        private String imagePullSecrets;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("InitContainersConfig")
        private java.util.List<InitContainersConfig> initContainersConfig;

        @com.aliyun.core.annotation.NameInMap("IsStateful")
        private Boolean isStateful;

        @com.aliyun.core.annotation.NameInMap("JarStartArgs")
        private String jarStartArgs;

        @com.aliyun.core.annotation.NameInMap("JarStartOptions")
        private String jarStartOptions;

        @com.aliyun.core.annotation.NameInMap("Jdk")
        private String jdk;

        @com.aliyun.core.annotation.NameInMap("KafkaConfigs")
        private String kafkaConfigs;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("LokiConfigs")
        private String lokiConfigs;

        @com.aliyun.core.annotation.NameInMap("MaxSurgeInstanceRatio")
        private Integer maxSurgeInstanceRatio;

        @com.aliyun.core.annotation.NameInMap("MaxSurgeInstances")
        private Integer maxSurgeInstances;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("MicroRegistration")
        private String microRegistration;

        @com.aliyun.core.annotation.NameInMap("MicroRegistrationConfig")
        private String microRegistrationConfig;

        @com.aliyun.core.annotation.NameInMap("MicroserviceEngineConfig")
        private String microserviceEngineConfig;

        @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
        private Integer minReadyInstanceRatio;

        @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
        private Integer minReadyInstances;

        @com.aliyun.core.annotation.NameInMap("MountDesc")
        private java.util.List<MountDesc> mountDesc;

        @com.aliyun.core.annotation.NameInMap("MountHost")
        private String mountHost;

        @com.aliyun.core.annotation.NameInMap("MseApplicationId")
        private String mseApplicationId;

        @com.aliyun.core.annotation.NameInMap("MseApplicationName")
        private String mseApplicationName;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NasConfigs")
        private String nasConfigs;

        @com.aliyun.core.annotation.NameInMap("NasId")
        private String nasId;

        @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
        private String newSaeVersion;

        @com.aliyun.core.annotation.NameInMap("OidcRoleName")
        private String oidcRoleName;

        @com.aliyun.core.annotation.NameInMap("OssAkId")
        private String ossAkId;

        @com.aliyun.core.annotation.NameInMap("OssAkSecret")
        private String ossAkSecret;

        @com.aliyun.core.annotation.NameInMap("OssMountDescs")
        private java.util.List<OssMountDescs> ossMountDescs;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("Php")
        private String php;

        @com.aliyun.core.annotation.NameInMap("PhpArmsConfigLocation")
        private String phpArmsConfigLocation;

        @com.aliyun.core.annotation.NameInMap("PhpConfig")
        private String phpConfig;

        @com.aliyun.core.annotation.NameInMap("PhpConfigLocation")
        private String phpConfigLocation;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("PvtzDiscovery")
        private String pvtzDiscovery;

        @com.aliyun.core.annotation.NameInMap("Python")
        private String python;

        @com.aliyun.core.annotation.NameInMap("PythonModules")
        private String pythonModules;

        @com.aliyun.core.annotation.NameInMap("RaspConfig")
        private java.util.List<RaspConfig> raspConfig;

        @com.aliyun.core.annotation.NameInMap("Readiness")
        private String readiness;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
        private java.util.List<DataSecretMountDesc> secretMountDesc;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceTags")
        private java.util.Map<String, String> serviceTags;

        @com.aliyun.core.annotation.NameInMap("SidecarContainersConfig")
        private java.util.List<SidecarContainersConfig> sidecarContainersConfig;

        @com.aliyun.core.annotation.NameInMap("SlsConfigs")
        private String slsConfigs;

        @com.aliyun.core.annotation.NameInMap("SlsLogEnvTags")
        private String slsLogEnvTags;

        @com.aliyun.core.annotation.NameInMap("StartupProbe")
        private String startupProbe;

        @com.aliyun.core.annotation.NameInMap("SwimlanePvtzDiscovery")
        private String swimlanePvtzDiscovery;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TomcatConfig")
        private String tomcatConfig;

        @com.aliyun.core.annotation.NameInMap("UpdateStrategy")
        private String updateStrategy;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WarStartOptions")
        private String warStartOptions;

        @com.aliyun.core.annotation.NameInMap("WebContainer")
        private String webContainer;

        private Data(Builder builder) {
            this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
            this.acrInstanceId = builder.acrInstanceId;
            this.agentVersion = builder.agentVersion;
            this.albIngressReadinessGate = builder.albIngressReadinessGate;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appSource = builder.appSource;
            this.associateEip = builder.associateEip;
            this.baseAppId = builder.baseAppId;
            this.batchWaitTime = builder.batchWaitTime;
            this.clusterId = builder.clusterId;
            this.cmsServiceId = builder.cmsServiceId;
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.cpu = builder.cpu;
            this.customHostAlias = builder.customHostAlias;
            this.customImageNetworkType = builder.customImageNetworkType;
            this.deploymentName = builder.deploymentName;
            this.diskSize = builder.diskSize;
            this.dotnet = builder.dotnet;
            this.edasContainerVersion = builder.edasContainerVersion;
            this.emptyDirDesc = builder.emptyDirDesc;
            this.enableAhas = builder.enableAhas;
            this.enableCpuBurst = builder.enableCpuBurst;
            this.enableGreyTagRoute = builder.enableGreyTagRoute;
            this.enableIdle = builder.enableIdle;
            this.enableNamespaceAgentVersion = builder.enableNamespaceAgentVersion;
            this.enableNewArms = builder.enableNewArms;
            this.enablePrometheus = builder.enablePrometheus;
            this.envs = builder.envs;
            this.gpuCount = builder.gpuCount;
            this.gpuType = builder.gpuType;
            this.headlessPvtzDiscovery = builder.headlessPvtzDiscovery;
            this.html = builder.html;
            this.idleHour = builder.idleHour;
            this.imagePullSecrets = builder.imagePullSecrets;
            this.imageUrl = builder.imageUrl;
            this.initContainersConfig = builder.initContainersConfig;
            this.isStateful = builder.isStateful;
            this.jarStartArgs = builder.jarStartArgs;
            this.jarStartOptions = builder.jarStartOptions;
            this.jdk = builder.jdk;
            this.kafkaConfigs = builder.kafkaConfigs;
            this.labels = builder.labels;
            this.liveness = builder.liveness;
            this.lokiConfigs = builder.lokiConfigs;
            this.maxSurgeInstanceRatio = builder.maxSurgeInstanceRatio;
            this.maxSurgeInstances = builder.maxSurgeInstances;
            this.memory = builder.memory;
            this.microRegistration = builder.microRegistration;
            this.microRegistrationConfig = builder.microRegistrationConfig;
            this.microserviceEngineConfig = builder.microserviceEngineConfig;
            this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
            this.minReadyInstances = builder.minReadyInstances;
            this.mountDesc = builder.mountDesc;
            this.mountHost = builder.mountHost;
            this.mseApplicationId = builder.mseApplicationId;
            this.mseApplicationName = builder.mseApplicationName;
            this.namespaceId = builder.namespaceId;
            this.nasConfigs = builder.nasConfigs;
            this.nasId = builder.nasId;
            this.newSaeVersion = builder.newSaeVersion;
            this.oidcRoleName = builder.oidcRoleName;
            this.ossAkId = builder.ossAkId;
            this.ossAkSecret = builder.ossAkSecret;
            this.ossMountDescs = builder.ossMountDescs;
            this.packageType = builder.packageType;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
            this.php = builder.php;
            this.phpArmsConfigLocation = builder.phpArmsConfigLocation;
            this.phpConfig = builder.phpConfig;
            this.phpConfigLocation = builder.phpConfigLocation;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.programmingLanguage = builder.programmingLanguage;
            this.pvtzDiscovery = builder.pvtzDiscovery;
            this.python = builder.python;
            this.pythonModules = builder.pythonModules;
            this.raspConfig = builder.raspConfig;
            this.readiness = builder.readiness;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
            this.resourceType = builder.resourceType;
            this.secretMountDesc = builder.secretMountDesc;
            this.securityGroupId = builder.securityGroupId;
            this.serviceTags = builder.serviceTags;
            this.sidecarContainersConfig = builder.sidecarContainersConfig;
            this.slsConfigs = builder.slsConfigs;
            this.slsLogEnvTags = builder.slsLogEnvTags;
            this.startupProbe = builder.startupProbe;
            this.swimlanePvtzDiscovery = builder.swimlanePvtzDiscovery;
            this.tags = builder.tags;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.timezone = builder.timezone;
            this.tomcatConfig = builder.tomcatConfig;
            this.updateStrategy = builder.updateStrategy;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.warStartOptions = builder.warStartOptions;
            this.webContainer = builder.webContainer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acrAssumeRoleArn
         */
        public String getAcrAssumeRoleArn() {
            return this.acrAssumeRoleArn;
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return albIngressReadinessGate
         */
        public String getAlbIngressReadinessGate() {
            return this.albIngressReadinessGate;
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appSource
         */
        public String getAppSource() {
            return this.appSource;
        }

        /**
         * @return associateEip
         */
        public Boolean getAssociateEip() {
            return this.associateEip;
        }

        /**
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return batchWaitTime
         */
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return cmsServiceId
         */
        public String getCmsServiceId() {
            return this.cmsServiceId;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return commandArgs
         */
        public String getCommandArgs() {
            return this.commandArgs;
        }

        /**
         * @return configMapMountDesc
         */
        public java.util.List<ConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return customHostAlias
         */
        public String getCustomHostAlias() {
            return this.customHostAlias;
        }

        /**
         * @return customImageNetworkType
         */
        public String getCustomImageNetworkType() {
            return this.customImageNetworkType;
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return dotnet
         */
        public String getDotnet() {
            return this.dotnet;
        }

        /**
         * @return edasContainerVersion
         */
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        /**
         * @return emptyDirDesc
         */
        public java.util.List<EmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        /**
         * @return enableAhas
         */
        public String getEnableAhas() {
            return this.enableAhas;
        }

        /**
         * @return enableCpuBurst
         */
        public String getEnableCpuBurst() {
            return this.enableCpuBurst;
        }

        /**
         * @return enableGreyTagRoute
         */
        public Boolean getEnableGreyTagRoute() {
            return this.enableGreyTagRoute;
        }

        /**
         * @return enableIdle
         */
        public Boolean getEnableIdle() {
            return this.enableIdle;
        }

        /**
         * @return enableNamespaceAgentVersion
         */
        public Boolean getEnableNamespaceAgentVersion() {
            return this.enableNamespaceAgentVersion;
        }

        /**
         * @return enableNewArms
         */
        public Boolean getEnableNewArms() {
            return this.enableNewArms;
        }

        /**
         * @return enablePrometheus
         */
        public Boolean getEnablePrometheus() {
            return this.enablePrometheus;
        }

        /**
         * @return envs
         */
        public String getEnvs() {
            return this.envs;
        }

        /**
         * @return gpuCount
         */
        public String getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuType
         */
        public String getGpuType() {
            return this.gpuType;
        }

        /**
         * @return headlessPvtzDiscovery
         */
        public String getHeadlessPvtzDiscovery() {
            return this.headlessPvtzDiscovery;
        }

        /**
         * @return html
         */
        public String getHtml() {
            return this.html;
        }

        /**
         * @return idleHour
         */
        public String getIdleHour() {
            return this.idleHour;
        }

        /**
         * @return imagePullSecrets
         */
        public String getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return initContainersConfig
         */
        public java.util.List<InitContainersConfig> getInitContainersConfig() {
            return this.initContainersConfig;
        }

        /**
         * @return isStateful
         */
        public Boolean getIsStateful() {
            return this.isStateful;
        }

        /**
         * @return jarStartArgs
         */
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        /**
         * @return jarStartOptions
         */
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        /**
         * @return jdk
         */
        public String getJdk() {
            return this.jdk;
        }

        /**
         * @return kafkaConfigs
         */
        public String getKafkaConfigs() {
            return this.kafkaConfigs;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return liveness
         */
        public String getLiveness() {
            return this.liveness;
        }

        /**
         * @return lokiConfigs
         */
        public String getLokiConfigs() {
            return this.lokiConfigs;
        }

        /**
         * @return maxSurgeInstanceRatio
         */
        public Integer getMaxSurgeInstanceRatio() {
            return this.maxSurgeInstanceRatio;
        }

        /**
         * @return maxSurgeInstances
         */
        public Integer getMaxSurgeInstances() {
            return this.maxSurgeInstances;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return microRegistration
         */
        public String getMicroRegistration() {
            return this.microRegistration;
        }

        /**
         * @return microRegistrationConfig
         */
        public String getMicroRegistrationConfig() {
            return this.microRegistrationConfig;
        }

        /**
         * @return microserviceEngineConfig
         */
        public String getMicroserviceEngineConfig() {
            return this.microserviceEngineConfig;
        }

        /**
         * @return minReadyInstanceRatio
         */
        public Integer getMinReadyInstanceRatio() {
            return this.minReadyInstanceRatio;
        }

        /**
         * @return minReadyInstances
         */
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
        }

        /**
         * @return mountDesc
         */
        public java.util.List<MountDesc> getMountDesc() {
            return this.mountDesc;
        }

        /**
         * @return mountHost
         */
        public String getMountHost() {
            return this.mountHost;
        }

        /**
         * @return mseApplicationId
         */
        public String getMseApplicationId() {
            return this.mseApplicationId;
        }

        /**
         * @return mseApplicationName
         */
        public String getMseApplicationName() {
            return this.mseApplicationName;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return nasConfigs
         */
        public String getNasConfigs() {
            return this.nasConfigs;
        }

        /**
         * @return nasId
         */
        public String getNasId() {
            return this.nasId;
        }

        /**
         * @return newSaeVersion
         */
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        /**
         * @return oidcRoleName
         */
        public String getOidcRoleName() {
            return this.oidcRoleName;
        }

        /**
         * @return ossAkId
         */
        public String getOssAkId() {
            return this.ossAkId;
        }

        /**
         * @return ossAkSecret
         */
        public String getOssAkSecret() {
            return this.ossAkSecret;
        }

        /**
         * @return ossMountDescs
         */
        public java.util.List<OssMountDescs> getOssMountDescs() {
            return this.ossMountDescs;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return php
         */
        public String getPhp() {
            return this.php;
        }

        /**
         * @return phpArmsConfigLocation
         */
        public String getPhpArmsConfigLocation() {
            return this.phpArmsConfigLocation;
        }

        /**
         * @return phpConfig
         */
        public String getPhpConfig() {
            return this.phpConfig;
        }

        /**
         * @return phpConfigLocation
         */
        public String getPhpConfigLocation() {
            return this.phpConfigLocation;
        }

        /**
         * @return postStart
         */
        public String getPostStart() {
            return this.postStart;
        }

        /**
         * @return preStop
         */
        public String getPreStop() {
            return this.preStop;
        }

        /**
         * @return programmingLanguage
         */
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        /**
         * @return pvtzDiscovery
         */
        public String getPvtzDiscovery() {
            return this.pvtzDiscovery;
        }

        /**
         * @return python
         */
        public String getPython() {
            return this.python;
        }

        /**
         * @return pythonModules
         */
        public String getPythonModules() {
            return this.pythonModules;
        }

        /**
         * @return raspConfig
         */
        public java.util.List<RaspConfig> getRaspConfig() {
            return this.raspConfig;
        }

        /**
         * @return readiness
         */
        public String getReadiness() {
            return this.readiness;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return secretMountDesc
         */
        public java.util.List<DataSecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return serviceTags
         */
        public java.util.Map<String, String> getServiceTags() {
            return this.serviceTags;
        }

        /**
         * @return sidecarContainersConfig
         */
        public java.util.List<SidecarContainersConfig> getSidecarContainersConfig() {
            return this.sidecarContainersConfig;
        }

        /**
         * @return slsConfigs
         */
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        /**
         * @return slsLogEnvTags
         */
        public String getSlsLogEnvTags() {
            return this.slsLogEnvTags;
        }

        /**
         * @return startupProbe
         */
        public String getStartupProbe() {
            return this.startupProbe;
        }

        /**
         * @return swimlanePvtzDiscovery
         */
        public String getSwimlanePvtzDiscovery() {
            return this.swimlanePvtzDiscovery;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return terminationGracePeriodSeconds
         */
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return tomcatConfig
         */
        public String getTomcatConfig() {
            return this.tomcatConfig;
        }

        /**
         * @return updateStrategy
         */
        public String getUpdateStrategy() {
            return this.updateStrategy;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return warStartOptions
         */
        public String getWarStartOptions() {
            return this.warStartOptions;
        }

        /**
         * @return webContainer
         */
        public String getWebContainer() {
            return this.webContainer;
        }

        public static final class Builder {
            private String acrAssumeRoleArn; 
            private String acrInstanceId; 
            private String agentVersion; 
            private String albIngressReadinessGate; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String appSource; 
            private Boolean associateEip; 
            private String baseAppId; 
            private Integer batchWaitTime; 
            private String clusterId; 
            private String cmsServiceId; 
            private String command; 
            private String commandArgs; 
            private java.util.List<ConfigMapMountDesc> configMapMountDesc; 
            private Integer cpu; 
            private String customHostAlias; 
            private String customImageNetworkType; 
            private String deploymentName; 
            private Integer diskSize; 
            private String dotnet; 
            private String edasContainerVersion; 
            private java.util.List<EmptyDirDesc> emptyDirDesc; 
            private String enableAhas; 
            private String enableCpuBurst; 
            private Boolean enableGreyTagRoute; 
            private Boolean enableIdle; 
            private Boolean enableNamespaceAgentVersion; 
            private Boolean enableNewArms; 
            private Boolean enablePrometheus; 
            private String envs; 
            private String gpuCount; 
            private String gpuType; 
            private String headlessPvtzDiscovery; 
            private String html; 
            private String idleHour; 
            private String imagePullSecrets; 
            private String imageUrl; 
            private java.util.List<InitContainersConfig> initContainersConfig; 
            private Boolean isStateful; 
            private String jarStartArgs; 
            private String jarStartOptions; 
            private String jdk; 
            private String kafkaConfigs; 
            private java.util.Map<String, String> labels; 
            private String liveness; 
            private String lokiConfigs; 
            private Integer maxSurgeInstanceRatio; 
            private Integer maxSurgeInstances; 
            private Integer memory; 
            private String microRegistration; 
            private String microRegistrationConfig; 
            private String microserviceEngineConfig; 
            private Integer minReadyInstanceRatio; 
            private Integer minReadyInstances; 
            private java.util.List<MountDesc> mountDesc; 
            private String mountHost; 
            private String mseApplicationId; 
            private String mseApplicationName; 
            private String namespaceId; 
            private String nasConfigs; 
            private String nasId; 
            private String newSaeVersion; 
            private String oidcRoleName; 
            private String ossAkId; 
            private String ossAkSecret; 
            private java.util.List<OssMountDescs> ossMountDescs; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String php; 
            private String phpArmsConfigLocation; 
            private String phpConfig; 
            private String phpConfigLocation; 
            private String postStart; 
            private String preStop; 
            private String programmingLanguage; 
            private String pvtzDiscovery; 
            private String python; 
            private String pythonModules; 
            private java.util.List<RaspConfig> raspConfig; 
            private String readiness; 
            private String regionId; 
            private Integer replicas; 
            private String resourceType; 
            private java.util.List<DataSecretMountDesc> secretMountDesc; 
            private String securityGroupId; 
            private java.util.Map<String, String> serviceTags; 
            private java.util.List<SidecarContainersConfig> sidecarContainersConfig; 
            private String slsConfigs; 
            private String slsLogEnvTags; 
            private String startupProbe; 
            private String swimlanePvtzDiscovery; 
            private java.util.List<Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private String timezone; 
            private String tomcatConfig; 
            private String updateStrategy; 
            private String vSwitchId; 
            private String vpcId; 
            private String warStartOptions; 
            private String webContainer; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acrAssumeRoleArn = model.acrAssumeRoleArn;
                this.acrInstanceId = model.acrInstanceId;
                this.agentVersion = model.agentVersion;
                this.albIngressReadinessGate = model.albIngressReadinessGate;
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appSource = model.appSource;
                this.associateEip = model.associateEip;
                this.baseAppId = model.baseAppId;
                this.batchWaitTime = model.batchWaitTime;
                this.clusterId = model.clusterId;
                this.cmsServiceId = model.cmsServiceId;
                this.command = model.command;
                this.commandArgs = model.commandArgs;
                this.configMapMountDesc = model.configMapMountDesc;
                this.cpu = model.cpu;
                this.customHostAlias = model.customHostAlias;
                this.customImageNetworkType = model.customImageNetworkType;
                this.deploymentName = model.deploymentName;
                this.diskSize = model.diskSize;
                this.dotnet = model.dotnet;
                this.edasContainerVersion = model.edasContainerVersion;
                this.emptyDirDesc = model.emptyDirDesc;
                this.enableAhas = model.enableAhas;
                this.enableCpuBurst = model.enableCpuBurst;
                this.enableGreyTagRoute = model.enableGreyTagRoute;
                this.enableIdle = model.enableIdle;
                this.enableNamespaceAgentVersion = model.enableNamespaceAgentVersion;
                this.enableNewArms = model.enableNewArms;
                this.enablePrometheus = model.enablePrometheus;
                this.envs = model.envs;
                this.gpuCount = model.gpuCount;
                this.gpuType = model.gpuType;
                this.headlessPvtzDiscovery = model.headlessPvtzDiscovery;
                this.html = model.html;
                this.idleHour = model.idleHour;
                this.imagePullSecrets = model.imagePullSecrets;
                this.imageUrl = model.imageUrl;
                this.initContainersConfig = model.initContainersConfig;
                this.isStateful = model.isStateful;
                this.jarStartArgs = model.jarStartArgs;
                this.jarStartOptions = model.jarStartOptions;
                this.jdk = model.jdk;
                this.kafkaConfigs = model.kafkaConfigs;
                this.labels = model.labels;
                this.liveness = model.liveness;
                this.lokiConfigs = model.lokiConfigs;
                this.maxSurgeInstanceRatio = model.maxSurgeInstanceRatio;
                this.maxSurgeInstances = model.maxSurgeInstances;
                this.memory = model.memory;
                this.microRegistration = model.microRegistration;
                this.microRegistrationConfig = model.microRegistrationConfig;
                this.microserviceEngineConfig = model.microserviceEngineConfig;
                this.minReadyInstanceRatio = model.minReadyInstanceRatio;
                this.minReadyInstances = model.minReadyInstances;
                this.mountDesc = model.mountDesc;
                this.mountHost = model.mountHost;
                this.mseApplicationId = model.mseApplicationId;
                this.mseApplicationName = model.mseApplicationName;
                this.namespaceId = model.namespaceId;
                this.nasConfigs = model.nasConfigs;
                this.nasId = model.nasId;
                this.newSaeVersion = model.newSaeVersion;
                this.oidcRoleName = model.oidcRoleName;
                this.ossAkId = model.ossAkId;
                this.ossAkSecret = model.ossAkSecret;
                this.ossMountDescs = model.ossMountDescs;
                this.packageType = model.packageType;
                this.packageUrl = model.packageUrl;
                this.packageVersion = model.packageVersion;
                this.php = model.php;
                this.phpArmsConfigLocation = model.phpArmsConfigLocation;
                this.phpConfig = model.phpConfig;
                this.phpConfigLocation = model.phpConfigLocation;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.programmingLanguage = model.programmingLanguage;
                this.pvtzDiscovery = model.pvtzDiscovery;
                this.python = model.python;
                this.pythonModules = model.pythonModules;
                this.raspConfig = model.raspConfig;
                this.readiness = model.readiness;
                this.regionId = model.regionId;
                this.replicas = model.replicas;
                this.resourceType = model.resourceType;
                this.secretMountDesc = model.secretMountDesc;
                this.securityGroupId = model.securityGroupId;
                this.serviceTags = model.serviceTags;
                this.sidecarContainersConfig = model.sidecarContainersConfig;
                this.slsConfigs = model.slsConfigs;
                this.slsLogEnvTags = model.slsLogEnvTags;
                this.startupProbe = model.startupProbe;
                this.swimlanePvtzDiscovery = model.swimlanePvtzDiscovery;
                this.tags = model.tags;
                this.terminationGracePeriodSeconds = model.terminationGracePeriodSeconds;
                this.timezone = model.timezone;
                this.tomcatConfig = model.tomcatConfig;
                this.updateStrategy = model.updateStrategy;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.warStartOptions = model.warStartOptions;
                this.webContainer = model.webContainer;
            } 

            /**
             * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull Alibaba Cloud images across accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Implement cross-account authorization by using RAM roles</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/adminrole</p>
             */
            public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
                this.acrAssumeRoleArn = acrAssumeRoleArn;
                return this;
            }

            /**
             * <p>The ACR Enterprise instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xxxxxx</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The agent version.</p>
             * 
             * <strong>example:</strong>
             * <p>4.4.2</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The ALB gateway readiness gate configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder albIngressReadinessGate(String albIngressReadinessGate) {
                this.albIngressReadinessGate = albIngressReadinessGate;
                return this;
            }

            /**
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample application</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The SAE application type. Valid values:</p>
             * <ul>
             * <li>micro_service</li>
             * <li>web</li>
             * <li>job</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>micro_service</p>
             */
            public Builder appSource(String appSource) {
                this.appSource = appSource;
                return this;
            }

            /**
             * <p>Specifies whether to associate an EIP. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Associate an EIP.</li>
             * <li><strong>false</strong>: Do not associate an EIP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder associateEip(Boolean associateEip) {
                this.associateEip = associateEip;
                return this;
            }

            /**
             * <p>The baseline application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8c573618-8d72-4407-baf4-f7b64b******</p>
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * <p>The wait time between batches during a phased release, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>495fc79c-ae61-4600-866d-a09d68******</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The CloudMonitor service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cms-id</p>
             */
            public Builder cmsServiceId(String cmsServiceId) {
                this.cmsServiceId = cmsServiceId;
                return this;
            }

            /**
             * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
             * <pre><code>command:
             *       - echo
             *       - abc
             *       - &gt;
             *       - file0
             * </code></pre>
             * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The image startup command parameters. The parameters required by the <strong>Command</strong> startup command. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the example of the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;a&quot;,&quot;b&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The ConfigMap information.</p>
             */
            public Builder configMapMountDesc(java.util.List<ConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * <p>The CPU required for each instance, in millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
             * <ul>
             * <li><strong>500</strong></li>
             * <li><strong>1000</strong></li>
             * <li><strong>2000</strong></li>
             * <li><strong>4000</strong></li>
             * <li><strong>8000</strong></li>
             * <li><strong>16000</strong></li>
             * <li><strong>32000</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The custom host mapping in the container. Valid values:</p>
             * <ul>
             * <li><strong>hostName</strong>: The domain name or hostname.</li>
             * <li><strong>ip</strong>: The IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;hostName&quot;:&quot;test.host.name&quot;,&quot;ip&quot;:&quot;0.0.0.0&quot;}]</p>
             */
            public Builder customHostAlias(String customHostAlias) {
                this.customHostAlias = customHostAlias;
                return this;
            }

            /**
             * <p>The custom image type. If the image is not a custom image, set this parameter to an empty string. Valid values:</p>
             * <ul>
             * <li>internet: Public image.</li>
             * <li>intranet: Private image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder customImageNetworkType(String customImageNetworkType) {
                this.customImageNetworkType = customImageNetworkType;
                return this;
            }

            /**
             * <p>The instance name of the application in the ASI cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-b0cdce9b-3d1f-4168-b206-b59f348f1a8a</p>
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * <p>The disk storage size, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The .NET framework version. Valid values:</p>
             * <ul>
             * <li>.NET 3.1</li>
             * <li>.NET 5.0</li>
             * <li>.NET 6.0</li>
             * <li>.NET 7.0</li>
             * <li>.NET 8.0</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>.NET 8.0</p>
             */
            public Builder dotnet(String dotnet) {
                this.dotnet = dotnet;
                return this;
            }

            /**
             * <p>The application runtime environment version in the HSF framework, such as the Ali-Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.3</p>
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * <p>The shared ephemeral storage.</p>
             */
            public Builder emptyDirDesc(java.util.List<EmptyDirDesc> emptyDirDesc) {
                this.emptyDirDesc = emptyDirDesc;
                return this;
            }

            /**
             * <p>Specifies whether to connect to AHAS. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Connect to AHAS.</li>
             * <li><strong>false</strong>: Do not connect to AHAS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAhas(String enableAhas) {
                this.enableAhas = enableAhas;
                return this;
            }

            /**
             * <p>Specifies whether to enable the CPU Burst feature. Valid values:</p>
             * <ul>
             * <li>true: Enable.</li>
             * <li>false: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableCpuBurst(String enableCpuBurst) {
                this.enableCpuBurst = enableCpuBurst;
                return this;
            }

            /**
             * <p>Specifies whether to enable traffic canary release rules. This rule applies only to applications that use the Spring Cloud and Dubbo frameworks. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enable canary release rules.</li>
             * <li><strong>false</strong>: Disable canary release rules.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
                this.enableGreyTagRoute = enableGreyTagRoute;
                return this;
            }

            /**
             * <p>Specifies whether to enable the idle mode. Valid values:</p>
             * <ul>
             * <li>true: Enable.</li>
             * <li>false: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIdle(Boolean enableIdle) {
                this.enableIdle = enableIdle;
                return this;
            }

            /**
             * <p>Specifies whether to reuse the namespace agent version configuration.</p>
             */
            public Builder enableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
                this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable the new ARMS features. Valid values:</p>
             * <ul>
             * <li>true: Enable.</li>
             * <li>false: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableNewArms(Boolean enableNewArms) {
                this.enableNewArms = enableNewArms;
                return this;
            }

            /**
             * <p>Specifies whether to enable Prometheus custom metric collection.</p>
             */
            public Builder enablePrometheus(Boolean enablePrometheus) {
                this.enablePrometheus = enablePrometheus;
                return this;
            }

            /**
             * <p>The container environment variable parameters. You can customize the parameters or reference configuration items. To reference configuration items, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
             * <ul>
             * <li>Custom configuration<ul>
             * <li><strong>name</strong>: The environment variable name.</li>
             * <li><strong>value</strong>: The environment variable value.</li>
             * </ul>
             * </li>
             * <li>Reference configuration items<ul>
             * <li><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;Configuration item name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: The environment variable reference. Set the value to <code>configMapRef</code>.</li>
             * <li><strong>configMapId</strong>: The configuration item ID.</li>
             * <li><strong>key</strong>: The key. If all key-value pairs are referenced, do not set this field.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpuCount(String gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>PPU810E</p>
             */
            public Builder gpuType(String gpuType) {
                this.gpuType = gpuType;
                return this;
            }

            /**
             * <p>The headless PrivateZone service discovery configuration for stateful applications. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;serviceName&quot;:&quot;svc1&quot;,&quot;namespaceId&quot;:&quot;cn-shenzhen&quot;}</p>
             */
            public Builder headlessPvtzDiscovery(String headlessPvtzDiscovery) {
                this.headlessPvtzDiscovery = headlessPvtzDiscovery;
                return this;
            }

            /**
             * <p>The NGINX runtime environment version used by the HTML application.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx 1.28</p>
             */
            public Builder html(String html) {
                this.html = html;
                return this;
            }

            /**
             * <p>The application idle time period configuration. The value is a JSON array string that contains startTime and endTime. Specify the time on the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;startTime&quot;:&quot;1:00&quot;,&quot;endTime&quot;:&quot;16:00&quot;}]</p>
             */
            public Builder idleHour(String idleHour) {
                this.idleHour = idleHour;
                return this;
            }

            /**
             * <p>The ID of the corresponding Secret.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder imagePullSecrets(String imagePullSecrets) {
                this.imagePullSecrets = imagePullSecrets;
                return this;
            }

            /**
             * <p>The image address. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>docker.io/library/nginx:1.14.2</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The init container configuration.</p>
             */
            public Builder initContainersConfig(java.util.List<InitContainersConfig> initContainersConfig) {
                this.initContainersConfig = initContainersConfig;
                return this;
            }

            /**
             * <p>Specifies whether the application is a stateful application.</p>
             */
            public Builder isStateful(Boolean isStateful) {
                this.isStateful = isStateful;
                return this;
            }

            /**
             * <p>The application startup parameters for the JAR package. Default application startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * <p>The application startup options for the JAR package. Default application startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
             * 
             * <strong>example:</strong>
             * <p>-Dtest=true</p>
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * <p>The JDK version on which the deployment package depends. Supported versions:</p>
             * <ul>
             * <li><strong>Open JDK 8</strong></li>
             * <li><strong>Open JDK 7</strong></li>
             * <li><strong>Dragonwell 11</strong></li>
             * <li><strong>Dragonwell 8</strong></li>
             * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
             * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
             * </ul>
             * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Open JDK 8</p>
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * <p>The summary information of the configuration for collecting logs to Kafka. Valid values:</p>
             * <ul>
             * <li><strong>kafkaEndpoint</strong>: The service registration address of the Kafka API.</li>
             * <li><strong>kafkaInstanceId</strong>: The Kafka instance ID.</li>
             * <li><strong>kafkaConfigs</strong>: The summary information of the configuration for one or more logs. For example values and metric descriptions, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
             */
            public Builder kafkaConfigs(String kafkaConfigs) {
                this.kafkaConfigs = kafkaConfigs;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The container health check. Containers that failed the health check are shutdown and recover. Supported methods:</p>
             * <ul>
             * <li><strong>exec</strong>: Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
             * <li><strong>httpGet</strong>: Example: <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
             * <li><strong>tcpSocket</strong>: Example: <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
             * </ul>
             * <blockquote>
             * <p>You can select only one method for the health check.</p>
             * </blockquote>
             * <p>Metric descriptions:</p>
             * <ul>
             * <li><strong>exec.command</strong>: Settings for the health check command.</li>
             * <li><strong>httpGet.path</strong>: The access path.</li>
             * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
             * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included, and <strong>false</strong> indicates that the keyword is not included. If this field is missing, the advanced feature is not used.</li>
             * <li><strong>httpGet.keyWord</strong>: The custom keyword. The <strong>isContainKeyWord</strong> field is required when this field is used.</li>
             * <li><strong>tcpSocket.port</strong>: The port for TCP connection detection.</li>
             * <li><strong>initialDelaySeconds</strong>: Settings for the health check delay detection time. Default value: 10. Unit: seconds.</li>
             * <li><strong>periodSeconds</strong>: Settings for the health check epoch. Default value: 30. Unit: seconds.</li>
             * <li><strong>timeoutSeconds</strong>: Settings for the health check timeout waiting time. Default value: 1. Unit: seconds. If this parameter is set to 0 or not set, the default timeout waiting time is 1 second.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:3%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:3}</a></p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>LokiConfigs</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder lokiConfigs(String lokiConfigs) {
                this.lokiConfigs = lokiConfigs;
                return this;
            }

            /**
             * <p>The peak volume ratio of surge instances.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maxSurgeInstanceRatio(Integer maxSurgeInstanceRatio) {
                this.maxSurgeInstanceRatio = maxSurgeInstanceRatio;
                return this;
            }

            /**
             * <p>The peak volume of surge instances.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maxSurgeInstances(Integer maxSurgeInstances) {
                this.maxSurgeInstances = maxSurgeInstances;
                return this;
            }

            /**
             * <p>The memory required for each instance, in MB. The value cannot be 0. The memory has a one-to-one mapping with the CPU. Only the following defined specifications are supported:</p>
             * <ul>
             * <li><strong>1024</strong>: corresponds to 500 millicores and 1000 millicores.</li>
             * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores.</li>
             * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores.</li>
             * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores.</li>
             * <li><strong>12288</strong>: corresponds to 12000 millicores.</li>
             * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores.</li>
             * <li><strong>24576</strong>: corresponds to 12000 millicores.</li>
             * <li><strong>32768</strong>: corresponds to 16000 millicores.</li>
             * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores.</li>
             * <li><strong>131072</strong>: corresponds to 32000 millicores.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The Nacos registry center. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: SAE built-in Nacos.</li>
             * <li><strong>1</strong>: User-managed Nacos.</li>
             * <li><strong>2</strong>: MSE Nacos Commercial Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;0&quot;</p>
             */
            public Builder microRegistration(String microRegistration) {
                this.microRegistration = microRegistration;
                return this;
            }

            /**
             * <p>The registry center configuration. This parameter takes effect only when the registry center type is MSE Nacos Enterprise Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-1ls43******\&quot;,\&quot;namespace\&quot;:\&quot;62ee12fb-c279-4da4-be96-21**********\&quot;}</p>
             */
            public Builder microRegistrationConfig(String microRegistrationConfig) {
                this.microRegistrationConfig = microRegistrationConfig;
                return this;
            }

            /**
             * <p>Configures the microservice governance feature.</p>
             * <ul>
             * <li><p>Whether to enable microservice governance (enable):</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>Configure lossless online and offline (mseLosslessRule):</p>
             * <ul>
             * <li><p>delayTime: The delay time.</p>
             * </li>
             * <li><p>enable: Specifies whether to enable the lossless online feature. Valid values: true (enabled) and false (disabled).</p>
             * </li>
             * <li><p>notice: Specifies whether to enable the notification feature. Valid values: true (enabled) and false (disabled).</p>
             * </li>
             * <li><p>warmupTime: The warm-up duration for small traffic, in seconds.</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Enable\&quot;:true,\&quot;MseLosslessRule\&quot;:{\&quot;enable\&quot;:true,\&quot;notice\&quot;:true,\&quot;delayTime\&quot;:10,\&quot;warmupTime\&quot;:120,\&quot;funcType\&quot;:2,\&quot;aligned\&quot;:false,\&quot;related\&quot;:false,\&quot;lossLessDetail\&quot;:false}}</p>
             */
            public Builder microserviceEngineConfig(String microserviceEngineConfig) {
                this.microserviceEngineConfig = microserviceEngineConfig;
                return this;
            }

            /**
             * <p>The minimum percentage of ready instances. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: The default value, which indicates that the percentage is not used. If you do not specify this parameter, the system defaults to <strong>-1</strong>.</li>
             * <li><strong>0 to 100</strong>: The unit is percentage, rounded up. For example, if you set this parameter to <strong>50</strong> and the current number of instances is 5, the minimum number of ready instances is 3.</li>
             * </ul>
             * <blockquote>
             * <p>If both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter prevails. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the system uses <strong>MinReadyInstanceRatio</strong> to calculate the minimum number of ready instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * <p>The minimum number of ready instances. Valid values:</p>
             * <ul>
             * <li>If you set this parameter to <strong>0</strong>, services are interrupted during the application upgrade.</li>
             * <li>If you set this parameter to <strong>-1</strong>, the minimum number of ready instances uses the system-recommended value, which is 25% of the existing instances. For example, if the current number of instances is 5, 5 × 25% = 1.25. After rounding up, the minimum number of ready instances is 2.</li>
             * </ul>
             * <blockquote>
             * <p>Set the minimum number of ready instances for each rolling deployment to a value greater than or equal to 1 to ensure service continuity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
                return this;
            }

            /**
             * <p>The mount description.</p>
             */
            public Builder mountDesc(java.util.List<MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * <p>The NAS mount target within the application VPC. If the configuration remains unchanged during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field is not required in the request). To clear the NAS configuration, set the value of this field to an empty string in the request (that is, set the <strong>MountHost</strong> field to &quot;&quot;).</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * <p>The application ID on the MSE side.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxx@xxxxx</p>
             */
            public Builder mseApplicationId(String mseApplicationId) {
                this.mseApplicationId = mseApplicationId;
                return this;
            }

            /**
             * <p>The application name after the SAE service is registered with MSE.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-alb-demo-5c****</p>
             */
            public Builder mseApplicationName(String mseApplicationName) {
                this.mseApplicationName = mseApplicationName;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The NAS mount configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
             */
            public Builder nasConfigs(String nasConfigs) {
                this.nasConfigs = nasConfigs;
                return this;
            }

            /**
             * <p>The NAS ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AKSN****</p>
             */
            public Builder nasId(String nasId) {
                this.nasId = nasId;
                return this;
            }

            /**
             * <p>The application edition. Valid values:</p>
             * <ul>
             * <li>lite: Lite Edition.</li>
             * <li>std: Standard Edition.</li>
             * <li>pro: Professional Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pro</p>
             */
            public Builder newSaeVersion(String newSaeVersion) {
                this.newSaeVersion = newSaeVersion;
                return this;
            }

            /**
             * <p>The RAM role for the identity authentication service.</p>
             * <blockquote>
             * <p>You must create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Create an OIDC identity provider</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Create a role-based SSO identity provider</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sae-test</p>
             */
            public Builder oidcRoleName(String oidcRoleName) {
                this.oidcRoleName = oidcRoleName;
                return this;
            }

            /**
             * <p>The AccessKey ID used to read and write OSS data.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkId(String ossAkId) {
                this.ossAkId = ossAkId;
                return this;
            }

            /**
             * <p>The AccessKey Secret used to read and write OSS data.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkSecret(String ossAkSecret) {
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * <p>The OSS mount description.</p>
             */
            public Builder ossMountDescs(java.util.List<OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * <p>The application package type. Valid values:</p>
             * <ul>
             * <li>When you deploy a Java application, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</li>
             * <li>When you deploy a PHP application, valid values are:<ul>
             * <li><strong>PhpZip</strong></li>
             * <li><strong>IMAGE_PHP_5_4</strong></li>
             * <li><strong>IMAGE_PHP_5_4_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_5_5</strong></li>
             * <li><strong>IMAGE_PHP_5_5_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_5_6</strong></li>
             * <li><strong>IMAGE_PHP_5_6_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_0</strong></li>
             * <li><strong>IMAGE_PHP_7_0_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_1</strong></li>
             * <li><strong>IMAGE_PHP_7_1_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_2</strong></li>
             * <li><strong>IMAGE_PHP_7_2_ALPINE</strong></li>
             * <li><strong>IMAGE_PHP_7_3</strong></li>
             * <li><strong>IMAGE_PHP_7_3_ALPINE</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>War</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The deployment package URL. If your deployment package is uploaded through SAE, note the following points:</p>
             * <ul>
             * <li>The URL cannot be used to download the package directly. You must call the GetPackageVersionAccessableUrl operation to obtain a downloadable URL, which is valid for 10 minutes.</li>
             * <li>SAE retains the package for a maximum of 90 days. After 90 days, the URL is not returned and the package cannot be downloaded.</li>
             * </ul>
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * <p>The version number of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The PHP version required by the PHP deployment package. Images are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PHP-FPM 7.0</p>
             */
            public Builder php(String php) {
                this.php = php;
                return this;
            }

            /**
             * <p>The mount path for PHP application monitoring. You must ensure that the PHP server loads the configuration file from this path.</p>
             * <p>You do not need to focus on the configuration content because SAE automatically renders the correct configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/etc/php/conf.d/arms.ini</p>
             */
            public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
                this.phpArmsConfigLocation = phpArmsConfigLocation;
                return this;
            }

            /**
             * <p>The content of the PHP configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>k1=v1</p>
             */
            public Builder phpConfig(String phpConfig) {
                this.phpConfig = phpConfig;
                return this;
            }

            /**
             * <p>The mount path for the PHP application startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/etc/php/php.ini</p>
             */
            public Builder phpConfigLocation(String phpConfigLocation) {
                this.phpConfigLocation = phpConfigLocation;
                return this;
            }

            /**
             * <p>The script to execute after the container starts. A script is executed immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script to execute before the container stops. A script is executed before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The programming language used to create the application. Valid values:</p>
             * <ul>
             * <li><strong>java</strong>: Java.</li>
             * <li><strong>php</strong>: PHP.</li>
             * <li><strong>other</strong>: Multiple languages, such as Python, C++, Go, .NET, and Node.js.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>java</p>
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * <p>Specifies whether to enable Kubernetes Service registration and discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;serviceName&quot;: &quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,     &quot;namespaceId&quot;: &quot;cn-beijing:front&quot;,     &quot;portAndProtocol&quot;: {         &quot;18012&quot;: &quot;TCP&quot;     },     &quot;portProtocols&quot;: [         {             &quot;port&quot;: &quot;18012&quot;,             &quot;protocol&quot;: &quot;TCP&quot;         }     ],     &quot;enable&quot;: true }</p>
             */
            public Builder pvtzDiscovery(String pvtzDiscovery) {
                this.pvtzDiscovery = pvtzDiscovery;
                return this;
            }

            /**
             * <p>The Python environment. Python 3.9.15 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON 3.9.15</p>
             */
            public Builder python(String python) {
                this.python = python;
                return this;
            }

            /**
             * <p>The module dependencies for custom installation. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no dependencies are configured or custom packages are used, you can specify the dependencies to install.</p>
             * 
             * <strong>example:</strong>
             * <p>Flask==2.0</p>
             */
            public Builder pythonModules(String pythonModules) {
                this.pythonModules = pythonModules;
                return this;
            }

            /**
             * <p>The RASP configuration items.</p>
             */
            public Builder raspConfig(java.util.List<RaspConfig> raspConfig) {
                this.raspConfig = raspConfig;
                return this;
            }

            /**
             * <p>The application startup status check. Containers that fail the health check multiple times are stopped and restarted. Traffic from SLB is not routed to containers that fail the health check. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
             * <blockquote>
             * <p>You can select only one method for the health check.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:5%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:5}</a></p>
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The resource type. Only <code>application</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>application</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The Secret mount description.</p>
             */
            public Builder secretMountDesc(java.util.List<DataSecretMountDesc> secretMountDesc) {
                this.secretMountDesc = secretMountDesc;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The canary release tags configured for the application.</p>
             */
            public Builder serviceTags(java.util.Map<String, String> serviceTags) {
                this.serviceTags = serviceTags;
                return this;
            }

            /**
             * <p>The sidecar container configuration.</p>
             */
            public Builder sidecarContainersConfig(java.util.List<SidecarContainersConfig> sidecarContainersConfig) {
                this.sidecarContainersConfig = sidecarContainersConfig;
                return this;
            }

            /**
             * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
             * <ul>
             * <li>To use SLS resources with automatic creation by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
             * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
             * </ul>
             * <p>Metric description:</p>
             * <ul>
             * <li><strong>projectName</strong>: The name of the SLS project.  </li>
             * <li><strong>logDir</strong>: The log path character string.</li>
             * <li><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs. You can set only one stdout log. If the Settings are not specified, file logs are collected.</li>
             * <li><strong>logstoreName</strong>: The name of the SLS Logstore.</li>
             * <li><strong>logtailName</strong>: The name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
             * </ul>
             * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter. That is, you do not need to include the <strong>SlsConfigs</strong> field in the request. If you no longer need the SLS collection feature, you must set the value of this field to an empty string in the request. That is, set the <strong>SlsConfigs</strong> field to &quot;&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * <p>sls log env tags</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder slsLogEnvTags(String slsLogEnvTags) {
                this.slsLogEnvTags = slsLogEnvTags;
                return this;
            }

            /**
             * <p>The application startup probe.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;/bin/sh\&quot;,\&quot;-c\&quot;,\&quot;#!Note: If microservice config is enabled, the application will be automatically injected with the prestop configuration for lossless offline. If you delete this prestop configuration, lossless offline will not be effective.\\n echo stop &gt; /tmp/prestop; /home/admin/.tools/curl <a href="http://127.0.0.1:54199/offline">http://127.0.0.1:54199/offline</a>; sleep 30\&quot;]}}</p>
             */
            public Builder startupProbe(String startupProbe) {
                this.startupProbe = startupProbe;
                return this;
            }

            /**
             * <p>The configuration for service registration and discovery and end-to-end canary release based on Kubernetes Services.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
             */
            public Builder swimlanePvtzDiscovery(String swimlanePvtzDiscovery) {
                this.swimlanePvtzDiscovery = swimlanePvtzDiscovery;
                return this;
            }

            /**
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period for graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The Tomcat file configuration. Set the value to &quot;&quot; or &quot;{}&quot; to delete the configuration. Valid values:</p>
             * <ul>
             * <li><strong>port</strong>: The port number. Valid values: 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
             * <li><strong>contextPath</strong>: The access path. Default value: the root directory &quot;/&quot;.</li>
             * <li><strong>maxThreads</strong>: The maximum number of connections in the connection pool. Default value: 400.</li>
             * <li><strong>uriEncoding</strong>: The Tomcat encoding format. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default value: <strong>ISO-8859-1</strong>.</li>
             * <li><strong>useBodyEncoding</strong>: Specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
             */
            public Builder tomcatConfig(String tomcatConfig) {
                this.tomcatConfig = tomcatConfig;
                return this;
            }

            /**
             * <p>The deployment policy. When the minimum number of surviving instances is 1, the value of the <strong>UpdateStrategy</strong> field is &quot;&quot;. When the minimum number of surviving instances is greater than 1, examples are as follows:</p>
             * <ul>
             * <li><p>Grayscale 1 instance, followed by 2 batches, automatic batching, and a batch interval of 1 minute: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
             * </li>
             * <li><p>Grayscale 1 instance, followed by 2 batches, and manual batching: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
             * </li>
             * <li><p>2 batches, automatic batching, and a batch interval of 0 minutes: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
             * </li>
             * </ul>
             * <p>Metric description:</p>
             * <ul>
             * <li><strong>type</strong>: The publish policy type. Valid values: <strong>GrayBatchUpdate</strong> for grayscale publish and <strong>BatchUpdate</strong> for batch publish.</li>
             * <li><strong>batchUpdate</strong>: The batch publish policy.<ul>
             * <li><strong>batch</strong>: The number of publish batches.</li>
             * <li><strong>releaseType</strong>: The processing method between batches. Valid values: <strong>auto</strong> for automatic and <strong>manual</strong> for manual.</li>
             * <li><strong>batchWaitTime</strong>: The deployment interval between batches. Unit: seconds.</li>
             * </ul>
             * </li>
             * <li><strong>grayUpdate</strong>: The remaining batches after the grayscale publish. This parameter is required when <strong>type</strong> is set to <strong>GrayBatchUpdate</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
             */
            public Builder updateStrategy(String updateStrategy) {
                this.updateStrategy = updateStrategy;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze559r1z1bpwqxwp****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0i263cnn311nvj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The startup options for WAR package applications. Default application startup command: <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-option</p>
             */
            public Builder warStartOptions(String warStartOptions) {
                this.warStartOptions = warStartOptions;
                return this;
            }

            /**
             * <p>The Tomcat version on which the deployment package depends. Valid values:</p>
             * <ul>
             * <li><strong>apache-tomcat-7.0.91</strong></li>
             * <li><strong>apache-tomcat-8.5.42</strong></li>
             * </ul>
             * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>apache-tomcat-7.0.91</p>
             */
            public Builder webContainer(String webContainer) {
                this.webContainer = webContainer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
