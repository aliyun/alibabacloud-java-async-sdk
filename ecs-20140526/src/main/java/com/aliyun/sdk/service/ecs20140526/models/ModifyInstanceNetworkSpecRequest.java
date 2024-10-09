// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceNetworkSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNetworkSpecRequest</p>
 */
public class ModifyInstanceNetworkSpecRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocatePublicIp")
    private Boolean allocatePublicIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthIn")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer internetMaxBandwidthIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkChargeType")
    private String networkChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ModifyInstanceNetworkSpecRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.allocatePublicIp = builder.allocatePublicIp;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.ISP = builder.ISP;
        this.instanceId = builder.instanceId;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkChargeType = builder.networkChargeType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
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
     * @return allocatePublicIp
     */
    public Boolean getAllocatePublicIp() {
        return this.allocatePublicIp;
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNetworkSpecRequest, Builder> {
        private String sourceRegionId; 
        private Boolean allocatePublicIp; 
        private Boolean autoPay; 
        private String clientToken; 
        private String endTime; 
        private String ISP; 
        private String instanceId; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String networkChargeType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNetworkSpecRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.allocatePublicIp = request.allocatePublicIp;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.ISP = request.ISP;
            this.instanceId = request.instanceId;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.networkChargeType = request.networkChargeType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
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
         * <p>Specifies whether to allocate a public IP address.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allocatePublicIp(Boolean allocatePublicIp) {
            this.putQueryParameter("AllocatePublicIp", allocatePublicIp);
            this.allocatePublicIp = allocatePublicIp;
            return this;
        }

        /**
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ul>
         * <li>true: After you modify the bandwidth configurations, the payment is automatically complete. Make sure that you have a sufficient balance in your account before you set AutoPay to true. If your account balance is insufficient, your order cannot be paid in the ECS console and becomes invalid. You must cancel the order.</li>
         * <li>false: After you modify the bandwidth configurations, an order is generated but the payment is not complete. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the <a href="https://ecs.console.aliyun.com">ECS console</a> to pay for the order.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The end time of the temporary bandwidth upgrade. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThhZ format. The time must be in UTC and accurate to <strong>hours</strong> (hh).</p>
         * <blockquote>
         * <p>The interval between the end time and the start time of the temporary bandwidth upgrade must be greater than or equal to 3 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-12-06T22Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The ID of the instance for which you want to modify bandwidth configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter range from 1 to 10, and the default value is 10.</li>
         * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter range from 1 to the value of <code>InternetMaxBandwidthOut</code>, and the default value is the value of <code>InternetMaxBandwidthOut</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth</li>
         * <li>PayByTraffic</li>
         * </ul>
         * <blockquote>
         * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidths instead of guaranteed values. In scenarios where demand outstrips resource supplies, these maximum bandwidths may be limited. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder networkChargeType(String networkChargeType) {
            this.putQueryParameter("NetworkChargeType", networkChargeType);
            this.networkChargeType = networkChargeType;
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
         * <p>The start time of the temporary bandwidth upgrade. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mmZ format. The time must be in UTC and accurate to <strong>minutes</strong> (mm).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T22:40Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ModifyInstanceNetworkSpecRequest build() {
            return new ModifyInstanceNetworkSpecRequest(this);
        } 

    } 

}
