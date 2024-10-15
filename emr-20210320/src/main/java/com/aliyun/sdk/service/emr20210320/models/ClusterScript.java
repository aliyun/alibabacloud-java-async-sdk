// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClusterScript} extends {@link TeaModel}
 *
 * <p>ClusterScript</p>
 */
public class ClusterScript extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionFailStrategy")
    private String executionFailStrategy;

    @com.aliyun.core.annotation.NameInMap("ExecutionMoment")
    private String executionMoment;

    @com.aliyun.core.annotation.NameInMap("NodeSelect")
    private NodeSelector nodeSelect;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("ScriptArgs")
    private String scriptArgs;

    @com.aliyun.core.annotation.NameInMap("ScriptName")
    private String scriptName;

    @com.aliyun.core.annotation.NameInMap("ScriptPath")
    private String scriptPath;

    private ClusterScript(Builder builder) {
        this.executionFailStrategy = builder.executionFailStrategy;
        this.executionMoment = builder.executionMoment;
        this.nodeSelect = builder.nodeSelect;
        this.priority = builder.priority;
        this.scriptArgs = builder.scriptArgs;
        this.scriptName = builder.scriptName;
        this.scriptPath = builder.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterScript create() {
        return builder().build();
    }

    /**
     * @return executionFailStrategy
     */
    public String getExecutionFailStrategy() {
        return this.executionFailStrategy;
    }

    /**
     * @return executionMoment
     */
    public String getExecutionMoment() {
        return this.executionMoment;
    }

    /**
     * @return nodeSelect
     */
    public NodeSelector getNodeSelect() {
        return this.nodeSelect;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return scriptArgs
     */
    public String getScriptArgs() {
        return this.scriptArgs;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return scriptPath
     */
    public String getScriptPath() {
        return this.scriptPath;
    }

    public static final class Builder {
        private String executionFailStrategy; 
        private String executionMoment; 
        private NodeSelector nodeSelect; 
        private Integer priority; 
        private String scriptArgs; 
        private String scriptName; 
        private String scriptPath; 

        /**
         * ExecutionFailStrategy.
         */
        public Builder executionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }

        /**
         * ExecutionMoment.
         */
        public Builder executionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }

        /**
         * NodeSelect.
         */
        public Builder nodeSelect(NodeSelector nodeSelect) {
            this.nodeSelect = nodeSelect;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * ScriptArgs.
         */
        public Builder scriptArgs(String scriptArgs) {
            this.scriptArgs = scriptArgs;
            return this;
        }

        /**
         * ScriptName.
         */
        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        /**
         * ScriptPath.
         */
        public Builder scriptPath(String scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public ClusterScript build() {
            return new ClusterScript(this);
        } 

    } 

}
