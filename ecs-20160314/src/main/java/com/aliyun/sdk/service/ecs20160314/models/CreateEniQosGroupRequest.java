// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEniQosGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateEniQosGroupRequest</p>
 */
public class CreateEniQosGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QosGroupName")
    @Validation(required = true)
    private String qosGroupName;

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
    @NameInMap("Rx")
    @Validation(required = true)
    private Integer rx;

    @Query
    @NameInMap("RxPps")
    @Validation(required = true)
    private Integer rxPps;

    @Query
    @NameInMap("Tx")
    @Validation(required = true)
    private Integer tx;

    @Query
    @NameInMap("TxPps")
    @Validation(required = true)
    private Integer txPps;

    private CreateEniQosGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.qosGroupName = builder.qosGroupName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rx = builder.rx;
        this.rxPps = builder.rxPps;
        this.tx = builder.tx;
        this.txPps = builder.txPps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEniQosGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qosGroupName
     */
    public String getQosGroupName() {
        return this.qosGroupName;
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
     * @return rx
     */
    public Integer getRx() {
        return this.rx;
    }

    /**
     * @return rxPps
     */
    public Integer getRxPps() {
        return this.rxPps;
    }

    /**
     * @return tx
     */
    public Integer getTx() {
        return this.tx;
    }

    /**
     * @return txPps
     */
    public Integer getTxPps() {
        return this.txPps;
    }

    public static final class Builder extends Request.Builder<CreateEniQosGroupRequest, Builder> {
        private String instanceId; 
        private Long ownerId; 
        private String qosGroupName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer rx; 
        private Integer rxPps; 
        private Integer tx; 
        private Integer txPps; 

        private Builder() {
            super();
        } 

        private Builder(CreateEniQosGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.qosGroupName = response.qosGroupName;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.rx = response.rx;
            this.rxPps = response.rxPps;
            this.tx = response.tx;
            this.txPps = response.txPps;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * QosGroupName.
         */
        public Builder qosGroupName(String qosGroupName) {
            this.putQueryParameter("QosGroupName", qosGroupName);
            this.qosGroupName = qosGroupName;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Rx.
         */
        public Builder rx(Integer rx) {
            this.putQueryParameter("Rx", rx);
            this.rx = rx;
            return this;
        }

        /**
         * RxPps.
         */
        public Builder rxPps(Integer rxPps) {
            this.putQueryParameter("RxPps", rxPps);
            this.rxPps = rxPps;
            return this;
        }

        /**
         * Tx.
         */
        public Builder tx(Integer tx) {
            this.putQueryParameter("Tx", tx);
            this.tx = tx;
            return this;
        }

        /**
         * TxPps.
         */
        public Builder txPps(Integer txPps) {
            this.putQueryParameter("TxPps", txPps);
            this.txPps = txPps;
            return this;
        }

        @Override
        public CreateEniQosGroupRequest build() {
            return new CreateEniQosGroupRequest(this);
        } 

    } 

}
