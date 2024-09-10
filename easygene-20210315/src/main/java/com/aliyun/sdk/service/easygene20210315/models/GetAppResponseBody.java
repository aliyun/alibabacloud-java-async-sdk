// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppResponseBody</p>
 */
public class GetAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List < Configs> configs;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Dependencies")
    private java.util.List < Dependencies> dependencies;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Documentation")
    private String documentation;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("Inputs")
    private java.util.List < Inputs> inputs;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("LanguageVersion")
    private String languageVersion;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List < Outputs> outputs;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Revision")
    private String revision;

    @com.aliyun.core.annotation.NameInMap("RevisionComment")
    private String revisionComment;

    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    private String revisionTag;

    @com.aliyun.core.annotation.NameInMap("Revisions")
    private java.util.List < Revisions> revisions;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("URL")
    private String URL;

    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private GetAppResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.configs = builder.configs;
        this.createTime = builder.createTime;
        this.definition = builder.definition;
        this.dependencies = builder.dependencies;
        this.description = builder.description;
        this.documentation = builder.documentation;
        this.hostId = builder.hostId;
        this.inputs = builder.inputs;
        this.labels = builder.labels;
        this.language = builder.language;
        this.languageVersion = builder.languageVersion;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.outputs = builder.outputs;
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.revisionComment = builder.revisionComment;
        this.revisionTag = builder.revisionTag;
        this.revisions = builder.revisions;
        this.scope = builder.scope;
        this.source = builder.source;
        this.URL = builder.URL;
        this.workflowName = builder.workflowName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return dependencies
     */
    public java.util.List < Dependencies> getDependencies() {
        return this.dependencies;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documentation
     */
    public String getDocumentation() {
        return this.documentation;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return inputs
     */
    public java.util.List < Inputs> getInputs() {
        return this.inputs;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return languageVersion
     */
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return outputs
     */
    public java.util.List < Outputs> getOutputs() {
        return this.outputs;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public String getRevision() {
        return this.revision;
    }

    /**
     * @return revisionComment
     */
    public String getRevisionComment() {
        return this.revisionComment;
    }

    /**
     * @return revisionTag
     */
    public String getRevisionTag() {
        return this.revisionTag;
    }

    /**
     * @return revisions
     */
    public java.util.List < Revisions> getRevisions() {
        return this.revisions;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return URL
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String appName; 
        private String appType; 
        private java.util.List < Configs> configs; 
        private String createTime; 
        private String definition; 
        private java.util.List < Dependencies> dependencies; 
        private String description; 
        private String documentation; 
        private String hostId; 
        private java.util.List < Inputs> inputs; 
        private java.util.Map < String, String > labels; 
        private String language; 
        private String languageVersion; 
        private String lastModifiedTime; 
        private java.util.List < Outputs> outputs; 
        private String path; 
        private String requestId; 
        private String revision; 
        private String revisionComment; 
        private String revisionTag; 
        private java.util.List < Revisions> revisions; 
        private String scope; 
        private String source; 
        private String URL; 
        private String workflowName; 
        private String workspace; 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Dependencies.
         */
        public Builder dependencies(java.util.List < Dependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Documentation.
         */
        public Builder documentation(String documentation) {
            this.documentation = documentation;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Inputs.
         */
        public Builder inputs(java.util.List < Inputs> inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * LanguageVersion.
         */
        public Builder languageVersion(String languageVersion) {
            this.languageVersion = languageVersion;
            return this;
        }

        /**
         * LastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(java.util.List < Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Revision.
         */
        public Builder revision(String revision) {
            this.revision = revision;
            return this;
        }

        /**
         * RevisionComment.
         */
        public Builder revisionComment(String revisionComment) {
            this.revisionComment = revisionComment;
            return this;
        }

        /**
         * RevisionTag.
         */
        public Builder revisionTag(String revisionTag) {
            this.revisionTag = revisionTag;
            return this;
        }

        /**
         * Revisions.
         */
        public Builder revisions(java.util.List < Revisions> revisions) {
            this.revisions = revisions;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * URL.
         */
        public Builder URL(String URL) {
            this.URL = URL;
            return this;
        }

        /**
         * WorkflowName.
         */
        public Builder workflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetAppResponseBody build() {
            return new GetAppResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Dependencies(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Help")
        private String help;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("StepOrder")
        private Long stepOrder;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("VariableName")
        private String variableName;

        @com.aliyun.core.annotation.NameInMap("VariableType")
        private String variableType;

        @com.aliyun.core.annotation.NameInMap("VariableValue")
        private String variableValue;

        private Inputs(Builder builder) {
            this.help = builder.help;
            this.required = builder.required;
            this.stepOrder = builder.stepOrder;
            this.taskName = builder.taskName;
            this.variableName = builder.variableName;
            this.variableType = builder.variableType;
            this.variableValue = builder.variableValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return help
         */
        public String getHelp() {
            return this.help;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return stepOrder
         */
        public Long getStepOrder() {
            return this.stepOrder;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        /**
         * @return variableType
         */
        public String getVariableType() {
            return this.variableType;
        }

        /**
         * @return variableValue
         */
        public String getVariableValue() {
            return this.variableValue;
        }

        public static final class Builder {
            private String help; 
            private Boolean required; 
            private Long stepOrder; 
            private String taskName; 
            private String variableName; 
            private String variableType; 
            private String variableValue; 

            /**
             * Help.
             */
            public Builder help(String help) {
                this.help = help;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * StepOrder.
             */
            public Builder stepOrder(Long stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * VariableName.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * VariableType.
             */
            public Builder variableType(String variableType) {
                this.variableType = variableType;
                return this;
            }

            /**
             * VariableValue.
             */
            public Builder variableValue(String variableValue) {
                this.variableValue = variableValue;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Help")
        private String help;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("StepOrder")
        private Long stepOrder;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("VariableName")
        private String variableName;

        @com.aliyun.core.annotation.NameInMap("VariableType")
        private String variableType;

        @com.aliyun.core.annotation.NameInMap("VariableValue")
        private String variableValue;

        private Outputs(Builder builder) {
            this.help = builder.help;
            this.required = builder.required;
            this.stepOrder = builder.stepOrder;
            this.taskName = builder.taskName;
            this.variableName = builder.variableName;
            this.variableType = builder.variableType;
            this.variableValue = builder.variableValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return help
         */
        public String getHelp() {
            return this.help;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return stepOrder
         */
        public Long getStepOrder() {
            return this.stepOrder;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        /**
         * @return variableType
         */
        public String getVariableType() {
            return this.variableType;
        }

        /**
         * @return variableValue
         */
        public String getVariableValue() {
            return this.variableValue;
        }

        public static final class Builder {
            private String help; 
            private Boolean required; 
            private Long stepOrder; 
            private String taskName; 
            private String variableName; 
            private String variableType; 
            private String variableValue; 

            /**
             * Help.
             */
            public Builder help(String help) {
                this.help = help;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * StepOrder.
             */
            public Builder stepOrder(Long stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * VariableName.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * VariableType.
             */
            public Builder variableType(String variableType) {
                this.variableType = variableType;
                return this;
            }

            /**
             * VariableValue.
             */
            public Builder variableValue(String variableValue) {
                this.variableValue = variableValue;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    public static class Revisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Revision")
        private String revision;

        @com.aliyun.core.annotation.NameInMap("RevisionComment")
        private String revisionComment;

        @com.aliyun.core.annotation.NameInMap("RevisionTag")
        private String revisionTag;

        private Revisions(Builder builder) {
            this.createTime = builder.createTime;
            this.revision = builder.revision;
            this.revisionComment = builder.revisionComment;
            this.revisionTag = builder.revisionTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Revisions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return revision
         */
        public String getRevision() {
            return this.revision;
        }

        /**
         * @return revisionComment
         */
        public String getRevisionComment() {
            return this.revisionComment;
        }

        /**
         * @return revisionTag
         */
        public String getRevisionTag() {
            return this.revisionTag;
        }

        public static final class Builder {
            private String createTime; 
            private String revision; 
            private String revisionComment; 
            private String revisionTag; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Revision.
             */
            public Builder revision(String revision) {
                this.revision = revision;
                return this;
            }

            /**
             * RevisionComment.
             */
            public Builder revisionComment(String revisionComment) {
                this.revisionComment = revisionComment;
                return this;
            }

            /**
             * RevisionTag.
             */
            public Builder revisionTag(String revisionTag) {
                this.revisionTag = revisionTag;
                return this;
            }

            public Revisions build() {
                return new Revisions(this);
            } 

        } 

    }
}
