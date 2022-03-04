// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNetworkSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNetworkSpecRequest</p>
 */
public class ModifyInstanceNetworkSpecRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("NetworkChargeType")
    private String networkChargeType;

    @Query
    @NameInMap("AllocatePublicIp")
    private Boolean allocatePublicIp;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    @Validation(maximum = 200, minimum = 1)
    private Integer internetMaxBandwidthIn;

    private ModifyInstanceNetworkSpecRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkChargeType = builder.networkChargeType;
        this.allocatePublicIp = builder.allocatePublicIp;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNetworkSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return networkChargeType
     */
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    /**
     * @return allocatePublicIp
     */
    public Boolean getAllocatePublicIp() {
        return this.allocatePublicIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNetworkSpecRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private Integer internetMaxBandwidthOut; 
        private String networkChargeType; 
        private Boolean allocatePublicIp; 
        private String startTime; 
        private String endTime; 
        private Boolean autoPay; 
        private String clientToken; 
        private String instanceId; 
        private Integer internetMaxBandwidthIn; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNetworkSpecRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.networkChargeType = request.networkChargeType;
            this.allocatePublicIp = request.allocatePublicIp;
            this.startTime = request.startTime;
            this.endTime = request.endTime;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The maximum outbound Internet bandwidth. Unit: Mbit/s(Megabit per second). Valid values: 0 to 100.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Change the network billing method. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic: pay by traffic.
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         * 
         * 
         */
        public Builder networkChargeType(String networkChargeType) {
            this.putQueryParameter("NetworkChargeType", networkChargeType);
            this.networkChargeType = networkChargeType;
            return this;
        }

        /**
         * Specifies whether to assign a public IP address.
         * <p>
         * 
         * Default value: false
         */
        public Builder allocatePublicIp(Boolean allocatePublicIp) {
            this.putQueryParameter("AllocatePublicIp", allocatePublicIp);
            this.allocatePublicIp = allocatePublicIp;
            return this;
        }

        /**
         * The start time of the temporary bandwidth upgrade. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddThh:mmZ. Accurate to **minutes**(mm).
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the temporary bandwidth upgrade. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddThhZ. Accurate to **hour**(hh).
         * <p>
         * 
         * > The interval between the end time and start time of the temporary bandwidth upgrade must be greater than or equal to 3 hours.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Indicates whether to pay automatically. Valid values:
         * <p>
         * 
         * -true: fees are automatically deducted after the bandwidth configuration is changed. When you set the parameter Autopay to true, you must ensure that the account balance is sufficient. If the account balance is insufficient, an abnormal order is generated. This order cannot be paid in the ECS console and can only be invalidated.
         * -<props = "china">false: After the bandwidth configuration is changed, only the order is generated without deduction. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated. You can log on to the [ECS console](https://ecs.console.aliyun.com) to pay for this order. </props>
         * -<props = "intl">false: After the bandwidth configuration is changed, only the order is generated without deduction. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated. You can log on to the [ECS console](https://ecs.console.aliyun.com) to pay for this order. </props>
         * -<props = "partner">false: After the bandwidth configuration is changed, only the order is generated without deduction. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated. You can log on to the [ECS console](https://partners-intl.console.aliyun.com/#/ecs) to pay for this order. </props>
         * 
         * Default value: true
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the instance to which you want to modify the network configuration.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Set the maximum inbound public bandwidth. Unit: Mbit/s(Megabit per second). Valid values:
         * <p>
         * 
         * -When the purchased internet outbound bandwidth is less than or equal to 10 Mbit/s: 1 to 10, the default value is 10.
         * -When the purchased public outbound bandwidth is greater than 10 Mbit/s: 1 to "InternetMaxBandwidthOut". The default value is "InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        @Override
        public ModifyInstanceNetworkSpecRequest build() {
            return new ModifyInstanceNetworkSpecRequest(this);
        } 

    } 

}
