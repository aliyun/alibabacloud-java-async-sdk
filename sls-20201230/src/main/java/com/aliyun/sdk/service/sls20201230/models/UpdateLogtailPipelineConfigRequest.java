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
 * {@link UpdateLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogtailPipelineConfigRequest</p>
 */
public class UpdateLogtailPipelineConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aggregators")
    private java.util.List<java.util.Map<String, ?>> aggregators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("flushers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> flushers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("global")
    private java.util.Map<String, ?> global;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> inputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logSample")
    private String logSample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List<java.util.Map<String, ?>> processors;

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
    public java.util.List<java.util.Map<String, ?>> getAggregators() {
        return this.aggregators;
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

    public static final class Builder extends Request.Builder<UpdateLogtailPipelineConfigRequest, Builder> {
        private String project; 
        private String configName; 
        private java.util.List<java.util.Map<String, ?>> aggregators; 
        private java.util.List<java.util.Map<String, ?>> flushers; 
        private java.util.Map<String, ?> global; 
        private java.util.List<java.util.Map<String, ?>> inputs; 
        private String logSample; 
        private java.util.List<java.util.Map<String, ?>> processors; 

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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logtail pipeline configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-config</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.putBodyParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The aggregation plug-ins.</p>
         * <blockquote>
         * <p> This parameter takes effect only when extended plug-ins are used. You can use only one aggregation plug-in.</p>
         * </blockquote>
         */
        public Builder aggregators(java.util.List<java.util.Map<String, ?>> aggregators) {
            this.putBodyParameter("aggregators", aggregators);
            this.aggregators = aggregators;
            return this;
        }

        /**
         * <p>The output plug-ins.</p>
         * <blockquote>
         * <p> You can configure only one output plug-in.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder flushers(java.util.List<java.util.Map<String, ?>> flushers) {
            this.putBodyParameter("flushers", flushers);
            this.flushers = flushers;
            return this;
        }

        /**
         * <p>The global settings.</p>
         */
        public Builder global(java.util.Map<String, ?> global) {
            this.putBodyParameter("global", global);
            this.global = global;
            return this;
        }

        /**
         * <p>The input plug-ins.</p>
         * <blockquote>
         * <p> You can configure only one input plug-in.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder inputs(java.util.List<java.util.Map<String, ?>> inputs) {
            this.putBodyParameter("inputs", inputs);
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The sample log. You can specify multiple sample logs.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
         */
        public Builder logSample(String logSample) {
            this.putBodyParameter("logSample", logSample);
            this.logSample = logSample;
            return this;
        }

        /**
         * <p>The processing plug-ins.</p>
         * <blockquote>
         * <p> Logtail plug-ins for data processing are classified into native plug-ins and extended plug-ins. For more information, see <a href="https://help.aliyun.com/document_detail/64957.html">Overview of Logtail plug-ins for data processing</a>.</p>
         * </blockquote>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can use native plug-ins only to collect text logs.</p>
         * </li>
         * <li><p>You cannot add native plug-ins and extended plug-ins at a time.</p>
         * </li>
         * <li><p>When you add native plug-ins, take note of the following items:</p>
         * <ul>
         * <li>You must add one of the following Logtail plug-ins for data processing as the first plug-in: Data Parsing (Regex Mode), Data Parsing (Delimiter Mode), Data Parsing (JSON Mode), Data Parsing (NGINX Mode), Data Parsing (Apache Mode), and Data Parsing (IIS Mode).</li>
         * <li>After you add the first plug-in, you can add one Time Parsing plug-in, one Data Filtering plug-in, and multiple Data Masking plug-ins.</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder processors(java.util.List<java.util.Map<String, ?>> processors) {
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
