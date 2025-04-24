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
 * {@link Function} extends {@link TeaModel}
 *
 * <p>Function</p>
 */
public class Function extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeChecksum")
    private String codeChecksum;

    @com.aliyun.core.annotation.NameInMap("codeSize")
    private Long codeSize;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("customContainerConfig")
    private CustomContainerConfig customContainerConfig;

    @com.aliyun.core.annotation.NameInMap("customDNS")
    private CustomDNS customDNS;

    @com.aliyun.core.annotation.NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disableOndemand")
    private Boolean disableOndemand;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("enableLongLiving")
    private Boolean enableLongLiving;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("functionId")
    private String functionId;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("gpuConfig")
    private GPUConfig gpuConfig;

    @com.aliyun.core.annotation.NameInMap("handler")
    private String handler;

    @com.aliyun.core.annotation.NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("invocationRestriction")
    private FunctionRestriction invocationRestriction;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("lastUpdateStatus")
    private String lastUpdateStatus;

    @com.aliyun.core.annotation.NameInMap("lastUpdateStatusReason")
    private String lastUpdateStatusReason;

    @com.aliyun.core.annotation.NameInMap("lastUpdateStatusReasonCode")
    private String lastUpdateStatusReasonCode;

    @com.aliyun.core.annotation.NameInMap("layers")
    private java.util.List<FunctionLayer> layers;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private String runtime;

    @com.aliyun.core.annotation.NameInMap("sessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("stateReason")
    private String stateReason;

    @com.aliyun.core.annotation.NameInMap("stateReasonCode")
    private String stateReasonCode;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private Function(Builder builder) {
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.cpu = builder.cpu;
        this.createdTime = builder.createdTime;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.disableOndemand = builder.disableOndemand;
        this.diskSize = builder.diskSize;
        this.enableLongLiving = builder.enableLongLiving;
        this.environmentVariables = builder.environmentVariables;
        this.functionArn = builder.functionArn;
        this.functionId = builder.functionId;
        this.functionName = builder.functionName;
        this.gpuConfig = builder.gpuConfig;
        this.handler = builder.handler;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.internetAccess = builder.internetAccess;
        this.invocationRestriction = builder.invocationRestriction;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.lastUpdateStatus = builder.lastUpdateStatus;
        this.lastUpdateStatusReason = builder.lastUpdateStatusReason;
        this.lastUpdateStatusReasonCode = builder.lastUpdateStatusReasonCode;
        this.layers = builder.layers;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.role = builder.role;
        this.runtime = builder.runtime;
        this.sessionAffinity = builder.sessionAffinity;
        this.state = builder.state;
        this.stateReason = builder.stateReason;
        this.stateReasonCode = builder.stateReasonCode;
        this.tags = builder.tags;
        this.timeout = builder.timeout;
        this.tracingConfig = builder.tracingConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Function create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeChecksum
     */
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    /**
     * @return codeSize
     */
    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @return functionId
     */
    public String getFunctionId() {
        return this.functionId;
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
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
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
     * @return invocationRestriction
     */
    public FunctionRestriction getInvocationRestriction() {
        return this.invocationRestriction;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return lastUpdateStatus
     */
    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * @return lastUpdateStatusReason
     */
    public String getLastUpdateStatusReason() {
        return this.lastUpdateStatusReason;
    }

    /**
     * @return lastUpdateStatusReasonCode
     */
    public String getLastUpdateStatusReasonCode() {
        return this.lastUpdateStatusReasonCode;
    }

    /**
     * @return layers
     */
    public java.util.List<FunctionLayer> getLayers() {
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return stateReason
     */
    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * @return stateReasonCode
     */
    public String getStateReasonCode() {
        return this.stateReasonCode;
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
        private String codeChecksum; 
        private Long codeSize; 
        private Float cpu; 
        private String createdTime; 
        private CustomContainerConfig customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private Boolean disableOndemand; 
        private Integer diskSize; 
        private Boolean enableLongLiving; 
        private java.util.Map<String, String> environmentVariables; 
        private String functionArn; 
        private String functionId; 
        private String functionName; 
        private GPUConfig gpuConfig; 
        private String handler; 
        private Integer instanceConcurrency; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Boolean internetAccess; 
        private FunctionRestriction invocationRestriction; 
        private String lastModifiedTime; 
        private String lastUpdateStatus; 
        private String lastUpdateStatusReason; 
        private String lastUpdateStatusReasonCode; 
        private java.util.List<FunctionLayer> layers; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private String role; 
        private String runtime; 
        private String sessionAffinity; 
        private String state; 
        private String stateReason; 
        private String stateReasonCode; 
        private java.util.List<Tag> tags; 
        private Integer timeout; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(Function model) {
            this.codeChecksum = model.codeChecksum;
            this.codeSize = model.codeSize;
            this.cpu = model.cpu;
            this.createdTime = model.createdTime;
            this.customContainerConfig = model.customContainerConfig;
            this.customDNS = model.customDNS;
            this.customRuntimeConfig = model.customRuntimeConfig;
            this.description = model.description;
            this.disableOndemand = model.disableOndemand;
            this.diskSize = model.diskSize;
            this.enableLongLiving = model.enableLongLiving;
            this.environmentVariables = model.environmentVariables;
            this.functionArn = model.functionArn;
            this.functionId = model.functionId;
            this.functionName = model.functionName;
            this.gpuConfig = model.gpuConfig;
            this.handler = model.handler;
            this.instanceConcurrency = model.instanceConcurrency;
            this.instanceLifecycleConfig = model.instanceLifecycleConfig;
            this.internetAccess = model.internetAccess;
            this.invocationRestriction = model.invocationRestriction;
            this.lastModifiedTime = model.lastModifiedTime;
            this.lastUpdateStatus = model.lastUpdateStatus;
            this.lastUpdateStatusReason = model.lastUpdateStatusReason;
            this.lastUpdateStatusReasonCode = model.lastUpdateStatusReasonCode;
            this.layers = model.layers;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.role = model.role;
            this.runtime = model.runtime;
            this.sessionAffinity = model.sessionAffinity;
            this.state = model.state;
            this.stateReason = model.stateReason;
            this.stateReasonCode = model.stateReasonCode;
            this.tags = model.tags;
            this.timeout = model.timeout;
            this.tracingConfig = model.tracingConfig;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * codeChecksum.
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * codeSize.
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
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
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * functionArn.
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * functionId.
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
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
         * instanceConcurrency.
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
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
         * invocationRestriction.
         */
        public Builder invocationRestriction(FunctionRestriction invocationRestriction) {
            this.invocationRestriction = invocationRestriction;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * lastUpdateStatus.
         */
        public Builder lastUpdateStatus(String lastUpdateStatus) {
            this.lastUpdateStatus = lastUpdateStatus;
            return this;
        }

        /**
         * lastUpdateStatusReason.
         */
        public Builder lastUpdateStatusReason(String lastUpdateStatusReason) {
            this.lastUpdateStatusReason = lastUpdateStatusReason;
            return this;
        }

        /**
         * lastUpdateStatusReasonCode.
         */
        public Builder lastUpdateStatusReasonCode(String lastUpdateStatusReasonCode) {
            this.lastUpdateStatusReasonCode = lastUpdateStatusReasonCode;
            return this;
        }

        /**
         * layers.
         */
        public Builder layers(java.util.List<FunctionLayer> layers) {
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
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * stateReason.
         */
        public Builder stateReason(String stateReason) {
            this.stateReason = stateReason;
            return this;
        }

        /**
         * stateReasonCode.
         */
        public Builder stateReasonCode(String stateReasonCode) {
            this.stateReasonCode = stateReasonCode;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
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

        public Function build() {
            return new Function(this);
        } 

    } 

}
