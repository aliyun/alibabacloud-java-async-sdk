// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelServiceRequest</p>
 */
public class CreateModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiNodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> aiNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePublicConnection")
    private Boolean enablePublicConnection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InferenceEngine")
    private String inferenceEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelParams")
    private java.util.Map<String, ?> modelParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    private CreateModelServiceRequest(Builder builder) {
        super(builder);
        this.aiNodes = builder.aiNodes;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.enablePublicConnection = builder.enablePublicConnection;
        this.inferenceEngine = builder.inferenceEngine;
        this.modelName = builder.modelName;
        this.modelParams = builder.modelParams;
        this.replicas = builder.replicas;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityIPList = builder.securityIPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiNodes
     */
    public java.util.List<String> getAiNodes() {
        return this.aiNodes;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enablePublicConnection
     */
    public Boolean getEnablePublicConnection() {
        return this.enablePublicConnection;
    }

    /**
     * @return inferenceEngine
     */
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelParams
     */
    public java.util.Map<String, ?> getModelParams() {
        return this.modelParams;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public static final class Builder extends Request.Builder<CreateModelServiceRequest, Builder> {
        private java.util.List<String> aiNodes; 
        private String clientToken; 
        private String DBInstanceId; 
        private String description; 
        private Boolean enablePublicConnection; 
        private String inferenceEngine; 
        private String modelName; 
        private java.util.Map<String, ?> modelParams; 
        private Integer replicas; 
        private String resourceGroupId; 
        private String securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelServiceRequest request) {
            super(request);
            this.aiNodes = request.aiNodes;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.description = request.description;
            this.enablePublicConnection = request.enablePublicConnection;
            this.inferenceEngine = request.inferenceEngine;
            this.modelName = request.modelName;
            this.modelParams = request.modelParams;
            this.replicas = request.replicas;
            this.resourceGroupId = request.resourceGroupId;
            this.securityIPList = request.securityIPList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aiNodes(java.util.List<String> aiNodes) {
            String aiNodesShrink = shrink(aiNodes, "AiNodes", "json");
            this.putQueryParameter("AiNodes", aiNodesShrink);
            this.aiNodes = aiNodes;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * EnablePublicConnection.
         */
        public Builder enablePublicConnection(Boolean enablePublicConnection) {
            this.putQueryParameter("EnablePublicConnection", enablePublicConnection);
            this.enablePublicConnection = enablePublicConnection;
            return this;
        }

        /**
         * InferenceEngine.
         */
        public Builder inferenceEngine(String inferenceEngine) {
            this.putQueryParameter("InferenceEngine", inferenceEngine);
            this.inferenceEngine = inferenceEngine;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-Embedding-8B</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelParams.
         */
        public Builder modelParams(java.util.Map<String, ?> modelParams) {
            String modelParamsShrink = shrink(modelParams, "ModelParams", "json");
            this.putQueryParameter("ModelParams", modelParamsShrink);
            this.modelParams = modelParams;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public CreateModelServiceRequest build() {
            return new CreateModelServiceRequest(this);
        } 

    } 

}
