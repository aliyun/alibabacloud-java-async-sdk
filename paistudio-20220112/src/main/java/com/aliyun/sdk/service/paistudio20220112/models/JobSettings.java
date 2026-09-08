// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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

    @com.aliyun.core.annotation.NameInMap("BusinessUserId")
    private String businessUserId;

    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

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

    @com.aliyun.core.annotation.NameInMap("OversoldType")
    private String oversoldType;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("SanityCheckArgs")
    private String sanityCheckArgs;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    private JobSettings(Builder builder) {
        this.advancedSettings = builder.advancedSettings;
        this.businessUserId = builder.businessUserId;
        this.caller = builder.caller;
        this.driver = builder.driver;
        this.enableErrorMonitoringInAIMaster = builder.enableErrorMonitoringInAIMaster;
        this.enableOssAppend = builder.enableOssAppend;
        this.enableRDMA = builder.enableRDMA;
        this.enableSanityCheck = builder.enableSanityCheck;
        this.enableTideResource = builder.enableTideResource;
        this.errorMonitoringArgs = builder.errorMonitoringArgs;
        this.jobReservedMinutes = builder.jobReservedMinutes;
        this.jobReservedPolicy = builder.jobReservedPolicy;
        this.oversoldType = builder.oversoldType;
        this.pipelineId = builder.pipelineId;
        this.sanityCheckArgs = builder.sanityCheckArgs;
        this.tags = builder.tags;
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
     * @return driver
     */
    public String getDriver() {
        return this.driver;
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
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.Map<String, ?> advancedSettings; 
        private String businessUserId; 
        private String caller; 
        private String driver; 
        private Boolean enableErrorMonitoringInAIMaster; 
        private Boolean enableOssAppend; 
        private Boolean enableRDMA; 
        private Boolean enableSanityCheck; 
        private Boolean enableTideResource; 
        private String errorMonitoringArgs; 
        private Integer jobReservedMinutes; 
        private String jobReservedPolicy; 
        private String oversoldType; 
        private String pipelineId; 
        private String sanityCheckArgs; 
        private java.util.Map<String, String> tags; 

        private Builder() {
        } 

        private Builder(JobSettings model) {
            this.advancedSettings = model.advancedSettings;
            this.businessUserId = model.businessUserId;
            this.caller = model.caller;
            this.driver = model.driver;
            this.enableErrorMonitoringInAIMaster = model.enableErrorMonitoringInAIMaster;
            this.enableOssAppend = model.enableOssAppend;
            this.enableRDMA = model.enableRDMA;
            this.enableSanityCheck = model.enableSanityCheck;
            this.enableTideResource = model.enableTideResource;
            this.errorMonitoringArgs = model.errorMonitoringArgs;
            this.jobReservedMinutes = model.jobReservedMinutes;
            this.jobReservedPolicy = model.jobReservedPolicy;
            this.oversoldType = model.oversoldType;
            this.pipelineId = model.pipelineId;
            this.sanityCheckArgs = model.sanityCheckArgs;
            this.tags = model.tags;
        } 

        /**
         * <p>Additional advanced parameter settings.</p>
         */
        public Builder advancedSettings(java.util.Map<String, ?> advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * <p>User ID associated with the job.</p>
         * 
         * <strong>example:</strong>
         * <p>166924</p>
         */
        public Builder businessUserId(String businessUserId) {
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * <p>Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>SilkFlow</p>
         */
        public Builder caller(String caller) {
            this.caller = caller;
            return this;
        }

        /**
         * <p>NVIDIA driver configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>535.54.03</p>
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * <p>Enable job fault tolerance monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
            this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
            return this;
        }

        /**
         * <p>Enable OSS append writes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOssAppend(Boolean enableOssAppend) {
            this.enableOssAppend = enableOssAppend;
            return this;
        }

        /**
         * <p>Enable the job to use RDMA.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRDMA(Boolean enableRDMA) {
            this.enableRDMA = enableRDMA;
            return this;
        }

        /**
         * <p>Enable computing power health check for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSanityCheck(Boolean enableSanityCheck) {
            this.enableSanityCheck = enableSanityCheck;
            return this;
        }

        /**
         * <p>Enable the job to use tide resources.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * <p>Specify configuration parameters for fault tolerance monitoring, such as whether to enable log hang-based detection.</p>
         * 
         * <strong>example:</strong>
         * <p>--enable-log-hang-detection true</p>
         */
        public Builder errorMonitoringArgs(String errorMonitoringArgs) {
            this.errorMonitoringArgs = errorMonitoringArgs;
            return this;
        }

        /**
         * <p>Duration in minutes to retain the job after completion.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder jobReservedMinutes(Integer jobReservedMinutes) {
            this.jobReservedMinutes = jobReservedMinutes;
            return this;
        }

        /**
         * <p>Policy for retaining the job after completion.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        public Builder jobReservedPolicy(String jobReservedPolicy) {
            this.jobReservedPolicy = jobReservedPolicy;
            return this;
        }

        /**
         * <p>Job\&quot;s oversold resource usage method (not accepted, accepted, or only accepted).</p>
         * 
         * <strong>example:</strong>
         * <p>AcceptQuotaOverSold</p>
         */
        public Builder oversoldType(String oversoldType) {
            this.oversoldType = oversoldType;
            return this;
        }

        /**
         * <p>Workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pid-123456</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>Configuration parameters for computing power health check.</p>
         * 
         * <strong>example:</strong>
         * <p>--sanity-check-timing=AfterJobFaultTolerant --sanity-check-timeout-ops=MarkJobFai</p>
         */
        public Builder sanityCheckArgs(String sanityCheckArgs) {
            this.sanityCheckArgs = sanityCheckArgs;
            return this;
        }

        /**
         * <p>Custom tags.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        public JobSettings build() {
            return new JobSettings(this);
        } 

    } 

}
