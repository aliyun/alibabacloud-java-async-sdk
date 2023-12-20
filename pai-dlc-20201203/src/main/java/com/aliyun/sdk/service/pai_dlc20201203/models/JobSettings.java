// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobSettings} extends {@link TeaModel}
 *
 * <p>JobSettings</p>
 */
public class JobSettings extends TeaModel {
    @NameInMap("AdvancedSettings")
    private java.util.Map < String, ? > advancedSettings;

    @NameInMap("BusinessUserId")
    private String businessUserId;

    @NameInMap("Caller")
    private String caller;

    @NameInMap("Driver")
    private String driver;

    @NameInMap("EnableErrorMonitoringInAIMaster")
    private Boolean enableErrorMonitoringInAIMaster;

    @NameInMap("EnableOssAppend")
    private Boolean enableOssAppend;

    @NameInMap("EnableRDMA")
    private Boolean enableRDMA;

    @NameInMap("EnableSanityCheck")
    private Boolean enableSanityCheck;

    @NameInMap("EnableTideResource")
    private Boolean enableTideResource;

    @NameInMap("ErrorMonitoringArgs")
    private String errorMonitoringArgs;

    @NameInMap("JobReservedMinutes")
    private Integer jobReservedMinutes;

    @NameInMap("JobReservedPolicy")
    private String jobReservedPolicy;

    @NameInMap("OversoldType")
    private String oversoldType;

    @NameInMap("PipelineId")
    private String pipelineId;

    @NameInMap("SanityCheckArgs")
    private String sanityCheckArgs;

    @NameInMap("Tags")
    private java.util.Map < String, String > tags;

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

    /**
     * @return advancedSettings
     */
    public java.util.Map < String, ? > getAdvancedSettings() {
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
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.Map < String, ? > advancedSettings; 
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
        private java.util.Map < String, String > tags; 

        /**
         * AdvancedSettings.
         */
        public Builder advancedSettings(java.util.Map < String, ? > advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * BusinessUserId.
         */
        public Builder businessUserId(String businessUserId) {
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.caller = caller;
            return this;
        }

        /**
         * Driver.
         */
        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * EnableErrorMonitoringInAIMaster.
         */
        public Builder enableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
            this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
            return this;
        }

        /**
         * EnableOssAppend.
         */
        public Builder enableOssAppend(Boolean enableOssAppend) {
            this.enableOssAppend = enableOssAppend;
            return this;
        }

        /**
         * EnableRDMA.
         */
        public Builder enableRDMA(Boolean enableRDMA) {
            this.enableRDMA = enableRDMA;
            return this;
        }

        /**
         * EnableSanityCheck.
         */
        public Builder enableSanityCheck(Boolean enableSanityCheck) {
            this.enableSanityCheck = enableSanityCheck;
            return this;
        }

        /**
         * EnableTideResource.
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * ErrorMonitoringArgs.
         */
        public Builder errorMonitoringArgs(String errorMonitoringArgs) {
            this.errorMonitoringArgs = errorMonitoringArgs;
            return this;
        }

        /**
         * JobReservedMinutes.
         */
        public Builder jobReservedMinutes(Integer jobReservedMinutes) {
            this.jobReservedMinutes = jobReservedMinutes;
            return this;
        }

        /**
         * JobReservedPolicy.
         */
        public Builder jobReservedPolicy(String jobReservedPolicy) {
            this.jobReservedPolicy = jobReservedPolicy;
            return this;
        }

        /**
         * OversoldType.
         */
        public Builder oversoldType(String oversoldType) {
            this.oversoldType = oversoldType;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * SanityCheckArgs.
         */
        public Builder sanityCheckArgs(String sanityCheckArgs) {
            this.sanityCheckArgs = sanityCheckArgs;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.tags = tags;
            return this;
        }

        public JobSettings build() {
            return new JobSettings(this);
        } 

    } 

}
