// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEntityItemsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEntityItemsRequest</p>
 */
public class DeleteEntityItemsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EntityNames")
    @Validation(required = true)
    private java.util.List < String > entityNames;

    @Query
    @NameInMap("EntityType")
    @Validation(required = true)
    private String entityType;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private DeleteEntityItemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityNames = builder.entityNames;
        this.entityType = builder.entityType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEntityItemsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEntityItemsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > entityNames; 
        private String entityType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEntityItemsRequest request) {
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
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteEntityItemsRequest build() {
            return new DeleteEntityItemsRequest(this);
        } 

    } 

}
