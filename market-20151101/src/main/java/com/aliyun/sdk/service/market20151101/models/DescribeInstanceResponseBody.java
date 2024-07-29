// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveAddress")
    private String activeAddress;

    @com.aliyun.core.annotation.NameInMap("AppJson")
    private String appJson;

    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private String autoRenewal;

    @com.aliyun.core.annotation.NameInMap("BeganOn")
    private Long beganOn;

    @com.aliyun.core.annotation.NameInMap("ComponentJson")
    private String componentJson;

    @com.aliyun.core.annotation.NameInMap("Constraints")
    private String constraints;

    @com.aliyun.core.annotation.NameInMap("CreatedOn")
    private Long createdOn;

    @com.aliyun.core.annotation.NameInMap("EndOn")
    private Long endOn;

    @com.aliyun.core.annotation.NameInMap("ExtendJson")
    private String extendJson;

    @com.aliyun.core.annotation.NameInMap("HostJson")
    private String hostJson;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.NameInMap("IsTrial")
    private Boolean isTrial;

    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    private String licenseCode;

    @com.aliyun.core.annotation.NameInMap("Modules")
    private Modules modules;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
    private String productSkuCode;

    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("RelationalData")
    private RelationalData relationalData;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    private DescribeInstanceResponseBody(Builder builder) {
        this.activeAddress = builder.activeAddress;
        this.appJson = builder.appJson;
        this.autoRenewal = builder.autoRenewal;
        this.beganOn = builder.beganOn;
        this.componentJson = builder.componentJson;
        this.constraints = builder.constraints;
        this.createdOn = builder.createdOn;
        this.endOn = builder.endOn;
        this.extendJson = builder.extendJson;
        this.hostJson = builder.hostJson;
        this.instanceId = builder.instanceId;
        this.isTrial = builder.isTrial;
        this.licenseCode = builder.licenseCode;
        this.modules = builder.modules;
        this.orderId = builder.orderId;
        this.productCode = builder.productCode;
        this.productName = builder.productName;
        this.productSkuCode = builder.productSkuCode;
        this.productType = builder.productType;
        this.relationalData = builder.relationalData;
        this.status = builder.status;
        this.supplierName = builder.supplierName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeAddress
     */
    public String getActiveAddress() {
        return this.activeAddress;
    }

    /**
     * @return appJson
     */
    public String getAppJson() {
        return this.appJson;
    }

    /**
     * @return autoRenewal
     */
    public String getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return beganOn
     */
    public Long getBeganOn() {
        return this.beganOn;
    }

    /**
     * @return componentJson
     */
    public String getComponentJson() {
        return this.componentJson;
    }

    /**
     * @return constraints
     */
    public String getConstraints() {
        return this.constraints;
    }

    /**
     * @return createdOn
     */
    public Long getCreatedOn() {
        return this.createdOn;
    }

    /**
     * @return endOn
     */
    public Long getEndOn() {
        return this.endOn;
    }

    /**
     * @return extendJson
     */
    public String getExtendJson() {
        return this.extendJson;
    }

    /**
     * @return hostJson
     */
    public String getHostJson() {
        return this.hostJson;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    /**
     * @return modules
     */
    public Modules getModules() {
        return this.modules;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productSkuCode
     */
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return relationalData
     */
    public RelationalData getRelationalData() {
        return this.relationalData;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    public static final class Builder {
        private String activeAddress; 
        private String appJson; 
        private String autoRenewal; 
        private Long beganOn; 
        private String componentJson; 
        private String constraints; 
        private Long createdOn; 
        private Long endOn; 
        private String extendJson; 
        private String hostJson; 
        private Long instanceId; 
        private Boolean isTrial; 
        private String licenseCode; 
        private Modules modules; 
        private Long orderId; 
        private String productCode; 
        private String productName; 
        private String productSkuCode; 
        private String productType; 
        private RelationalData relationalData; 
        private String status; 
        private String supplierName; 

        /**
         * ActiveAddress.
         */
        public Builder activeAddress(String activeAddress) {
            this.activeAddress = activeAddress;
            return this;
        }

        /**
         * AppJson.
         */
        public Builder appJson(String appJson) {
            this.appJson = appJson;
            return this;
        }

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(String autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * BeganOn.
         */
        public Builder beganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }

        /**
         * ComponentJson.
         */
        public Builder componentJson(String componentJson) {
            this.componentJson = componentJson;
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
         * CreatedOn.
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * EndOn.
         */
        public Builder endOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }

        /**
         * ExtendJson.
         */
        public Builder extendJson(String extendJson) {
            this.extendJson = extendJson;
            return this;
        }

        /**
         * HostJson.
         */
        public Builder hostJson(String hostJson) {
            this.hostJson = hostJson;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        /**
         * LicenseCode.
         */
        public Builder licenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * Modules.
         */
        public Builder modules(Modules modules) {
            this.modules = modules;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * ProductSkuCode.
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * RelationalData.
         */
        public Builder relationalData(RelationalData relationalData) {
            this.relationalData = relationalData;
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
         * SupplierName.
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class PropertyValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Max")
        private String max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private String min;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyValue(Builder builder) {
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

        public static PropertyValue create() {
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

            public PropertyValue build() {
                return new PropertyValue(this);
            } 

        } 

    }
    public static class PropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private java.util.List < PropertyValue> propertyValue;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public java.util.List < PropertyValue> getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private java.util.List < PropertyValue> propertyValue; 

            /**
             * PropertyValue.
             */
            public Builder propertyValue(java.util.List < PropertyValue> propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    public static class Property extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayUnit")
        private String displayUnit;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
        private PropertyValues propertyValues;

        @com.aliyun.core.annotation.NameInMap("ShowType")
        private String showType;

        private Property(Builder builder) {
            this.displayUnit = builder.displayUnit;
            this.key = builder.key;
            this.name = builder.name;
            this.propertyValues = builder.propertyValues;
            this.showType = builder.showType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
        }

        /**
         * @return displayUnit
         */
        public String getDisplayUnit() {
            return this.displayUnit;
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
         * @return propertyValues
         */
        public PropertyValues getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        public static final class Builder {
            private String displayUnit; 
            private String key; 
            private String name; 
            private PropertyValues propertyValues; 
            private String showType; 

            /**
             * DisplayUnit.
             */
            public Builder displayUnit(String displayUnit) {
                this.displayUnit = displayUnit;
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
             * PropertyValues.
             */
            public Builder propertyValues(PropertyValues propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * ShowType.
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            public Property build() {
                return new Property(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.List < Property> property;

        private Properties(Builder builder) {
            this.property = builder.property;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return property
         */
        public java.util.List < Property> getProperty() {
            return this.property;
        }

        public static final class Builder {
            private java.util.List < Property> property; 

            /**
             * Property.
             */
            public Builder property(java.util.List < Property> property) {
                this.property = property;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        private Module(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
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
        public Properties getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String code; 
            private String id; 
            private String name; 
            private Properties properties; 

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
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private java.util.List < Module> module;

        private Modules(Builder builder) {
            this.module = builder.module;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
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

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    public static class RelationalData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        private RelationalData(Builder builder) {
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationalData create() {
            return builder().build();
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private String serviceStatus; 

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public RelationalData build() {
                return new RelationalData(this);
            } 

        } 

    }
}
