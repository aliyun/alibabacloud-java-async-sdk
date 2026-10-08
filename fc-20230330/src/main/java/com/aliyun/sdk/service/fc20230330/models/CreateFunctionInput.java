// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CreateFunctionInput} extends {@link TeaModel}
 *
 * <p>CreateFunctionInput</p>
 */
public class CreateFunctionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private InputCodeLocation code;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("customContainerConfig")
    private CustomContainerConfig customContainerConfig;

    @com.aliyun.core.annotation.NameInMap("customDNS")
    private CustomDNS customDNS;

    @com.aliyun.core.annotation.NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("disableInjectCredentials")
    private String disableInjectCredentials;

    @com.aliyun.core.annotation.NameInMap("disableOndemand")
    @Deprecated
    private Boolean disableOndemand;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("enableLongLiving")
    @Deprecated
    private Boolean enableLongLiving;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("gpuConfig")
    private GPUConfig gpuConfig;

    @com.aliyun.core.annotation.NameInMap("handler")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String handler;

    @com.aliyun.core.annotation.NameInMap("idleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceIsolationMode")
    private String instanceIsolationMode;

    @com.aliyun.core.annotation.NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("juiceFsConfig")
    private JuiceFsConfig juiceFsConfig;

    @com.aliyun.core.annotation.NameInMap("layers")
    private java.util.List<String> layers;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("microSandboxConfig")
    private MicroSandboxConfig microSandboxConfig;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("polarFsConfig")
    private PolarFsConfig polarFsConfig;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("role")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String role;

    @com.aliyun.core.annotation.NameInMap("runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtime;

    @com.aliyun.core.annotation.NameInMap("sessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityConfig")
    private String sessionAffinityConfig;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private CreateFunctionInput(Builder builder) {
        this.code = builder.code;
        this.cpu = builder.cpu;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.disableInjectCredentials = builder.disableInjectCredentials;
        this.disableOndemand = builder.disableOndemand;
        this.diskSize = builder.diskSize;
        this.enableLongLiving = builder.enableLongLiving;
        this.environmentVariables = builder.environmentVariables;
        this.functionName = builder.functionName;
        this.gpuConfig = builder.gpuConfig;
        this.handler = builder.handler;
        this.idleTimeout = builder.idleTimeout;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceIsolationMode = builder.instanceIsolationMode;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.internetAccess = builder.internetAccess;
        this.juiceFsConfig = builder.juiceFsConfig;
        this.layers = builder.layers;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.microSandboxConfig = builder.microSandboxConfig;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.resourceGroupId = builder.resourceGroupId;
        this.role = builder.role;
        this.runtime = builder.runtime;
        this.sessionAffinity = builder.sessionAffinity;
        this.sessionAffinityConfig = builder.sessionAffinityConfig;
        this.tags = builder.tags;
        this.timeout = builder.timeout;
        this.tracingConfig = builder.tracingConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public InputCodeLocation getCode() {
        return this.code;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return customContainerConfig
     */
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    /**
     * @return customDNS
     */
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    /**
     * @return customRuntimeConfig
     */
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableInjectCredentials
     */
    public String getDisableInjectCredentials() {
        return this.disableInjectCredentials;
    }

    /**
     * @return disableOndemand
     */
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return enableLongLiving
     */
    public Boolean getEnableLongLiving() {
        return this.enableLongLiving;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return gpuConfig
     */
    public GPUConfig getGpuConfig() {
        return this.gpuConfig;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    /**
     * @return instanceIsolationMode
     */
    public String getInstanceIsolationMode() {
        return this.instanceIsolationMode;
    }

    /**
     * @return instanceLifecycleConfig
     */
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    /**
     * @return internetAccess
     */
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    /**
     * @return juiceFsConfig
     */
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    /**
     * @return layers
     */
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    /**
     * @return logConfig
     */
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return microSandboxConfig
     */
    public MicroSandboxConfig getMicroSandboxConfig() {
        return this.microSandboxConfig;
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return ossMountConfig
     */
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    /**
     * @return polarFsConfig
     */
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return sessionAffinity
     */
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    /**
     * @return sessionAffinityConfig
     */
    public String getSessionAffinityConfig() {
        return this.sessionAffinityConfig;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return tracingConfig
     */
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    /**
     * @return vpcConfig
     */
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private InputCodeLocation code; 
        private Float cpu; 
        private CustomContainerConfig customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private String disableInjectCredentials; 
        private Boolean disableOndemand; 
        private Integer diskSize; 
        private Boolean enableLongLiving; 
        private java.util.Map<String, String> environmentVariables; 
        private String functionName; 
        private GPUConfig gpuConfig; 
        private String handler; 
        private Integer idleTimeout; 
        private Integer instanceConcurrency; 
        private String instanceIsolationMode; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Boolean internetAccess; 
        private JuiceFsConfig juiceFsConfig; 
        private java.util.List<String> layers; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private MicroSandboxConfig microSandboxConfig; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private PolarFsConfig polarFsConfig; 
        private String resourceGroupId; 
        private String role; 
        private String runtime; 
        private String sessionAffinity; 
        private String sessionAffinityConfig; 
        private java.util.List<Tag> tags; 
        private Integer timeout; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(CreateFunctionInput model) {
            this.code = model.code;
            this.cpu = model.cpu;
            this.customContainerConfig = model.customContainerConfig;
            this.customDNS = model.customDNS;
            this.customRuntimeConfig = model.customRuntimeConfig;
            this.description = model.description;
            this.disableInjectCredentials = model.disableInjectCredentials;
            this.disableOndemand = model.disableOndemand;
            this.diskSize = model.diskSize;
            this.enableLongLiving = model.enableLongLiving;
            this.environmentVariables = model.environmentVariables;
            this.functionName = model.functionName;
            this.gpuConfig = model.gpuConfig;
            this.handler = model.handler;
            this.idleTimeout = model.idleTimeout;
            this.instanceConcurrency = model.instanceConcurrency;
            this.instanceIsolationMode = model.instanceIsolationMode;
            this.instanceLifecycleConfig = model.instanceLifecycleConfig;
            this.internetAccess = model.internetAccess;
            this.juiceFsConfig = model.juiceFsConfig;
            this.layers = model.layers;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.microSandboxConfig = model.microSandboxConfig;
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
            this.resourceGroupId = model.resourceGroupId;
            this.role = model.role;
            this.runtime = model.runtime;
            this.sessionAffinity = model.sessionAffinity;
            this.sessionAffinityConfig = model.sessionAffinityConfig;
            this.tags = model.tags;
            this.timeout = model.timeout;
            this.tracingConfig = model.tracingConfig;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * <p>The ZIP package of the function code. Specify either code or customContainerConfig.</p>
         */
        public Builder code(InputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The CPU specification of the function in vCPU. The value must be a multiple of 0.05 vCPU. The minimum value is 0.05 and the maximum value is 16. The ratio of cpu to memorySize (in GB) must be between 1:1 and 1:4.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The configuration of the custom container runtime. After successful configuration, the function can use a custom container image to execute the function. Specify either code or customContainerConfig.</p>
         */
        public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * <p>The custom DNS configuration.</p>
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.customDNS = customDNS;
            return this;
        }

        /**
         * <p>The custom runtime configuration.</p>
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * <p>The description of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>my function</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to disable STS token injection. Valid values:</p>
         * <ul>
         * <li>None: Injects STS tokens in all methods.</li>
         * <li>Env: Does not inject STS tokens into environment variables.</li>
         * <li>Request: Does not inject STS tokens into requests, including context and headers.</li>
         * <li>All: Does not inject STS tokens in any method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Env</p>
         */
        public Builder disableInjectCredentials(String disableInjectCredentials) {
            this.disableInjectCredentials = disableInjectCredentials;
            return this;
        }

        /**
         * <p>Specifies whether to disable the creation of on-demand instances. After this feature is enabled, on-demand instances are not created and only provisioned instances can be used.</p>
         */
        public Builder disableOndemand(Boolean disableOndemand) {
            this.disableOndemand = disableOndemand;
            return this;
        }

        /**
         * <p>The disk specification of the function in MB. Valid values: 512 and 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Specifies whether to allow provisioned instances of GPU functions to be long-running. When this feature is enabled, function instances that are created are not injected with STS tokens.</p>
         */
        public Builder enableLongLiving(Boolean enableLongLiving) {
            this.enableLongLiving = enableLongLiving;
            return this;
        }

        /**
         * <p>The environment variables of the function. You can access the configured environment variables in the runtime environment.</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>The name of the function. The name can contain only letters, digits, underscores (_), and hyphens (-). It cannot start with a digit or hyphen (-). The name must be 1 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-function-1</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The GPU configuration of the function.</p>
         */
        public Builder gpuConfig(GPUConfig gpuConfig) {
            this.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * <p>The function entry point. The specific format is related to the runtime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>index.handler</p>
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * <p>The instance deferred release time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The maximum concurrency of an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * <p>The instance isolation mode.</p>
         */
        public Builder instanceIsolationMode(String instanceIsolationMode) {
            this.instanceIsolationMode = instanceIsolationMode;
            return this;
        }

        /**
         * <p>The instance lifecycle hook method configuration.</p>
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * <p>Specifies whether the function can access the Internet. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>The JuiceFs mount configuration.</p>
         */
        public Builder juiceFsConfig(JuiceFsConfig juiceFsConfig) {
            this.juiceFsConfig = juiceFsConfig;
            return this;
        }

        /**
         * <p>The list of layers. Multiple layers are merged in descending order of array index. Content from a layer with a smaller index overwrites files with the same name from a layer with a larger index.</p>
         */
        public Builder layers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * <p>The log configuration. Logs generated by the function are written to the configured Logstore.</p>
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The memory specification of the function in MB. The value must be a multiple of 64 MB. The minimum value is 128 MB and the maximum value is 32 GB. The ratio of cpu to memorySize (in GB) must be between 1:1 and 1:4.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * microSandboxConfig.
         */
        public Builder microSandboxConfig(MicroSandboxConfig microSandboxConfig) {
            this.microSandboxConfig = microSandboxConfig;
            return this;
        }

        /**
         * <p>The NAS configuration. After you configure this parameter, the function can access the specified NAS resources.</p>
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * <p>The OSS mount configuration.</p>
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * <p>The PolarFs configuration. After you configure this parameter, the function can access the specified PolarFs resources.</p>
         */
        public Builder polarFsConfig(PolarFsConfig polarFsConfig) {
            this.polarFsConfig = polarFsConfig;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The RAM role that you grant to Function Compute. After the role is configured, Function Compute assumes this role to generate temporary access credentials. You can use the temporary access credentials of this role in the function to access specified Alibaba Cloud services such as OSS and OTS.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::188077086902****:role/fc-test</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The runtime environment of the function. Currently supported runtime environments include: nodejs12, nodejs14, nodejs16, nodejs18, nodejs20, go1, python3, python3.9, python3.10, python3.12, java8, java11, php7.2, dotnetcore3.1, custom, custom.debian10, custom.debian11, custom.debian12, and custom-container.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.10</p>
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The session affinity policy for Function Compute invocation requests. To implement request affinity for the MCP SSE protocol, set this parameter to MCP_SSE. To use cookie-based affinity, set this parameter to GENERATED_COOKIE. To use header-based affinity, set this parameter to HEADER_FIELD. If this parameter is not set or is set to NONE, no affinity is applied and requests are routed based on the default scheduling policy of Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_SSE</p>
         */
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * <p>The session affinity configuration that corresponds to the sessionAffinity type. For MCP_SSE affinity, configure MCPSSESessionAffinityConfig. For cookie-based affinity, configure CookieSessionAffinityConfig. For header field affinity, configure HeaderFieldSessionAffinityConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;sseEndpointPath\&quot;:\&quot;/sse\&quot;, \&quot;sessionConcurrencyPerInstance\&quot;:20}</p>
         */
        public Builder sessionAffinityConfig(String sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The timeout period for function execution in seconds. The minimum value is 1, the maximum value is 86400, and the default value is 3. The function is terminated if it exceeds this time limit.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The tracing configuration. After Function Compute is integrated with Tracing Analysis, you can record the time consumed by requests in Function Compute, view the cold start time of functions, and record the time consumed by internal operations of functions.</p>
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * <p>The VPC configuration. After you configure this parameter, the function can access the specified VPC resources.</p>
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public CreateFunctionInput build() {
            return new CreateFunctionInput(this);
        } 

    } 

}
