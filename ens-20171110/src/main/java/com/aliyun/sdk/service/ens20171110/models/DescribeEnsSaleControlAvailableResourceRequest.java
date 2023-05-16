// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsSaleControlAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsSaleControlAvailableResourceRequest</p>
 */
public class DescribeEnsSaleControlAvailableResourceRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    private DescribeEnsSaleControlAvailableResourceRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsSaleControlAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<DescribeEnsSaleControlAvailableResourceRequest, Builder> {
        private String commodityCode; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsSaleControlAvailableResourceRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.orderType = request.orderType;
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
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public DescribeEnsSaleControlAvailableResourceRequest build() {
            return new DescribeEnsSaleControlAvailableResourceRequest(this);
        } 

    } 

}
