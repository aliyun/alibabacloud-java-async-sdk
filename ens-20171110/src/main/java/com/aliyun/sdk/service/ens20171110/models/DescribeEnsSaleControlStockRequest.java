// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsSaleControlStockRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsSaleControlStockRequest</p>
 */
public class DescribeEnsSaleControlStockRequest extends Request {
    @Query
    @NameInMap("AliUidAccount")
    private String aliUidAccount;

    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("CustomAccount")
    private String customAccount;

    @Query
    @NameInMap("ModuleCode")
    private String moduleCode;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    private DescribeEnsSaleControlStockRequest(Builder builder) {
        super(builder);
        this.aliUidAccount = builder.aliUidAccount;
        this.commodityCode = builder.commodityCode;
        this.customAccount = builder.customAccount;
        this.moduleCode = builder.moduleCode;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsSaleControlStockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUidAccount
     */
    public String getAliUidAccount() {
        return this.aliUidAccount;
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
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<DescribeEnsSaleControlStockRequest, Builder> {
        private String aliUidAccount; 
        private String commodityCode; 
        private String customAccount; 
        private String moduleCode; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsSaleControlStockRequest request) {
            super(request);
            this.aliUidAccount = request.aliUidAccount;
            this.commodityCode = request.commodityCode;
            this.customAccount = request.customAccount;
            this.moduleCode = request.moduleCode;
            this.orderType = request.orderType;
        } 

        /**
         * AliUidAccount.
         */
        public Builder aliUidAccount(String aliUidAccount) {
            this.putQueryParameter("AliUidAccount", aliUidAccount);
            this.aliUidAccount = aliUidAccount;
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
         * CustomAccount.
         */
        public Builder customAccount(String customAccount) {
            this.putQueryParameter("CustomAccount", customAccount);
            this.customAccount = customAccount;
            return this;
        }

        /**
         * ModuleCode.
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
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
        public DescribeEnsSaleControlStockRequest build() {
            return new DescribeEnsSaleControlStockRequest(this);
        } 

    } 

}
