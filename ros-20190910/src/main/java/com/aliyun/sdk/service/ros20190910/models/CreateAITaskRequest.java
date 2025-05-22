// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link CreateAITaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAITaskRequest</p>
 */
public class CreateAITaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private CreateAITaskRequest(Builder builder) {
        super(builder);
        this.prompt = builder.prompt;
        this.taskType = builder.taskType;
        this.template = builder.template;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAITaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateAITaskRequest, Builder> {
        private String prompt; 
        private String taskType; 
        private String template; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAITaskRequest request) {
            super(request);
            this.prompt = request.prompt;
            this.taskType = request.taskType;
            this.template = request.template;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The input description for the AI task.</p>
         * <ul>
         * <li>When the task type is Generate Template, this parameter specifies the functionality of the template to be generated.</li>
         * <li>When the task type is FixTemplate, this parameter can describe how the template should be repaired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>创建一台ECS，部署nignx服务</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The type of AI task. Values:</p>
         * <ul>
         * <li>GenerateTemplate: AI template generation</li>
         * <li>FixTemplate: AI template repair</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GenerateTemplate</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>When the task type is AI template repair, specify the original template that needs to be fixed or modified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        public Builder template(String template) {
            this.putBodyParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The type of the template to be generated or repaired. Default is ROS.</p>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateAITaskRequest build() {
            return new CreateAITaskRequest(this);
        } 

    } 

}
