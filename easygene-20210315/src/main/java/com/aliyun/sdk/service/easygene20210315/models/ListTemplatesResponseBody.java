// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List < Templates> templates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplatesResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Templates> templates; 
        private Integer totalCount; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplatesResponseBody build() {
            return new ListTemplatesResponseBody(this);
        } 

    } 

    public static class InputsExpression extends TeaModel {
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

        private InputsExpression(Builder builder) {
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

        public static InputsExpression create() {
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

            public InputsExpression build() {
                return new InputsExpression(this);
            } 

        } 

    }
    public static class OutputsExpression extends TeaModel {
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

        private OutputsExpression(Builder builder) {
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

        public static OutputsExpression create() {
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

            public OutputsExpression build() {
                return new OutputsExpression(this);
            } 

        } 

    }
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppRevision")
        private String appRevision;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputsExpression")
        private java.util.List < InputsExpression> inputsExpression;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map < String, String > labels;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputsExpression")
        private java.util.List < OutputsExpression> outputsExpression;

        @com.aliyun.core.annotation.NameInMap("RevisionTag")
        private String revisionTag;

        @com.aliyun.core.annotation.NameInMap("RootEntity")
        private String rootEntity;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Templates(Builder builder) {
            this.appName = builder.appName;
            this.appRevision = builder.appRevision;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.inputsExpression = builder.inputsExpression;
            this.labels = builder.labels;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.outputsExpression = builder.outputsExpression;
            this.revisionTag = builder.revisionTag;
            this.rootEntity = builder.rootEntity;
            this.templateName = builder.templateName;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appRevision
         */
        public String getAppRevision() {
            return this.appRevision;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputsExpression
         */
        public java.util.List < InputsExpression> getInputsExpression() {
            return this.inputsExpression;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, String > getLabels() {
            return this.labels;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return outputsExpression
         */
        public java.util.List < OutputsExpression> getOutputsExpression() {
            return this.outputsExpression;
        }

        /**
         * @return revisionTag
         */
        public String getRevisionTag() {
            return this.revisionTag;
        }

        /**
         * @return rootEntity
         */
        public String getRootEntity() {
            return this.rootEntity;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String appName; 
            private String appRevision; 
            private String createTime; 
            private String description; 
            private java.util.List < InputsExpression> inputsExpression; 
            private java.util.Map < String, String > labels; 
            private String lastModifiedTime; 
            private java.util.List < OutputsExpression> outputsExpression; 
            private String revisionTag; 
            private String rootEntity; 
            private String templateName; 
            private String workspace; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppRevision.
             */
            public Builder appRevision(String appRevision) {
                this.appRevision = appRevision;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputsExpression.
             */
            public Builder inputsExpression(java.util.List < InputsExpression> inputsExpression) {
                this.inputsExpression = inputsExpression;
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
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * OutputsExpression.
             */
            public Builder outputsExpression(java.util.List < OutputsExpression> outputsExpression) {
                this.outputsExpression = outputsExpression;
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
             * RootEntity.
             */
            public Builder rootEntity(String rootEntity) {
                this.rootEntity = rootEntity;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
