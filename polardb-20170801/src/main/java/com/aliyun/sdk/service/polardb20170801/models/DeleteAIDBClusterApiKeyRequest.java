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
 * {@link DeleteAIDBClusterApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAIDBClusterApiKeyRequest</p>
 */
public class DeleteAIDBClusterApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSpaceName")
    private String modelSpaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteAIDBClusterApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.modelSpaceName = builder.modelSpaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIDBClusterApiKeyRequest create() {
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
     * @return modelSpaceName
     */
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAIDBClusterApiKeyRequest, Builder> {
        private String apiKey; 
        private String modelSpaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAIDBClusterApiKeyRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.modelSpaceName = request.modelSpaceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * ModelSpaceName.
         */
        public Builder modelSpaceName(String modelSpaceName) {
            this.putQueryParameter("ModelSpaceName", modelSpaceName);
            this.modelSpaceName = modelSpaceName;
            return this;
        }

        /**
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
        public DeleteAIDBClusterApiKeyRequest build() {
            return new DeleteAIDBClusterApiKeyRequest(this);
        } 

    } 

}
