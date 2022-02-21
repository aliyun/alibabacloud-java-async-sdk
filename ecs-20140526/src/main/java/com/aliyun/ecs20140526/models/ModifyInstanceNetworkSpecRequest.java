// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("NetworkChargeType")
    private String networkChargeType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("AllocatePublicIp")
    private Boolean allocatePublicIp;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    private ModifyInstanceNetworkSpecRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.clientToken = builder.clientToken;
        this.networkChargeType = builder.networkChargeType;
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.autoPay = builder.autoPay;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.allocatePublicIp = builder.allocatePublicIp;
        this.startTime = builder.startTime;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return networkChargeType
     */
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
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
        private String clientToken; 
        private String networkChargeType; 
        private String instanceId; 
        private String endTime; 
        private Boolean autoPay; 
        private Integer internetMaxBandwidthOut; 
        private Boolean allocatePublicIp; 
        private String startTime; 
        private Integer internetMaxBandwidthIn; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNetworkSpecRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.clientToken = response.clientToken;
            this.networkChargeType = response.networkChargeType;
            this.instanceId = response.instanceId;
            this.endTime = response.endTime;
            this.autoPay = response.autoPay;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.allocatePublicIp = response.allocatePublicIp;
            this.startTime = response.startTime;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
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
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * Need to modify network configuration instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Temporary bandwidth upgrade end time. Follow the ISO8601](~~ 25696 ~~) Standard said, and use UTC +0 time, format for yyyy-MM-ddThhZ. Accurate to **hours**(hh).
         * <p>
         * 
         * > temporary upgrade bandwidth end time and start time of the interval must be greater than or equal to 3 hours.
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
         * -true: change bandwidth configuration rear, automatic buckle fee. When you set the parameter Autopay to true, you must ensure that the account balance is sufficient. If the account balance is insufficient, an abnormal order is generated. This order cannot be paid in the ECS console and can only be invalidated.
         * -<props = "china">false: change bandwidth configuration rear, only generate orders don"t buckle fee. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated, this order can log on to [ECS management console](https://ecs.console.aliyun.com) payment. </props>
         * -<props = "intl">false: After the bandwidth configuration is changed, only the order is generated without deduction. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated, this order can log on to [ECS management console](https://ecs.console.aliyun.com) payment. </props>
         * -<props = "partner">false: change bandwidth configuration rear, only generate orders don"t buckle fee. If the balance of your payment method is insufficient, you can set the Autopay parameter to false to cancel automatic payment. In this case, a normal unpaid order is generated, you can log on to the [ECS console](https://partners-intl.console.aliyun.com/#/ecs) to pay for this order. </props>
         * 
         * Default: true
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Public network out bandwidth maximum value, unit: Mbit/s(Megabit per second). Valid values: 0 to 100.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Whether dispensing public IP ADDRESS.
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
         * Temporary bandwidth upgrade start time. Follow the ISO8601](~~ 25696 ~~) Standard said, and use UTC +0 time, format for yyyy-MM-ddThh: mmz. Accurate to **minutes**(mm).
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Set public network into bandwidth maximum value, unit: Mbit/s(Megabit per second). Valid values:
         * <p>
         * 
         * -When purchased public outlet bandwidth less than equal to 10 Mbit/s: 1~10, the default is 10.
         * -When purchased public outlet bandwidth greater than 10 Mbit/s: 1 ~ "internetmaxbandwidthout" value, default for "internetmaxbandwidthout" value.
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
