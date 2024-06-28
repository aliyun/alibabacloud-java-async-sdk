// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePricingModuleResponseBody</p>
 */
public class DescribePricingModuleResponseBody extends TeaModel {
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

    private DescribePricingModuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePricingModuleResponseBody create() {
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
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePricingModuleResponseBody build() {
            return new DescribePricingModuleResponseBody(this);
        } 

    } 

    public static class AttributeValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AttributeValue(Builder builder) {
            this.name = builder.name;
            this.remark = builder.remark;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeValue create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
            private String name; 
            private String remark; 
            private String type; 
            private String value; 

            /**
             * The attribute value that corresponds to the module code.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the module values.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The type of the attribute value that corresponds to the module code. Valid values:
             * <p>
             * 
             * *   single_float: single value
             * *   range_float: range value
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The attribute value that corresponds to the module code.
             * <p>
             * 
             * >  If the Type parameter is set to range_float, the valid values of this parameter range from 1024 to 1024000. A value of 1024 indicates that the step size is 1024.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttributeValue build() {
                return new AttributeValue(this);
            } 

        } 

    }
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private java.util.List < AttributeValue> attributeValue;

        private Values(Builder builder) {
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return attributeValue
         */
        public java.util.List < AttributeValue> getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private java.util.List < AttributeValue> attributeValue; 

            /**
             * AttributeValue.
             */
            public Builder attributeValue(java.util.List < AttributeValue> attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Attribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Values")
        private Values values;

        private Attribute(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.unit = builder.unit;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return values
         */
        public Values getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String unit; 
            private Values values; 

            /**
             * The code of the attribute.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the attribute.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the attribute.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The attribute values.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    public static class AttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private java.util.List < Attribute> attribute;

        private AttributeList(Builder builder) {
            this.attribute = builder.attribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeList create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public java.util.List < Attribute> getAttribute() {
            return this.attribute;
        }

        public static final class Builder {
            private java.util.List < Attribute> attribute; 

            /**
             * Attribute.
             */
            public Builder attribute(java.util.List < Attribute> attribute) {
                this.attribute = attribute;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private java.util.List < String > configList;

        private ConfigList(Builder builder) {
            this.configList = builder.configList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return configList
         */
        public java.util.List < String > getConfigList() {
            return this.configList;
        }

        public static final class Builder {
            private java.util.List < String > configList; 

            /**
             * ConfigList.
             */
            public Builder configList(java.util.List < String > configList) {
                this.configList = configList;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private ConfigList configList;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("PriceType")
        private String priceType;

        private Module(Builder builder) {
            this.configList = builder.configList;
            this.currency = builder.currency;
            this.moduleCode = builder.moduleCode;
            this.moduleName = builder.moduleName;
            this.priceType = builder.priceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return configList
         */
        public ConfigList getConfigList() {
            return this.configList;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return priceType
         */
        public String getPriceType() {
            return this.priceType;
        }

        public static final class Builder {
            private ConfigList configList; 
            private String currency; 
            private String moduleCode; 
            private String moduleName; 
            private String priceType; 

            /**
             * ConfigList.
             */
            public Builder configList(ConfigList configList) {
                this.configList = configList;
                return this;
            }

            /**
             * The currency. Default value: CNY.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The code of the pricing module.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * The name of the pricing module.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * The price type. Valid values:
             * <p>
             * 
             * *   Usage: usage price
             * *   Hour: hourly price
             * *   Day: daily price
             * *   Week: weekly price
             * *   Month: monthly price
             * *   Year: annual price
             */
            public Builder priceType(String priceType) {
                this.priceType = priceType;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class ModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private java.util.List < Module> module;

        private ModuleList(Builder builder) {
            this.module = builder.module;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleList create() {
            return builder().build();
        }

        /**
         * @return module
         */
        public java.util.List < Module> getModule() {
            return this.module;
        }

        public static final class Builder {
            private java.util.List < Module> module; 

            /**
             * Module.
             */
            public Builder module(java.util.List < Module> module) {
                this.module = module;
                return this;
            }

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeList")
        private AttributeList attributeList;

        @com.aliyun.core.annotation.NameInMap("ModuleList")
        private ModuleList moduleList;

        private Data(Builder builder) {
            this.attributeList = builder.attributeList;
            this.moduleList = builder.moduleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attributeList
         */
        public AttributeList getAttributeList() {
            return this.attributeList;
        }

        /**
         * @return moduleList
         */
        public ModuleList getModuleList() {
            return this.moduleList;
        }

        public static final class Builder {
            private AttributeList attributeList; 
            private ModuleList moduleList; 

            /**
             * The module attributes.
             */
            public Builder attributeList(AttributeList attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            /**
             * The pricing information of modules.
             */
            public Builder moduleList(ModuleList moduleList) {
                this.moduleList = moduleList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
