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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>72353765387</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
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

        public DescribeResourcePackageProductResponseBody build() {
            return new DescribeResourcePackageProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
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
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.List<Property> property;

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
        public java.util.List<Property> getProperty() {
            return this.property;
        }

        public static final class Builder {
            private java.util.List<Property> property; 

            /**
             * Property.
             */
            public Builder property(java.util.List<Property> property) {
                this.property = property;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The name of the validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>6 Month</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the validity period for the resource plan. Valid values:</p>
             * <ul>
             * <li>Month</li>
             * <li>Year</li>
             * </ul>
             * <p>Default value: Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
    public static class AvailableDurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDuration")
        private java.util.List<AvailableDuration> availableDuration;

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
        public java.util.List<AvailableDuration> getAvailableDuration() {
            return this.availableDuration;
        }

        public static final class Builder {
            private java.util.List<AvailableDuration> availableDuration; 

            /**
             * AvailableDuration.
             */
            public Builder availableDuration(java.util.List<AvailableDuration> availableDuration) {
                this.availableDuration = availableDuration;
                return this;
            }

            public AvailableDurations build() {
                return new AvailableDurations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The validity periods available for the resource plan.</p>
             */
            public Builder availableDurations(AvailableDurations availableDurations) {
                this.availableDurations = availableDurations;
                return this;
            }

            /**
             * <p>The name of the specification.</p>
             * 
             * <strong>example:</strong>
             * <p>1TB</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the specification.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
    public static class Specifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Specification")
        private java.util.List<Specification> specification;

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
        public java.util.List<Specification> getSpecification() {
            return this.specification;
        }

        public static final class Builder {
            private java.util.List<Specification> specification; 

            /**
             * Specification.
             */
            public Builder specification(java.util.List<Specification> specification) {
                this.specification = specification;
                return this;
            }

            public Specifications build() {
                return new Specifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The code of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_ossbag_deadlineAcc_CdnOut_common_sz</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the resource plan type.</p>
             * 
             * <strong>example:</strong>
             * <p>Back-to-origin traffic plan - China (Shenzhen)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The properties of the resource plan.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The specifications of the resource plan.</p>
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
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
    public static class PackageTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageType")
        private java.util.List<PackageType> packageType;

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
        public java.util.List<PackageType> getPackageType() {
            return this.packageType;
        }

        public static final class Builder {
            private java.util.List<PackageType> packageType; 

            /**
             * PackageType.
             */
            public Builder packageType(java.util.List<PackageType> packageType) {
                this.packageType = packageType;
                return this;
            }

            public PackageTypes build() {
                return new PackageTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The name of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Object Storage Service (OSS) resource plan (monthly)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The types of the resource plans.</p>
             */
            public Builder packageTypes(PackageTypes packageTypes) {
                this.packageTypes = packageTypes;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ossbag</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ossbag</p>
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
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
    public static class ResourcePackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePackage")
        private java.util.List<ResourcePackage> resourcePackage;

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
        public java.util.List<ResourcePackage> getResourcePackage() {
            return this.resourcePackage;
        }

        public static final class Builder {
            private java.util.List<ResourcePackage> resourcePackage; 

            /**
             * ResourcePackage.
             */
            public Builder resourcePackage(java.util.List<ResourcePackage> resourcePackage) {
                this.resourcePackage = resourcePackage;
                return this;
            }

            public ResourcePackages build() {
                return new ResourcePackages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackageProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackageProductResponseBody</p>
     */
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
             * <p>The details about the resource plans.</p>
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
