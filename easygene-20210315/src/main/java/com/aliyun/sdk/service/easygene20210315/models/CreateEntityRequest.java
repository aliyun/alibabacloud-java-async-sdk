// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateEntityRequest</p>
 */
public class CreateEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < EntityItems> entityItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CreateEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.entityItems = builder.entityItems;
        this.entityType = builder.entityType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEntityRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return entityItems
     */
    public java.util.List < EntityItems> getEntityItems() {
        return this.entityItems;
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

    public static final class Builder extends Request.Builder<CreateEntityRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private java.util.List < EntityItems> entityItems; 
        private String entityType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.entityItems = request.entityItems;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder entityItems(java.util.List < EntityItems> entityItems) {
            String entityItemsShrink = shrink(entityItems, "EntityItems", "json");
            this.putBodyParameter("EntityItems", entityItemsShrink);
            this.entityItems = entityItems;
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
        public CreateEntityRequest build() {
            return new CreateEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEntityRequest} extends {@link TeaModel}
     *
     * <p>CreateEntityRequest</p>
     */
    public static class EntityItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityData")
        private java.util.Map < String, String > entityData;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        private EntityItems(Builder builder) {
            this.entityData = builder.entityData;
            this.entityName = builder.entityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityItems create() {
            return builder().build();
        }

        /**
         * @return entityData
         */
        public java.util.Map < String, String > getEntityData() {
            return this.entityData;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        public static final class Builder {
            private java.util.Map < String, String > entityData; 
            private String entityName; 

            /**
             * EntityData.
             */
            public Builder entityData(java.util.Map < String, String > entityData) {
                this.entityData = entityData;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            public EntityItems build() {
                return new EntityItems(this);
            } 

        } 

    }
}
