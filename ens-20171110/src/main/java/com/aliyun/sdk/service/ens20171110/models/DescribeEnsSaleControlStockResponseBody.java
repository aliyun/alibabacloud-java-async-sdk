// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsSaleControlStockResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsSaleControlStockResponseBody</p>
 */
public class DescribeEnsSaleControlStockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SaleControl")
    private java.util.List < SaleControl> saleControl;

    private DescribeEnsSaleControlStockResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.saleControl = builder.saleControl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsSaleControlStockResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saleControl
     */
    public java.util.List < SaleControl> getSaleControl() {
        return this.saleControl;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SaleControl> saleControl; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaleControl.
         */
        public Builder saleControl(java.util.List < SaleControl> saleControl) {
            this.saleControl = saleControl;
            return this;
        }

        public DescribeEnsSaleControlStockResponseBody build() {
            return new DescribeEnsSaleControlStockResponseBody(this);
        } 

    } 

    public static class ModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        private String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        private String moduleMinValue;

        private ModuleValue(Builder builder) {
            this.moduleMaxValue = builder.moduleMaxValue;
            this.moduleMinValue = builder.moduleMinValue;
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

        public static final class Builder {
            private String moduleMaxValue; 
            private String moduleMinValue; 

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

            public ModuleValue build() {
                return new ModuleValue(this);
            } 

        } 

    }
    public static class BasicSaleControl extends TeaModel {
        @NameInMap("ModuleValue")
        private ModuleValue moduleValue;

        @NameInMap("StockValue")
        private String stockValue;

        private BasicSaleControl(Builder builder) {
            this.moduleValue = builder.moduleValue;
            this.stockValue = builder.stockValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicSaleControl create() {
            return builder().build();
        }

        /**
         * @return moduleValue
         */
        public ModuleValue getModuleValue() {
            return this.moduleValue;
        }

        /**
         * @return stockValue
         */
        public String getStockValue() {
            return this.stockValue;
        }

        public static final class Builder {
            private ModuleValue moduleValue; 
            private String stockValue; 

            /**
             * ModuleValue.
             */
            public Builder moduleValue(ModuleValue moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            /**
             * StockValue.
             */
            public Builder stockValue(String stockValue) {
                this.stockValue = stockValue;
                return this;
            }

            public BasicSaleControl build() {
                return new BasicSaleControl(this);
            } 

        } 

    }
    public static class ConditionControl extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        private String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        private String conditionControlModuleValue;

        private ConditionControl(Builder builder) {
            this.conditionControlModuleCode = builder.conditionControlModuleCode;
            this.conditionControlModuleValue = builder.conditionControlModuleValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionControl create() {
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

            public ConditionControl build() {
                return new ConditionControl(this);
            } 

        } 

    }
    public static class ConditionSaleControlModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        private String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        private String moduleMinValue;

        private ConditionSaleControlModuleValue(Builder builder) {
            this.moduleMaxValue = builder.moduleMaxValue;
            this.moduleMinValue = builder.moduleMinValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionSaleControlModuleValue create() {
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

        public static final class Builder {
            private String moduleMaxValue; 
            private String moduleMinValue; 

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

            public ConditionSaleControlModuleValue build() {
                return new ConditionSaleControlModuleValue(this);
            } 

        } 

    }
    public static class ConditionSaleControl extends TeaModel {
        @NameInMap("ConditionControl")
        private ConditionControl conditionControl;

        @NameInMap("ModuleValue")
        private ConditionSaleControlModuleValue moduleValue;

        @NameInMap("StockValue")
        private String stockValue;

        private ConditionSaleControl(Builder builder) {
            this.conditionControl = builder.conditionControl;
            this.moduleValue = builder.moduleValue;
            this.stockValue = builder.stockValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionSaleControl create() {
            return builder().build();
        }

        /**
         * @return conditionControl
         */
        public ConditionControl getConditionControl() {
            return this.conditionControl;
        }

        /**
         * @return moduleValue
         */
        public ConditionSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        /**
         * @return stockValue
         */
        public String getStockValue() {
            return this.stockValue;
        }

        public static final class Builder {
            private ConditionControl conditionControl; 
            private ConditionSaleControlModuleValue moduleValue; 
            private String stockValue; 

            /**
             * ConditionControl.
             */
            public Builder conditionControl(ConditionControl conditionControl) {
                this.conditionControl = conditionControl;
                return this;
            }

            /**
             * ModuleValue.
             */
            public Builder moduleValue(ConditionSaleControlModuleValue moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            /**
             * StockValue.
             */
            public Builder stockValue(String stockValue) {
                this.stockValue = stockValue;
                return this;
            }

            public ConditionSaleControl build() {
                return new ConditionSaleControl(this);
            } 

        } 

    }
    public static class SaleControlItem extends TeaModel {
        @NameInMap("BasicSaleControl")
        private BasicSaleControl basicSaleControl;

        @NameInMap("ConditionSaleControl")
        private java.util.List < ConditionSaleControl> conditionSaleControl;

        private SaleControlItem(Builder builder) {
            this.basicSaleControl = builder.basicSaleControl;
            this.conditionSaleControl = builder.conditionSaleControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleControlItem create() {
            return builder().build();
        }

        /**
         * @return basicSaleControl
         */
        public BasicSaleControl getBasicSaleControl() {
            return this.basicSaleControl;
        }

        /**
         * @return conditionSaleControl
         */
        public java.util.List < ConditionSaleControl> getConditionSaleControl() {
            return this.conditionSaleControl;
        }

        public static final class Builder {
            private BasicSaleControl basicSaleControl; 
            private java.util.List < ConditionSaleControl> conditionSaleControl; 

            /**
             * BasicSaleControl.
             */
            public Builder basicSaleControl(BasicSaleControl basicSaleControl) {
                this.basicSaleControl = basicSaleControl;
                return this;
            }

            /**
             * ConditionSaleControl.
             */
            public Builder conditionSaleControl(java.util.List < ConditionSaleControl> conditionSaleControl) {
                this.conditionSaleControl = conditionSaleControl;
                return this;
            }

            public SaleControlItem build() {
                return new SaleControlItem(this);
            } 

        } 

    }
    public static class SaleControlItems extends TeaModel {
        @NameInMap("ModuleCode")
        private String moduleCode;

        @NameInMap("SaleControlItem")
        private SaleControlItem saleControlItem;

        private SaleControlItems(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.saleControlItem = builder.saleControlItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleControlItems create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return saleControlItem
         */
        public SaleControlItem getSaleControlItem() {
            return this.saleControlItem;
        }

        public static final class Builder {
            private String moduleCode; 
            private SaleControlItem saleControlItem; 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * SaleControlItem.
             */
            public Builder saleControlItem(SaleControlItem saleControlItem) {
                this.saleControlItem = saleControlItem;
                return this;
            }

            public SaleControlItems build() {
                return new SaleControlItems(this);
            } 

        } 

    }
    public static class SaleControl extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("SaleControlItems")
        private java.util.List < SaleControlItems> saleControlItems;

        private SaleControl(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.orderType = builder.orderType;
            this.saleControlItems = builder.saleControlItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleControl create() {
            return builder().build();
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

        /**
         * @return saleControlItems
         */
        public java.util.List < SaleControlItems> getSaleControlItems() {
            return this.saleControlItems;
        }

        public static final class Builder {
            private String commodityCode; 
            private String orderType; 
            private java.util.List < SaleControlItems> saleControlItems; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * SaleControlItems.
             */
            public Builder saleControlItems(java.util.List < SaleControlItems> saleControlItems) {
                this.saleControlItems = saleControlItems;
                return this;
            }

            public SaleControl build() {
                return new SaleControl(this);
            } 

        } 

    }
}
