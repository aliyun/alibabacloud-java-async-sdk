// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDedicatedHostRequest} extends {@link RequestModel}
 *
 * <p>RestartDedicatedHostRequest</p>
 */
public class RestartDedicatedHostRequest extends Request {
    @Query
    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    private String dedicatedHostId;

    @Query
    @NameInMap("FailoverMode")
    @Validation(required = true)
    private String failoverMode;

    @Query
    @NameInMap("ForceStop")
    private Boolean forceStop;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RestartDedicatedHostRequest(Builder builder) {
        super(builder);
        this.dedicatedHostId = builder.dedicatedHostId;
        this.failoverMode = builder.failoverMode;
        this.forceStop = builder.forceStop;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDedicatedHostRequest create() {
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
     * @return failoverMode
     */
    public String getFailoverMode() {
        return this.failoverMode;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
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

    public static final class Builder extends Request.Builder<RestartDedicatedHostRequest, Builder> {
        private String dedicatedHostId; 
        private String failoverMode; 
        private Boolean forceStop; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDedicatedHostRequest request) {
            super(request);
            this.dedicatedHostId = request.dedicatedHostId;
            this.failoverMode = request.failoverMode;
            this.forceStop = request.forceStop;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The switchover method of the primary instance. Valid values:
         * <p>
         * 
         * *   **MaintainTime** (default): The system performs a switchover within a maintenance window. The system switches workloads from the primary instance on the host to the secondary instance on another host, and then restarts the current host. This prevents service interruptions.
         * *   **Immediate**: The system immediately restarts the host.
         */
        public Builder failoverMode(String failoverMode) {
            this.putQueryParameter("FailoverMode", failoverMode);
            this.failoverMode = failoverMode;
            return this;
        }

        /**
         * Specifies whether to forcefully restart the host. Valid values:
         * <p>
         * 
         * *   true: The system forcefully restarts the host. If this value is used, the system powers off the host. This results in the loss of cached data that is not written to storage. Exercise caution when you select this value.
         * *   false (default): The system restarts the host normally.
         * 
         * >  This parameter takes effect only for hosts that are created in ApsaraDB MyBase for Redis dedicated clusters of the Enhanced Edition (Tair). Hosts that are created in ApsaraDB MyBase dedicated clusters that run other database engines can be restarted normally.
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
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
         * [The region ID](~~198326~~) of the host.
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
        public RestartDedicatedHostRequest build() {
            return new RestartDedicatedHostRequest(this);
        } 

    } 

}
