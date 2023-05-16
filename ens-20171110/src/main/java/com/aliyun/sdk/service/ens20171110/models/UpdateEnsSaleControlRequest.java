// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnsSaleControlRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnsSaleControlRequest</p>
 */
public class UpdateEnsSaleControlRequest extends Request {
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

    private UpdateEnsSaleControlRequest(Builder builder) {
        super(builder);
        this.aliUidAccount = builder.aliUidAccount;
        this.commodityCode = builder.commodityCode;
        this.saleControls = builder.saleControls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnsSaleControlRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateEnsSaleControlRequest, Builder> {
        private String aliUidAccount; 
        private String commodityCode; 
        private java.util.List < SaleControls> saleControls; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnsSaleControlRequest request) {
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
        public UpdateEnsSaleControlRequest build() {
            return new UpdateEnsSaleControlRequest(this);
        } 

    } 

    public static class ConditionControls extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        private String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
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
    public static class ModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        private String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        private String moduleMinValue;

        @NameInMap("ModuleValue")
        private java.util.List < String > moduleValue;

        private ModuleValue(Builder builder) {
            this.moduleMaxValue = builder.moduleMaxValue;
            this.moduleMinValue = builder.moduleMinValue;
            this.moduleValue = builder.moduleValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleValue create() {
            return builder().build();
        }

        /**
         * @return moduleMaxValue
         */
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        /**
         * @return moduleMinValue
         */
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

        /**
         * @return moduleValue
         */
        public java.util.List < String > getModuleValue() {
            return this.moduleValue;
        }

        public static final class Builder {
            private String moduleMaxValue; 
            private String moduleMinValue; 
            private java.util.List < String > moduleValue; 

            /**
             * ModuleMaxValue.
             */
            public Builder moduleMaxValue(String moduleMaxValue) {
                this.moduleMaxValue = moduleMaxValue;
                return this;
            }

            /**
             * ModuleMinValue.
             */
            public Builder moduleMinValue(String moduleMinValue) {
                this.moduleMinValue = moduleMinValue;
                return this;
            }

            /**
             * ModuleValue.
             */
            public Builder moduleValue(java.util.List < String > moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            public ModuleValue build() {
                return new ModuleValue(this);
            } 

        } 

    }
    public static class SaleControls extends TeaModel {
        @NameInMap("ConditionControls")
        private java.util.List < ConditionControls> conditionControls;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModuleCode")
        @Validation(required = true)
        private String moduleCode;

        @NameInMap("ModuleValue")
        @Validation(required = true)
        private ModuleValue moduleValue;

        @NameInMap("Operator")
        @Validation(required = true)
        private String operator;

        @NameInMap("OrderType")
        @Validation(required = true)
        private String orderType;

        private SaleControls(Builder builder) {
            this.conditionControls = builder.conditionControls;
            this.description = builder.description;
            this.moduleCode = builder.moduleCode;
            this.moduleValue = builder.moduleValue;
            this.operator = builder.operator;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleValue
         */
        public ModuleValue getModuleValue() {
            return this.moduleValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private java.util.List < ConditionControls> conditionControls; 
            private String description; 
            private String moduleCode; 
            private ModuleValue moduleValue; 
            private String operator; 
            private String orderType; 

            /**
             * ConditionControls.
             */
            public Builder conditionControls(java.util.List < ConditionControls> conditionControls) {
                this.conditionControls = conditionControls;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ModuleValue.
             */
            public Builder moduleValue(ModuleValue moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
