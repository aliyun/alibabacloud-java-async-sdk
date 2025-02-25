// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyPublicEntityRequest} extends {@link RequestModel}
 *
 * <p>CopyPublicEntityRequest</p>
 */
public class CopyPublicEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dataset")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CopyPublicEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataset = builder.dataset;
        this.entityType = builder.entityType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyPublicEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataset
     */
    public String getDataset() {
        return this.dataset;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CopyPublicEntityRequest, Builder> {
        private String regionId; 
        private String dataset; 
        private String entityType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CopyPublicEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataset = request.dataset;
            this.entityType = request.entityType;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDataset</p>
         */
        public Builder dataset(String dataset) {
            this.putQueryParameter("Dataset", dataset);
            this.dataset = dataset;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CopyPublicEntityRequest build() {
            return new CopyPublicEntityRequest(this);
        } 

    } 

}
