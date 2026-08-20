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
 * {@link ListModelDeploymentProfilesRequest} extends {@link RequestModel}
 *
 * <p>ListModelDeploymentProfilesRequest</p>
 */
public class ListModelDeploymentProfilesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizKey")
    private String bizKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    private ListModelDeploymentProfilesRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.bizKey = builder.bizKey;
        this.modelVersion = builder.modelVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelDeploymentProfilesRequest create() {
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

    public static final class Builder extends Request.Builder<ListModelDeploymentProfilesRequest, Builder> {
        private String modelId; 
        private String bizKey; 
        private String modelVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListModelDeploymentProfilesRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.bizKey = request.bizKey;
            this.modelVersion = request.modelVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-6wiou***0tgtq9lda</p>
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
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
            return this;
        }

        @Override
        public ListModelDeploymentProfilesRequest build() {
            return new ListModelDeploymentProfilesRequest(this);
        } 

    } 

}
