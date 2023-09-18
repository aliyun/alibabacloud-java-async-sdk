// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductResponseBody</p>
 */
public class DescribeProductResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ForceFatal")
    private Boolean forceFatal;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Synchro")
    private Boolean synchro;

    private DescribeProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.forceFatal = builder.forceFatal;
        this.httpCode = builder.httpCode;
        this.isSuccess = builder.isSuccess;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return forceFatal
     */
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String errorCode; 
        private Boolean forceFatal; 
        private String httpCode; 
        private Boolean isSuccess; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean synchro; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ForceFatal.
         */
        public Builder forceFatal(Boolean forceFatal) {
            this.forceFatal = forceFatal;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public DescribeProductResponseBody build() {
            return new DescribeProductResponseBody(this);
        } 

    } 

    public static class ProductExtras extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Label")
        private String label;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private Object values;

        private ProductExtras(Builder builder) {
            this.key = builder.key;
            this.label = builder.label;
            this.order = builder.order;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductExtras create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public Object getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String label; 
            private Integer order; 
            private String type; 
            private Object values; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(Object values) {
                this.values = values;
                return this;
            }

            public ProductExtras build() {
                return new ProductExtras(this);
            } 

        } 

    }
    public static class PropertyValues extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
        private String min;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Step")
        private String step;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private PropertyValues(Builder builder) {
            this.displayName = builder.displayName;
            this.max = builder.max;
            this.min = builder.min;
            this.remark = builder.remark;
            this.step = builder.step;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String displayName; 
            private String max; 
            private String min; 
            private String remark; 
            private String step; 
            private String type; 
            private String value; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("Conversion")
        private String conversion;

        @NameInMap("CustomContaint")
        private String customContaint;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("DisplayUnit")
        private String displayUnit;

        @NameInMap("Group")
        private String group;

        @NameInMap("IsNeedTransmit")
        private Boolean isNeedTransmit;

        @NameInMap("IsShow")
        private Boolean isShow;

        @NameInMap("IsUpgrade")
        private Boolean isUpgrade;

        @NameInMap("Key")
        private String key;

        @NameInMap("Name")
        private String name;

        @NameInMap("Order")
        private Long order;

        @NameInMap("PropertyValues")
        private java.util.List < PropertyValues> propertyValues;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ShowType")
        private String showType;

        @NameInMap("Unit")
        private String unit;

        private Properties(Builder builder) {
            this.conversion = builder.conversion;
            this.customContaint = builder.customContaint;
            this.displayName = builder.displayName;
            this.displayUnit = builder.displayUnit;
            this.group = builder.group;
            this.isNeedTransmit = builder.isNeedTransmit;
            this.isShow = builder.isShow;
            this.isUpgrade = builder.isUpgrade;
            this.key = builder.key;
            this.name = builder.name;
            this.order = builder.order;
            this.propertyValues = builder.propertyValues;
            this.remark = builder.remark;
            this.showType = builder.showType;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return conversion
         */
        public String getConversion() {
            return this.conversion;
        }

        /**
         * @return customContaint
         */
        public String getCustomContaint() {
            return this.customContaint;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayUnit
         */
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return isNeedTransmit
         */
        public Boolean getIsNeedTransmit() {
            return this.isNeedTransmit;
        }

        /**
         * @return isShow
         */
        public Boolean getIsShow() {
            return this.isShow;
        }

        /**
         * @return isUpgrade
         */
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Long getOrder() {
            return this.order;
        }

        /**
         * @return propertyValues
         */
        public java.util.List < PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String conversion; 
            private String customContaint; 
            private String displayName; 
            private String displayUnit; 
            private String group; 
            private Boolean isNeedTransmit; 
            private Boolean isShow; 
            private Boolean isUpgrade; 
            private String key; 
            private String name; 
            private Long order; 
            private java.util.List < PropertyValues> propertyValues; 
            private String remark; 
            private String showType; 
            private String unit; 

            /**
             * Conversion.
             */
            public Builder conversion(String conversion) {
                this.conversion = conversion;
                return this;
            }

            /**
             * CustomContaint.
             */
            public Builder customContaint(String customContaint) {
                this.customContaint = customContaint;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayUnit.
             */
            public Builder displayUnit(String displayUnit) {
                this.displayUnit = displayUnit;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * IsNeedTransmit.
             */
            public Builder isNeedTransmit(Boolean isNeedTransmit) {
                this.isNeedTransmit = isNeedTransmit;
                return this;
            }

            /**
             * IsShow.
             */
            public Builder isShow(Boolean isShow) {
                this.isShow = isShow;
                return this;
            }

            /**
             * IsUpgrade.
             */
            public Builder isUpgrade(Boolean isUpgrade) {
                this.isUpgrade = isUpgrade;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            /**
             * PropertyValues.
             */
            public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ShowType.
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Modules extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Properties")
        private java.util.List < Properties> properties;

        private Modules(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public java.util.List < Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String code; 
            private String id; 
            private String name; 
            private java.util.List < Properties> properties; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List < Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    public static class OrderPeriods extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("PeriodType")
        private String periodType;

        private OrderPeriods(Builder builder) {
            this.name = builder.name;
            this.periodType = builder.periodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderPeriods create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        public static final class Builder {
            private String name; 
            private String periodType; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PeriodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            public OrderPeriods build() {
                return new OrderPeriods(this);
            } 

        } 

    }
    public static class SalePriceItems extends TeaModel {
        @NameInMap("Price")
        private Float price;

        @NameInMap("PriceType")
        private String priceType;

        @NameInMap("TradeType")
        private String tradeType;

        private SalePriceItems(Builder builder) {
            this.price = builder.price;
            this.priceType = builder.priceType;
            this.tradeType = builder.tradeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SalePriceItems create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        /**
         * @return tradeType
         */
        public String getTradeType() {
            return this.tradeType;
        }

        public static final class Builder {
            private Float price; 
            private String priceType; 
            private String tradeType; 

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * PriceType.
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            /**
             * TradeType.
             */
            public Builder tradeType(String tradeType) {
                this.tradeType = tradeType;
                return this;
            }

            public SalePriceItems build() {
                return new SalePriceItems(this);
            } 

        } 

    }
    public static class SalePrices extends TeaModel {
        @NameInMap("Period")
        private String period;

        @NameInMap("Quota")
        private String quota;

        @NameInMap("SalePriceItems")
        private java.util.List < SalePriceItems> salePriceItems;

        @NameInMap("SortId")
        private Integer sortId;

        @NameInMap("Type")
        private String type;

        private SalePrices(Builder builder) {
            this.period = builder.period;
            this.quota = builder.quota;
            this.salePriceItems = builder.salePriceItems;
            this.sortId = builder.sortId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SalePrices create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return quota
         */
        public String getQuota() {
            return this.quota;
        }

        /**
         * @return salePriceItems
         */
        public java.util.List < SalePriceItems> getSalePriceItems() {
            return this.salePriceItems;
        }

        /**
         * @return sortId
         */
        public Integer getSortId() {
            return this.sortId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String period; 
            private String quota; 
            private java.util.List < SalePriceItems> salePriceItems; 
            private Integer sortId; 
            private String type; 

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(String quota) {
                this.quota = quota;
                return this;
            }

            /**
             * SalePriceItems.
             */
            public Builder salePriceItems(java.util.List < SalePriceItems> salePriceItems) {
                this.salePriceItems = salePriceItems;
                return this;
            }

            /**
             * SortId.
             */
            public Builder sortId(Integer sortId) {
                this.sortId = sortId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SalePrices build() {
                return new SalePrices(this);
            } 

        } 

    }
    public static class ProductSkus extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Code")
        private String code;

        @NameInMap("Constraints")
        private String constraints;

        @NameInMap("Hidden")
        private Boolean hidden;

        @NameInMap("Modules")
        private java.util.List < Modules> modules;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderPeriods")
        private java.util.List < OrderPeriods> orderPeriods;

        @NameInMap("Properties")
        private java.util.Map < String, ? > properties;

        @NameInMap("SalePrices")
        private java.util.List < SalePrices> salePrices;

        @NameInMap("SortId")
        private Integer sortId;

        private ProductSkus(Builder builder) {
            this.chargeType = builder.chargeType;
            this.code = builder.code;
            this.constraints = builder.constraints;
            this.hidden = builder.hidden;
            this.modules = builder.modules;
            this.name = builder.name;
            this.orderPeriods = builder.orderPeriods;
            this.properties = builder.properties;
            this.salePrices = builder.salePrices;
            this.sortId = builder.sortId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductSkus create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return constraints
         */
        public String getConstraints() {
            return this.constraints;
        }

        /**
         * @return hidden
         */
        public Boolean getHidden() {
            return this.hidden;
        }

        /**
         * @return modules
         */
        public java.util.List < Modules> getModules() {
            return this.modules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderPeriods
         */
        public java.util.List < OrderPeriods> getOrderPeriods() {
            return this.orderPeriods;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
        }

        /**
         * @return salePrices
         */
        public java.util.List < SalePrices> getSalePrices() {
            return this.salePrices;
        }

        /**
         * @return sortId
         */
        public Integer getSortId() {
            return this.sortId;
        }

        public static final class Builder {
            private String chargeType; 
            private String code; 
            private String constraints; 
            private Boolean hidden; 
            private java.util.List < Modules> modules; 
            private String name; 
            private java.util.List < OrderPeriods> orderPeriods; 
            private java.util.Map < String, ? > properties; 
            private java.util.List < SalePrices> salePrices; 
            private Integer sortId; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Constraints.
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * Hidden.
             */
            public Builder hidden(Boolean hidden) {
                this.hidden = hidden;
                return this;
            }

            /**
             * Modules.
             */
            public Builder modules(java.util.List < Modules> modules) {
                this.modules = modules;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderPeriods.
             */
            public Builder orderPeriods(java.util.List < OrderPeriods> orderPeriods) {
                this.orderPeriods = orderPeriods;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * SalePrices.
             */
            public Builder salePrices(java.util.List < SalePrices> salePrices) {
                this.salePrices = salePrices;
                return this;
            }

            /**
             * SortId.
             */
            public Builder sortId(Integer sortId) {
                this.sortId = sortId;
                return this;
            }

            public ProductSkus build() {
                return new ProductSkus(this);
            } 

        } 

    }
    public static class WangWangs extends TeaModel {
        @NameInMap("Remark")
        private String remark;

        @NameInMap("UserName")
        private String userName;

        private WangWangs(Builder builder) {
            this.remark = builder.remark;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WangWangs create() {
            return builder().build();
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String remark; 
            private String userName; 

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public WangWangs build() {
                return new WangWangs(this);
            } 

        } 

    }
    public static class ShopInfo extends TeaModel {
        @NameInMap("Emails")
        private String emails;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Telephones")
        private java.util.List < String > telephones;

        @NameInMap("WangWangs")
        private java.util.List < WangWangs> wangWangs;

        private ShopInfo(Builder builder) {
            this.emails = builder.emails;
            this.id = builder.id;
            this.name = builder.name;
            this.telephones = builder.telephones;
            this.wangWangs = builder.wangWangs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopInfo create() {
            return builder().build();
        }

        /**
         * @return emails
         */
        public String getEmails() {
            return this.emails;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return telephones
         */
        public java.util.List < String > getTelephones() {
            return this.telephones;
        }

        /**
         * @return wangWangs
         */
        public java.util.List < WangWangs> getWangWangs() {
            return this.wangWangs;
        }

        public static final class Builder {
            private String emails; 
            private Long id; 
            private String name; 
            private java.util.List < String > telephones; 
            private java.util.List < WangWangs> wangWangs; 

            /**
             * Emails.
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Telephones.
             */
            public Builder telephones(java.util.List < String > telephones) {
                this.telephones = telephones;
                return this;
            }

            /**
             * WangWangs.
             */
            public Builder wangWangs(java.util.List < WangWangs> wangWangs) {
                this.wangWangs = wangWangs;
                return this;
            }

            public ShopInfo build() {
                return new ShopInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AuditFailMsg")
        private String auditFailMsg;

        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("AuditTime")
        private Long auditTime;

        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("FrontCategoryId")
        private Long frontCategoryId;

        @NameInMap("GmtCreated")
        private Long gmtCreated;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("PicUrl")
        private String picUrl;

        @NameInMap("ProductExtras")
        private java.util.List < ProductExtras> productExtras;

        @NameInMap("ProductSkus")
        private java.util.List < ProductSkus> productSkus;

        @NameInMap("Score")
        private Double score;

        @NameInMap("ShopInfo")
        private ShopInfo shopInfo;

        @NameInMap("ShortDescription")
        private String shortDescription;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupplierPk")
        private Long supplierPk;

        @NameInMap("Type")
        private String type;

        @NameInMap("UseCount")
        private Long useCount;

        @NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.auditFailMsg = builder.auditFailMsg;
            this.auditStatus = builder.auditStatus;
            this.auditTime = builder.auditTime;
            this.code = builder.code;
            this.description = builder.description;
            this.frontCategoryId = builder.frontCategoryId;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.picUrl = builder.picUrl;
            this.productExtras = builder.productExtras;
            this.productSkus = builder.productSkus;
            this.score = builder.score;
            this.shopInfo = builder.shopInfo;
            this.shortDescription = builder.shortDescription;
            this.status = builder.status;
            this.supplierPk = builder.supplierPk;
            this.type = builder.type;
            this.useCount = builder.useCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return auditFailMsg
         */
        public String getAuditFailMsg() {
            return this.auditFailMsg;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return auditTime
         */
        public Long getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return frontCategoryId
         */
        public Long getFrontCategoryId() {
            return this.frontCategoryId;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return productExtras
         */
        public java.util.List < ProductExtras> getProductExtras() {
            return this.productExtras;
        }

        /**
         * @return productSkus
         */
        public java.util.List < ProductSkus> getProductSkus() {
            return this.productSkus;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return shopInfo
         */
        public ShopInfo getShopInfo() {
            return this.shopInfo;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplierPk
         */
        public Long getSupplierPk() {
            return this.supplierPk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return useCount
         */
        public Long getUseCount() {
            return this.useCount;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String auditFailMsg; 
            private String auditStatus; 
            private Long auditTime; 
            private String code; 
            private String description; 
            private Long frontCategoryId; 
            private Long gmtCreated; 
            private Long gmtModified; 
            private String name; 
            private String picUrl; 
            private java.util.List < ProductExtras> productExtras; 
            private java.util.List < ProductSkus> productSkus; 
            private Double score; 
            private ShopInfo shopInfo; 
            private String shortDescription; 
            private String status; 
            private Long supplierPk; 
            private String type; 
            private Long useCount; 
            private String version; 

            /**
             * AuditFailMsg.
             */
            public Builder auditFailMsg(String auditFailMsg) {
                this.auditFailMsg = auditFailMsg;
                return this;
            }

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AuditTime.
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * FrontCategoryId.
             */
            public Builder frontCategoryId(Long frontCategoryId) {
                this.frontCategoryId = frontCategoryId;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * ProductExtras.
             */
            public Builder productExtras(java.util.List < ProductExtras> productExtras) {
                this.productExtras = productExtras;
                return this;
            }

            /**
             * ProductSkus.
             */
            public Builder productSkus(java.util.List < ProductSkus> productSkus) {
                this.productSkus = productSkus;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * ShopInfo.
             */
            public Builder shopInfo(ShopInfo shopInfo) {
                this.shopInfo = shopInfo;
                return this;
            }

            /**
             * ShortDescription.
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupplierPk.
             */
            public Builder supplierPk(Long supplierPk) {
                this.supplierPk = supplierPk;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UseCount.
             */
            public Builder useCount(Long useCount) {
                this.useCount = useCount;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
