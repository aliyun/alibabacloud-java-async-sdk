// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RegisterAIDBClusterCustomModelRequest} extends {@link RequestModel}
 *
 * <p>RegisterAIDBClusterCustomModelRequest</p>
 */
public class RegisterAIDBClusterCustomModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerEnv")
    private java.util.Map<String, String> containerEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customOssBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssBucketPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customOssBucketPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectCommand")
    private String directCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayModelName")
    private String displayModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InferenceEngine")
    private String inferenceEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelParams")
    private java.util.Map<String, String> modelParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryPassword")
    private String registryPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryUsername")
    private String registryUsername;

    private RegisterAIDBClusterCustomModelRequest(Builder builder) {
        super(builder);
        this.containerEnv = builder.containerEnv;
        this.customOssBucketName = builder.customOssBucketName;
        this.customOssBucketPath = builder.customOssBucketPath;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.directCommand = builder.directCommand;
        this.displayModelName = builder.displayModelName;
        this.imageName = builder.imageName;
        this.inferenceEngine = builder.inferenceEngine;
        this.modelName = builder.modelName;
        this.modelParams = builder.modelParams;
        this.regionId = builder.regionId;
        this.registryPassword = builder.registryPassword;
        this.registryUsername = builder.registryUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAIDBClusterCustomModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerEnv
     */
    public java.util.Map<String, String> getContainerEnv() {
        return this.containerEnv;
    }

    /**
     * @return customOssBucketName
     */
    public String getCustomOssBucketName() {
        return this.customOssBucketName;
    }

    /**
     * @return customOssBucketPath
     */
    public String getCustomOssBucketPath() {
        return this.customOssBucketPath;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return directCommand
     */
    public String getDirectCommand() {
        return this.directCommand;
    }

    /**
     * @return displayModelName
     */
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
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
    public java.util.Map<String, String> getModelParams() {
        return this.modelParams;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return registryPassword
     */
    public String getRegistryPassword() {
        return this.registryPassword;
    }

    /**
     * @return registryUsername
     */
    public String getRegistryUsername() {
        return this.registryUsername;
    }

    public static final class Builder extends Request.Builder<RegisterAIDBClusterCustomModelRequest, Builder> {
        private java.util.Map<String, String> containerEnv; 
        private String customOssBucketName; 
        private String customOssBucketPath; 
        private String DBInstanceClass; 
        private String directCommand; 
        private String displayModelName; 
        private String imageName; 
        private String inferenceEngine; 
        private String modelName; 
        private java.util.Map<String, String> modelParams; 
        private String regionId; 
        private String registryPassword; 
        private String registryUsername; 

        private Builder() {
            super();
        } 

        private Builder(RegisterAIDBClusterCustomModelRequest request) {
            super(request);
            this.containerEnv = request.containerEnv;
            this.customOssBucketName = request.customOssBucketName;
            this.customOssBucketPath = request.customOssBucketPath;
            this.DBInstanceClass = request.DBInstanceClass;
            this.directCommand = request.directCommand;
            this.displayModelName = request.displayModelName;
            this.imageName = request.imageName;
            this.inferenceEngine = request.inferenceEngine;
            this.modelName = request.modelName;
            this.modelParams = request.modelParams;
            this.regionId = request.regionId;
            this.registryPassword = request.registryPassword;
            this.registryUsername = request.registryUsername;
        } 

        /**
         * <p>The container startup environment variables. Variable names cannot be empty or contain whitespace. Variable values can be empty strings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HF_HOME&quot;:&quot;/cache/hf&quot;,&quot;EMPTY_VALUE&quot;:&quot;&quot;}</p>
         */
        public Builder containerEnv(java.util.Map<String, String> containerEnv) {
            String containerEnvShrink = shrink(containerEnv, "ContainerEnv", "json");
            this.putQueryParameter("ContainerEnv", containerEnvShrink);
            this.containerEnv = containerEnv;
            return this;
        }

        /**
         * <p>The name of the OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-model-bucket</p>
         */
        public Builder customOssBucketName(String customOssBucketName) {
            this.putQueryParameter("CustomOssBucketName", customOssBucketName);
            this.customOssBucketName = customOssBucketName;
            return this;
        }

        /**
         * <p>The model path in the OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>models/qwen3</p>
         */
        public Builder customOssBucketPath(String customOssBucketPath) {
            this.putQueryParameter("CustomOssBucketPath", customOssBucketPath);
            this.customOssBucketPath = customOssBucketPath;
            return this;
        }

        /**
         * <p>The GPU instance type used for model deployment. Required when configuring deployment parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb.gpu.gn8is.4xlarge</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The direct startup command for the model container.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m vllm.entrypoints.openai.api_server</p>
         */
        public Builder directCommand(String directCommand) {
            this.putQueryParameter("DirectCommand", directCommand);
            this.directCommand = directCommand;
            return this;
        }

        /**
         * <p>The display name in the candidate list and the initial invocation name for clients.</p>
         * 
         * <strong>example:</strong>
         * <p>my-qwen3</p>
         */
        public Builder displayModelName(String displayModelName) {
            this.putQueryParameter("DisplayModelName", displayModelName);
            this.displayModelName = displayModelName;
            return this;
        }

        /**
         * <p>The full reference of the customer-owned inference image, in the format of registry/repository:tag.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/customer/model:v1</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The inference engine. Required when configuring deployment parameters. Valid values: vllm and sglang.</p>
         * 
         * <strong>example:</strong>
         * <p>vllm</p>
         */
        public Builder inferenceEngine(String inferenceEngine) {
            this.putQueryParameter("InferenceEngine", inferenceEngine);
            this.inferenceEngine = inferenceEngine;
            return this;
        }

        /**
         * <p>The custom model registration key and model directory name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model startup parameters. Parameter keys must start with --.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;--max-model-len&quot;:&quot;32768&quot;}</p>
         */
        public Builder modelParams(java.util.Map<String, String> modelParams) {
            String modelParamsShrink = shrink(modelParams, "ModelParams", "json");
            this.putQueryParameter("ModelParams", modelParamsShrink);
            this.modelParams = modelParams;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The password or temporary token for the customer image repository. Required when ImageName is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>temporary-token</p>
         */
        public Builder registryPassword(String registryPassword) {
            this.putQueryParameter("RegistryPassword", registryPassword);
            this.registryPassword = registryPassword;
            return this;
        }

        /**
         * <p>The username for the customer image repository. Required when ImageName is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>temporary-user</p>
         */
        public Builder registryUsername(String registryUsername) {
            this.putQueryParameter("RegistryUsername", registryUsername);
            this.registryUsername = registryUsername;
            return this;
        }

        @Override
        public RegisterAIDBClusterCustomModelRequest build() {
            return new RegisterAIDBClusterCustomModelRequest(this);
        } 

    } 

}
