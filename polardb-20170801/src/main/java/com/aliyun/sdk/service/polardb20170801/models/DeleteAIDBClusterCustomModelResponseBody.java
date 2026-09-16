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
 * {@link DeleteAIDBClusterCustomModelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAIDBClusterCustomModelResponseBody</p>
 */
public class DeleteAIDBClusterCustomModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAIDBClusterCustomModelResponseBody(Builder builder) {
        this.deleted = builder.deleted;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIDBClusterCustomModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean deleted; 
        private Long modelId; 
        private String modelName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAIDBClusterCustomModelResponseBody model) {
            this.deleted = model.deleted;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the deletion was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>The ID of the deleted model registration.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The key of the deleted custom model registration.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
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

        public DeleteAIDBClusterCustomModelResponseBody build() {
            return new DeleteAIDBClusterCustomModelResponseBody(this);
        } 

    } 

}
