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
    @com.aliyun.core.annotation.NameInMap("CustomOssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customOssBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssBucketPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customOssBucketPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayModelName")
    private String displayModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RegisterAIDBClusterCustomModelRequest(Builder builder) {
        super(builder);
        this.customOssBucketName = builder.customOssBucketName;
        this.customOssBucketPath = builder.customOssBucketPath;
        this.DBClusterId = builder.DBClusterId;
        this.displayModelName = builder.displayModelName;
        this.modelName = builder.modelName;
        this.regionId = builder.regionId;
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return displayModelName
     */
    public String getDisplayModelName() {
        return this.displayModelName;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RegisterAIDBClusterCustomModelRequest, Builder> {
        private String customOssBucketName; 
        private String customOssBucketPath; 
        private String DBClusterId; 
        private String displayModelName; 
        private String modelName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterAIDBClusterCustomModelRequest request) {
            super(request);
            this.customOssBucketName = request.customOssBucketName;
            this.customOssBucketPath = request.customOssBucketPath;
            this.DBClusterId = request.DBClusterId;
            this.displayModelName = request.displayModelName;
            this.modelName = request.modelName;
            this.regionId = request.regionId;
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
         * <p>The model path within the OSS bucket.</p>
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
         * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze4x2mwo81knj08a</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The display name shown in the candidate list and the initial client-facing invocation name.</p>
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

        @Override
        public RegisterAIDBClusterCustomModelRequest build() {
            return new RegisterAIDBClusterCustomModelRequest(this);
        } 

    } 

}
