// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineTriggerSpec} extends {@link TeaModel}
 *
 * <p>PipelineTriggerSpec</p>
 */
public class PipelineTriggerSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eventFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private EventFilterConfig eventFilter;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("runPipeline")
    private RunPipelineConfig runPipeline;

    private PipelineTriggerSpec(Builder builder) {
        this.eventFilter = builder.eventFilter;
        this.roleArn = builder.roleArn;
        this.runPipeline = builder.runPipeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineTriggerSpec create() {
        return builder().build();
    }

    /**
     * @return eventFilter
     */
    public EventFilterConfig getEventFilter() {
        return this.eventFilter;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return runPipeline
     */
    public RunPipelineConfig getRunPipeline() {
        return this.runPipeline;
    }

    public static final class Builder {
        private EventFilterConfig eventFilter; 
        private String roleArn; 
        private RunPipelineConfig runPipeline; 

        /**
         * eventFilter.
         */
        public Builder eventFilter(EventFilterConfig eventFilter) {
            this.eventFilter = eventFilter;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * runPipeline.
         */
        public Builder runPipeline(RunPipelineConfig runPipeline) {
            this.runPipeline = runPipeline;
            return this;
        }

        public PipelineTriggerSpec build() {
            return new PipelineTriggerSpec(this);
        } 

    } 

}
