// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskExec} extends {@link TeaModel}
 *
 * <p>TaskExec</p>
 */
public class TaskExec extends TeaModel {
    @NameInMap("context")
    private Context context;

    @NameInMap("name")
    private String name;

    @NameInMap("runAfters")
    private java.util.List < RunAfter > runAfters;

    @NameInMap("taskTemplate")
    private String taskTemplate;

    private TaskExec(Builder builder) {
        this.context = builder.context;
        this.name = builder.name;
        this.runAfters = builder.runAfters;
        this.taskTemplate = builder.taskTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskExec create() {
        return builder().build();
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return runAfters
     */
    public java.util.List < RunAfter > getRunAfters() {
        return this.runAfters;
    }

    /**
     * @return taskTemplate
     */
    public String getTaskTemplate() {
        return this.taskTemplate;
    }

    public static final class Builder {
        private Context context; 
        private String name; 
        private java.util.List < RunAfter > runAfters; 
        private String taskTemplate; 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * task name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * current task must run after all these tasks
         */
        public Builder runAfters(java.util.List < RunAfter > runAfters) {
            this.runAfters = runAfters;
            return this;
        }

        /**
         * task template name
         */
        public Builder taskTemplate(String taskTemplate) {
            this.taskTemplate = taskTemplate;
            return this;
        }

        public TaskExec build() {
            return new TaskExec(this);
        } 

    } 

}
