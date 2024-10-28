// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRevision")
    private String appRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputsExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < InputsExpression> inputsExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputsExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OutputsExpression> outputsExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    private String revisionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootEntity")
    private String rootEntity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appRevision = builder.appRevision;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.inputsExpression = builder.inputsExpression;
        this.labels = builder.labels;
        this.outputsExpression = builder.outputsExpression;
        this.revisionTag = builder.revisionTag;
        this.rootEntity = builder.rootEntity;
        this.templateName = builder.templateName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public String getLabels() {
        return this.labels;
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

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appRevision; 
        private String clientToken; 
        private String description; 
        private java.util.List < InputsExpression> inputsExpression; 
        private String labels; 
        private java.util.List < OutputsExpression> outputsExpression; 
        private String revisionTag; 
        private String rootEntity; 
        private String templateName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appRevision = request.appRevision;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.inputsExpression = request.inputsExpression;
            this.labels = request.labels;
            this.outputsExpression = request.outputsExpression;
            this.revisionTag = request.revisionTag;
            this.rootEntity = request.rootEntity;
            this.templateName = request.templateName;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppRevision.
         */
        public Builder appRevision(String appRevision) {
            this.putQueryParameter("AppRevision", appRevision);
            this.appRevision = appRevision;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputsExpression(java.util.List < InputsExpression> inputsExpression) {
            String inputsExpressionShrink = shrink(inputsExpression, "InputsExpression", "json");
            this.putBodyParameter("InputsExpression", inputsExpressionShrink);
            this.inputsExpression = inputsExpression;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outputsExpression(java.util.List < OutputsExpression> outputsExpression) {
            String outputsExpressionShrink = shrink(outputsExpression, "OutputsExpression", "json");
            this.putBodyParameter("OutputsExpression", outputsExpressionShrink);
            this.outputsExpression = outputsExpression;
            return this;
        }

        /**
         * RevisionTag.
         */
        public Builder revisionTag(String revisionTag) {
            this.putQueryParameter("RevisionTag", revisionTag);
            this.revisionTag = revisionTag;
            return this;
        }

        /**
         * RootEntity.
         */
        public Builder rootEntity(String rootEntity) {
            this.putQueryParameter("RootEntity", rootEntity);
            this.rootEntity = rootEntity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class InputsExpression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Help")
        private String help;

        @com.aliyun.core.annotation.NameInMap("Required")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("StepOrder")
        private Integer stepOrder;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("VariableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String variableName;

        @com.aliyun.core.annotation.NameInMap("VariableType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String variableType;

        @com.aliyun.core.annotation.NameInMap("VariableValue")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public Integer getStepOrder() {
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
            private Integer stepOrder; 
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * StepOrder.
             */
            public Builder stepOrder(Integer stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Task1</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fastq1</p>
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>File</p>
             */
            public Builder variableType(String variableType) {
                this.variableType = variableType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/file1.fastq</p>
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
    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class OutputsExpression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Help")
        private String help;

        @com.aliyun.core.annotation.NameInMap("Required")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("StepOrder")
        private Integer stepOrder;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("VariableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String variableName;

        @com.aliyun.core.annotation.NameInMap("VariableType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String variableType;

        @com.aliyun.core.annotation.NameInMap("VariableValue")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public Integer getStepOrder() {
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
            private Integer stepOrder; 
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * StepOrder.
             */
            public Builder stepOrder(Integer stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Task1</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>bam</p>
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>File</p>
             */
            public Builder variableType(String variableType) {
                this.variableType = variableType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/file.bam</p>
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
}
