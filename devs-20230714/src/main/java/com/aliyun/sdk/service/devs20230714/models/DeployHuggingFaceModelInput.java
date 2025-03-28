// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
 *
 * <p>DeployHuggingFaceModelInput</p>
 */
public class DeployHuggingFaceModelInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountID")
    private String accountID;

    @com.aliyun.core.annotation.NameInMap("concurrencyConfig")
    private ConcurrencyConfig concurrencyConfig;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("envName")
    private String envName;

    @com.aliyun.core.annotation.NameInMap("environmentVariables")
    private java.util.Map<String, ?> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("gpuConfig")
    private GpuConfig gpuConfig;

    @com.aliyun.core.annotation.NameInMap("httpTrigger")
    private HttpTrigger httpTrigger;

    @com.aliyun.core.annotation.NameInMap("imageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private LogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("modelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NasConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("originalName")
    private String originalName;

    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("provisionConfig")
    private ProvisionConfig provisionConfig;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("reportStatusURL")
    private String reportStatusURL;

    @com.aliyun.core.annotation.NameInMap("role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private VpcConfig vpcConfig;

    private DeployHuggingFaceModelInput(Builder builder) {
        this.accountID = builder.accountID;
        this.concurrencyConfig = builder.concurrencyConfig;
        this.cpu = builder.cpu;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.envName = builder.envName;
        this.environmentVariables = builder.environmentVariables;
        this.gpuConfig = builder.gpuConfig;
        this.httpTrigger = builder.httpTrigger;
        this.imageName = builder.imageName;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.modelConfig = builder.modelConfig;
        this.name = builder.name;
        this.nasConfig = builder.nasConfig;
        this.originalName = builder.originalName;
        this.projectName = builder.projectName;
        this.provisionConfig = builder.provisionConfig;
        this.region = builder.region;
        this.reportStatusURL = builder.reportStatusURL;
        this.role = builder.role;
        this.timeout = builder.timeout;
        this.traceId = builder.traceId;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployHuggingFaceModelInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountID
     */
    public String getAccountID() {
        return this.accountID;
    }

    /**
     * @return concurrencyConfig
     */
    public ConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
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
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return gpuConfig
     */
    public GpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    /**
     * @return httpTrigger
     */
    public HttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
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
     * @return modelConfig
     */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nasConfig
     */
    public NasConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return originalName
     */
    public String getOriginalName() {
        return this.originalName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return provisionConfig
     */
    public ProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return reportStatusURL
     */
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return vpcConfig
     */
    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private String accountID; 
        private ConcurrencyConfig concurrencyConfig; 
        private Float cpu; 
        private String description; 
        private Integer diskSize; 
        private String envName; 
        private java.util.Map<String, ?> environmentVariables; 
        private GpuConfig gpuConfig; 
        private HttpTrigger httpTrigger; 
        private String imageName; 
        private Integer instanceConcurrency; 
        private LogConfig logConfig; 
        private Integer memorySize; 
        private ModelConfig modelConfig; 
        private String name; 
        private NasConfig nasConfig; 
        private String originalName; 
        private String projectName; 
        private ProvisionConfig provisionConfig; 
        private String region; 
        private String reportStatusURL; 
        private String role; 
        private Integer timeout; 
        private String traceId; 
        private VpcConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(DeployHuggingFaceModelInput model) {
            this.accountID = model.accountID;
            this.concurrencyConfig = model.concurrencyConfig;
            this.cpu = model.cpu;
            this.description = model.description;
            this.diskSize = model.diskSize;
            this.envName = model.envName;
            this.environmentVariables = model.environmentVariables;
            this.gpuConfig = model.gpuConfig;
            this.httpTrigger = model.httpTrigger;
            this.imageName = model.imageName;
            this.instanceConcurrency = model.instanceConcurrency;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.modelConfig = model.modelConfig;
            this.name = model.name;
            this.nasConfig = model.nasConfig;
            this.originalName = model.originalName;
            this.projectName = model.projectName;
            this.provisionConfig = model.provisionConfig;
            this.region = model.region;
            this.reportStatusURL = model.reportStatusURL;
            this.role = model.role;
            this.timeout = model.timeout;
            this.traceId = model.traceId;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * accountID.
         */
        public Builder accountID(String accountID) {
            this.accountID = accountID;
            return this;
        }

        /**
         * concurrencyConfig.
         */
        public Builder concurrencyConfig(ConcurrencyConfig concurrencyConfig) {
            this.concurrencyConfig = concurrencyConfig;
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
         * envName.
         */
        public Builder envName(String envName) {
            this.envName = envName;
            return this;
        }

        /**
         * environmentVariables.
         */
        public Builder environmentVariables(java.util.Map<String, ?> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * gpuConfig.
         */
        public Builder gpuConfig(GpuConfig gpuConfig) {
            this.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * httpTrigger.
         */
        public Builder httpTrigger(HttpTrigger httpTrigger) {
            this.httpTrigger = httpTrigger;
            return this;
        }

        /**
         * imageName.
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
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
         * modelConfig.
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nasConfig.
         */
        public Builder nasConfig(NasConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * originalName.
         */
        public Builder originalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * provisionConfig.
         */
        public Builder provisionConfig(ProvisionConfig provisionConfig) {
            this.provisionConfig = provisionConfig;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * reportStatusURL.
         */
        public Builder reportStatusURL(String reportStatusURL) {
            this.reportStatusURL = reportStatusURL;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder role(String role) {
            this.role = role;
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
         * vpcConfig.
         */
        public Builder vpcConfig(VpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public DeployHuggingFaceModelInput build() {
            return new DeployHuggingFaceModelInput(this);
        } 

    } 

    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class ConcurrencyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reservedConcurrency")
        private Integer reservedConcurrency;

        private ConcurrencyConfig(Builder builder) {
            this.reservedConcurrency = builder.reservedConcurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConcurrencyConfig create() {
            return builder().build();
        }

        /**
         * @return reservedConcurrency
         */
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

        public static final class Builder {
            private Integer reservedConcurrency; 

            private Builder() {
            } 

            private Builder(ConcurrencyConfig model) {
                this.reservedConcurrency = model.reservedConcurrency;
            } 

            /**
             * reservedConcurrency.
             */
            public Builder reservedConcurrency(Integer reservedConcurrency) {
                this.reservedConcurrency = reservedConcurrency;
                return this;
            }

            public ConcurrencyConfig build() {
                return new ConcurrencyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class GpuConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gpuMemorySize")
        private Integer gpuMemorySize;

        @com.aliyun.core.annotation.NameInMap("gpuType")
        private String gpuType;

        private GpuConfig(Builder builder) {
            this.gpuMemorySize = builder.gpuMemorySize;
            this.gpuType = builder.gpuType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuConfig create() {
            return builder().build();
        }

        /**
         * @return gpuMemorySize
         */
        public Integer getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        /**
         * @return gpuType
         */
        public String getGpuType() {
            return this.gpuType;
        }

        public static final class Builder {
            private Integer gpuMemorySize; 
            private String gpuType; 

            private Builder() {
            } 

            private Builder(GpuConfig model) {
                this.gpuMemorySize = model.gpuMemorySize;
                this.gpuType = model.gpuType;
            } 

            /**
             * gpuMemorySize.
             */
            public Builder gpuMemorySize(Integer gpuMemorySize) {
                this.gpuMemorySize = gpuMemorySize;
                return this;
            }

            /**
             * gpuType.
             */
            public Builder gpuType(String gpuType) {
                this.gpuType = gpuType;
                return this;
            }

            public GpuConfig build() {
                return new GpuConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class TriggerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("dsableURLInternet")
        private Boolean dsableURLInternet;

        @com.aliyun.core.annotation.NameInMap("methods")
        private java.util.List<String> methods;

        private TriggerConfig(Builder builder) {
            this.authType = builder.authType;
            this.dsableURLInternet = builder.dsableURLInternet;
            this.methods = builder.methods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return dsableURLInternet
         */
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        /**
         * @return methods
         */
        public java.util.List<String> getMethods() {
            return this.methods;
        }

        public static final class Builder {
            private String authType; 
            private Boolean dsableURLInternet; 
            private java.util.List<String> methods; 

            private Builder() {
            } 

            private Builder(TriggerConfig model) {
                this.authType = model.authType;
                this.dsableURLInternet = model.dsableURLInternet;
                this.methods = model.methods;
            } 

            /**
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * dsableURLInternet.
             */
            public Builder dsableURLInternet(Boolean dsableURLInternet) {
                this.dsableURLInternet = dsableURLInternet;
                return this;
            }

            /**
             * methods.
             */
            public Builder methods(java.util.List<String> methods) {
                this.methods = methods;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class HttpTrigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("qualifier")
        private String qualifier;

        @com.aliyun.core.annotation.NameInMap("triggerConfig")
        private TriggerConfig triggerConfig;

        private HttpTrigger(Builder builder) {
            this.qualifier = builder.qualifier;
            this.triggerConfig = builder.triggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpTrigger create() {
            return builder().build();
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return triggerConfig
         */
        public TriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

        public static final class Builder {
            private String qualifier; 
            private TriggerConfig triggerConfig; 

            private Builder() {
            } 

            private Builder(HttpTrigger model) {
                this.qualifier = model.qualifier;
                this.triggerConfig = model.triggerConfig;
            } 

            /**
             * qualifier.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * triggerConfig.
             */
            public Builder triggerConfig(TriggerConfig triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            public HttpTrigger build() {
                return new HttpTrigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class LogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableInstanceMetrics")
        private Boolean enableInstanceMetrics;

        @com.aliyun.core.annotation.NameInMap("enableRequestMetrics")
        private Boolean enableRequestMetrics;

        @com.aliyun.core.annotation.NameInMap("logBeginRule")
        private String logBeginRule;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private LogConfig(Builder builder) {
            this.enableInstanceMetrics = builder.enableInstanceMetrics;
            this.enableRequestMetrics = builder.enableRequestMetrics;
            this.logBeginRule = builder.logBeginRule;
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return enableInstanceMetrics
         */
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        /**
         * @return enableRequestMetrics
         */
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        /**
         * @return logBeginRule
         */
        public String getLogBeginRule() {
            return this.logBeginRule;
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
            private Boolean enableInstanceMetrics; 
            private Boolean enableRequestMetrics; 
            private String logBeginRule; 
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(LogConfig model) {
                this.enableInstanceMetrics = model.enableInstanceMetrics;
                this.enableRequestMetrics = model.enableRequestMetrics;
                this.logBeginRule = model.logBeginRule;
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * enableInstanceMetrics.
             */
            public Builder enableInstanceMetrics(Boolean enableInstanceMetrics) {
                this.enableInstanceMetrics = enableInstanceMetrics;
                return this;
            }

            /**
             * enableRequestMetrics.
             */
            public Builder enableRequestMetrics(Boolean enableRequestMetrics) {
                this.enableRequestMetrics = enableRequestMetrics;
                return this;
            }

            /**
             * logBeginRule.
             */
            public Builder logBeginRule(String logBeginRule) {
                this.logBeginRule = logBeginRule;
                return this;
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

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class FmkHuggingFaceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("framework")
        private String framework;

        @com.aliyun.core.annotation.NameInMap("task")
        private String task;

        private FmkHuggingFaceConfig(Builder builder) {
            this.framework = builder.framework;
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FmkHuggingFaceConfig create() {
            return builder().build();
        }

        /**
         * @return framework
         */
        public String getFramework() {
            return this.framework;
        }

        /**
         * @return task
         */
        public String getTask() {
            return this.task;
        }

        public static final class Builder {
            private String framework; 
            private String task; 

            private Builder() {
            } 

            private Builder(FmkHuggingFaceConfig model) {
                this.framework = model.framework;
                this.task = model.task;
            } 

            /**
             * framework.
             */
            public Builder framework(String framework) {
                this.framework = framework;
                return this;
            }

            /**
             * task.
             */
            public Builder task(String task) {
                this.task = task;
                return this;
            }

            public FmkHuggingFaceConfig build() {
                return new FmkHuggingFaceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fmkHuggingFaceConfig")
        private FmkHuggingFaceConfig fmkHuggingFaceConfig;

        @com.aliyun.core.annotation.NameInMap("framework")
        private String framework;

        @com.aliyun.core.annotation.NameInMap("multiModelConfig")
        private java.util.List<ModelConfig> multiModelConfig;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("srcModelScopeModelID")
        private String srcModelScopeModelID;

        @com.aliyun.core.annotation.NameInMap("srcModelScopeModelRevision")
        private String srcModelScopeModelRevision;

        @com.aliyun.core.annotation.NameInMap("srcModelScopeToken")
        private String srcModelScopeToken;

        @com.aliyun.core.annotation.NameInMap("srcOssBucket")
        private String srcOssBucket;

        @com.aliyun.core.annotation.NameInMap("srcOssPath")
        private String srcOssPath;

        @com.aliyun.core.annotation.NameInMap("srcOssRegion")
        private String srcOssRegion;

        private ModelConfig(Builder builder) {
            this.fmkHuggingFaceConfig = builder.fmkHuggingFaceConfig;
            this.framework = builder.framework;
            this.multiModelConfig = builder.multiModelConfig;
            this.prefix = builder.prefix;
            this.sourceType = builder.sourceType;
            this.srcModelScopeModelID = builder.srcModelScopeModelID;
            this.srcModelScopeModelRevision = builder.srcModelScopeModelRevision;
            this.srcModelScopeToken = builder.srcModelScopeToken;
            this.srcOssBucket = builder.srcOssBucket;
            this.srcOssPath = builder.srcOssPath;
            this.srcOssRegion = builder.srcOssRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelConfig create() {
            return builder().build();
        }

        /**
         * @return fmkHuggingFaceConfig
         */
        public FmkHuggingFaceConfig getFmkHuggingFaceConfig() {
            return this.fmkHuggingFaceConfig;
        }

        /**
         * @return framework
         */
        public String getFramework() {
            return this.framework;
        }

        /**
         * @return multiModelConfig
         */
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return srcModelScopeModelID
         */
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        /**
         * @return srcModelScopeModelRevision
         */
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        /**
         * @return srcModelScopeToken
         */
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        /**
         * @return srcOssBucket
         */
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        /**
         * @return srcOssPath
         */
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        /**
         * @return srcOssRegion
         */
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

        public static final class Builder {
            private FmkHuggingFaceConfig fmkHuggingFaceConfig; 
            private String framework; 
            private java.util.List<ModelConfig> multiModelConfig; 
            private String prefix; 
            private String sourceType; 
            private String srcModelScopeModelID; 
            private String srcModelScopeModelRevision; 
            private String srcModelScopeToken; 
            private String srcOssBucket; 
            private String srcOssPath; 
            private String srcOssRegion; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.fmkHuggingFaceConfig = model.fmkHuggingFaceConfig;
                this.framework = model.framework;
                this.multiModelConfig = model.multiModelConfig;
                this.prefix = model.prefix;
                this.sourceType = model.sourceType;
                this.srcModelScopeModelID = model.srcModelScopeModelID;
                this.srcModelScopeModelRevision = model.srcModelScopeModelRevision;
                this.srcModelScopeToken = model.srcModelScopeToken;
                this.srcOssBucket = model.srcOssBucket;
                this.srcOssPath = model.srcOssPath;
                this.srcOssRegion = model.srcOssRegion;
            } 

            /**
             * fmkHuggingFaceConfig.
             */
            public Builder fmkHuggingFaceConfig(FmkHuggingFaceConfig fmkHuggingFaceConfig) {
                this.fmkHuggingFaceConfig = fmkHuggingFaceConfig;
                return this;
            }

            /**
             * framework.
             */
            public Builder framework(String framework) {
                this.framework = framework;
                return this;
            }

            /**
             * multiModelConfig.
             */
            public Builder multiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
                this.multiModelConfig = multiModelConfig;
                return this;
            }

            /**
             * prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * srcModelScopeModelID.
             */
            public Builder srcModelScopeModelID(String srcModelScopeModelID) {
                this.srcModelScopeModelID = srcModelScopeModelID;
                return this;
            }

            /**
             * srcModelScopeModelRevision.
             */
            public Builder srcModelScopeModelRevision(String srcModelScopeModelRevision) {
                this.srcModelScopeModelRevision = srcModelScopeModelRevision;
                return this;
            }

            /**
             * srcModelScopeToken.
             */
            public Builder srcModelScopeToken(String srcModelScopeToken) {
                this.srcModelScopeToken = srcModelScopeToken;
                return this;
            }

            /**
             * srcOssBucket.
             */
            public Builder srcOssBucket(String srcOssBucket) {
                this.srcOssBucket = srcOssBucket;
                return this;
            }

            /**
             * srcOssPath.
             */
            public Builder srcOssPath(String srcOssPath) {
                this.srcOssPath = srcOssPath;
                return this;
            }

            /**
             * srcOssRegion.
             */
            public Builder srcOssRegion(String srcOssRegion) {
                this.srcOssRegion = srcOssRegion;
                return this;
            }

            public ModelConfig build() {
                return new ModelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class NasConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<String> mountPoints;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Integer userId;

        private NasConfig(Builder builder) {
            this.groupId = builder.groupId;
            this.mountPoints = builder.mountPoints;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NasConfig create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return mountPoints
         */
        public java.util.List<String> getMountPoints() {
            return this.mountPoints;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer groupId; 
            private java.util.List<String> mountPoints; 
            private Integer userId; 

            private Builder() {
            } 

            private Builder(NasConfig model) {
                this.groupId = model.groupId;
                this.mountPoints = model.mountPoints;
                this.userId = model.userId;
            } 

            /**
             * groupId.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * mountPoints.
             */
            public Builder mountPoints(java.util.List<String> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public NasConfig build() {
                return new NasConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class ScheduledActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scheduleExpression")
        private String scheduleExpression;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("target")
        private Integer target;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        private ScheduledActions(Builder builder) {
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.scheduleExpression = builder.scheduleExpression;
            this.startTime = builder.startTime;
            this.target = builder.target;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledActions create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduleExpression
         */
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return target
         */
        public Integer getTarget() {
            return this.target;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String endTime; 
            private String name; 
            private String scheduleExpression; 
            private String startTime; 
            private Integer target; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(ScheduledActions model) {
                this.endTime = model.endTime;
                this.name = model.name;
                this.scheduleExpression = model.scheduleExpression;
                this.startTime = model.startTime;
                this.target = model.target;
                this.timeZone = model.timeZone;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * scheduleExpression.
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * target.
             */
            public Builder target(Integer target) {
                this.target = target;
                return this;
            }

            /**
             * timeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public ScheduledActions build() {
                return new ScheduledActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class ProvisionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alwaysAllocateGPU")
        private Boolean alwaysAllocateGPU;

        @com.aliyun.core.annotation.NameInMap("scheduledActions")
        private java.util.List<ScheduledActions> scheduledActions;

        @com.aliyun.core.annotation.NameInMap("target")
        private Integer target;

        private ProvisionConfig(Builder builder) {
            this.alwaysAllocateGPU = builder.alwaysAllocateGPU;
            this.scheduledActions = builder.scheduledActions;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProvisionConfig create() {
            return builder().build();
        }

        /**
         * @return alwaysAllocateGPU
         */
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        /**
         * @return scheduledActions
         */
        public java.util.List<ScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        /**
         * @return target
         */
        public Integer getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Boolean alwaysAllocateGPU; 
            private java.util.List<ScheduledActions> scheduledActions; 
            private Integer target; 

            private Builder() {
            } 

            private Builder(ProvisionConfig model) {
                this.alwaysAllocateGPU = model.alwaysAllocateGPU;
                this.scheduledActions = model.scheduledActions;
                this.target = model.target;
            } 

            /**
             * alwaysAllocateGPU.
             */
            public Builder alwaysAllocateGPU(Boolean alwaysAllocateGPU) {
                this.alwaysAllocateGPU = alwaysAllocateGPU;
                return this;
            }

            /**
             * scheduledActions.
             */
            public Builder scheduledActions(java.util.List<ScheduledActions> scheduledActions) {
                this.scheduledActions = scheduledActions;
                return this;
            }

            /**
             * target.
             */
            public Builder target(Integer target) {
                this.target = target;
                return this;
            }

            public ProvisionConfig build() {
                return new ProvisionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHuggingFaceModelInput} extends {@link TeaModel}
     *
     * <p>DeployHuggingFaceModelInput</p>
     */
    public static class VpcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private VpcConfig(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcConfig model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * vSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
}
