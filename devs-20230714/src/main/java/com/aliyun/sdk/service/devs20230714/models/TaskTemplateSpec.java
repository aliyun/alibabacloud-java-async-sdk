// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskTemplateSpec} extends {@link TeaModel}
 *
 * <p>TaskTemplateSpec</p>
 */
public class TaskTemplateSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executeCondition")
    private Condition executeCondition;

    @com.aliyun.core.annotation.NameInMap("worker")
    private TaskWorker worker;

    private TaskTemplateSpec(Builder builder) {
        this.context = builder.context;
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
         * description.
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
