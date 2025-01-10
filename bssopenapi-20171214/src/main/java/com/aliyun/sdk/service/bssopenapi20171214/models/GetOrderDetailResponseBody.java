// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderDetailResponseBody</p>
 */
public class GetOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOrderDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrderDetailResponseBody build() {
            return new GetOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class BillModuleProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttrApiCode")
        private String attrApiCode;

        @com.aliyun.core.annotation.NameInMap("ModuleApiCode")
        private String moduleApiCode;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BillModuleProperties(Builder builder) {
            this.attrApiCode = builder.attrApiCode;
            this.moduleApiCode = builder.moduleApiCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillModuleProperties create() {
            return builder().build();
        }

        /**
         * @return attrApiCode
         */
        public String getAttrApiCode() {
            return this.attrApiCode;
        }

        /**
         * @return moduleApiCode
         */
        public String getModuleApiCode() {
            return this.moduleApiCode;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String attrApiCode; 
            private String moduleApiCode; 
            private String value; 

            /**
             * <p>The attribute code of the configured item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder attrApiCode(String attrApiCode) {
                this.attrApiCode = attrApiCode;
                return this;
            }

            /**
             * <p>The API code of the configured item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder moduleApiCode(String moduleApiCode) {
                this.moduleApiCode = moduleApiCode;
                return this;
            }

            /**
             * <p>The attribute value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BillModuleProperties build() {
                return new BillModuleProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class BillModuleConfigBillModuleProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billModuleProperties")
        private java.util.List<BillModuleProperties> billModuleProperties;

        private BillModuleConfigBillModuleProperties(Builder builder) {
            this.billModuleProperties = builder.billModuleProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillModuleConfigBillModuleProperties create() {
            return builder().build();
        }

        /**
         * @return billModuleProperties
         */
        public java.util.List<BillModuleProperties> getBillModuleProperties() {
            return this.billModuleProperties;
        }

        public static final class Builder {
            private java.util.List<BillModuleProperties> billModuleProperties; 

            /**
             * billModuleProperties.
             */
            public Builder billModuleProperties(java.util.List<BillModuleProperties> billModuleProperties) {
                this.billModuleProperties = billModuleProperties;
                return this;
            }

            public BillModuleConfigBillModuleProperties build() {
                return new BillModuleConfigBillModuleProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class BillModuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCode")
        private String apiCode;

        @com.aliyun.core.annotation.NameInMap("BillModuleProperties")
        private BillModuleConfigBillModuleProperties billModuleProperties;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BillModuleConfig(Builder builder) {
            this.apiCode = builder.apiCode;
            this.billModuleProperties = builder.billModuleProperties;
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillModuleConfig create() {
            return builder().build();
        }

        /**
         * @return apiCode
         */
        public String getApiCode() {
            return this.apiCode;
        }

        /**
         * @return billModuleProperties
         */
        public BillModuleConfigBillModuleProperties getBillModuleProperties() {
            return this.billModuleProperties;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String apiCode; 
            private BillModuleConfigBillModuleProperties billModuleProperties; 
            private String code; 
            private String name; 

            /**
             * <p>The API code of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>datadisk</p>
             */
            public Builder apiCode(String apiCode) {
                this.apiCode = apiCode;
                return this;
            }

            /**
             * <p>The attributes of the configured item.</p>
             */
            public Builder billModuleProperties(BillModuleConfigBillModuleProperties billModuleProperties) {
                this.billModuleProperties = billModuleProperties;
                return this;
            }

            /**
             * <p>The code of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>datadisk</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>Data disk</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BillModuleConfig build() {
                return new BillModuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class OrderBillModuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billModuleConfig")
        private java.util.List<BillModuleConfig> billModuleConfig;

        private OrderBillModuleConfig(Builder builder) {
            this.billModuleConfig = builder.billModuleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderBillModuleConfig create() {
            return builder().build();
        }

        /**
         * @return billModuleConfig
         */
        public java.util.List<BillModuleConfig> getBillModuleConfig() {
            return this.billModuleConfig;
        }

        public static final class Builder {
            private java.util.List<BillModuleConfig> billModuleConfig; 

            /**
             * billModuleConfig.
             */
            public Builder billModuleConfig(java.util.List<BillModuleConfig> billModuleConfig) {
                this.billModuleConfig = billModuleConfig;
                return this;
            }

            public OrderBillModuleConfig build() {
                return new OrderBillModuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class ModuleProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ModuleProperties(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleProperties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String value; 

            /**
             * <p>The attribute code of the configured item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The attribute name of the configured item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The attribute value of the configured item.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ModuleProperties build() {
                return new ModuleProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class OriginalModuleConfigModuleProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleProperties")
        private java.util.List<ModuleProperties> moduleProperties;

        private OriginalModuleConfigModuleProperties(Builder builder) {
            this.moduleProperties = builder.moduleProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalModuleConfigModuleProperties create() {
            return builder().build();
        }

        /**
         * @return moduleProperties
         */
        public java.util.List<ModuleProperties> getModuleProperties() {
            return this.moduleProperties;
        }

        public static final class Builder {
            private java.util.List<ModuleProperties> moduleProperties; 

            /**
             * moduleProperties.
             */
            public Builder moduleProperties(java.util.List<ModuleProperties> moduleProperties) {
                this.moduleProperties = moduleProperties;
                return this;
            }

            public OriginalModuleConfigModuleProperties build() {
                return new OriginalModuleConfigModuleProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class OriginalModuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ModuleProperties")
        private OriginalModuleConfigModuleProperties moduleProperties;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private OriginalModuleConfig(Builder builder) {
            this.code = builder.code;
            this.moduleProperties = builder.moduleProperties;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalModuleConfig create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return moduleProperties
         */
        public OriginalModuleConfigModuleProperties getModuleProperties() {
            return this.moduleProperties;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private OriginalModuleConfigModuleProperties moduleProperties; 
            private String name; 

            /**
             * <p>The code of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>systemdisk</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The attributes of the configured item.</p>
             */
            public Builder moduleProperties(OriginalModuleConfigModuleProperties moduleProperties) {
                this.moduleProperties = moduleProperties;
                return this;
            }

            /**
             * <p>The name of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>System disk</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OriginalModuleConfig build() {
                return new OriginalModuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class OrderOriginalModuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("originalModuleConfig")
        private java.util.List<OriginalModuleConfig> originalModuleConfig;

        private OrderOriginalModuleConfig(Builder builder) {
            this.originalModuleConfig = builder.originalModuleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderOriginalModuleConfig create() {
            return builder().build();
        }

        /**
         * @return originalModuleConfig
         */
        public java.util.List<OriginalModuleConfig> getOriginalModuleConfig() {
            return this.originalModuleConfig;
        }

        public static final class Builder {
            private java.util.List<OriginalModuleConfig> originalModuleConfig; 

            /**
             * originalModuleConfig.
             */
            public Builder originalModuleConfig(java.util.List<OriginalModuleConfig> originalModuleConfig) {
                this.originalModuleConfig = originalModuleConfig;
                return this;
            }

            public OrderOriginalModuleConfig build() {
                return new OrderOriginalModuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterTaxAmount")
        private String afterTaxAmount;

        @com.aliyun.core.annotation.NameInMap("BillModuleConfig")
        private OrderBillModuleConfig billModuleConfig;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("ExtendInfos")
        private java.util.Map<String, String> extendInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceIDs")
        private String instanceIDs;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderSubType")
        private String orderSubType;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OriginalConfig")
        private String originalConfig;

        @com.aliyun.core.annotation.NameInMap("OriginalModuleConfig")
        private OrderOriginalModuleConfig originalModuleConfig;

        @com.aliyun.core.annotation.NameInMap("PaymentCurrency")
        private String paymentCurrency;

        @com.aliyun.core.annotation.NameInMap("PaymentStatus")
        private String paymentStatus;

        @com.aliyun.core.annotation.NameInMap("PaymentTime")
        private String paymentTime;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private String pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxAmountLocal")
        private String pretaxAmountLocal;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private String pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RelatedOrderId")
        private String relatedOrderId;

        @com.aliyun.core.annotation.NameInMap("SubOrderId")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tax")
        private String tax;

        @com.aliyun.core.annotation.NameInMap("UsageEndTime")
        private String usageEndTime;

        @com.aliyun.core.annotation.NameInMap("UsageStartTime")
        private String usageStartTime;

        private Order(Builder builder) {
            this.afterTaxAmount = builder.afterTaxAmount;
            this.billModuleConfig = builder.billModuleConfig;
            this.commodityCode = builder.commodityCode;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.currency = builder.currency;
            this.extendInfos = builder.extendInfos;
            this.instanceIDs = builder.instanceIDs;
            this.operator = builder.operator;
            this.orderId = builder.orderId;
            this.orderSubType = builder.orderSubType;
            this.orderType = builder.orderType;
            this.originalConfig = builder.originalConfig;
            this.originalModuleConfig = builder.originalModuleConfig;
            this.paymentCurrency = builder.paymentCurrency;
            this.paymentStatus = builder.paymentStatus;
            this.paymentTime = builder.paymentTime;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxAmountLocal = builder.pretaxAmountLocal;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
            this.quantity = builder.quantity;
            this.region = builder.region;
            this.relatedOrderId = builder.relatedOrderId;
            this.subOrderId = builder.subOrderId;
            this.subscriptionType = builder.subscriptionType;
            this.tax = builder.tax;
            this.usageEndTime = builder.usageEndTime;
            this.usageStartTime = builder.usageStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return afterTaxAmount
         */
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        /**
         * @return billModuleConfig
         */
        public OrderBillModuleConfig getBillModuleConfig() {
            return this.billModuleConfig;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return extendInfos
         */
        public java.util.Map<String, String> getExtendInfos() {
            return this.extendInfos;
        }

        /**
         * @return instanceIDs
         */
        public String getInstanceIDs() {
            return this.instanceIDs;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderSubType
         */
        public String getOrderSubType() {
            return this.orderSubType;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return originalConfig
         */
        public String getOriginalConfig() {
            return this.originalConfig;
        }

        /**
         * @return originalModuleConfig
         */
        public OrderOriginalModuleConfig getOriginalModuleConfig() {
            return this.originalModuleConfig;
        }

        /**
         * @return paymentCurrency
         */
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        /**
         * @return paymentStatus
         */
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        /**
         * @return paymentTime
         */
        public String getPaymentTime() {
            return this.paymentTime;
        }

        /**
         * @return pretaxAmount
         */
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return pretaxAmountLocal
         */
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        /**
         * @return pretaxGrossAmount
         */
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relatedOrderId
         */
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        /**
         * @return tax
         */
        public String getTax() {
            return this.tax;
        }

        /**
         * @return usageEndTime
         */
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        /**
         * @return usageStartTime
         */
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

        public static final class Builder {
            private String afterTaxAmount; 
            private OrderBillModuleConfig billModuleConfig; 
            private String commodityCode; 
            private String config; 
            private String createTime; 
            private String currency; 
            private java.util.Map<String, String> extendInfos; 
            private String instanceIDs; 
            private String operator; 
            private String orderId; 
            private String orderSubType; 
            private String orderType; 
            private String originalConfig; 
            private OrderOriginalModuleConfig originalModuleConfig; 
            private String paymentCurrency; 
            private String paymentStatus; 
            private String paymentTime; 
            private String pretaxAmount; 
            private String pretaxAmountLocal; 
            private String pretaxGrossAmount; 
            private String productCode; 
            private String productType; 
            private String quantity; 
            private String region; 
            private String relatedOrderId; 
            private String subOrderId; 
            private String subscriptionType; 
            private String tax; 
            private String usageEndTime; 
            private String usageStartTime; 

            /**
             * <p>The aftertaxt amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder afterTaxAmount(String afterTaxAmount) {
                this.afterTaxAmount = afterTaxAmount;
                return this;
            }

            /**
             * <p>The billing information about the configurations.</p>
             */
            public Builder billModuleConfig(OrderBillModuleConfig billModuleConfig) {
                this.billModuleConfig = billModuleConfig;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The configurations of the main service.</p>
             * 
             * <strong>example:</strong>
             * <p>DBInstanceClass:[DBInstanceClass:rds.mysql.s1.small;EngineVersion:8.0;Region:cn-qingdao;]DBFlowType:[Region:cn-qingdao;]</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the order was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-08T09:41:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The currency. Valid values: CNY, USD, and JPY.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The additional information about the order.</p>
             */
            public Builder extendInfos(java.util.Map<String, String> extendInfos) {
                this.extendInfos = extendInfos;
                return this;
            }

            /**
             * <p>The instance IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;rm-bp1a2vsr018313t6o&quot;]</p>
             */
            public Builder instanceIDs(String instanceIDs) {
                this.instanceIDs = instanceIDs;
                return this;
            }

            /**
             * <p>The ID of the Resource Access Management (RAM) user that performs operations on the order. If no RAM user is involved, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>23424243432</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3453425324</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The type of the suborder. A value of productsuborder indicates service suborder. A value of refundsuborder indicates refund suborder.</p>
             * 
             * <strong>example:</strong>
             * <p>ProductSubOrder</p>
             */
            public Builder orderSubType(String orderSubType) {
                this.orderSubType = orderSubType;
                return this;
            }

            /**
             * <p>The type of the order. Valid values: new, renew, upgrade, and refund.</p>
             * 
             * <strong>example:</strong>
             * <p>New</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The configuration information that is not formatted.</p>
             * 
             * <strong>example:</strong>
             * <p>DBInstanceClass:[DBInstanceClass:rds.mysql.s1.small;EngineVersion:8.0;Region:cn-qingdao;]DBFlowType:[Region:cn-qingdao;]</p>
             */
            public Builder originalConfig(String originalConfig) {
                this.originalConfig = originalConfig;
                return this;
            }

            /**
             * <p>The information about the configurations.</p>
             */
            public Builder originalModuleConfig(OrderOriginalModuleConfig originalModuleConfig) {
                this.originalModuleConfig = originalModuleConfig;
                return this;
            }

            /**
             * <p>The currency used for payment. Valid values: CNY, USD, and JPY.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder paymentCurrency(String paymentCurrency) {
                this.paymentCurrency = paymentCurrency;
                return this;
            }

            /**
             * <p>The payment state. Valid values: unpaid, paid, and canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>Paid</p>
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * <p>The time of payment.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-08T09:41:30Z</p>
             */
            public Builder paymentTime(String paymentTime) {
                this.paymentTime = paymentTime;
                return this;
            }

            /**
             * <p>The pretax amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmount(String pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The pretax amount of the order in local currency.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmountLocal(String pretaxAmountLocal) {
                this.pretaxAmountLocal = pretaxAmountLocal;
                return this;
            }

            /**
             * <p>The pretax gross amount of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxGrossAmount(String pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * <p>The code of the main service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The type of the main service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The number of main services.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the associated order.</p>
             * 
             * <strong>example:</strong>
             * <p>4353453534543</p>
             */
            public Builder relatedOrderId(String relatedOrderId) {
                this.relatedOrderId = relatedOrderId;
                return this;
            }

            /**
             * <p>The ID of the suborder.</p>
             * 
             * <strong>example:</strong>
             * <p>234343</p>
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * <p>The billing method. Valid values: Subscription and PayAsYouGo.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * <p>The tax of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tax(String tax) {
                this.tax = tax;
                return this;
            }

            /**
             * <p>The time when the service ends.</p>
             * 
             * <strong>example:</strong>
             * <p>2117-06-08T16:00:00Z</p>
             */
            public Builder usageEndTime(String usageEndTime) {
                this.usageEndTime = usageEndTime;
                return this;
            }

            /**
             * <p>The time when the service starts.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-08T16:00:00Z</p>
             */
            public Builder usageStartTime(String usageStartTime) {
                this.usageStartTime = usageStartTime;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private java.util.List<Order> order;

        private OrderList(Builder builder) {
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public java.util.List<Order> getOrder() {
            return this.order;
        }

        public static final class Builder {
            private java.util.List<Order> order; 

            /**
             * Order.
             */
            public Builder order(java.util.List<Order> order) {
                this.order = order;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("OrderList")
        private OrderList orderList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.hostName = builder.hostName;
            this.orderList = builder.orderList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return orderList
         */
        public OrderList getOrderList() {
            return this.orderList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String hostName; 
            private OrderList orderList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The orders returned.</p>
             */
            public Builder orderList(OrderList orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
