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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7070EC3-DF66-58BA-A1DD-A8574FF53143</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stack information.</p>
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
             * <p>The component configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>format_version: IaCService/2021-08-06\ndescription: create ALB\nupstream_input:\n  - name: stack_network\n ...</p>
             */
            public Builder componentContent(String componentContent) {
                this.componentContent = componentContent;
                return this;
            }

            /**
             * <p>The deployment configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>format_version: IaCService/2021-08-06\ndescription: create ALB \nvariable:\n  - name: region\n    type: string\n ...</p>
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
             * <p>The stack configuration.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-24T02:58:53Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current configuration version number, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder currentConfigVersion(String currentConfigVersion) {
                this.currentConfigVersion = currentConfigVersion;
                return this;
            }

            /**
             * <p>The description of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>the description of stack</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The stack name.</p>
             * 
             * <strong>example:</strong>
             * <p>stack-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The RAM role assumed by the system to perform resource change operations during stack deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>TestIacRole</p>
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * <p>The configuration source of the stack. Valid values:</p>
             * <ul>
             * <li>OSS: a template stored in Object Storage Service (OSS).</li>
             * <li>IAC_SERVICE_MODULE: a template created in the automation service console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The path value of the configuration source. The value cannot exceed 1000 characters.</p>
             * <ul>
             * <li>If the source is OSS, the value is in the format of oss::<file link>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
             * <li>If the source is IAC_SERVICE_MODULE, the value is a template ID. Example: mod-xxxxx.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The unique identifier of the stack, which is generated after the stack is created.</p>
             * 
             * <strong>example:</strong>
             * <p>stack-as1d4vld898ppnqxxxxxx</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The stack status.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Name</th>
             * <th>Description</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>Creating</td>
             * <td>The stack is being created.</td>
             * </tr>
             * <tr>
             * <td>Created</td>
             * <td>The stack is created.</td>
             * </tr>
             * <tr>
             * <td>Waiting</td>
             * <td>The stack is waiting for deployment.</td>
             * </tr>
             * <tr>
             * <td>Deploying</td>
             * <td>The stack is being deployed.</td>
             * </tr>
             * <tr>
             * <td>Deployed</td>
             * <td>The stack is deployed.</td>
             * </tr>
             * <tr>
             * <td>Errored</td>
             * <td>The deployment failed.</td>
             * </tr>
             * <tr>
             * <td>Deleting</td>
             * <td>The stack is being deleted.</td>
             * </tr>
             * <tr>
             * <td>Deleted</td>
             * <td>The stack is deleted.</td>
             * </tr>
             * <tr>
             * <td>DeleteFailed</td>
             * <td>The deletion failed.</td>
             * </tr>
             * <tr>
             * <td>DetectTriggered</td>
             * <td>Drift detection is triggered.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The deployment trigger method of the stack. This field is not publicly available.</p>
             * <ul>
             * <li>SetUpdated: triggered by file changes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SetUpdated</p>
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * <p>The directory where the deployment and component configuration files of the stack are located. Set this parameter to / for the root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
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
