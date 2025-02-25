// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewWebSiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewWebSiteInstanceRequest</p>
 */
public class RenewWebSiteInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("Duration")
    @Validation(required = true)
    private Integer duration;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderNum")
    private Integer orderNum;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    private RenewWebSiteInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.orderNum = builder.orderNum;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewWebSiteInstanceRequest create() {
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
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderNum
     */
    public Integer getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public static final class Builder extends Request.Builder<RenewWebSiteInstanceRequest, Builder> {
        private String clientToken; 
        private String commodityCode; 
        private Integer duration; 
        private String instanceId; 
        private Integer orderNum; 
        private String orderType; 
        private Long ownerId; 
        private String pricingCycle; 

        private Builder() {
            super();
        } 

        private Builder(RenewWebSiteInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.orderNum = request.orderNum;
            this.orderType = request.orderType;
            this.ownerId = request.ownerId;
            this.pricingCycle = request.pricingCycle;
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
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
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
         * OrderNum.
         */
        public Builder orderNum(Integer orderNum) {
            this.putQueryParameter("OrderNum", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        @Override
        public RenewWebSiteInstanceRequest build() {
            return new RenewWebSiteInstanceRequest(this);
        } 

    } 

}
