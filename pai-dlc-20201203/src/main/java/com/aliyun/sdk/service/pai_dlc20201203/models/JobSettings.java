// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link JobSettings} extends {@link TeaModel}
 *
 * <p>JobSettings</p>
 */
public class JobSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedSettings")
    private java.util.Map<String, ?> advancedSettings;

    @com.aliyun.core.annotation.NameInMap("AllocateAllRDMADevices")
    private Boolean allocateAllRDMADevices;

    @com.aliyun.core.annotation.NameInMap("AllowUnschedulableNodes")
    private Boolean allowUnschedulableNodes;

    @com.aliyun.core.annotation.NameInMap("BusinessUserId")
    private String businessUserId;

    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.NameInMap("DataJuicerConfig")
    private DataJuicerConfig dataJuicerConfig;

    @com.aliyun.core.annotation.NameInMap("DisableEcsStockCheck")
    private Boolean disableEcsStockCheck;

    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.NameInMap("ElasticSpotJobMaxRestartTimes")
    private Integer elasticSpotJobMaxRestartTimes;

    @com.aliyun.core.annotation.NameInMap("EnableCPUAffinity")
    private Boolean enableCPUAffinity;

    @com.aliyun.core.annotation.NameInMap("EnableDSWDev")
    private Boolean enableDSWDev;

    @com.aliyun.core.annotation.NameInMap("EnableErrorMonitoringInAIMaster")
    private Boolean enableErrorMonitoringInAIMaster;

    @com.aliyun.core.annotation.NameInMap("EnableOssAppend")
    private Boolean enableOssAppend;

    @com.aliyun.core.annotation.NameInMap("EnableRDMA")
    private Boolean enableRDMA;

    @com.aliyun.core.annotation.NameInMap("EnableSanityCheck")
    private Boolean enableSanityCheck;

    @com.aliyun.core.annotation.NameInMap("EnableTideResource")
    private Boolean enableTideResource;

    @com.aliyun.core.annotation.NameInMap("ErrorMonitoringArgs")
    private String errorMonitoringArgs;

    @com.aliyun.core.annotation.NameInMap("JobReservedMinutes")
    private Integer jobReservedMinutes;

    @com.aliyun.core.annotation.NameInMap("JobReservedPolicy")
    private String jobReservedPolicy;

    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.NameInMap("OversoldType")
    private String oversoldType;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("SanityCheckArgs")
    private String sanityCheckArgs;

    @com.aliyun.core.annotation.NameInMap("Shell")
    private String shell;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    private Long terminationGracePeriodSeconds;

    private JobSettings(Builder builder) {
        this.advancedSettings = builder.advancedSettings;
        this.allocateAllRDMADevices = builder.allocateAllRDMADevices;
        this.allowUnschedulableNodes = builder.allowUnschedulableNodes;
        this.businessUserId = builder.businessUserId;
        this.caller = builder.caller;
        this.dataJuicerConfig = builder.dataJuicerConfig;
        this.disableEcsStockCheck = builder.disableEcsStockCheck;
        this.driver = builder.driver;
        this.elasticSpotJobMaxRestartTimes = builder.elasticSpotJobMaxRestartTimes;
        this.enableCPUAffinity = builder.enableCPUAffinity;
        this.enableDSWDev = builder.enableDSWDev;
        this.enableErrorMonitoringInAIMaster = builder.enableErrorMonitoringInAIMaster;
        this.enableOssAppend = builder.enableOssAppend;
        this.enableRDMA = builder.enableRDMA;
        this.enableSanityCheck = builder.enableSanityCheck;
        this.enableTideResource = builder.enableTideResource;
        this.errorMonitoringArgs = builder.errorMonitoringArgs;
        this.jobReservedMinutes = builder.jobReservedMinutes;
        this.jobReservedPolicy = builder.jobReservedPolicy;
        this.modelConfig = builder.modelConfig;
        this.oversoldType = builder.oversoldType;
        this.pipelineId = builder.pipelineId;
        this.sanityCheckArgs = builder.sanityCheckArgs;
        this.shell = builder.shell;
        this.tags = builder.tags;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedSettings
     */
    public java.util.Map<String, ?> getAdvancedSettings() {
        return this.advancedSettings;
    }

    /**
     * @return allocateAllRDMADevices
     */
    public Boolean getAllocateAllRDMADevices() {
        return this.allocateAllRDMADevices;
    }

    /**
     * @return allowUnschedulableNodes
     */
    public Boolean getAllowUnschedulableNodes() {
        return this.allowUnschedulableNodes;
    }

    /**
     * @return businessUserId
     */
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return dataJuicerConfig
     */
    public DataJuicerConfig getDataJuicerConfig() {
        return this.dataJuicerConfig;
    }

    /**
     * @return disableEcsStockCheck
     */
    public Boolean getDisableEcsStockCheck() {
        return this.disableEcsStockCheck;
    }

    /**
     * @return driver
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * @return elasticSpotJobMaxRestartTimes
     */
    public Integer getElasticSpotJobMaxRestartTimes() {
        return this.elasticSpotJobMaxRestartTimes;
    }

    /**
     * @return enableCPUAffinity
     */
    public Boolean getEnableCPUAffinity() {
        return this.enableCPUAffinity;
    }

    /**
     * @return enableDSWDev
     */
    public Boolean getEnableDSWDev() {
        return this.enableDSWDev;
    }

    /**
     * @return enableErrorMonitoringInAIMaster
     */
    public Boolean getEnableErrorMonitoringInAIMaster() {
        return this.enableErrorMonitoringInAIMaster;
    }

    /**
     * @return enableOssAppend
     */
    public Boolean getEnableOssAppend() {
        return this.enableOssAppend;
    }

    /**
     * @return enableRDMA
     */
    public Boolean getEnableRDMA() {
        return this.enableRDMA;
    }

    /**
     * @return enableSanityCheck
     */
    public Boolean getEnableSanityCheck() {
        return this.enableSanityCheck;
    }

    /**
     * @return enableTideResource
     */
    public Boolean getEnableTideResource() {
        return this.enableTideResource;
    }

    /**
     * @return errorMonitoringArgs
     */
    public String getErrorMonitoringArgs() {
        return this.errorMonitoringArgs;
    }

    /**
     * @return jobReservedMinutes
     */
    public Integer getJobReservedMinutes() {
        return this.jobReservedMinutes;
    }

    /**
     * @return jobReservedPolicy
     */
    public String getJobReservedPolicy() {
        return this.jobReservedPolicy;
    }

    /**
     * @return modelConfig
     */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    /**
     * @return oversoldType
     */
    public String getOversoldType() {
        return this.oversoldType;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return sanityCheckArgs
     */
    public String getSanityCheckArgs() {
        return this.sanityCheckArgs;
    }

    /**
     * @return shell
     */
    public String getShell() {
        return this.shell;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return terminationGracePeriodSeconds
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public static final class Builder {
        private java.util.Map<String, ?> advancedSettings; 
        private Boolean allocateAllRDMADevices; 
        private Boolean allowUnschedulableNodes; 
        private String businessUserId; 
        private String caller; 
        private DataJuicerConfig dataJuicerConfig; 
        private Boolean disableEcsStockCheck; 
        private String driver; 
        private Integer elasticSpotJobMaxRestartTimes; 
        private Boolean enableCPUAffinity; 
        private Boolean enableDSWDev; 
        private Boolean enableErrorMonitoringInAIMaster; 
        private Boolean enableOssAppend; 
        private Boolean enableRDMA; 
        private Boolean enableSanityCheck; 
        private Boolean enableTideResource; 
        private String errorMonitoringArgs; 
        private Integer jobReservedMinutes; 
        private String jobReservedPolicy; 
        private ModelConfig modelConfig; 
        private String oversoldType; 
        private String pipelineId; 
        private String sanityCheckArgs; 
        private String shell; 
        private java.util.Map<String, String> tags; 
        private Long terminationGracePeriodSeconds; 

        private Builder() {
        } 

        private Builder(JobSettings model) {
            this.advancedSettings = model.advancedSettings;
            this.allocateAllRDMADevices = model.allocateAllRDMADevices;
            this.allowUnschedulableNodes = model.allowUnschedulableNodes;
            this.businessUserId = model.businessUserId;
            this.caller = model.caller;
            this.dataJuicerConfig = model.dataJuicerConfig;
            this.disableEcsStockCheck = model.disableEcsStockCheck;
            this.driver = model.driver;
            this.elasticSpotJobMaxRestartTimes = model.elasticSpotJobMaxRestartTimes;
            this.enableCPUAffinity = model.enableCPUAffinity;
            this.enableDSWDev = model.enableDSWDev;
            this.enableErrorMonitoringInAIMaster = model.enableErrorMonitoringInAIMaster;
            this.enableOssAppend = model.enableOssAppend;
            this.enableRDMA = model.enableRDMA;
            this.enableSanityCheck = model.enableSanityCheck;
            this.enableTideResource = model.enableTideResource;
            this.errorMonitoringArgs = model.errorMonitoringArgs;
            this.jobReservedMinutes = model.jobReservedMinutes;
            this.jobReservedPolicy = model.jobReservedPolicy;
            this.modelConfig = model.modelConfig;
            this.oversoldType = model.oversoldType;
            this.pipelineId = model.pipelineId;
            this.sanityCheckArgs = model.sanityCheckArgs;
            this.shell = model.shell;
            this.tags = model.tags;
            this.terminationGracePeriodSeconds = model.terminationGracePeriodSeconds;
        } 

        /**
         * <p>The extra advanced parameter settings.</p>
         */
        public Builder advancedSettings(java.util.Map<String, ?> advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * <p>Specifies whether to mount all RDMA network interfaces.</p>
         */
        public Builder allocateAllRDMADevices(Boolean allocateAllRDMADevices) {
            this.allocateAllRDMADevices = allocateAllRDMADevices;
            return this;
        }

        /**
         * AllowUnschedulableNodes.
         */
        public Builder allowUnschedulableNodes(Boolean allowUnschedulableNodes) {
            this.allowUnschedulableNodes = allowUnschedulableNodes;
            return this;
        }

        /**
         * <p>The user ID associated with the job.</p>
         * 
         * <strong>example:</strong>
         * <p>16****</p>
         */
        public Builder businessUserId(String businessUserId) {
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * <p>The caller.</p>
         * 
         * <strong>example:</strong>
         * <p>SilkFlow</p>
         */
        public Builder caller(String caller) {
            this.caller = caller;
            return this;
        }

        /**
         * <p>The DataJuicer task configuration.</p>
         */
        public Builder dataJuicerConfig(DataJuicerConfig dataJuicerConfig) {
            this.dataJuicerConfig = dataJuicerConfig;
            return this;
        }

        /**
         * <p>Specifies whether to skip inventory check. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableEcsStockCheck(Boolean disableEcsStockCheck) {
            this.disableEcsStockCheck = disableEcsStockCheck;
            return this;
        }

        /**
         * <p>The NVIDIA driver configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>535.54.03</p>
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * ElasticSpotJobMaxRestartTimes.
         */
        public Builder elasticSpotJobMaxRestartTimes(Integer elasticSpotJobMaxRestartTimes) {
            this.elasticSpotJobMaxRestartTimes = elasticSpotJobMaxRestartTimes;
            return this;
        }

        /**
         * <p>The CPU affinity setting. This setting is effective only when using general computing subscription resources.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCPUAffinity(Boolean enableCPUAffinity) {
            this.enableCPUAffinity = enableCPUAffinity;
            return this;
        }

        /**
         * EnableDSWDev.
         */
        public Builder enableDSWDev(Boolean enableDSWDev) {
            this.enableDSWDev = enableDSWDev;
            return this;
        }

        /**
         * <p>Specifies whether to enable fault tolerance monitoring for the job. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
            this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
            return this;
        }

        /**
         * <p>Specifies whether to allow OSS append write. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOssAppend(Boolean enableOssAppend) {
            this.enableOssAppend = enableOssAppend;
            return this;
        }

        /**
         * <p>Specifies whether to allow the job to use RDMA. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRDMA(Boolean enableRDMA) {
            this.enableRDMA = enableRDMA;
            return this;
        }

        /**
         * <p>Specifies whether to enable computing power health check for the job. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSanityCheck(Boolean enableSanityCheck) {
            this.enableSanityCheck = enableSanityCheck;
            return this;
        }

        /**
         * <p>Specifies whether to allow the job to use tidal resources. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * <p>The configuration parameters for fault tolerance monitoring after it is enabled, such as whether to enable log hang-based detection.</p>
         * 
         * <strong>example:</strong>
         * <p>--enable-log-hang-detection true</p>
         */
        public Builder errorMonitoringArgs(String errorMonitoringArgs) {
            this.errorMonitoringArgs = errorMonitoringArgs;
            return this;
        }

        /**
         * <p>The retention duration after job completion, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder jobReservedMinutes(Integer jobReservedMinutes) {
            this.jobReservedMinutes = jobReservedMinutes;
            return this;
        }

        /**
         * <p>The retention policy after job completion.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        public Builder jobReservedPolicy(String jobReservedPolicy) {
            this.jobReservedPolicy = jobReservedPolicy;
            return this;
        }

        /**
         * <p>The output model configuration. This parameter is currently effective only in joint training scenarios.</p>
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * <p>The oversold resource usage mode for the job (reject/accept/only accept).</p>
         * 
         * <strong>example:</strong>
         * <p>AcceptQuotaOverSold</p>
         */
        public Builder oversoldType(String oversoldType) {
            this.oversoldType = oversoldType;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pid-12****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The configuration parameters for computing power health check.</p>
         * 
         * <strong>example:</strong>
         * <p>--sanity-check-timing=AfterJobFaultTolerant --sanity-check-timeout-ops=MarkJobFail</p>
         */
        public Builder sanityCheckArgs(String sanityCheckArgs) {
            this.sanityCheckArgs = sanityCheckArgs;
            return this;
        }

        /**
         * Shell.
         */
        public Builder shell(String shell) {
            this.shell = shell;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TerminationGracePeriodSeconds.
         */
        public Builder terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public JobSettings build() {
            return new JobSettings(this);
        } 

    } 

}
