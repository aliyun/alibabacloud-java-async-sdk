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
 * {@link UpdateFunctionInput} extends {@link TeaModel}
 *
 * <p>UpdateFunctionInput</p>
 */
public class UpdateFunctionInput extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("gpuConfig")
    private GPUConfig gpuConfig;

    @com.aliyun.core.annotation.NameInMap("handler")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
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

    @com.aliyun.core.annotation.NameInMap("layers")
    private java.util.List<String> layers;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("polarFsConfig")
    private PolarFsConfig polarFsConfig;

    @com.aliyun.core.annotation.NameInMap("role")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String role;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private String runtime;

    @com.aliyun.core.annotation.NameInMap("sessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityConfig")
    private String sessionAffinityConfig;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private UpdateFunctionInput(Builder builder) {
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
        this.gpuConfig = builder.gpuConfig;
        this.handler = builder.handler;
        this.idleTimeout = builder.idleTimeout;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceIsolationMode = builder.instanceIsolationMode;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.internetAccess = builder.internetAccess;
        this.layers = builder.layers;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.polarFsConfig = builder.polarFsConfig;
        this.role = builder.role;
        this.runtime = builder.runtime;
        this.sessionAffinity = builder.sessionAffinity;
        this.sessionAffinityConfig = builder.sessionAffinityConfig;
        this.timeout = builder.timeout;
        this.tracingConfig = builder.tracingConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionInput create() {
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
        private GPUConfig gpuConfig; 
        private String handler; 
        private Integer idleTimeout; 
        private Integer instanceConcurrency; 
        private String instanceIsolationMode; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Boolean internetAccess; 
        private java.util.List<String> layers; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private PolarFsConfig polarFsConfig; 
        private String role; 
        private String runtime; 
        private String sessionAffinity; 
        private String sessionAffinityConfig; 
        private Integer timeout; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(UpdateFunctionInput model) {
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
            this.gpuConfig = model.gpuConfig;
            this.handler = model.handler;
            this.idleTimeout = model.idleTimeout;
            this.instanceConcurrency = model.instanceConcurrency;
            this.instanceIsolationMode = model.instanceIsolationMode;
            this.instanceLifecycleConfig = model.instanceLifecycleConfig;
            this.internetAccess = model.internetAccess;
            this.layers = model.layers;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.polarFsConfig = model.polarFsConfig;
            this.role = model.role;
            this.runtime = model.runtime;
            this.sessionAffinity = model.sessionAffinity;
            this.sessionAffinityConfig = model.sessionAffinityConfig;
            this.timeout = model.timeout;
            this.tracingConfig = model.tracingConfig;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * code.
         */
        public Builder code(InputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * customContainerConfig.
         */
        public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * customDNS.
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.customDNS = customDNS;
            return this;
        }

        /**
         * customRuntimeConfig.
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.customRuntimeConfig = customRuntimeConfig;
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
         * disableInjectCredentials.
         */
        public Builder disableInjectCredentials(String disableInjectCredentials) {
            this.disableInjectCredentials = disableInjectCredentials;
            return this;
        }

        /**
         * disableOndemand.
         */
        public Builder disableOndemand(Boolean disableOndemand) {
            this.disableOndemand = disableOndemand;
            return this;
        }

        /**
         * diskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * enableLongLiving.
         */
        public Builder enableLongLiving(Boolean enableLongLiving) {
            this.enableLongLiving = enableLongLiving;
            return this;
        }

        /**
         * environmentVariables.
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * gpuConfig.
         */
        public Builder gpuConfig(GPUConfig gpuConfig) {
            this.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * handler.
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * idleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * instanceConcurrency.
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * instanceIsolationMode.
         */
        public Builder instanceIsolationMode(String instanceIsolationMode) {
            this.instanceIsolationMode = instanceIsolationMode;
            return this;
        }

        /**
         * instanceLifecycleConfig.
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * internetAccess.
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * layers.
         */
        public Builder layers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * logConfig.
         */
        public Builder logConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * memorySize.
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * ossMountConfig.
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * polarFsConfig.
         */
        public Builder polarFsConfig(PolarFsConfig polarFsConfig) {
            this.polarFsConfig = polarFsConfig;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * runtime.
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * sessionAffinity.
         */
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * sessionAffinityConfig.
         */
        public Builder sessionAffinityConfig(String sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * tracingConfig.
         */
        public Builder tracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        /**
         * vpcConfig.
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public UpdateFunctionInput build() {
            return new UpdateFunctionInput(this);
        } 

    } 

}
