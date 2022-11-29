// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineTemplateSpec} extends {@link TeaModel}
 *
 * <p>PipelineTemplateSpec</p>
 */
public class PipelineTemplateSpec extends TeaModel {
    @NameInMap("context")
    private Context context;

    @NameInMap("contextSchema")
    private java.util.Map < String, ? > contextSchema;

    @NameInMap("tasks")
    private java.util.List < TaskExec > tasks;

    private PipelineTemplateSpec(Builder builder) {
        this.context = builder.context;
        this.contextSchema = builder.contextSchema;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineTemplateSpec create() {
        return builder().build();
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return contextSchema
     */
    public java.util.Map < String, ? > getContextSchema() {
        return this.contextSchema;
    }

    /**
     * @return tasks
     */
    public java.util.List < TaskExec > getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private Context context; 
        private java.util.Map < String, ? > contextSchema; 
        private java.util.List < TaskExec > tasks; 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * JSON schemas for context input.
         */
        public Builder contextSchema(java.util.Map < String, ? > contextSchema) {
            this.contextSchema = contextSchema;
            return this;
        }

        /**
         * Task execution list
         */
        public Builder tasks(java.util.List < TaskExec > tasks) {
            this.tasks = tasks;
            return this;
        }

        public PipelineTemplateSpec build() {
            return new PipelineTemplateSpec(this);
        } 

    } 

}
