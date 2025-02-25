// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdiBagRequest} extends {@link RequestModel}
 *
 * <p>CreateCdiBagRequest</p>
 */
public class CreateCdiBagRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("FlowOutSpec")
    private Integer flowOutSpec;

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

    private CreateCdiBagRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.flowOutSpec = builder.flowOutSpec;
        this.orderNum = builder.orderNum;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdiBagRequest create() {
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
     * @return flowOutSpec
     */
    public Integer getFlowOutSpec() {
        return this.flowOutSpec;
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

    public static final class Builder extends Request.Builder<CreateCdiBagRequest, Builder> {
        private String clientToken; 
        private String commodityCode; 
        private Integer flowOutSpec; 
        private Integer orderNum; 
        private String orderType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdiBagRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.flowOutSpec = request.flowOutSpec;
            this.orderNum = request.orderNum;
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
         * FlowOutSpec.
         */
        public Builder flowOutSpec(Integer flowOutSpec) {
            this.putQueryParameter("FlowOutSpec", flowOutSpec);
            this.flowOutSpec = flowOutSpec;
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

        @Override
        public CreateCdiBagRequest build() {
            return new CreateCdiBagRequest(this);
        } 

    } 

}
