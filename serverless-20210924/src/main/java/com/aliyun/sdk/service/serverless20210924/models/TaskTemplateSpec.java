// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskTemplateSpec} extends {@link TeaModel}
 *
 * <p>TaskTemplateSpec</p>
 */
public class TaskTemplateSpec extends TeaModel {
    @NameInMap("context")
    private Context context;

    @NameInMap("contextSchema")
    private java.util.Map < String, ? > contextSchema;

    @NameInMap("description")
    private String description;

    @NameInMap("executeCondition")
    private Condition executeCondition;

    @NameInMap("worker")
    private TaskWorker worker;

    private TaskTemplateSpec(Builder builder) {
        this.context = builder.context;
        this.contextSchema = builder.contextSchema;
        this.description = builder.description;
        this.executeCondition = builder.executeCondition;
        this.worker = builder.worker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskTemplateSpec create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executeCondition
     */
    public Condition getExecuteCondition() {
        return this.executeCondition;
    }

    /**
     * @return worker
     */
    public TaskWorker getWorker() {
        return this.worker;
    }

    public static final class Builder {
        private Context context; 
        private java.util.Map < String, ? > contextSchema; 
        private String description; 
        private Condition executeCondition; 
        private TaskWorker worker; 

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
         * task execution description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * executeCondition.
         */
        public Builder executeCondition(Condition executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }

        /**
         * worker.
         */
        public Builder worker(TaskWorker worker) {
            this.worker = worker;
            return this;
        }

        public TaskTemplateSpec build() {
            return new TaskTemplateSpec(this);
        } 

    } 

}
