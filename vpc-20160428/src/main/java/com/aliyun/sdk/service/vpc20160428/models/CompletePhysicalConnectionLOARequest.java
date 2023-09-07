// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompletePhysicalConnectionLOARequest} extends {@link RequestModel}
 *
 * <p>CompletePhysicalConnectionLOARequest</p>
 */
public class CompletePhysicalConnectionLOARequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("FinishWork")
    private Boolean finishWork;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LineCode")
    private String lineCode;

    @Query
    @NameInMap("LineLabel")
    private String lineLabel;

    @Query
    @NameInMap("LineSPContactInfo")
    private String lineSPContactInfo;

    @Query
    @NameInMap("LineServiceProvider")
    private String lineServiceProvider;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CompletePhysicalConnectionLOARequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.finishWork = builder.finishWork;
        this.instanceId = builder.instanceId;
        this.lineCode = builder.lineCode;
        this.lineLabel = builder.lineLabel;
        this.lineSPContactInfo = builder.lineSPContactInfo;
        this.lineServiceProvider = builder.lineServiceProvider;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompletePhysicalConnectionLOARequest create() {
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
     * @return finishWork
     */
    public Boolean getFinishWork() {
        return this.finishWork;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lineCode
     */
    public String getLineCode() {
        return this.lineCode;
    }

    /**
     * @return lineLabel
     */
    public String getLineLabel() {
        return this.lineLabel;
    }

    /**
     * @return lineSPContactInfo
     */
    public String getLineSPContactInfo() {
        return this.lineSPContactInfo;
    }

    /**
     * @return lineServiceProvider
     */
    public String getLineServiceProvider() {
        return this.lineServiceProvider;
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

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CompletePhysicalConnectionLOARequest, Builder> {
        private String clientToken; 
        private Boolean finishWork; 
        private String instanceId; 
        private String lineCode; 
        private String lineLabel; 
        private String lineSPContactInfo; 
        private String lineServiceProvider; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CompletePhysicalConnectionLOARequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.finishWork = request.finishWork;
            this.instanceId = request.instanceId;
            this.lineCode = request.lineCode;
            this.lineLabel = request.lineLabel;
            this.lineSPContactInfo = request.lineSPContactInfo;
            this.lineServiceProvider = request.lineServiceProvider;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among different requests.
         * 
         * >  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** of each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * FinishWork.
         */
        public Builder finishWork(Boolean finishWork) {
            this.putQueryParameter("FinishWork", finishWork);
            this.finishWork = finishWork;
            return this;
        }

        /**
         * The ID of the Express Connect circuit.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The circuit code provided by the connectivity provider.
         */
        public Builder lineCode(String lineCode) {
            this.putQueryParameter("LineCode", lineCode);
            this.lineCode = lineCode;
            return this;
        }

        /**
         * The label of the cable in the data center.
         */
        public Builder lineLabel(String lineLabel) {
            this.putQueryParameter("LineLabel", lineLabel);
            this.lineLabel = lineLabel;
            return this;
        }

        /**
         * LineSPContactInfo.
         */
        public Builder lineSPContactInfo(String lineSPContactInfo) {
            this.putQueryParameter("LineSPContactInfo", lineSPContactInfo);
            this.lineSPContactInfo = lineSPContactInfo;
            return this;
        }

        /**
         * LineServiceProvider.
         */
        public Builder lineServiceProvider(String lineServiceProvider) {
            this.putQueryParameter("LineServiceProvider", lineServiceProvider);
            this.lineServiceProvider = lineServiceProvider;
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
         * The region ID of the Express Connect circuit.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CompletePhysicalConnectionLOARequest build() {
            return new CompletePhysicalConnectionLOARequest(this);
        } 

    } 

}
