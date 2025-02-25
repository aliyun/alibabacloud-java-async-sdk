// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskExec} extends {@link TeaModel}
 *
 * <p>TaskExec</p>
 */
public class TaskExec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("runAfters")
    private java.util.List < RunAfter > runAfters;

    @com.aliyun.core.annotation.NameInMap("taskTemplate")
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * runAfters.
         */
        public Builder runAfters(java.util.List < RunAfter > runAfters) {
            this.runAfters = runAfters;
            return this;
        }

        /**
         * taskTemplate.
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
