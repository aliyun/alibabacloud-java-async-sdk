// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnsSaleConditionControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnsSaleConditionControlRequest</p>
 */
public class DeleteEnsSaleConditionControlRequest extends Request {
    @Query
    @NameInMap("AliUidAccount")
    @Validation(required = true)
    private String aliUidAccount;

    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("SaleControls")
    @Validation(required = true)
    private java.util.List < SaleControls> saleControls;

    private DeleteEnsSaleConditionControlRequest(Builder builder) {
        super(builder);
        this.aliUidAccount = builder.aliUidAccount;
        this.commodityCode = builder.commodityCode;
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
     * @return saleControls
     */
    public java.util.List < SaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static final class Builder extends Request.Builder<DeleteEnsSaleConditionControlRequest, Builder> {
        private String aliUidAccount; 
        private String commodityCode; 
        private java.util.List < SaleControls> saleControls; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnsSaleConditionControlRequest request) {
            super(request);
            this.aliUidAccount = request.aliUidAccount;
            this.commodityCode = request.commodityCode;
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
        @NameInMap("ConditionControlModuleCode")
        @Validation(required = true)
        private String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        @Validation(required = true)
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
        @NameInMap("ConditionControls")
        @Validation(required = true)
        private java.util.List < ConditionControls> conditionControls;

        @NameInMap("ModuleCode")
        @Validation(required = true)
        private String moduleCode;

        @NameInMap("OrderType")
        @Validation(required = true)
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
