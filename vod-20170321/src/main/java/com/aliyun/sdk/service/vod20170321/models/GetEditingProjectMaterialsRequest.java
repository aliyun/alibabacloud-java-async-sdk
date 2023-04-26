// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectMaterialsRequest} extends {@link RequestModel}
 *
 * <p>GetEditingProjectMaterialsRequest</p>
 */
public class GetEditingProjectMaterialsRequest extends Request {
    @Query
    @NameInMap("MaterialType")
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

    @Query
    @NameInMap("Type")
    private String type;

    private GetEditingProjectMaterialsRequest(Builder builder) {
        super(builder);
        this.materialType = builder.materialType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.projectId = builder.projectId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingProjectMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetEditingProjectMaterialsRequest, Builder> {
        private String materialType; 
        private String ownerAccount; 
        private String ownerId; 
        private String projectId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetEditingProjectMaterialsRequest request) {
            super(request);
            this.materialType = request.materialType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.projectId = request.projectId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
        } 

        /**
         * The URLs of material snapshots. The value is an array.
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
         * The ID of the online editing project. You can use one of the following methods to obtain the ID of the online editing project:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Production Center** > **Video Editing** to obtain the ID of the specified online editing project.
         * *   Call the **AddEditingProject** operation. The value of the response parameter ProjectId is the ID of the specified online editing project.
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

        /**
         * The ID of the material.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetEditingProjectMaterialsRequest build() {
            return new GetEditingProjectMaterialsRequest(this);
        } 

    } 

}
