// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackageProductResponseBody</p>
 */
public class DescribeResourcePackageProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeResourcePackageProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackageProductResponseBody create() {
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
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
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
        private Long orderId; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
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
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourcePackageProductResponseBody build() {
            return new DescribeResourcePackageProductResponseBody(this);
        } 

    } 

    public static class Property extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Property(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
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
            private String name; 
            private String value; 

            /**
             * The name of the property.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the property.
             */
            public Builder value(String value) {
                this.value = value;
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
    public static class AvailableDuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AvailableDuration(Builder builder) {
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDuration create() {
            return builder().build();
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
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String unit; 
            private Integer value; 

            /**
             * The name of the validity period.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the validity period for the resource plan. Valid values:
             * <p>
             * 
             * *   Month
             * *   Year
             * 
             * Default value: Month.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the validity period.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AvailableDuration build() {
                return new AvailableDuration(this);
            } 

        } 

    }
    public static class AvailableDurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDuration")
        private java.util.List < AvailableDuration> availableDuration;

        private AvailableDurations(Builder builder) {
            this.availableDuration = builder.availableDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDurations create() {
            return builder().build();
        }

        /**
         * @return availableDuration
         */
        public java.util.List < AvailableDuration> getAvailableDuration() {
            return this.availableDuration;
        }

        public static final class Builder {
            private java.util.List < AvailableDuration> availableDuration; 

            /**
             * AvailableDuration.
             */
            public Builder availableDuration(java.util.List < AvailableDuration> availableDuration) {
                this.availableDuration = availableDuration;
                return this;
            }

            public AvailableDurations build() {
                return new AvailableDurations(this);
            } 

        } 

    }
    public static class Specification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDurations")
        private AvailableDurations availableDurations;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Specification(Builder builder) {
            this.availableDurations = builder.availableDurations;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specification create() {
            return builder().build();
        }

        /**
         * @return availableDurations
         */
        public AvailableDurations getAvailableDurations() {
            return this.availableDurations;
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
            private AvailableDurations availableDurations; 
            private String name; 
            private String value; 

            /**
             * The validity periods available for the resource plan.
             */
            public Builder availableDurations(AvailableDurations availableDurations) {
                this.availableDurations = availableDurations;
                return this;
            }

            /**
             * The name of the specification.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the specification.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Specification build() {
                return new Specification(this);
            } 

        } 

    }
    public static class Specifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Specification")
        private java.util.List < Specification> specification;

        private Specifications(Builder builder) {
            this.specification = builder.specification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specifications create() {
            return builder().build();
        }

        /**
         * @return specification
         */
        public java.util.List < Specification> getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private java.util.List < Specification> specification; 

            /**
             * Specification.
             */
            public Builder specification(java.util.List < Specification> specification) {
                this.specification = specification;
                return this;
            }

            public Specifications build() {
                return new Specifications(this);
            } 

        } 

    }
    public static class PackageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("Specifications")
        private Specifications specifications;

        private PackageType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.properties = builder.properties;
            this.specifications = builder.specifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageType create() {
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
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return specifications
         */
        public Specifications getSpecifications() {
            return this.specifications;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Properties properties; 
            private Specifications specifications; 

            /**
             * The code of the resource plan.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the resource plan type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The properties of the resource plan.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The specifications of the resource plan.
             */
            public Builder specifications(Specifications specifications) {
                this.specifications = specifications;
                return this;
            }

            public PackageType build() {
                return new PackageType(this);
            } 

        } 

    }
    public static class PackageTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageType")
        private java.util.List < PackageType> packageType;

        private PackageTypes(Builder builder) {
            this.packageType = builder.packageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageTypes create() {
            return builder().build();
        }

        /**
         * @return packageType
         */
        public java.util.List < PackageType> getPackageType() {
            return this.packageType;
        }

        public static final class Builder {
            private java.util.List < PackageType> packageType; 

            /**
             * PackageType.
             */
            public Builder packageType(java.util.List < PackageType> packageType) {
                this.packageType = packageType;
                return this;
            }

            public PackageTypes build() {
                return new PackageTypes(this);
            } 

        } 

    }
    public static class ResourcePackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageTypes")
        private PackageTypes packageTypes;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        private ResourcePackage(Builder builder) {
            this.name = builder.name;
            this.packageTypes = builder.packageTypes;
            this.productCode = builder.productCode;
            this.productType = builder.productType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackage create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageTypes
         */
        public PackageTypes getPackageTypes() {
            return this.packageTypes;
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

        public static final class Builder {
            private String name; 
            private PackageTypes packageTypes; 
            private String productCode; 
            private String productType; 

            /**
             * The name of the resource plan.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The types of the resource plans.
             */
            public Builder packageTypes(PackageTypes packageTypes) {
                this.packageTypes = packageTypes;
                return this;
            }

            /**
             * The code of the service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The type of the service.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            public ResourcePackage build() {
                return new ResourcePackage(this);
            } 

        } 

    }
    public static class ResourcePackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePackage")
        private java.util.List < ResourcePackage> resourcePackage;

        private ResourcePackages(Builder builder) {
            this.resourcePackage = builder.resourcePackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackages create() {
            return builder().build();
        }

        /**
         * @return resourcePackage
         */
        public java.util.List < ResourcePackage> getResourcePackage() {
            return this.resourcePackage;
        }

        public static final class Builder {
            private java.util.List < ResourcePackage> resourcePackage; 

            /**
             * ResourcePackage.
             */
            public Builder resourcePackage(java.util.List < ResourcePackage> resourcePackage) {
                this.resourcePackage = resourcePackage;
                return this;
            }

            public ResourcePackages build() {
                return new ResourcePackages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePackages")
        private ResourcePackages resourcePackages;

        private Data(Builder builder) {
            this.resourcePackages = builder.resourcePackages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resourcePackages
         */
        public ResourcePackages getResourcePackages() {
            return this.resourcePackages;
        }

        public static final class Builder {
            private ResourcePackages resourcePackages; 

            /**
             * The details about the resource plans.
             */
            public Builder resourcePackages(ResourcePackages resourcePackages) {
                this.resourcePackages = resourcePackages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
