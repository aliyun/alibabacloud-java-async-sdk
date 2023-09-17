// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogtailPipelineConfigRequest</p>
 */
public class UpdateLogtailPipelineConfigRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @Body
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Body
    @NameInMap("aggregators")
    private java.util.List < java.util.Map<String, ?>> aggregators;

    @Body
    @NameInMap("flushers")
    @Validation(required = true)
    private java.util.List < java.util.Map<String, ?>> flushers;

    @Body
    @NameInMap("global")
    private java.util.Map < String, ? > global;

    @Body
    @NameInMap("inputs")
    @Validation(required = true)
    private java.util.List < java.util.Map<String, ?>> inputs;

    @Body
    @NameInMap("logSample")
    private String logSample;

    @Body
    @NameInMap("processors")
    private java.util.List < java.util.Map<String, ?>> processors;

    private UpdateLogtailPipelineConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
        this.aggregators = builder.aggregators;
        this.flushers = builder.flushers;
        this.global = builder.global;
        this.inputs = builder.inputs;
        this.logSample = builder.logSample;
        this.processors = builder.processors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogtailPipelineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return aggregators
     */
    public java.util.List < java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
    }

    /**
     * @return flushers
     */
    public java.util.List < java.util.Map<String, ?>> getFlushers() {
        return this.flushers;
    }

    /**
     * @return global
     */
    public java.util.Map < String, ? > getGlobal() {
        return this.global;
    }

    /**
     * @return inputs
     */
    public java.util.List < java.util.Map<String, ?>> getInputs() {
        return this.inputs;
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
    public java.util.List < java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

    public static final class Builder extends Request.Builder<UpdateLogtailPipelineConfigRequest, Builder> {
        private String project; 
        private String configName; 
        private java.util.List < java.util.Map<String, ?>> aggregators; 
        private java.util.List < java.util.Map<String, ?>> flushers; 
        private java.util.Map < String, ? > global; 
        private java.util.List < java.util.Map<String, ?>> inputs; 
        private String logSample; 
        private java.util.List < java.util.Map<String, ?>> processors; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogtailPipelineConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
            this.aggregators = request.aggregators;
            this.flushers = request.flushers;
            this.global = request.global;
            this.inputs = request.inputs;
            this.logSample = request.logSample;
            this.processors = request.processors;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * configName.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.putBodyParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * aggregators.
         */
        public Builder aggregators(java.util.List < java.util.Map<String, ?>> aggregators) {
            this.putBodyParameter("aggregators", aggregators);
            this.aggregators = aggregators;
            return this;
        }

        /**
         * flushers.
         */
        public Builder flushers(java.util.List < java.util.Map<String, ?>> flushers) {
            this.putBodyParameter("flushers", flushers);
            this.flushers = flushers;
            return this;
        }

        /**
         * global.
         */
        public Builder global(java.util.Map < String, ? > global) {
            this.putBodyParameter("global", global);
            this.global = global;
            return this;
        }

        /**
         * inputs.
         */
        public Builder inputs(java.util.List < java.util.Map<String, ?>> inputs) {
            this.putBodyParameter("inputs", inputs);
            this.inputs = inputs;
            return this;
        }

        /**
         * logSample.
         */
        public Builder logSample(String logSample) {
            this.putBodyParameter("logSample", logSample);
            this.logSample = logSample;
            return this;
        }

        /**
         * processors.
         */
        public Builder processors(java.util.List < java.util.Map<String, ?>> processors) {
            this.putBodyParameter("processors", processors);
            this.processors = processors;
            return this;
        }

        @Override
        public UpdateLogtailPipelineConfigRequest build() {
            return new UpdateLogtailPipelineConfigRequest(this);
        } 

    } 

}
