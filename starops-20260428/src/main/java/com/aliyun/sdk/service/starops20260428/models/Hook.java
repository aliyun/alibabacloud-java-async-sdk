// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
    @com.aliyun.core.annotation.NameInMap("debug")
    private Boolean debug;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("execution")
    private Execution execution;

    @com.aliyun.core.annotation.NameInMap("invisible")
    private Boolean invisible;

    @com.aliyun.core.annotation.NameInMap("match")
    private java.util.List<String> match;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    private Hook(Builder builder) {
        this.debug = builder.debug;
        this.description = builder.description;
        this.enable = builder.enable;
        this.event = builder.event;
        this.execution = builder.execution;
        this.invisible = builder.invisible;
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
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
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
     * @return invisible
     */
    public Boolean getInvisible() {
        return this.invisible;
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
        private Boolean debug; 
        private String description; 
        private Boolean enable; 
        private String event; 
        private Execution execution; 
        private Boolean invisible; 
        private java.util.List<String> match; 
        private String name; 
        private String schemaVersion; 
        private String scope; 

        private Builder() {
        } 

        private Builder(Hook model) {
            this.debug = model.debug;
            this.description = model.description;
            this.enable = model.enable;
            this.event = model.event;
            this.execution = model.execution;
            this.invisible = model.invisible;
            this.match = model.match;
            this.name = model.name;
            this.schemaVersion = model.schemaVersion;
            this.scope = model.scope;
        } 

        /**
         * <p>Specifies whether debug mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder debug(Boolean debug) {
            this.debug = debug;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Check whether the command in the tool invoke is safe.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the Hook is enabled. It is executed only when set to true, and is disabled if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The event. Each Hook processes only one event.</p>
         * 
         * <strong>example:</strong>
         * <p>ToolStart</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The execution configuration, which specifies the synchronous execution, total timeout, number of retries, and handling policy for invalid return values of the Hook.</p>
         */
        public Builder execution(Execution execution) {
            this.execution = execution;
            return this;
        }

        /**
         * <p>Specifies whether to hide Hook call events. When set to true, Hook call events are not sent to the frontend, regardless of whether debug mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder invisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }

        /**
         * <p>The tool name list. Only ToolStart and ToolEnd perform an exact match on the actual tool names. Tool names such as Read, Write, Bash, and Edit are supported, but wildcards are not supported. An empty array imposes no restrictions on tools, and this field is ignored for other events.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Read&quot;,&quot;Write&quot;,&quot;Bash&quot;,&quot;Edit&quot;]</p>
         */
        public Builder match(java.util.List<String> match) {
            this.match = match;
            return this;
        }

        /**
         * <p>The Hook name. Only digits, letters, underscores, and hyphens are allowed, and it cannot be empty. Hooks with the same name are executed independently in the order they appear in the list.</p>
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
         * <p>The effective scope. A value of all applies to both Chat and Mission scenarios. A value of chat or mission applies only to the corresponding scenario.</p>
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
             * <p>The execution instruction. For the prompt type, it is a prompt. For the bash type, it is a Bash script. For the python3 type, it is a Python 3 script. For the hint type, it is text directly appended to the contextual text. Non-empty UTF-8 text must be provided for all four types.</p>
             * 
             * <strong>example:</strong>
             * <p>Check whether the current tool invoke is safe.</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The maximum number of retries, which specifies the number of additional attempts after a failure. Valid values: 0 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRetry(Long maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * <p>The timeout in seconds, ranging from 1 to 30 seconds. All attempts and waits for this Hook share this timeout.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeoutSeconds(Long timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The handler type. Only prompt, bash, python3, and hint are supported.</p>
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
