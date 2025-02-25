// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link LogtailPipelineConfig} extends {@link TeaModel}
 *
 * <p>LogtailPipelineConfig</p>
 */
public class LogtailPipelineConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggregators")
    private java.util.List<java.util.Map<String, ?>> aggregators;

    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("flushers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> flushers;

    @com.aliyun.core.annotation.NameInMap("global")
    private java.util.Map<String, ?> global;

    @com.aliyun.core.annotation.NameInMap("inputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> inputs;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("logSample")
    private String logSample;

    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<java.util.Map<String, ?>> processors;

    private LogtailPipelineConfig(Builder builder) {
        this.aggregators = builder.aggregators;
        this.configName = builder.configName;
        this.createTime = builder.createTime;
        this.flushers = builder.flushers;
        this.global = builder.global;
        this.inputs = builder.inputs;
        this.lastModifyTime = builder.lastModifyTime;
        this.logSample = builder.logSample;
        this.processors = builder.processors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogtailPipelineConfig create() {
        return builder().build();
    }

    /**
     * @return aggregators
     */
    public java.util.List<java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return flushers
     */
    public java.util.List<java.util.Map<String, ?>> getFlushers() {
        return this.flushers;
    }

    /**
     * @return global
     */
    public java.util.Map<String, ?> getGlobal() {
        return this.global;
    }

    /**
     * @return inputs
     */
    public java.util.List<java.util.Map<String, ?>> getInputs() {
        return this.inputs;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return logSample
     */
    public String getLogSample() {
        return this.logSample;
    }

    /**
     * @return processors
     */
    public java.util.List<java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, ?>> aggregators; 
        private String configName; 
        private Long createTime; 
        private java.util.List<java.util.Map<String, ?>> flushers; 
        private java.util.Map<String, ?> global; 
        private java.util.List<java.util.Map<String, ?>> inputs; 
        private Long lastModifyTime; 
        private String logSample; 
        private java.util.List<java.util.Map<String, ?>> processors; 

        /**
         * aggregators.
         */
        public Builder aggregators(java.util.List<java.util.Map<String, ?>> aggregators) {
            this.aggregators = aggregators;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-config</p>
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder flushers(java.util.List<java.util.Map<String, ?>> flushers) {
            this.flushers = flushers;
            return this;
        }

        /**
         * global.
         */
        public Builder global(java.util.Map<String, ?> global) {
            this.global = global;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputs(java.util.List<java.util.Map<String, ?>> inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * logSample.
         */
        public Builder logSample(String logSample) {
            this.logSample = logSample;
            return this;
        }

        /**
         * processors.
         */
        public Builder processors(java.util.List<java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }

        public LogtailPipelineConfig build() {
            return new LogtailPipelineConfig(this);
        } 

    } 

}
