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
 * {@link RegisterAIDBClusterCustomModelResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterAIDBClusterCustomModelResponseBody</p>
 */
public class RegisterAIDBClusterCustomModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Created")
    private Boolean created;

    @com.aliyun.core.annotation.NameInMap("DisplayModelName")
    private String displayModelName;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("OssPath")
    private String ossPath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterAIDBClusterCustomModelResponseBody(Builder builder) {
        this.created = builder.created;
        this.displayModelName = builder.displayModelName;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.ossPath = builder.ossPath;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAIDBClusterCustomModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return created
     */
    public Boolean getCreated() {
        return this.created;
    }

    /**
     * @return displayModelName
     */
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean created; 
        private String displayModelName; 
        private Long modelId; 
        private String modelName; 
        private String modelType; 
        private String ossPath; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterAIDBClusterCustomModelResponseBody model) {
            this.created = model.created;
            this.displayModelName = model.displayModelName;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelType = model.modelType;
            this.ossPath = model.ossPath;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the registration is newly created. A value of false indicates that an existing registration was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder created(Boolean created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The display name and initial client-facing invocation name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-qwen3</p>
         */
        public Builder displayModelName(String displayModelName) {
            this.displayModelName = displayModelName;
            return this;
        }

        /**
         * <p>The model registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The custom model registration key.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The normalized OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>/my-model-bucket/models/qwen3</p>
         */
        public Builder ossPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterAIDBClusterCustomModelResponseBody build() {
            return new RegisterAIDBClusterCustomModelResponseBody(this);
        } 

    } 

}
