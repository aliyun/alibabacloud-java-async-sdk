// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Script} extends {@link TeaModel}
 *
 * <p>Script</p>
 */
public class Script extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutionFailStrategy")
    private String executionFailStrategy;

    @com.aliyun.core.annotation.NameInMap("ExecutionMoment")
    private String executionMoment;

    @com.aliyun.core.annotation.NameInMap("NodeSelector")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeSelector nodeSelector;

    @com.aliyun.core.annotation.NameInMap("Priority")
    @Deprecated
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("ScriptArgs")
    private String scriptArgs;

    @com.aliyun.core.annotation.NameInMap("ScriptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptName;

    @com.aliyun.core.annotation.NameInMap("ScriptPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptPath;

    private Script(Builder builder) {
        this.executionFailStrategy = builder.executionFailStrategy;
        this.executionMoment = builder.executionMoment;
        this.nodeSelector = builder.nodeSelector;
        this.priority = builder.priority;
        this.scriptArgs = builder.scriptArgs;
        this.scriptName = builder.scriptName;
        this.scriptPath = builder.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Script create() {
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
     * @return nodeSelector
     */
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
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
        private NodeSelector nodeSelector; 
        private Integer priority; 
        private String scriptArgs; 
        private String scriptName; 
        private String scriptPath; 

        /**
         * 执行失败策略。
         */
        public Builder executionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }

        /**
         * 脚本的执行时机。
         */
        public Builder executionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }

        /**
         * 节点选择器。
         */
        public Builder nodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * 脚本执行优先级。取值范围：1~100。
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * 脚本执行参数。
         */
        public Builder scriptArgs(String scriptArgs) {
            this.scriptArgs = scriptArgs;
            return this;
        }

        /**
         * 脚本名称。长度为1~64个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、下划线（_）、或者短划线（-）
         */
        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        /**
         * 脚本所在OSS路径。
         */
        public Builder scriptPath(String scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Script build() {
            return new Script(this);
        } 

    } 

}
