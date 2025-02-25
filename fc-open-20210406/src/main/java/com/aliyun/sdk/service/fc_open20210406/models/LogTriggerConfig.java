// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogTriggerConfig} extends {@link TeaModel}
 *
 * <p>LogTriggerConfig</p>
 */
public class LogTriggerConfig extends TeaModel {
    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("functionParameter")
    private java.util.Map < String, String > functionParameter;

    @NameInMap("jobConfig")
    private JobConfig jobConfig;

    @NameInMap("logConfig")
    private JobLogConfig logConfig;

    @NameInMap("sourceConfig")
    private SourceConfig sourceConfig;

    private LogTriggerConfig(Builder builder) {
        this.enable = builder.enable;
        this.functionParameter = builder.functionParameter;
        this.jobConfig = builder.jobConfig;
        this.logConfig = builder.logConfig;
        this.sourceConfig = builder.sourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return functionParameter
     */
    public java.util.Map < String, String > getFunctionParameter() {
        return this.functionParameter;
    }

    /**
     * @return jobConfig
     */
    public JobConfig getJobConfig() {
        return this.jobConfig;
    }

    /**
     * @return logConfig
     */
    public JobLogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return sourceConfig
     */
    public SourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public static final class Builder {
        private Boolean enable; 
        private java.util.Map < String, String > functionParameter; 
        private JobConfig jobConfig; 
        private JobLogConfig logConfig; 
        private SourceConfig sourceConfig; 

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * functionParameter.
         */
        public Builder functionParameter(java.util.Map < String, String > functionParameter) {
            this.functionParameter = functionParameter;
            return this;
        }

        /**
         * jobConfig.
         */
        public Builder jobConfig(JobConfig jobConfig) {
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * logConfig.
         */
        public Builder logConfig(JobLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * sourceConfig.
         */
        public Builder sourceConfig(SourceConfig sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }

        public LogTriggerConfig build() {
            return new LogTriggerConfig(this);
        } 

    } 

}
