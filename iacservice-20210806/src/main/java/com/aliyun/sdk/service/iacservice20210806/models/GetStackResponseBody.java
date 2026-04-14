// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResponseBody</p>
 */
public class GetStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stack")
    private Stack stack;

    private GetStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stack = builder.stack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stack
     */
    public Stack getStack() {
        return this.stack;
    }

    public static final class Builder {
        private String requestId; 
        private Stack stack; 

        private Builder() {
        } 

        private Builder(GetStackResponseBody model) {
            this.requestId = model.requestId;
            this.stack = model.stack;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * stack.
         */
        public Builder stack(Stack stack) {
            this.stack = stack;
            return this;
        }

        public GetStackResponseBody build() {
            return new GetStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentContent")
        private String componentContent;

        @com.aliyun.core.annotation.NameInMap("deploymentContent")
        private String deploymentContent;

        private Config(Builder builder) {
            this.componentContent = builder.componentContent;
            this.deploymentContent = builder.deploymentContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return componentContent
         */
        public String getComponentContent() {
            return this.componentContent;
        }

        /**
         * @return deploymentContent
         */
        public String getDeploymentContent() {
            return this.deploymentContent;
        }

        public static final class Builder {
            private String componentContent; 
            private String deploymentContent; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.componentContent = model.componentContent;
                this.deploymentContent = model.deploymentContent;
            } 

            /**
             * componentContent.
             */
            public Builder componentContent(String componentContent) {
                this.componentContent = componentContent;
                return this;
            }

            /**
             * deploymentContent.
             */
            public Builder deploymentContent(String deploymentContent) {
                this.deploymentContent = deploymentContent;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class Stack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentConfigVersion")
        private String currentConfigVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ramRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("stackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        @com.aliyun.core.annotation.NameInMap("workingDirectory")
        private String workingDirectory;

        private Stack(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.currentConfigVersion = builder.currentConfigVersion;
            this.description = builder.description;
            this.name = builder.name;
            this.ramRole = builder.ramRole;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.stackId = builder.stackId;
            this.status = builder.status;
            this.triggerStrategy = builder.triggerStrategy;
            this.workingDirectory = builder.workingDirectory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stack create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentConfigVersion
         */
        public String getCurrentConfigVersion() {
            return this.currentConfigVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        /**
         * @return workingDirectory
         */
        public String getWorkingDirectory() {
            return this.workingDirectory;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private String currentConfigVersion; 
            private String description; 
            private String name; 
            private String ramRole; 
            private String source; 
            private String sourcePath; 
            private String stackId; 
            private String status; 
            private String triggerStrategy; 
            private String workingDirectory; 

            private Builder() {
            } 

            private Builder(Stack model) {
                this.config = model.config;
                this.createTime = model.createTime;
                this.currentConfigVersion = model.currentConfigVersion;
                this.description = model.description;
                this.name = model.name;
                this.ramRole = model.ramRole;
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.stackId = model.stackId;
                this.status = model.status;
                this.triggerStrategy = model.triggerStrategy;
                this.workingDirectory = model.workingDirectory;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * currentConfigVersion.
             */
            public Builder currentConfigVersion(String currentConfigVersion) {
                this.currentConfigVersion = currentConfigVersion;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ramRole.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * stackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * workingDirectory.
             */
            public Builder workingDirectory(String workingDirectory) {
                this.workingDirectory = workingDirectory;
                return this;
            }

            public Stack build() {
                return new Stack(this);
            } 

        } 

    }
}
