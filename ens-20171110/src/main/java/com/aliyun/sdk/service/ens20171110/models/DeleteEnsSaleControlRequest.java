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
 * {@link DeleteEnsSaleControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnsSaleControlRequest</p>
 */
public class DeleteEnsSaleControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUidAccount")
    private String aliUidAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAccount")
    private String customAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleControls")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SaleControls> saleControls;

    private DeleteEnsSaleControlRequest(Builder builder) {
        super(builder);
        this.aliUidAccount = builder.aliUidAccount;
        this.commodityCode = builder.commodityCode;
        this.customAccount = builder.customAccount;
        this.saleControls = builder.saleControls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnsSaleControlRequest create() {
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
     * @return saleControls
     */
    public java.util.List<SaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static final class Builder extends Request.Builder<DeleteEnsSaleControlRequest, Builder> {
        private String aliUidAccount; 
        private String commodityCode; 
        private String customAccount; 
        private java.util.List<SaleControls> saleControls; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnsSaleControlRequest request) {
            super(request);
            this.aliUidAccount = request.aliUidAccount;
            this.commodityCode = request.commodityCode;
            this.customAccount = request.customAccount;
            this.saleControls = request.saleControls;
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
         * <p>This parameter is required.</p>
         */
        public Builder saleControls(java.util.List<SaleControls> saleControls) {
            String saleControlsShrink = shrink(saleControls, "SaleControls", "json");
            this.putQueryParameter("SaleControls", saleControlsShrink);
            this.saleControls = saleControls;
            return this;
        }

        @Override
        public DeleteEnsSaleControlRequest build() {
            return new DeleteEnsSaleControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEnsSaleControlRequest} extends {@link TeaModel}
     *
     * <p>DeleteEnsSaleControlRequest</p>
     */
    public static class SaleControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderType;

        private SaleControls(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleControls create() {
            return builder().build();
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

        public static final class Builder {
            private String moduleCode; 
            private String orderType; 

            private Builder() {
            } 

            private Builder(SaleControls model) {
                this.moduleCode = model.moduleCode;
                this.orderType = model.orderType;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public SaleControls build() {
                return new SaleControls(this);
            } 

        } 

    }
}
