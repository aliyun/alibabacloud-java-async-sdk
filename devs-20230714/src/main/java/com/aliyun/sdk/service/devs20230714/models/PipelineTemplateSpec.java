// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineTemplateSpec} extends {@link TeaModel}
 *
 * <p>PipelineTemplateSpec</p>
 */
public class PipelineTemplateSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List < TaskExec > tasks;

    private PipelineTemplateSpec(Builder builder) {
        this.context = builder.context;
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
     * @return tasks
     */
    public java.util.List < TaskExec > getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private Context context; 
        private java.util.List < TaskExec > tasks; 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * tasks.
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
