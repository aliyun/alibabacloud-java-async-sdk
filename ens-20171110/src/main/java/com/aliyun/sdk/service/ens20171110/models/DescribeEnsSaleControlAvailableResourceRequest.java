// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEnsSaleControlAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsSaleControlAvailableResourceRequest</p>
 */
public class DescribeEnsSaleControlAvailableResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAccount")
    private String customAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    private DescribeEnsSaleControlAvailableResourceRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.customAccount = builder.customAccount;
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
     * @return customAccount
     */
    public String getCustomAccount() {
        return this.customAccount;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<DescribeEnsSaleControlAvailableResourceRequest, Builder> {
        private String commodityCode; 
        private String customAccount; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsSaleControlAvailableResourceRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.customAccount = request.customAccount;
            this.orderType = request.orderType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * CustomAccount.
         */
        public Builder customAccount(String customAccount) {
            this.putQueryParameter("CustomAccount", customAccount);
            this.customAccount = customAccount;
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
