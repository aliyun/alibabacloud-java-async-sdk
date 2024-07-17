// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LifecycleTask} extends {@link TeaModel}
 *
 * <p>LifecycleTask</p>
 */
public class LifecycleTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("LifecycleRule")
    private LifecycleRule lifecycleRule;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("WorkflowInstance")
    private WorkflowInstance workflowInstance;

    private LifecycleTask(Builder builder) {
        this.bizId = builder.bizId;
        this.lifecycleRule = builder.lifecycleRule;
        this.name = builder.name;
        this.workflowInstance = builder.workflowInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LifecycleTask create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return lifecycleRule
     */
    public LifecycleRule getLifecycleRule() {
        return this.lifecycleRule;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workflowInstance
     */
    public WorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

    public static final class Builder {
        private String bizId; 
        private LifecycleRule lifecycleRule; 
        private String name; 
        private WorkflowInstance workflowInstance; 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * LifecycleRule.
         */
        public Builder lifecycleRule(LifecycleRule lifecycleRule) {
            this.lifecycleRule = lifecycleRule;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * WorkflowInstance.
         */
        public Builder workflowInstance(WorkflowInstance workflowInstance) {
            this.workflowInstance = workflowInstance;
            return this;
        }

        public LifecycleTask build() {
            return new LifecycleTask(this);
        } 

    } 

}
