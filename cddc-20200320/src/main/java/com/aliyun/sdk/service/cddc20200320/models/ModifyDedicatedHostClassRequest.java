// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostClassRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostClassRequest</p>
 */
public class ModifyDedicatedHostClassRequest extends Request {
    @Query
    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    private String dedicatedHostId;

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

    @Query
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @Query
    @NameInMap("TargetClassCode")
    @Validation(required = true)
    private String targetClassCode;

    private ModifyDedicatedHostClassRequest(Builder builder) {
        super(builder);
        this.dedicatedHostId = builder.dedicatedHostId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetClassCode = builder.targetClassCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostClassRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
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

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return targetClassCode
     */
    public String getTargetClassCode() {
        return this.targetClassCode;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostClassRequest, Builder> {
        private String dedicatedHostId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetClassCode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostClassRequest request) {
            super(request);
            this.dedicatedHostId = request.dedicatedHostId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetClassCode = request.targetClassCode;
        } 

        /**
         * The host ID. You can log on to the ApsaraDB for MyBase console and go to the **Hosts** page to view the host ID.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
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
         * The [region ID](~~198326~~).
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

        /**
         * The time when you want to upgrade the specifications of the host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * >  This parameter must be specified only when SwitchTimeMode is set to 2.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * The execution mode that is used to upgrade host specifications. Valid values:
         * <p>
         * 
         * *   **0** (default): immediately upgrades host specifications.
         * *   **2**: upgrades host specifications at a specified point in time.
         * 
         * >  If you set this parameter to **2**, you must specify **SwitchTime**.
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * The instance type to which you want the host to be upgraded. For more information, see [Host specification details](~~206343~~).
         */
        public Builder targetClassCode(String targetClassCode) {
            this.putQueryParameter("TargetClassCode", targetClassCode);
            this.targetClassCode = targetClassCode;
            return this;
        }

        @Override
        public ModifyDedicatedHostClassRequest build() {
            return new ModifyDedicatedHostClassRequest(this);
        } 

    } 

}
