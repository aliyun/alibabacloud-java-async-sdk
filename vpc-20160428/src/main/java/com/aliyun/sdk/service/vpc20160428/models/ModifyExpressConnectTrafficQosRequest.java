// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExpressConnectTrafficQosRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectTrafficQosRequest</p>
 */
public class ModifyExpressConnectTrafficQosRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PconnIdList")
    private String pconnIdList;

    @Query
    @NameInMap("QosDescription")
    private String qosDescription;

    @Query
    @NameInMap("QosId")
    private String qosId;

    @Query
    @NameInMap("QosName")
    private String qosName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private ModifyExpressConnectTrafficQosRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pconnIdList = builder.pconnIdList;
        this.qosDescription = builder.qosDescription;
        this.qosId = builder.qosId;
        this.qosName = builder.qosName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectTrafficQosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pconnIdList
     */
    public String getPconnIdList() {
        return this.pconnIdList;
    }

    /**
     * @return qosDescription
     */
    public String getQosDescription() {
        return this.qosDescription;
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return qosName
     */
    public String getQosName() {
        return this.qosName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectTrafficQosRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pconnIdList; 
        private String qosDescription; 
        private String qosId; 
        private String qosName; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectTrafficQosRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pconnIdList = request.pconnIdList;
            this.qosDescription = request.qosDescription;
            this.qosId = request.qosId;
            this.qosName = request.qosName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
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
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PconnIdList.
         */
        public Builder pconnIdList(String pconnIdList) {
            this.putQueryParameter("PconnIdList", pconnIdList);
            this.pconnIdList = pconnIdList;
            return this;
        }

        /**
         * QosDescription.
         */
        public Builder qosDescription(String qosDescription) {
            this.putQueryParameter("QosDescription", qosDescription);
            this.qosDescription = qosDescription;
            return this;
        }

        /**
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * QosName.
         */
        public Builder qosName(String qosName) {
            this.putQueryParameter("QosName", qosName);
            this.qosName = qosName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ModifyExpressConnectTrafficQosRequest build() {
            return new ModifyExpressConnectTrafficQosRequest(this);
        } 

    } 

}
