// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SLSTriggerConfig} extends {@link TeaModel}
 *
 * <p>SLSTriggerConfig</p>
 */
public class SLSTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("functionParameter")
    private java.util.Map < String, String > functionParameter;

    @com.aliyun.core.annotation.NameInMap("jobConfig")
    private JobConfig jobConfig;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private SLSTriggerLogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("sourceConfig")
    private SourceConfig sourceConfig;

    private SLSTriggerConfig(Builder builder) {
        this.enable = builder.enable;
        this.functionParameter = builder.functionParameter;
        this.jobConfig = builder.jobConfig;
        this.logConfig = builder.logConfig;
        this.sourceConfig = builder.sourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSTriggerConfig create() {
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
    public SLSTriggerLogConfig getLogConfig() {
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
        private SLSTriggerLogConfig logConfig; 
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
        public Builder logConfig(SLSTriggerLogConfig logConfig) {
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

        public SLSTriggerConfig build() {
            return new SLSTriggerConfig(this);
        } 

    } 

}
