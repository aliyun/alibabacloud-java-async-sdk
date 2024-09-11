// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationInput} extends {@link TeaModel}
 *
 * <p>CreateApplicationInput</p>
 */
public class CreateApplicationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicationName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("args")
    private String args;

    @com.aliyun.core.annotation.NameInMap("caPort")
    private Integer caPort;

    @com.aliyun.core.annotation.NameInMap("code")
    private InputCodeLocation code;

    @com.aliyun.core.annotation.NameInMap("command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("customDNS")
    private CustomDNS customDNS;

    @com.aliyun.core.annotation.NameInMap("customHealthCheckConfig")
    private CustomHealthCheckConfig customHealthCheckConfig;

    @com.aliyun.core.annotation.NameInMap("customHostAlias")
    private CustomHostAlias customHostAlias;

    @com.aliyun.core.annotation.NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("enableAppMetric")
    private Boolean enableAppMetric;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @com.aliyun.core.annotation.NameInMap("gpuMemorySize")
    private Integer gpuMemorySize;

    @com.aliyun.core.annotation.NameInMap("handler")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String handler;

    @com.aliyun.core.annotation.NameInMap("httpTriggerConfig")
    private HTTPTriggerConfig httpTriggerConfig;

    @com.aliyun.core.annotation.NameInMap("imageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @com.aliyun.core.annotation.NameInMap("initializer")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String initializer;

    @com.aliyun.core.annotation.NameInMap("instanceConcurrency")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer instanceConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @com.aliyun.core.annotation.NameInMap("instanceSoftConcurrency")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer instanceSoftConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("layers")
    private java.util.List < String > layers;

    @com.aliyun.core.annotation.NameInMap("livenessProbe")
    private Probe livenessProbe;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("namespaceID")
    private String namespaceID;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("programmingLanguage")
    private String programmingLanguage;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private String runtime;

    @com.aliyun.core.annotation.NameInMap("scaleConfig")
    private ScaleConfig scaleConfig;

    @com.aliyun.core.annotation.NameInMap("slsConfig")
    private SLSConfig slsConfig;

    @com.aliyun.core.annotation.NameInMap("startupProbe")
    private Probe startupProbe;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private CreateApplicationInput(Builder builder) {
        this.applicationName = builder.applicationName;
        this.args = builder.args;
        this.caPort = builder.caPort;
        this.code = builder.code;
        this.command = builder.command;
        this.cpu = builder.cpu;
        this.customDNS = builder.customDNS;
        this.customHealthCheckConfig = builder.customHealthCheckConfig;
        this.customHostAlias = builder.customHostAlias;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.enableAppMetric = builder.enableAppMetric;
        this.environmentVariables = builder.environmentVariables;
        this.gpuMemorySize = builder.gpuMemorySize;
        this.handler = builder.handler;
        this.httpTriggerConfig = builder.httpTriggerConfig;
        this.imageConfig = builder.imageConfig;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.instanceSoftConcurrency = builder.instanceSoftConcurrency;
        this.instanceType = builder.instanceType;
        this.internetAccess = builder.internetAccess;
        this.layers = builder.layers;
        this.livenessProbe = builder.livenessProbe;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.namespaceID = builder.namespaceID;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.programmingLanguage = builder.programmingLanguage;
        this.runtime = builder.runtime;
        this.scaleConfig = builder.scaleConfig;
        this.slsConfig = builder.slsConfig;
        this.startupProbe = builder.startupProbe;
        this.timeout = builder.timeout;
        this.tracingConfig = builder.tracingConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationInput create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return caPort
     */
    public Integer getCaPort() {
        return this.caPort;
    }

    /**
     * @return code
     */
    public InputCodeLocation getCode() {
        return this.code;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return customDNS
     */
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    /**
     * @return customHealthCheckConfig
     */
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    /**
     * @return customHostAlias
     */
    public CustomHostAlias getCustomHostAlias() {
        return this.customHostAlias;
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
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return enableAppMetric
     */
    public Boolean getEnableAppMetric() {
        return this.enableAppMetric;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map < String, String > getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return gpuMemorySize
     */
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return httpTriggerConfig
     */
    public HTTPTriggerConfig getHttpTriggerConfig() {
        return this.httpTriggerConfig;
    }

    /**
     * @return imageConfig
     */
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    /**
     * @return initializationTimeout
     */
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    /**
     * @return initializer
     */
    public String getInitializer() {
        return this.initializer;
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
     * @return instanceSoftConcurrency
     */
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
    public java.util.List < String > getLayers() {
        return this.layers;
    }

    /**
     * @return livenessProbe
     */
    public Probe getLivenessProbe() {
        return this.livenessProbe;
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
     * @return namespaceID
     */
    public String getNamespaceID() {
        return this.namespaceID;
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
     * @return programmingLanguage
     */
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return scaleConfig
     */
    public ScaleConfig getScaleConfig() {
        return this.scaleConfig;
    }

    /**
     * @return slsConfig
     */
    public SLSConfig getSlsConfig() {
        return this.slsConfig;
    }

    /**
     * @return startupProbe
     */
    public Probe getStartupProbe() {
        return this.startupProbe;
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
        private String applicationName; 
        private String args; 
        private Integer caPort; 
        private InputCodeLocation code; 
        private String command; 
        private Float cpu; 
        private CustomDNS customDNS; 
        private CustomHealthCheckConfig customHealthCheckConfig; 
        private CustomHostAlias customHostAlias; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private Integer diskSize; 
        private Boolean enableAppMetric; 
        private java.util.Map < String, String > environmentVariables; 
        private Integer gpuMemorySize; 
        private String handler; 
        private HTTPTriggerConfig httpTriggerConfig; 
        private ImageConfig imageConfig; 
        private Integer initializationTimeout; 
        private String initializer; 
        private Integer instanceConcurrency; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Integer instanceSoftConcurrency; 
        private String instanceType; 
        private Boolean internetAccess; 
        private java.util.List < String > layers; 
        private Probe livenessProbe; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private String namespaceID; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private String programmingLanguage; 
        private String runtime; 
        private ScaleConfig scaleConfig; 
        private SLSConfig slsConfig; 
        private Probe startupProbe; 
        private Integer timeout; 
        private TracingConfig tracingConfig; 
        private VPCConfig vpcConfig; 

        /**
         * applicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * args.
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * caPort.
         */
        public Builder caPort(Integer caPort) {
            this.caPort = caPort;
            return this;
        }

        /**
         * code.
         */
        public Builder code(InputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * command.
         */
        public Builder command(String command) {
            this.command = command;
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
         * customDNS.
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.customDNS = customDNS;
            return this;
        }

        /**
         * customHealthCheckConfig.
         */
        public Builder customHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
            this.customHealthCheckConfig = customHealthCheckConfig;
            return this;
        }

        /**
         * customHostAlias.
         */
        public Builder customHostAlias(CustomHostAlias customHostAlias) {
            this.customHostAlias = customHostAlias;
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
         * diskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * enableAppMetric.
         */
        public Builder enableAppMetric(Boolean enableAppMetric) {
            this.enableAppMetric = enableAppMetric;
            return this;
        }

        /**
         * environmentVariables.
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * gpuMemorySize.
         */
        public Builder gpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
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
         * httpTriggerConfig.
         */
        public Builder httpTriggerConfig(HTTPTriggerConfig httpTriggerConfig) {
            this.httpTriggerConfig = httpTriggerConfig;
            return this;
        }

        /**
         * imageConfig.
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * initializationTimeout.
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * initializer.
         */
        public Builder initializer(String initializer) {
            this.initializer = initializer;
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
         * instanceSoftConcurrency.
         */
        public Builder instanceSoftConcurrency(Integer instanceSoftConcurrency) {
            this.instanceSoftConcurrency = instanceSoftConcurrency;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
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
        public Builder layers(java.util.List < String > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * livenessProbe.
         */
        public Builder livenessProbe(Probe livenessProbe) {
            this.livenessProbe = livenessProbe;
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
         * namespaceID.
         */
        public Builder namespaceID(String namespaceID) {
            this.namespaceID = namespaceID;
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
         * programmingLanguage.
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
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
         * scaleConfig.
         */
        public Builder scaleConfig(ScaleConfig scaleConfig) {
            this.scaleConfig = scaleConfig;
            return this;
        }

        /**
         * slsConfig.
         */
        public Builder slsConfig(SLSConfig slsConfig) {
            this.slsConfig = slsConfig;
            return this;
        }

        /**
         * startupProbe.
         */
        public Builder startupProbe(Probe startupProbe) {
            this.startupProbe = startupProbe;
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

        public CreateApplicationInput build() {
            return new CreateApplicationInput(this);
        } 

    } 

}
