// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsCommodityRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsCommodityRequest</p>
 */
public class DescribeRdsCommodityRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    private DescribeRdsCommodityRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsCommodityRequest create() {
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<DescribeRdsCommodityRequest, Builder> {
        private String commodityCode; 
        private String drdsInstanceId; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsCommodityRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.drdsInstanceId = request.drdsInstanceId;
            this.orderType = request.orderType;
        } 

        /**
         * The commodity code of the service.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The type of the order.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public DescribeRdsCommodityRequest build() {
            return new DescribeRdsCommodityRequest(this);
        } 

    } 

}
