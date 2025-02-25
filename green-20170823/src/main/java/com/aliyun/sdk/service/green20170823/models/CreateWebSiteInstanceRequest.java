// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebSiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateWebSiteInstanceRequest</p>
 */
public class CreateWebSiteInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Duration")
    @Validation(required = true)
    private Integer duration;

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

    private CreateWebSiteInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
        this.orderNum = builder.orderNum;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
        this.pricingCycle = builder.pricingCycle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebSiteInstanceRequest create() {
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
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

    public static final class Builder extends Request.Builder<CreateWebSiteInstanceRequest, Builder> {
        private String clientToken; 
        private Integer duration; 
        private Integer orderNum; 
        private String orderType; 
        private Long ownerId; 
        private String pricingCycle; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebSiteInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.duration = request.duration;
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
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
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
        public CreateWebSiteInstanceRequest build() {
            return new CreateWebSiteInstanceRequest(this);
        } 

    } 

}
