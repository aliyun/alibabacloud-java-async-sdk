// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Hook} extends {@link TeaModel}
 *
 * <p>Hook</p>
 */
public class Hook extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("execution")
    private Execution execution;

    @com.aliyun.core.annotation.NameInMap("match")
    private java.util.List<String> match;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    private Hook(Builder builder) {
        this.description = builder.description;
        this.enable = builder.enable;
        this.event = builder.event;
        this.execution = builder.execution;
        this.match = builder.match;
        this.name = builder.name;
        this.schemaVersion = builder.schemaVersion;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Hook create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return execution
     */
    public Execution getExecution() {
        return this.execution;
    }

    /**
     * @return match
     */
    public java.util.List<String> getMatch() {
        return this.match;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private String description; 
        private Boolean enable; 
        private String event; 
        private Execution execution; 
        private java.util.List<String> match; 
        private String name; 
        private String schemaVersion; 
        private String scope; 

        private Builder() {
        } 

        private Builder(Hook model) {
            this.description = model.description;
            this.enable = model.enable;
            this.event = model.event;
            this.execution = model.execution;
            this.match = model.match;
            this.name = model.name;
            this.schemaVersion = model.schemaVersion;
            this.scope = model.scope;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>检查工具调用中的命令是否安全。</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the Hook is enabled. The Hook is executed only when this parameter is set to true. If not configured, the Hook is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The event processed by the Hook. Each Hook processes only one event.</p>
         * 
         * <strong>example:</strong>
         * <p>ToolStart</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The execution configuration that specifies the synchronous execution, total timeout, number of retries, and invalid return value handling policy for the Hook.</p>
         */
        public Builder execution(Execution execution) {
            this.execution = execution;
            return this;
        }

        /**
         * <p>The list of tool names. Only ToolStart and ToolEnd events perform exact matching based on the actual tool name. Tool names such as Read, Write, Bash, and Edit are supported, but wildcards are not supported. An empty array does not restrict tools. This field is ignored for other events.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Read&quot;,&quot;Write&quot;,&quot;Bash&quot;,&quot;Edit&quot;]</p>
         */
        public Builder match(java.util.List<String> match) {
            this.match = match;
            return this;
        }

        /**
         * <p>The Hook name. Only digits, letters, underscores, and hyphens are allowed. The name cannot be empty. Hooks with the same name are still executed independently in the order of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>command-guard</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The configuration protocol version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The effective scope. Valid values: all, chat, and mission. A value of all indicates that the scope includes Chat and Mission. A value of chat or mission indicates that the scope applies only to the corresponding scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public Hook build() {
            return new Hook(this);
        } 

    } 

    /**
     * 
     * {@link Hook} extends {@link TeaModel}
     *
     * <p>Hook</p>
     */
    public static class Execution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failResult")
        private String failResult;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("maxRetry")
        @com.aliyun.core.annotation.Validation(maximum = 3)
        private Long maxRetry;

        @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
        @com.aliyun.core.annotation.Validation(maximum = 30, minimum = 1)
        private Long timeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Execution(Builder builder) {
            this.failResult = builder.failResult;
            this.instruction = builder.instruction;
            this.maxRetry = builder.maxRetry;
            this.timeoutSeconds = builder.timeoutSeconds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Execution create() {
            return builder().build();
        }

        /**
         * @return failResult
         */
        public String getFailResult() {
            return this.failResult;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return maxRetry
         */
        public Long getMaxRetry() {
            return this.maxRetry;
        }

        /**
         * @return timeoutSeconds
         */
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String failResult; 
            private String instruction; 
            private Long maxRetry; 
            private Long timeoutSeconds; 
            private String type; 

            private Builder() {
            } 

            private Builder(Execution model) {
                this.failResult = model.failResult;
                this.instruction = model.instruction;
                this.maxRetry = model.maxRetry;
                this.timeoutSeconds = model.timeoutSeconds;
                this.type = model.type;
            } 

            /**
             * <p>The handling policy for invalid return values. If the handler return value remains invalid after retries, it is processed as allow or reject.</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder failResult(String failResult) {
                this.failResult = failResult;
                return this;
            }

            /**
             * <p>The execution instruction. The prompt type indicates a prompt, the bash type indicates a Bash script, the python3 type indicates a Python 3 script, and the hint type indicates contextual text directly appended. A non-empty UTF-8 text must be provided for all four types.</p>
             * 
             * <strong>example:</strong>
             * <p>检查当前工具调用是否安全。</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The maximum number of additional attempts after a failure. Valid values: 0 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRetry(Long maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * <p>The timeout period in seconds. Valid values: 1 to 30. All attempts and waits for the Hook share this timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeoutSeconds(Long timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The handler type. Valid values: prompt, bash, python3, and hint.</p>
             * 
             * <strong>example:</strong>
             * <p>prompt</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Execution build() {
                return new Execution(this);
            } 

        } 

    }
}
