// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateCustomScriptTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomScriptTemplateRequest</p>
 */
public class CreateCustomScriptTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelsJson")
    private String labelsJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptJson")
    private String promptJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    private CreateCustomScriptTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.labelsJson = builder.labelsJson;
        this.model = builder.model;
        this.name = builder.name;
        this.prompt = builder.prompt;
        this.promptJson = builder.promptJson;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomScriptTemplateRequest create() {
        return builder().build();
    }

@Override
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labelsJson
     */
    public String getLabelsJson() {
        return this.labelsJson;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptJson
     */
    public String getPromptJson() {
        return this.promptJson;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<CreateCustomScriptTemplateRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String labelsJson; 
        private String model; 
        private String name; 
        private String prompt; 
        private String promptJson; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomScriptTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.labelsJson = request.labelsJson;
            this.model = request.model;
            this.name = request.name;
            this.prompt = request.prompt;
            this.promptJson = request.promptJson;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>The description of the custom scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a large language model bot</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The label descriptions in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;Delivered\&quot;,\&quot;description\&quot;:\&quot;Whether the purchased home appliance has been delivered\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;Yes\\\&quot;,\\\&quot;No\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;Appointment Time\&quot;,\&quot;description\&quot;:\&quot;Collect the customer\&quot;s expected on-site installation time\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
         */
        public Builder labelsJson(String labelsJson) {
            this.putBodyParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * <p>The ID of the model used to create the template.</p>
         * 
         * <strong>example:</strong>
         * <p>model_002</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The name of the custom scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scenario</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The prompt for professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest welfare activities to players over the phone to ensure that every player can get the information in time and enjoy the game.\nSkills: As a game customer service representative, recommend time-limited game welfare activities to users, highlight the benefits, and inform them of the participation process.\nConstraints: You need to remember that you are Annie,</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The agent configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Xiao X&quot;,&quot;gender&quot;:&quot;Male&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;Game Promoter&quot;,&quot;communicationStyle&quot;:[&quot;Friendly&quot;],&quot;goals&quot;:&quot;Hello&quot;,&quot;background&quot;:&quot;Not very good&quot;,&quot;openingPrompt&quot;:&quot;Hello, I am XXX&quot;}</p>
         */
        public Builder promptJson(String promptJson) {
            this.putBodyParameter("PromptJson", promptJson);
            this.promptJson = promptJson;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>43972417-0657-452a-81c2-c59d8245a9b2</p>
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public CreateCustomScriptTemplateRequest build() {
            return new CreateCustomScriptTemplateRequest(this);
        } 

    } 

}
