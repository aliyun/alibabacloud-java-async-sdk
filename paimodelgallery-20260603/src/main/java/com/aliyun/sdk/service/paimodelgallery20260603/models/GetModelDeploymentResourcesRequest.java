// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link GetModelDeploymentResourcesRequest} extends {@link RequestModel}
 *
 * <p>GetModelDeploymentResourcesRequest</p>
 */
public class GetModelDeploymentResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizKey")
    private String bizKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String profileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetModelDeploymentResourcesRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.bizKey = builder.bizKey;
        this.modelVersion = builder.modelVersion;
        this.profileId = builder.profileId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelDeploymentResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return bizKey
     */
    public String getBizKey() {
        return this.bizKey;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return profileId
     */
    public String getProfileId() {
        return this.profileId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetModelDeploymentResourcesRequest, Builder> {
        private String modelId; 
        private String bizKey; 
        private String modelVersion; 
        private String profileId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetModelDeploymentResourcesRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.bizKey = request.bizKey;
            this.modelVersion = request.modelVersion;
            this.profileId = request.profileId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-gfo1kjyxkudbw4fa37</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * BizKey.
         */
        public Builder bizKey(String bizKey) {
            this.putQueryParameter("BizKey", bizKey);
            this.bizKey = bizKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prf_5cd37a1c7eaa***c6829dbb02</p>
         */
        public Builder profileId(String profileId) {
            this.putQueryParameter("ProfileId", profileId);
            this.profileId = profileId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>295949</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetModelDeploymentResourcesRequest build() {
            return new GetModelDeploymentResourcesRequest(this);
        } 

    } 

}
