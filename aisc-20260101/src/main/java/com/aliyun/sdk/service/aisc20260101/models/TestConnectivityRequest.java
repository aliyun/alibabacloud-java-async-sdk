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
 * {@link TestConnectivityRequest} extends {@link RequestModel}
 *
 * <p>TestConnectivityRequest</p>
 */
public class TestConnectivityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionConfig")
    private String connectionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionMethod")
    private String connectionMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    private TestConnectivityRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.checkId = builder.checkId;
        this.connectionConfig = builder.connectionConfig;
        this.connectionMethod = builder.connectionMethod;
        this.endpoint = builder.endpoint;
        this.modelName = builder.modelName;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestConnectivityRequest create() {
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
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<TestConnectivityRequest, Builder> {
        private String apiKey; 
        private String checkId; 
        private String connectionConfig; 
        private String connectionMethod; 
        private String endpoint; 
        private String modelName; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(TestConnectivityRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.checkId = request.checkId;
            this.connectionConfig = request.connectionConfig;
            this.connectionMethod = request.connectionMethod;
            this.endpoint = request.endpoint;
            this.modelName = request.modelName;
            this.targetId = request.targetId;
        } 

        /**
         * <p>The API key for the target model service, used to authenticate with the Endpoint. If TargetId is specified, the system reads the key from the encrypted target configuration. This parameter is required if TargetId is empty. Transmit the key over HTTPS and avoid exposing it in plaintext in logs, URLs, or client code.</p>
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
         * <p>The tracking identifier of the connectivity test. Do not specify this parameter for the first call. The system generates and returns it in the response. For subsequent calls, specify this value to query the latest status of the corresponding test.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-a1b2c3d4e5f67890</p>
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The advanced connection configuration in JSON string format. Common fields: authType (authentication type. custom_header indicates custom request header authentication. none indicates no authentication), customAuthHeaderName (custom authentication header name, such as X-API-Key), and requestHeaders (additional HTTP request header key-value pairs).</p>
         * <p>Common provider configuration templates ({{prompt}} is the prompt placeholder. Replace it with the actual service value. When authType is set to bearer, the token is injected from ApiKey, and the template does not contain credentials):</p>
         * <ul>
         * <li>Bailian: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;{{prompt}}\&quot;},\&quot;parameters\&quot;:{\&quot;incremental_output\&quot;:true},\&quot;debug\&quot;:{}}&quot;,&quot;messageJsonPath&quot;:&quot;$.output.text&quot;,&quot;requestHeaders&quot;:&quot;{\&quot;X-DashScope-SSE\&quot;: \&quot;enable\&quot; }&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>PAI: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:60000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{\&quot;question\&quot;:\&quot;{{prompt}}\&quot;,\&quot;chat_history\&quot;:[]},\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.outputs.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>Dify: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{},\&quot;query\&quot;:\&quot;{{prompt}}\&quot;,\&quot;response_mode\&quot;:\&quot;streaming\&quot;,\&quot;conversation_id\&quot;:\&quot;\&quot;,\&quot;user\&quot;:\&quot;scanner\&quot;}&quot;,&quot;messageJsonPath&quot;:&quot;$.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
         * <li>AgentRun: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;custom_header&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}],\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.choices[0].delta.content&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;customAuthHeaderName&quot;:&quot;X-API-Key&quot;,&quot;stream&quot;:true}</li>
         * <li>AgentKit: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}]}&quot;,&quot;messageJsonPath&quot;:&quot;$.content.parts[0].text&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
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
         * <p>The connection protocol type of the target service. The system selects the corresponding protocol adapter to initiate the test based on this value. Default value: openai.</p>
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
         * <p>The HTTP or HTTPS endpoint address of the target model service. This parameter is required if TargetId is empty.</p>
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
         * <p>The name of the target model. If ConnectionMethod is set to openai, specify the model ID under the OpenAI compatible protocol. If ConnectionMethod is set to anthropic, specify the model ID for the Anthropic Messages API. This parameter is required if the scan target is a model and TargetId is empty.</p>
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
         * <p>The unique identifier of the attack target. If specified, the system reads Endpoint, ApiKey, ModelName, ConnectionMethod, and ConnectionConfig from the target configuration and ignores any parameters with the same names in the request. If not specified, provide the connection parameters directly in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public TestConnectivityRequest build() {
            return new TestConnectivityRequest(this);
        } 

    } 

}
