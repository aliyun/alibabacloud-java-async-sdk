// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnsSaleConditionControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnsSaleConditionControlRequest</p>
 */
public class DeleteEnsSaleConditionControlRequest extends Request {
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
    private java.util.List < SaleControls> saleControls;

    private DeleteEnsSaleConditionControlRequest(Builder builder) {
        super(builder);
        this.aliUidAccount = builder.aliUidAccount;
        this.commodityCode = builder.commodityCode;
        this.customAccount = builder.customAccount;
        this.saleControls = builder.saleControls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnsSaleConditionControlRequest create() {
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
    public java.util.List < SaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static final class Builder extends Request.Builder<DeleteEnsSaleConditionControlRequest, Builder> {
        private String aliUidAccount; 
        private String commodityCode; 
        private String customAccount; 
        private java.util.List < SaleControls> saleControls; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnsSaleConditionControlRequest request) {
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
         * SaleControls.
         */
        public Builder saleControls(java.util.List < SaleControls> saleControls) {
            String saleControlsShrink = shrink(saleControls, "SaleControls", "json");
            this.putQueryParameter("SaleControls", saleControlsShrink);
            this.saleControls = saleControls;
            return this;
        }

        @Override
        public DeleteEnsSaleConditionControlRequest build() {
            return new DeleteEnsSaleConditionControlRequest(this);
        } 

    } 

    public static class ConditionControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionControlModuleCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionControlModuleCode;

        @com.aliyun.core.annotation.NameInMap("ConditionControlModuleValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionControlModuleValue;

        private ConditionControls(Builder builder) {
            this.conditionControlModuleCode = builder.conditionControlModuleCode;
            this.conditionControlModuleValue = builder.conditionControlModuleValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionControls create() {
            return builder().build();
        }

        /**
         * @return conditionControlModuleCode
         */
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        /**
         * @return conditionControlModuleValue
         */
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

        public static final class Builder {
            private String conditionControlModuleCode; 
            private String conditionControlModuleValue; 

            /**
             * ConditionControlModuleCode.
             */
            public Builder conditionControlModuleCode(String conditionControlModuleCode) {
                this.conditionControlModuleCode = conditionControlModuleCode;
                return this;
            }

            /**
             * ConditionControlModuleValue.
             */
            public Builder conditionControlModuleValue(String conditionControlModuleValue) {
                this.conditionControlModuleValue = conditionControlModuleValue;
                return this;
            }

            public ConditionControls build() {
                return new ConditionControls(this);
            } 

        } 

    }
    public static class SaleControls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionControls")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < ConditionControls> conditionControls;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderType;

        private SaleControls(Builder builder) {
            this.conditionControls = builder.conditionControls;
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
         * @return conditionControls
         */
        public java.util.List < ConditionControls> getConditionControls() {
            return this.conditionControls;
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
            private java.util.List < ConditionControls> conditionControls; 
            private String moduleCode; 
            private String orderType; 

            /**
             * ConditionControls.
             */
            public Builder conditionControls(java.util.List < ConditionControls> conditionControls) {
                this.conditionControls = conditionControls;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * OrderType.
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
