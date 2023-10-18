// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEditingProjectMaterialsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEditingProjectMaterialsRequest</p>
 */
public class DeleteEditingProjectMaterialsRequest extends Request {
    @Query
    @NameInMap("MaterialIds")
    @Validation(required = true)
    private String materialIds;

    @Query
    @NameInMap("MaterialType")
    @Validation(required = true)
    private String materialType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private DeleteEditingProjectMaterialsRequest(Builder builder) {
        super(builder);
        this.materialIds = builder.materialIds;
        this.materialType = builder.materialType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.projectId = builder.projectId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEditingProjectMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialIds
     */
    public String getMaterialIds() {
        return this.materialIds;
    }

    /**
     * @return materialType
     */
    public String getMaterialType() {
        return this.materialType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteEditingProjectMaterialsRequest, Builder> {
        private String materialIds; 
        private String materialType; 
        private String ownerAccount; 
        private String ownerId; 
        private String projectId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEditingProjectMaterialsRequest request) {
            super(request);
            this.materialIds = request.materialIds;
            this.materialType = request.materialType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.projectId = request.projectId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * MaterialIds.
         */
        public Builder materialIds(String materialIds) {
            this.putQueryParameter("MaterialIds", materialIds);
            this.materialIds = materialIds;
            return this;
        }

        /**
         * MaterialType.
         */
        public Builder materialType(String materialType) {
            this.putQueryParameter("MaterialType", materialType);
            this.materialType = materialType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DeleteEditingProjectMaterialsRequest build() {
            return new DeleteEditingProjectMaterialsRequest(this);
        } 

    } 

}
