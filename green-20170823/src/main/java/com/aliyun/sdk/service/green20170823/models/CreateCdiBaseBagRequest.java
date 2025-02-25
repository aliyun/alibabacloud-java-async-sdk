// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdiBaseBagRequest} extends {@link RequestModel}
 *
 * <p>CreateCdiBaseBagRequest</p>
 */
public class CreateCdiBaseBagRequest extends Request {
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
    @NameInMap("FlowOutSpec")
    private Integer flowOutSpec;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private CreateCdiBaseBagRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.duration = builder.duration;
        this.flowOutSpec = builder.flowOutSpec;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdiBaseBagRequest create() {
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
     * @return flowOutSpec
     */
    public Integer getFlowOutSpec() {
        return this.flowOutSpec;
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

    public static final class Builder extends Request.Builder<CreateCdiBaseBagRequest, Builder> {
        private String clientToken; 
        private String commodityCode; 
        private Integer duration; 
        private Integer flowOutSpec; 
        private String orderType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdiBaseBagRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.duration = request.duration;
            this.flowOutSpec = request.flowOutSpec;
            this.orderType = request.orderType;
            this.ownerId = request.ownerId;
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
         * FlowOutSpec.
         */
        public Builder flowOutSpec(Integer flowOutSpec) {
            this.putQueryParameter("FlowOutSpec", flowOutSpec);
            this.flowOutSpec = flowOutSpec;
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

        @Override
        public CreateCdiBaseBagRequest build() {
            return new CreateCdiBaseBagRequest(this);
        } 

    } 

}
