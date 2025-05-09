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
 * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsSaleControlResponseBody</p>
 */
public class DescribeEnsSaleControlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaleControl")
    private java.util.List<SaleControl> saleControl;

    private DescribeEnsSaleControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.saleControl = builder.saleControl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsSaleControlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SaleControl> getSaleControl() {
        return this.saleControl;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SaleControl> saleControl; 

        private Builder() {
        } 

        private Builder(DescribeEnsSaleControlResponseBody model) {
            this.requestId = model.requestId;
            this.saleControl = model.saleControl;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaleControl.
         */
        public Builder saleControl(java.util.List<SaleControl> saleControl) {
            this.saleControl = saleControl;
            return this;
        }

        public DescribeEnsSaleControlResponseBody build() {
            return new DescribeEnsSaleControlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class ModuleValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleMaxValue")
        private String moduleMaxValue;

        @com.aliyun.core.annotation.NameInMap("ModuleMinValue")
        private String moduleMinValue;

        @com.aliyun.core.annotation.NameInMap("ModuleValue")
        private java.util.List<String> moduleValue;

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
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

        public static final class Builder {
            private String moduleMaxValue; 
            private String moduleMinValue; 
            private java.util.List<String> moduleValue; 

            private Builder() {
            } 

            private Builder(ModuleValue model) {
                this.moduleMaxValue = model.moduleMaxValue;
                this.moduleMinValue = model.moduleMinValue;
                this.moduleValue = model.moduleValue;
            } 

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
            public Builder moduleValue(java.util.List<String> moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            public ModuleValue build() {
                return new ModuleValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class BasicSaleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModuleValue")
        private ModuleValue moduleValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private BasicSaleControl(Builder builder) {
            this.description = builder.description;
            this.moduleValue = builder.moduleValue;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicSaleControl create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        public static final class Builder {
            private String description; 
            private ModuleValue moduleValue; 
            private String operator; 

            private Builder() {
            } 

            private Builder(BasicSaleControl model) {
                this.description = model.description;
                this.moduleValue = model.moduleValue;
                this.operator = model.operator;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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

            public BasicSaleControl build() {
                return new BasicSaleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class ConditionControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionControlModuleCode")
        private String conditionControlModuleCode;

        @com.aliyun.core.annotation.NameInMap("ConditionControlModuleValue")
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

            private Builder() {
            } 

            private Builder(ConditionControl model) {
                this.conditionControlModuleCode = model.conditionControlModuleCode;
                this.conditionControlModuleValue = model.conditionControlModuleValue;
            } 

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
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class ConditionSaleControlModuleValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleMaxValue")
        private String moduleMaxValue;

        @com.aliyun.core.annotation.NameInMap("ModuleMinValue")
        private String moduleMinValue;

        @com.aliyun.core.annotation.NameInMap("ModuleValue")
        private java.util.List<String> moduleValue;

        private ConditionSaleControlModuleValue(Builder builder) {
            this.moduleMaxValue = builder.moduleMaxValue;
            this.moduleMinValue = builder.moduleMinValue;
            this.moduleValue = builder.moduleValue;
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

        /**
         * @return moduleValue
         */
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

        public static final class Builder {
            private String moduleMaxValue; 
            private String moduleMinValue; 
            private java.util.List<String> moduleValue; 

            private Builder() {
            } 

            private Builder(ConditionSaleControlModuleValue model) {
                this.moduleMaxValue = model.moduleMaxValue;
                this.moduleMinValue = model.moduleMinValue;
                this.moduleValue = model.moduleValue;
            } 

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
            public Builder moduleValue(java.util.List<String> moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            public ConditionSaleControlModuleValue build() {
                return new ConditionSaleControlModuleValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class ConditionSaleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionControl")
        private ConditionControl conditionControl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModuleValue")
        private ConditionSaleControlModuleValue moduleValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private ConditionSaleControl(Builder builder) {
            this.conditionControl = builder.conditionControl;
            this.description = builder.description;
            this.moduleValue = builder.moduleValue;
            this.operator = builder.operator;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return moduleValue
         */
        public ConditionSaleControlModuleValue getModuleValue() {
            return this.moduleValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private ConditionControl conditionControl; 
            private String description; 
            private ConditionSaleControlModuleValue moduleValue; 
            private String operator; 

            private Builder() {
            } 

            private Builder(ConditionSaleControl model) {
                this.conditionControl = model.conditionControl;
                this.description = model.description;
                this.moduleValue = model.moduleValue;
                this.operator = model.operator;
            } 

            /**
             * ConditionControl.
             */
            public Builder conditionControl(ConditionControl conditionControl) {
                this.conditionControl = conditionControl;
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
             * ModuleValue.
             */
            public Builder moduleValue(ConditionSaleControlModuleValue moduleValue) {
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

            public ConditionSaleControl build() {
                return new ConditionSaleControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class SaleControlItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicSaleControl")
        private BasicSaleControl basicSaleControl;

        @com.aliyun.core.annotation.NameInMap("ConditionSaleControl")
        private java.util.List<ConditionSaleControl> conditionSaleControl;

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
        public java.util.List<ConditionSaleControl> getConditionSaleControl() {
            return this.conditionSaleControl;
        }

        public static final class Builder {
            private BasicSaleControl basicSaleControl; 
            private java.util.List<ConditionSaleControl> conditionSaleControl; 

            private Builder() {
            } 

            private Builder(SaleControlItem model) {
                this.basicSaleControl = model.basicSaleControl;
                this.conditionSaleControl = model.conditionSaleControl;
            } 

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
            public Builder conditionSaleControl(java.util.List<ConditionSaleControl> conditionSaleControl) {
                this.conditionSaleControl = conditionSaleControl;
                return this;
            }

            public SaleControlItem build() {
                return new SaleControlItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class SaleControlItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("SaleControlItem")
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

            private Builder() {
            } 

            private Builder(SaleControlItems model) {
                this.moduleCode = model.moduleCode;
                this.saleControlItem = model.saleControlItem;
            } 

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
    /**
     * 
     * {@link DescribeEnsSaleControlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlResponseBody</p>
     */
    public static class SaleControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("SaleControlItems")
        private java.util.List<SaleControlItems> saleControlItems;

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
        public java.util.List<SaleControlItems> getSaleControlItems() {
            return this.saleControlItems;
        }

        public static final class Builder {
            private String commodityCode; 
            private String orderType; 
            private java.util.List<SaleControlItems> saleControlItems; 

            private Builder() {
            } 

            private Builder(SaleControl model) {
                this.commodityCode = model.commodityCode;
                this.orderType = model.orderType;
                this.saleControlItems = model.saleControlItems;
            } 

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
            public Builder saleControlItems(java.util.List<SaleControlItems> saleControlItems) {
                this.saleControlItems = saleControlItems;
                return this;
            }

            public SaleControl build() {
                return new SaleControl(this);
            } 

        } 

    }
}
