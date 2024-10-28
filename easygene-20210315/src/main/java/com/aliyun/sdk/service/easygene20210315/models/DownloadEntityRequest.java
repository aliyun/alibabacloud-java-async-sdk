// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DownloadEntityRequest} extends {@link RequestModel}
 *
 * <p>DownloadEntityRequest</p>
 */
public class DownloadEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityNames")
    private java.util.List < String > entityNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DownloadEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityNames = builder.entityNames;
        this.entityType = builder.entityType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadEntityRequest create() {
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
     * @return entityNames
     */
    public java.util.List < String > getEntityNames() {
        return this.entityNames;
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

    public static final class Builder extends Request.Builder<DownloadEntityRequest, Builder> {
        private String regionId; 
        private java.util.List < String > entityNames; 
        private String entityType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DownloadEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityNames = request.entityNames;
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
         * EntityNames.
         */
        public Builder entityNames(java.util.List < String > entityNames) {
            String entityNamesShrink = shrink(entityNames, "EntityNames", "json");
            this.putQueryParameter("EntityNames", entityNamesShrink);
            this.entityNames = entityNames;
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
        public DownloadEntityRequest build() {
            return new DownloadEntityRequest(this);
        } 

    } 

}
