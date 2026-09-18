// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateAttackTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateAttackTargetRequest</p>
 */
public class CreateAttackTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionConfig")
    private String connectionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private CreateAttackTargetRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.connectionConfig = builder.connectionConfig;
        this.connectionMethod = builder.connectionMethod;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.modelName = builder.modelName;
        this.provider = builder.provider;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAttackTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return connectionConfig
     */
    public String getConnectionConfig() {
        return this.connectionConfig;
    }

    /**
     * @return connectionMethod
     */
    public String getConnectionMethod() {
        return this.connectionMethod;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateAttackTargetRequest, Builder> {
        private String apiKey; 
        private String connectionConfig; 
        private String connectionMethod; 
        private String description; 
        private String endpoint; 
        private String modelName; 
        private String provider; 
        private String targetName; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAttackTargetRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.connectionConfig = request.connectionConfig;
            this.connectionMethod = request.connectionMethod;
            this.description = request.description;
            this.endpoint = request.endpoint;
            this.modelName = request.modelName;
            this.provider = request.provider;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The API key for the target model service, used to authenticate with the endpoint. The key is encrypted and stored after submission. Subsequent queries do not return the plaintext value. When ConnectionMethod is set to enterprise_relay, the actual credentials are held by the corporate internal network agent. Transmit the key over HTTPS and avoid exposing it in plaintext in logs, URLs, or client code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-abcd1234****</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The advanced connection configuration in JSON string format. Common fields: authType (authentication type. custom_header: custom request header authentication. none: no authentication), customAuthHeaderName (custom authentication header name, such as X-API-Key), and requestHeaders (additional HTTP request header key-value pairs).</p>
         * <p>Common provider configuration templates ({{prompt}} is a prompt placeholder that you replace with the actual service value. When authType is set to bearer, the token is injected from ApiKey and the template does not contain credentials):</p>
         * <ul>
         * <li>Bailian: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;{{prompt}}\&quot;},\&quot;parameters\&quot;:{\&quot;incremental_output\&quot;:true},\&quot;debug\&quot;:{}}&quot;,&quot;messageJsonPath&quot;:&quot;$.output.text&quot;,&quot;requestHeaders&quot;:&quot;{\&quot;X-DashScope-SSE\&quot;: \&quot;enable\&quot; }&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>PAI: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:60000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{\&quot;question\&quot;:\&quot;{{prompt}}\&quot;,\&quot;chat_history\&quot;:[]},\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.outputs.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>Dify: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{},\&quot;query\&quot;:\&quot;{{prompt}}\&quot;,\&quot;response_mode\&quot;:\&quot;streaming\&quot;,\&quot;conversation_id\&quot;:\&quot;\&quot;,\&quot;user\&quot;:\&quot;scanner\&quot;}&quot;,&quot;messageJsonPath&quot;:&quot;$.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>AgentRun: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;custom_header&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}],\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.choices[0].delta.content&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;customAuthHeaderName&quot;:&quot;X-API-Key&quot;,&quot;stream&quot;:true}</li>
         * <li>AgentKit: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}]}&quot;,&quot;messageJsonPath&quot;:&quot;$.content.parts[0].text&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}
         * When ConnectionMethod is set to enterprise_relay, you can use the protocol field to specify the tunnel protocol (defaults to openai). The provider configuration templates above apply only to non-enterprise_relay connections.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;httpMethod\&quot;:\&quot;POST\&quot;,\&quot;authType\&quot;:\&quot;bearer\&quot;,\&quot;timeoutMs\&quot;:30000,\&quot;requestTemplate\&quot;:\&quot;{\\\&quot;input\\\&quot;:{\\\&quot;prompt\\\&quot;:\\\&quot;{{prompt}}\\\&quot;},\\\&quot;parameters\\\&quot;:{\\\&quot;incremental_output\\\&quot;:true},\\\&quot;debug\\\&quot;:{}}\&quot;,\&quot;messageJsonPath\&quot;:\&quot;$.output.text\&quot;,\&quot;requestHeaders\&quot;:\&quot;{\\\&quot;X-DashScope-SSE\\\&quot;: \\\&quot;enable\\\&quot; }\&quot;,\&quot;stream\&quot;:true,\&quot;customAuthHeaderName\&quot;:\&quot;\&quot;}</p>
         */
        public Builder connectionConfig(String connectionConfig) {
            this.putQueryParameter("ConnectionConfig", connectionConfig);
            this.connectionConfig = connectionConfig;
            return this;
        }

        /**
         * <p>The connection protocol type for the target service. The system selects the corresponding protocol adapter based on this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder connectionMethod(String connectionMethod) {
            this.putQueryParameter("ConnectionMethod", connectionMethod);
            this.connectionMethod = connectionMethod;
            return this;
        }

        /**
         * <p>An optional description of the scan target usage.</p>
         * 
         * <strong>example:</strong>
         * <p>Bailian application in the production environment</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The HTTP or HTTPS endpoint address of the target model service. When ConnectionMethod is set to enterprise_relay, this value is ignored and the platform uses a fixed internal endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The name of the target model. When ConnectionMethod is set to openai, specify the model ID under the OpenAI compatible protocol. When ConnectionMethod is set to anthropic, specify the model ID for the Anthropic Messages API. When ConnectionMethod is set to enterprise_relay, this value is ignored and the platform uses a fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The business label of the model or agent provider, used for UI filtering and form display. This is decoupled from ConnectionMethod (technical protocol): the same Provider may use multiple protocols, and vice versa.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The display name of the scan target, used for list display and filtering. Use a distinguishable name within the same tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My Bailian Target</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>The type of the scan target, which determines the sampling dimension for scan tasks. Valid values:</p>
         * <ul>
         * <li>agent: agent-type samples.</li>
         * <li>model: model-type samples.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateAttackTargetRequest build() {
            return new CreateAttackTargetRequest(this);
        } 

    } 

}
