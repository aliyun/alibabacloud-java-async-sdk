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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePricingModuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
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
         * <p>This API is not applicable for caller.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C40A8EE0-8084-49FE-B66E-5E1C3B6AE025</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePricingModuleResponseBody build() {
            return new DescribePricingModuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AttributeValue model) {
                this.name = model.name;
                this.remark = model.remark;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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

            public AttributeValue build() {
                return new AttributeValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private java.util.List<AttributeValue> attributeValue;

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
        public java.util.List<AttributeValue> getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private java.util.List<AttributeValue> attributeValue; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.attributeValue = model.attributeValue;
            } 

            /**
             * AttributeValue.
             */
            public Builder attributeValue(java.util.List<AttributeValue> attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Attribute model) {
                this.code = model.code;
                this.name = model.name;
                this.unit = model.unit;
                this.values = model.values;
            } 

            /**
             * <p>The status code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder code(String code) {
                this.code = code;
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
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Values.
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
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
    public static class AttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private java.util.List<Attribute> attribute;

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
        public java.util.List<Attribute> getAttribute() {
            return this.attribute;
        }

        public static final class Builder {
            private java.util.List<Attribute> attribute; 

            private Builder() {
            } 

            private Builder(AttributeList model) {
                this.attribute = model.attribute;
            } 

            /**
             * Attribute.
             */
            public Builder attribute(java.util.List<Attribute> attribute) {
                this.attribute = attribute;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private java.util.List<String> configList;

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
        public java.util.List<String> getConfigList() {
            return this.configList;
        }

        public static final class Builder {
            private java.util.List<String> configList; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.configList = model.configList;
            } 

            /**
             * ConfigList.
             */
            public Builder configList(java.util.List<String> configList) {
                this.configList = configList;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Module model) {
                this.configList = model.configList;
                this.currency = model.currency;
                this.moduleCode = model.moduleCode;
                this.moduleName = model.moduleName;
                this.priceType = model.priceType;
            } 

            /**
             * ConfigList.
             */
            public Builder configList(ConfigList configList) {
                this.configList = configList;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
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
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * PriceType.
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
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
    public static class ModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private java.util.List<Module> module;

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
        public java.util.List<Module> getModule() {
            return this.module;
        }

        public static final class Builder {
            private java.util.List<Module> module; 

            private Builder() {
            } 

            private Builder(ModuleList model) {
                this.module = model.module;
            } 

            /**
             * Module.
             */
            public Builder module(java.util.List<Module> module) {
                this.module = module;
                return this;
            }

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePricingModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePricingModuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.attributeList = model.attributeList;
                this.moduleList = model.moduleList;
            } 

            /**
             * AttributeList.
             */
            public Builder attributeList(AttributeList attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            /**
             * ModuleList.
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
