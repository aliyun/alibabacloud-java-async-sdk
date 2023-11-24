// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Application} extends {@link TeaModel}
 *
 * <p>Application</p>
 */
public class Application extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("applicationID")
    private String applicationID;

    @NameInMap("applicationId")
    private String applicationId;

    @NameInMap("applicationName")
    private String applicationName;

    @NameInMap("args")
    private String args;

    @NameInMap("caPort")
    private Integer caPort;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codeSize")
    private Long codeSize;

    @NameInMap("command")
    private String command;

    @NameInMap("cpu")
    private Float cpu;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("customDNS")
    private CustomDNS customDNS;

    @NameInMap("customDomainName")
    private String customDomainName;

    @NameInMap("customHealthCheckConfig")
    private CustomHealthCheckConfig customHealthCheckConfig;

    @NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    private String description;

    @NameInMap("diskSize")
    private Integer diskSize;

    @NameInMap("enableAppMetric")
    private Boolean enableAppMetric;

    @NameInMap("enableArmsAdvanced")
    private Boolean enableArmsAdvanced;

    @NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @NameInMap("gpuMemorySize")
    private Integer gpuMemorySize;

    @NameInMap("handler")
    private String handler;

    @NameInMap("httpTriggerConfig")
    private HTTPTriggerConfig httpTriggerConfig;

    @NameInMap("imageConfig")
    private ImageConfig imageConfig;

    @NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @NameInMap("initializer")
    private String initializer;

    @NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("instanceSoftConcurrency")
    private Integer instanceSoftConcurrency;

    @NameInMap("instanceType")
    private String instanceType;

    @NameInMap("internetAccess")
    private Boolean internetAccess;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("layers")
    private java.util.List < String > layers;

    @NameInMap("layersArnV2")
    private java.util.List < String > layersArnV2;

    @NameInMap("livenessProbe")
    private Probe livenessProbe;

    @NameInMap("logConfig")
    private LogConfig logConfig;

    @NameInMap("memorySize")
    private Integer memorySize;

    @NameInMap("namespace")
    private String namespace;

    @NameInMap("namespaceID")
    private String namespaceID;

    @NameInMap("namespaceName")
    private String namespaceName;

    @NameInMap("nasConfig")
    private NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @NameInMap("runtime")
    private String runtime;

    @NameInMap("scaleConfig")
    private ScaleConfig scaleConfig;

    @NameInMap("slsConfig")
    private SLSConfig slsConfig;

    @NameInMap("startupProbe")
    private Probe startupProbe;

    @NameInMap("timeout")
    private Integer timeout;

    @NameInMap("tracingConfig")
    private TracingConfig tracingConfig;

    @NameInMap("urlInternet")
    private String urlInternet;

    @NameInMap("urlIntranet")
    private String urlIntranet;

    @NameInMap("version")
    private Version version;

    @NameInMap("vpcConfig")
    private VPCConfig vpcConfig;

    private Application(Builder builder) {
        this.requestId = builder.requestId;
        this.applicationID = builder.applicationID;
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.args = builder.args;
        this.caPort = builder.caPort;
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.command = builder.command;
        this.cpu = builder.cpu;
        this.createdTime = builder.createdTime;
        this.customDNS = builder.customDNS;
        this.customDomainName = builder.customDomainName;
        this.customHealthCheckConfig = builder.customHealthCheckConfig;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.enableAppMetric = builder.enableAppMetric;
        this.enableArmsAdvanced = builder.enableArmsAdvanced;
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
        this.lastModifiedTime = builder.lastModifiedTime;
        this.layers = builder.layers;
        this.layersArnV2 = builder.layersArnV2;
        this.livenessProbe = builder.livenessProbe;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.namespace = builder.namespace;
        this.namespaceID = builder.namespaceID;
        this.namespaceName = builder.namespaceName;
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.runtime = builder.runtime;
        this.scaleConfig = builder.scaleConfig;
        this.slsConfig = builder.slsConfig;
        this.startupProbe = builder.startupProbe;
        this.timeout = builder.timeout;
        this.tracingConfig = builder.tracingConfig;
        this.urlInternet = builder.urlInternet;
        this.urlIntranet = builder.urlIntranet;
        this.version = builder.version;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Application create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return applicationID
     */
    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return customDNS
     */
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    /**
     * @return customDomainName
     */
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * @return customHealthCheckConfig
     */
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
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
     * @return enableArmsAdvanced
     */
    public Boolean getEnableArmsAdvanced() {
        return this.enableArmsAdvanced;
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
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return layers
     */
    public java.util.List < String > getLayers() {
        return this.layers;
    }

    /**
     * @return layersArnV2
     */
    public java.util.List < String > getLayersArnV2() {
        return this.layersArnV2;
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceID
     */
    public String getNamespaceID() {
        return this.namespaceID;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
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
     * @return urlInternet
     */
    public String getUrlInternet() {
        return this.urlInternet;
    }

    /**
     * @return urlIntranet
     */
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    /**
     * @return vpcConfig
     */
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private String requestId; 
        private String applicationID; 
        private String applicationId; 
        private String applicationName; 
        private String args; 
        private Integer caPort; 
        private String codeChecksum; 
        private Long codeSize; 
        private String command; 
        private Float cpu; 
        private String createdTime; 
        private CustomDNS customDNS; 
        private String customDomainName; 
        private CustomHealthCheckConfig customHealthCheckConfig; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private Integer diskSize; 
        private Boolean enableAppMetric; 
        private Boolean enableArmsAdvanced; 
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
        private String lastModifiedTime; 
        private java.util.List < String > layers; 
        private java.util.List < String > layersArnV2; 
        private Probe livenessProbe; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private String namespace; 
        private String namespaceID; 
        private String namespaceName; 
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private String runtime; 
        private ScaleConfig scaleConfig; 
        private SLSConfig slsConfig; 
        private Probe startupProbe; 
        private Integer timeout; 
        private TracingConfig tracingConfig; 
        private String urlInternet; 
        private String urlIntranet; 
        private Version version; 
        private VPCConfig vpcConfig; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * applicationID.
         */
        public Builder applicationID(String applicationID) {
            this.applicationID = applicationID;
            return this;
        }

        /**
         * applicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

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
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * customDomainName.
         */
        public Builder customDomainName(String customDomainName) {
            this.customDomainName = customDomainName;
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
         * enableArmsAdvanced.
         */
        public Builder enableArmsAdvanced(Boolean enableArmsAdvanced) {
            this.enableArmsAdvanced = enableArmsAdvanced;
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
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
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
         * layersArnV2.
         */
        public Builder layersArnV2(java.util.List < String > layersArnV2) {
            this.layersArnV2 = layersArnV2;
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
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
         * namespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
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
         * urlInternet.
         */
        public Builder urlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }

        /**
         * urlIntranet.
         */
        public Builder urlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        /**
         * vpcConfig.
         */
        public Builder vpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Application build() {
            return new Application(this);
        } 

    } 

}
